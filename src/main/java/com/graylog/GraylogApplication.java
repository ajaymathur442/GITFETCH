package com.graylog;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(exclude = {ABC.class})
public class GraylogApplication {
	private static final Logger log = LoggerFactory.getLogger(GraylogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(GraylogApplication.class, args);
	}
	@PostConstruct
	public void init() {
		
		log.info("Graylog started");
		log.info("Hi there");

	}
	
	
}
