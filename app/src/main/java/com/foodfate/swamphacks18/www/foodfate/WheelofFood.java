package com.foodfate.swamphacks18.www.foodfate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WheelofFood extends AppCompatActivity {

    // Filters
    private int maxPrice, maxDistance, minRating;

    protected WheelofFood(int maxPrice, int maxDistance, int minRating) {
        this.maxPrice = maxPrice;
        this.maxDistance = maxDistance;
        this.minRating = minRating;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheelof_food);

        WheelofFood woFood = new WheelofFood(4, 30, 3);
    }

    protected void setFilterPrice (int filterPrice) {
        
    }

    protected Restaurant randomFood() {
        return null;
    }

    protected void restaurantInfo() {
        Intent info = new Intent(this, Restaurant.class);
        startActivity(info);
    }

    protected void viewHistory() {
        Intent history = new Intent(this, FoodHistory.class);
        startActivity(history);
    }



}
