package com.xiaomi.fitness.rn.modules.bvlineargradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import defpackage.exh;

/* JADX INFO: loaded from: classes8.dex */
public class LinearGradientView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f12810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f12811b;
    public RectF c;
    public LinearGradient d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public boolean i;
    public float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f12812k;
    public int[] l;
    public float[] m;

    public LinearGradientView(Context context) {
        super(context);
        this.f12810a = new Paint(1);
        this.f = new float[]{0.0f, 0.0f};
        this.g = new float[]{0.0f, 1.0f};
        this.i = false;
        this.j = new float[]{0.5f, 0.5f};
        this.f12812k = 45.0f;
        this.l = new int[]{0, 0};
        this.m = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public final float[] a(float f) {
        float fSqrt = (float) Math.sqrt(2.0d);
        double d = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d)) * fSqrt, ((float) Math.sin(d)) * fSqrt};
    }

    public final void b() {
        int[] iArr = this.h;
        if (iArr != null) {
            float[] fArr = this.e;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.f;
                float[] fArr3 = this.g;
                if (this.i && this.j != null) {
                    float[] fArrA = a(this.f12812k);
                    float[] fArr4 = this.j;
                    float f = fArr4[0];
                    float f2 = fArrA[0];
                    float f3 = fArr4[1];
                    float f4 = fArrA[1];
                    float[] fArr5 = {f - (f2 / 2.0f), f3 - (f4 / 2.0f)};
                    fArr3 = new float[]{f + (f2 / 2.0f), f3 + (f4 / 2.0f)};
                    fArr2 = fArr5;
                }
                float f5 = fArr2[0];
                int[] iArr2 = this.l;
                int i = iArr2[0];
                float f6 = i * f5;
                float f7 = fArr2[1];
                int i2 = iArr2[1];
                LinearGradient linearGradient = new LinearGradient(f6, f7 * i2, fArr3[0] * i, fArr3[1] * i2, this.h, this.e, Shader.TileMode.CLAMP);
                this.d = linearGradient;
                this.f12810a.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public final void c() {
        if (this.f12811b == null) {
            this.f12811b = new Path();
            this.c = new RectF();
        }
        this.f12811b.reset();
        RectF rectF = this.c;
        int[] iArr = this.l;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f12811b.addRoundRect(this.c, this.m, Path.Direction.CW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f12811b;
        if (path == null) {
            canvas.drawPaint(this.f12810a);
        } else {
            canvas.drawPath(path, this.f12810a);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.l = new int[]{i, i2};
        c();
        b();
    }

    public void setAngle(float f) {
        this.f12812k = f;
        b();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.j = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = exh.c((float) readableArray.getDouble(i));
        }
        this.m = fArr;
        c();
        b();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.h = iArr;
        b();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.e = fArr;
        b();
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        b();
    }

    public void setUseAngle(boolean z) {
        this.i = z;
        b();
    }
}
