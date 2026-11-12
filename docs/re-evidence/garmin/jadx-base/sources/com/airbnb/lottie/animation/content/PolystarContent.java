package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import j20.x;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class PolystarContent implements PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float POLYGON_MAGIC_NUMBER = 0.25f;
    private static final float POLYSTAR_MAGIC_NUMBER = 0.47829f;
    private final boolean hidden;
    private final BaseKeyframeAnimation<?, Float> innerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> innerRoundednessAnimation;
    private boolean isPathValid;
    private final boolean isReversed;
    private final LottieDrawable lottieDrawable;
    private final String name;
    private final BaseKeyframeAnimation<?, Float> outerRadiusAnimation;
    private final BaseKeyframeAnimation<?, Float> outerRoundednessAnimation;
    private final BaseKeyframeAnimation<?, Float> pointsAnimation;
    private final BaseKeyframeAnimation<?, PointF> positionAnimation;
    private final BaseKeyframeAnimation<?, Float> rotationAnimation;
    private final PolystarShape.Type type;
    private final Path path = new Path();
    private final Path lastSegmentPath = new Path();
    private final PathMeasure lastSegmentPathMeasure = new PathMeasure();
    private final float[] lastSegmentPosition = new float[2];
    private final CompoundTrimPathContent trimPaths = new CompoundTrimPathContent();

    /* JADX INFO: renamed from: com.airbnb.lottie.animation.content.PolystarContent$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.lottieDrawable = lottieDrawable;
        this.name = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.type = type;
        this.hidden = polystarShape.isHidden();
        this.isReversed = polystarShape.isReversed();
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = polystarShape.getPoints().createAnimation();
        this.pointsAnimation = floatKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation = polystarShape.getPosition().createAnimation();
        this.positionAnimation = baseKeyframeAnimationCreateAnimation;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = polystarShape.getRotation().createAnimation();
        this.rotationAnimation = floatKeyframeAnimationCreateAnimation2;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation3 = polystarShape.getOuterRadius().createAnimation();
        this.outerRadiusAnimation = floatKeyframeAnimationCreateAnimation3;
        FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation4 = polystarShape.getOuterRoundedness().createAnimation();
        this.outerRoundednessAnimation = floatKeyframeAnimationCreateAnimation4;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.innerRadiusAnimation = polystarShape.getInnerRadius().createAnimation();
            this.innerRoundednessAnimation = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.innerRadiusAnimation = null;
            this.innerRoundednessAnimation = null;
        }
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation3);
        baseLayer.addAnimation(floatKeyframeAnimationCreateAnimation4);
        if (type == type2) {
            baseLayer.addAnimation(this.innerRadiusAnimation);
            baseLayer.addAnimation(this.innerRoundednessAnimation);
        }
        floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        floatKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        if (type == type2) {
            this.innerRadiusAnimation.addUpdateListener(this);
            this.innerRoundednessAnimation.addUpdateListener(this);
        }
    }

    private void createPolygonPath() {
        double d14;
        float f14;
        float f15;
        float f16;
        int iFloor = (int) Math.floor(this.pointsAnimation.getValue().floatValue());
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.rotationAnimation;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d15 = iFloor;
        float fFloatValue = this.outerRoundednessAnimation.getValue().floatValue() / 100.0f;
        float fFloatValue2 = this.outerRadiusAnimation.getValue().floatValue();
        double d16 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d16);
        float fSin = (float) (Math.sin(radians) * d16);
        this.path.moveTo(fCos, fSin);
        double d17 = (float) (6.283185307179586d / d15);
        double dCeil = Math.ceil(d15);
        double d18 = radians + d17;
        int i14 = 0;
        while (true) {
            double d19 = i14;
            if (d19 >= dCeil) {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
            float fCos2 = (float) (Math.cos(d18) * d16);
            float fSin2 = (float) (Math.sin(d18) * d16);
            if (fFloatValue != 0.0f) {
                d14 = dCeil;
                f14 = fFloatValue;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f17 = fFloatValue2 * f14 * POLYGON_MAGIC_NUMBER;
                float f18 = f17 * fCos3;
                float f19 = f17 * fSin3;
                float f22 = fCos4 * f17;
                float f24 = f17 * fSin4;
                if (d19 == d14 - 1.0d) {
                    this.lastSegmentPath.reset();
                    this.lastSegmentPath.moveTo(fCos, fSin);
                    float f25 = fCos - f18;
                    float f26 = fSin - f19;
                    float f27 = fCos2 + f22;
                    float f28 = fSin2 + f24;
                    f15 = fCos2;
                    f16 = fSin2;
                    this.lastSegmentPath.cubicTo(f25, f26, f27, f28, f15, f16);
                    this.lastSegmentPathMeasure.setPath(this.lastSegmentPath, false);
                    PathMeasure pathMeasure = this.lastSegmentPathMeasure;
                    pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.lastSegmentPosition, null);
                    Path path = this.path;
                    float[] fArr = this.lastSegmentPosition;
                    path.cubicTo(f25, f26, f27, f28, fArr[0], fArr[1]);
                } else {
                    f15 = fCos2;
                    f16 = fSin2;
                    this.path.cubicTo(fCos - f18, fSin - f19, f15 + f22, f16 + f24, f15, f16);
                }
                fCos = f15;
                fSin = f16;
            } else {
                fCos = fCos2;
                fSin = fSin2;
                d14 = dCeil;
                f14 = fFloatValue;
                if (d19 != d14 - 1.0d) {
                    this.path.lineTo(fCos, fSin);
                }
                i14++;
                dCeil = d14;
                fFloatValue = f14;
            }
            d18 += d17;
            i14++;
            dCeil = d14;
            fFloatValue = f14;
        }
    }

    private void createStarPath() {
        float f14;
        float f15;
        float fCos;
        float fSin;
        float f16;
        double d14;
        float fA;
        float f17;
        float f18;
        float fFloatValue = this.pointsAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.rotationAnimation;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d15 = fFloatValue;
        float f19 = (float) (6.283185307179586d / d15);
        if (this.isReversed) {
            f19 *= -1.0f;
        }
        float f22 = f19 / 2.0f;
        float f24 = fFloatValue - ((int) fFloatValue);
        if (f24 != 0.0f) {
            radians += (double) ((1.0f - f24) * f22);
        }
        float fFloatValue2 = this.outerRadiusAnimation.getValue().floatValue();
        float fFloatValue3 = this.innerRadiusAnimation.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.innerRoundednessAnimation;
        float fFloatValue4 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.outerRoundednessAnimation;
        float fFloatValue5 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue().floatValue() / 100.0f : 0.0f;
        if (f24 != 0.0f) {
            fA = x.a(fFloatValue2, fFloatValue3, f24, fFloatValue3);
            f15 = 0.0f;
            double d16 = fA;
            f14 = 2.0f;
            float fCos2 = (float) (Math.cos(radians) * d16);
            fSin = (float) (Math.sin(radians) * d16);
            this.path.moveTo(fCos2, fSin);
            d14 = radians + ((double) ((f19 * f24) / 2.0f));
            fCos = fCos2;
            f16 = f22;
        } else {
            f14 = 2.0f;
            f15 = 0.0f;
            double d17 = fFloatValue2;
            fCos = (float) (Math.cos(radians) * d17);
            fSin = (float) (d17 * Math.sin(radians));
            this.path.moveTo(fCos, fSin);
            f16 = f22;
            d14 = radians + ((double) f16);
            fA = 0.0f;
        }
        double dCeil = Math.ceil(d15) * 2.0d;
        int i14 = 0;
        boolean z14 = false;
        double d18 = d14;
        float f25 = fSin;
        float f26 = fCos;
        double d19 = d18;
        while (true) {
            double d24 = i14;
            if (d24 >= dCeil) {
                PointF value = this.positionAnimation.getValue();
                this.path.offset(value.x, value.y);
                this.path.close();
                return;
            }
            float f27 = z14 ? fFloatValue2 : fFloatValue3;
            float f28 = (fA == f15 || d24 != dCeil - 2.0d) ? f16 : (f19 * f24) / f14;
            double d25 = (fA == f15 || d24 != dCeil - 1.0d) ? f27 : fA;
            float fCos3 = (float) (Math.cos(d19) * d25);
            float f29 = f19;
            float fSin2 = (float) (Math.sin(d19) * d25);
            if (fFloatValue4 == f15 && fFloatValue5 == f15) {
                this.path.lineTo(fCos3, fSin2);
                f18 = fCos3;
                f17 = fSin2;
            } else {
                double dAtan2 = (float) (Math.atan2(f25, f26) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                float f34 = f26;
                float f35 = f25;
                f17 = fSin2;
                double dAtan3 = (float) (Math.atan2(fSin2, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin4 = (float) Math.sin(dAtan3);
                float f36 = z14 ? fFloatValue4 : fFloatValue5;
                float f37 = z14 ? fFloatValue5 : fFloatValue4;
                float f38 = z14 ? fFloatValue3 : fFloatValue2;
                float f39 = z14 ? fFloatValue2 : fFloatValue3;
                float f44 = f38 * f36 * POLYSTAR_MAGIC_NUMBER;
                float f45 = fCos4 * f44;
                float f46 = f44 * fSin3;
                float f47 = f39 * f37 * POLYSTAR_MAGIC_NUMBER;
                float f48 = fCos5 * f47;
                float f49 = f47 * fSin4;
                if (f24 != 0.0f) {
                    if (i14 == 0) {
                        f45 *= f24;
                        f46 *= f24;
                    } else if (d24 == dCeil - 1.0d) {
                        f48 *= f24;
                        f49 *= f24;
                    }
                }
                f18 = fCos3;
                this.path.cubicTo(f34 - f45, f35 - f46, fCos3 + f48, f17 + f49, f18, f17);
            }
            d19 += (double) f28;
            z14 = !z14;
            i14++;
            f16 = f16;
            f26 = f18;
            f25 = f17;
            f19 = f29;
        }
    }

    private void invalidate() {
        this.isPathValid = false;
        this.lottieDrawable.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t7, LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t7 == LottieProperty.POLYSTAR_POINTS) {
            this.pointsAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.POLYSTAR_ROTATION) {
            this.rotationAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.POSITION) {
            this.positionAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.innerRadiusAnimation) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.outerRadiusAnimation.setValueCallback(lottieValueCallback);
            return;
        }
        if (t7 == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.innerRoundednessAnimation) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t7 == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.outerRoundednessAnimation.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.name;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        boolean z14 = this.isPathValid;
        Path path = this.path;
        if (z14) {
            return path;
        }
        path.reset();
        if (this.hidden) {
            this.isPathValid = true;
            return this.path;
        }
        int i14 = AnonymousClass1.$SwitchMap$com$airbnb$lottie$model$content$PolystarShape$Type[this.type.ordinal()];
        if (i14 == 1) {
            createStarPath();
        } else if (i14 == 2) {
            createPolygonPath();
        }
        this.path.close();
        this.trimPaths.apply(this.path);
        this.isPathValid = true;
        return this.path;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        invalidate();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i14, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i14, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            Content content = list.get(i14);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.getType() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.trimPaths.addTrimPath(trimPathContent);
                    trimPathContent.addListener(this);
                }
            }
        }
    }
}
