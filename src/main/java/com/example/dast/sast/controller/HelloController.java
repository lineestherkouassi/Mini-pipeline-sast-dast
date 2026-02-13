package com.example.dast.sast.controller;  // ← Vérifiez que c'est ce package

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello DevSecOps";
    }
    
    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint";
    }
}