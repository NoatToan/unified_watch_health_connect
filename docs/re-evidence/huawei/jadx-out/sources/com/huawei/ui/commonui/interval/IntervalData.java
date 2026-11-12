package com.huawei.ui.commonui.interval;

import android.content.Context;
import defpackage.qlm;
import defpackage.qlq;
import defpackage.qre;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23580c;
    private qlm d;
    private float e;
    private RoundCornerType f;
    private int g;
    private float h;
    private int i;
    private int j;
    private float k;
    private int l;
    private qlq m;
    private int n;
    private int o;

    public enum RoundCornerType {
        EDGE_START,
        EDGE_END
    }

    public int d(Context context) {
        int i = this.f23578a;
        return i == 0 ? qre.e(context, this.f23580c) : i;
    }

    public void c(int i) {
        this.f23580c = i;
    }

    public float i() {
        return this.k;
    }

    public void d(float f) {
        this.k = f;
    }

    public float a() {
        return this.f23579b;
    }

    public void c(float f) {
        this.f23579b = f;
    }

    public float c() {
        float f = this.e;
        return f <= 0.0f ? qre.a(this.i) : f;
    }

    public void e(float f) {
        this.e = f;
    }

    public float e() {
        float f = this.h;
        return f <= 0.0f ? qre.a(this.l) : f;
    }

    public void a(float f) {
        this.h = f;
    }

    public int c(Context context) {
        int i = this.o;
        return i == 0 ? qre.e(context, this.n) : i;
    }

    public void a(int i) {
        this.o = i;
    }

    public void d(int i) {
        this.n = i;
    }

    public int b(Context context) {
        int i = this.g;
        return i == 0 ? qre.e(context, this.j) : i;
    }

    public void e(int i) {
        this.g = i;
    }

    public void b(int i) {
        this.j = i;
    }

    public RoundCornerType d() {
        return this.f;
    }

    public void d(RoundCornerType roundCornerType) {
        this.f = roundCornerType;
    }

    public qlm b() {
        return this.d;
    }

    public void e(qlm qlmVar) {
        this.d = qlmVar;
    }

    public qlq f() {
        return this.m;
    }

    public void b(qlq qlqVar) {
        this.m = qlqVar;
    }

    public String toString() {
        return "IntervalData{mColor=" + this.f23578a + ", mColorId=" + this.f23580c + ", mWidth=" + this.k + ", mHeight=" + this.f23579b + ", mRoundCornerRadius=" + this.e + ", mRoundCornerRadiusId=" + this.i + ", mShadowHeight=" + this.h + ", mShadowHeightId=" + this.l + ", mShadowStartColor=" + this.o + ", mShadowStartColorId=" + this.n + ", mShadowEndColor=" + this.g + ", mShadowEndColorId=" + this.j + ", mRoundCornerType=" + this.f + ", mCursorData=" + this.d + ", mTextData=" + this.m + '}';
    }
}
