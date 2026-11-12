package com.huawei.health.splash;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import defpackage.qrs;

/* JADX INFO: loaded from: classes8.dex */
public class GuidePointView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8792c;
    private int d;
    private int e;

    public GuidePointView(Context context, int i, int i2) {
        this(context, (AttributeSet) null, 0);
        this.f8791b = context;
        this.e = i;
        this.f8792c = i2;
    }

    public GuidePointView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f8791b = context;
    }

    public GuidePointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 3;
        this.f8792c = 3;
        this.f8791b = context;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        d(canvas);
    }

    private void d(Canvas canvas) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        for (int i = 0; i < this.e; i++) {
            if (i == this.f8792c) {
                paint.setColor(16475426);
                paint.setAlpha(255);
            } else {
                paint.setColor(637534208);
                paint.setAlpha(127);
            }
            Point point = new Point(((this.f8790a / 2) - ((int) ((qrs.d(this.f8791b, 12.0f) * this.e) / 2.0f))) + qrs.d(this.f8791b, 3.0f) + (qrs.d(this.f8791b, 12.0f) * i), this.d / 2);
            canvas.drawCircle(point.x, point.y, qrs.d(this.f8791b, 6.0f) / 2.0f, paint);
        }
    }

    public void setSelected(int i) {
        if (i > this.e) {
            return;
        }
        this.f8792c = i;
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f8790a = getMeasuredWidth();
        this.d = getMeasuredHeight();
    }
}
