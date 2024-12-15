package brahim.enset.inventoryservice.repositories;

import brahim.enset.inventoryservice.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, String> {


}
