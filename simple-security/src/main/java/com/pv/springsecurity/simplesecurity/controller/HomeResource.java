package com.pv.springsecurity.simplesecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String hello() {
        return "hello spring security";
    }


    @GetMapping("/user")
    public String user() {
        return "hello user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "hello admin";
    }
}
