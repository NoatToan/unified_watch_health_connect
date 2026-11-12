package com.huawei.ui.commonui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.huawei.ui.commonui.R;
import defpackage.qre;
import health.compact.a.UnitUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GradientShadow extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ObjectAnimator f23981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23982c;
    private long d;
    private float e;
    private int[] f;
    private final Matrix g;
    private boolean h;
    private LinearGradient i;
    private float j;
    private float[] k;
    private float l;
    private final Path m;
    private final RectF n;
    private final Paint o;
    private float t;

    public GradientShadow(Context context) {
        super(context);
        this.o = new Paint(1);
        this.n = new RectF();
        this.m = new Path();
        this.g = new Matrix();
        d(context, null);
    }

    public GradientShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new Paint(1);
        this.n = new RectF();
        this.m = new Path();
        this.g = new Matrix();
        d(context, attributeSet);
    }

    public GradientShadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new Paint(1);
        this.n = new RectF();
        this.m = new Path();
        this.g = new Matrix();
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        b(context, attributeSet);
        a();
        b();
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.GradientShadow);
        this.h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.GradientShadow_gradientShadowIsClockwise, false);
        this.l = typedArrayObtainStyledAttributes.getDimension(R.styleable.GradientShadow_gradientShadowOffset, qre.a(R.dimen.health_common_6dp));
        this.f23982c = typedArrayObtainStyledAttributes.getFloat(R.styleable.GradientShadow_gradientShadowAlpha, 0.0f);
        this.f23980a = typedArrayObtainStyledAttributes.getFloat(R.styleable.GradientShadow_gradientShadowBlurRadius, 0.0f);
        this.e = typedArrayObtainStyledAttributes.getFloat(R.styleable.GradientShadow_gradientShadowAngle, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getInteger(R.styleable.GradientShadow_gradientShadowAnimatorDuration, 0);
        this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.GradientShadow_gradientShadowBorderWidth, qre.a(R.dimen.health_common_1dp));
        this.t = typedArrayObtainStyledAttributes.getDimension(R.styleable.GradientShadow_gradientShadowRoundCornerRadius, qre.a(R.dimen.health_common_32dp));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.GradientShadow_gradientShadowColorArray, 0);
        if (resourceId != 0) {
            this.f = qre.h(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.GradientShadow_gradientShadowPositionArray, 0);
        if (resourceId2 != 0) {
            String[] strArrG = qre.g(resourceId2);
            int length = strArrG.length;
            this.k = new float[length];
            for (int i = 0; i < length; i++) {
                this.k[i] = Float.parseFloat(strArrG[i]);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a() {
        if (this.f23980a <= 0.0f) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            setLayerType(2, null);
            float f = this.f23980a;
            setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
        } else {
            setLayerType(1, null);
            Paint paint = this.o;
            if (paint == null) {
                return;
            }
            paint.setMaskFilter(new BlurMaskFilter(this.f23980a, BlurMaskFilter.Blur.NORMAL));
        }
    }

    private void b() {
        Paint paint = this.o;
        if (paint == null) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        this.o.setStrokeCap(Paint.Cap.ROUND);
        this.o.setStrokeJoin(Paint.Join.ROUND);
        this.o.setAlpha((int) UnitUtil.d(Math.min(Math.max(this.f23982c, 0.0f), 1.0f) * 255.0f, 0));
    }

    private void e() {
        e(getWidth(), getHeight());
        postInvalidate();
    }

    private void e(int i, int i2) {
        int length;
        float f = this.l;
        this.n.set(f, f, i - f, i2 - f);
        this.m.reset();
        if (this.j >= this.n.width() / 2.0f && this.j >= this.n.height() / 2.0f) {
            Path path = this.m;
            RectF rectF = this.n;
            float f2 = this.t;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        } else {
            Path path2 = new Path();
            RectF rectF2 = this.n;
            float f3 = this.t;
            path2.addRoundRect(rectF2, f3, f3, Path.Direction.CW);
            float f4 = this.t + (this.j / 2.0f);
            RectF rectF3 = new RectF(this.n.left + this.j, this.n.top + this.j, this.n.right - this.j, this.n.bottom - this.j);
            Path path3 = new Path();
            path3.addRoundRect(rectF3, f4, f4, Path.Direction.CW);
            this.m.op(path2, path3, Path.Op.DIFFERENCE);
        }
        int[] iArr = this.f;
        if (iArr == null || (length = iArr.length) == 0) {
            return;
        }
        float[] fArr = this.k;
        if (fArr == null || fArr.length != length) {
            fArr = null;
        }
        LinearGradient linearGradient = new LinearGradient(this.n.left, this.n.top, this.n.right, this.n.bottom, this.f, fArr, Shader.TileMode.CLAMP);
        this.i = linearGradient;
        this.o.setShader(linearGradient);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            this.g.reset();
            this.g.setRotate(this.e, this.n.centerX(), this.n.centerY());
            this.i.setLocalMatrix(this.g);
        }
        canvas.drawPath(this.m, this.o);
    }

    public void setOffset(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.l, fA) == 0) {
            return;
        }
        this.l = fA;
        e();
    }

    public void setShadowAlpha(float f) {
        if (Float.compare(this.f23982c, f) == 0) {
            return;
        }
        this.f23982c = f;
        b();
        e();
    }

    public void setBlurRadius(float f) {
        if (Float.compare(this.f23980a, f) == 0) {
            return;
        }
        this.f23980a = f;
        a();
        e();
    }

    public void setAngle(float f) {
        if (Float.compare(this.e, f) == 0) {
            return;
        }
        this.e = f;
        postInvalidate();
    }

    public void setBorderWidth(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.j, fA) == 0) {
            return;
        }
        this.j = fA;
        this.o.setStrokeWidth(fA);
        e();
    }

    public void setRoundCornerRadius(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.t, fA) == 0) {
            return;
        }
        this.t = fA;
        e();
    }

    public void setColorArray(int[] iArr) {
        this.f = iArr;
        e();
    }

    public void setPositionArray(float[] fArr) {
        if (Arrays.equals(this.k, fArr)) {
            return;
        }
        this.k = fArr;
        e();
    }

    public void d() {
        b(this.h, this.d);
    }

    public void b(boolean z, long j) {
        ObjectAnimator objectAnimator = this.f23981b;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "angle", z ? 0.0f : 360.0f, z ? 360.0f : 0.0f);
            this.f23981b = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat == null) {
                return;
            }
            objectAnimatorOfFloat.setDuration(j);
            this.f23981b.setRepeatCount(-1);
            this.f23981b.setInterpolator(new LinearInterpolator());
            this.f23981b.start();
        }
    }

    public void c() {
        ObjectAnimator objectAnimator = this.f23981b;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.cancel();
    }
}
