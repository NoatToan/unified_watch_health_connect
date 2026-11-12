package com.xiaomi.hm.health.ui.playmiband2;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.xiaomi.hm.health.ui.playmiband2.CustomAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class CustomAnimator {
    private static final int c = 600;
    private static final int d = 200;
    private List<ValueAnimator> a = new ArrayList();
    private List<View> b = new ArrayList();

    private CustomAnimator() {
    }

    public static CustomAnimator getInstance() {
        return new CustomAnimator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(View view, ValueAnimator valueAnimator) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(View view, ValueAnimator valueAnimator) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(View view, ValueAnimator valueAnimator) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(View view, ValueAnimator valueAnimator) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.postInvalidateOnAnimation();
    }

    public void h(final View view) {
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: w11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.k(view, valueAnimator);
            }
        });
        this.a.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public void i() {
        List<ValueAnimator> list = this.a;
        if (list != null && list.size() > 0) {
            for (ValueAnimator valueAnimator : this.a) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
        }
        List<View> list2 = this.b;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        for (View view : this.b) {
            if (view != null) {
                view.clearAnimation();
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.invalidate();
            }
        }
    }

    public void j(final View view) {
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.l(view, valueAnimator);
            }
        });
        this.a.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public void r(final View view, int fromX, int toX) {
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fromX, toX);
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.m(view, valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.n(view, valueAnimator);
            }
        });
        this.a.add(valueAnimatorOfFloat2);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setDuration(200L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.o(view, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.setStartDelay(400L);
        this.a.add(valueAnimatorOfFloat3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2).with(valueAnimatorOfFloat3);
        animatorSet.start();
    }

    public void s(View view, int delayMillis, float toX) {
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        t(view, delayMillis, view.getTranslationX(), toX);
    }

    public void t(View view, int delayMillis, float fromX, float toX) {
        u(view, delayMillis, fromX, toX, 600);
    }

    public void u(final View view, int delayMillis, float fromX, float toX, int duration) {
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        float[] fArr = new float[2];
        if (fromX == -1.0f) {
            fromX = view.getTranslationX();
        }
        fArr[0] = fromX;
        fArr[1] = toX;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v11
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.p(view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setStartDelay(delayMillis);
        this.a.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public void v(final View view, int delayMillis, float fromY, float toY) {
        if (!this.b.contains(view)) {
            this.b.add(view);
        }
        float[] fArr = new float[2];
        if (fromY == -1.0f) {
            fromY = view.getTranslationX();
        }
        fArr[0] = fromY;
        fArr[1] = toY;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: a21
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomAnimator.q(view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setStartDelay(delayMillis);
        this.a.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }
}
