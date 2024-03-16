package com.example.clima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class ClimaTempoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaTempoApplication.class, args);
	}
}
