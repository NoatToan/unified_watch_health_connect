package com.github.mikephil.charting.highlight;

/* JADX INFO: loaded from: classes13.dex */
public final class Range {
    public float from;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    public float f52821to;

    public Range(float f14, float f15) {
        this.from = f14;
        this.f52821to = f15;
    }

    public boolean contains(float f14) {
        return f14 > this.from && f14 <= this.f52821to;
    }

    public boolean isLarger(float f14) {
        return f14 > this.f52821to;
    }

    public boolean isSmaller(float f14) {
        return f14 < this.from;
    }
}
