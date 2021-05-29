package com.example.webservicespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class WebServiceSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebServiceSpringApplication.class, args);
    }

    @GetMapping
    public List<String> saludos() {
        return List.of("hola", "chau", "buenos dias");
    }

    @GetMapping(path = "prueba")
    public List<ClienteEntity> clientes() {
        return List.of(
                new ClienteEntity(1, "Jazmin", "Globant", "CTO", "5555555", "jaz@globant.com"),
                new ClienteEntity(2, "Rocio", "Globant", "CISO", "555095", "rocio@globant.com"));
    }

    @GetMapping (path = "ver-cliente")
    public ClienteEntity prueba(){
        return new ClienteEntity(1, "Jazmin", "Globant", "CTO", "5555555", "jaz@globant.com");

    }

    public String pruebaRepositorio(){

        return "";
    }



}
