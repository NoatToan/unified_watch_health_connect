package com.xiaomi.hm.health.lab.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes21.dex */
public class CountDownTextView extends TypefaceTextView {
    public static final int STATE_CANCEL = 3;
    public static final int STATE_FINISH_DOWNCOUNT = 2;
    public static final int STATE_FINISH_WITHOUT_DOWNCOUNT = 4;
    public static final int STATE_NOT_STARTED = 0;
    public static final int STATE_START_DOWNCOUNT = 1;
    private static final Interpolator e = new DecelerateInterpolator();
    private static final int f = 1000;
    private int a;
    private OnStateChangeListener b;
    public ObjectAnimator c;
    private int d;

    public interface OnStateChangeListener {
        void onStateChange(int i);
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            CountDownTextView.this.e(3);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (CountDownTextView.this.d == 1) {
                CountDownTextView.this.e(2);
            } else if (CountDownTextView.this.d == 3) {
                CountDownTextView.this.e(4);
            } else {
                CountDownTextView.this.e(3);
            }
            super.onAnimationEnd(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            if (CountDownTextView.this.d <= 1) {
                CountDownTextView.this.setText((CharSequence) null);
                return;
            }
            CountDownTextView.this.d--;
            CountDownTextView countDownTextView = CountDownTextView.this;
            countDownTextView.setText(String.valueOf(countDownTextView.d));
        }
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        OnStateChangeListener onStateChangeListener = this.b;
        if (onStateChangeListener != null) {
            onStateChangeListener.onStateChange(i);
        }
    }

    public void cancleTextAnimator() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
    }

    public void setOnStateChangeListener(OnStateChangeListener onStateChangeListener) {
        this.b = onStateChangeListener;
    }

    public void setTextAlpha(float f2) {
        setAlpha(f2);
    }

    public void startTextAnimator(int i) {
        setTextAlpha(0.0f);
        this.d = i;
        setText(String.valueOf(i));
        cancleTextAnimator();
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "textAlpha", 0.0f, 1.0f).setDuration(1000L);
        this.c = duration;
        duration.setInterpolator(e);
        this.c.setRepeatCount(i - 1);
        this.c.setRepeatMode(1);
        this.c.addListener(new a());
        this.c.start();
        e(1);
    }
}
