package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import r22.w0;

/* JADX INFO: loaded from: classes10.dex */
public class InfiniteViewPager extends GCMCustomViewPager {

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public w0 f47469h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public ViewPager.j f47470i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f47471j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f47472k1;

    public class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i14) {
            ViewPager.j jVar = InfiniteViewPager.this.f47470i1;
            if (jVar != null) {
                jVar.onPageScrollStateChanged(i14);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i14, float f14, int i15) {
            ViewPager.j jVar = InfiniteViewPager.this.f47470i1;
            if (jVar != null) {
                jVar.onPageScrolled(i14, f14, i15);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i14) {
            int i15;
            InfiniteViewPager infiniteViewPager = InfiniteViewPager.this;
            w0 w0Var = infiniteViewPager.f47469h1;
            if (w0Var != null) {
                int i16 = w0Var.f149911h;
                w0Var.f149911h = i14;
                ViewPager.j jVar = infiniteViewPager.f47470i1;
                if (jVar != null) {
                    int i17 = w0Var.f149913j;
                    if (i16 > i14) {
                        i15 = i17 - 1;
                        w0Var.f149913j = i15;
                    } else {
                        i15 = i17 + 1;
                        w0Var.f149913j = i15;
                    }
                    jVar.onPageSelected(i15);
                }
            }
        }
    }

    public InfiniteViewPager(Context context) {
        super(context);
        this.f47472k1 = true;
        c(new a());
        this.f47471j1 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final boolean f(int i14, int i15, int i16, View view2, boolean z14) {
        return this.f47472k1 && super.f(i14, i15, i16, view2, z14);
    }

    @Override // com.garmin.android.apps.connectmobile.view.GCMCustomViewPager, androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f47471j1 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.garmin.android.apps.connectmobile.view.GCMCustomViewPager, androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f47471j1 && super.onTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(fe.a aVar) {
        if (aVar instanceof w0) {
            w0 w0Var = (w0) aVar;
            this.f47469h1 = w0Var;
            setDefaultPosition(w0Var.f149912i);
        }
        super.setAdapter(aVar);
        w0 w0Var2 = this.f47469h1;
        if (w0Var2 != null) {
            setDefaultPosition(w0Var2.f149912i);
        }
    }

    public void setDefaultPosition(int i14) {
        setCurrentItem(i14);
    }

    public void setInsideScrollingEnabled(boolean z14) {
        this.f47472k1 = z14;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f47470i1 = jVar;
    }

    public void setSwipeEnabled(boolean z14) {
        this.f47471j1 = z14;
    }

    public InfiniteViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47472k1 = true;
        c(new a());
        this.f47471j1 = true;
    }

    public void setAdapter(w0 w0Var) {
        this.f47469h1 = w0Var;
        super.setAdapter((fe.a) w0Var);
        setDefaultPosition(this.f47469h1.f149912i);
    }
}
