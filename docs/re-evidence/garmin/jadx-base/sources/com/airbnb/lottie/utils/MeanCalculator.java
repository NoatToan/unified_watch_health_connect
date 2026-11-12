package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes7.dex */
public class MeanCalculator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f28251n;
    private float sum;

    public void add(float f14) {
        float f15 = this.sum + f14;
        this.sum = f15;
        int i14 = this.f28251n + 1;
        this.f28251n = i14;
        if (i14 == Integer.MAX_VALUE) {
            this.sum = f15 / 2.0f;
            this.f28251n = i14 / 2;
        }
    }

    public float getMean() {
        int i14 = this.f28251n;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.sum / i14;
    }
}
