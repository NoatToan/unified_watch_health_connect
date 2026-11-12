package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class ZoomOutSlideTransformer extends ABaseTransformer {
    private static final float a = 0.85f;
    private static final float b = 0.5f;

    @Override // com.youth.banner.transformer.ABaseTransformer
    public void onTransform(View view, float f) {
        if (f >= -1.0f || f <= 1.0f) {
            float height = view.getHeight();
            float width = view.getWidth();
            float fMax = Math.max(a, 1.0f - Math.abs(f));
            float f2 = 1.0f - fMax;
            float f3 = (height * f2) / 2.0f;
            float f4 = (f2 * width) / 2.0f;
            view.setPivotY(height * 0.5f);
            view.setPivotX(width * 0.5f);
            if (f < 0.0f) {
                view.setTranslationX(f4 - (f3 / 2.0f));
            } else {
                view.setTranslationX((-f4) + (f3 / 2.0f));
            }
            view.setScaleX(fMax);
            view.setScaleY(fMax);
            view.setAlpha((((fMax - a) / 0.14999998f) * 0.5f) + 0.5f);
        }
    }
}
