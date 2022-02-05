package com.javabasics.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Simplecontroller {
    @RequestMapping("/")
    public String index(){
        return "Hello world";
    }
}
