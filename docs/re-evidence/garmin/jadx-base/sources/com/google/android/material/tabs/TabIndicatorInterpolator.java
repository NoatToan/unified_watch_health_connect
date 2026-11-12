package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: loaded from: classes14.dex */
class TabIndicatorInterpolator {
    private static final int MIN_INDICATOR_WIDTH = 24;

    public static RectF calculateIndicatorWidthForTab(TabLayout tabLayout, View view2) {
        if (view2 == null) {
            return new RectF();
        }
        return (tabLayout.isTabIndicatorFullWidth() || !(view2 instanceof TabLayout.TabView)) ? new RectF(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom()) : calculateTabViewContentBounds((TabLayout.TabView) view2, 24);
    }

    public static RectF calculateTabViewContentBounds(TabLayout.TabView tabView, int i14) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iDpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i14);
        if (contentWidth < iDpToPx) {
            contentWidth = iDpToPx;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i15 = contentWidth / 2;
        return new RectF(right - i15, bottom - (contentHeight / 2), i15 + right, (right / 2) + bottom);
    }

    public void setIndicatorBoundsForTab(TabLayout tabLayout, View view2, Drawable drawable) {
        RectF rectFCalculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view2);
        drawable.setBounds((int) rectFCalculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) rectFCalculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
    }

    public void updateIndicatorForOffset(TabLayout tabLayout, View view2, View view3, float f14, Drawable drawable) {
        RectF rectFCalculateIndicatorWidthForTab = calculateIndicatorWidthForTab(tabLayout, view2);
        RectF rectFCalculateIndicatorWidthForTab2 = calculateIndicatorWidthForTab(tabLayout, view3);
        drawable.setBounds(AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.left, (int) rectFCalculateIndicatorWidthForTab2.left, f14), drawable.getBounds().top, AnimationUtils.lerp((int) rectFCalculateIndicatorWidthForTab.right, (int) rectFCalculateIndicatorWidthForTab2.right, f14), drawable.getBounds().bottom);
    }
}
