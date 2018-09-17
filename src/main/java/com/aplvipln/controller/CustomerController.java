package com.aplvipln.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aplvipln.entity.Customer;
import com.aplvipln.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers/add")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping("/customers/delete/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers/update")
	public void updateCustomer(@RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}
	
}
