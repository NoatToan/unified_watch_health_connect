package com.huawei.health.section.section;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes8.dex */
public class MeasureIndicator extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f8743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f8745c;
    private Paint d;
    private int e;
    private int f;
    private int g;
    private int h;
    private double i;
    private int j;
    private float l;
    private int n;
    private float o;

    public MeasureIndicator(Context context) {
        super(context);
        c(context);
    }

    public MeasureIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public MeasureIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }

    private void c(Context context) {
        this.f8743a = ContextCompat.getDrawable(getContext(), R.drawable.health_indicator_triangle);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_8dp);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_6dp);
        this.g = dimensionPixelSize2;
        this.f = dimensionPixelSize;
        this.f8743a.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
        Paint paint = new Paint();
        this.d = paint;
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_6dp));
        this.f8744b = this.d.getStrokeWidth() / 2.0f;
        this.d.setStrokeCap(Paint.Cap.ROUND);
        this.e = ContextCompat.getColor(context, com.huawei.health.servicesui.R.color.color_vascular_normal);
        this.h = ContextCompat.getColor(context, com.huawei.health.servicesui.R.color.color_vascular_less_good);
        this.n = ContextCompat.getColor(context, com.huawei.health.servicesui.R.color.color_vascular_bad);
        this.j = context.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_1dp);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int strokeWidth = (int) (this.g + this.j + this.d.getStrokeWidth());
        if (mode != 1073741824) {
            size2 = strokeWidth;
        }
        float f = size;
        this.f8745c = f / 3.0f;
        this.l = (2.0f * f) / 3.0f;
        this.o = f;
        setMeasuredDimension(size, size2);
    }

    public void setIndicatorLevel(double d) {
        this.i = d;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float height = getHeight() / 2.0f;
        float strokeWidth = this.d.getStrokeWidth() / 2.0f;
        canvas.save();
        canvas.translate(0.0f, strokeWidth + height);
        this.d.setColor(this.e);
        float f = this.f8744b;
        canvas.drawLine(f, 0.0f, this.f8745c - f, 0.0f, this.d);
        this.d.setColor(this.h);
        float f2 = this.f8745c;
        float f3 = this.f8744b;
        canvas.drawLine(f2 + f3, 0.0f, this.l - f3, 0.0f, this.d);
        this.d.setColor(this.n);
        float f4 = this.l;
        float f5 = this.f8744b;
        canvas.drawLine(f4 + f5, 0.0f, this.o - f5, 0.0f, this.d);
        canvas.restore();
        canvas.save();
        canvas.rotate(180.0f, this.f / 2.0f, this.g / 2.0f);
        canvas.translate(-(a(getWidth()) - (this.f / 2.0f)), -((height - this.g) - this.j));
        this.f8743a.draw(canvas);
        canvas.restore();
    }

    private float a(int i) {
        double d;
        double d2 = this.i;
        float f = i;
        double d3 = f / 3.0f;
        if (d2 < 8.0d) {
            if (d2 < 0.0d) {
                d2 = 0.0d;
            }
            d = (d3 * (d2 - 0.0d)) / 8.0d;
            d3 = 0.0d;
        } else if (d2 < 8.0d || d2 > 10.0d) {
            if (d2 > 15.0d) {
                d2 = 15.0d;
            }
            d = (d3 * (d2 - 10.0d)) / 5.0d;
            d3 = (f * 2.0f) / 3.0f;
        } else {
            d = ((d2 - 8.0d) * d3) / 2.0d;
        }
        float f2 = (float) (d3 + d);
        float f3 = this.f / 2.0f;
        if (f2 - f3 < 0.0f) {
            f2 = f3;
        }
        return f3 + f2 > f ? f - f3 : f2;
    }
}
