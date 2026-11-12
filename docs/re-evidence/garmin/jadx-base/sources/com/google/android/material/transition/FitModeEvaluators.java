package com.google.android.material.transition;

import am.j;
import android.graphics.RectF;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f14, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f14;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f14, float f15, float f16, float f17, float f18, float f19, float f22) {
            float fLerp = TransitionUtils.lerp(f17, f19, f15, f16, f14, true);
            float f24 = fLerp / f17;
            float f25 = fLerp / f19;
            return new FitModeResult(f24, f25, fLerp, f18 * f24, fLerp, f22 * f25);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartHeight > fitModeResult.currentEndHeight;
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        public void applyMask(RectF rectF, float f14, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f14;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public FitModeResult evaluate(float f14, float f15, float f16, float f17, float f18, float f19, float f22) {
            float fLerp = TransitionUtils.lerp(f18, f22, f15, f16, f14, true);
            float f24 = fLerp / f18;
            float f25 = fLerp / f22;
            return new FitModeResult(f24, f25, f17 * f24, fLerp, f19 * f25, fLerp);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }
    };

    private FitModeEvaluators() {
    }

    public static FitModeEvaluator get(int i14, boolean z14, RectF rectF, RectF rectF2) {
        if (i14 == 0) {
            return shouldAutoFitToWidth(z14, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i14 == 1) {
            return WIDTH;
        }
        if (i14 == 2) {
            return HEIGHT;
        }
        h.s(j.h(i14, "Invalid fit mode: "));
        return null;
    }

    private static boolean shouldAutoFitToWidth(boolean z14, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f14 = (fHeight2 * fWidth) / fWidth2;
        float f15 = (fWidth2 * fHeight) / fWidth;
        if (z14) {
            return f14 >= fHeight;
        }
        return f15 >= fHeight2;
    }
}
