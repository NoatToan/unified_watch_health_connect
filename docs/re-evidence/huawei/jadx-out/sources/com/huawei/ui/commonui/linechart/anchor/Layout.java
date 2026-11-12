package com.huawei.ui.commonui.linechart.anchor;

import android.content.Context;
import defpackage.qln;

/* JADX INFO: loaded from: classes16.dex */
public class Layout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f23587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23589c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h = false;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public float s;
    public float t;
    public float u;
    float v;
    public float w;
    public float x;
    public float y;
    private Context z;

    public Layout(Context context) {
        this.z = context;
    }

    public qln e(float f, float f2, float f3) {
        float f4 = this.l;
        float f5 = this.f23589c;
        float f6 = this.d;
        float f7 = this.m;
        float f8 = this.o;
        float f9 = this.q;
        float f10 = this.p;
        float f11 = this.k;
        float f12 = this.f;
        float f13 = this.f23587a;
        float f14 = this.n;
        float f15 = this.u + f14 + this.y + this.g + this.w + this.x + this.s;
        float f16 = f14 + this.r + this.t;
        if (f16 > f15) {
            f15 = f16;
        }
        this.f23588b = f - (((((f4 + f5) + f6) + f7) + f8) + f9);
        this.e = f2 - ((((f10 + f11) + f12) + f13) + f15);
        return new qln(this.z, this);
    }

    public Layout b(float f, float f2) {
        this.j = f;
        this.i = f2;
        return this;
    }

    public Layout j(float f) {
        this.k = f;
        return this;
    }

    public Layout c(float f) {
        this.f23587a = f;
        return this;
    }

    public Layout b(float f) {
        this.d = f;
        return this;
    }

    public Layout a(float f) {
        this.f23589c = f;
        return this;
    }

    public Layout i(float f) {
        this.o = f;
        return this;
    }

    public Layout h(float f) {
        this.m = f;
        return this;
    }

    public Layout m(float f) {
        this.u = f;
        return this;
    }

    public Layout l(float f) {
        this.y = f;
        return this;
    }

    public Layout e(float f) {
        this.g = f;
        return this;
    }

    public Layout d(boolean z) {
        this.h = z;
        return this;
    }

    public float h() {
        return this.u;
    }

    public float f() {
        return this.y;
    }

    public float b() {
        return this.g;
    }

    public float e() {
        return this.d;
    }

    public float a() {
        return this.o;
    }

    public Layout d(float f) {
        this.f = f;
        return this;
    }

    public Layout k(float f) {
        this.w = f;
        return this;
    }

    public Layout n(float f) {
        this.x = f;
        return this;
    }

    public Layout o(float f) {
        this.s = f;
        return this;
    }

    public Layout g(float f) {
        this.t = f;
        return this;
    }

    public float i() {
        return this.w;
    }

    public float g() {
        return this.x;
    }

    public float c() {
        return this.s;
    }

    public float d() {
        return this.t;
    }

    public Layout f(float f) {
        this.r = f;
        return this;
    }

    public Layout r(float f) {
        this.v = f;
        return this;
    }

    public float j() {
        return this.v;
    }

    public Layout c(int i) {
        this.l = i;
        return this;
    }

    public Layout e(int i) {
        this.q = i;
        return this;
    }

    public Layout a(int i) {
        this.p = i;
        return this;
    }

    public Layout b(int i) {
        this.n = i;
        return this;
    }
}
