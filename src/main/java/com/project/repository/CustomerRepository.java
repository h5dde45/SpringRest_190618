package com.project.repository;

import com.project.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository
        extends CrudRepository<Customer, Long> {
    Customer getById(Long id);

}
