package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientStrokeContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GradientStroke implements ContentModel {
    private final String a;
    private final GradientType b;
    private final AnimatableGradientColorValue c;
    private final AnimatableIntegerValue d;
    private final AnimatablePointValue e;
    private final AnimatablePointValue f;
    private final AnimatableFloatValue g;
    private final ShapeStroke.LineCapType h;
    private final ShapeStroke.LineJoinType i;
    private final float j;
    private final List<AnimatableFloatValue> k;

    @Nullable
    private final AnimatableFloatValue l;
    private final boolean m;

    public GradientStroke(String str, GradientType gradientType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<AnimatableFloatValue> list, @Nullable AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.c = animatableGradientColorValue;
        this.d = animatableIntegerValue;
        this.e = animatablePointValue;
        this.f = animatablePointValue2;
        this.g = animatableFloatValue;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f;
        this.k = list;
        this.l = animatableFloatValue2;
        this.m = z;
    }

    public ShapeStroke.LineCapType getCapType() {
        return this.h;
    }

    @Nullable
    public AnimatableFloatValue getDashOffset() {
        return this.l;
    }

    public AnimatablePointValue getEndPoint() {
        return this.f;
    }

    public AnimatableGradientColorValue getGradientColor() {
        return this.c;
    }

    public GradientType getGradientType() {
        return this.b;
    }

    public ShapeStroke.LineJoinType getJoinType() {
        return this.i;
    }

    public List<AnimatableFloatValue> getLineDashPattern() {
        return this.k;
    }

    public float getMiterLimit() {
        return this.j;
    }

    public String getName() {
        return this.a;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.d;
    }

    public AnimatablePointValue getStartPoint() {
        return this.e;
    }

    public AnimatableFloatValue getWidth() {
        return this.g;
    }

    public boolean isHidden() {
        return this.m;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new GradientStrokeContent(lottieDrawable, baseLayer, this);
    }
}
