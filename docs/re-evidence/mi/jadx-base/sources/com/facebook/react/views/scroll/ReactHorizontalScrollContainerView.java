package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import defpackage.poc;

/* JADX INFO: loaded from: classes4.dex */
public class ReactHorizontalScrollContainerView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7536b;

    public ReactHorizontalScrollContainerView(Context context) {
        super(context);
        this.f7535a = poc.d().g(context) ? 1 : 0;
        this.f7536b = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f7535a == 1) {
            setLeft(0);
            setRight(i3 - i);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.f7536b, horizontalScrollView.getScrollY());
        }
        this.f7536b = getWidth();
    }
}
