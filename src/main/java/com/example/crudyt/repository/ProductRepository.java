package com.example.crudyt.repository;

import com.example.crudyt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


//adding the product class and ID type from class
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
