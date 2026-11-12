package com.xiaomi.hm.health.view.indicator;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes22.dex */
public interface PageIndicator extends ViewPager.OnPageChangeListener {
    int getCount();

    int getOffset();

    void notifyDataSetChanged();

    void setCurrentItem(int i);

    void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener);

    void setViewPager(ViewPager viewPager);

    void setViewPager(ViewPager viewPager, int i);
}
