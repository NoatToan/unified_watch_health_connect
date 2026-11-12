package com.huawei.health.recognizekit.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.health.recognizekit.R;
import defpackage.qrs;
import java.lang.reflect.Array;
import java.util.Random;

/* JADX INFO: loaded from: classes8.dex */
public class RecognizeScanView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[][] f8692c;
    private boolean d;
    private boolean[][] e;
    private float f;
    private float g;
    private Random h;
    private Drawable i;
    private int j;
    private float k;
    private float l;
    private Paint m;
    private float n;
    private float o;
    private boolean[][] r;

    public RecognizeScanView(Context context) {
        super(context);
        this.n = 15.0f;
        this.h = new Random();
        this.d = false;
        d(context);
    }

    public RecognizeScanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 15.0f;
        this.h = new Random();
        this.d = false;
        d(context);
    }

    private void d(Context context) {
        Paint paint = new Paint(1);
        this.m = paint;
        paint.setColor(-1);
        this.i = ContextCompat.getDrawable(context, R.drawable.scanline);
        this.g = qrs.d(context, 16.0f);
        this.k = qrs.d(context, 16.0f);
        float fD = qrs.d(context, 92.0f);
        this.l = fD;
        this.o = fD;
        this.f8691b = qrs.d(context, 2.0f);
        this.f = qrs.d(context, 20.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.f;
        this.f8690a = ((int) Math.floor((i - (f / 2.0f)) / f)) + 1;
        float f2 = i2;
        float f3 = this.f;
        int iFloor = ((int) Math.floor((f2 - (f3 / 2.0f)) / f3)) + 1;
        this.j = iFloor;
        this.r = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iFloor, this.f8690a);
        this.f8692c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.j, this.f8690a);
        this.e = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.j, this.f8690a);
        for (int i5 = 0; i5 < this.j; i5++) {
            for (int i6 = 0; i6 < this.f8690a; i6++) {
                this.f8692c[i5][i6] = this.h.nextInt(205) + 50;
                this.e[i5][i6] = this.h.nextBoolean();
            }
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d) {
            for (int i = 0; i < this.j; i++) {
                for (int i2 = 0; i2 < this.f8690a; i2++) {
                    float f = i2;
                    float f2 = this.f;
                    float f3 = f2 / 2.0f;
                    float f4 = (i * f2) + f3;
                    if (this.r[i][i2]) {
                        float fMax = Math.max(0.0f, Math.min((1.0f - ((this.o - f4) / 500.0f)) * 255.0f, 255.0f));
                        if (this.e[i][i2]) {
                            float[] fArr = this.f8692c[i];
                            fArr[i2] = fArr[i2] + this.h.nextInt(3);
                            if (this.f8692c[i][i2] > 255.0f) {
                                this.e[i][i2] = false;
                            }
                        } else {
                            float[] fArr2 = this.f8692c[i];
                            fArr2[i2] = fArr2[i2] - this.h.nextInt(3);
                            if (this.f8692c[i][i2] < 50.0f) {
                                this.e[i][i2] = true;
                            }
                        }
                        this.m.setAlpha((int) (fMax * (this.f8692c[i][i2] / 255.0f)));
                    } else {
                        this.m.setAlpha(0);
                        if (f4 <= this.o) {
                            this.r[i][i2] = true;
                        }
                    }
                    canvas.drawCircle((f * f2) + f3, f4, this.f8691b / 2.0f, this.m);
                }
            }
            c(canvas);
            float f5 = this.o + this.n;
            this.o = f5;
            if (f5 > getHeight()) {
                this.o = this.l;
                c();
            }
            postInvalidateOnAnimation();
        }
    }

    private void c() {
        for (int i = 0; i < this.j; i++) {
            for (int i2 = 0; i2 < this.f8690a; i2++) {
                this.r[i][i2] = false;
            }
        }
    }

    private void c(Canvas canvas) {
        Drawable drawable = this.i;
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = this.i.getIntrinsicHeight();
        float width = getWidth();
        float f = this.g;
        float f2 = (width - f) - this.k;
        float f3 = this.o;
        float f4 = (intrinsicHeight * (f2 / intrinsicWidth)) / 2.0f;
        this.i.setBounds((int) f, (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.i.draw(canvas);
    }
}
