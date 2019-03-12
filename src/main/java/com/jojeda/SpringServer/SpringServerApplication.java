package com.jojeda.SpringServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringServerApplication extends SpringBootServletInitializer {

    private static Class<SpringServerApplication> applicationClass = SpringServerApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(SpringServerApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(applicationClass);
    }
}
