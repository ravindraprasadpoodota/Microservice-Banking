package com.knights.auth.service;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestAPI {

	
	@GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
