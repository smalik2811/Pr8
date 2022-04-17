package com.du.pr8;

import android.nfc.Tag;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1 extends Fragment {

    private static final String TAG = "output";

    public Fragment1() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_1, onCreate() method called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_1, onCreateView() method called");
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onResume() {
        Log.i(TAG, "Inside Fragment_1, onResume() method called");
        super.onResume();
    }

    @Override
    public void onStart() {
        Log.i(TAG, "Inside Fragment_1, onStart() method called");
        super.onStart();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Inside Fragment_1, Destroy() method called");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "Inside Fragment_1, onDestroyView() method called");
        super.onDestroyView();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.i(TAG, "Inside Fragment_1, onSaveInstanceState() method called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i(TAG, "Inside Fragment_1, onStop() method called");
        super.onStop();
    }

    @Override
    public void onPause() {
        Log.i(TAG, "Inside Fragment_1, onPause() method called");
        super.onPause();
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_1, onViewStateRestored() method called");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_1, onViewCreated() method called");
        super.onViewCreated(view, savedInstanceState);
    }
}