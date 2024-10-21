package br.com.example.atm_cybersecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";  // Retorna a página home.html localizada na pasta resources/static
    }
}