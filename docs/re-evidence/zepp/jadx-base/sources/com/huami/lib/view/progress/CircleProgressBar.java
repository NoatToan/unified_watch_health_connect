package com.huami.lib.view.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.huami.lib.view.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CircleProgressBar extends View {
    private static final String s = CircleProgressBar.class.getSimpleName();
    private static final int t = 100;
    private static final float u = 360.0f;
    private static final float v = 90.0f;
    private static final int w = -90;
    private static final float x = 1.0f;
    private static final String y = "#fff2a670";
    private static final String z = "#ffe3e3e5";
    private final RectF a;
    private List<Paint> b;
    private final Paint c;
    private float d;
    private float e;
    private float f;
    private List<Float> g;
    private int h;
    private float i;
    private List<Integer> j;
    private List<Integer> k;
    private int l;
    private int m;
    private int n;
    private String o;
    private Context p;
    private boolean q;
    private Paint r;

    public CircleProgressBar(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        if (this.b.size() == 1) {
            if (this.q) {
                float fFloatValue = (this.g.get(0).floatValue() * 360.0f) / this.h;
                canvas.drawArc(this.a, fFloatValue, 360.0f - fFloatValue, false, this.c);
            } else {
                canvas.drawArc(this.a, 0.0f, 360.0f, false, this.c);
            }
        }
        float f = 0.0f;
        for (int i = 0; i < this.b.size(); i++) {
            float size = ((360.0f - (this.m * this.b.size())) * this.g.get(i).floatValue()) / this.h;
            HMLog.d(s, toString() + "value: " + this.g.get(i) + " angle: " + f + " , " + size + " color " + this.b.get(i).getColor() + " max " + this.h, new Object[0]);
            int i2 = this.m;
            if (i == 0) {
                i2 /= 2;
            }
            float f2 = i2;
            canvas.drawArc(this.a, f + f2, size, false, this.b.get(i));
            f = f + size + f2;
        }
    }

    private void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleProgressBar);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CircleProgressBar_progress_stroke_width, (int) ViewUtils.dp2px(getContext(), 1.0f));
        this.l = typedArrayObtainStyledAttributes.getColor(R.styleable.CircleProgressBar_progress_background_color, Color.parseColor(z));
        this.n = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleProgressBar_progress_start_degree, -90);
        this.q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CircleProgressBar_drawBackgroundOutsideProgress, false);
        this.m = typedArrayObtainStyledAttributes.getInt(R.styleable.CircleProgressBar_divider_angle, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c() {
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(this.i);
        this.c.setColor(this.l);
        this.c.setStrokeCap(Paint.Cap.ROUND);
        this.r.setColor(Color.parseColor("#333333"));
        this.r.setTextSize(ViewUtils.sp2px(this.p, 20.2f));
    }

    private void d() {
        for (int i = 0; i < this.b.size(); i++) {
            int iIntValue = this.j.get(i).intValue();
            int iIntValue2 = this.k.get(i).intValue();
            if (iIntValue != iIntValue2) {
                RectF rectF = this.a;
                float f = rectF.left;
                LinearGradient linearGradient = new LinearGradient(f, rectF.top, f, rectF.bottom, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
                Matrix matrix = new Matrix();
                matrix.setRotate(90.0f, this.e, this.f);
                linearGradient.setLocalMatrix(matrix);
                this.b.get(i).setShader(linearGradient);
            } else {
                this.b.get(i).setShader(null);
                this.b.get(i).setColor(iIntValue);
            }
        }
    }

    public int getMax() {
        return this.h;
    }

    public boolean isDrawBackgroundOutsideProgress() {
        return this.q;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(this.n, this.e, this.f);
        a(canvas);
        canvas.restore();
        if (TextUtils.isEmpty(this.o)) {
            return;
        }
        String str = this.o;
        canvas.drawText(str, this.e - (ViewUtils.calcuTextWidth(this.r, str) / 2.0f), this.f + (ViewUtils.calcuTextHeight(this.r, this.o) / 2.0f), this.r);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2;
        this.e = f;
        float f2 = i2 / 2;
        this.f = f2;
        float fMin = Math.min(f, f2);
        this.d = fMin;
        RectF rectF = this.a;
        float f3 = this.f;
        rectF.top = f3 - fMin;
        rectF.bottom = f3 + fMin;
        float f4 = this.e;
        rectF.left = f4 - fMin;
        rectF.right = f4 + fMin;
        d();
        RectF rectF2 = this.a;
        float f5 = this.i;
        rectF2.inset(f5 / 2.0f, f5 / 2.0f);
    }

    public void setCenterTxt(String str) {
        this.o = str;
        invalidate();
    }

    public void setDrawBackgroundOutsideProgress(boolean z2) {
        this.q = z2;
        invalidate();
    }

    public void setDrawColor(@NonNull int[] iArr, @NonNull int[] iArr2, @NonNull float[] fArr) {
        this.b.clear();
        this.j.clear();
        this.k.clear();
        int i = 0;
        HMLog.d(s, toString() + " setDrawableColor " + this.h, new Object[0]);
        for (int i2 : iArr) {
            this.j.add(Integer.valueOf(i2));
        }
        for (int i3 : iArr2) {
            this.k.add(Integer.valueOf(i3));
        }
        int iMax = Math.max(iArr2.length, Math.max(iArr.length, fArr.length));
        this.g.clear();
        while (i < iMax) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i >= iArr.length ? -1 : iArr[i]);
            paint.setStrokeWidth(this.i);
            paint.setStyle(Paint.Style.STROKE);
            if (iMax == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
            this.g.add(Float.valueOf(fArr[i]));
            this.b.add(paint);
            i++;
        }
        d();
        invalidate();
    }

    public void setMax(int i) {
        HMLog.d(s, "setMax ", new Object[0]);
        this.h = i;
        invalidate();
    }

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new RectF();
        this.b = new ArrayList();
        this.c = new Paint(1);
        this.g = new ArrayList();
        this.h = 100;
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = 0;
        this.o = "";
        this.r = new Paint(1);
        this.p = context;
        b(context, attributeSet);
        c();
    }
}
