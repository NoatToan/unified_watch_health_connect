package com.garmin.android.apps.connectmobile.view.view_3_0;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes10.dex */
public class b extends ViewPager2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewPager.j f47865a;

    public b(a.e eVar, ViewPager.j jVar) {
        this.f47865a = jVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageScrollStateChanged(int i14) {
        this.f47865a.onPageScrollStateChanged(i14);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageScrolled(int i14, float f14, int i15) {
        this.f47865a.onPageScrolled(i14, f14, i15);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.h
    public final void onPageSelected(int i14) {
        this.f47865a.onPageSelected(i14);
    }
}
