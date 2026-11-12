package com.airbnb.lottie.model.content;

import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ShapeContent;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.layer.BaseLayer;
import ds.e0;

/* JADX INFO: loaded from: classes7.dex */
public class ShapePath implements ContentModel {
    private final boolean hidden;
    private final int index;
    private final String name;
    private final AnimatableShapeValue shapePath;

    public ShapePath(String str, int i14, AnimatableShapeValue animatableShapeValue, boolean z14) {
        this.name = str;
        this.index = i14;
        this.shapePath = animatableShapeValue;
        this.hidden = z14;
    }

    public String getName() {
        return this.name;
    }

    public AnimatableShapeValue getShapePath() {
        return this.shapePath;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public Content toContent(LottieDrawable lottieDrawable, LottieComposition lottieComposition, BaseLayer baseLayer) {
        return new ShapeContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("ShapePath{name=");
        sb3.append(this.name);
        sb3.append(", index=");
        return e0.j(sb3, this.index, CoreConstants.CURLY_RIGHT);
    }
}
