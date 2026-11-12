package com.github.mikephil.chartingv2.data;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CandleEntry extends Entry {
    private float mClose;
    private float mOpen;
    private float mShadowHigh;
    private float mShadowLow;

    public CandleEntry(int i14, float f14, float f15, float f16, float f17) {
        super((f14 + f15) / 2.0f, i14);
        this.mShadowHigh = f14;
        this.mShadowLow = f15;
        this.mOpen = f16;
        this.mClose = f17;
    }

    @Override // com.github.mikephil.chartingv2.data.Entry
    public CandleEntry copy() {
        return new CandleEntry(getXIndex(), this.mShadowHigh, this.mShadowLow, this.mOpen, this.mClose, getData());
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

    @Override // com.github.mikephil.chartingv2.data.Entry
    public float getVal() {
        return super.getVal();
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

    public CandleEntry(int i14, float f14, float f15, float f16, float f17, Object obj) {
        super((f14 + f15) / 2.0f, i14, obj);
        this.mShadowHigh = f14;
        this.mShadowLow = f15;
        this.mOpen = f16;
        this.mClose = f17;
    }
}
