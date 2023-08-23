package com.example.CacheUsingRedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
    @Autowired
    private SumService service;

    @GetMapping("/add")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }
}

