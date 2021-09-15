package com.example.prjsep13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edName, edAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        edName = findViewById(R.id.edName);
        edAge = findViewById(R.id.edAge);

    }

    public void show(View view){
        String name = edName.getText().toString();
        String age = edAge.getText().toString();

        int value = 20;
        int newAge = value + Integer.valueOf(age);

        Toast.makeText(this,"Name: " +name+ "\n" + "Age: " +age+ "\nNew age: "+newAge,Toast.LENGTH_LONG).show();

    }
    public void quit(View view){
        finish();

    }
}