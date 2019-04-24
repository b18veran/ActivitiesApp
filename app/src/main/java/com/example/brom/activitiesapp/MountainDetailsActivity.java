package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        Intent intent = getIntent();
        String Mountain = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView namn = findViewById(R.id.textView);
        namn.setText(Mountain);
    }
}
