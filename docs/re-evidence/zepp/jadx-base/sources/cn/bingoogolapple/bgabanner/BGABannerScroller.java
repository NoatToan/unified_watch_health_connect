package cn.bingoogolapple.bgabanner;

import android.content.Context;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes2.dex */
public class BGABannerScroller extends Scroller {
    private int a;

    public BGABannerScroller(Context context, int i) {
        super(context);
        this.a = 1000;
        this.a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        super.startScroll(i, i2, i3, i4, this.a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.a);
    }
}
