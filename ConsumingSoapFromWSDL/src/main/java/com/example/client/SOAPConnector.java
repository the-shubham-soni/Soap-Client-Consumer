package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.example.util.PathConstants;
import allapis.springbootsoap.com.*;

@Component
public class SOAPConnector {

    private final WebServiceTemplate webServiceTemplate;

    @Autowired
    public SOAPConnector(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public AddEmployeeResponse addEmployee(AddEmployeeRequest request) {
        return (AddEmployeeResponse) webServiceTemplate.marshalSendAndReceive(
        		PathConstants.SOAP_URL, request); 
    }

    public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest request) {
        return (UpdateEmployeeResponse) webServiceTemplate.marshalSendAndReceive(
        		PathConstants.SOAP_URL, request);
    }
}
