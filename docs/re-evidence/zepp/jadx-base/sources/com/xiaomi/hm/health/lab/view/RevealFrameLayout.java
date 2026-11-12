package com.xiaomi.hm.health.lab.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes21.dex */
public class RevealFrameLayout extends FrameLayout {
    public static final int STATE_END_FINISHED = 4;
    public static final int STATE_END_STARTED = 3;
    public static final int STATE_FILL_FINISHED = 2;
    public static final int STATE_FILL_STARTED = 1;
    public static final int STATE_NOT_STARTED = 0;
    private static final Interpolator h = new DecelerateInterpolator();
    private static final long i = 300;
    private int a;
    private OnStateChangeListener b;
    private final Path c;
    private float d;
    private float e;
    private float f;
    private float g;

    public interface OnStateChangeListener {
        void onStateChange(int i);
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RevealFrameLayout.this.b(2);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            RevealFrameLayout.this.b(4);
        }
    }

    public RevealFrameLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        if (this.a == i2) {
            return;
        }
        this.a = i2;
        OnStateChangeListener onStateChangeListener = this.b;
        if (onStateChangeListener != null) {
            onStateChangeListener.onStateChange(i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.c.reset();
        Path path = this.c;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.f;
        path.addOval(new RectF(f - f2, f3 - f2, f + f2, f3 + f2), Path.Direction.CCW);
        canvas.clipPath(this.c, Region.Op.INTERSECT);
        super.dispatchDraw(canvas);
    }

    public void endFromEdge(View view) {
        endFromEdge(view, 300L);
    }

    public int getState() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        this.g = (float) Math.sqrt(Math.pow(getMeasuredWidth(), 2.0d) + Math.pow(getMeasuredHeight(), 2.0d));
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a == 2 || super.onTouchEvent(motionEvent);
    }

    public void setMRadius(float f) {
        this.d = f;
        invalidate();
    }

    public void setOnStateChangeListener(OnStateChangeListener onStateChangeListener) {
        this.b = onStateChangeListener;
    }

    public void startFromLocation(View view) {
        startFromLocation(view, 300L);
    }

    public RevealFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        this.c = new Path();
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
    }

    public void endFromEdge(View view, long j) {
        setMRadius(this.g);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "mRadius", this.g, view.getWidth() / 2.0f).setDuration(j);
        duration.setInterpolator(h);
        duration.addListener(new b());
        b(3);
        duration.start();
    }

    public void startFromLocation(View view, long j) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.e = iArr[0] + (view.getWidth() / 2);
        this.f = iArr[1] + (view.getHeight() / 2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "mRadius", 0.0f, this.g).setDuration(j);
        duration.setInterpolator(h);
        duration.addListener(new a());
        b(1);
        duration.start();
    }
}
