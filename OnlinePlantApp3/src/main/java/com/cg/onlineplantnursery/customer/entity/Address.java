package com.cg.onlineplantnursery.customer.entity;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Address {
	private String address;
	private String state;
	private String city;
	private int pincode;

}
