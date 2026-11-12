package com.xiaomi.fitness.sport_eco.view.interval;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class ScrollViewPager extends ViewPager {
    public boolean j0;

    public ScrollViewPager(Context context) {
        super(context);
        this.j0 = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.j0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i3) {
                i3 = measuredHeight;
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.j0 && super.onTouchEvent(motionEvent);
    }

    public void setCanScroll(boolean z) {
        this.j0 = z;
    }

    public ScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j0 = false;
    }
}
