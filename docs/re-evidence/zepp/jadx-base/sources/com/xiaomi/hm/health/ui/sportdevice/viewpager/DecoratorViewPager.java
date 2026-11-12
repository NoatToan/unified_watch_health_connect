package com.xiaomi.hm.health.ui.sportdevice.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes22.dex */
public class DecoratorViewPager extends ViewPager {
    private ViewGroup a;
    private boolean b;

    public DecoratorViewPager(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        ViewGroup viewGroup;
        if (!this.b && (viewGroup = this.a) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        ViewGroup viewGroup;
        if (!this.b && (viewGroup = this.a) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(arg0);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent arg0) {
        ViewGroup viewGroup;
        if (!this.b && (viewGroup = this.a) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        if (arg0.getAction() == 0) {
            performClick();
        }
        return super.onTouchEvent(arg0);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setNestedParent(ViewGroup parent) {
        this.a = parent;
    }

    public DecoratorViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
