package com.brian.springdata.componentmapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.brian.springdata.componentmapping.entities.Address;
import com.brian.springdata.componentmapping.entities.Employee;
import com.brian.springdata.componentmapping.repos.EmployeeRepository;

@SpringBootTest
class ComponentmappingApplicationTests {
	
	@Autowired
	EmployeeRepository repository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Brian");
		Address address = new Address();
		address.setStreetaddress("18th St.");
		address.setCity("Tucson");
		address.setState("AZ");
		address.setZipcode("85701");
		address.setCountry("U.S.");
		employee.setAddress(address);
		
		repository.save(employee);
	}
}
