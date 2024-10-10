package com.csci318.ecommerce.customer.repository;

import com.csci318.ecommerce.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}