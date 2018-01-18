package com.hnayyc.cofframe.deskapp.service;

import com.hnayyc.cofframe.deskapp.model.Employee;

import java.util.List;

public interface  EmployeeService {
    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Employee findBySsn(String ssn);

    void updateEmployee(Employee employee);
}
