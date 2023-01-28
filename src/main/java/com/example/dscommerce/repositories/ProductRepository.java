package com.example.dscommerce.repositories;

import com.example.dscommerce.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
