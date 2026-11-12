package com.xiaomi.fitness.electronic.scale.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes8.dex */
public class NoSwipeViewPager extends ViewPager {
    public boolean j0;

    public NoSwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.j0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.j0 && super.onTouchEvent(motionEvent);
    }

    public void setCanSwipe(boolean z) {
        this.j0 = z;
    }
}
