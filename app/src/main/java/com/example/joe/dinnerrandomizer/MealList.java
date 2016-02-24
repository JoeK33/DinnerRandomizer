package com.example.joe.dinnerrandomizer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Joe on 2/23/2016.
 * Picks a random meal from the list of possible meals
 */
public class MealList {

    static ArrayList<String> mealChoices = new ArrayList<String>(Arrays.asList(
            "Steak and Potato",
            "Lasagna and Garlic Bread",
            "BBQ pulled pork with chips",
            "Carnitas",
            "White Fish with rice and vegetable",
            "Mahi Mahi with Mango Salsa and Rice",
            "Salmon with rice and roast vegetables",
            "Teriyaki with rice and sauted vegetables",
            "Pork Chops with vegetable",
            "Roast a whole chicken",
            "Chicken Pot Pie",
            "Grilled BBQ Chicken",
            "Pork Chop Sandwiches",
            "Pork Loin Roast",
            "Try something new",
            "Chicken parm",
            "Pasta with red sauce",
            "Pasta Alfredo",
            "Shepard's Pie"


    ));

    static String pickRandomMeal(){
        String meal = "Rocks";
        meal = mealChoices.get((int)(Math.random() * mealChoices.size()));
        return meal;
    }
}
