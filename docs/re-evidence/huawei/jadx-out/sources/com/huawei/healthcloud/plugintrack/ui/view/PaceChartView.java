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
import defpackage.izn;
import defpackage.izw;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class PaceChartView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f11269a;
    private float ab;
    private float ac;
    private float d;
    private Paint e;
    private Context f;
    private Paint g;
    private boolean h;
    private Paint i;
    private float j;
    private float k;
    private float l;
    private float m;
    private Paint n;
    private int o;
    private float p;
    private float q;
    private List<Map.Entry<Integer, Float>> r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private Paint y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f11268c = Color.parseColor("#7FFB6522");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f11267b = Color.parseColor("#FB6522");

    public PaceChartView(Context context) {
        super(context);
        this.r = new ArrayList(10);
        this.f = context;
        b();
    }

    public PaceChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new ArrayList(10);
        this.f = context;
        b();
    }

    private void b() {
        this.q = b(1, 2.5f);
        this.w = b(1, 2.0f);
        this.v = b(1, 16.0f);
        this.x = b(1, 11.0f);
        Paint paint = new Paint();
        this.n = paint;
        paint.setAntiAlias(true);
        this.n.setColor(izw.f38269c);
        this.n.setStrokeWidth(b(0, 1.0f));
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setAntiAlias(true);
        this.g.setColor(izw.e);
        this.g.setStrokeWidth(b(0, 1.0f));
        this.g.setPathEffect(new DashPathEffect(new float[]{4.0f, 2.0f, 4.0f, 2.0f}, 1.0f));
        Paint paint3 = new Paint();
        this.i = paint3;
        paint3.setAntiAlias(true);
        this.i.setColor(izw.e);
        this.i.setTextSize(this.x);
        Paint paint4 = new Paint();
        this.f11269a = paint4;
        paint4.setAntiAlias(true);
        this.f11269a.setColor(f11268c);
        this.f11269a.setStrokeWidth(b(1, 2.0f));
        this.f11269a.setStyle(Paint.Style.STROKE);
        Paint paint5 = new Paint();
        this.e = paint5;
        paint5.setAntiAlias(true);
        this.e.setColor(f11267b);
        this.e.setStyle(Paint.Style.FILL);
        Paint paint6 = new Paint();
        this.y = paint6;
        paint6.setAntiAlias(true);
        this.y.setColor(izw.f);
        this.y.setTextSize(this.x);
        this.h = LanguageUtil.ba(this.f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.ab = getDefaultSize(getSuggestedMinimumWidth(), i);
        float defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.u = defaultSize;
        this.j = defaultSize - b(1, 13.0f);
        this.d = this.u - b(1, 27.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            LogUtil.j("Track_PaceChartView", "canvas is null");
            return;
        }
        a(canvas);
        d(canvas);
        b(canvas);
        c(canvas);
        e(canvas);
    }

    private void c(Canvas canvas) {
        List<Map.Entry<Integer, Float>> list = this.r;
        if (list == null || list.isEmpty()) {
            return;
        }
        String strA = izn.a(this.s);
        float fMeasureText = this.y.measureText(strA, 0, strA.length());
        float f = this.p;
        float f2 = fMeasureText / 2.0f;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else {
            float f5 = this.ab;
            if (f + f2 > f5) {
                f3 = f5 - fMeasureText;
            }
        }
        canvas.drawText(strA, f3, this.t + this.q + this.x, this.y);
        String strA2 = izn.a(this.k);
        float fMeasureText2 = this.y.measureText(strA2, 0, strA2.length());
        float f6 = this.m;
        float f7 = fMeasureText2 / 2.0f;
        float f8 = f6 - f7;
        if (f8 >= 0.0f) {
            float f9 = this.ab;
            f4 = f6 + f7 > f9 ? f9 - fMeasureText2 : f8;
        }
        canvas.drawText(strA2, f4, (this.l - this.q) - b(1, 1.0f), this.y);
    }

    private void b(Canvas canvas) {
        int i;
        float f;
        List<Map.Entry<Integer, Float>> list = this.r;
        if (list == null || list.isEmpty() || (i = this.o) == 1) {
            return;
        }
        this.ac = (this.ab - (this.q * 2.0f)) / (i - 1);
        ArrayList<PointF> arrayList = new ArrayList(10);
        float f2 = 0.0f;
        boolean z = false;
        for (Map.Entry<Integer, Float> entry : this.r) {
            int iIntValue = entry.getKey().intValue() / ExceptionCode.CRASH_EXCEPTION;
            float fFloatValue = entry.getValue().floatValue();
            if (this.h) {
                f = (this.ab - this.q) - ((iIntValue - 1) * this.ac);
            } else {
                f = this.q + ((iIntValue - 1) * this.ac);
            }
            float fE = e(fFloatValue);
            arrayList.add(new PointF(f, fE));
            if (fFloatValue == this.s && !z) {
                this.p = f;
                this.t = fE;
                z = true;
            }
            if (fFloatValue > f2) {
                this.m = f;
                this.l = fE;
                f2 = fFloatValue;
            }
        }
        Path path = new Path();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            PointF pointF = (PointF) arrayList.get(i2);
            if (i2 == 0) {
                path.moveTo(pointF.x, pointF.y);
            } else {
                path.lineTo(pointF.x, pointF.y);
            }
        }
        canvas.drawPath(path, this.f11269a);
        for (PointF pointF2 : arrayList) {
            canvas.drawCircle(pointF2.x, pointF2.y, this.q, this.e);
        }
    }

    private float e(float f) {
        if (Math.abs(this.k - this.s) < 1.0E-7d) {
            return (this.d + this.v) / 2.0f;
        }
        float f2 = this.v;
        float f3 = this.q;
        float f4 = this.k;
        return f2 + f3 + (((f4 - f) / (f4 - this.s)) * ((this.d - f2) - (f3 * 2.0f)));
    }

    private void d(Canvas canvas) {
        float f = (this.d + this.v) / 2.0f;
        canvas.drawLine(0.0f, f, this.ab, f, this.g);
    }

    private void e(Canvas canvas) {
        float fIntValue;
        List<Map.Entry<Integer, Float>> list = this.r;
        if (list == null || list.isEmpty() || this.o < 4) {
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList(10);
        int i = this.o / 4;
        arrayList.add(1);
        for (int i2 = 1; i2 < 4; i2++) {
            arrayList.add(Integer.valueOf(i * i2));
        }
        arrayList.add(Integer.valueOf(this.o));
        float f = this.j;
        float fB = b(1, 2.0f);
        for (Integer num : arrayList) {
            String strE = UnitUtil.e(num.intValue(), 1, 0);
            float fMeasureText = this.i.measureText(strE, 0, strE.length());
            if (this.h) {
                fIntValue = (this.ab - this.q) - ((num.intValue() - 1) * this.ac);
            } else {
                fIntValue = this.q + ((num.intValue() - 1) * this.ac);
            }
            float f2 = fIntValue - (fMeasureText / 2.0f);
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else {
                float f3 = this.ab;
                if (f2 + fMeasureText > f3) {
                    f2 = f3 - fMeasureText;
                } else {
                    LogUtil.a("Track_PaceChartView", "x is default");
                }
            }
            canvas.drawText(strE, f2, this.x + f + fB, this.i);
        }
    }

    private void a(Canvas canvas) {
        float f = this.w;
        canvas.drawLine(0.0f, f, this.ab, f, this.n);
        float f2 = this.j;
        canvas.drawLine(0.0f, f2, this.ab, f2, this.n);
    }

    private static float b(int i, float f) {
        return TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics());
    }

    public void e() {
        this.i.setColor(izw.f38267a);
        this.n.setColor(izw.d);
        this.g.setColor(izw.f38267a);
        this.y.setColor(izw.r);
    }
}
