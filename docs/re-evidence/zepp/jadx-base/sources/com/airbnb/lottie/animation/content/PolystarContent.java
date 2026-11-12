package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PolystarContent implements b, BaseKeyframeAnimation.AnimationListener, KeyPathElementContent {
    private static final float o = 0.47829f;
    private static final float p = 0.25f;
    private final String b;
    private final LottieDrawable c;
    private final PolystarShape.Type d;
    private final boolean e;
    private final BaseKeyframeAnimation<?, Float> f;
    private final BaseKeyframeAnimation<?, PointF> g;
    private final BaseKeyframeAnimation<?, Float> h;

    @Nullable
    private final BaseKeyframeAnimation<?, Float> i;
    private final BaseKeyframeAnimation<?, Float> j;

    @Nullable
    private final BaseKeyframeAnimation<?, Float> k;
    private final BaseKeyframeAnimation<?, Float> l;
    private boolean n;
    private final Path a = new Path();
    private CompoundTrimPathContent m = new CompoundTrimPathContent();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PolystarContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, PolystarShape polystarShape) {
        this.c = lottieDrawable;
        this.b = polystarShape.getName();
        PolystarShape.Type type = polystarShape.getType();
        this.d = type;
        this.e = polystarShape.isHidden();
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation = polystarShape.getPoints().createAnimation();
        this.f = baseKeyframeAnimationCreateAnimation;
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimationCreateAnimation2 = polystarShape.getPosition().createAnimation();
        this.g = baseKeyframeAnimationCreateAnimation2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = polystarShape.getRotation().createAnimation();
        this.h = baseKeyframeAnimationCreateAnimation3;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation4 = polystarShape.getOuterRadius().createAnimation();
        this.j = baseKeyframeAnimationCreateAnimation4;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation5 = polystarShape.getOuterRoundedness().createAnimation();
        this.l = baseKeyframeAnimationCreateAnimation5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.i = polystarShape.getInnerRadius().createAnimation();
            this.k = polystarShape.getInnerRoundedness().createAnimation();
        } else {
            this.i = null;
            this.k = null;
        }
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation4);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation5);
        if (type == type2) {
            baseLayer.addAnimation(this.i);
            baseLayer.addAnimation(this.k);
        }
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
        if (type == type2) {
            this.i.addUpdateListener(this);
            this.k.addUpdateListener(this);
        }
    }

    private void a() {
        int iFloor = (int) Math.floor(this.f.getValue().floatValue());
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.h;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.l.getValue().floatValue() / 100.0f;
        float fFloatValue2 = this.j.getValue().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d2);
        float fSin = (float) (Math.sin(radians) * d2);
        this.a.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        double dCeil = Math.ceil(d);
        int i = 0;
        while (i < dCeil) {
            float fCos2 = (float) (Math.cos(d4) * d2);
            double d5 = dCeil;
            float fSin2 = (float) (d2 * Math.sin(d4));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.a.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan3)) * f), fSin2 + (f * ((float) Math.sin(dAtan3))), fCos2, fSin2);
            } else {
                this.a.lineTo(fCos2, fSin2);
            }
            d4 += d3;
            i++;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d5;
            d2 = d2;
            d3 = d3;
        }
        PointF value = this.g.getValue();
        this.a.offset(value.x, value.y);
        this.a.close();
    }

    private void b() {
        double d;
        float fCos;
        float fSin;
        float f;
        float f2;
        float fFloatValue = this.f.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.h;
        double radians = Math.toRadians((baseKeyframeAnimation == null ? 0.0d : baseKeyframeAnimation.getValue().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f3 = (float) (6.283185307179586d / d2);
        float f4 = f3 / 2.0f;
        float f5 = fFloatValue - ((int) fFloatValue);
        if (f5 != 0.0f) {
            radians += (double) ((1.0f - f5) * f4);
        }
        float fFloatValue2 = this.j.getValue().floatValue();
        float fFloatValue3 = this.i.getValue().floatValue();
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.k;
        float fFloatValue4 = baseKeyframeAnimation2 != null ? baseKeyframeAnimation2.getValue().floatValue() / 100.0f : 0.0f;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.l;
        float fFloatValue5 = baseKeyframeAnimation3 != null ? baseKeyframeAnimation3.getValue().floatValue() / 100.0f : 0.0f;
        if (f5 != 0.0f) {
            f = ((fFloatValue2 - fFloatValue3) * f5) + fFloatValue3;
            double d3 = f;
            fCos = (float) (d3 * Math.cos(radians));
            fSin = (float) (d3 * Math.sin(radians));
            this.a.moveTo(fCos, fSin);
            d = radians + ((double) ((f3 * f5) / 2.0f));
        } else {
            double d4 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d4);
            float fSin2 = (float) (d4 * Math.sin(radians));
            this.a.moveTo(fCos2, fSin2);
            d = radians + ((double) f4);
            fCos = fCos2;
            fSin = fSin2;
            f = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i = 0;
        boolean z = false;
        while (true) {
            double d5 = i;
            if (d5 >= dCeil) {
                PointF value = this.g.getValue();
                this.a.offset(value.x, value.y);
                this.a.close();
                return;
            }
            float f6 = z ? fFloatValue2 : fFloatValue3;
            float f7 = (f == 0.0f || d5 != dCeil - 2.0d) ? f4 : (f3 * f5) / 2.0f;
            double d6 = (f == 0.0f || d5 != dCeil - 1.0d) ? f6 : f;
            double d7 = dCeil;
            float fCos3 = (float) (d6 * Math.cos(d));
            float fSin3 = (float) (d6 * Math.sin(d));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.a.lineTo(fCos3, fSin3);
                f2 = fFloatValue4;
            } else {
                f2 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin5 = (float) Math.sin(dAtan3);
                float f8 = z ? f2 : fFloatValue5;
                float f9 = z ? fFloatValue5 : f2;
                float f10 = z ? fFloatValue3 : fFloatValue2;
                float f11 = z ? fFloatValue2 : fFloatValue3;
                float f12 = f10 * f8 * o;
                float f13 = fCos4 * f12;
                float f14 = f12 * fSin4;
                float f15 = f11 * f9 * o;
                float f16 = fCos5 * f15;
                float f17 = f15 * fSin5;
                if (f5 != 0.0f) {
                    if (i == 0) {
                        f13 *= f5;
                        f14 *= f5;
                    } else if (d5 == d7 - 1.0d) {
                        f16 *= f5;
                        f17 *= f5;
                    }
                }
                this.a.cubicTo(fCos - f13, fSin - f14, fCos3 + f16, fSin3 + f17, fCos3, fSin3);
            }
            d += (double) f7;
            z = !z;
            i++;
            fCos = fCos3;
            fSin = fSin3;
            fFloatValue4 = f2;
            f = f;
            f4 = f4;
            f3 = f3;
            dCeil = d7;
        }
    }

    private void c() {
        this.n = false;
        this.c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation;
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2;
        if (t == LottieProperty.POLYSTAR_POINTS) {
            this.f.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == LottieProperty.POLYSTAR_ROTATION) {
            this.h.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == LottieProperty.POSITION) {
            this.g.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == LottieProperty.POLYSTAR_INNER_RADIUS && (baseKeyframeAnimation2 = this.i) != null) {
            baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == LottieProperty.POLYSTAR_OUTER_RADIUS) {
            this.j.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == LottieProperty.POLYSTAR_INNER_ROUNDEDNESS && (baseKeyframeAnimation = this.k) != null) {
            baseKeyframeAnimation.setValueCallback(lottieValueCallback);
        } else if (t == LottieProperty.POLYSTAR_OUTER_ROUNDEDNESS) {
            this.l.setValueCallback(lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.b;
    }

    @Override // com.airbnb.lottie.animation.content.b
    public Path getPath() {
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.e) {
            this.n = true;
            return this.a;
        }
        int i = a.a[this.d.ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            a();
        }
        this.a.close();
        this.m.apply(this.a);
        this.n = true;
        return this.a;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        c();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(KeyPath keyPath, int i, List<KeyPath> list, KeyPath keyPath2) {
        MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.b() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.m.a(trimPathContent);
                    trimPathContent.a(this);
                }
            }
        }
    }
}
