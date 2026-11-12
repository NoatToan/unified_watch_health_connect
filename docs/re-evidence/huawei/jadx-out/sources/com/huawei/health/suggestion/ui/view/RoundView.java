package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class RoundView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f10200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10202c;
    private float d;
    private Paint e;
    private Paint f;
    private float g;
    private Path h;
    private float i;
    private List<Integer> j;

    public RoundView(Context context) {
        super(context);
        this.f10200a = new ArrayList(16);
        this.j = new ArrayList(16);
        this.i = 50.0f;
        this.g = 0.0f;
        d();
    }

    public RoundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10200a = new ArrayList(16);
        this.j = new ArrayList(16);
        this.i = 50.0f;
        this.g = 0.0f;
        d();
    }

    public RoundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10200a = new ArrayList(16);
        this.j = new ArrayList(16);
        this.i = 50.0f;
        this.g = 0.0f;
        d();
    }

    private void d() {
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setStrokeWidth(this.i);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setStrokeWidth(0.0f);
        this.h = new Path();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.d = size / 2.0f;
        this.f10202c = size2 / 2.0f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        if (canvas == null) {
            return;
        }
        this.f.setStrokeWidth(this.i);
        float f2 = this.d;
        float f3 = this.f10202c;
        float f4 = this.i / 2.0f;
        float f5 = (f2 - f4) - 8.0f;
        float f6 = this.g;
        int i = 0;
        while (i < this.j.size()) {
            float fIntValue = f6 - ((this.j.get(i).intValue() * 360.0f) / this.f10201b);
            int iIntValue = this.f10200a.get(i).intValue();
            b(f2, f3, f5, fIntValue, f6);
            c(canvas, iIntValue, this.f);
            double d = f5;
            double d2 = (((double) f6) * 3.141592653589793d) / 180.0d;
            int i2 = i;
            double d3 = f3;
            float f7 = f5;
            double d4 = f2;
            b((float) ((Math.cos(d2) * d) + d4), (float) ((Math.sin(d2) * d) + d3), f4, f6, f6 + 180.0f);
            c(canvas, iIntValue, this.e);
            if (i2 == this.j.size() - 1) {
                int iIntValue2 = this.f10200a.get(0).intValue();
                double d5 = (((double) fIntValue) * 3.141592653589793d) / 180.0d;
                f = fIntValue;
                b((float) (d4 + (Math.cos(d5) * d)), (float) (d3 + (Math.sin(d5) * d)), f4, f, fIntValue + 180.0f);
                c(canvas, iIntValue2, this.e);
            } else {
                f = fIntValue;
            }
            i = i2 + 1;
            f6 = f;
            f5 = f7;
        }
    }

    public void setStrokeWidth(float f) {
        this.i = f;
    }

    private void b(float f, float f2, float f3, float f4, float f5) {
        RectF rectF = new RectF(f - f3, f2 - f3, f + f3, f3 + f2);
        this.h.reset();
        this.h.moveTo(this.d, f2);
        this.h.addArc(rectF, f4, f5 - f4);
    }

    private void c(Canvas canvas, int i, Paint paint) {
        if (canvas == null) {
            return;
        }
        paint.setColor(i);
        canvas.drawPath(this.h, paint);
    }
}
