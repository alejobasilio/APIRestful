package com.alejobasilio.spring_boot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

    @GetMapping()
    public String saludar(){
        return "Hola mundo desde Spring Boot";
    }
}
