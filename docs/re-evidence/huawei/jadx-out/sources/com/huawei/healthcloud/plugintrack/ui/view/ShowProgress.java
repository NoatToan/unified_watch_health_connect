package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.huawei.healthcloud.plugintrack.R;

/* JADX INFO: loaded from: classes10.dex */
public class ShowProgress extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f11297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11299c;
    private float d;
    private String e;
    private float f;
    private String g;
    private float[] h;
    private float i;
    private Paint j;
    private boolean k;
    private boolean l;
    private Paint m;
    private float n;
    private boolean o;
    private float p;
    private float r;
    private float s;
    private RectF t;

    public ShowProgress(Context context) {
        super(context);
        float[] fArr = {0.0f, 2.0f, 3.0f, 4.0f, 5.0f, 5.5f};
        this.h = fArr;
        this.f = fArr[5];
        this.i = fArr[0];
        this.f11297a = new int[]{Color.parseColor("#1F8DFF"), Color.parseColor("#75DF3E"), Color.parseColor("#E6D420"), Color.parseColor("#F5A623"), Color.parseColor("#FF3320")};
        this.f11299c = 0.0f;
        this.f11298b = 0.0f;
        this.k = true;
        this.o = false;
        this.l = true;
        a();
    }

    public ShowProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float[] fArr = {0.0f, 2.0f, 3.0f, 4.0f, 5.0f, 5.5f};
        this.h = fArr;
        this.f = fArr[5];
        this.i = fArr[0];
        this.f11297a = new int[]{Color.parseColor("#1F8DFF"), Color.parseColor("#75DF3E"), Color.parseColor("#E6D420"), Color.parseColor("#F5A623"), Color.parseColor("#FF3320")};
        this.f11299c = 0.0f;
        this.f11298b = 0.0f;
        this.k = true;
        this.o = false;
        this.l = true;
        a();
    }

    public ShowProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 2.0f, 3.0f, 4.0f, 5.0f, 5.5f};
        this.h = fArr;
        this.f = fArr[5];
        this.i = fArr[0];
        this.f11297a = new int[]{Color.parseColor("#1F8DFF"), Color.parseColor("#75DF3E"), Color.parseColor("#E6D420"), Color.parseColor("#F5A623"), Color.parseColor("#FF3320")};
        this.f11299c = 0.0f;
        this.f11298b = 0.0f;
        this.k = true;
        this.o = false;
        this.l = true;
        a();
    }

    private void a() {
        this.t = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.m = new Paint(1);
        this.j = new Paint(1);
        this.m.setTextSize(e(11.0f));
        this.m.setTextAlign(Paint.Align.CENTER);
        this.m.setColor(getResources().getColor(R.color.textColorSecondary));
        this.r = c(6.0f);
        this.d = c(2.0f);
        this.s = c(4.0f);
        this.p = c(6.0f);
        this.g = getResources().getString(R.string.IDS_motiontrack_detail_current);
        this.e = getResources().getString(R.string.IDS_motiontrack_progress_average);
        this.l = true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.n = c(1.0f);
        this.t.set(getPaddingStart(), this.r + b(this.m) + (this.s * 2.0f), (i - (this.n * (this.h.length - 2))) - getPaddingEnd(), this.r + b(this.m) + (this.s * 3.0f));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        float fB = (this.r * 2.0f) + ((b(this.m) + this.p) * 2.0f) + this.s;
        if (!this.k) {
            fB -= b(this.m) + (this.r != 0.0f ? this.p : 0.0f);
        }
        setMeasuredDimension(size, Math.round(fB));
    }

    private int[] d(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[(iArr.length - i) - 1];
        }
        return iArr2;
    }

    private float[] b(float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[(fArr.length - i) - 1];
        }
        return fArr2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o) {
            c(canvas, d(this.f11297a));
        } else {
            c(canvas, this.f11297a);
        }
        d(canvas);
    }

    private void d(Canvas canvas) {
        float f = this.f11299c;
        float f2 = this.f;
        if (f >= f2 && f2 > 10.0f) {
            this.f11299c = f2 - 1.0f;
        }
        float f3 = this.f11299c;
        float f4 = this.i;
        if (f3 <= f4 && f4 > 10.0f) {
            this.f11299c = 1.0f + f4;
        }
        float f5 = this.f11299c;
        if (f5 < f4) {
            f5 = f4;
        } else if (f5 > f2) {
            f5 = f2;
        }
        this.f11299c = f5;
        float f6 = this.f11298b;
        if (f6 < f4) {
            f2 = f4;
        } else if (f6 <= f2) {
            f2 = f6;
        }
        this.f11298b = f2;
        e(canvas);
        if (this.k) {
            a(canvas);
        }
    }

    private void e(Canvas canvas) {
        float fD;
        canvas.save();
        if (this.o) {
            fD = d(this.f11299c) - d(this.f);
        } else {
            fD = d(this.f11299c);
        }
        canvas.translate(fD, 0.0f);
        d(canvas, fD, false);
    }

    private void a(Canvas canvas) {
        float fD;
        canvas.save();
        if (this.o) {
            fD = d(this.f11298b) - d(this.f);
        } else {
            fD = d(this.f11298b);
        }
        canvas.translate(fD, 0.0f);
        d(canvas, fD, true);
    }

    private void d(Canvas canvas, float f, boolean z) {
        String str = z ? this.e : this.g;
        if (f < this.m.measureText(str) / 2.0f) {
            b(canvas, str, z, f);
        } else if (f >= this.t.right - (this.m.measureText(str) / 2.0f)) {
            e(canvas, str, z, f);
        } else {
            b(canvas, str, z);
        }
    }

    private void b(Canvas canvas, String str, boolean z) {
        float f;
        float f2;
        float fB;
        if (z) {
            f = this.t.bottom + this.d;
            f2 = this.s + f;
            fB = b(this.m) + f2;
        } else {
            f = this.t.top - this.d;
            f2 = f - this.s;
            fB = f2 - this.m.getFontMetrics().descent;
        }
        d(canvas, new c(this.t.left - 2.0f, f), new c((this.t.left - this.d) - 2.0f, f2), new c((this.t.left + this.d) - 2.0f, f2));
        canvas.drawText(str, this.t.left, fB, this.m);
        canvas.restore();
    }

    private void e(Canvas canvas, String str, boolean z, float f) {
        float f2;
        float fB;
        if (z) {
            float f3 = this.t.bottom + this.d;
            float f4 = this.t.right;
            float fMeasureText = this.m.measureText(this.g) / 2.0f;
            float f5 = this.s;
            f2 = (f4 - fMeasureText) + f5;
            float f6 = f5 + f3;
            fB = b(this.m) + f6;
            canvas.restore();
            d(canvas, new c(f2, f3), new c(f2 - this.d, f6), new c(this.d + f2, f6));
        } else {
            float f7 = this.t.top - this.d;
            float f8 = this.t.right;
            float fMeasureText2 = this.m.measureText(this.g) / 2.0f;
            float f9 = this.s;
            float f10 = f7 - f9;
            float f11 = f10 - this.m.getFontMetrics().descent;
            canvas.restore();
            d(canvas, new c(f, f7), new c(f - this.d, f10), new c(f + this.d, f10));
            f2 = (f8 - fMeasureText2) + f9;
            fB = f11;
        }
        canvas.drawText(str, f2, fB, this.m);
    }

    private void b(Canvas canvas, String str, boolean z, float f) {
        float fB;
        float fMeasureText;
        if (z) {
            float f2 = this.t.bottom + this.d;
            fMeasureText = (this.m.measureText(this.g) / 2.0f) + this.d;
            float f3 = this.s + f2;
            fB = b(this.m) + f3;
            canvas.restore();
            d(canvas, new c(fMeasureText, f2), new c(this.d + fMeasureText, f3), new c(fMeasureText - this.d, f3));
        } else {
            float f4 = this.t.top - this.d;
            float fMeasureText2 = this.m.measureText(this.g) / 2.0f;
            float f5 = f4 - this.s;
            float f6 = this.m.getFontMetrics().descent;
            canvas.restore();
            d(canvas, new c(f, f4), new c(f - this.d, f5), new c(f + this.d, f5));
            fB = f5 - f6;
            fMeasureText = fMeasureText2;
        }
        canvas.drawText(str, fMeasureText, fB, this.m);
    }

    private void d(Canvas canvas, c cVar, c cVar2, c cVar3) {
        Path path = new Path();
        path.moveTo(cVar.e(), cVar.b());
        path.lineTo(cVar2.e(), cVar2.b());
        path.lineTo(cVar3.e(), cVar3.b());
        path.close();
        canvas.drawPath(path, this.m);
    }

    private void c(Canvas canvas, int[] iArr) {
        if (this.o && this.l) {
            this.l = false;
            float[] fArrB = b(this.h);
            this.h = fArrB;
            this.i = fArrB[fArrB.length - 1];
            this.f = fArrB[0];
        }
        float f = 0.0f;
        for (int i = 0; i < this.h.length - 1; i++) {
            if (iArr.length > i) {
                this.j.setColor(iArr[i]);
                float[] fArr = this.h;
                float f2 = (((fArr[i + 1] - fArr[i]) * 1.0f) / (fArr[fArr.length - 1] - fArr[0])) * (this.t.right - this.t.left);
                if (i == 0) {
                    Path path = new Path();
                    path.addRoundRect(new RectF(this.t.left, this.t.top, this.t.left + f2, this.t.bottom), new float[]{(this.t.bottom - this.t.top) / 2.0f, (this.t.bottom - this.t.top) / 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, (this.t.bottom - this.t.top) / 2.0f, (this.t.bottom - this.t.top) / 2.0f}, Path.Direction.CCW);
                    canvas.drawPath(path, this.j);
                    f = this.t.left + f2 + this.n;
                } else if (i == this.h.length - 2) {
                    Path path2 = new Path();
                    path2.addRoundRect(new RectF(f, this.t.top, f2 + f, this.t.bottom), new float[]{0.0f, 0.0f, (this.t.bottom - this.t.top) / 2.0f, (this.t.bottom - this.t.top) / 2.0f, (this.t.bottom - this.t.top) / 2.0f, (this.t.bottom - this.t.top) / 2.0f, 0.0f, 0.0f}, Path.Direction.CCW);
                    canvas.drawPath(path2, this.j);
                    f = 0.0f;
                } else {
                    canvas.drawRect(f, this.t.top, f + f2, this.t.bottom, this.j);
                    f += f2 + this.n;
                }
            }
        }
    }

    private float d(float f) {
        float[] fArr = this.h;
        float f2 = fArr[0];
        return (((f - f2) * 1.0f) / (fArr[fArr.length - 1] - f2)) * ((this.t.right - this.t.left) + (this.n * (this.h.length - 1)));
    }

    public ShowProgress c(float... fArr) {
        this.h = fArr;
        return this;
    }

    public ShowProgress c(Integer... numArr) {
        this.h = new float[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            this.h[i] = numArr[i].intValue();
        }
        float[] fArr = this.h;
        this.f = fArr[fArr.length - 1];
        this.i = fArr[0];
        return this;
    }

    public ShowProgress c(int... iArr) {
        this.f11297a = iArr;
        return this;
    }

    private float c(float f) {
        return TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    private float e(float f) {
        return TypedValue.applyDimension(2, f, getContext().getResources().getDisplayMetrics());
    }

    private float b(Paint paint) {
        return -paint.getFontMetrics().ascent;
    }

    public ShowProgress a(float f) {
        this.f11299c = f;
        return this;
    }

    public ShowProgress b(float f) {
        this.f11298b = f;
        return this;
    }

    public ShowProgress d(boolean z) {
        this.k = z;
        return this;
    }

    public ShowProgress e(int i) {
        this.r = i;
        return this;
    }

    public ShowProgress a(int i) {
        this.m.setColor(i);
        return this;
    }

    public ShowProgress b(boolean z) {
        this.o = z;
        invalidate();
        return this;
    }

    public ShowProgress c(String str) {
        if (str != null) {
            this.g = str;
        }
        return this;
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f11300a;
        private float e;

        c(float f, float f2) {
            this.f11300a = f;
            this.e = f2;
        }

        public float e() {
            return this.f11300a;
        }

        public float b() {
            return this.e;
        }
    }
}
