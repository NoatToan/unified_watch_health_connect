package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.TrimPathContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeTrimPath implements ContentModel {
    private final String a;
    private final Type b;
    private final AnimatableFloatValue c;
    private final AnimatableFloatValue d;
    private final AnimatableFloatValue e;
    private final boolean f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public ShapeTrimPath(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.a = str;
        this.b = type;
        this.c = animatableFloatValue;
        this.d = animatableFloatValue2;
        this.e = animatableFloatValue3;
        this.f = z;
    }

    public AnimatableFloatValue getEnd() {
        return this.d;
    }

    public String getName() {
        return this.a;
    }

    public AnimatableFloatValue getOffset() {
        return this.e;
    }

    public AnimatableFloatValue getStart() {
        return this.c;
    }

    public Type getType() {
        return this.b;
    }

    public boolean isHidden() {
        return this.f;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new TrimPathContent(baseLayer, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + i.d;
    }
}
