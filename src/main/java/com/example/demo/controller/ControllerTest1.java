package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    private final RefreshScope refreshScope;

    public ControllerTest1(RefreshScope refreshScope) {
        this.refreshScope = refreshScope;
    }
    @PostMapping("/refresh")
    public void refreshConfig() {
        refreshScope.refreshAll();
    }
}
