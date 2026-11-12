package com.amap.api.mapcore.util;

import com.amap.api.maps.model.BitmapDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class w {
    private BitmapDescriptor b;
    private int c;
    private float d;
    private float e = 0.0f;
    private float f = 0.0f;
    private float g = 1.0f;
    private float h = 1.0f;
    private boolean i = false;
    private float j = 0.0f;
    private float k = 0.0f;
    private float l = 0.0f;
    private float m = 0.0f;
    private int n = 0;
    private String a = ej.a();

    public w(BitmapDescriptor bitmapDescriptor, int i) {
        this.d = 1.0f;
        this.b = bitmapDescriptor;
        this.c = i;
        BitmapDescriptor bitmapDescriptor2 = this.b;
        if (bitmapDescriptor2 != null) {
            this.d = (float) ((((double) bitmapDescriptor2.getWidth()) * 1.0d) / ((double) this.b.getHeight()));
        }
    }

    public final boolean a() {
        return this.i;
    }

    public final void b() {
        this.i = true;
    }

    public final float c() {
        return this.l;
    }

    public final float d() {
        return this.m;
    }

    public final float e() {
        return this.j;
    }

    public final float f() {
        return this.k;
    }

    public final float g() {
        return this.f;
    }

    public final float h() {
        return this.e;
    }

    public final float i() {
        return this.g;
    }

    public final float j() {
        return this.h;
    }

    public final BitmapDescriptor k() {
        return this.b;
    }

    public final int l() {
        return this.c;
    }

    public final float m() {
        return this.d;
    }

    public final void n() {
        this.n++;
    }

    public final void o() {
        this.n--;
    }

    public final int p() {
        return this.n;
    }

    public final String q() {
        return this.a;
    }

    public final void a(float f) {
        this.l = f;
    }

    public final void b(float f) {
        this.m = f;
    }

    public final void c(float f) {
        this.j = f;
    }

    public final void d(float f) {
        this.k = f;
    }

    public final void e(float f) {
        this.f = f;
    }

    public final void f(float f) {
        this.e = f;
    }

    public final void g(float f) {
        this.g = f;
    }

    public final void h(float f) {
        this.h = f;
    }

    public final void a(int i) {
        this.c = i;
    }
}
