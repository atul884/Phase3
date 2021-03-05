package com.simplilearnphase3.Sportyshoes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearnphase3.Sportyshoes.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
