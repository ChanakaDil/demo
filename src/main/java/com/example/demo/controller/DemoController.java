package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping
    public String home() {
        return "<h1>Spring Boot Hello World!</h1>";
    }

    @GetMapping(value = "/counter")
    public Boolean testCounter(@RequestParam(value ="id") int id) {
        return id == 10 ? true : false;
    }

}
