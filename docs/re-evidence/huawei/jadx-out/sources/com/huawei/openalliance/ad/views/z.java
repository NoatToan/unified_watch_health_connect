package com.huawei.openalliance.ad.views;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import com.huawei.openalliance.ad.gx;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f21463a = 80;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f21464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AnimatorSet f21465c;
    private Bitmap d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;

    public Bitmap f() {
        return this.d;
    }

    public float e() {
        return this.f + (this.j * this.h);
    }

    public float d() {
        return this.e + (this.i * this.g);
    }

    public float c() {
        return this.f;
    }

    public float b() {
        return this.e;
    }

    public AnimatorSet a() {
        return this.f21465c;
    }

    public z(float[][] fArr, int[] iArr, Bitmap bitmap, final View view) {
        this.d = bitmap;
        this.i = bitmap.getWidth();
        this.j = bitmap.getHeight();
        ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofKeyframe(View.TRANSLATION_X, Keyframe.ofFloat(0.0f, view.getWidth() * fArr[0][0]), Keyframe.ofFloat(1.0f, (view.getWidth() * fArr[0][1]) - (this.i / 2.0f))), PropertyValuesHolder.ofKeyframe(View.TRANSLATION_Y, Keyframe.ofFloat(0.0f, view.getHeight() * fArr[1][0]), Keyframe.ofFloat(1.0f, fArr[1][1] < 0.0f ? (view.getHeight() * fArr[1][1]) - this.j : view.getHeight() * fArr[1][1])), PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, fArr[2][0]), Keyframe.ofFloat(1.0f, fArr[2][1])), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, fArr[2][0]), Keyframe.ofFloat(1.0f, fArr[2][1])));
        this.f21464b = valueAnimatorOfPropertyValuesHolder;
        valueAnimatorOfPropertyValuesHolder.setInterpolator(new gx(1.0f, 0.0f, 1.0f, 1.0f));
        this.f21464b.setDuration(iArr[1] + f21463a);
        this.f21464b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.openalliance.ad.views.z.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                try {
                    z.this.e = ((Float) valueAnimator.getAnimatedValue(View.TRANSLATION_X.getName())).floatValue();
                    z.this.f = ((Float) valueAnimator.getAnimatedValue(View.TRANSLATION_Y.getName())).floatValue();
                    z.this.g = ((Float) valueAnimator.getAnimatedValue(View.SCALE_X.getName())).floatValue();
                    z.this.h = ((Float) valueAnimator.getAnimatedValue(View.SCALE_Y.getName())).floatValue();
                    view.postInvalidate();
                } catch (Throwable th) {
                    hw.c("ParticleAnimator", "onAnimationUpdate: %s", th.getClass().getSimpleName());
                }
            }
        });
        this.f21465c = new AnimatorSet();
        PropertyValuesHolder propertyValuesHolderOfKeyframe = PropertyValuesHolder.ofKeyframe(View.ALPHA, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f));
        ValueAnimator valueAnimatorOfPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfKeyframe);
        valueAnimatorOfPropertyValuesHolder2.setDuration(iArr[0]);
        ValueAnimator valueAnimatorOfPropertyValuesHolder3 = ValueAnimator.ofPropertyValuesHolder(propertyValuesHolderOfKeyframe);
        valueAnimatorOfPropertyValuesHolder3.setDuration(((1400 - ((long) iArr[0])) - ((long) iArr[1])) - ((long) f21463a));
        this.f21465c.playSequentially(valueAnimatorOfPropertyValuesHolder2, this.f21464b, valueAnimatorOfPropertyValuesHolder3);
    }
}
