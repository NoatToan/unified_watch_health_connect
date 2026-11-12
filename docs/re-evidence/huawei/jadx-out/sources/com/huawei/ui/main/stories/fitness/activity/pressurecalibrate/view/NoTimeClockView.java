package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.qrs;

/* JADX INFO: loaded from: classes19.dex */
public class NoTimeClockView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f26984b;
    private final int d;
    private final int e;

    public NoTimeClockView(Context context) {
        super(context);
        int iD = qrs.d(BaseApplication.getContext(), 120.0f);
        this.f26984b = iD;
        this.d = iD;
        this.e = iD;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(b(i), b(i2));
    }

    private int b(int i) {
        int iD = qrs.d(BaseApplication.getContext(), 240.0f);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        return mode == Integer.MIN_VALUE ? Math.min(iD, size) : iD;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        canvas.save();
        invalidate();
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.argb(255, 204, 204, 204));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(qrs.d(BaseApplication.getContext(), 1.0f));
        canvas.translate(this.f26984b, this.d);
        for (int i = 0; i < 180; i++) {
            canvas.drawLine(0.0f, this.e - qrs.d(BaseApplication.getContext(), 8.0f), 0.0f, this.e, paint);
            canvas.rotate(2.0f, 0.0f, 0.0f);
        }
    }
}
