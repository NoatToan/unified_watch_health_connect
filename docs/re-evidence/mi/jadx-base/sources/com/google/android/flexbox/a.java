package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f8490k;
    public int l;
    public int m;
    public int o;
    public int p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8491r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8488a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8489b = Integer.MAX_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public List<Integer> n = new ArrayList();

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.h - this.i;
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f8488a = Math.min(this.f8488a, (view.getLeft() - flexItem.n0()) - i);
        this.f8489b = Math.min(this.f8489b, (view.getTop() - flexItem.s()) - i2);
        this.c = Math.max(this.c, view.getRight() + flexItem.r0() + i3);
        this.d = Math.max(this.d, view.getBottom() + flexItem.D() + i4);
    }
}
