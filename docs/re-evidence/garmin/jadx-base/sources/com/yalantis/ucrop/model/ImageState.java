package com.yalantis.ucrop.model;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class ImageState {
    private RectF mCropRect;
    private float mCurrentAngle;
    private RectF mCurrentImageRect;
    private float mCurrentScale;

    public ImageState(RectF rectF, RectF rectF2, float f14, float f15) {
        this.mCropRect = rectF;
        this.mCurrentImageRect = rectF2;
        this.mCurrentScale = f14;
        this.mCurrentAngle = f15;
    }

    public RectF getCropRect() {
        return this.mCropRect;
    }

    public float getCurrentAngle() {
        return this.mCurrentAngle;
    }

    public RectF getCurrentImageRect() {
        return this.mCurrentImageRect;
    }

    public float getCurrentScale() {
        return this.mCurrentScale;
    }
}
