package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {
    private String label;

    public PieEntry(float f14, String str) {
        super(0.0f, f14);
        this.label = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public PieEntry copy() {
        return new PieEntry(getY(), this.label, getData());
    }

    public String getLabel() {
        return this.label;
    }

    public float getValue() {
        return getY();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float getX() {
        return super.getX();
    }

    public void setLabel(String str) {
        this.label = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void setX(float f14) {
        super.setX(f14);
    }

    public PieEntry(float f14, Object obj) {
        super(0.0f, f14, obj);
    }

    public PieEntry(float f14, Drawable drawable) {
        super(0.0f, f14, drawable);
    }

    public PieEntry(float f14, Drawable drawable, Object obj) {
        super(0.0f, f14, drawable, obj);
    }

    public PieEntry(float f14) {
        super(0.0f, f14);
    }

    public PieEntry(float f14, String str, Object obj) {
        super(0.0f, f14, obj);
        this.label = str;
    }

    public PieEntry(float f14, String str, Drawable drawable) {
        super(0.0f, f14, drawable);
        this.label = str;
    }

    public PieEntry(float f14, String str, Drawable drawable, Object obj) {
        super(0.0f, f14, drawable, obj);
        this.label = str;
    }
}
