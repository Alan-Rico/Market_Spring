package com.platzi.demo_market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoControlador {
    @GetMapping("/hola")
    public String saludar(){
        return "NUNCA PARES DE APRENDER";
    }
}
