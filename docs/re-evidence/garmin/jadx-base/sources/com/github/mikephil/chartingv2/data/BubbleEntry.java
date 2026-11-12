package com.github.mikephil.chartingv2.data;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class BubbleEntry extends Entry {
    private float mSize;

    public BubbleEntry(int i14, float f14, float f15) {
        super(f14, i14);
        this.mSize = f15;
    }

    @Override // com.github.mikephil.chartingv2.data.Entry
    public BubbleEntry copy() {
        return new BubbleEntry(getXIndex(), getVal(), this.mSize, getData());
    }

    public float getSize() {
        return this.mSize;
    }

    public void setSize(float f14) {
        this.mSize = f14;
    }

    public BubbleEntry(int i14, float f14, float f15, Object obj) {
        super(f14, i14, obj);
        this.mSize = f15;
    }
}
