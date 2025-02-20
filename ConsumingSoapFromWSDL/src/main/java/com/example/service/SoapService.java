package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.client.SOAPConnector;

import allapis.springbootsoap.com.AddEmployeeRequest;
import allapis.springbootsoap.com.AddEmployeeResponse;
import allapis.springbootsoap.com.EmployeeInfo;
import allapis.springbootsoap.com.UpdateEmployeeRequest;
import allapis.springbootsoap.com.UpdateEmployeeResponse;

@Service
public class SoapService {

    @Autowired
    private SOAPConnector soapConnector;

    public AddEmployeeResponse addEmployee(EmployeeInfo employee) {
        AddEmployeeRequest request = new AddEmployeeRequest();
        request.setEmployeeInfo(employee);
        return soapConnector.addEmployee(request);
    }

    public UpdateEmployeeResponse updateEmployee(EmployeeInfo employee) {
        UpdateEmployeeRequest request = new UpdateEmployeeRequest();
        request.setEmployeeInfo(employee);
        return soapConnector.updateEmployee(request);
    }
}
