package com.bignerdranch.android.draganddraw.model;

import android.graphics.PointF;

/**
 * Created by TINH HUYNH on 5/17/2017.
 */

public class Box {
    private PointF mOrigin;
    private PointF mCurrent;


    public Box(PointF origin) {
        mOrigin = origin;
        mCurrent = origin;
    }

    public void setCurrent(PointF current) {
        mCurrent = current;
    }

    public PointF getOrigin() {
        return mOrigin;
    }

    public PointF getCurrent() {
        return mCurrent;
    }
}
