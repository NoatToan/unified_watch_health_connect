package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ParcelCreator"})
public class RadarEntry extends Entry {
    public RadarEntry(float f, Object obj) {
        super(0.0f, f, obj);
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RadarEntry copy() {
        return new RadarEntry(getY(), getData());
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float getX() {
        return super.getX();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void setX(float f) {
        super.setX(f);
    }
}
