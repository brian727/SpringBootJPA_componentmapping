package com.brian.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.brian.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
