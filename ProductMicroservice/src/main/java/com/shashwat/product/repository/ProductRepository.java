package com.shashwat.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shashwat.product.model.Product;


public interface ProductRepository extends JpaRepository<Product, String>{

}
