package com.project.service;

import com.project.model.Customer;
import com.project.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        log.info("In customerServiceImpl getById {}", id);
        return customerRepository.getById(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("In customerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("In customerServiceImpl delete {}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("In customerServiceImpl getAll ");
        return (List<Customer>) customerRepository.findAll();
    }
}
