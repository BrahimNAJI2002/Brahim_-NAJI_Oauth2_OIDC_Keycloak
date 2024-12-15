package brahim.enset.inventoryservice.web;


import brahim.enset.inventoryservice.entites.Product;
import brahim.enset.inventoryservice.repositories.ProductRespository;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductRespository productRepository;

    public ProductRestController(ProductRespository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<Product> productList(){
        return productRepository.findAll();
    }
    @GetMapping("/products/{id}")
    //@PreAuthorize("hasAuthority('USER')")
    public Product productById(@PathVariable String id){
        return productRepository.findById(id).get();
    }
    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
}