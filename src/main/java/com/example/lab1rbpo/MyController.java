package com.example.lab1rbpo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/text")
    public String text() {
        return "Hello, World!";
    }

    @GetMapping("/number")
    public int number() {
        return 24059;
    }
}