package com.huami.watchfacesstore.view.banner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes17.dex */
public class IndicatorView extends View implements Indicator {
    private final Interpolator a;
    private Interpolator b;
    private Path c;
    private float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private final Paint i;
    private final RectF j;
    private RelativeLayout.LayoutParams k;
    private int l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorStyle {
        public static final int INDICATOR_BEZIER = 2;
        public static final int INDICATOR_BIG_CIRCLE = 4;
        public static final int INDICATOR_CIRCLE = 0;
        public static final int INDICATOR_CIRCLE_RECT = 1;
        public static final int INDICATOR_DASH = 3;
    }

    public IndicatorView(Context context) {
        this(context, null);
    }

    private int a(float dp) {
        return (int) (dp * getContext().getResources().getDisplayMetrics().density);
    }

    private void b(Canvas canvas, float midY) {
        g(canvas, midY);
        if (this.c == null) {
            this.c = new Path();
        }
        if (this.b == null) {
            this.b = new AccelerateInterpolator();
        }
        float fH = h(this.e);
        float fH2 = h((this.e + 1) % this.f) - fH;
        float interpolation = (this.b.getInterpolation(this.d) * fH2) + fH;
        float fI = fH + (fH2 * i());
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = this.o * 0.57f;
        float f2 = this.p * f;
        float fI2 = ((f2 - ratioSelectedRadius) * i()) + ratioSelectedRadius;
        float interpolation2 = f2 + ((ratioSelectedRadius - f2) * this.b.getInterpolation(this.d));
        float fI3 = (this.o - f) * i();
        float interpolation3 = (this.o - f) * this.b.getInterpolation(this.d);
        this.i.setColor(this.h);
        float f3 = this.o;
        this.j.set(interpolation - fI2, (midY - f3) + fI3, interpolation + fI2, (f3 + midY) - fI3);
        canvas.drawRoundRect(this.j, fI2, fI2, this.i);
        float f4 = (midY - f) - interpolation3;
        float f5 = f + midY + interpolation3;
        this.j.set(fI - interpolation2, f4, fI + interpolation2, f5);
        canvas.drawRoundRect(this.j, interpolation2, interpolation2, this.i);
        this.c.reset();
        this.c.moveTo(fI, midY);
        this.c.lineTo(fI, f4);
        float f6 = ((interpolation - fI) / 2.0f) + fI;
        this.c.quadTo(f6, midY, interpolation, (midY - this.o) + fI3);
        this.c.lineTo(interpolation, (this.o + midY) - fI3);
        this.c.quadTo(f6, midY, fI, f5);
        this.c.close();
        canvas.drawPath(this.c, this.i);
    }

    private void c(Canvas canvas, float midY) {
        g(canvas, midY);
        float fI = i();
        float fH = h(this.e);
        float fH2 = h((this.e + 1) % this.f);
        float ratioRadius = getRatioRadius();
        float f = this.o;
        float f2 = this.p * f;
        float f3 = (f2 - ratioRadius) * fI;
        float f4 = f2 - f3;
        float f5 = ratioRadius + f3;
        float f6 = (f - this.m) * fI;
        this.i.setColor(this.h);
        if (fI < 0.99f) {
            RectF rectF = this.j;
            rectF.set(fH - f4, (midY - f) + f6, fH + f4, (f + midY) - f6);
            canvas.drawRoundRect(this.j, f4, f4, this.i);
        }
        if (fI > 0.1f) {
            float f7 = this.m;
            float f8 = midY + f7 + f6;
            RectF rectF2 = this.j;
            rectF2.set(fH2 - f5, (midY - f7) - f6, fH2 + f5, f8);
            canvas.drawRoundRect(this.j, f5, f5, this.i);
        }
    }

    private void d(Canvas canvas, float midY) {
        g(canvas, midY);
        float fH = h(this.e);
        float fH2 = h((this.e + 1) % this.f);
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = fH - ratioSelectedRadius;
        float f2 = fH + ratioSelectedRadius;
        float f3 = fH2 - ratioSelectedRadius;
        float fI = f + ((f3 - f) * i());
        float fI2 = f2 + (((fH2 + ratioSelectedRadius) - f2) * i());
        RectF rectF = this.j;
        float f4 = this.o;
        rectF.set(fI, midY - f4, fI2, midY + f4);
        this.i.setColor(this.h);
        RectF rectF2 = this.j;
        float f5 = this.o;
        canvas.drawRoundRect(rectF2, f5, f5, this.i);
    }

