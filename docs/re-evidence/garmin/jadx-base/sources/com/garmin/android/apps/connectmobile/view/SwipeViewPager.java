package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class SwipeViewPager extends ViewPager {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f47549g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f47550h1;

    public SwipeViewPager(Context context) {
        super(context);
        this.f47549g1 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i14) {
        return this.f47549g1 && super.canScrollHorizontally(i14);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean f(int i14, int i15, int i16, View view2, boolean z14) {
        if (this.f47550h1 && (view2 instanceof RecyclerView)) {
            RecyclerView recyclerView = (RecyclerView) view2;
            if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 0) {
                return true;
            }
        }
        return super.f(i14, i15, i16, view2, z14);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f47549g1 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f47549g1 && super.onTouchEvent(motionEvent);
    }

    public void setForceHorizontalScroll(boolean z14) {
        this.f47550h1 = z14;
    }

    public void setSwipeEnabled(boolean z14) {
        this.f47549g1 = z14;
    }

    public SwipeViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47549g1 = true;
    }
}
