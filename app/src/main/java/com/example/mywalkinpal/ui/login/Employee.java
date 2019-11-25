package com.example.mywalkinpal.ui.login;

import com.example.mywalkinpal.Rate;
import com.example.mywalkinpal.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Employee extends UserProfile {

    private String address;
    private String phoneNumber;
    private String clinicName;
    private ArrayList<Service> services;
    private ArrayList<String> insuranceTypesAccepted;
    private ArrayList<String> paymentTypesAccepted;
    private ArrayList<ArrayList<String>> workingHours;
    private Rate[] rates;

    public Rate[] getRate(){return rates;};

    public ArrayList<ArrayList<String>> getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(ArrayList<ArrayList<String>> workingHours) {
        this.workingHours = workingHours;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public ArrayList<String> getInsuranceTypesAccepted() {
        return insuranceTypesAccepted;
    }

    public void setInsuranceTypesAccepted(ArrayList<String> insuranceTypesAccepted) {
        this.insuranceTypesAccepted = insuranceTypesAccepted;
    }

    public ArrayList<String> getPaymentTypesAccepted() {
        return paymentTypesAccepted;
    }

    public void setPaymentTypesAccepted(ArrayList<String> paymentTypesAccepted) {
        this.paymentTypesAccepted = paymentTypesAccepted;
    }



    public Employee(){

    }
    public Employee(String userFirstName, String userLastName, String userEmail, String userType,String hashedPass, String address, String phoneNumber, String clinicName, ArrayList<String> insuranceTypesAccepted,ArrayList<String> paymentTypesAccepted, ArrayList<Service> services, ArrayList<ArrayList<String>> workingHours, Rate[] rates ){
        super( userFirstName, userLastName, userEmail, userType, hashedPass);
        this.address = address;
        this.paymentTypesAccepted = paymentTypesAccepted;
        this.phoneNumber = phoneNumber;
        this.clinicName = clinicName;
        this.services = services;
        this.workingHours = workingHours;
        this.rates = rates;
    }
}
