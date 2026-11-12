package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes14.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {
    private final Rect rect;

    public RectEvaluator(Rect rect) {
        this.rect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f14, Rect rect, Rect rect2) {
        int i14 = rect.left;
        int i15 = i14 + ((int) ((rect2.left - i14) * f14));
        int i16 = rect.top;
        int i17 = i16 + ((int) ((rect2.top - i16) * f14));
        int i18 = rect.right;
        int i19 = i18 + ((int) ((rect2.right - i18) * f14));
        int i24 = rect.bottom;
        this.rect.set(i15, i17, i19, i24 + ((int) ((rect2.bottom - i24) * f14)));
        return this.rect;
    }
}
