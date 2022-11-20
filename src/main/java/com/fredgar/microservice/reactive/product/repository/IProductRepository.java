package com.fredgar.microservice.reactive.product.repository;

import com.fredgar.microservice.reactive.product.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IProductRepository extends ReactiveMongoRepository<Product, String> {
}
