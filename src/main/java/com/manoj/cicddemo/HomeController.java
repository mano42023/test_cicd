package com.manoj.cicddemo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String index(){
        return "Hello from spring boot app";
    }
}

