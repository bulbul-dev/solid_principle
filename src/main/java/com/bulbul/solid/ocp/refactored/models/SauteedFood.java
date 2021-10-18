package com.bulbul.solid.ocp.refactored.models;

import com.bulbul.solid.ocp.refactored.FoodPreparer;
import com.bulbul.solid.ocp.violation.models.FoodItem;

public class SauteedFood extends FoodItem implements FoodPreparer {
    public SauteedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("---> Sauteeing " + this.getName()); // some grilling logic
    }
}