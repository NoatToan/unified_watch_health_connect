package com.google.android.material.transition;

import am.j;
import j20.x;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
class FadeModeEvaluators {
    private static final FadeModeEvaluator IN = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f14, float f15, float f16, float f17) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f15, f16, f14));
        }
    };
    private static final FadeModeEvaluator OUT = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f14, float f15, float f16, float f17) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f15, f16, f14), 255);
        }
    };
    private static final FadeModeEvaluator CROSS = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f14, float f15, float f16, float f17) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f15, f16, f14), TransitionUtils.lerp(0, 255, f15, f16, f14));
        }
    };
    private static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        public FadeModeResult evaluate(float f14, float f15, float f16, float f17) {
            float fA = x.a(f16, f15, f17, f15);
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f15, fA, f14), TransitionUtils.lerp(0, 255, fA, f16, f14));
        }
    };

    private FadeModeEvaluators() {
    }

    public static FadeModeEvaluator get(int i14, boolean z14) {
        if (i14 == 0) {
            return z14 ? IN : OUT;
        }
        if (i14 == 1) {
            return z14 ? OUT : IN;
        }
        if (i14 == 2) {
            return CROSS;
        }
        if (i14 == 3) {
            return THROUGH;
        }
        h.s(j.h(i14, "Invalid fade mode: "));
        return null;
    }
}
