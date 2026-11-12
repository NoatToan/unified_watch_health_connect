package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class ForegroundToBackgroundTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    public void onTransform(View view, float f) {
        float height = view.getHeight();
        float width = view.getWidth();
        float fMin = ABaseTransformer.min(f <= 0.0f ? Math.abs(1.0f + f) : 1.0f, 0.5f);
        view.setScaleX(fMin);
        view.setScaleY(fMin);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height * 0.5f);
        view.setTranslationX(f > 0.0f ? width * f : (-width) * f * 0.25f);
    }
}
