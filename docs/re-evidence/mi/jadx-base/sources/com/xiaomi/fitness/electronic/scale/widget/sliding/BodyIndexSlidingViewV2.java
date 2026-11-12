package com.xiaomi.fitness.electronic.scale.widget.sliding;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.electronic.scale.BalanceWeightViewModel;
import defpackage.eji;
import defpackage.l4j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class BodyIndexSlidingViewV2 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12160b;
    public float c;
    public float d;
    public int e;
    public float f;
    public float g;
    public float h;
    public boolean i;
    public Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f12161k;
    public int[] l;
    public float m;
    public float n;
    public int o;
    public float p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Paint f12162r;
    public float s;
    public String t;
    public String u;

    public BodyIndexSlidingViewV2(Context context) {
        super(context);
        this.f12159a = BodyIndexSlidingViewV2.class.getSimpleName();
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.s = DisplayUtil.dip2px(0.5f);
        this.t = "18s";
        this.u = "28s";
        this.j = context;
        c(null);
    }

    public final float b(String str, Paint paint) {
        return paint.measureText(str, 0, str.length());
    }

    public final void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, l4j.J0);
        this.f12160b = typedArrayObtainStyledAttributes.getDimension(l4j.L0, 0.0f);
        this.c = typedArrayObtainStyledAttributes.getDimension(l4j.K0, 0.0f);
        this.d = typedArrayObtainStyledAttributes.getDimension(l4j.R0, 0.0f);
        this.e = typedArrayObtainStyledAttributes.getColor(l4j.N0, -16777216);
        this.f = typedArrayObtainStyledAttributes.getDimension(l4j.Q0, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getDimension(l4j.P0, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getDimension(l4j.O0, 0.0f);
        this.i = typedArrayObtainStyledAttributes.getBoolean(l4j.M0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean d() {
        return this.q;
    }

    public final /* synthetic */ void e(int i) {
        if (this.o >= 1) {
            float width = getWidth() / this.o;
            float fDip2px = ((i * width) - (width / 2.0f)) + DisplayUtil.dip2px(2.0f);
            this.p = fDip2px;
            if (fDip2px <= 0.0f) {
                fDip2px = 0.0f;
            }
            this.p = fDip2px;
            this.q = true;
        }
    }

    public void f(String[] strArr, int[] iArr, final int i, boolean z) {
        if (strArr == null || iArr == null) {
            return;
        }
        this.o = strArr.length;
        this.f12161k = strArr;
        this.l = iArr;
        if (z) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.l;
                if (i2 >= iArr2.length) {
                    break;
                }
                if (i2 != i - 1) {
                    iArr2[i2] = getResources().getColor(eji.u);
                }
                i2++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" BalanceSlidingView index = ");
        sb.append(i);
        this.q = false;
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: j43
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f22395a.e(i);
            }
        });
    }

    public float getmoveWidth() {
        return this.p;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        String str;
        char c;
        String str2;
        float fB;
        super.onDraw(canvas);
        setFocusable(true);
        if (this.l == null) {
            return;
        }
        this.m = getWidth();
        this.n = getHeight();
        float f2 = this.m / this.o;
        Paint paint = new Paint();
        this.f12162r = paint;
        paint.setColor(-1);
        this.f12162r.setStyle(Paint.Style.FILL);
        this.f12162r.setAntiAlias(true);
        float f3 = this.f12160b;
        float f4 = (this.n - f3) / 2.0f;
        float f5 = this.f;
        int i = 0;
        while (i < this.o) {
            float fB2 = 0.0f;
            float f6 = (i * f2) + 0.0f;
            float f7 = f6 + f2;
            float f8 = f4 + f3;
            if (this.i) {
                float f9 = this.g;
                float f10 = this.h;
                float fDip2px = DisplayUtil.dip2px(3.0f);
                String[] strArr = this.f12161k;
                if (strArr == null || strArr.length <= 0 || (str2 = strArr[i]) == null) {
                    f3 = f3;
                    f = f4;
                } else {
                    this.f12162r.setColor(this.e);
                    this.f12162r.setTextSize(this.d);
                    if (i == 0) {
                        fB = (fDip2px * 2.0f) + f9;
                    } else {
                        if (i == this.f12161k.length - 1) {
                            fB = ((f7 - b(str2, this.f12162r)) - fDip2px) - this.s;
                        } else {
                            fB = (((f2 / 2.0f) + f6) - (b(str2, this.f12162r) / 2.0f)) + (f9 / 2.0f);
                        }
                        float f11 = f8 + f5;
                        f = f4;
                        canvas.drawText(str2, fB, (f11 - this.f12162r.ascent()) + DisplayUtil.dip2px(23.0f), this.f12162r);
                        this.f12162r.setColor(this.l[i]);
                        RectF rectF = new RectF();
                        rectF.left = (fB - f9) - fDip2px;
                        float fDip2px2 = f11 + DisplayUtil.dip2px(25.0f);
                        rectF.top = fDip2px2;
                        rectF.bottom = fDip2px2 + f9;
                        rectF.right = rectF.left + f9;
                        canvas.drawRoundRect(rectF, f10, f10, this.f12162r);
                    }
                    float f12 = f8 + f5;
                    f = f4;
                    canvas.drawText(str2, fB, (f12 - this.f12162r.ascent()) + DisplayUtil.dip2px(23.0f), this.f12162r);
                    this.f12162r.setColor(this.l[i]);
                    RectF rectF2 = new RectF();
                    rectF2.left = (fB - f9) - fDip2px;
                    float fDip2px3 = f12 + DisplayUtil.dip2px(25.0f);
                    rectF2.top = fDip2px3;
                    rectF2.bottom = fDip2px3 + f9;
                    rectF2.right = rectF2.left + f9;
                    canvas.drawRoundRect(rectF2, f10, f10, this.f12162r);
                }
            } else {
                f3 = f3;
                f = f4;
                String[] strArr2 = this.f12161k;
                if (strArr2 != null && strArr2.length > 0 && (str = strArr2[i]) != null) {
                    this.f12162r.setColor(this.e);
                    this.f12162r.setTextSize(this.d);
                    if (i != 0) {
                        fB2 = i == this.f12161k.length - 1 ? (f7 - b(str, this.f12162r)) - this.s : ((f2 / 2.0f) + f6) - (b(str, this.f12162r) / 2.0f);
                    }
                    canvas.drawText(str, fB2, (f8 + f5) - this.f12162r.ascent(), this.f12162r);
                }
            }
            this.f12162r.setColor(this.l[i]);
            f4 = f;
            RectF rectF3 = new RectF(f6, f4, f7, f8);
            Path path = new Path();
            int i2 = this.o;
            if (i2 == 1) {
                path.moveTo(rectF3.left + (rectF3.height() / 2.0f), rectF3.top);
                path.lineTo(rectF3.right - (rectF3.height() / 2.0f), rectF3.top);
                float f13 = rectF3.right;
                path.cubicTo(f13, rectF3.top, f13, rectF3.bottom, f13 - (rectF3.height() / 2.0f), rectF3.bottom);
                path.lineTo(rectF3.left + (rectF3.height() / 2.0f), rectF3.bottom);
                float f14 = rectF3.left;
                path.cubicTo(f14, rectF3.bottom, f14, rectF3.top, f14 + (rectF3.height() / 2.0f), rectF3.top);
            } else if (i == 0) {
                path.moveTo(rectF3.left + (rectF3.height() / 2.0f), rectF3.top);
                path.lineTo(rectF3.right - this.s, rectF3.top);
                path.lineTo(rectF3.right - this.s, rectF3.bottom);
                path.lineTo(rectF3.left + (rectF3.height() / 2.0f), rectF3.bottom);
                float f15 = rectF3.left;
                path.cubicTo(f15, rectF3.bottom, f15, rectF3.top, f15 + (rectF3.height() / 2.0f), rectF3.top);
            } else if (i == i2 - 1) {
                path.moveTo(rectF3.left + (rectF3.height() / 2.0f), rectF3.top);
                path.lineTo((rectF3.right - (rectF3.height() / 2.0f)) - this.s, rectF3.top);
                float f16 = rectF3.right;
                float f17 = this.s;
                path.cubicTo(f16 - f17, rectF3.top, f16 - f17, rectF3.bottom, (f16 - (rectF3.height() / 2.0f)) - this.s, rectF3.bottom);
                path.lineTo(rectF3.left, rectF3.bottom);
                path.lineTo(rectF3.left, rectF3.top);
            } else {
                path.moveTo(rectF3.left, rectF3.top);
                path.lineTo(rectF3.right - this.s, rectF3.top);
                path.lineTo(rectF3.right - this.s, rectF3.bottom);
                path.lineTo(rectF3.left, rectF3.bottom);
                path.lineTo(rectF3.left, rectF3.top);
            }
            canvas.drawPath(path, this.f12162r);
            if (i == 1) {
                this.f12162r.setColor(getContext().getColor(eji.t));
                this.f12162r.setTextSize(this.d);
                this.f12162r.setAlpha(102);
                canvas.drawText(this.u, rectF3.right - DisplayUtil.dip2px(8.0f), rectF3.bottom + (rectF3.height() / 2.0f) + DisplayUtil.dip2px(4.0f), this.f12162r);
                this.f12162r.setAlpha(255);
            } else {
                if (i == 0) {
                    this.f12162r.setColor(getContext().getColor(eji.t));
                    this.f12162r.setTextSize(this.d);
                    this.f12162r.setAlpha(102);
                    c = 0;
                    canvas.drawText(this.t, rectF3.right - DisplayUtil.dip2px(8.0f), rectF3.bottom + (rectF3.height() / 2.0f) + DisplayUtil.dip2px(4.0f), this.f12162r);
                    this.f12162r.setAlpha(255);
                }
                i++;
                f3 = f3;
            }
            c = 0;
            i++;
            f3 = f3;
        }
    }

    public void setTimeRange(@NotNull BalanceWeightViewModel.TimeRange timeRange) {
        this.t = timeRange.getMin() + "s";
        this.u = timeRange.getMac() + "s";
    }

    public BodyIndexSlidingViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12159a = BodyIndexSlidingViewV2.class.getSimpleName();
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.s = DisplayUtil.dip2px(0.5f);
        this.t = "18s";
        this.u = "28s";
        this.j = context;
        c(attributeSet);
    }

    public BodyIndexSlidingViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12159a = BodyIndexSlidingViewV2.class.getSimpleName();
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.s = DisplayUtil.dip2px(0.5f);
        this.t = "18s";
        this.u = "28s";
        this.j = context;
        c(attributeSet);
    }
}
