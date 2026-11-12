package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowEffect {
    private final AnimatableColorValue a;
    private final AnimatableFloatValue b;
    private final AnimatableFloatValue c;
    private final AnimatableFloatValue d;
    private final AnimatableFloatValue e;

    public DropShadowEffect(AnimatableColorValue animatableColorValue, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4) {
        this.a = animatableColorValue;
        this.b = animatableFloatValue;
        this.c = animatableFloatValue2;
        this.d = animatableFloatValue3;
        this.e = animatableFloatValue4;
    }

    public AnimatableColorValue getColor() {
        return this.a;
    }

    public AnimatableFloatValue getDirection() {
        return this.c;
    }

    public AnimatableFloatValue getDistance() {
        return this.d;
    }

    public AnimatableFloatValue getOpacity() {
        return this.b;
    }

    public AnimatableFloatValue getRadius() {
        return this.e;
    }
}
