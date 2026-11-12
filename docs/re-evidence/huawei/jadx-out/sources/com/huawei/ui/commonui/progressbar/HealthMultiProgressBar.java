package com.huawei.ui.commonui.progressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthMultiProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f23804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f23805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f23806c;
    private float d;
    private float e;
    private float f;
    private float[] g;
    private Paint h;
    private String i;
    private float j;
    private boolean k;
    private float l;
    private Paint m;
    private boolean n;
    private boolean o;
    private boolean p;
    private RectF q;
    private float r;
    private float s;
    private float t;

    public HealthMultiProgressBar(Context context) {
        super(context);
        float[] fArr = {2.0f, 3.0f, 4.0f, 5.0f, 5.5f};
        this.g = fArr;
        this.f = fArr[4];
        this.j = fArr[0];
        this.f23805b = new int[]{Color.parseColor("#EA8350"), Color.parseColor("#DBB546"), Color.parseColor("#44B644"), Color.parseColor("#54A8EC"), Color.parseColor("#B7BBBF")};
        this.e = 0.0f;
        this.d = 0.0f;
        this.k = false;
        this.p = false;
        this.n = false;
        this.o = true;
        b(context);
    }

    public HealthMultiProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float[] fArr = {2.0f, 3.0f, 4.0f, 5.0f, 5.5f};
        this.g = fArr;
        this.f = fArr[4];
        this.j = fArr[0];
        this.f23805b = new int[]{Color.parseColor("#EA8350"), Color.parseColor("#DBB546"), Color.parseColor("#44B644"), Color.parseColor("#54A8EC"), Color.parseColor("#B7BBBF")};
        this.e = 0.0f;
        this.d = 0.0f;
        this.k = false;
        this.p = false;
        this.n = false;
        this.o = true;
        b(context);
    }

    public HealthMultiProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {2.0f, 3.0f, 4.0f, 5.0f, 5.5f};
        this.g = fArr;
        this.f = fArr[4];
        this.j = fArr[0];
        this.f23805b = new int[]{Color.parseColor("#EA8350"), Color.parseColor("#DBB546"), Color.parseColor("#44B644"), Color.parseColor("#54A8EC"), Color.parseColor("#B7BBBF")};
        this.e = 0.0f;
        this.d = 0.0f;
        this.k = false;
        this.p = false;
        this.n = false;
        this.o = true;
        b(context);
    }

    private void b(Context context) {
        this.q = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.m = new Paint(1);
        this.h = new Paint(1);
        this.m.setTextSize(c(11.0f));
        this.m.setTextAlign(Paint.Align.CENTER);
        this.m.setColor(getResources().getColor(R.color.textColorSecondary));
        this.t = d(6.0f);
        this.l = d(1.0f);
        this.f23806c = d(2.0f);
        this.s = d(4.0f);
        this.r = d(6.0f);
        this.i = getResources().getString(R.string.IDS_motiontrack_detail_current);
        this.f23804a = getResources().getString(R.string.IDS_motiontrack_detail_average);
        this.o = true;
        this.n = LanguageUtil.ba(context);
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
        if (!this.p) {
            this.q.set(getPaddingStart(), this.t, (i - (this.l * b(this.g))) - getPaddingEnd(), this.t + this.s);
            return;
        }
        this.q.set(getPaddingStart(), this.t + c(this.m) + (this.s * 2.0f), (i - (this.l * b(this.g))) - getPaddingEnd(), this.t + c(this.m) + (this.s * 3.0f));
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        float fC = (this.t * 2.0f) + ((c(this.m) + this.r) * 2.0f) + this.s;
        if (!this.k) {
            fC -= c(this.m) + (this.t == 0.0f ? 0.0f : this.r);
        }
        if (!this.p) {
            fC -= c(this.m) + (this.t != 0.0f ? this.r : 0.0f);
        }
        setMeasuredDimension(size, Math.round(fC));
    }

    private int[] e(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[(iArr.length - i) - 1];
        }
        return iArr2;
    }

    private float[] c(float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = fArr[(fArr.length - i) - 1];
        }
        return fArr2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n) {
            d(canvas, e(this.f23805b));
        } else {
            d(canvas, this.f23805b);
        }
        d(canvas);
    }

    private void d(Canvas canvas) {
        float f = this.e;
        float f2 = this.f;
        if (f >= f2 && f2 > 10.0f) {
            this.e = f2 - 1.0f;
        }
        float f3 = this.e;
        float f4 = this.j;
        if (f3 <= f4 && f4 > 10.0f) {
            this.e = 1.0f + f4;
        }
        float f5 = this.e;
        if (f5 < f4) {
            f5 = f4;
        } else if (f5 > f2) {
            f5 = f2;
        }
        this.e = f5;
        float f6 = this.d;
        if (f6 < f4) {
            f2 = f4;
        } else if (f6 <= f2) {
            f2 = f6;
        }
        this.d = f2;
        if (this.p) {
            e(canvas);
        }
        if (this.k) {
            a(canvas);
        }
    }

    private void e(Canvas canvas) {
        float fA;
        canvas.save();
        if (this.n) {
            fA = a(this.e) - a(this.f);
        } else {
            fA = a(this.e);
        }
        canvas.translate(fA, 0.0f);
        d(canvas, fA, false);
    }

    private void a(Canvas canvas) {
        float fA;
        canvas.save();
        if (this.n) {
            fA = a(this.d) - a(this.f);
        } else {
            fA = a(this.d);
        }
        canvas.translate(fA, 0.0f);
        d(canvas, fA, true);
    }

    private void d(Canvas canvas, float f, boolean z) {
        String str = z ? this.f23804a : this.i;
        if (f < this.m.measureText(str) / 2.0f) {
            c(canvas, str, z, f);
        } else if (f >= this.q.right - (this.m.measureText(str) / 2.0f)) {
            a(canvas, str, z, f);
        } else {
            e(canvas, str, z);
        }
    }

    private void e(Canvas canvas, String str, boolean z) {
        float f;
        float f2;
        float fC;
        if (z) {
            f = this.q.bottom + this.f23806c;
            f2 = this.s + f;
            fC = c(this.m) + f2;
        } else {
            f = this.q.top - this.f23806c;
            f2 = f - this.s;
            fC = f2 - this.m.getFontMetrics().descent;
        }
        a(canvas, new e(this.q.left - 2.0f, f), new e((this.q.left - this.f23806c) - 2.0f, f2), new e((this.q.left + this.f23806c) - 2.0f, f2));
        canvas.drawText(str, this.q.left, fC, this.m);
        canvas.restore();
    }

    private void a(Canvas canvas, String str, boolean z, float f) {
        float f2;
        float fC;
        if (z) {
            float f3 = this.q.bottom + this.f23806c;
            float f4 = this.q.right;
            float fMeasureText = this.m.measureText(this.i) / 2.0f;
            float f5 = this.s;
            f2 = (f4 - fMeasureText) + f5;
            float f6 = f5 + f3;
            fC = c(this.m) + f6;
            canvas.restore();
            a(canvas, new e(f2, f3), new e(f2 - this.f23806c, f6), new e(this.f23806c + f2, f6));
        } else {
            float f7 = this.q.top - this.f23806c;
            float f8 = this.q.right;
            float fMeasureText2 = this.m.measureText(this.i) / 2.0f;
            float f9 = this.s;
            float f10 = f7 - f9;
            float f11 = f10 - this.m.getFontMetrics().descent;
            canvas.restore();
            a(canvas, new e(f, f7), new e(f - this.f23806c, f10), new e(f + this.f23806c, f10));
            f2 = (f8 - fMeasureText2) + f9;
            fC = f11;
        }
        canvas.drawText(str, f2, fC, this.m);
    }

    private void c(Canvas canvas, String str, boolean z, float f) {
        float fC;
        float fMeasureText;
        if (z) {
            float f2 = this.q.bottom + this.f23806c;
            fMeasureText = (this.m.measureText(this.i) / 2.0f) + this.f23806c;
            float f3 = this.s + f2;
            fC = c(this.m) + f3;
            canvas.restore();
            a(canvas, new e(fMeasureText, f2), new e(this.f23806c + fMeasureText, f3), new e(fMeasureText - this.f23806c, f3));
        } else {
            float f4 = this.q.top - this.f23806c;
            float fMeasureText2 = this.m.measureText(this.i) / 2.0f;
            float f5 = f4 - this.s;
            float f6 = this.m.getFontMetrics().descent;
            canvas.restore();
            a(canvas, new e(f, f4), new e(f - this.f23806c, f5), new e(f + this.f23806c, f5));
            fC = f5 - f6;
            fMeasureText = fMeasureText2;
        }
        canvas.drawText(str, fMeasureText, fC, this.m);
    }

    private void a(Canvas canvas, e eVar, e eVar2, e eVar3) {
        Path path = new Path();
        path.moveTo(eVar.a(), eVar.d());
        path.lineTo(eVar2.a(), eVar2.d());
        path.lineTo(eVar3.a(), eVar3.d());
        path.close();
        canvas.drawPath(path, this.m);
    }

    private void d(Canvas canvas, int[] iArr) {
        if (this.n && this.o) {
            this.o = false;
            float[] fArrC = c(this.g);
            this.g = fArrC;
            this.j = fArrC[fArrC.length - 1];
            this.f = fArrC[0];
        }
        for (int i = 0; i < this.g.length - 1; i++) {
            if (iArr.length > i) {
                this.h.setColor(iArr[i]);
                float f = this.q.right - this.q.left;
                float[] fArr = this.g;
                float f2 = (((fArr[i + 1] - fArr[i]) * 1.0f) / (fArr[fArr.length - 1] - fArr[0])) * f;
                if (Math.abs(f2 - f) < 0.1d && i <= this.g.length - 2) {
                    Path path = new Path();
                    path.addRoundRect(new RectF(this.q.left, this.q.top, this.q.left + f2, this.q.bottom), new float[]{(this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f}, Path.Direction.CCW);
                    canvas.drawPath(path, this.h);
                    return;
                } else if (f2 != 0.0f) {
                    b(true, f2, canvas, 0.0f, i);
                }
            }
        }
    }

    private float a(float f) {
        float[] fArr = this.g;
        float f2 = fArr[0];
        return (((f - f2) * 1.0f) / (fArr[fArr.length - 1] - f2)) * ((this.q.right - this.q.left) + (this.l * (this.g.length - 1)));
    }

    public HealthMultiProgressBar a(Integer... numArr) {
        float[] fArr;
        float[] fArr2 = new float[numArr.length + 1];
        this.g = fArr2;
        fArr2[0] = 0.0f;
        int i = 1;
        while (true) {
            fArr = this.g;
            if (i >= fArr.length) {
                break;
            }
            int i2 = i - 1;
            fArr[i] = numArr[i2].intValue() + this.g[i2];
            i++;
        }
        float f = fArr[fArr.length - 1];
        this.f = f;
        float f2 = fArr[0];
        this.j = f2;
        if (f >= f2) {
            return this;
        }
        LogUtil.j("HealthMultiProgressBar", "savePersentData input error");
        return null;
    }

    public HealthMultiProgressBar e(int i) {
        this.l = d(i);
        return this;
    }

    private float d(float f) {
        return TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    private float c(float f) {
        return TypedValue.applyDimension(2, f, getContext().getResources().getDisplayMetrics());
    }

    private int b(float[] fArr) {
        int i = 0;
        int i2 = 0;
        while (i < fArr.length - 1) {
            int i3 = i + 1;
            if (Math.abs(fArr[i3] - fArr[i]) > 0.1d) {
                i2++;
            }
            i = i3;
        }
        return i2 - 1;
    }

    private float c(Paint paint) {
        return -paint.getFontMetrics().ascent;
    }

    public HealthMultiProgressBar c(int i) {
        this.t = d(i);
        return this;
    }

    private void b(boolean z, float f, Canvas canvas, float f2, int i) {
        if (z) {
            Path path = new Path();
            path.addRoundRect(new RectF(this.q.left, this.q.top, this.q.left + f, this.q.bottom), new float[]{(this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f}, Path.Direction.CCW);
            canvas.drawPath(path, this.h);
            float f3 = this.q.left;
            return;
        }
        float[] fArr = this.g;
        float f4 = fArr[i + 1];
        float f5 = this.f;
        if ((f4 == f5 && fArr[fArr.length - 1] == f5) || (fArr[fArr.length - 1] == this.j && i == fArr.length - 2)) {
            Path path2 = new Path();
            path2.addRoundRect(new RectF(f2, this.q.top, f2 + f, this.q.bottom), new float[]{0.0f, 0.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, (this.q.bottom - this.q.top) / 2.0f, 0.0f, 0.0f}, Path.Direction.CCW);
            canvas.drawPath(path2, this.h);
            return;
        }
        canvas.drawRect(f2, this.q.top, f2 + f, this.q.bottom, this.h);
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f23807b;
        private float e;

        e(float f, float f2) {
            this.f23807b = f;
            this.e = f2;
        }

        public float a() {
            return this.f23807b;
        }

        public float d() {
            return this.e;
        }
    }
}
