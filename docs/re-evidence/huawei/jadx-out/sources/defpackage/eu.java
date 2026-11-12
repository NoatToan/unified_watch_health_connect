package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;

/* JADX INFO: loaded from: classes21.dex */
public class eu implements BaseKeyframeAnimation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseKeyframeAnimation.AnimationListener f33489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<Float, Float> f33490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BaseKeyframeAnimation<Integer, Integer> f33491c;
    private boolean d = true;
    private final BaseKeyframeAnimation<Float, Float> e;
    private final BaseKeyframeAnimation<Float, Float> g;
    private final BaseKeyframeAnimation<Float, Float> j;

    public eu(BaseKeyframeAnimation.AnimationListener animationListener, BaseLayer baseLayer, ho hoVar) {
        this.f33489a = animationListener;
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = hoVar.a().createAnimation();
        this.f33491c = baseKeyframeAnimationCreateAnimation;
        baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation2 = hoVar.b().createAnimation();
        this.j = baseKeyframeAnimationCreateAnimation2;
        baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation2);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation3 = hoVar.d().createAnimation();
        this.f33490b = baseKeyframeAnimationCreateAnimation3;
        baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation3);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation4 = hoVar.c().createAnimation();
        this.e = baseKeyframeAnimationCreateAnimation4;
        baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation4);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationCreateAnimation5 = hoVar.e().createAnimation();
        this.g = baseKeyframeAnimationCreateAnimation5;
        baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
        baseLayer.addAnimation(baseKeyframeAnimationCreateAnimation5);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.d = true;
        this.f33489a.onValueChanged();
    }

    public void d(Paint paint) {
        if (this.d) {
            this.d = false;
            double dFloatValue = ((double) this.f33490b.getValue().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.e.getValue().floatValue();
            float fSin = (float) Math.sin(dFloatValue);
            float fCos = (float) Math.cos(dFloatValue + 3.141592653589793d);
            int iIntValue = this.f33491c.getValue().intValue();
            paint.setShadowLayer(this.g.getValue().floatValue(), fSin * fFloatValue, fCos * fFloatValue, Color.argb(Math.round(this.j.getValue().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void c(jf<Integer> jfVar) {
        this.f33491c.setValueCallback(jfVar);
    }

    public void d(final jf<Float> jfVar) {
        if (jfVar == null) {
            this.j.setValueCallback(null);
        } else {
            this.j.setValueCallback(new jf<Float>() { // from class: eu.1
                @Override // defpackage.jf
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Float getValue(ji<Float> jiVar) {
                    Float f = (Float) jfVar.getValue(jiVar);
                    if (f == null) {
                        return null;
                    }
                    return Float.valueOf(f.floatValue() * 2.55f);
                }
            });
        }
    }

    public void b(jf<Float> jfVar) {
        this.f33490b.setValueCallback(jfVar);
    }

    public void a(jf<Float> jfVar) {
        this.e.setValueCallback(jfVar);
    }

    public void e(jf<Float> jfVar) {
        this.g.setValueCallback(jfVar);
    }
}
