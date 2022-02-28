package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.function.Function;

@SpringBootApplication
public class HelloworldApplication {

	/*@RequestMapping("/")
	public String hello()
	{
		return "Hello World";
	}*/
	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	/*
	@Bean
	public Function<String, Boolean> containsCloud() {
		return value -> value.contains("cloud");
	}
	@Bean
	public Function<String, String> reverse() {
		return (input) -> new StringBuilder(input).reverse().toString();

	}*/


}
