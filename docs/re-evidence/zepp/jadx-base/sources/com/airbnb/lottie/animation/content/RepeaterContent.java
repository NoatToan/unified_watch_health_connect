package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class RepeaterContent implements DrawingContent, b, a, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final LottieDrawable c;
    private final BaseLayer d;
    private final String e;
    private final boolean f;
    private final BaseKeyframeAnimation<Float, Float> g;
    private final BaseKeyframeAnimation<Float, Float> h;
    private final TransformKeyframeAnimation i;
    private ContentGroup j;

    public RepeaterContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Repeater repeater) {
        this.c = lottieDrawable;
        this.d = baseLayer;
        this.e = repeater.getName();
        this.f = repeater.isHidden();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = repeater.getCopies().createAnimation();
        this.g = baseKeyframeAnimationCreateAnimation;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = repeater.getOffset().createAnimation();
        this.h = baseKeyframeAnimationCreateAnimation2;
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        TransformKeyframeAnimation transformKeyframeAnimationCreateAnimation = repeater.getTransform().createAnimation();
        this.i = transformKeyframeAnimationCreateAnimation;
        transformKeyframeAnimationCreateAnimation.addAnimationsToLayer(baseLayer);
        transformKeyframeAnimationCreateAnimation.addListener(this);
    }

    @Override // com.airbnb.lottie.animation.content.a
    public void absorbContent(ListIterator<Content> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new ContentGroup(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        if (this.i.applyValueCallback(t, lottieValueCallback)) {
            return;
        }
        if (t == LottieProperty.REPEATER_COPIES) {
            this.g.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.REPEATER_OFFSET) {
            this.h.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.g.getValue().floatValue();
        float fFloatValue2 = this.h.getValue().floatValue();
        float fFloatValue3 = this.i.getStartOpacity().getValue().floatValue() / 100.0f;
        float fFloatValue4 = this.i.getEndOpacity().getValue().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.getMatrixForRepeater(f + fFloatValue2));
            this.j.draw(canvas, this.a, (int) (i * MiscUtils.lerp(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.j.getBounds(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.e;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        Path path = this.j.getPath();
        this.b.reset();
        float fFloatValue = this.g.getValue().floatValue();
        float fFloatValue2 = this.h.getValue().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.a.set(this.i.getMatrixForRepeater(i + fFloatValue2));
            this.b.addPath(path, this.a);
        }
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        this.j.setContents(list, list2);
    }
}
