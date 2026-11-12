package com.scwang.smartrefresh.layout.header.bezierradar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.ColorInt;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes18.dex */
public class RoundProgressView extends View {
    private Paint a;
    private Paint b;
    private ValueAnimator c;
    private int d;
    private int e;
    private int f;
    private int g;
    private RectF h;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundProgressView.this.d = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            RoundProgressView.this.postInvalidate();
        }
    }

    public RoundProgressView(Context context) {
        super(context);
        this.d = 0;
        this.e = 270;
        this.f = 0;
        this.g = 0;
        this.h = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        b();
    }

    private void b() {
        this.a = new Paint();
        this.b = new Paint();
        this.a.setAntiAlias(true);
        this.b.setAntiAlias(true);
        this.a.setColor(-1);
        this.b.setColor(1426063360);
        DensityUtil densityUtil = new DensityUtil();
        this.f = densityUtil.dip2px(20.0f);
        this.g = densityUtil.dip2px(7.0f);
        this.a.setStrokeWidth(densityUtil.dip2px(3.0f));
        this.b.setStrokeWidth(densityUtil.dip2px(3.0f));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 360);
        this.c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(720L);
        this.c.setRepeatCount(-1);
        this.c.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.addUpdateListener(new a());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.removeAllUpdateListeners();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (isInEditMode()) {
            this.e = 0;
            this.d = 270;
        }
        this.a.setStyle(Paint.Style.FILL);
        int i = width / 2;
        float f = i;
        int i2 = height / 2;
        float f2 = i2;
        canvas.drawCircle(f, f2, this.f, this.a);
        this.a.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(f, f2, this.f + this.g, this.a);
        this.b.setStyle(Paint.Style.FILL);
        RectF rectF = this.h;
        int i3 = this.f;
        rectF.set(i - i3, i2 - i3, i + i3, i3 + i2);
        canvas.drawArc(this.h, this.e, this.d, true, this.b);
        this.f += this.g;
        this.b.setStyle(Paint.Style.STROKE);
        RectF rectF2 = this.h;
        int i4 = this.f;
        rectF2.set(i - i4, i2 - i4, i + i4, i2 + i4);
        canvas.drawArc(this.h, this.e, this.d, false, this.b);
        this.f -= this.g;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), View.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public void setBackColor(@ColorInt int i) {
        this.b.setColor((i & 16777215) | 1426063360);
    }

    public void setFrontColor(@ColorInt int i) {
        this.a.setColor(i);
    }

    public void startAnim() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void stopAnim() {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.c.cancel();
    }
}
