package com.xiaomi.fitness.nfc.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import defpackage.r4j;

/* JADX INFO: loaded from: classes9.dex */
public class MarqueeTextView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12644b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Paint g;
    public Rect h;
    public boolean i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f12645k;
    public Rect l;
    public int m;
    public ValueAnimator n;
    public Bitmap o;
    public Canvas p;

    public MarqueeTextView(Context context) {
        this(context, null);
    }

    private int getTextWidth() {
        this.h.setEmpty();
        Paint paint = this.g;
        String str = this.f12643a;
        paint.getTextBounds(str, 0, str.length(), this.h);
        return this.h.width();
    }

    public final void b() {
        int iAbs = Math.abs(this.j);
        int i = this.m;
        int i2 = this.d;
        if (iAbs >= i + i2) {
            this.j += i + i2;
        }
    }

    public final void c(Canvas canvas) {
        int i = 0;
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        int iCenterY = (int) (this.l.centerY() + (this.h.height() * 0.35f));
        if (g()) {
            int iWidth = (this.l.width() / this.m) + 1;
            while (i < iWidth) {
                i++;
                canvas.drawText(this.f12643a, this.j + ((this.m + this.d) * i), iCenterY, this.g);
            }
        } else {
            this.j = 0;
        }
        canvas.drawText(this.f12643a, this.j, iCenterY, this.g);
    }

    public final void d() {
        setLayerType(1, null);
        Paint paint = new Paint(1);
        this.g = paint;
        paint.setDither(true);
        this.g.setColor(this.c);
        this.g.setTextSize(this.f12644b);
        this.f12645k = new Rect();
        this.h = new Rect();
        this.l = new Rect();
        e();
    }

    public final void e() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 10);
        this.n = valueAnimatorOfInt;
        valueAnimatorOfInt.setStartDelay(this.f);
        this.n.setDuration(10000L);
        this.n.setRepeatCount(-1);
        this.n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f28745a.f(valueAnimator);
            }
        });
    }

    public final /* synthetic */ void f(ValueAnimator valueAnimator) {
        this.j -= this.e;
        b();
        postInvalidate();
    }

    public final boolean g() {
        return getTextWidth() > this.f12645k.width();
    }

    public void h() {
        if (this.i && g()) {
            this.i = false;
            this.n.start();
        }
    }

    public void i() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.n.pause();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.end();
        this.i = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f12645k.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.m = getTextWidth();
        if (this.o == null) {
            this.o = Bitmap.createBitmap(this.f12645k.width(), this.f12645k.height(), Bitmap.Config.ARGB_8888);
            this.l.set(0, 0, this.f12645k.width(), this.f12645k.height());
            this.p = new Canvas(this.o);
        }
        c(this.p);
        canvas.drawBitmap(this.o, (Rect) null, this.f12645k, this.g);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Paint.FontMetricsInt fontMetricsInt = this.g.getFontMetricsInt();
        setMeasuredDimension(getMeasuredWidth(), ((getPaddingTop() + getPaddingBottom()) - fontMetricsInt.top) + fontMetricsInt.bottom);
    }

    public void setMarqueeText(String str) {
        this.f12643a = str;
        this.j = 0;
        if (!g()) {
            i();
        }
        postInvalidate();
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12644b = 20;
        this.c = -16777216;
        this.d = 300;
        this.e = 2;
        this.f = 1000;
        this.i = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r4j.S4);
        this.f12643a = typedArrayObtainStyledAttributes.getString(r4j.W4);
        this.f12644b = typedArrayObtainStyledAttributes.getDimensionPixelSize(r4j.Y4, this.f12644b);
        this.c = typedArrayObtainStyledAttributes.getColor(r4j.X4, this.c);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(r4j.U4, this.d);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(r4j.V4, this.e);
        this.f = typedArrayObtainStyledAttributes.getInteger(r4j.T4, this.f);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }

    public void setMarqueeText(int i) {
        setMarqueeText(getContext().getString(i));
    }
}
