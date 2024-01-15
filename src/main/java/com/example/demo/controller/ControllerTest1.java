package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ControllerTest1 {
    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/name")
    public String name() {
        return name;
    }
}
