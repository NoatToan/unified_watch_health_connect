package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.EllipseContent;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes2.dex */
public class CircleShape implements ContentModel {
    private final String a;
    private final AnimatableValue<PointF, PointF> b;
    private final AnimatablePointValue c;
    private final boolean d;
    private final boolean e;

    public CircleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, boolean z, boolean z2) {
        this.a = str;
        this.b = animatableValue;
        this.c = animatablePointValue;
        this.d = z;
        this.e = z2;
    }

    public String getName() {
        return this.a;
    }

    public AnimatableValue<PointF, PointF> getPosition() {
        return this.b;
    }

    public AnimatablePointValue getSize() {
        return this.c;
    }

    public boolean isHidden() {
        return this.e;
    }

    public boolean isReversed() {
        return this.d;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new EllipseContent(lottieDrawable, baseLayer, this);
    }
}
