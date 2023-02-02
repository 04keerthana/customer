package com.cg.onlineplantnursery.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.onlineplantnursery.customer.entity.Customer;
import com.cg.onlineplantnursery.exception.InvalidCustomerException;

@Service
public interface ICustomerService {

	public Customer registerUser(Customer customer)throws Exception;

	public List<Customer> getAllCustomers();
	
	public Customer getCustomerById(int customerd);
	
	public Customer updateCustomer(int customerId);
	
	public List<Customer> getCustomerByState(String state);
	
	public List<Customer> getCustomerByCity (String city);

	

}
