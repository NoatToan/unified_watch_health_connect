package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7799b;
    public float c;
    public float d;

    public CandleEntry(float f, float f2, float f3, float f4, float f5, Object obj) {
        super(f, (f2 + f3) / 2.0f, obj);
        this.f7798a = f2;
        this.f7799b = f3;
        this.d = f4;
        this.c = f5;
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CandleEntry copy() {
        return new CandleEntry(getX(), this.f7798a, this.f7799b, this.d, this.c, getData());
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.f7798a;
    }

    public float e() {
        return this.f7799b;
    }

    @Override // defpackage.j72
    public float getY() {
        return super.getY();
    }

    public float h() {
        return this.d;
    }
}
