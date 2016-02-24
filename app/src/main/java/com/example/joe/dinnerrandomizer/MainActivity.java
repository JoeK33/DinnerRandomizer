package com.example.joe.dinnerrandomizer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> pickedMeals = new ArrayList();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mealButton = (Button) findViewById(R.id.button);
        final TextView mealName = (TextView) findViewById(R.id.mealView);
        listView = (ListView) findViewById(R.id.listView);

        if(savedInstanceState != null) {
            pickedMeals = savedInstanceState.getStringArrayList("meals");
            listView.invalidate();
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                pickedMeals
        );
        listView.setAdapter(arrayAdapter);

        mealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = MealList.pickRandomMeal();
                mealName.setText(meal);
                pickedMeals.add(meal);
                listView.invalidate();

            }
        });
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putStringArrayList("meals", pickedMeals);
        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

}
