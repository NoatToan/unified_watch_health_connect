package com.xiaomi.hm.health.view.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes22.dex */
public class HMViewPager extends ViewPager {
    public HMViewPager(Context context) {
        super(context);
    }

    @Nullable
    public String getCurrentItemTitle() {
        CharSequence pageTitle;
        if (getAdapter() == null || (pageTitle = getAdapter().getPageTitle(getCurrentItem())) == null) {
            return null;
        }
        return pageTitle.toString();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);
    }

    public HMViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
