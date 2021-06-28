package com.chandan.springboot;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {
	static Logger logger = LoggerFactory.getLogger(SpringbootBackendApplication.class);
	@PostConstruct
	public void init() {
		logger.info("my first statement");
	}
	public static void main(String[] args) {
		logger.info("application started");
		System.out.println("hello logger!!");
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

}
