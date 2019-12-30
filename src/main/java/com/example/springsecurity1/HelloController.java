package com.example.springsecurity1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @GetMapping("/user")
    public String sayHelloUser(){
        return "Hello User!!";
    }

    @GetMapping("/admin")
    public String sayHelloAdmin(){
        return "Hello Admin!!!";
    }
}
