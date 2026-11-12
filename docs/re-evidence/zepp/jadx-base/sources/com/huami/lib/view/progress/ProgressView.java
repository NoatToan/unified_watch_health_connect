package com.huami.lib.view.progress;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.huami.lib.view.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.DecimalUtil;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressView extends View {
    public static final int CYCLE = 0;
    public static final int CYCLE_LOADING = 2;
    public static final int GONE = 4;
    public static final int RECT = 1;
    public static final int RECT_LOADING = 3;
    private static final String u = "ProgressView";
    private static final int v = -90;
    private Context a;
    private float b;
    private float c;
    public int d;
    public int e;
    private Paint f;
    private Paint g;
    private RectF h;
    private float i;
    private float j;
    private int k;
    private int l;
    private SweepGradient m;
    private Animator n;
    public float o;
    private Drawable p;
    private boolean q;
    private float r;
    private int s;
    private int[] t;

    @Retention(RetentionPolicy.SOURCE)
    public @interface STYLE {
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ProgressView progressView = ProgressView.this;
            progressView.o = fFloatValue * 360.0f;
            progressView.postInvalidateOnAnimation();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            HMLog.d("ProgressView", "value = " + iIntValue, new Object[0]);
            ProgressView.this.setProgress((float) iIntValue);
        }
    }

    public ProgressView(Context context) {
        this(context, null);
    }

    private Animator a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a());
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        return valueAnimatorOfFloat;
    }

    private void b() {
        this.f.setShader(null);
        this.m = null;
    }

    private void c(Canvas canvas) {
        float f = this.d / 2;
        int i = this.e;
        canvas.drawCircle(f, i / 2, (i - this.i) / 2.0f, this.g);
        canvas.drawArc(this.h, -90.0f, getSweepAngle(), false, this.f);
    }

    private void d(Canvas canvas) {
        if (this.p != null) {
            ViewUtils.drawBitmapCenter(canvas, this.h.centerX(), this.h.centerY(), this.r, ViewUtils.drawable2Bitmap(this.p), null);
        }
    }

    private void e(Canvas canvas, RectF rectF) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = this.j;
        canvas.drawRoundRect(rectF, f12, f12, this.g);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        Path path = new Path();
        float sweepAngle = getSweepAngle();
        float fWidth = rectF.width() / 2.0f;
        float f13 = this.j;
        float f14 = fWidth - f13;
        float fAtan = (float) ((Math.atan(f14 / fWidth) / 6.283185307179586d) * 360.0d);
        double d = fWidth;
        float fTan = (float) (Math.tan(Math.toRadians(sweepAngle)) * d);
        path.setLastPoint(fCenterX, rectF.top);
        if (sweepAngle < fAtan) {
            path.rLineTo(fTan, 0.0f);
        } else {
            path.rLineTo(f14, 0.0f);
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.set(fCenterX - f13, fCenterY - f13, fCenterX + f13, f13 + fCenterY);
        float f15 = -f14;
        rectF2.offset(f14, f15);
        float f16 = 90.0f - fAtan;
        if (sweepAngle < f16 && sweepAngle >= fAtan) {
            path.addArc(rectF2, -90.0f, ((sweepAngle - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        } else if (sweepAngle > f16) {
            path.addArc(rectF2, -90.0f, 90.0f);
        }
        if (sweepAngle < f16 || sweepAngle >= 90.0f) {
            f = 90.0f;
            if (sweepAngle > 90.0f) {
                path.moveTo(fCenterX + fWidth, fCenterY - f14);
                path.rLineTo(0.0f, f14);
            }
        } else {
            float fTan2 = f14 - (((float) Math.tan(Math.toRadians(90.0f - sweepAngle))) * fWidth);
            path.moveTo(fCenterX + fWidth, fCenterY - f14);
            path.rLineTo(0.0f, fTan2);
            f = 90.0f;
        }
        float f17 = fAtan + f;
        float f18 = 180.0f - fAtan;
        if (sweepAngle <= f || sweepAngle >= f17) {
            f2 = 0.0f;
            if (sweepAngle >= f17) {
                path.rLineTo(0.0f, f14);
            }
        } else {
            float fTan3 = (float) (Math.tan(Math.toRadians(sweepAngle - f)) * d);
            f2 = 0.0f;
            path.rLineTo(0.0f, fTan3);
        }
        if (sweepAngle <= f17 || sweepAngle >= f18) {
            f3 = 90.0f;
            if (sweepAngle > f18) {
                rectF2.offset(f2, f14 * 2.0f);
                path.addArc(rectF2, f2, 90.0f);
            }
        } else {
            rectF2.offset(f2, f14 * 2.0f);
            f3 = 90.0f;
            path.addArc(rectF2, f2, (((sweepAngle - 90.0f) - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        }
        if (sweepAngle < f18 || sweepAngle >= 180.0f) {
            f4 = 180.0f;
            if (sweepAngle >= 180.0f) {
                path.moveTo(fCenterX + f14, fCenterY + fWidth);
                path.rLineTo(f15, 0.0f);
            }
        } else {
            float fTan4 = f14 - (((float) Math.tan(Math.toRadians(f3 - (sweepAngle - f3)))) * fWidth);
            path.moveTo(fCenterX + f14, fCenterY + fWidth);
            path.rLineTo(-fTan4, 0.0f);
            f4 = 180.0f;
        }
        float f19 = fAtan + f4;
        float f20 = 270.0f - fAtan;
        if (sweepAngle <= f4 || sweepAngle >= f19) {
            f5 = f15;
            f6 = 0.0f;
            if (sweepAngle >= f19) {
                path.rLineTo(f5, 0.0f);
            }
        } else {
            float f21 = sweepAngle - f4;
            f5 = f15;
            f6 = 0.0f;
            path.rLineTo(-((float) (Math.tan(Math.toRadians(f21)) * d)), 0.0f);
        }
        if (sweepAngle < f19 || sweepAngle >= f20) {
            f7 = 90.0f;
            if (sweepAngle > f20) {
                rectF2.offset(f5 * 2.0f, 0.0f);
                path.addArc(rectF2, 90.0f, 90.0f);
            }
        } else {
            rectF2.offset(f5 * 2.0f, f6);
            f7 = 90.0f;
            path.addArc(rectF2, 90.0f, (((sweepAngle - 180.0f) - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        }
        if (sweepAngle < f20 || sweepAngle >= 270.0f) {
            f8 = 270.0f;
            if (sweepAngle >= 270.0f) {
                path.moveTo(fCenterX - fWidth, fCenterY + f14);
                path.rLineTo(0.0f, f5);
            }
        } else {
            float fTan5 = f14 - (((float) Math.tan(Math.toRadians(f7 - (sweepAngle - 180.0f)))) * fWidth);
            path.moveTo(fCenterX - fWidth, fCenterY + f14);
            path.rLineTo(0.0f, -fTan5);
            f8 = 270.0f;
        }
        float f22 = fAtan + f8;
        float f23 = 360.0f - fAtan;
        if (sweepAngle <= f8 || sweepAngle >= f22) {
            f9 = f23;
            f10 = 0.0f;
            if (sweepAngle >= f22) {
                path.rLineTo(0.0f, f5);
            }
        } else {
            f9 = f23;
            f10 = 0.0f;
            path.rLineTo(0.0f, -((float) (Math.tan(Math.toRadians(sweepAngle - f8)) * d)));
        }
        if (sweepAngle < f22 || sweepAngle >= f9) {
            f11 = 90.0f;
            if (sweepAngle > f9) {
                rectF2.offset(0.0f, 2.0f * f5);
                path.addArc(rectF2, 180.0f, 90.0f);
            }
        } else {
            rectF2.offset(f10, f5 * 2.0f);
            f11 = 90.0f;
            path.addArc(rectF2, 180.0f, (((sweepAngle - 270.0f) - fAtan) / (90.0f - (fAtan * 2.0f))) * 90.0f);
        }
        if (sweepAngle >= f9 && sweepAngle < 360.0f) {
            float fTan6 = f14 - (((float) Math.tan(Math.toRadians(f11 - (sweepAngle - 270.0f)))) * fWidth);
            path.moveTo(fCenterX - f14, fCenterY - fWidth);
            path.rLineTo(fTan6, 0.0f);
        } else if (sweepAngle >= 360.0f) {
            path.moveTo(fCenterX - f14, fCenterY - fWidth);
            path.rLineTo(f14, 0.0f);
        }
        canvas.drawPath(path, this.f);
    }

    private void f() {
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setAntiAlias(true);
        this.g.setStyle(Paint.Style.STROKE);
        invalidatePain();
        this.h = new RectF();
    }

    private void g() {
        if (this.m == null) {
            SweepGradient sweepGradient = new SweepGradient(this.d / 2, this.e / 2, new int[]{this.k, this.l}, (float[]) null);
            this.m = sweepGradient;
            this.f.setShader(sweepGradient);
        }
        if (this.q) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.o, this.d / 2, this.e / 2);
            this.m.setLocalMatrix(matrix);
        }
    }

    private float getSweepAngle() {
        return getPercentProgress() * 360.0f;
    }

    private void h(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, R.styleable.Progress, 0, i);
        this.c = typedArrayObtainStyledAttributes.getInteger(R.styleable.Progress_android_max, 100);
        this.b = typedArrayObtainStyledAttributes.getInteger(R.styleable.Progress_android_progress, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R.styleable.Progress_style, 0);
        if (i2 == 0) {
            this.s = 0;
        } else if (i2 == 1) {
            this.s = 1;
        } else if (i2 == 2) {
            this.s = 2;
        }
        if (i2 == 0) {
            this.s = 0;
        } else if (i2 == 1) {
            this.s = 1;
        } else if (i2 == 2) {
            this.s = 2;
            startLoading();
        } else if (i2 == 3) {
            this.s = 3;
            startLoading();
        }
        HMLog.d("ProgressView", "style : " + this.s, new Object[0]);
        this.i = (float) typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.Progress_strokeWidth, (int) i((double) ViewUtils.dp2px(this.a, 1.3f)));
        this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.Progress_backgroundColor, 1157627903);
        this.l = typedArrayObtainStyledAttributes.getColor(R.styleable.Progress_progressColor, -1);
        this.j = ViewUtils.dp2px(this.a, typedArrayObtainStyledAttributes.getDimension(R.styleable.Progress_roundRadius, 20.0f));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.Progress_android_src);
        if (drawable != null) {
            setImageDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static double i(double d) {
        return new BigDecimal(DecimalUtil.doubleToStr(Double.valueOf(d))).divide(new BigDecimal("1"), 0, 4).doubleValue();
    }

    public float getMax() {
        return this.c;
    }

    public int getPercent() {
        return (int) (getPercentProgress() * 100.0f);
    }

    public float getPercentProgress() {
        HMLog.d("ProgressView", this.b + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.c, new Object[0]);
        return this.b / this.c;
    }

    public float getValue() {
        return this.b;
    }

    @Override // android.view.View
    public void invalidate() {
        invalidatePain();
        super.invalidate();
    }

    public void invalidatePain() {
        if (this.f == null) {
            Paint paint = new Paint();
            this.f = paint;
            paint.setAntiAlias(true);
            this.f.setStyle(Paint.Style.STROKE);
        }
        this.f.setColor(this.l);
        this.f.setStrokeWidth(this.i);
        if (this.g == null) {
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setAntiAlias(true);
            this.g.setStyle(Paint.Style.STROKE);
        }
        this.g.setColor(this.k);
        this.g.setStrokeWidth(this.i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
        int i = this.s;
        if (i == 0) {
            b();
            c(canvas);
            return;
        }
        if (i == 1) {
            b();
            e(canvas, this.h);
            return;
        }
        if (i == 2) {
            g();
            canvas.rotate(-90.0f, this.d / 2, this.e / 2);
            float f = this.d / 2;
            int i2 = this.e;
            canvas.drawCircle(f, i2 / 2, (i2 - this.i) / 2.0f, this.f);
            return;
        }
        if (i != 3) {
            return;
        }
        g();
        canvas.rotate(-90.0f, this.d / 2, this.e / 2);
        RectF rectF = this.h;
        float f2 = this.j;
        canvas.drawRoundRect(rectF, f2, f2, this.f);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            this.d = size;
        } else {
            int paddingLeft = getPaddingLeft() + getPaddingRight() + ((int) this.i) + ((int) ViewUtils.dp2px(this.a, 100.0f));
            if (mode == Integer.MIN_VALUE) {
                this.d = Math.min(paddingLeft, size);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            this.e = size2;
        } else {
            int paddingTop = getPaddingTop() + getPaddingBottom() + ((int) this.i) + ((int) ViewUtils.dp2px(this.a, 100.0f));
            if (mode2 == Integer.MIN_VALUE) {
                this.e = Math.min(paddingTop, size2);
            }
        }
        RectF rectF = this.h;
        float f = this.i;
        rectF.set(f / 2.0f, f / 2.0f, this.d - (f / 2.0f), this.e - (f / 2.0f));
        setMeasuredDimension(this.d, this.e);
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        if (this.p != drawable) {
            this.p = drawable;
            invalidate();
        }
    }

    public void setImageResource(@DrawableRes int i) {
        setImageDrawable(this.a.getResources().getDrawable(i));
    }

    public void setMax(int i) {
        this.c = i;
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.i = f;
        invalidate();
    }

    public void setStyle(int i) {
        HMLog.d("ProgressView", "style : " + i, new Object[0]);
        this.s = i;
        invalidate();
    }

    public void startAnim() {
        setMax(100);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.c);
        valueAnimatorOfFloat.setDuration(15000L);
        valueAnimatorOfFloat.addUpdateListener(new b());
        valueAnimatorOfFloat.start();
    }

    public void startLoading() {
        if (this.n == null) {
            this.n = a();
        }
        if (this.n.isStarted()) {
            return;
        }
        this.n.start();
        this.q = true;
    }

    public void stopLoading() {
        Animator animator = this.n;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.n.end();
        this.n.cancel();
        this.q = false;
        this.n = null;
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = 360.0f;
        this.r = 1.0f;
        this.t = new int[]{android.R.color.holo_purple, android.R.color.darker_gray, android.R.color.holo_blue_bright, android.R.color.holo_blue_dark, android.R.color.holo_orange_light, android.R.color.holo_blue_light, android.R.color.holo_green_dark, android.R.color.holo_red_dark, android.R.color.holo_green_light, android.R.color.holo_orange_dark};
        this.a = context;
        h(attributeSet, i);
        f();
    }

    public void setImageResource(@DrawableRes int i, float f) {
        this.r = f;
        setImageResource(i);
    }
}
