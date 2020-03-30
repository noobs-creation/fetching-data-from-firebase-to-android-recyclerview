package com.example.recyclerviewfromfirebase;

public class DataSet {

    String imgLink;
    String city;
    String state;

    public DataSet(String imgLink, String city, String state) {
        this.imgLink = imgLink;
        this.city = city;
        this.state = state;
    }

    public DataSet() {
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
