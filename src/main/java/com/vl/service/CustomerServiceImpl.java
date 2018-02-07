package com.vl.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vl.Dao.CustomerDao;
import com.vl.model.Customer;

public class CustomerServiceImpl implements CustomerService {
private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
	this.customerDao = customerDao;
}

	@Transactional(propagation=Propagation.REQUIRED)
	public void manageCustomer(Customer cust) {
		// TODO Auto-generated method stub
     customerDao.createCustomer(cust);
		
	}

}
