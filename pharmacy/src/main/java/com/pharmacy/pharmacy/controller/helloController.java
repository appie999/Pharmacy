package com.pharmacy.pharmacy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello ")
    public String hello(){
        return "hello me how are you !!!";
    }
}
