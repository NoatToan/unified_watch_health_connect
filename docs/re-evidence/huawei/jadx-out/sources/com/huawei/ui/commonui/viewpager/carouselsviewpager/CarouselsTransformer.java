package com.huawei.ui.commonui.viewpager.carouselsviewpager;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes43.dex */
public class CarouselsTransformer implements ViewPager.PageTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewPager f24038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24039b;

    public CarouselsTransformer(ViewPager viewPager) {
        this.f24038a = viewPager;
        this.f24039b = viewPager.getOffscreenPageLimit() + 1;
    }

    @Override // androidx.viewpager.widget.ViewPager.PageTransformer
    public void transformPage(View view, float f) {
        view.setVisibility(0);
        float width = this.f24038a.getWidth();
        view.setTranslationX((int) ((((((width - (width * 0.6982f)) / 2.0f) / this.f24039b) - view.getWidth()) * f * 0.7395f) + 342.0f));
        if (f > -3.0f && f < -2.0f) {
            view.setAlpha(f + 3.0f);
        } else if (f <= -3.0f) {
            view.setAlpha(0.0f);
            view.setVisibility(8);
        } else {
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
        float f2 = (f <= -3.0f || f >= -2.0f) ? 0.6982f - (0.1509f * f) : (((3.0f + f) - 1.0f) * 0.1509f) + 1.0f;
        view.setPivotX(0.0f);
        view.setPivotY(view.getTop());
        view.setScaleX(f2);
        view.setScaleY(f2);
        ViewCompat.setElevation(view, (this.f24039b - f) * 15.0f);
    }
}
