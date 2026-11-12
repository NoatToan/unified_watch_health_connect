package com.huawei.health.device.ui.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import defpackage.qrs;

/* JADX INFO: loaded from: classes7.dex */
public class RoundProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f6435c;
    private int d;
    private float e;
    private int f;
    private boolean g;
    private int h;
    private Handler i;
    private int j;
    private Paint k;
    private int n;

    static /* synthetic */ float b(RoundProgressView roundProgressView, float f) {
        float f2 = roundProgressView.e + f;
        roundProgressView.e = f2;
        return f2;
    }

    public RoundProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0.0f;
        this.g = false;
        this.i = new Handler() { // from class: com.huawei.health.device.ui.util.RoundProgressView.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                if (RoundProgressView.this.g) {
                    RoundProgressView.b(RoundProgressView.this, 10.138f);
                    RoundProgressView.this.postInvalidate();
                    sendEmptyMessageDelayed(0, 50L);
                }
            }
        };
        d();
    }

    private void d() {
        LogUtil.a("ProgressBarView", "init");
        Paint paint = new Paint();
        this.f6435c = paint;
        paint.setAntiAlias(true);
        this.f6435c.setDither(true);
        this.f6435c.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.k = paint2;
        paint2.setAntiAlias(true);
        this.k.setDither(true);
        this.k.setStrokeCap(Paint.Cap.ROUND);
        this.f6434b = qrs.d(getContext(), 8.0f);
        this.d = qrs.d(getContext(), 1.0f);
    }

    private void getCircleCenter() {
        if (this.n == 0 || this.f == 0) {
            this.n = getWidth();
            int height = getHeight();
            this.f = height;
            this.h = (Math.min(this.n, height) / 2) - 10;
            this.f6433a = this.n / 2;
            this.j = this.f / 2;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            LogUtil.a("ProgressBarView", "onDraw convas is null");
            return;
        }
        getCircleCenter();
        if (this.g) {
            e(this.e - 50.0f, "#0cfb6522", canvas);
            e(this.e - 30.0f, "#33fb6522", canvas);
            e(this.e - 10.0f, "#66fb6522", canvas);
            e(this.e + 10.0f, "#92fb6522", canvas);
            e(this.e + 30.0f, "#CCfb6522", canvas);
            e(this.e + 50.0f, "#FFfb6522", canvas);
            e(this.e + 70.0f, "#ffffff", canvas);
            return;
        }
        e(canvas);
        c();
    }

    private void e(float f, String str, Canvas canvas) {
        this.k.setColor(Color.parseColor(str));
        this.k.setStrokeWidth(this.d);
        for (float f2 = f; f2 <= 17.0f + f; f2 += 3.6363637f) {
            b(((double) ((1.6f + f2) / 180.0f)) * 3.141592653589793d, canvas);
        }
    }

    private void e(Canvas canvas) {
        this.f6435c.setColor(ContextCompat.getColor(getContext(), R.color.emui_color_list_divider));
        this.f6435c.setStrokeWidth(this.d);
        this.f6435c.setStrokeCap(Paint.Cap.ROUND);
        for (float f = 1.6f; f <= 360.0f; f += 3.6363637f) {
            double d = ((double) ((0.0f + f) / 180.0f)) * 3.141592653589793d;
            float fSin = this.f6433a - (this.h * ((float) Math.sin(d)));
            float fCos = this.j + (this.h * ((float) Math.cos(d)));
            canvas.drawLine(fSin, fCos, fSin + (this.f6434b * ((float) Math.sin(d))), fCos - (this.f6434b * ((float) Math.cos(d))), this.f6435c);
        }
    }

    private void c() {
        this.k.setColor(Color.parseColor("#FFfb6522"));
        this.k.setStrokeWidth(this.d);
        this.k.setStrokeCap(Paint.Cap.ROUND);
    }

    private void b(double d, Canvas canvas) {
        float fSin = this.f6433a + (this.h * ((float) Math.sin(d)));
        float fCos = this.j - (this.h * ((float) Math.cos(d)));
        canvas.drawLine(fSin, fCos, fSin - (this.f6434b * ((float) Math.sin(d))), fCos + (this.f6434b * ((float) Math.cos(d))), this.k);
    }

    public void e() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.i.sendEmptyMessageDelayed(0, 50L);
    }

    public void a() {
        this.g = false;
        this.e = 0.0f;
        this.i.removeCallbacksAndMessages(null);
        postInvalidate();
    }
}
