package com.youth.banner;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes22.dex */
public class BannerScroller extends Scroller {
    private int a;

    public BannerScroller(Context context) {
        super(context);
        this.a = 800;
    }

    public void setDuration(int i) {
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

    public BannerScroller(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.a = 800;
    }

    public BannerScroller(Context context, Interpolator interpolator, boolean z) {
        super(context, interpolator, z);
        this.a = 800;
    }
}
