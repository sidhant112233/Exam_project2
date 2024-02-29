package com.example.exam_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Shoes_Activity extends AppCompatActivity {

    RecyclerView rvdata2;
    Integer[] image = {R.drawable.shoes1};
    String[] name = {"NIKE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);
    }
}