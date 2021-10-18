package com.bulbul.solid.ocp.refactored;

import com.bulbul.solid.ocp.refactored.models.FoodItem;

import java.util.List;

public class DecentKitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        foodItems.forEach(FoodPreparer::prepare);
    }
}
