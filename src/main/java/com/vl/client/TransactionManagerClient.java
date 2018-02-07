package com.vl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vl.model.Address;
import com.vl.model.Customer;
import com.vl.service.CustomerService;
import com.vl.service.CustomerServiceImpl;

public class TransactionManagerClient {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		CustomerService customerService=ctx.getBean("customerService",CustomerServiceImpl.class );
		Customer customer=createDummyCustomer();
		customerService.manageCustomer(customer);
	}
	private static Customer createDummyCustomer(){
		Customer customer= new Customer();
		customer.setId(6);
		customer.setName("keerthi");
		Address address=new Address();
		address.setId(6);
		address.setCountry("India");
		address.setAddress("sarojini");
		customer.setAddress(address);
		return customer;
	}
}
