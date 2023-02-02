package com.cg.onlineplantnursery.customer.repository;

import java.util.List;


import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursery.customer.entity.Customer;



@Repository


public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

}
