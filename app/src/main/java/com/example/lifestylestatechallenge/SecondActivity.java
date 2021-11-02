package com.example.lifestylestatechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public String item;
    public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        button1 = findViewById(R.id.egg_button);
        button2 = findViewById(R.id.rice_button);
        button3 = findViewById(R.id.milk_button);
        button4 = findViewById(R.id.apple_button);
        button5 = findViewById(R.id.cheese_button);
    }

    public void returnApples(View view){
        item = getString(R.string.add_apples);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnRice(View view){
        item = getString(R.string.add_rice);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnCheese(View view){
        item = getString(R.string.add_cheese);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnEggs(View view){
        item = getString(R.string.add_eggs);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnMilk(View view){
        item = getString(R.string.add_milk);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnChips(View view){
        item = getString(R.string.add_chips);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnChicken(View view){
        item = getString(R.string.add_chicken);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnBread(View view){
        item = getString(R.string.add_bread);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnWater(View view){
        item = getString(R.string.add_water);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }

    public void returnSoda(View view){
        item = getString(R.string.add_soda);
        Intent addition = new Intent();
        addition.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, addition);
        finish();
    }
}