    private void e(Canvas canvas, float midY) {
        float fMax;
        float fMin;
        g(canvas, midY);
        float fH = h(this.e);
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = fH - ratioSelectedRadius;
        float f2 = fH + ratioSelectedRadius;
        float fI = i();
        float fMax2 = this.q + (Math.max(getRatioRadius(), ratioSelectedRadius) * 2.0f);
        int i = this.e;
        if ((i + 1) % this.f == 0) {
            float f3 = fMax2 * (-i);
            fMax = f + Math.max(f3 * fI * 2.0f, f3);
            fMin = Math.min(f3 * (fI - 0.5f) * 2.0f, 0.0f);
        } else {
            fMax = f + Math.max((fI - 0.5f) * fMax2 * 2.0f, 0.0f);
            fMin = Math.min(fI * fMax2 * 2.0f, fMax2);
        }
        float f4 = f2 + fMin;
        RectF rectF = this.j;
        float f5 = this.o;
        rectF.set(fMax, midY - f5, f4, midY + f5);
        this.i.setColor(this.h);
        RectF rectF2 = this.j;
        float f6 = this.o;
        canvas.drawRoundRect(rectF2, f6, f6, this.i);
    }

    private void f(Canvas canvas, float midY) {
        float fI = i();
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float f = ratioSelectedRadius - ratioRadius;
        float f2 = f * fI;
        int i = (this.e + 1) % this.f;
        boolean z = i == 0;
        this.i.setColor(this.g);
        for (int i2 = 0; i2 < this.f; i2++) {
            float fH = h(i2);
            if (z) {
                fH += f2;
            }
            float f3 = fH - ratioRadius;
            float f4 = this.m;
            float f5 = midY - f4;
            float f6 = fH + ratioRadius;
            float f7 = midY + f4;
            if (this.e + 1 <= i2) {
                this.j.set(f3 + f, f5, f6 + f, f7);
            } else {
                this.j.set(f3, f5, f6, f7);
            }
            RectF rectF = this.j;
            float f8 = this.m;
            canvas.drawRoundRect(rectF, f8, f8, this.i);
        }
        this.i.setColor(this.h);
        if (fI < 0.99f) {
            float fH2 = h(this.e) - ratioSelectedRadius;
            if (z) {
                fH2 += f2;
            }
            RectF rectF2 = this.j;
            float f9 = this.o;
            rectF2.set(fH2, midY - f9, (((ratioSelectedRadius * 2.0f) + fH2) + f) - f2, midY + f9);
            RectF rectF3 = this.j;
            float f10 = this.o;
            canvas.drawRoundRect(rectF3, f10, f10, this.i);
        }
        if (fI > 0.1f) {
            float fH3 = h(i) + ratioSelectedRadius;
            if (z) {
                f = f2;
            }
            float f11 = fH3 + f;
            RectF rectF4 = this.j;
            float f12 = this.o;
            rectF4.set((f11 - (ratioSelectedRadius * 2.0f)) - f2, midY - f12, f11, midY + f12);
            RectF rectF5 = this.j;
            float f13 = this.o;
            canvas.drawRoundRect(rectF5, f13, f13, this.i);
        }
    }

    private void g(Canvas canvas, float midY) {
        this.i.setColor(this.g);
        for (int i = 0; i < this.f; i++) {
            float fH = h(i);
            float ratioRadius = getRatioRadius();
            float f = this.m;
            this.j.set(fH - ratioRadius, midY - f, fH + ratioRadius, f + midY);
            RectF rectF = this.j;
            float f2 = this.m;
            canvas.drawRoundRect(rectF, f2, f2, this.i);
        }
    }

    private float getRatioRadius() {
        return this.m * this.n;
    }

    private float getRatioSelectedRadius() {
        return this.o * this.p;
    }

