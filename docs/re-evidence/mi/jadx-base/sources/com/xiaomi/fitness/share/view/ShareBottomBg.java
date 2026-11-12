package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public class ShareBottomBg extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12890b;
    public int c;
    public int d;
    public Paint e;

    public ShareBottomBg(Context context) {
        super(context);
        this.c = 20;
        a();
    }

    public final void a() {
        Paint paint = new Paint();
        this.e = paint;
        paint.setColor(-16777216);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.rotate(45.0f);
        canvas.translate(0.0f, -getHeight());
        int i = 0;
        while (i < this.c * 2) {
            int i2 = i + 1;
            if (i2 % 2 == 0) {
                RectF rectF = new RectF();
                int i3 = this.d;
                float f = (i * i3) - (i3 / 2);
                rectF.set(f, getHeight() * (-2), this.d + f, getHeight() * 2);
                canvas.drawRect(rectF, this.e);
            }
            i = i2;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12889a = View.MeasureSpec.getSize(i);
        this.f12890b = View.MeasureSpec.getSize(i2);
        this.d = this.f12889a / this.c;
    }

    public ShareBottomBg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 20;
        a();
    }

    public ShareBottomBg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 20;
        a();
    }
}
