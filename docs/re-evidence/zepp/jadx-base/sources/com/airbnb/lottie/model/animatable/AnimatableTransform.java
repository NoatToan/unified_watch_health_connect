package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatableTransform implements ModifierContent, ContentModel {

    @Nullable
    private final AnimatablePathValue a;

    @Nullable
    private final AnimatableValue<PointF, PointF> b;

    @Nullable
    private final AnimatableScaleValue c;

    @Nullable
    private final AnimatableFloatValue d;

    @Nullable
    private final AnimatableIntegerValue e;

    @Nullable
    private final AnimatableFloatValue f;

    @Nullable
    private final AnimatableFloatValue g;

    @Nullable
    private final AnimatableFloatValue h;

    @Nullable
    private final AnimatableFloatValue i;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public TransformKeyframeAnimation createAnimation() {
        return new TransformKeyframeAnimation(this);
    }

    @Nullable
    public AnimatablePathValue getAnchorPoint() {
        return this.a;
    }

    @Nullable
    public AnimatableFloatValue getEndOpacity() {
        return this.i;
    }

    @Nullable
    public AnimatableIntegerValue getOpacity() {
        return this.e;
    }

    @Nullable
    public AnimatableValue<PointF, PointF> getPosition() {
        return this.b;
    }

    @Nullable
    public AnimatableFloatValue getRotation() {
        return this.d;
    }

    @Nullable
    public AnimatableScaleValue getScale() {
        return this.c;
    }

    @Nullable
    public AnimatableFloatValue getSkew() {
        return this.f;
    }

    @Nullable
    public AnimatableFloatValue getSkewAngle() {
        return this.g;
    }

    @Nullable
    public AnimatableFloatValue getStartOpacity() {
        return this.h;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform(@Nullable AnimatablePathValue animatablePathValue, @Nullable AnimatableValue<PointF, PointF> animatableValue, @Nullable AnimatableScaleValue animatableScaleValue, @Nullable AnimatableFloatValue animatableFloatValue, @Nullable AnimatableIntegerValue animatableIntegerValue, @Nullable AnimatableFloatValue animatableFloatValue2, @Nullable AnimatableFloatValue animatableFloatValue3, @Nullable AnimatableFloatValue animatableFloatValue4, @Nullable AnimatableFloatValue animatableFloatValue5) {
        this.a = animatablePathValue;
        this.b = animatableValue;
        this.c = animatableScaleValue;
        this.d = animatableFloatValue;
        this.e = animatableIntegerValue;
        this.h = animatableFloatValue2;
        this.i = animatableFloatValue3;
        this.f = animatableFloatValue4;
        this.g = animatableFloatValue5;
    }
}
