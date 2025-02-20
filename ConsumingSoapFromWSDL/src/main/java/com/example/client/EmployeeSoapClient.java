//package com.example.client;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.ws.client.core.WebServiceTemplate;
//import org.springframework.ws.soap.client.core.SoapActionCallback;
//
//import allapis.springbootsoap.com.AddEmployeeRequest;
//import allapis.springbootsoap.com.AddEmployeeResponse;
//
//@Service
//public class EmployeeSoapClient {
//
//    private static final String SOAP_URL = "http://localhost:8087/allService"; // ✅ Add SOAP service URL
//
//    private final WebServiceTemplate webServiceTemplate;
//
//    @Autowired
//    public EmployeeSoapClient(WebServiceTemplate webServiceTemplate) {
//        this.webServiceTemplate = webServiceTemplate;
//    }
//
//    public AddEmployeeResponse addEmployee(AddEmployeeRequest request) {
//        return (AddEmployeeResponse) webServiceTemplate.marshalSendAndReceive(
//                SOAP_URL, request, new SoapActionCallback("")); // ✅ Use SOAP_URL
//    }
//}
