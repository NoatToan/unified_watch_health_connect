package com.huawei.ui.commonui.progressbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qqf;

/* JADX INFO: loaded from: classes16.dex */
public class CircleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f23798a;
    private float aa;
    private boolean ab;
    private Paint ac;
    private float[] ad;
    private float ae;
    private float af;
    private int ag;
    private SweepGradient ah;
    private Matrix ai;
    private float ak;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23800c;
    private Matrix d;
    private int[] e;
    private float f;
    private float g;
    private SweepGradient h;
    private float[] i;
    private float j;
    private int k;
    private Paint l;
    private float m;
    private float n;
    private int[] o;
    private Bitmap p;
    private float q;
    private int r;
    private float s;
    private Rect t;
    private boolean u;
    private int v;
    private boolean w;
    private boolean x;
    private int y;
    private RectF z;

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Matrix();
        this.ai = new Matrix();
        this.u = true;
        this.w = true;
        this.ab = true;
        this.m = 0.0f;
        this.af = 0.0f;
        this.k = 0;
        this.f23799b = -3355444;
        this.ag = -16776961;
        this.n = TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
        this.ae = 1.0f;
        this.f23798a = new ValueAnimator();
        this.ak = 0.0f;
        this.g = 0.0f;
        this.v = 0;
        this.r = 0;
        this.q = 0.0f;
        this.s = 0.0f;
        this.j = 0.0f;
        this.f = 0.0f;
        this.aa = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.circleProgressBar, i, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.circleProgressBar_bottomCircleColor) {
                this.f23799b = typedArrayObtainStyledAttributes.getColor(index, -3355444);
            } else if (index == R.styleable.circleProgressBar_processColor) {
                this.ag = typedArrayObtainStyledAttributes.getColor(index, -16776961);
            } else if (index == R.styleable.circleProgressBar_circleWidth) {
                this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics()));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        this.l.setDither(true);
        Paint paint2 = new Paint();
        this.ac = paint2;
        paint2.setAntiAlias(true);
        this.ac.setDither(true);
    }

    public void setCircleAngle(float f, float f2, float f3) {
        this.j = f;
        this.f = f3;
        this.aa = f2;
    }

    public void setStartIconRes(int i, float f, float f2, float f3, float f4) {
        if (this.y != i) {
            this.p = null;
        }
        this.y = i;
        this.v = (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        this.r = (int) TypedValue.applyDimension(1, f2, getResources().getDisplayMetrics());
        this.q = f3;
        this.s = f4;
    }

    public void setCircleWidth(float f) {
        float fApplyDimension = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
        this.n = fApplyDimension;
        this.l.setStrokeWidth(fApplyDimension * this.ae);
        LogUtil.a("CircleProgressBar", "setCircleWidth circleWidth = ", Float.valueOf(this.n * this.ae));
        invalidate();
    }

    public void setCircleScale(float f) {
        this.ae = f;
    }

    public void setBottomCircleColor(int i) {
        this.w = true;
        this.f23799b = i;
        this.l.setColor(i);
        invalidate();
    }

    public void setBottomCircleGradientColor(int[] iArr, float[] fArr, int i) {
        if (iArr == null || iArr.length == 0) {
            Log.i("CircleProgressBar", "GradientColor colorArray cannot be null");
            return;
        }
        this.w = false;
        if (fArr != null && iArr.length != fArr.length) {
            throw new IllegalArgumentException("positionArray length must be same as colorArray");
        }
        int[] iArr2 = new int[iArr.length];
        this.e = iArr2;
        try {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        } catch (IndexOutOfBoundsException unused) {
            health.compact.a.util.LogUtil.c("CircleProgressBar", "index exception");
            int i2 = this.f23799b;
            this.e = new int[]{i2, i2};
        }
        if (fArr != null) {
            for (int i3 = 0; i3 < fArr.length; i3++) {
                this.i[i3] = fArr[i3];
            }
        }
        this.g = i;
    }

    public void setCircleOverlap(boolean z) {
        this.x = z;
    }

    public void setIsIconVisible(boolean z) {
        this.ab = z;
    }

    public void setProgressColor(int i) {
        this.u = true;
        this.ag = i;
        this.l.setColor(i);
        invalidate();
    }

    public void setProgressGradientColor(int[] iArr, float[] fArr, float f) {
        if (iArr == null || iArr.length == 0) {
            Log.i("CircleProgressBar", "GradientColor colorArray cannot be null");
            return;
        }
        this.u = false;
        if (fArr != null && iArr.length != fArr.length) {
            throw new IllegalArgumentException("positionArray length must be same as colorArray");
        }
        int[] iArr2 = new int[iArr.length];
        this.o = iArr2;
        try {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        } catch (IndexOutOfBoundsException unused) {
            health.compact.a.util.LogUtil.c("CircleProgressBar", "index exception");
            int i = this.ag;
            this.o = new int[]{i, i};
        }
        if (fArr != null) {
            for (int i2 = 0; i2 < fArr.length; i2++) {
                this.ad[i2] = fArr[i2];
            }
        }
        this.ak = f;
    }

    public void b() {
        d(0.0f, null, 0);
    }

    public void c(float f) {
        d(f, null, 0);
    }

    public void d(float f, BaseInterpolator baseInterpolator, int i) {
        health.compact.a.util.LogUtil.a("CircleProgressBar", "showProcess targetPercent = ", Float.valueOf(f));
        float fMax = f < 0.0f ? 0.0f : f;
        if (f > 100.0f) {
            fMax = Math.max(f % 100.0f, 0.3f) + 100.0f;
        }
        float f2 = (this.x || f <= 100.0f) ? fMax : 100.0f;
        if (baseInterpolator == null) {
            this.m = f2;
            invalidate();
            return;
        }
        if (i <= 0) {
            this.m = f2;
            invalidate();
            return;
        }
        health.compact.a.util.LogUtil.a("CircleProgressBar", "showProcess true settingPercent = ", Float.valueOf(f2));
        ValueAnimator valueAnimator = this.f23798a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, f2);
        this.f23798a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.huawei.ui.commonui.progressbar.CircleProgressBar.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CircleProgressBar.this.m = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                CircleProgressBar.this.invalidate();
            }
        });
        this.f23798a.setInterpolator(baseInterpolator);
        this.f23798a.setDuration(i);
        this.f23798a.start();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.max(size, size2), Math.max(size, size2));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        this.k = width;
        float f = width - ((this.n * this.ae) / 2.0f);
        this.af = f;
        if (this.z == null) {
            float f2 = width;
            float f3 = f2 - f;
            float f4 = f2 + f;
            this.z = new RectF(f3, f3, f4, f4);
        }
        this.l.setStrokeWidth(this.n * this.ae);
        b(canvas, this.z);
        d(canvas, this.z);
        a(canvas, this.z);
        d(canvas);
    }

    private void d(Canvas canvas, RectF rectF) {
        if (!this.x || this.m <= 100.0f) {
            return;
        }
        this.ac.setColor(BaseApplication.b().getColor(R.color.common_black_3alpha));
        this.ac.setStrokeWidth((this.n - 6.0f) * this.ae);
        this.ac.setShader(null);
        this.ac.setStyle(Paint.Style.STROKE);
        this.ac.setStrokeCap(Paint.Cap.ROUND);
        this.ac.setShadowLayer(7.0f, 0.0f, 0.0f, BaseApplication.b().getColor(R.color.common_black_30alpha));
        canvas.drawArc(rectF, this.aa, (((this.m - 100.0f) / 100.0f) * Math.abs(this.f)) + ((3.0f / (getWidth() / TypedValue.applyDimension(1, 158.0f, BaseApplication.b().getResources().getDisplayMetrics()))) * this.ae), false, this.ac);
    }

    private void d(Canvas canvas) {
        int i;
        if (this.ab && (i = this.y) != 0) {
            if (this.p == null) {
                this.p = qqf.c(i);
            }
            if (this.p == null) {
                Log.i("CircleProgressBar", "decodeResource bitmap res failed, resId: " + this.y);
            } else {
                if (this.t == null) {
                    this.t = getIconRect();
                }
                canvas.drawBitmap(this.p, (Rect) null, this.t, (Paint) null);
            }
        }
    }

    private Rect getIconRect() {
        double dSin = Math.sin(Math.toRadians(this.j));
        double dCos = Math.cos(Math.toRadians(this.j));
        double d = this.af;
        float f = this.q;
        float f2 = this.ae;
        float f3 = (float) ((dCos * d) + d + ((double) (f * f2)));
        float f4 = (float) (d + (dSin * d) + ((double) (this.s * f2)));
        float f5 = (this.v * f2) / 2.0f;
        float f6 = (this.r * f2) / 2.0f;
        return new Rect((int) (f3 - f5), (int) (f4 - f6), (int) (f3 + f5), (int) (f4 + f6));
    }

    private void b(Canvas canvas, RectF rectF) {
        if (this.w) {
            this.l.setColor(this.f23799b);
        } else if (this.m > 100.0f) {
            a(this.o);
        } else {
            a(this.e);
        }
        this.l.setShader(null);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setShader(this.h);
        this.l.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawArc(rectF, this.j, this.f, false, this.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private void a(Canvas canvas, RectF rectF) {
        if (this.x) {
            float f = this.m;
            if (f > 100.0f) {
                this.f23800c = ((f - 100.0f) / 100.0f) * Math.abs(this.f);
            } else {
                this.f23800c = (this.m / 100.0f) * Math.abs(this.f);
            }
        } else {
            this.f23800c = (this.m / 100.0f) * Math.abs(this.f);
        }
        if (this.u) {
            this.l.setColor(this.ag);
        } else {
            e();
        }
        this.l.setShader(null);
        this.l.setStyle(Paint.Style.STROKE);
        this.l.setShader(this.ah);
        this.l.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawArc(rectF, this.aa, this.f23800c, false, this.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private void e() {
        float f;
        if (this.x) {
            float f2 = this.m;
            if (f2 > 100.0f) {
                this.f23800c = ((f2 - 100.0f) / 100.0f) * Math.abs(this.f);
            } else {
                this.f23800c = (this.m / 100.0f) * Math.abs(this.f);
            }
        } else {
            this.f23800c = (this.m / 100.0f) * Math.abs(this.f);
        }
        if (!this.x || this.m <= 100.0f) {
            f = this.f;
        } else {
            f = this.f23800c;
        }
        float f3 = f / 360.0f;
        this.ad = new float[this.o.length];
        int i = 0;
        while (true) {
            int[] iArr = this.o;
            if (i >= iArr.length) {
                break;
            }
            this.ad[i] = (i * f3) / (iArr.length - 1);
            i++;
        }
        float f4 = this.k;
        this.ah = new SweepGradient(f4, f4, this.o, this.ad);
        if (this.ai == null) {
            this.ai = new Matrix();
        }
        Matrix matrix = this.ai;
        float f5 = this.aa - this.ak;
        float f6 = this.k;
        matrix.setRotate(f5, f6, f6);
        this.ah.setLocalMatrix(this.ai);
    }

    private void a(int[] iArr) {
        float f = this.f / 360.0f;
        this.i = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.i[i] = (i * f) / (iArr.length - 1);
        }
        float f2 = this.k;
        this.h = new SweepGradient(f2, f2, iArr, this.i);
        if (this.d == null) {
            this.d = new Matrix();
        }
        Matrix matrix = this.d;
        float f3 = this.j - this.g;
        float f4 = this.k;
        matrix.setRotate(f3, f4, f4);
        this.h.setLocalMatrix(this.d);
    }
}
