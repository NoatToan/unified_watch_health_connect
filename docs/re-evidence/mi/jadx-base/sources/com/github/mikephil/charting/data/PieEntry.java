package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ParcelCreator"})
public class PieEntry extends Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7801a;

    public PieEntry(float f, String str, Object obj) {
        super(0.0f, f, obj);
        this.f7801a = str;
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PieEntry copy() {
        return new PieEntry(getY(), this.f7801a, getData());
    }

    public String c() {
        return this.f7801a;
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
