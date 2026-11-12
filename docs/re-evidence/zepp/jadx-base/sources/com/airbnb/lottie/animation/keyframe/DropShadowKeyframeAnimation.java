package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;

/* JADX INFO: loaded from: classes2.dex */
public class DropShadowKeyframeAnimation implements BaseKeyframeAnimation.AnimationListener {
    private static final double h = 0.017453292519943295d;
    private final BaseKeyframeAnimation.AnimationListener a;
    private final BaseKeyframeAnimation<Integer, Integer> b;
    private final BaseKeyframeAnimation<Float, Float> c;
    private final BaseKeyframeAnimation<Float, Float> d;
    private final BaseKeyframeAnimation<Float, Float> e;
    private final BaseKeyframeAnimation<Float, Float> f;
    private boolean g = true;

    public class a extends LottieValueCallback<Float> {
        public final /* synthetic */ LottieValueCallback c;

        public a(LottieValueCallback lottieValueCallback) {
            this.c = lottieValueCallback;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.airbnb.lottie.value.LottieValueCallback
        @Nullable
        public Float getValue(LottieFrameInfo<Float> lottieFrameInfo) {
            Float f = (Float) this.c.getValue(lottieFrameInfo);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public DropShadowKeyframeAnimation(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, DropShadowEffect dropShadowEffect) {
        this.a = animationListener;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = dropShadowEffect.getColor().createAnimation();
        this.b = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = dropShadowEffect.getOpacity().createAnimation();
        this.c = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = dropShadowEffect.getDirection().createAnimation();
        this.d = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation4 = dropShadowEffect.getDistance().createAnimation();
        this.e = baseKeyframeAnimationCreateAnimation4;
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation4);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation5 = dropShadowEffect.getRadius().createAnimation();
        this.f = baseKeyframeAnimationCreateAnimation5;
        baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation5);
    }

    public void applyTo(Paint paint) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) this.d.getValue().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.e.getValue().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.b.getValue().intValue();
            paint.setShadowLayer(this.f.getValue().floatValue(), fSin, fCos, Color.argb(Math.round(this.c.getValue().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.g = true;
        this.a.onValueChanged();
    }

    public void setColorCallback(@Nullable LottieValueCallback<Integer> lottieValueCallback) {
        this.b.setValueCallback(lottieValueCallback);
    }

    public void setDirectionCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.d.setValueCallback(lottieValueCallback);
    }

    public void setDistanceCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.e.setValueCallback(lottieValueCallback);
    }

    public void setOpacityCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        if (lottieValueCallback == null) {
            this.c.setValueCallback(null);
        } else {
            this.c.setValueCallback(new a(lottieValueCallback));
        }
    }

    public void setRadiusCallback(@Nullable LottieValueCallback<Float> lottieValueCallback) {
        this.f.setValueCallback(lottieValueCallback);
    }
}
