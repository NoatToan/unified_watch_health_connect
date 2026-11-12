package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.PolystarContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class PolystarShape implements ContentModel {
    private final String a;
    private final Type b;
    private final AnimatableFloatValue c;
    private final AnimatableValue<PointF, PointF> d;
    private final AnimatableFloatValue e;
    private final AnimatableFloatValue f;
    private final AnimatableFloatValue g;
    private final AnimatableFloatValue h;
    private final AnimatableFloatValue i;
    private final boolean j;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, AnimatableFloatValue animatableFloatValue, AnimatableValue<PointF, PointF> animatableValue, AnimatableFloatValue animatableFloatValue2, AnimatableFloatValue animatableFloatValue3, AnimatableFloatValue animatableFloatValue4, AnimatableFloatValue animatableFloatValue5, AnimatableFloatValue animatableFloatValue6, boolean z) {
        this.a = str;
        this.b = type;
        this.c = animatableFloatValue;
        this.d = animatableValue;
        this.e = animatableFloatValue2;
        this.f = animatableFloatValue3;
        this.g = animatableFloatValue4;
        this.h = animatableFloatValue5;
        this.i = animatableFloatValue6;
        this.j = z;
    }

    public AnimatableFloatValue getInnerRadius() {
        return this.f;
    }

    public AnimatableFloatValue getInnerRoundedness() {
        return this.h;
    }

    public String getName() {
        return this.a;
    }

    public AnimatableFloatValue getOuterRadius() {
        return this.g;
    }

    public AnimatableFloatValue getOuterRoundedness() {
        return this.i;
    }

    public AnimatableFloatValue getPoints() {
        return this.c;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.d;
    }

    public AnimatableFloatValue getRotation() {
        return this.e;
    }

    public Type getType() {
        return this.b;
    }

    public boolean isHidden() {
        return this.j;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new PolystarContent(lottieDrawable, baseLayer, this);
    }
}
