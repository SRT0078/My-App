package com.sitaram.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class loginActivity<loginLayout> extends AppCompatActivity {
    private Button btn_ok, button_newAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        txView = (TextView) findViewById(R.id.textView);
        btn_ok = (Button) findViewById(R.id.button_ok);
        button_newAcc = (Button) findViewById(R.id.button_newAccount);

        btn_ok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                new homeActivity();
            }
        });

        button_newAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accountCreateActivity();
            }
        });
    }

    public void homeActivity () {
        Intent intok = new Intent(this, homeActivity.class);
        startActivity(intok);
    }

    public void accountCreateActivity () {
        Intent intNewAcc = new Intent(this, accountCreateActivity.class);
        startActivity(intNewAcc);
    }
}