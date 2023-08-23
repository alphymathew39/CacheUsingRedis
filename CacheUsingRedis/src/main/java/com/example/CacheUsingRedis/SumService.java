package com.example.CacheUsingRedis;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SumService {
    @Cacheable("sumCache") // Cache result using "sumCache" cache
    public int add(int a, int b) {
        System.out.println("sum is");
        return a + b;
    }
}