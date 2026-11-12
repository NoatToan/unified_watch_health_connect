package com.xiaomi.hm.health.bodyfat.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public class WeightChartView extends View {
    private static final float A = 8.0f;
    private static final float B = 2.0f;
    private static final int C = 800;
    private static final int D = 3;
    private static final int x = 3;
    private static final int y = 160;
    private static final float z = 8.0f;
    private Context a;
    private RectF b;
    private float c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Paint h;
    private Paint i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float[] n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private long v;
    private float w;

    public WeightChartView(Context context) {
        this(context, null);
    }

    private void b(Canvas canvas, int i) {
        if (i == 161) {
            return;
        }
        this.h.setColor(this.e);
        if (i == 0) {
            float[] fArr = this.n;
            canvas.drawLines(fArr, 4, fArr.length - 8, this.h);
        } else {
            float[] fArr2 = this.n;
            canvas.drawLines(fArr2, i * 4, fArr2.length - ((i + 1) * 4), this.h);
        }
    }

    private void c(Canvas canvas) {
        float f = (this.c - this.o) - this.p;
        double radians = (float) Math.toRadians(this.j);
        float fSin = (float) (((double) this.l) + (Math.sin(radians) * ((double) this.c)));
        float fCos = (float) (((double) this.m) - (Math.cos(radians) * ((double) this.c)));
        double d = f;
        float fSin2 = (float) (((double) this.l) + (Math.sin(radians) * d));
        float fCos2 = (float) (((double) this.m) - (Math.cos(radians) * d));
        this.h.setColor(this.f);
        canvas.drawLine(fSin, fCos, fSin2, fCos2, this.h);
        double radians2 = (float) Math.toRadians(this.j + (this.k * 160.0f));
        canvas.drawLine((float) (((double) this.l) + (Math.sin(radians2) * ((double) this.c))), (float) (((double) this.m) - (Math.cos(radians2) * ((double) this.c))), (float) (((double) this.l) + (Math.sin(radians2) * d)), (float) (((double) this.m) - (Math.cos(radians2) * d)), this.h);
    }

    private void d(Canvas canvas, int i) {
        this.h.setColor(this.d);
        canvas.drawLines(this.n, 0, i * 4, this.h);
    }

    private void e(Canvas canvas) {
        this.i.setColor(this.g);
        canvas.drawArc(this.b, 135.0f, 270.0f, false, this.i);
        this.i.setColor(this.e);
        canvas.drawArc(this.b, 48.0f, 84.0f, false, this.i);
    }

    private void f(Canvas canvas) {
        int i = (int) (((double) (this.u * 161.0f)) + 0.5d);
        if (this.n == null) {
            float f = this.c;
            float f2 = this.o;
            float f3 = (f - f2) - this.p;
            float f4 = f - f2;
            float f5 = this.j;
            this.n = new float[644];
            int i2 = 0;
            while (i2 <= 160) {
                double radians = (float) Math.toRadians(f5);
                double d = f4;
                float fSin = (float) (((double) this.l) + (Math.sin(radians) * d));
                float fCos = (float) (((double) this.m) - (Math.cos(radians) * d));
                int i3 = i;
                double d2 = f3;
                float fSin2 = (float) (((double) this.l) + (Math.sin(radians) * d2));
                float fCos2 = (float) (((double) this.m) - (Math.cos(radians) * d2));
                float[] fArr = this.n;
                int i4 = i2 * 4;
                fArr[i4] = fSin;
                fArr[i4 + 1] = fCos;
                fArr[i4 + 2] = fSin2;
                fArr[i4 + 3] = fCos2;
                f5 += this.k;
                i2++;
                i = i3;
            }
        }
        int i5 = i;
        b(canvas, i5);
        c(canvas);
        d(canvas, i5);
    }

    private void g() {
        this.j = 225.0f;
        this.k = 1.6875f;
        this.o = ViewUtils.dp2px(this.a, 8.0f);
        this.p = ViewUtils.dp2px(this.a, 8.0f);
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setColor(this.d);
        this.h.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(2.0f);
        Paint paint2 = new Paint(1);
        this.i = paint2;
        paint2.setColor(this.g);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeWidth(2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(ValueAnimator valueAnimator) {
        this.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidateOnAnimation();
    }

    private void i(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(attributeSet, R.styleable.WeightChartView, i, 0);
        int i2 = R.styleable.WeightChartView_weightFillColor;
        Context context = this.a;
        int i3 = R.color.white_100_percent;
        this.d = typedArrayObtainStyledAttributes.getColor(i2, ContextCompat.getColor(context, i3));
        this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.WeightChartView_unFillColor, ContextCompat.getColor(this.a, R.color.white20));
        this.f = typedArrayObtainStyledAttributes.getColor(R.styleable.WeightChartView_edgeColor, ContextCompat.getColor(this.a, R.color.white40));
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.WeightChartView_circleColor, ContextCompat.getColor(this.a, i3));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void j() {
        float f = this.s;
        if (f == 0.0f) {
            this.u = 0.0f;
            return;
        }
        float f2 = this.t;
        if (f2 >= f) {
            this.u = 1.0f;
        } else {
            this.u = f2 / f;
        }
    }

    private void k() {
        float fAbs = Math.abs(this.r - this.q) / this.s;
        if (fAbs > 1.0f) {
            fAbs = 1.0f;
        }
        long jSqrt = (long) (Math.sqrt(fAbs) * 800.0d);
        this.v = jSqrt;
        if (jSqrt == 0) {
            this.v = 1L;
        }
        animRefresh().start();
    }

    public ValueAnimator animRefresh() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(this.v);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cr8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.h(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.q;
        this.t = f + ((this.r - f) * this.w);
        j();
        f(canvas);
        e(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        RectF rectF = new RectF();
        this.b = rectF;
        rectF.left = getPaddingLeft() + ViewUtils.dp2px(this.a, 3.0f);
        this.b.top = getPaddingTop() + ViewUtils.dp2px(this.a, 3.0f);
        this.b.right = (i - getPaddingRight()) - ViewUtils.dp2px(this.a, 3.0f);
        this.b.bottom = (i2 - getPaddingBottom()) - ViewUtils.dp2px(this.a, 3.0f);
        float fMin = Math.min(this.b.width(), this.b.height()) / 2.0f;
        this.c = fMin;
        RectF rectF2 = this.b;
        this.l = rectF2.left + fMin;
        this.m = fMin + rectF2.top;
    }

    public void setMaxValue(float f) {
        this.s = f;
    }

    public void setValue(float f) {
        this.q = this.r;
        float f2 = this.s;
        if (f > f2) {
            this.r = f2;
        } else {
            this.r = f;
        }
        k();
    }

    public WeightChartView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WeightChartView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = 1L;
        this.a = context;
        i(attributeSet, i);
        g();
    }
}
