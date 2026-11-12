package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.layer.BaseLayer;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public class fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseKeyframeAnimation<?, Float> f34153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseKeyframeAnimation<PointF, PointF> f34154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f34155c = new Matrix();
    private BaseKeyframeAnimation<Integer, Integer> d;
    private final boolean e;
    private fd f;
    private fd g;
    private BaseKeyframeAnimation<Float, Float> h;
    private BaseKeyframeAnimation<?, PointF> i;
    private BaseKeyframeAnimation<jj, jj> j;
    private final float[] k;
    private final Matrix l;
    private final Matrix m;
    private final Matrix n;
    private BaseKeyframeAnimation<?, Float> o;

    public fl(gf gfVar) {
        this.f34154b = gfVar.a() == null ? null : gfVar.a().createAnimation();
        this.i = gfVar.c() == null ? null : gfVar.c().createAnimation();
        this.j = gfVar.g() == null ? null : gfVar.g().createAnimation();
        this.h = gfVar.h() == null ? null : gfVar.h().createAnimation();
        this.g = gfVar.i() == null ? null : (fd) gfVar.i().createAnimation();
        this.e = gfVar.o();
        if (this.g != null) {
            this.l = new Matrix();
            this.n = new Matrix();
            this.m = new Matrix();
            this.k = new float[9];
        } else {
            this.l = null;
            this.n = null;
            this.m = null;
            this.k = null;
        }
        this.f = gfVar.f() == null ? null : (fd) gfVar.f().createAnimation();
        if (gfVar.e() != null) {
            this.d = gfVar.e().createAnimation();
        }
        if (gfVar.j() != null) {
            this.o = gfVar.j().createAnimation();
        } else {
            this.o = null;
        }
        if (gfVar.d() != null) {
            this.f34153a = gfVar.d().createAnimation();
        } else {
            this.f34153a = null;
        }
    }

    public void b(BaseLayer baseLayer) {
        baseLayer.addAnimation(this.d);
        baseLayer.addAnimation(this.o);
        baseLayer.addAnimation(this.f34153a);
        baseLayer.addAnimation(this.f34154b);
        baseLayer.addAnimation(this.i);
        baseLayer.addAnimation(this.j);
        baseLayer.addAnimation(this.h);
        baseLayer.addAnimation(this.g);
        baseLayer.addAnimation(this.f);
    }

    public void b(BaseKeyframeAnimation.AnimationListener animationListener) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.d;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.o;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f34153a;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f34154b;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.i;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<jj, jj> baseKeyframeAnimation6 = this.j;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.addUpdateListener(animationListener);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.h;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.addUpdateListener(animationListener);
        }
        fd fdVar = this.g;
        if (fdVar != null) {
            fdVar.addUpdateListener(animationListener);
        }
        fd fdVar2 = this.f;
        if (fdVar2 != null) {
            fdVar2.addUpdateListener(animationListener);
        }
    }

    public void b(float f) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.d;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.setProgress(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.o;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.setProgress(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f34153a;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.setProgress(f);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f34154b;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.setProgress(f);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.i;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.setProgress(f);
        }
        BaseKeyframeAnimation<jj, jj> baseKeyframeAnimation6 = this.j;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.setProgress(f);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.h;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.setProgress(f);
        }
        fd fdVar = this.g;
        if (fdVar != null) {
            fdVar.setProgress(f);
        }
        fd fdVar2 = this.f;
        if (fdVar2 != null) {
            fdVar2.setProgress(f);
        }
    }

    public BaseKeyframeAnimation<?, Integer> c() {
        return this.d;
    }

    public BaseKeyframeAnimation<?, Float> d() {
        return this.o;
    }

    public BaseKeyframeAnimation<?, Float> e() {
        return this.f34153a;
    }

    public Matrix a() {
        float fA;
        PointF value;
        jj value2;
        PointF value3;
        this.f34155c.reset();
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.i;
        if (baseKeyframeAnimation != null && (value3 = baseKeyframeAnimation.getValue()) != null && (value3.x != 0.0f || value3.y != 0.0f)) {
            this.f34155c.preTranslate(value3.x, value3.y);
        }
        if (!this.e) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.h;
            if (baseKeyframeAnimation2 != null) {
                if (baseKeyframeAnimation2 instanceof fm) {
                    fA = baseKeyframeAnimation2.getValue().floatValue();
                } else {
                    fA = ((fd) baseKeyframeAnimation2).a();
                }
                if (fA != 0.0f) {
                    this.f34155c.preRotate(fA);
                }
            }
        } else if (baseKeyframeAnimation != null) {
            float progress = baseKeyframeAnimation.getProgress();
            PointF value4 = baseKeyframeAnimation.getValue();
            float f = value4.x;
            float f2 = value4.y;
            baseKeyframeAnimation.setProgress(1.0E-4f + progress);
            PointF value5 = baseKeyframeAnimation.getValue();
            baseKeyframeAnimation.setProgress(progress);
            this.f34155c.preRotate((float) Math.toDegrees(Math.atan2(value5.y - f2, value5.x - f)));
        }
        fd fdVar = this.g;
        if (fdVar != null) {
            fd fdVar2 = this.f;
            float fCos = fdVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-fdVar2.a()) + 90.0f));
            fd fdVar3 = this.f;
            float fSin = fdVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-fdVar3.a()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(fdVar.a()));
            b();
            float[] fArr = this.k;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f3 = -fSin;
            fArr[3] = f3;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.l.setValues(fArr);
            b();
            float[] fArr2 = this.k;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.n.setValues(fArr2);
            b();
            float[] fArr3 = this.k;
            fArr3[0] = fCos;
            fArr3[1] = f3;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.n.preConcat(this.l);
            this.m.preConcat(this.n);
            this.f34155c.preConcat(this.m);
        }
        BaseKeyframeAnimation<jj, jj> baseKeyframeAnimation3 = this.j;
        if (baseKeyframeAnimation3 != null && (value2 = baseKeyframeAnimation3.getValue()) != null && (value2.d() != 1.0f || value2.b() != 1.0f)) {
            this.f34155c.preScale(value2.d(), value2.b());
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f34154b;
        if (baseKeyframeAnimation4 != null && (value = baseKeyframeAnimation4.getValue()) != null && (value.x != 0.0f || value.y != 0.0f)) {
            this.f34155c.preTranslate(-value.x, -value.y);
        }
        return this.f34155c;
    }

    private void b() {
        for (int i = 0; i < 9; i++) {
            this.k[i] = 0.0f;
        }
    }

    public Matrix d(float f) {
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.i;
        PointF value = baseKeyframeAnimation == null ? null : baseKeyframeAnimation.getValue();
        BaseKeyframeAnimation<jj, jj> baseKeyframeAnimation2 = this.j;
        jj value2 = baseKeyframeAnimation2 == null ? null : baseKeyframeAnimation2.getValue();
        this.f34155c.reset();
        if (value != null) {
            this.f34155c.preTranslate(value.x * f, value.y * f);
        }
        if (value2 != null) {
            double d = f;
            this.f34155c.preScale((float) Math.pow(value2.d(), d), (float) Math.pow(value2.b(), d));
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.h;
        if (baseKeyframeAnimation3 != null) {
            float fFloatValue = baseKeyframeAnimation3.getValue().floatValue();
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f34154b;
            PointF value3 = baseKeyframeAnimation4 != null ? baseKeyframeAnimation4.getValue() : null;
            this.f34155c.preRotate(fFloatValue * f, value3 == null ? 0.0f : value3.x, value3 != null ? value3.y : 0.0f);
        }
        return this.f34155c;
    }

    public <T> boolean d(T t, jf<T> jfVar) {
        if (t == LottieProperty.TRANSFORM_ANCHOR_POINT) {
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation = this.f34154b;
            if (baseKeyframeAnimation == null) {
                this.f34154b = new fm(jfVar, new PointF());
                return true;
            }
            baseKeyframeAnimation.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_POSITION) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.i;
            if (baseKeyframeAnimation2 == null) {
                this.i = new fm(jfVar, new PointF());
                return true;
            }
            baseKeyframeAnimation2.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_POSITION_X) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation3 = this.i;
            if (baseKeyframeAnimation3 instanceof fe) {
                ((fe) baseKeyframeAnimation3).e(jfVar);
                return true;
            }
        }
        if (t == LottieProperty.TRANSFORM_POSITION_Y) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation4 = this.i;
            if (baseKeyframeAnimation4 instanceof fe) {
                ((fe) baseKeyframeAnimation4).b(jfVar);
                return true;
            }
        }
        if (t == LottieProperty.TRANSFORM_SCALE) {
            BaseKeyframeAnimation<jj, jj> baseKeyframeAnimation5 = this.j;
            if (baseKeyframeAnimation5 == null) {
                this.j = new fm(jfVar, new jj());
                return true;
            }
            baseKeyframeAnimation5.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_ROTATION) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation6 = this.h;
            if (baseKeyframeAnimation6 == null) {
                this.h = new fm(jfVar, Float.valueOf(0.0f));
                return true;
            }
            baseKeyframeAnimation6.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_OPACITY) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation7 = this.d;
            if (baseKeyframeAnimation7 == null) {
                this.d = new fm(jfVar, 100);
                return true;
            }
            baseKeyframeAnimation7.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_START_OPACITY) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation8 = this.o;
            if (baseKeyframeAnimation8 == null) {
                this.o = new fm(jfVar, Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation8.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_END_OPACITY) {
            BaseKeyframeAnimation<?, Float> baseKeyframeAnimation9 = this.f34153a;
            if (baseKeyframeAnimation9 == null) {
                this.f34153a = new fm(jfVar, Float.valueOf(100.0f));
                return true;
            }
            baseKeyframeAnimation9.setValueCallback(jfVar);
            return true;
        }
        if (t == LottieProperty.TRANSFORM_SKEW) {
            if (this.g == null) {
                this.g = new fd(Collections.singletonList(new jb(Float.valueOf(0.0f))));
            }
            this.g.setValueCallback(jfVar);
            return true;
        }
        if (t != LottieProperty.TRANSFORM_SKEW_ANGLE) {
            return false;
        }
        if (this.f == null) {
            this.f = new fd(Collections.singletonList(new jb(Float.valueOf(0.0f))));
        }
        this.f.setValueCallback(jfVar);
        return true;
    }
}
