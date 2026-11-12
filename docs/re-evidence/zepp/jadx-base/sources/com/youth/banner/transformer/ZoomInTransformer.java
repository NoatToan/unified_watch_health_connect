package com.youth.banner.transformer;

import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class ZoomInTransformer extends ABaseTransformer {
    @Override // com.youth.banner.transformer.ABaseTransformer
    public void onTransform(View view, float f) {
        float f2 = 0.0f;
        float fAbs = f < 0.0f ? f + 1.0f : Math.abs(1.0f - f);
        view.setScaleX(fAbs);
        view.setScaleY(fAbs);
        view.setPivotX(view.getWidth() * 0.5f);
        view.setPivotY(view.getHeight() * 0.5f);
        if (f >= -1.0f && f <= 1.0f) {
            f2 = 1.0f - (fAbs - 1.0f);
        }
        view.setAlpha(f2);
    }
}
