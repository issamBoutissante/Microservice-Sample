package com.example.Client;

import com.example.Client.entities.Client;
import com.example.Client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	@Bean
	CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
		 return args -> {
			 clientRepository.save(new Client(Long.parseLong("1"), "Rabab SELIMANI", Float.parseFloat("23")));
					 clientRepository.save(new Client(Long.parseLong("2"), "Amal RAMI",
					Float.parseFloat("22")));
			 clientRepository.save(new Client(Long.parseLong("3"), "Samir SAFI",
					Float.parseFloat("22")));

			 };
		}
}
