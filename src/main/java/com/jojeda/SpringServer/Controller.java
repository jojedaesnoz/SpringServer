package com.jojeda.SpringServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EventoRepository repository;

    @RequestMapping("/eventos")
    public List<Evento> getEventos() {
        return repository.findAll();
    }

    @RequestMapping("/eventos_nombre")
    public List<Evento> getEventos(String nombre) {
        return repository.findByNombre(nombre);
    }

    @RequestMapping("/add_evento")
    public void addEvento(
            @RequestParam(value = "nombre", defaultValue = "nada") String nombre,
            @RequestParam(value = "descripcion", defaultValue = "nada") String descripcion,
            @RequestParam(value = "precio", defaultValue = "0") float precio,
            @RequestParam(value = "x", defaultValue = "0") float x,
            @RequestParam(value = "y", defaultValue = "0") float y) {

        Evento evento = new Evento();
        evento.setNombre(nombre);
        evento.setDescripcion(descripcion);
        evento.setPrecio(precio);
        evento.setX(x);
        evento.setY(y);
        repository.save(evento);
    }

}
