package com.example.tmp_sda_1134.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class
MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            final EditText etUserName = (EditText) findViewById(R.id.etUserName);
            final EditText etpassword = (EditText) findViewById(R.id.etpassword);
            final Button btLogin = (Button) findViewById(R.id.btLogin);
            final Button registerlink = (Button) findViewById(R.id.btCreateNwAccnt);




            registerlink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent createAccountIntent = new Intent(MainActivity.this, createAccount.class);
                    MainActivity.this.startActivity(createAccountIntent);
                }
            });

        }
    }

