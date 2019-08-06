package com.expig.jobapplicationlistener.model;

public class Company extends AbstractPersistableEntity {

    private String address;

    public Company(String address) {
        super();
        this.address = address;
    }
}
