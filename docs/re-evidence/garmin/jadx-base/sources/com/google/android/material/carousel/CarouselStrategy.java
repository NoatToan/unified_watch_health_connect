package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes14.dex */
public abstract class CarouselStrategy {
    private float smallSizeMax;
    private float smallSizeMin;

    public static int[] doubleCounts(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr2[i14] = iArr[i14] * 2;
        }
        return iArr2;
    }

    public static float getChildMaskPercentage(float f14, float f15, float f16) {
        return 1.0f - ((f14 - f16) / (f15 - f16));
    }

    public float getSmallItemSizeMax() {
        return this.smallSizeMax;
    }

    public float getSmallItemSizeMin() {
        return this.smallSizeMin;
    }

    public void initialize(Context context) {
        float smallSizeMin = this.smallSizeMin;
        if (smallSizeMin <= 0.0f) {
            smallSizeMin = CarouselStrategyHelper.getSmallSizeMin(context);
        }
        this.smallSizeMin = smallSizeMin;
        float smallSizeMax = this.smallSizeMax;
        if (smallSizeMax <= 0.0f) {
            smallSizeMax = CarouselStrategyHelper.getSmallSizeMax(context);
        }
        this.smallSizeMax = smallSizeMax;
    }

    public boolean isContained() {
        return true;
    }

    public abstract KeylineState onFirstChildMeasuredWithMargins(Carousel carousel, View view2);

    public void setSmallItemSizeMax(float f14) {
        this.smallSizeMax = f14;
    }

    public void setSmallItemSizeMin(float f14) {
        this.smallSizeMin = f14;
    }

    public boolean shouldRefreshKeylineState(Carousel carousel, int i14) {
        return false;
    }
}
