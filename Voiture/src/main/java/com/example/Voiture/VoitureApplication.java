package com.example.Voiture;

import com.example.Voiture.entities.Client;
import com.example.Voiture.entities.Voiture;
import com.example.Voiture.repositories.VoitureRepository;
import com.example.Voiture.services.ClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients(basePackages = "package com.example.Voiture.services")
@SpringBootApplication
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}

}
