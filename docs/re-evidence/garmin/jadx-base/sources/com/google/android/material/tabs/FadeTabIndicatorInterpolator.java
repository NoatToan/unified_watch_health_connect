package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* JADX INFO: loaded from: classes14.dex */
class FadeTabIndicatorInterpolator extends TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    @Override // com.google.android.material.tabs.TabIndicatorInterpolator
    public void updateIndicatorForOffset(TabLayout tabLayout, View view2, View view3, float f14, Drawable drawable) {
        if (f14 >= FADE_THRESHOLD) {
            view2 = view3;
        }
        RectF rectFCalculateIndicatorWidthForTab = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view2);
        float fLerp = f14 < FADE_THRESHOLD ? AnimationUtils.lerp(1.0f, 0.0f, 0.0f, FADE_THRESHOLD, f14) : AnimationUtils.lerp(0.0f, 1.0f, FADE_THRESHOLD, 1.0f, f14);
        drawable.setBounds((int) rectFCalculateIndicatorWidthForTab.left, drawable.getBounds().top, (int) rectFCalculateIndicatorWidthForTab.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fLerp * 255.0f));
    }
}
