package com.example.tmp_sda_1134.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by tmp-sda-1134 on 11/7/17.
 */


public class createAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etCity = (EditText) findViewById(R.id.etCity);
        final EditText etHobby1 = (EditText) findViewById(R.id.etHobby1);
        final EditText etHobby2 = (EditText) findViewById(R.id.etHobby2);
        final EditText etUserid = (EditText) findViewById(R.id.etUserid);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button btRegister = (Button) findViewById(R.id.btRegister);
        final Button btCancel = (Button) findViewById(R.id.btCancel);
    }
}