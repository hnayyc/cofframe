package com.hnayyc.cofframe.deskapp.dao;

import com.hnayyc.cofframe.deskapp.model.Employee;

import java.util.List;


public interface  EmployeeDao {
    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);

    Employee findBySsn(String ssn);

    void updateEmployee(Employee employee);
}
