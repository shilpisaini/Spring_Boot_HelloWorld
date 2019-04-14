package com.shilpi.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shilpi.helloworld.repo.HelloWorldRepository;

@Service
public class HelloWorldService implements IHelloWorldService{

	@Autowired
	HelloWorldRepository helloWorldRepo;
	
	@Override
	public String sayHello() {
		return helloWorldRepo.sayHello();
	}

}
