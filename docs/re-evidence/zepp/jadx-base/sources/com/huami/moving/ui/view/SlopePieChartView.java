package com.huami.moving.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.huami.chart.util.ChartUtil;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class SlopePieChartView extends View {
    private float[] a;
    private float b;
    private String[] c;
    private float[] d;
    private float[] e;
    private float f;
    private float g;
    private float h;
    private float i;
    private Paint j;
    private Paint k;
    private RectF l;
    private int m;

    public SlopePieChartView(Context context) {
        this(context, null);
    }

    private void a() {
        this.b = 0.0f;
        for (float f : this.a) {
            this.b += f;
        }
    }

    private void b() {
        this.f = ChartUtil.dp2px(getContext(), 52.0f);
        this.g = ChartUtil.dp2px(getContext(), 52.0f);
        this.h = ChartUtil.dp2px(getContext(), 52.0f);
        float f = this.f;
        this.i = f;
        float f2 = f * 2.0f;
        Paint paint = new Paint();
        this.j = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setStrokeWidth(ChartUtil.dp2px(getContext(), 2.0f));
        this.k.setColor(Color.parseColor("#141414"));
        this.l = new RectF(0.0f, 0.0f, f2, f2);
    }

    private void c() {
        float[] fArr = this.a;
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        this.e = new float[fArr.length];
        this.d = new float[fArr.length];
        float f = -90.0f;
        int i = 0;
        while (true) {
            float[] fArr3 = this.a;
            if (i >= fArr3.length) {
                break;
            }
            fArr2[i] = (float) (((((double) fArr3[i]) * 1.0d) / ((double) this.b)) * 1.0d);
            i++;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 >= 1) {
                f = (fArr2[i2 - 1] * 360.0f) + f;
            }
            this.e[i2] = f;
            this.d[i2] = fArr2[i2] * 360.0f;
        }
    }

    public void initSrc(float[] fArr) {
        this.a = fArr;
        this.m = 0;
        for (float f : fArr) {
            if (f > 0.0f) {
                this.m++;
            }
        }
        a();
        float f2 = this.b;
        if (f2 > 0.0f) {
            setItem(fArr);
            notifyDraw();
        } else if (f2 == 0.0f) {
            Arrays.fill(fArr, 1.0f);
            initSrc(fArr);
        }
    }

    public void notifyDraw() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float[] fArr = this.a;
        if (fArr == null || fArr.length == 0) {
            this.j.setStyle(Paint.Style.FILL);
            this.j.setColor(Color.parseColor("#04E6ED"));
            float f = this.i;
            canvas.drawCircle(f, f, ChartUtil.dp2px(getContext(), 52.0f), this.j);
            this.j.setStyle(Paint.Style.FILL);
            this.j.setColor(Color.parseColor("#141414"));
            float f2 = this.i;
            canvas.drawCircle(f2, f2, ChartUtil.dp2px(getContext(), 35.0f), this.j);
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.a.length; i2++) {
            this.j.setColor(Color.parseColor(this.c[i2]));
            canvas.drawArc(this.l, this.e[i2], this.d[i2], true, this.j);
        }
        while (true) {
            float[] fArr2 = this.a;
            if (i >= fArr2.length) {
                this.j.setStyle(Paint.Style.FILL);
                this.j.setColor(Color.parseColor("#141414"));
                float f3 = this.i;
                canvas.drawCircle(f3, f3, ChartUtil.dp2px(getContext(), 35.0f), this.j);
                return;
            }
            if (fArr2.length > 1 && this.m > 1) {
                float f4 = this.g;
                canvas.drawLine(f4, this.h, f4 + (((float) Math.sin(Math.toRadians(this.e[i] + 90.0f))) * this.g), this.h - (((float) Math.cos(Math.toRadians(this.e[i] + 90.0f))) * this.h), this.k);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) (this.f * 2.0f);
        setMeasuredDimension(i3, i3);
    }

    public void setItem(float[] fArr) {
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        a();
        c();
    }

    public SlopePieChartView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlopePieChartView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new String[]{"#FF5353", "#FF9C2C", "#04E6ED"};
        b();
    }
}
