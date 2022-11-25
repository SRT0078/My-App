package com.sitaram.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @SuppressLint("StaticFieldLeak")
    private static TextView txView;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txView = findViewById(R.id.textView);
        Button txButton = findViewById(R.id.btSyning);

        txButton.setOnClickListener(view -> {
            txView.setText("Thank you");
            loginActivity();
        });
    }
    public void loginActivity () {
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }
}