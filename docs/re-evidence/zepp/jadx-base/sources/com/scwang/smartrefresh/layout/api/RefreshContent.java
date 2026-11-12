package com.scwang.smartrefresh.layout.api;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes18.dex */
public interface RefreshContent {
    boolean canLoadmore();

    boolean canRefresh();

    ViewGroup.LayoutParams getLayoutParams();

    int getMeasuredHeight();

    int getMeasuredWidth();

    View getScrollableView();

    View getView();

    void layout(int i, int i2, int i3, int i4);

    void measure(int i, int i2);

    void moveSpinner(int i);

    void onActionDown(MotionEvent motionEvent);

    void onActionUpOrCancel();

    void onInitialHeaderAndFooter(int i, int i2);

    ValueAnimator.AnimatorUpdateListener onLoadingFinish(RefreshKernel refreshKernel, int i, int i2, int i3);

    void setEnableLoadmoreWhenContentNotFull(boolean z);

    void setScrollBoundaryDecider(ScrollBoundaryDecider scrollBoundaryDecider);

    void setupComponent(RefreshKernel refreshKernel, View view, View view2);
}
