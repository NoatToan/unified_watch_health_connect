package com.scwang.smartrefresh.layout.header.bezierradar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes18.dex */
public class RippleView extends View {
    private int a;
    private Paint b;
    private ValueAnimator c;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RippleView.this.a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RippleView.this.invalidate();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }

    public RippleView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        this.b.setColor(-1);
        this.b.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.a, this.b);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public void setFrontColor(@ColorInt int i) {
        this.b.setColor(i);
    }

    public void startReveal() {
        if (this.c == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d)));
            this.c = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(400L);
            this.c.addUpdateListener(new a());
            this.c.addListener(new b());
        }
        this.c.start();
    }
}
