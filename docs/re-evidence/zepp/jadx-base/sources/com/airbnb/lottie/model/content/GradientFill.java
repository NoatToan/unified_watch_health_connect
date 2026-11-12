package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GradientFillContent;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class GradientFill implements ContentModel {
    private final GradientType a;
    private final Path.FillType b;
    private final AnimatableGradientColorValue c;
    private final AnimatableIntegerValue d;
    private final AnimatablePointValue e;
    private final AnimatablePointValue f;
    private final String g;

    @Nullable
    private final AnimatableFloatValue h;

    @Nullable
    private final AnimatableFloatValue i;
    private final boolean j;

    public GradientFill(String str, GradientType gradientType, Path.FillType fillType, AnimatableGradientColorValue animatableGradientColorValue, AnimatableIntegerValue animatableIntegerValue, AnimatablePointValue animatablePointValue, AnimatablePointValue animatablePointValue2, AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.a = gradientType;
        this.b = fillType;
        this.c = animatableGradientColorValue;
        this.d = animatableIntegerValue;
        this.e = animatablePointValue;
        this.f = animatablePointValue2;
        this.g = str;
        this.h = animatableFloatValue;
        this.i = animatableFloatValue2;
        this.j = z;
    }

    @Nullable
    public AnimatableFloatValue a() {
        return this.i;
    }

    @Nullable
    public AnimatableFloatValue b() {
        return this.h;
    }

    public AnimatablePointValue getEndPoint() {
        return this.f;
    }

    public Path.FillType getFillType() {
        return this.b;
    }

    public AnimatableGradientColorValue getGradientColor() {
        return this.c;
    }

    public GradientType getGradientType() {
        return this.a;
    }

    public String getName() {
        return this.g;
    }

    public AnimatableIntegerValue getOpacity() {
        return this.d;
    }

    public AnimatablePointValue getStartPoint() {
        return this.e;
    }

    public boolean isHidden() {
        return this.j;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new GradientFillContent(lottieDrawable, baseLayer, this);
    }
}
