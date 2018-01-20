package com.foodfate.swamphacks18.www.foodfate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
    }

    // Restaurant variables
    private int rating, distance;
    private String price;

    // Restaurant Constructor
    public Restaurant(int rating, int distance, String price) {
        this.rating = rating;
        this.distance = distance;
        this.price = price;
    }

    // Restaurant public methods
    public int getRating() {return rating;}
    public int getDistance() {return distance;}
    public String getPrice() {return price;}

}