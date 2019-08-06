package com.expig.jobapplicationlistener.model;

import java.time.LocalDate;

public class JobEntity extends AbstractPersistableEntity {

    private LocalDate applicationDate;
    private int rate;

    public JobEntity(LocalDate applicationDate, int rate) {
        super();
        this.applicationDate = applicationDate;
        this.rate = rate;
    }

}
