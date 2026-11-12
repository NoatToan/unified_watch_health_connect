package com.huami.watchfacesstore.view.banner;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Px;

/* JADX INFO: loaded from: classes17.dex */
public interface Indicator {
    RelativeLayout.LayoutParams getParams();

    View getView();

    void initIndicatorCount(int pagerCount);

    void onPageScrollStateChanged(int state);

    void onPageScrolled(int position, float positionOffset, @Px int positionOffsetPixels);

    void onPageSelected(int position);
}
