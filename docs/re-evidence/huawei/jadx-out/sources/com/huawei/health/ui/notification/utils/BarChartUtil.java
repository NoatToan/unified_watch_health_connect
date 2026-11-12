package com.huawei.health.ui.notification.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes2.dex */
public class BarChartUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10339c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Paint h;
    private Paint i;
    private int j;
    private int o;

    public BarChartUtil(Context context) {
        this.f10338b = context;
    }

    private void a() {
        this.o = c(this.f10338b, 128.0f);
        this.j = c(this.f10338b, 61.0f);
        this.d = c(this.f10338b, 10.0f);
        this.e = c(this.f10338b, 8.0f);
        this.f10337a = c(this.f10338b, 11.666667f);
        this.f10339c = c(this.f10338b, 4.0f);
        this.f = c(this.f10338b, 2.0f);
        this.g = c(this.f10338b, 1.0f);
        Paint paint = new Paint();
        this.i = paint;
        paint.setARGB(153, 255, 255, 255);
        this.i.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setARGB(153, 255, 255, 255);
        this.h.setTextSize(this.d);
        this.h.setTextAlign(Paint.Align.CENTER);
    }

    public Bitmap e(XiaomiWidgetProvider.StepItem[] stepItemArr, int i) {
        a();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.o, this.j, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i2 = (this.j - (this.f * 2)) - this.d;
        float f = i2;
        float f2 = f / i;
        boolean zBa = LanguageUtil.ba(this.f10338b);
        int i3 = 0;
        while (i3 < stepItemArr.length) {
            int step = stepItemArr[i3].getStep();
            String dayOfWeek = stepItemArr[i3].getDayOfWeek();
            int i4 = this.g + ((this.e + this.f10337a) * i3);
            int i5 = (int) (step * f2);
            if ((i3 == 6 && !zBa) || (i3 == 0 && zBa)) {
                this.i.setAlpha(255);
            } else {
                this.i.setAlpha(153);
            }
            if (step > 0) {
                float f3 = i2 - i5;
                float f4 = this.e + i4;
                float f5 = this.f10339c;
                canvas.drawRoundRect(i4, f3, f4, f, f5, f5, this.i);
            }
            canvas.drawText(dayOfWeek, i4 + (this.e / 2.0f), this.j - this.f, this.h);
            i3++;
            i2 = i2;
        }
        return bitmapCreateBitmap;
    }

    public static int c(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
