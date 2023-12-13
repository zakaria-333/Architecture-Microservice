package Client.microservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import Client.microservice.entity.Client;
import Client.microservice.repository.ClientRepository;



@EnableDiscoveryClient
@SpringBootApplication
public class ClientMicroserviceApplication {

	public static void main(String[] args) {
        SpringApplication.run(ClientMicroserviceApplication.class, args);
    }
	@Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
        	clientRepository.save(new Client(Long.parseLong("2"), "Amal RAMI", Float.parseFloat("22")));
        	clientRepository.save(new Client(Long.parseLong("3"), "Samir SAFI", Float.parseFloat("22")));
           
        };
    }
}
