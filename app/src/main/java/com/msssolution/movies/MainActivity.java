package com.msssolution.movies;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends SingleFragment {

    @Override
    protected Fragment createFragment() {
        return new RecyclerFragment().newInstance();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Popular movies");
    }
}
