package com.example.exam_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import Shoe_adapters.Shoe_Adapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvdata;
    Integer[] image = {R.drawable.shoes1, R.drawable.shoes2, R.drawable.shoes3, R.drawable.shoes4};
    String[] name = {"NIKE SPORT", "NIKE AIR", "NIKE", "ADIDAS"};
    String[] price = {"22000", "35550", "40000", "10000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvdata = findViewById(R.id.rvdata);

        Shoe_Adapter adapter = new Shoe_Adapter(this, image, name, price);
        RecyclerView.LayoutManager lm;
        lm = new LinearLayoutManager(this);
        rvdata.setAdapter(adapter);
        rvdata.setLayoutManager(lm);


    }
}