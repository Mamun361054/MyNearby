package com.nsu.dorbesh.mynearby;

/**
 * Created by DORBESH on 1/28/2017.
 */

public class NearBy {


    String name;
    String vincity;
    String latitude;
    String longitude;
    String clatitude;

    public String getClatitude() {
        return clatitude;
    }

    public NearBy(String name, String vincity, String latitude, String longitude, String clatitude, String clongitude) {
        this.name = name;
        this.vincity = vincity;
        this.latitude = latitude;
        this.longitude = longitude;
        this.clatitude = clatitude;
        this.clongitude = clongitude;
    }

    public void setClatitude(String clatitude) {
        this.clatitude = clatitude;
    }

    public String getClongitude() {

        return clongitude;
    }

    public void setClongitude(String clongitude) {
        this.clongitude = clongitude;
    }

    String clongitude;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVincity() {
        return vincity;
    }

    public void setVincity(String vincity) {
        this.vincity = vincity;
    }

    public NearBy(String name, String vincity) {
            this.name = name;
            this.vincity = vincity;
        }

    public NearBy(String name, String vincity, String latitude, String longitude) {
        this.name = name;
        this.vincity = vincity;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}



