package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;

/* JADX INFO: loaded from: classes2.dex */
public class Mask {
    private final MaskMode a;
    private final AnimatableShapeValue b;
    private final AnimatableIntegerValue c;
    private final boolean d;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, AnimatableShapeValue animatableShapeValue, AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.a = maskMode;
        this.b = animatableShapeValue;
        this.c = animatableIntegerValue;
        this.d = z;
    }

    public MaskMode getMaskMode() {
        return this.a;
    }

    public AnimatableShapeValue getMaskPath() {
        return this.b;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.c;
    }

    public boolean isInverted() {
        return this.d;
    }
}
