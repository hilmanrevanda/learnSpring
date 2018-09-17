package com.aplvipln.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aplvipln.entity.Customer;
import com.aplvipln.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll()
				.forEach(customers::add);
		return customers;
	}
	
	public Customer getCustomer(String id) {
		return customerRepository.findOne(id);
	}
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(String id) {
		customerRepository.delete(id);
	}
}
