package com.example.multiplerecylerview.models;

public class Trip {
    private int tripImage;
    private String tripTitle,trip;

    public Trip(int tripImage, String tripTitle, String trip) {
        this.tripImage = tripImage;
        this.tripTitle = tripTitle;
        this.trip = trip;
    }

    public int getTripImage() {
        return tripImage;
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public String getTrip() {
        return trip;
    }
}
