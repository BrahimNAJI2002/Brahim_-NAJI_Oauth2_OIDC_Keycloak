package brahim.enset.inventoryservice;

import brahim.enset.inventoryservice.entites.Product;
import brahim.enset.inventoryservice.repositories.ProductRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(ProductRespository productRepository){
		return args -> {
			productRepository.save(Product.builder().id("P01").name("Computer").price(4000).quantity(15).build());
			productRepository.save(Product.builder().id("P02").name("Printer").price(3500).quantity(35).build());
			productRepository.save(Product.builder().id("P03").name("Smart Phone").price(5000).quantity(80).build());
		};
	}
}
