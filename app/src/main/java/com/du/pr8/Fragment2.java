package com.du.pr8;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {

    private static final String TAG = "output";

    public Fragment2() {
        super();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_2, onCreate() method called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_2, onCreateView() method called");
        return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onResume() {
        Log.i(TAG, "Inside Fragment_2, onResume() method called");
        super.onResume();
    }

    @Override
    public void onStart() {
        Log.i(TAG, "Inside Fragment_2, onStart() method called");
        super.onStart();
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Inside Fragment_2, Destroy() method called");
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        Log.i(TAG, "Inside Fragment_2, onDestroyView() method called");
        super.onDestroyView();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.i(TAG, "Inside Fragment_2, onSaveInstanceState() method called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i(TAG, "Inside Fragment_2, onStop() method called");
        super.onStop();
    }

    @Override
    public void onPause() {
        Log.i(TAG, "Inside Fragment_2, onPause() method called");
        super.onPause();
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_2, onViewStateRestored() method called");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "Inside Fragment_2, onViewCreated() method called");
        super.onViewCreated(view, savedInstanceState);
    }
}