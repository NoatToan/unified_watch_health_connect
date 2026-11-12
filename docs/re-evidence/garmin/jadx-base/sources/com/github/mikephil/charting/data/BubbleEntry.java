package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"ParcelCreator"})
public class BubbleEntry extends Entry {
    private float mSize;

    public BubbleEntry(float f14, float f15, float f16) {
        super(f14, f15);
        this.mSize = f16;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public BubbleEntry copy() {
        return new BubbleEntry(getX(), getY(), this.mSize, getData());
    }

    public float getSize() {
        return this.mSize;
    }

    public void setSize(float f14) {
        this.mSize = f14;
    }

    public BubbleEntry(float f14, float f15, float f16, Object obj) {
        super(f14, f15, obj);
        this.mSize = f16;
    }

    public BubbleEntry(float f14, float f15, float f16, Drawable drawable) {
        super(f14, f15, drawable);
        this.mSize = f16;
    }

    public BubbleEntry(float f14, float f15, float f16, Drawable drawable, Object obj) {
        super(f14, f15, drawable, obj);
        this.mSize = f16;
    }
}
