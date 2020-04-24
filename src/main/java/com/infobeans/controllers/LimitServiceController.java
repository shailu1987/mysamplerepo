package com.infobeans.controllers;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infobeans.data.Configuration;
import com.infobeans.data.Greeting;
import com.infobeans.data.LimitConfiguration;

@RestController
public class LimitServiceController {
	
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hello, %s!";
	
	@Autowired
	Configuration config;
	
	@GetMapping("/greetings")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@GetMapping("/limit")
	public LimitConfiguration limit() {
		return new LimitConfiguration(config.getMinimum(),config.getMaximum());
	}
}
