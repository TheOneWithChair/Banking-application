package com.example.banking_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BankController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to Your Banking App!";
    }
}