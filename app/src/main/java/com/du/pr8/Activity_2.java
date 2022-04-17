package com.du.pr8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Activity_2 extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "output";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"Inside Activity_2, onCreate() method called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button one = findViewById(R.id.one_2);
        one.setOnClickListener(this);

        Button two = findViewById(R.id.two_2);
        two.setOnClickListener(this);

        Button change = findViewById(R.id.change_2);
        change.setOnClickListener(this);
    }

    @Override
    protected void onPause() {
        Log.i(TAG,"Inside Activity_2, onPause() method called");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.i(TAG,"Inside Activity_2, onResume() method called");
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG,"Inside Activity_2, onDestroy() method called");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.i(TAG,"Inside Activity_2, onStop() method called");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.i(TAG,"Inside Activity_2, onStart() method called");
        super.onStart();

    }

    void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout_2,fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.one_2:
                replaceFragment(new Fragment1());
                break;

            case R.id.two_2:
                replaceFragment(new Fragment2());
                break;

            case R.id.change_2:
                Intent intent = new Intent(this,Activity_1.class);
                startActivity(intent);
                break;
        }
    }
}