package com.example.swaggerwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class SwaggerWebfluxApplication {

	public static void main(String[] args) {
		BlockHound.install();
		SpringApplication.run(SwaggerWebfluxApplication.class, args);
	}

}
