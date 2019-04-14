package com.shilpi.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shilpi.helloworld.service.HelloWorldService;

@RestController
public class HelloWorldController {

	@Autowired
	HelloWorldService helloWorldService;
	
	@GetMapping("/hello")
    public String sayHello() {
        return helloWorldService.sayHello();
    }

}
