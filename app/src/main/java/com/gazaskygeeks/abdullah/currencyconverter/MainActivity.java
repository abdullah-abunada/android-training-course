package com.gazaskygeeks.abdullah.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View View){

        EditText dollar = (EditText) findViewById(R.id.editText);
        double euro = Double.parseDouble(dollar.getText().toString()) * 0.93;
        Toast.makeText(this, euro+"", Toast.LENGTH_LONG).show();
    }
}
