package com.google.android.material.transition.platform;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes14.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f14, FitModeResult fitModeResult);

    FitModeResult evaluate(float f14, float f15, float f16, float f17, float f18, float f19, float f22);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
