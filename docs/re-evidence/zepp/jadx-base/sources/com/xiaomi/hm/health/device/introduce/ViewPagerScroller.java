package com.xiaomi.hm.health.device.introduce;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes18.dex */
public class ViewPagerScroller extends Scroller {
    private int a;

    public ViewPagerScroller(Context context) {
        super(context);
        this.a = 2000;
    }

    public void initViewPagerScroll(ViewPager viewPager) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(viewPager, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setScrollDuration(int i) {
        this.a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.a);
    }

    public ViewPagerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.a = 2000;
    }

    public ViewPagerScroller(Context context, Interpolator interpolator, boolean z) {
        super(context, interpolator, z);
        this.a = 2000;
    }
}
