package com.verydapeng;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
public class SimplePropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplePropertiesApplication.class, args);
	}

    @Bean
    ApplicationRunner init(@Value("${app.url1}") String url1, @Value("${app.url2}") String url2) {
        return args -> {
            System.out.println("url1: " + url1);
            System.out.println("url2: " + url2);
        };
    }
}
