package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class HeightAdaptedTouchSwitchViewPager extends ViewPager {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f47459g1;

    public HeightAdaptedTouchSwitchViewPager(Context context) {
        super(context);
        this.f47459g1 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i14) {
        return this.f47459g1 && super.canScrollHorizontally(i14);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            childAt.measure(i14, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        if (i16 > 0) {
            super.onMeasure(i14, View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
        }
    }

    public void setTouchEnabled(boolean z14) {
        this.f47459g1 = z14;
    }

    public HeightAdaptedTouchSwitchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47459g1 = true;
    }
}
