package com.appwallet.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkOnce();
    }
    public void checkOnce(){
        Toast.makeText(this, "Check project", Toast.LENGTH_SHORT).show();
    }
}
