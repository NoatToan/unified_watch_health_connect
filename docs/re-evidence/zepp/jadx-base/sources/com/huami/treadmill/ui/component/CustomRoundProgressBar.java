package com.huami.treadmill.ui.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.huami.treadmill.R;

/* JADX INFO: loaded from: classes15.dex */
public class CustomRoundProgressBar extends View {
    private Paint A;
    private float a;
    private RectF b;
    private int c;
    private Paint d;
    private RectF e;
    private int f;
    private int g;
    private Paint h;
    private float i;
    private float j;
    private int k;
    private Paint l;
    private float m;
    private float n;
    private int o;
    private Paint p;
    private float q;
    private String[] r;
    private int s;
    private float t;
    private int u;
    private Paint v;
    private int w;
    private int x;
    private int y;
    private Bitmap z;

    public CustomRoundProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 345.0f;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = -16777216;
        this.h = null;
        this.i = 0.0f;
        this.j = 345.0f;
        this.k = 36557;
        this.l = null;
        this.m = 3.0f;
        this.n = 0.0f;
        this.o = -4539718;
        this.p = null;
        this.q = 45.0f;
        this.s = 100;
        this.t = 10.0f;
        this.u = DefaultTimeBar.DEFAULT_UNPLAYED_COLOR;
        this.v = null;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.CustomRoundProgressBar, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomRoundProgressBar_RoundProgressBarBackgroundColor, this.c);
        this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomRoundProgressBar_RoundProgressBarStrockColor, this.k);
        this.f = typedArrayObtainStyledAttributes.getInt(R.styleable.CustomRoundProgressBar_RoundProgressBarProgress, this.f);
        this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomRoundProgressBar_RoundProgressBarProgressColor, this.g);
        this.i = typedArrayObtainStyledAttributes.getDimension(R.styleable.CustomRoundProgressBar_RoundProgressBarProgressWidth, this.i);
        this.s = typedArrayObtainStyledAttributes.getInt(R.styleable.CustomRoundProgressBar_RoundProgressBarTotal, this.s);
        this.m = typedArrayObtainStyledAttributes.getDimension(R.styleable.CustomRoundProgressBar_RoundProgressBarStrockWidth, this.m);
        this.j = typedArrayObtainStyledAttributes.getDimension(R.styleable.CustomRoundProgressBar_RoundProgressBarRadius, this.j);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.CustomRoundProgressBar_RoundProgressBarText);
        this.q = typedArrayObtainStyledAttributes.getDimension(R.styleable.CustomRoundProgressBar_RoundProgressBarTextSize, this.q);
        this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomRoundProgressBar_RoundProgressBarTextColor, this.o);
        if (string != null) {
            this.r = string.split("\n");
        }
        this.u = typedArrayObtainStyledAttributes.getColor(R.styleable.CustomRoundProgressBar_RoundProgressBarProgressBgColor, this.u);
        this.t = typedArrayObtainStyledAttributes.getDimension(R.styleable.CustomRoundProgressBar_RoundProgressBarProgressBgWidth, this.t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CustomRoundProgressBar_RoundProgressBarCenterDrawable, this.y);
        this.y = resourceId;
        if (resourceId != 0) {
            this.z = BitmapFactory.decodeResource(getResources(), this.y);
        }
        typedArrayObtainStyledAttributes.recycle();
        b();
        a();
    }

    private void a() {
        this.d.setColor(this.c);
        this.l.setColor(this.k);
        this.l.setStrokeWidth(this.m);
        this.h.setColor(this.g);
        this.h.setStrokeWidth(this.i);
        this.p.setColor(this.o);
        this.p.setTextSize(this.q);
        this.n = (this.f / this.s) * 360.0f;
        this.v.setStrokeWidth(this.t);
        this.v.setColor(this.u);
    }

    private void b() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.l = paint2;
        paint2.setAntiAlias(true);
        this.l.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.h = paint3;
        paint3.setAntiAlias(true);
        this.h.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.p = paint4;
        paint4.setTextAlign(Paint.Align.CENTER);
        Paint paint5 = new Paint();
        this.v = paint5;
        paint5.setAntiAlias(true);
        this.v.setStyle(Paint.Style.STROKE);
        this.A = new Paint();
    }

    public int getBackgroundColor() {
        return this.c;
    }

    public int getProgress() {
        return this.f;
    }

    public int getProgressBackgroundColor() {
        return this.u;
    }

    public float getProgressBackgroundWidth() {
        return this.t;
    }

    public int getProgressColor() {
        return this.g;
    }

    public float getProgressWidth() {
        return this.i;
    }

    public int getStrockColor() {
        return this.k;
    }

    public float getStrockWidth() {
        return this.m;
    }

    public int getTotal() {
        return this.s;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        a();
        canvas.drawOval(this.e, this.d);
        if (this.f == 0) {
            canvas.drawCircle(this.w, this.x, this.a, this.l);
        } else {
            canvas.drawCircle(this.w, this.x, this.a, this.v);
            canvas.drawArc(this.b, -90.0f, this.n, false, this.h);
        }
        String[] strArr = this.r;
        if (strArr == null || strArr.length <= 0) {
            if (this.z != null) {
                canvas.drawBitmap(this.z, (getWidth() - this.z.getWidth()) / 2, (getHeight() - this.z.getHeight()) / 2, this.A);
                return;
            }
            return;
        }
        float fAscent = (this.x - ((this.p.ascent() + this.p.descent()) / 2.0f)) - (((strArr.length - 1) * (this.p.descent() - this.p.ascent())) / 2.0f);
        for (String str : this.r) {
            if (str != null) {
                canvas.drawText(str, this.w, fAscent, this.p);
                fAscent += this.p.descent() - this.p.ascent();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax = (int) ((this.j * 2.0f) + Math.max(this.i, this.m));
        setMeasuredDimension(View.resolveSize(getPaddingLeft() + getPaddingRight() + iMax, i), View.resolveSize(getPaddingTop() + getPaddingBottom() + iMax, i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float fMax = Math.max(this.i, this.m);
        this.a = Math.min((((i - getPaddingLeft()) - getPaddingRight()) - fMax) / 2.0f, (((i2 - getPaddingTop()) - getPaddingBottom()) - fMax) / 2.0f);
        this.w = i / 2;
        this.x = i2 / 2;
        int i5 = this.w;
        float f = this.a;
        int i6 = this.x;
        this.e = new RectF(i5 - f, i6 - f, i5 + f, i6 + f);
        int i7 = this.w;
        float f2 = this.a;
        int i8 = this.x;
        this.b = new RectF(i7 - f2, i8 - f2, i7 + f2, i8 + f2);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setProgress(int i) {
        this.f = i;
        invalidate();
    }

    public void setProgressBackgroundColor(int i) {
        this.u = i;
        invalidate();
    }

    public void setProgressBackgroundWidth(float f) {
        this.t = f;
        invalidate();
    }

    public void setProgressColor(int i) {
        this.g = i;
        invalidate();
    }

    public void setProgressWidth(float f) {
        this.i = f;
        invalidate();
    }

    public void setStrockColor(int i) {
        this.k = i;
        invalidate();
    }

    public void setStrockWidth(float f) {
        this.m = f;
        invalidate();
    }

    public void setTextColor(int i) {
        this.o = i;
        invalidate();
    }

    public void setTotal(int i) {
        this.s = i;
    }
}
