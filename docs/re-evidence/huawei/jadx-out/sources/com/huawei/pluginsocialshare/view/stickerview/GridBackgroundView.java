package com.huawei.pluginsocialshare.view.stickerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import defpackage.qrs;

/* JADX INFO: loaded from: classes42.dex */
public class GridBackgroundView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f22705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22707c;
    private Paint d;
    private RectF e;

    public GridBackgroundView(Context context) {
        super(context);
        e(context);
    }

    public GridBackgroundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public GridBackgroundView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    private void e(Context context) {
        Paint paint = new Paint();
        this.d = paint;
        int i = this.f22706b;
        if (i == 0) {
            i = -1;
        }
        paint.setColor(i);
        this.d.setStrokeWidth(qrs.d(BaseApplication.b(), 0.5f));
        Paint paint2 = new Paint();
        this.f22705a = paint2;
        paint2.setColor(-1);
        this.f22705a.setStrokeWidth(18.0f);
        this.f22705a.setStyle(Paint.Style.STROKE);
        this.f22705a.setAntiAlias(true);
        this.f22705a.setStrokeCap(Paint.Cap.ROUND);
        this.e = new RectF();
        this.f22707c = qrs.d(context, 20.0f);
    }

    public void d(int i) {
        this.f22706b = i;
        this.d.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = (height * 11) / 30.0f;
        float f2 = width;
        canvas.drawLine(0.0f, f, f2, f, this.d);
        float f3 = (height * 19) / 30.0f;
        canvas.drawLine(0.0f, f3, f2, f3, this.d);
        float f4 = f2 / 3.0f;
        float f5 = height;
        canvas.drawLine(f4, 0.0f, f4, f5, this.d);
        float f6 = (width * 2) / 3.0f;
        canvas.drawLine(f6, 0.0f, f6, f5, this.d);
        b(canvas, 0.0f, 0.0f, 180.0f);
        b(canvas, width - (this.f22707c * 2), 0.0f, 270.0f);
        b(canvas, 0.0f, height - (this.f22707c * 2), 90.0f);
        int i = this.f22707c * 2;
        b(canvas, width - i, height - i, 0.0f);
    }

    private void b(Canvas canvas, float f, float f2, float f3) {
        RectF rectF = this.e;
        float f4 = this.f22707c * 2;
        rectF.set(f, f2, f4 + f, f4 + f2);
        canvas.drawArc(this.e, f3 - 10.0f, 100.0f, false, this.f22705a);
    }
}
