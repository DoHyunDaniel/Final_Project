package com.example.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "community")
public class KdtFinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KdtFinalProjectApplication.class, args);
	}

}
