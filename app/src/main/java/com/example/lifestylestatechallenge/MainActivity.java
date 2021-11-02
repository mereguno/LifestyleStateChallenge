package com.example.lifestylestatechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView view1, view2, view3, view4, view5, view6, view7, view8, view9, view10;
    private ArrayList<String> buttonList = new ArrayList<>();
    private ArrayList<String> selectionList = new ArrayList<>();
    private ArrayList<TextView> itemList = new ArrayList<>();
    public static final int TEXT_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view1 = findViewById(R.id.textView1);
        view2 = findViewById(R.id.textView2);
        view3 = findViewById(R.id.textView3);
        view4 = findViewById(R.id.textView4);
        view5 = findViewById(R.id.textView5);
        view6 = findViewById(R.id.textView6);
        view7 = findViewById(R.id.textView7);
        view8 = findViewById(R.id.textView8);
        view9 = findViewById(R.id.textView9);
        view10 = findViewById(R.id.textView10);
        itemList.add(view1);
        itemList.add(view2);
        itemList.add(view3);
        itemList.add(view4);
        itemList.add(view5);
        itemList.add(view6);
        itemList.add(view7);
        itemList.add(view8);
        itemList.add(view9);
        itemList.add(view10);
        if(savedInstanceState != null){
            selectionList = (ArrayList<String>)savedInstanceState.getSerializable("array");
            for(int i = 0; i < selectionList.size(); i++){
                itemList.get(i).setText(selectionList.get(i));
            }
        }
    }

    public void addItem(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                if(!(buttonList.contains(reply))){
                    buttonList.add(reply);
                }
                for(int i = 0; i < buttonList.size(); i++){
                    itemList.get(i).setText(buttonList.get(i));
                }
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
        outstate.putSerializable("array", buttonList);
    }
}