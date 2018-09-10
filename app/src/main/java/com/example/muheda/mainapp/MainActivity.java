package com.example.muheda.mainapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.muheda.base_module.Utils.IntentToActivity;
import com.example.muheda.home_module.view.Activity.HomeMainActivity;
import com.muheda.moduleceshi.ActivityOne;

public class MainActivity extends AppCompatActivity {
    private Button button,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentToActivity.skipToActivity(MainActivity.this, HomeMainActivity.class);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentToActivity.skipToActivity(MainActivity.this, ActivityOne.class);
            }
        });
    }
}
