package com.huawei.uikit.hwcolumnsystem.widget;

import defpackage.xef;

/* JADX INFO: loaded from: classes20.dex */
public abstract class akxao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f29347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float f29348c;
    protected float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public boolean l;

    public abstract float a(int i);

    public void a(int i, int i2, float f, boolean z) {
        this.f29346a = i;
        this.f29347b = i2;
        this.f29348c = f;
        this.l = z;
    }

    public abstract int b();

    public void b(int i) {
        this.k = i;
    }

    public abstract int c();

    public void c(int i) {
        this.g = i;
    }

    public abstract int d();

    public abstract void e();

    public void a(xef xefVar, int i, boolean z) {
        this.l = z;
        this.e = xefVar.c();
        this.f = xefVar.b();
        this.g = xefVar.d();
        this.h = xefVar.a();
        this.i = i;
        e();
    }

    public int a() {
        return this.k;
    }
}
