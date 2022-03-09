package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo.controllers")
public class FilehandleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilehandleApplication.class, args);
	}

}
