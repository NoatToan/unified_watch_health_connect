package com.huawei.health.ui.notification.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public class CircleProcessUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f10341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f10342c;
    private Context d;
    private int e;
    private Paint i;

    public CircleProcessUtil(Context context) {
        this.d = context;
    }

    private void e() {
        this.f10340a = c(this.d, 44.0f);
        int iC = c(this.d, 8.0f);
        this.e = iC;
        int i = iC / 2;
        float f = i;
        float f2 = this.f10340a - i;
        this.f10342c = new RectF(f, f, f2, f2);
        int iArgb = Color.argb(40, 255, 255, 255);
        Paint paint = new Paint();
        this.f10341b = paint;
        paint.setAntiAlias(true);
        this.f10341b.setStyle(Paint.Style.STROKE);
        this.f10341b.setColor(iArgb);
        this.f10341b.setStrokeWidth(this.e);
        this.f10341b.setFilterBitmap(false);
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setAntiAlias(true);
        this.i.setStyle(Paint.Style.STROKE);
        this.i.setStrokeJoin(Paint.Join.ROUND);
        this.i.setStrokeCap(Paint.Cap.ROUND);
        this.i.setColor(-1);
        this.i.setStrokeWidth(this.e);
    }

    public Bitmap c(float f) {
        e();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f10340a;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawArc(this.f10342c, 0.0f, 360.0f, false, this.f10341b);
        canvas.drawArc(this.f10342c, -90.0f, f * 360.0f, false, this.i);
        return bitmapCreateBitmap;
    }

    public static int c(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
