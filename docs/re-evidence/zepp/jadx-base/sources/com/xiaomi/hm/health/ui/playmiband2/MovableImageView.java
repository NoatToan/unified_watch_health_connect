package com.xiaomi.hm.health.ui.playmiband2;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import com.huami.lib.view.ViewUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class MovableImageView extends AppCompatImageView {
    private static final int c = 300;
    private static final int d = 150;
    private static final int e = 600;
    private float a;
    private List<ValueAnimator> b;

    public MovableImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ValueAnimator valueAnimator) {
        this.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ValueAnimator valueAnimator) {
        this.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ValueAnimator valueAnimator) {
        this.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        click(0.97f, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        click(0.97f, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        click(0.97f, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(ValueAnimator valueAnimator) {
        setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(ValueAnimator valueAnimator) {
        setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        postInvalidateOnAnimation();
    }

    public void appearAndRise() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, ViewUtils.dp2px(getContext(), -10.0f));
        translateAnimation.setDuration(150L);
        translateAnimation.setFillAfter(true);
        startAnimation(alphaAnimation);
        startAnimation(translateAnimation);
    }

    public void appearAndTranslate(float fromX, float toX, float fromY, float toY) {
        TranslateAnimation translateAnimation = new TranslateAnimation(fromX, toX, fromY, toY);
        translateAnimation.setDuration(800L);
        translateAnimation.setFillAfter(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        startAnimation(animationSet);
    }

    public void clearAnim() {
        List<ValueAnimator> list = this.b;
        if (list != null && list.size() > 0) {
            for (ValueAnimator valueAnimator : this.b) {
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
        }
        this.a = 1.0f;
        clearAnimation();
        setTranslationX(0.0f);
        invalidate();
    }

    public void click(float scale, boolean delay, Animator.AnimatorListener listener) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, scale, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h85
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.i(valueAnimator);
            }
        });
        if (delay) {
            valueAnimatorOfFloat.setStartDelay(1000L);
        }
        if (listener != null) {
            valueAnimatorOfFloat.addListener(listener);
        }
        this.b.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.a;
        canvas.scale(f, f);
        super.onDraw(canvas);
    }

    public void press(float scale) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, scale);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g85
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.j(valueAnimator);
            }
        });
        this.b.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public void release(float scale) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(scale, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d85
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.k(valueAnimator);
            }
        });
        this.b.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public void seriesClick(Handler handler) {
        click(0.97f, false, null);
        handler.postDelayed(new Runnable() { // from class: k85
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l();
            }
        }, 1300L);
        handler.postDelayed(new Runnable() { // from class: i85
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m();
            }
        }, 2600L);
        handler.postDelayed(new Runnable() { // from class: j85
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n();
            }
        }, 3900L);
    }

    public void translateX(int delayMillis, float fromX, float toX) {
        float[] fArr = new float[2];
        if (fromX == -1.0f) {
            fromX = getTranslationX();
        }
        fArr[0] = fromX;
        fArr[1] = toX;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f85
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.o(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setStartDelay(delayMillis);
        this.b.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public void translateXY(float deltaX, float deltaY) {
        TranslateAnimation translateAnimation = new TranslateAnimation(getTranslationX(), deltaX, getTranslationY(), deltaY);
        translateAnimation.setDuration(600L);
        translateAnimation.setFillAfter(true);
        startAnimation(translateAnimation);
    }

    public void translateY(int delayMillis, float fromY, float toY) {
        float[] fArr = new float[2];
        if (fromY == -1.0f) {
            fromY = getTranslationX();
        }
        fArr[0] = fromY;
        fArr[1] = toY;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(600L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e85
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.p(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setStartDelay(delayMillis);
        this.b.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }

    public MovableImageView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public MovableImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = 1.0f;
        this.b = new ArrayList();
    }

    public void translateXY(float fromX, float toX, float fromY, float toY) {
        TranslateAnimation translateAnimation = new TranslateAnimation(fromX, toX, fromY, toY);
        translateAnimation.setDuration(600L);
        translateAnimation.setFillAfter(true);
        startAnimation(translateAnimation);
    }

    public void translateX(int delayMillis, float toX) {
        translateX(delayMillis, getTranslationX(), toX);
    }

    public void click() {
        click(0.97f, true, null);
    }
}
