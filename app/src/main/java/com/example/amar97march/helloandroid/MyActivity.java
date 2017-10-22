package com.example.amar97march.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends AppCompatActivity {
//TODO kjgyg
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        Toast.makeText(this,"Can you see me",Toast.LENGTH_SHORT).show();
        Log.i("info","Done creating the app");}

    public void topClick (View v){
        Toast.makeText(this,"Top button Clicked",Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button.");
    }

    public void bottomClick (View v){
        Toast.makeText(this,"Bottom button Clicked",Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the bottom button.");
    }
}
