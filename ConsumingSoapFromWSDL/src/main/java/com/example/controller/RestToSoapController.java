package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.service.SoapService;

import allapis.springbootsoap.com.AddEmployeeResponse;
import allapis.springbootsoap.com.EmployeeInfo;
import allapis.springbootsoap.com.UpdateEmployeeResponse;
import com.example.util.PathConstants;
@RestController
@RequestMapping(PathConstants.GET_MAPPING_PATH)
public class RestToSoapController {

    @Autowired
    private SoapService soapService;

    @PostMapping(PathConstants.ADD_EMPLOYEE_PATH)
    public AddEmployeeResponse addEmployee(@RequestBody EmployeeInfo employee) {
        return soapService.addEmployee(employee);
    }

    @PostMapping(PathConstants.UPDATE_EMPLOYEE_PATH)
    public UpdateEmployeeResponse updateEmployee(@RequestBody EmployeeInfo employee) {
        return soapService.updateEmployee(employee);
    }
}
