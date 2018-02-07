package com.vl.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vl.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public JdbcTemplate jdbcTemplate;

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String query1 = "insert into customer(id,name) values(?,?)";
		String query2 = "insert into address(id,name,country) values(?,?,?)";
		jdbcTemplate.update(query1, new Object[] { customer.getId(), customer.getName() });
		System.out.println("inserted into Customer table successfully");
		jdbcTemplate.update(query2, new Object[] { customer.getId(), customer.getAddress().getAddress(),
				customer.getAddress().getCountry() });
		System.out.println("inserted into Address table successfully");

	}

}
