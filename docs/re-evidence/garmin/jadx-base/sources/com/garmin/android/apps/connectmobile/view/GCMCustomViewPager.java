package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class GCMCustomViewPager extends ViewPager {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f47444g1;

    public GCMCustomViewPager(Context context) {
        super(context);
        this.f47444g1 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f47444g1) {
            int action = motionEvent.getAction() & 255;
            if ((action == 3 || action == 1) && this.L0) {
                return true;
            }
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
            }
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f47444g1) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z14) {
        this.f47444g1 = z14;
    }

    public GCMCustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47444g1 = true;
    }
}
