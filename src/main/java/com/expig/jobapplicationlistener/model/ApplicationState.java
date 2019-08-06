package com.expig.jobapplicationlistener.model;

public enum ApplicationState {
    INTERESTED("interested"),
    APPLIED("applied"),
    APPLICATION_ACKNOWLEDGED("application acknowledged"),
    FIRST_ROUND("first round"),
    SECOND_ROUND("second round"),
    THIRD_ROUND("third round"),
    OFFER_RECEIVED("offer received");

    private String displayName;

    ApplicationState(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
