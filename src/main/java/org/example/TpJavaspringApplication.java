package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TpJavaspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpJavaspringApplication.class, args);
    }

    @GetMapping("/bonjour")
    public String hello() {
        return "Bonjour le monde !";
    }
}