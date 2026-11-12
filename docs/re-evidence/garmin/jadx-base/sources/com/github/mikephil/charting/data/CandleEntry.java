package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"ParcelCreator"})
public class CandleEntry extends Entry {
    private float mClose;
    private float mOpen;
    private float mShadowHigh;
    private float mShadowLow;

    public CandleEntry(float f14, float f15, float f16, float f17, float f18) {
        super(f14, (f15 + f16) / 2.0f);
        this.mShadowHigh = f15;
        this.mShadowLow = f16;
        this.mOpen = f17;
        this.mClose = f18;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public CandleEntry copy() {
        return new CandleEntry(getX(), this.mShadowHigh, this.mShadowLow, this.mOpen, this.mClose, getData());
    }

    public float getBodyRange() {
        return Math.abs(this.mOpen - this.mClose);
    }

    public float getClose() {
        return this.mClose;
    }

    public float getHigh() {
        return this.mShadowHigh;
    }

    public float getLow() {
        return this.mShadowLow;
    }

    public float getOpen() {
        return this.mOpen;
    }

    public float getShadowRange() {
        return Math.abs(this.mShadowHigh - this.mShadowLow);
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public float getY() {
        return super.getY();
    }

    public void setClose(float f14) {
        this.mClose = f14;
    }

    public void setHigh(float f14) {
        this.mShadowHigh = f14;
    }

    public void setLow(float f14) {
        this.mShadowLow = f14;
    }

    public void setOpen(float f14) {
        this.mOpen = f14;
    }

    public CandleEntry(float f14, float f15, float f16, float f17, float f18, Object obj) {
        super(f14, (f15 + f16) / 2.0f, obj);
        this.mShadowHigh = f15;
        this.mShadowLow = f16;
        this.mOpen = f17;
        this.mClose = f18;
    }

    public CandleEntry(float f14, float f15, float f16, float f17, float f18, Drawable drawable) {
        super(f14, (f15 + f16) / 2.0f, drawable);
        this.mShadowHigh = f15;
        this.mShadowLow = f16;
        this.mOpen = f17;
        this.mClose = f18;
    }

    public CandleEntry(float f14, float f15, float f16, float f17, float f18, Drawable drawable, Object obj) {
        super(f14, (f15 + f16) / 2.0f, drawable, obj);
        this.mShadowHigh = f15;
        this.mShadowLow = f16;
        this.mOpen = f17;
        this.mClose = f18;
    }
}
