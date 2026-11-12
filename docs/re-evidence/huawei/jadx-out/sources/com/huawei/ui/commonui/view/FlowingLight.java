package com.huawei.ui.commonui.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.huawei.ui.commonui.R;
import defpackage.qre;
import health.compact.a.CommonUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public class FlowingLight extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f23971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f23972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23973c;
    private long d;
    private ObjectAnimator e;
    private LinearGradient f;
    private boolean g;
    private float[] h;
    private final Paint i;
    private final Matrix j;
    private float l;
    private float m;
    private final RectF o;

    public FlowingLight(Context context) {
        super(context);
        this.i = new Paint(1);
        this.j = new Matrix();
        this.o = new RectF();
        c(context, (AttributeSet) null);
    }

    public FlowingLight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Paint(1);
        this.j = new Matrix();
        this.o = new RectF();
        c(context, attributeSet);
    }

    public FlowingLight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Paint(1);
        this.j = new Matrix();
        this.o = new RectF();
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        b(context, attributeSet);
        b();
    }

    private void b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FlowingLight);
        this.g = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlowingLight_flowingLightIsClockwise, false);
        this.f23973c = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlowingLight_flowingLightAngle, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getInteger(R.styleable.FlowingLight_flowingLightAnimatorDuration, 0);
        this.m = typedArrayObtainStyledAttributes.getDimension(R.styleable.FlowingLight_flowingLightWidth, qre.a(R.dimen.health_common_1dp));
        this.l = typedArrayObtainStyledAttributes.getDimension(R.styleable.FlowingLight_flowingLightRoundCornerRadius, qre.a(R.dimen.health_common_32dp));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.FlowingLight_flowingLightColorArray, 0);
        if (resourceId != 0) {
            this.f23971a = qre.h(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.FlowingLight_flowingLightPositionArray, 0);
        if (resourceId2 != 0) {
            String[] strArrG = qre.g(resourceId2);
            int length = strArrG.length;
            this.h = new float[length];
            for (int i = 0; i < length; i++) {
                this.h[i] = CommonUtils.f(strArrG[i]);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void b() {
        this.i.setStrokeWidth(this.m);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeCap(Paint.Cap.ROUND);
        this.i.setStrokeJoin(Paint.Join.ROUND);
    }

    private void c() {
        a(getWidth(), getHeight());
        postInvalidate();
    }

    private void a(int i, int i2) {
        int length;
        float f = this.m / 2.0f;
        this.o.set(f, f, i - f, i2 - f);
        this.f23972b = this.l + f;
        int[] iArr = this.f23971a;
        if (iArr == null || (length = iArr.length) == 0) {
            return;
        }
        float[] fArr = this.h;
        if (fArr == null || fArr.length != length) {
            fArr = null;
        }
        LinearGradient linearGradient = new LinearGradient(this.o.left, this.o.top, this.o.right, this.o.bottom, this.f23971a, fArr, Shader.TileMode.CLAMP);
        this.f = linearGradient;
        this.i.setShader(linearGradient);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f != null) {
            this.j.reset();
            this.j.setRotate(this.f23973c, this.o.centerX(), this.o.centerY());
            this.f.setLocalMatrix(this.j);
        }
        RectF rectF = this.o;
        float f = this.f23972b;
        canvas.drawRoundRect(rectF, f, f, this.i);
    }

    public void setAngle(float f) {
        if (Float.compare(this.f23973c, f) == 0) {
            return;
        }
        this.f23973c = f;
        postInvalidate();
    }

    public void setBorderWidth(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.m, fA) == 0) {
            return;
        }
        this.m = fA;
        this.i.setStrokeWidth(fA);
        c();
    }

    public void setRoundCornerRadius(int i) {
        float fA = qre.a(i);
        if (Float.compare(this.l, fA) == 0) {
            return;
        }
        this.l = fA;
        c();
    }

    public void setColorArray(int[] iArr) {
        this.f23971a = iArr;
        c();
    }

    public void setPositionArray(float[] fArr) {
        if (Arrays.equals(this.h, fArr)) {
            return;
        }
        this.h = fArr;
        c();
    }

    public void a() {
        c(this.g, this.d);
    }

    public void c(boolean z, long j) {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "angle", z ? 0.0f : 360.0f, z ? 360.0f : 0.0f);
            this.e = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat == null) {
                return;
            }
            objectAnimatorOfFloat.setDuration(j);
            this.e.setRepeatCount(-1);
            this.e.setInterpolator(new LinearInterpolator());
            this.e.start();
        }
    }

    public void e() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.cancel();
    }
}
