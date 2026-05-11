//package com.example.demo.controller;
//
//import com.example.demo.entity.Employee;
//import com.example.demo.service.EmployeeService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "http://localhost:5173")
//@RequestMapping("/employees")
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeService service;
//
//    @GetMapping
//    public List<Employee> getAll() {
//        return service.getAll();
//    }
//
//    @PostMapping
//    public Employee create(
//            @RequestBody Employee employee) {
//
//        return service.create(employee);
//    }
//
//    @PutMapping("/{id}")
//    public Employee update(
//            @PathVariable Long id,
//            @RequestBody Employee employee) {
//
//        return service.update(id, employee);
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable Long id) {
//
//        service.delete(id);
//
//        return "Deleted";
//    }
//}