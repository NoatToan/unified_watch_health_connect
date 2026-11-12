package com.xiaomi.hm.health.view.pager;

import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes22.dex */
public interface PageIndicator extends ViewPager.OnPageChangeListener {
    void notifyDataSetChanged();

    void setCurrentItem(int item);

    void setOnPageChangeListener(ViewPager.OnPageChangeListener listener);

    void setViewPager(ViewPager view);

    void setViewPager(ViewPager view, int initialPosition);
}
