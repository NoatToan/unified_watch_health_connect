package com.huawei.ui.device.views.device;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import defpackage.qrs;
import defpackage.rfr;

/* JADX INFO: loaded from: classes16.dex */
public class RoundProgressImageView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f24993c;
    private float d;
    private int e;
    private int f;
    private float g;
    private int h;
    private boolean i;
    private int j;
    private Paint k;
    private int l;
    private float m;

    public RoundProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 100.0f;
        this.d = 0.0f;
        this.i = false;
        b();
    }

    private void b() {
        LogUtil.a("ProgressBarView", "init");
        Paint paint = new Paint();
        this.f24993c = paint;
        paint.setAntiAlias(true);
        this.f24993c.setDither(true);
        this.f24993c.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setDither(true);
        this.k.setStrokeCap(Paint.Cap.ROUND);
    }

    private void getCircleCenter() {
        LogUtil.a("ProgressBarView", "getCircleCenter getWidth() : ", Integer.valueOf(getWidth()), " ; getHeight() : ", Integer.valueOf(getHeight()));
        if (this.l == 0 || this.j == 0) {
            this.l = getWidth();
            int height = getHeight();
            this.j = height;
            int iMin = (Math.min(this.l, height) / 2) - 10;
            this.h = iMin;
            int i = iMin / 15;
            this.f24991a = i;
            this.e = i / 6;
            this.f24992b = this.l / 2;
            this.f = this.j / 2;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        LogUtil.a("ProgressBarView", "onDraw");
        getCircleCenter();
        float f2 = (this.m / this.g) * 360.0f;
        LogUtil.a("ProgressBarView", "onDraw sweep : ", Float.valueOf(f2));
        if (this.i) {
            c(canvas);
            return;
        }
        if (qrs.x(BaseApplication.getContext()) && Build.VERSION.SDK_INT >= 29) {
            this.f24993c.setColor(BaseApplication.getContext().getResources().getColor(R.color.emui_color_list_divider));
        } else {
            this.f24993c.setColor(Color.parseColor("#33000000"));
        }
        this.f24993c.setStrokeWidth(this.e);
        this.f24993c.setStrokeCap(Paint.Cap.ROUND);
        float f3 = 1.6f;
        while (true) {
            if (f3 > 360.0f) {
                break;
            }
            double d = ((double) ((0.0f + f3) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f24992b - (this.h * ((float) Math.sin(d)));
            float fCos = this.f + (this.h * ((float) Math.cos(d)));
            canvas.drawLine(fSin, fCos, fSin + (this.f24991a * ((float) Math.sin(d))), fCos - (this.f24991a * ((float) Math.cos(d))), this.f24993c);
            f3 += 5.0f;
        }
        this.k.setColor(Color.parseColor("#FFfb6522"));
        this.k.setStrokeWidth(this.e);
        this.k.setStrokeCap(Paint.Cap.ROUND);
        for (f = 0.0f; f < f2; f += 5.0f) {
            double d2 = ((double) ((f + 1.6f) / 180.0f)) * 3.141592653589793d;
            float fSin2 = this.f24992b + (this.h * ((float) Math.sin(d2)));
            float fCos2 = this.f - (this.h * ((float) Math.cos(d2)));
            canvas.drawLine(fSin2, fCos2, fSin2 - (this.f24991a * ((float) Math.sin(d2))), fCos2 + (this.f24991a * ((float) Math.cos(d2))), this.k);
        }
    }

    private void c(Canvas canvas) {
        float f;
        double d;
        float f2;
        LogUtil.a("ProgressBarView", "onDraw mArcTo :", Float.valueOf(this.d));
        a(canvas);
        b(canvas);
        d(canvas);
        e(canvas);
        float f3 = this.d + 30.0f;
        this.k.setColor(Color.parseColor("#CCfb6522"));
        this.k.setStrokeWidth(this.e);
        while (true) {
            f = this.d;
            d = 3.141592653589793d;
            if (f3 > f + 30.0f + 17.0f) {
                break;
            }
            double d2 = ((double) ((1.6f + f3) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f24992b + (this.h * ((float) Math.sin(d2)));
            float fCos = this.f - (this.h * ((float) Math.cos(d2)));
            canvas.drawLine(fSin, fCos, fSin - (this.f24991a * ((float) Math.sin(d2))), fCos + (this.f24991a * ((float) Math.cos(d2))), this.k);
            f3 += 5.0f;
        }
        float f4 = f + 50.0f;
        this.k.setColor(Color.parseColor("#FFfb6522"));
        this.k.setStrokeWidth(this.e);
        while (true) {
            f2 = this.d;
            if (f4 > f2 + 50.0f + 17.0f) {
                break;
            }
            double d3 = ((double) ((f4 + 1.6f) / 180.0f)) * d;
            float fSin2 = this.f24992b + (this.h * ((float) Math.sin(d3)));
            float fCos2 = this.f - (this.h * ((float) Math.cos(d3)));
            canvas.drawLine(fSin2, fCos2, fSin2 - (this.f24991a * ((float) Math.sin(d3))), fCos2 + (this.f24991a * ((float) Math.cos(d3))), this.k);
            f4 += 5.0f;
            d = 3.141592653589793d;
        }
        this.k.setColor(Color.parseColor("#ffffff"));
        this.k.setStrokeWidth(this.e);
        for (float f5 = f2 + 70.0f; f5 <= this.d + 70.0f + 17.0f; f5 += 5.0f) {
            double d4 = ((double) ((f5 + 1.6f) / 180.0f)) * 3.141592653589793d;
            float fSin3 = this.f24992b + (this.h * ((float) Math.sin(d4)));
            float fCos3 = this.f - (this.h * ((float) Math.cos(d4)));
            canvas.drawLine(fSin3, fCos3, fSin3 - (this.f24991a * ((float) Math.sin(d4))), fCos3 + (this.f24991a * ((float) Math.cos(d4))), this.k);
        }
    }

    private void e(Canvas canvas) {
        this.k.setColor(Color.parseColor("#92fb6522"));
        this.k.setStrokeWidth(this.e);
        for (float f = this.d + 10.0f; f <= this.d + 10.0f + 17.0f; f += 5.0f) {
            double d = ((double) ((1.6f + f) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f24992b + (this.h * ((float) Math.sin(d)));
            float fCos = this.f - (this.h * ((float) Math.cos(d)));
            canvas.drawLine(fSin, fCos, fSin - (this.f24991a * ((float) Math.sin(d))), fCos + (this.f24991a * ((float) Math.cos(d))), this.k);
        }
    }

    private void d(Canvas canvas) {
        this.k.setColor(Color.parseColor("#66fb6522"));
        this.k.setStrokeWidth(this.e);
        for (float f = this.d - 10.0f; f <= (this.d - 10.0f) + 17.0f; f += 5.0f) {
            double d = ((double) ((1.6f + f) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f24992b + (this.h * ((float) Math.sin(d)));
            float fCos = this.f - (this.h * ((float) Math.cos(d)));
            canvas.drawLine(fSin, fCos, fSin - (this.f24991a * ((float) Math.sin(d))), fCos + (this.f24991a * ((float) Math.cos(d))), this.k);
        }
    }

    private void b(Canvas canvas) {
        this.k.setColor(Color.parseColor("#33fb6522"));
        this.k.setStrokeWidth(this.e);
        for (float f = this.d - 30.0f; f <= (this.d - 30.0f) + 17.0f; f += 5.0f) {
            double d = ((double) ((1.6f + f) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f24992b + (this.h * ((float) Math.sin(d)));
            float fCos = this.f - (this.h * ((float) Math.cos(d)));
            canvas.drawLine(fSin, fCos, fSin - (this.f24991a * ((float) Math.sin(d))), fCos + (this.f24991a * ((float) Math.cos(d))), this.k);
        }
    }

    private void a(Canvas canvas) {
        this.k.setColor(Color.parseColor("#0cfb6522"));
        this.k.setStrokeWidth(this.e);
        for (float f = this.d - 50.0f; f <= (this.d - 50.0f) + 17.0f; f += 5.0f) {
            double d = ((double) ((1.6f + f) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f24992b + (this.h * ((float) Math.sin(d)));
            float fCos = this.f - (this.h * ((float) Math.cos(d)));
            canvas.drawLine(fSin, fCos, fSin - (this.f24991a * ((float) Math.sin(d))), fCos + (this.f24991a * ((float) Math.cos(d))), this.k);
        }
    }

    public void e(float f) {
        this.m = f;
        invalidate();
    }

    public void c() {
        this.i = true;
        LogUtil.a("ProgressBarView", "start");
        postInvalidate();
        postDelayed(new rfr(this), 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.i) {
            this.d += 10.138f;
            postInvalidate();
            postDelayed(new rfr(this), 50L);
        }
    }

    public void e() {
        this.i = false;
        this.d = 0.0f;
        postInvalidate();
    }

    public boolean getIsRunning() {
        return this.i;
    }
}
