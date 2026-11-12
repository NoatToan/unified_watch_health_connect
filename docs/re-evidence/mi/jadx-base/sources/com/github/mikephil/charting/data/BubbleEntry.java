package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ParcelCreator"})
public class BubbleEntry extends Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7797a;

    public BubbleEntry(float f, float f2, float f3, Object obj) {
        super(f, f2, obj);
        this.f7797a = f3;
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BubbleEntry copy() {
        return new BubbleEntry(getX(), getY(), this.f7797a, getData());
    }

    public float c() {
        return this.f7797a;
    }
}
