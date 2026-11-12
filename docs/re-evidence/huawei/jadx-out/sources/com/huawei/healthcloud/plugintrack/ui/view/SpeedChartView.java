package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.izw;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SpeedChartView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f11307a = Color.parseColor("#FB6522");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f11308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f11309c;
    private Paint d;
    private float e;
    private Context f;
    private Paint g;
    private boolean h;
    private float i;
    private float j;
    private int k;
    private float l;
    private Paint m;
    private float n;
    private Paint o;
    private float p;
    private float q;
    private Paint r;
    private List<Map.Entry<Integer, Float>> s;
    private float t;
    private float v;
    private float w;
    private float x;
    private float y;

    private float e(float f) {
        return 3600.0f / f;
    }

    public SpeedChartView(Context context) {
        super(context);
        this.f = context;
        d();
    }

    public SpeedChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = context;
        d();
    }

    private void d() {
        if (this.f == null) {
            return;
        }
        this.e = e(0, 1.0f);
        this.t = e(1, 2.0f);
        this.y = e(1, 2.0f);
        this.p = e(1, 16.0f);
        this.q = e(1, 11.0f);
        this.h = LanguageUtil.ba(this.f);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setColor(izw.e);
        this.g.setStrokeWidth(this.e);
        this.g.setPathEffect(new DashPathEffect(new float[]{4.0f, 2.0f, 4.0f, 2.0f}, 1.0f));
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setAntiAlias(true);
        this.o.setColor(izw.f38269c);
        this.o.setStrokeWidth(this.e);
        Paint paint3 = new Paint();
        this.d = paint3;
        paint3.setAntiAlias(true);
        Paint paint4 = this.d;
        int i = f11307a;
        paint4.setColor(i);
        this.d.setStrokeWidth(e(1, 3.0f));
        this.d.setStyle(Paint.Style.STROKE);
        Paint paint5 = new Paint();
        this.m = paint5;
        paint5.setAntiAlias(true);
        this.m.setColor(izw.e);
        this.m.setTextSize(this.q);
        Paint paint6 = new Paint();
        this.f11309c = paint6;
        paint6.setAntiAlias(true);
        this.f11309c.setColor(i);
        this.f11309c.setStyle(Paint.Style.FILL);
        Paint paint7 = new Paint();
        this.r = paint7;
        paint7.setAntiAlias(true);
        this.r.setColor(izw.f);
        this.r.setTextSize(this.q);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            LogUtil.e("Track_SpeedChartView", "canvas is null");
            return;
        }
        b(canvas);
        a(canvas);
        c(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.x = getDefaultSize(getSuggestedMinimumWidth(), i);
        float defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.v = defaultSize;
        this.i = defaultSize - e(1, 13.0f);
        this.j = this.v - e(1, 27.0f);
    }

    private void c(Canvas canvas) {
        int i;
        float f;
        if (njy.e(this.s) || (i = this.k) < 1) {
            return;
        }
        if (i >= 4) {
            this.w = (this.x - (this.t * 2.0f)) / (i - 1);
        } else {
            this.w = (this.x - (this.t * 2.0f)) / 3.0f;
        }
        ArrayList<PointF> arrayList = new ArrayList<>(10);
        for (Map.Entry<Integer, Float> entry : this.s) {
            int iIntValue = entry.getKey().intValue() / ExceptionCode.CRASH_EXCEPTION;
            float fFloatValue = entry.getValue().floatValue();
            if (fFloatValue != 0.0f) {
                float fE = e(fFloatValue);
                if (this.h) {
                    f = (this.x - this.t) - ((iIntValue - 1) * this.w);
                } else {
                    f = this.t + ((iIntValue - 1) * this.w);
                }
                arrayList.add(new PointF(f, b(fE)));
            }
        }
        b(canvas, arrayList);
    }

    private void b(Canvas canvas, ArrayList<PointF> arrayList) {
        int i = 0;
        if (arrayList.size() == 1) {
            canvas.drawCircle(arrayList.get(0).x, arrayList.get(0).y, this.t, this.f11309c);
            return;
        }
        Path path = new Path();
        while (i < arrayList.size() - 1) {
            PointF pointF = arrayList.get(i);
            if (i == 0) {
                path.moveTo(pointF.x, pointF.y);
            } else {
                path.lineTo(pointF.x, pointF.y);
            }
            if (i == 0) {
                path.moveTo(pointF.x, pointF.y);
            }
            i++;
            PointF pointF2 = arrayList.get(i);
            float f = (pointF.x + pointF2.x) / 2.0f;
            path.cubicTo(f, pointF.y, f, pointF2.y, pointF2.x, pointF2.y);
        }
        canvas.drawPath(path, this.d);
    }

    private void a(Canvas canvas) {
        float f;
        float f2 = (this.j + this.p) / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, f2);
        path.lineTo(this.x, f2);
        canvas.drawPath(path, this.g);
        float f3 = this.f11308b;
        if (f3 != 0.0f) {
            String strE = UnitUtil.e(f3, 1, 2);
            float fMeasureText = this.m.measureText(strE, 0, strE.length());
            if (this.h) {
                f = this.t;
            } else {
                f = (this.x - this.t) - fMeasureText;
            }
            canvas.drawText(strE, f, f2 + this.q + (this.e * 2.0f), this.m);
        }
    }

    private float b(float f) {
        if (Math.abs(this.n - this.l) < 1.0E-6d) {
            return (this.j + this.p) / 2.0f;
        }
        float f2 = this.p;
        float f3 = this.n;
        return f2 + (((f3 - f) / (f3 - this.l)) * (this.j - f2));
    }

    private void d(Canvas canvas) {
        float fIntValue;
        if (njy.e(this.s) || this.k < 1) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList(10);
        int i = this.k;
        if (i >= 8) {
            int i2 = i / 4;
            if (i2 != 1) {
                arrayList.add(1);
            }
            for (int i3 = 1; i3 < 4; i3++) {
                arrayList.add(Integer.valueOf(i2 * i3));
            }
            arrayList.add(Integer.valueOf(this.k));
        } else if (i >= 4) {
            for (int i4 = 1; i4 <= this.k; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
        } else {
            for (int i5 = 1; i5 <= 4; i5++) {
                arrayList.add(Integer.valueOf(i5));
            }
        }
        float f = this.i;
        float fE = e(1, 2.0f);
        for (Integer num : arrayList) {
            String strE = UnitUtil.e(num.intValue(), 1, 0);
            float fMeasureText = this.m.measureText(strE, 0, strE.length());
            if (this.h) {
                fIntValue = (this.x - this.t) - ((num.intValue() - 1) * this.w);
            } else {
                fIntValue = this.t + ((num.intValue() - 1) * this.w);
            }
            float f2 = fIntValue - (fMeasureText / 2.0f);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else {
                float f3 = this.x;
                if (f2 + fMeasureText > f3) {
                    f2 = f3 - fMeasureText;
                } else {
                    LogUtil.a("Track_SpeedChartView", "textX is default");
                }
            }
            canvas.drawText(strE, f2, this.q + f + fE, this.m);
        }
    }

    private void b(Canvas canvas) {
        float f = this.y;
        canvas.drawLine(0.0f, f, this.x, f, this.o);
        float f2 = this.i;
        canvas.drawLine(0.0f, f2, this.x, f2, this.o);
    }

    public void b() {
        this.m.setColor(izw.f38267a);
        this.o.setColor(izw.d);
        this.g.setColor(izw.f38267a);
        this.r.setColor(izw.r);
    }

    private static float e(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }
}
