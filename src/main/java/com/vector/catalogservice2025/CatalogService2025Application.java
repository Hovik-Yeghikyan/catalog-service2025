package com.vector.catalogservice2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogService2025Application {

    public static void main(String[] args) {
        SpringApplication.run(CatalogService2025Application.class, args);
    }

}
