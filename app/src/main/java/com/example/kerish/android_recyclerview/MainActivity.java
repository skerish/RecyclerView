package com.example.kerish.android_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_id);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] lang = {"Java", "JavaScript", "C#", "C++", "php", "C", "Python",
                "Go","Java", "JavaScript", "C#", "C++", "php", "C", "Python", "Go"};

        recyclerView.setAdapter(new ProgrammingAdapter(lang));

    }
}
