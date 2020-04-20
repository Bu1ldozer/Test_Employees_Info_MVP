package com.halushchak.testemployeesinfo.screens.employees;

import com.halushchak.testemployeesinfo.pojo.Employee;

import java.util.List;

public interface EmployeesListView {
    void showData(List<Employee> employees);
    void showError();
}
