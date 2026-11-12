package com.github.mikephil.chartingv2.highlight;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public final class Range {
    public float from;

    /* JADX INFO: renamed from: to, reason: collision with root package name */
    public float f52830to;

    public Range(float f14, float f15) {
        this.from = f14;
        this.f52830to = f15;
    }

    public boolean contains(float f14) {
        return f14 > this.from && f14 <= this.f52830to;
    }

    public boolean isLarger(float f14) {
        return f14 > this.f52830to;
    }

    public boolean isSmaller(float f14) {
        return f14 < this.from;
    }
}
