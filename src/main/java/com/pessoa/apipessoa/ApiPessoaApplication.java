package com.pessoa.apipessoa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pessoa.apipessoa.resources")
public class ApiPessoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPessoaApplication.class, args);
	}

	@Bean
	public CommandLineRunner comandLineRunner(){
		return args -> {
			System.out.println("## Hello World ##");
		};
	}

}
