package com.bignerdranch.android.draganddraw.controller.activity;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.draganddraw.controller.fragment.DragAndDrawFragment;

public class DragAndDrawActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
