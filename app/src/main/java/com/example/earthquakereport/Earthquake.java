package com.example.earthquakereport;

/**
 * An {@link Earthquake} object contains information related to a single earthquake
 */

public class Earthquake {
    /* magnitude of the earthquake */
    private String mMagnitude;

    /* location of the earthquake */
    private String mLocation;

    /* date of the earthquake */
    private String mDate;

    /**
     * constructs a new {@link Earthquake} object
     * @param magnitude is the magnitude (size) of the earthquake.
     * @param location is the city location of the earthquake
     * @param date is the date of the earthquake
     */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }

    /* returns the magnitude of the earthquake */
    public String getMagnitude() {
        return mMagnitude;
    }
    /* returns the location of the earthquake */
    public String getLocation() {
        return mLocation;
    }

    /* returns the date of the earthquake */
    public String getDate() {
        return mDate;
    }
}