    private float h(int index) {
        float ratioRadius = getRatioRadius();
        float fMax = Math.max(ratioRadius, getRatioSelectedRadius());
        return getPaddingLeft() + fMax + (((fMax * 2.0f) + this.q) * index) + (this.l == 3 ? 0.0f : (fMax - ratioRadius) / 2.0f);
    }

    private float i() {
        return this.a.getInterpolation(this.d);
    }

    private int j(int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (int) ((Math.max(getRatioSelectedRadius(), getRatioRadius()) * 2.0f) + getPaddingTop() + getPaddingBottom());
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private int k(int widthMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float fMax = Math.max(ratioSelectedRadius, ratioRadius) * 2.0f;
        int i = this.f;
        return (int) ((fMax * i) + ((i - 1) * this.q) + (ratioSelectedRadius - ratioRadius) + getPaddingLeft() + getPaddingRight());
    }

    @Override // com.huami.watchfacesstore.view.banner.Indicator
    public RelativeLayout.LayoutParams getParams() {
        if (this.k == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            this.k = layoutParams;
            layoutParams.addRule(12);
            this.k.addRule(14);
            this.k.bottomMargin = a(10.0f);
        }
        return this.k;
    }

    @Override // com.huami.watchfacesstore.view.banner.Indicator
    public View getView() {
        return this;
    }

    @Override // com.huami.watchfacesstore.view.banner.Indicator
    public void initIndicatorCount(int pagerCount) {
        this.f = pagerCount;
        setVisibility(pagerCount > 1 ? 0 : 8);
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f == 0) {
            return;
        }
        float height = (getHeight() / 2.0f) + 0.5f;
        int i = this.l;
        if (i == 0) {
            d(canvas, height);
            return;
        }
        if (i == 1) {
            e(canvas, height);
            return;
        }
        if (i == 2) {
            b(canvas, height);
        } else if (i == 3) {
            f(canvas, height);
        } else if (i == 4) {
            c(canvas, height);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(k(widthMeasureSpec), j(heightMeasureSpec));
    }

    @Override // com.huami.watchfacesstore.view.banner.Indicator
    public void onPageScrollStateChanged(int state) {
    }

    @Override // com.huami.watchfacesstore.view.banner.Indicator
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.e = position;
        this.d = positionOffset;
        invalidate();
    }

    @Override // com.huami.watchfacesstore.view.banner.Indicator
    public void onPageSelected(int position) {
    }

    public IndicatorView setIndicatorColor(@ColorInt int indicatorColor) {
        this.g = indicatorColor;
        return this;
    }

    public IndicatorView setIndicatorRadius(float indicatorRadius) {
        int iA = a(indicatorRadius);
        if (this.m == this.o) {
            this.o = iA;
        }
        this.m = iA;
        return this;
    }

    public IndicatorView setIndicatorRatio(float indicatorRatio) {
        if (this.n == this.p) {
            this.p = indicatorRatio;
        }
        this.n = indicatorRatio;
        return this;
    }

    public IndicatorView setIndicatorSelectedRadius(float indicatorSelectedRadius) {
        this.o = a(indicatorSelectedRadius);
        return this;
    }

    public IndicatorView setIndicatorSelectedRatio(float indicatorSelectedRatio) {
        this.p = indicatorSelectedRatio;
        return this;
    }

    public IndicatorView setIndicatorSelectorColor(@ColorInt int indicatorSelectorColor) {
        this.h = indicatorSelectorColor;
        return this;
    }

    public IndicatorView setIndicatorSpacing(float indicatorSpacing) {
        this.q = a(indicatorSpacing);
        return this;
    }

    public IndicatorView setIndicatorStyle(int indicatorStyle) {
        this.l = indicatorStyle;
        return this;
    }

    public IndicatorView setParams(RelativeLayout.LayoutParams params) {
        this.k = params;
        return this;
    }

    public IndicatorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.a = new DecelerateInterpolator();
        this.g = -7829368;
        this.h = -1;
        this.m = a(3.5f);
        this.n = 1.0f;
        this.o = a(3.5f);
        this.p = 1.0f;
        this.q = a(10.0f);
        this.j = new RectF();
        this.i = new Paint(1);
    }
}
