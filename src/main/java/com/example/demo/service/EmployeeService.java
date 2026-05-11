package com.example.demo.service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee create(Employee employee) {
        return repo.save(employee);
    }

    public Employee update(Long id, Employee employee) {

        employee.setId(id);

        return repo.save(employee);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}