package com.google.android.material.internal;

/* JADX INFO: loaded from: classes14.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
    }

    public static void calculateFadeOutAndInAlphas(float f14, float[] fArr) {
        if (f14 <= THRESHOLD_ALPHA) {
            fArr[0] = 1.0f - (f14 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f14 * 2.0f) - 1.0f;
        }
    }
}
