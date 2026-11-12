package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseStrokeContent implements BaseKeyframeAnimation.AnimationListener, KeyPathElementContent, DrawingContent {
    private BaseKeyframeAnimation<Float, Float> blurAnimation;
    float blurMaskFilterRadius;
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> colorFilterAnimation;
    private final List<BaseKeyframeAnimation<?, Float>> dashPatternAnimations;
    private final BaseKeyframeAnimation<?, Float> dashPatternOffsetAnimation;
    private final float[] dashPatternValues;
    protected final BaseLayer layer;
    private final LottieDrawable lottieDrawable;
    private final BaseKeyframeAnimation<?, Integer> opacityAnimation;
    final Paint paint;
    private final BaseKeyframeAnimation<?, Float> widthAnimation;

    /* JADX INFO: renamed from: pm, reason: collision with root package name */
    private final PathMeasure f28195pm = new PathMeasure();
    private final Path path = new Path();
    private final Path trimPathPath = new Path();
    private final RectF rect = new RectF();
    private final List<PathGroup> pathGroups = new ArrayList();

    public static final class PathGroup {
        private final List<PathContent> paths;
        private final TrimPathContent trimPath;

        private PathGroup(TrimPathContent trimPathContent) {
            this.paths = new ArrayList();
            this.trimPath = trimPathContent;
        }
    }

    public BaseStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, Paint.Cap cap, Paint.Join join, float f14, AnimatableIntegerValue animatableIntegerValue, AnimatableFloatValue animatableFloatValue, List<AnimatableFloatValue> list, AnimatableFloatValue animatableFloatValue2) {
        LPaint lPaint = new LPaint(1);
        this.paint = lPaint;
        this.blurMaskFilterRadius = 0.0f;
        this.lottieDrawable = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f14);
        this.opacityAnimation = animatableIntegerValue.createAnimation();
        this.widthAnimation = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.dashPatternOffsetAnimation = null;
        } else {
            this.dashPatternOffsetAnimation = animatableFloatValue2.createAnimation();
        }
        this.dashPatternAnimations = new ArrayList(list.size());
        this.dashPatternValues = new float[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.dashPatternAnimations.add(list.get(i14).createAnimation());
        }
        baseLayer.addAnimation(this.opacityAnimation);
        baseLayer.addAnimation(this.widthAnimation);
        for (int i15 = 0; i15 < this.dashPatternAnimations.size(); i15++) {
            baseLayer.addAnimation(this.dashPatternAnimations.get(i15));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.opacityAnimation.addUpdateListener(this);
        this.widthAnimation.addUpdateListener(this);
        for (int i16 = 0; i16 < list.size(); i16++) {
            this.dashPatternAnimations.get(i16).addUpdateListener(this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.dashPatternOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.blurAnimation = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.blurAnimation);
        }
    }

    private void applyDashPatternIfNeeded() {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#applyDashPattern");
        }
        if (this.dashPatternAnimations.isEmpty()) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i14 = 0; i14 < this.dashPatternAnimations.size(); i14++) {
            this.dashPatternValues[i14] = this.dashPatternAnimations.get(i14).getValue().floatValue();
            int i15 = i14 % 2;
            float[] fArr = this.dashPatternValues;
            if (i15 == 0) {
                if (fArr[i14] < 1.0f) {
                    fArr[i14] = 1.0f;
                }
            } else if (fArr[i14] < 0.1f) {
                fArr[i14] = 0.1f;
            }
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.dashPatternOffsetAnimation;
        this.paint.setPathEffect(new DashPathEffect(this.dashPatternValues, baseKeyframeAnimation == null ? 0.0f : baseKeyframeAnimation.getValue().floatValue()));
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    private void applyTrimPath(Canvas canvas, PathGroup pathGroup) {
        float f14;
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#applyTrimPath");
        }
        if (pathGroup.trimPath == null) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.path.reset();
        for (int size = pathGroup.paths.size() - 1; size >= 0; size--) {
            this.path.addPath(((PathContent) pathGroup.paths.get(size)).getPath());
        }
        float fFloatValue = pathGroup.trimPath.getStart().getValue().floatValue() / 100.0f;
        float fFloatValue2 = pathGroup.trimPath.getEnd().getValue().floatValue() / 100.0f;
        float fFloatValue3 = pathGroup.trimPath.getOffset().getValue().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.path, this.paint);
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f28195pm.setPath(this.path, false);
        float length = this.f28195pm.getLength();
        while (this.f28195pm.nextContour()) {
            length += this.f28195pm.getLength();
        }
        float f15 = fFloatValue3 * length;
        float f16 = (fFloatValue * length) + f15;
        float fMin = Math.min((fFloatValue2 * length) + f15, (f16 + length) - 1.0f);
        float f17 = 0.0f;
        for (int size2 = pathGroup.paths.size() - 1; size2 >= 0; size2--) {
            this.trimPathPath.set(((PathContent) pathGroup.paths.get(size2)).getPath());
            this.f28195pm.setPath(this.trimPathPath, false);
            float length2 = this.f28195pm.getLength();
            if (fMin > length) {
                float f18 = fMin - length;
                if (f18 >= f17 + length2 || f17 >= f18) {
                    f14 = f17 + length2;
                    if (f14 < f16 && f17 <= fMin) {
                        if (f14 > fMin || f16 >= f17) {
                            Utils.applyTrimPathIfNeeded(this.trimPathPath, f16 < f17 ? 0.0f : (f16 - f17) / length2, fMin > f14 ? 1.0f : (fMin - f17) / length2, 0.0f);
                            canvas.drawPath(this.trimPathPath, this.paint);
                        } else {
                            canvas.drawPath(this.trimPathPath, this.paint);
                        }
                    }
                } else {
                    Utils.applyTrimPathIfNeeded(this.trimPathPath, f16 > length ? (f16 - length) / length2 : 0.0f, Math.min(f18 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.trimPathPath, this.paint);
                }
            } else {
                f14 = f17 + length2;
                if (f14 < f16) {
                }
            }
            f17 += length2;
        }
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#applyTrimPath");
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t7, LottieValueCallback<T> lottieValueCallback) {
        if (t7 == LottieProperty.OPACITY) {
            this.opacityAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.STROKE_WIDTH) {
            this.widthAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.COLOR_FILTER) {
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorFilterAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorFilterAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.colorFilterAnimation);
            return;
        }
        if (t7 == LottieProperty.BLUR_RADIUS) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.blurAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.blurAnimation);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(Canvas canvas, Matrix matrix, int i14, DropShadow dropShadow) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#draw");
        }
        if (Utils.hasZeroScaleAxis(matrix)) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.opacityAnimation.getValue().intValue() / 100.0f;
        this.paint.setAlpha(MiscUtils.clamp((int) (i14 * fIntValue), 0, 255));
        this.paint.setStrokeWidth(((FloatKeyframeAnimation) this.widthAnimation).getFloatValue());
        if (this.paint.getStrokeWidth() <= 0.0f) {
            if (L.isTraceEnabled()) {
                L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        applyDashPatternIfNeeded();
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.colorFilterAnimation;
        if (baseKeyframeAnimation != null) {
            this.paint.setColorFilter(baseKeyframeAnimation.getValue());
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.blurAnimation;
        if (baseKeyframeAnimation2 != null) {
            float fFloatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (fFloatValue == 0.0f) {
                this.paint.setMaskFilter(null);
            } else if (fFloatValue != this.blurMaskFilterRadius) {
                this.paint.setMaskFilter(this.layer.getBlurMaskFilter(fFloatValue));
            }
            this.blurMaskFilterRadius = fFloatValue;
        }
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (fIntValue * 255.0f), this.paint);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i15 = 0; i15 < this.pathGroups.size(); i15++) {
            PathGroup pathGroup = this.pathGroups.get(i15);
            if (pathGroup.trimPath != null) {
                applyTrimPath(canvas, pathGroup);
            } else {
                if (L.isTraceEnabled()) {
                    L.beginSection("StrokeContent#buildPath");
                }
                this.path.reset();
                for (int size = pathGroup.paths.size() - 1; size >= 0; size--) {
                    this.path.addPath(((PathContent) pathGroup.paths.get(size)).getPath());
                }
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#buildPath");
                    L.beginSection("StrokeContent#drawPath");
                }
                canvas.drawPath(this.path, this.paint);
                if (L.isTraceEnabled()) {
                    L.endSection("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z14) {
        if (L.isTraceEnabled()) {
            L.beginSection("StrokeContent#getBounds");
        }
        this.path.reset();
        for (int i14 = 0; i14 < this.pathGroups.size(); i14++) {
            PathGroup pathGroup = this.pathGroups.get(i14);
            for (int i15 = 0; i15 < pathGroup.paths.size(); i15++) {
                this.path.addPath(((PathContent) pathGroup.paths.get(i15)).getPath(), matrix);
            }
        }
        this.path.computeBounds(this.rect, false);
        float floatValue = ((FloatKeyframeAnimation) this.widthAnimation).getFloatValue();
        RectF rectF2 = this.rect;
        float f14 = floatValue / 2.0f;
        rectF2.set(rectF2.left - f14, rectF2.top - f14, rectF2.right + f14, rectF2.bottom + f14);
        rectF.set(this.rect);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (L.isTraceEnabled()) {
            L.endSection("StrokeContent#getBounds");
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i14, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i14, list, keyPath2, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = list.get(size);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent2 = (TrimPathContent) content;
                if (trimPathContent2.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.addListener(this);
        }
        PathGroup pathGroup = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = list2.get(size2);
            if (content2 instanceof TrimPathContent) {
                TrimPathContent trimPathContent3 = (TrimPathContent) content2;
                if (trimPathContent3.getType() == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (pathGroup != null) {
                        this.pathGroups.add(pathGroup);
                    }
                    pathGroup = new PathGroup(trimPathContent3);
                    trimPathContent3.addListener(this);
                } else if (!(content2 instanceof PathContent)) {
                    if (pathGroup == null) {
                        pathGroup = new PathGroup(trimPathContent);
                    }
                    pathGroup.paths.add((PathContent) content2);
                }
            } else if (!(content2 instanceof PathContent)) {
                if (pathGroup == null) {
                    pathGroup = new PathGroup(trimPathContent);
                }
                pathGroup.paths.add((PathContent) content2);
            }
        }
        if (pathGroup != null) {
            this.pathGroups.add(pathGroup);
        }
    }
}
