package com.xiaomi.fitness.detail.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.util.DataUtil;
import defpackage.dki;
import defpackage.j1j;
import defpackage.m9f;
import defpackage.o8p;
import defpackage.tb2;
import defpackage.w4j;
import defpackage.x44;

/* JADX INFO: loaded from: classes8.dex */
public class SportPaceSegmentView<T extends tb2> extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f11871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f11872b;
    public Paint c;
    public Paint d;
    public Context e;
    public float f;
    public m9f g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11873k;
    public float l;

    public SportPaceSegmentView(Context context) {
        this(context, null);
        this.e = context;
    }

    public final boolean a(int i) {
        int i2;
        return i == 1 || (i2 = this.f11873k) == 2 || i2 == 0 || i2 == 4;
    }

    public final void b(Context context, Canvas canvas, T t, RectF rectF, float f, float f2) {
        RectF rectF2 = new RectF();
        String strA = t.a();
        int i = this.f11873k;
        if (i == 1) {
            strA = t.f();
        } else if (i == 2) {
            strA = t.g();
        }
        float fMeasureText = this.c.measureText(strA) + f;
        int layoutDirection = getLayoutDirection();
        float f3 = layoutDirection == 1 ? f2 - f : f;
        if (layoutDirection == 1) {
            fMeasureText = (f2 - fMeasureText) + f;
        }
        rectF2.set(f3, rectF.top, fMeasureText, rectF.bottom);
        float fH = o8p.h(rectF2, this.c);
        Typeface typeface = this.c.getTypeface();
        if (layoutDirection == 1) {
            f3 = fMeasureText;
        }
        int i2 = this.f11873k;
        String string = context.getString((i2 == 2 || i2 == 1) ? j1j.X0 : j1j.V2);
        float fMeasureText2 = this.c.measureText(string);
        float fDip2px = layoutDirection == 1 ? (f2 - f) + this.l + fMeasureText2 : (this.l - fMeasureText2) - DisplayUtil.dip2px(8.0f);
        String str = t.g;
        if (str != null) {
            if (str == "--") {
                this.c.setColor(getResources().getColor(dki.o2));
            } else {
                this.c.setColor(-1);
            }
            strA = str;
        }
        canvas.drawText(t.d != 0 ? strA : "--", f3, fH, this.c);
        if (t.e == 1 && this.f11873k != 4) {
            canvas.drawText(string, fDip2px, fH, this.c);
        }
        this.c.setTypeface(typeface);
    }

    public final void c(Context context, Canvas canvas, T t, RectF rectF, float f, float f2) {
        String str = String.format(t.h(), TimeDateUtil.getTimeStrWithSecDef(t.d));
        RectF rectF2 = new RectF();
        float fMeasureText = this.c.measureText(str) + f;
        int layoutDirection = getLayoutDirection();
        if (layoutDirection == 1) {
            f = f2 - f;
        }
        if (layoutDirection == 1) {
            fMeasureText = f2 - fMeasureText;
        }
        rectF2.set(f, rectF.top, fMeasureText, rectF.bottom);
        float fH = o8p.h(rectF2, this.c);
        int color = this.c.getColor();
        Typeface typeface = this.c.getTypeface();
        this.c.setColor(x44.a(dki.K0));
        if (layoutDirection == 1) {
            f = fMeasureText;
        }
        canvas.drawText(str, f, fH, this.c);
        this.c.setColor(color);
        this.c.setTypeface(typeface);
    }

    public final void d() {
        this.f = DisplayUtil.dip2px(5.0f);
        Paint paint = new Paint();
        this.f11872b = paint;
        paint.reset();
        this.f11872b.setAntiAlias(true);
        Paint paint2 = this.f11872b;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.f11872b.setColor(-16777216);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.reset();
        this.c.setAntiAlias(true);
        this.c.setTextSize(DisplayUtil.sp2px(10.0f));
        this.c.setStyle(style);
        this.c.setTypeface(Typeface.DEFAULT_BOLD);
        this.c.setColor(-1);
        Paint paint4 = new Paint();
        this.d = paint4;
        paint4.reset();
        this.d.setAntiAlias(true);
        this.d.setTextSize(DisplayUtil.sp2px(12.0f));
        this.d.setStyle(style);
        this.d.setTypeface(Typeface.DEFAULT);
        this.d.setColor(this.e.getColor(dki.G0));
        this.d.setAlpha(50);
    }

    public void e(T t, m9f m9fVar, boolean z, int i) {
        this.f11871a = t;
        this.g = m9fVar;
        this.h = z;
        this.f11873k = i;
        invalidate();
    }

    public void f(int i, int i2) {
        this.j = i;
        this.i = i2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x013c  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float fDip2px;
        float f;
        int i;
        if (this.f11871a == null) {
            return;
        }
        canvas.save();
        RectF rectF = new RectF();
        float fDip2px2 = DisplayUtil.dip2px(10.0f);
        String timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef(this.f11871a.h);
        float fDip2px3 = DisplayUtil.dip2px(10.0f);
        float fMeasureText = !a(this.f11873k) ? this.d.measureText("00:00:00") + fDip2px3 : 0.0f;
        float width = (getWidth() - fMeasureText) - fDip2px2;
        float fDip2px4 = DisplayUtil.dip2px(16.0f);
        if (this.f11873k == 3) {
            fDip2px4 = DisplayUtil.dip2px(10.0f);
            this.f = DisplayUtil.dip2px(2.0f);
        } else {
            this.f = DisplayUtil.dip2px(5.0f);
        }
        float height = (getHeight() - fDip2px4) / 2.0f;
        float f2 = fDip2px4 + height;
        if (!this.h) {
            int color = this.f11872b.getColor();
            this.f11872b.setColor(x44.a(dki.p1));
            float f3 = this.f;
            canvas.drawRoundRect(rectF, f3, f3, this.f11872b);
            this.f11872b.setColor(color);
            c(this.e, canvas, this.f11871a, rectF, fDip2px2, width);
            return;
        }
        RectF rectF2 = new RectF();
        if (!AppUtil.isRTLDirection()) {
            fMeasureText = 0.0f;
        }
        float f4 = 30.0f;
        if (a(this.f11873k)) {
            float f5 = this.g.f25916a;
            if (f5 != 0.0f) {
                int i2 = this.f11871a.d;
                fDip2px = (i2 / f5) * width;
                if (this.f11873k == 2) {
                    if (i2 != 0) {
                        fDip2px = (DataUtil.getSpeed(i2) / this.g.f25916a) * width;
                        f4 = 40.0f;
                    } else {
                        fDip2px = DisplayUtil.dip2px(30.0f);
                    }
                }
            } else {
                fDip2px = width;
            }
        } else {
            fDip2px = (this.f11871a.j / this.g.f25916a) * width;
        }
        if (fDip2px > width) {
            fDip2px = width * 0.9f;
        }
        if (this.f11873k == 1 && fDip2px < DisplayUtil.dip2px(70.0f)) {
            fDip2px = DisplayUtil.dip2px(70.0f);
        }
        float width2 = AppUtil.isRTLDirection() ? getWidth() : fMeasureText + fDip2px;
        float f6 = getLayoutDirection() == 1 ? width2 : fMeasureText;
        float fDip2px5 = getLayoutDirection() == 1 ? width2 - fDip2px : width2;
        float f7 = getLayoutDirection() == 1 ? width2 - width : fMeasureText + width;
        if (this.f11873k != 3) {
            float f8 = fDip2px5 - f6;
            if (Math.abs(f8) < DisplayUtil.dip2px(f4)) {
                f = 0.0f;
                if (Math.abs(f8) > 0.0f) {
                    fDip2px5 = AppUtil.isRTLDirection() ? f6 - DisplayUtil.dip2px(f4) : DisplayUtil.dip2px(f4) + f6;
                }
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        rectF.set(f6, height, f7, f2);
        rectF2.set(f6, height, fDip2px5, f2);
        this.l = fDip2px5;
        int color2 = this.f11872b.getColor();
        int i3 = this.f11873k;
        if (i3 == 2 || i3 == 0 || i3 == 4) {
            i = this.f11871a.e == 1 ? this.j : this.i;
        } else if (i3 == 1) {
            i = ((float) this.f11871a.d) <= this.g.f25917b ? this.j : this.i;
        } else {
            int i4 = this.f11871a.i;
            RectF rectF3 = new RectF();
            rectF3.set(f6, rectF2.top, fDip2px5, rectF2.bottom);
            canvas.drawText(timeStrWithSecDef, AppUtil.isRTLDirection() ? f : fDip2px3 + width, o8p.h(rectF3, this.d), this.d);
            i = i4;
        }
        this.f11872b.setColor(AppUtil.getApp().getColor(dki.G0));
        this.f11872b.setAlpha(16);
        int i5 = this.f11873k;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            float f9 = this.f;
            canvas.drawRoundRect(rectF, f9, f9, this.f11872b);
        }
        this.f11872b.setColor(i);
        this.f11872b.setAlpha(255);
        float f10 = this.f;
        canvas.drawRoundRect(rectF2, f10, f10, this.f11872b);
        this.f11872b.setColor(color2);
        if (a(this.f11873k)) {
            b(this.e, canvas, this.f11871a, rectF2, fDip2px2, width);
        }
    }

    public SportPaceSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.e = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w4j.e4);
            this.i = typedArrayObtainStyledAttributes.getColor(w4j.f4, x44.a(dki.B1));
            this.j = typedArrayObtainStyledAttributes.getColor(w4j.g4, x44.a(dki.C1));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SportPaceSegmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = context;
        d();
    }
}
