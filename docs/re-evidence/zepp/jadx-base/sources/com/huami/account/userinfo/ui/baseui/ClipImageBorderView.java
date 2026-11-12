package com.huami.account.userinfo.ui.baseui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ClipImageBorderView extends View {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    public int g;
    public int h;
    private Paint i;
    private Path j;
    private int k;
    private boolean l;

    public ClipImageBorderView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        int i = this.g / 2;
        int i2 = this.a + i;
        int i3 = this.b + i;
        canvas.clipRect(0, 0, getWidth(), getHeight());
        this.j.addCircle(getWidth() / 2, getHeight() / 2, ((getWidth() / 2) - (this.f * 2)) - i2, Path.Direction.CW);
        canvas.clipPath(this.j, Region.Op.DIFFERENCE);
        canvas.drawColor(this.e);
        this.i.setColor(this.d);
        this.i.setStrokeWidth(this.f * 2);
        this.i.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, ((getWidth() / 2) - (this.f * 2)) - i2, this.i);
        this.i.setStrokeWidth(this.g);
        float f = i2;
        float f2 = i3 - i;
        canvas.drawLine(f, this.h + i3, f, f2, this.i);
        float f3 = i2 - i;
        float f4 = i3;
        canvas.drawLine(f3, f4, this.h + i2, f4, this.i);
        canvas.drawLine((getWidth() - this.h) - i2, f4, (getWidth() - i2) + i, f4, this.i);
        canvas.drawLine(getWidth() - i2, f2, getWidth() - i2, this.h + i3, this.i);
        canvas.drawLine(getWidth() - i2, (getHeight() - this.h) - i3, getWidth() - i2, (getHeight() - i3) + i, this.i);
        canvas.drawLine((getWidth() - i2) + i, getHeight() - i3, (getWidth() - this.h) - i2, getHeight() - i3, this.i);
        canvas.drawLine(i2 + this.h, getHeight() - i3, f3, getHeight() - i3, this.i);
        canvas.drawLine(f, (getHeight() - i3) + i, f, (getHeight() - this.h) - i3, this.i);
    }

    private void b(Canvas canvas) {
        if (this.l) {
            c(canvas);
        } else {
            this.i.setStrokeWidth(this.f * 2);
        }
        this.i.setColor(this.d);
        this.i.setStyle(Paint.Style.STROKE);
        canvas.drawRect(this.a, this.b, getWidth() - this.a, getHeight() - this.b, this.i);
    }

    private void c(Canvas canvas) {
        this.i.setColor(this.e);
        this.i.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, this.a, getHeight(), this.i);
        canvas.drawRect(getWidth() - this.a, 0.0f, getWidth(), getHeight(), this.i);
        canvas.drawRect(this.a, 0.0f, getWidth() - this.a, this.b, this.i);
        canvas.drawRect(this.a, getHeight() - this.b, getWidth() - this.a, getHeight(), this.i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.c = getWidth() - (this.a * 2);
        this.b = (getHeight() - this.c) / 2;
        int i = this.k;
        if (i == 0) {
            b(canvas);
        } else if (i == 1) {
            a(canvas);
        }
    }

    public void setCropMode(int i) {
        this.k = i;
        invalidate();
    }

    public void setHorizontalPadding(int i) {
        this.a = i;
    }

    public void setRectAngleLength(int i) {
        this.h = i;
        invalidate();
    }

    public void setRectAngleWidth(int i) {
        this.g = i;
        invalidate();
    }

    public void setUseBackgroundColor(boolean z) {
        this.l = z;
        invalidate();
    }

    public ClipImageBorderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipImageBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        this.e = Color.argb(170, 0, 0, 0);
        this.f = 1;
        this.l = true;
        this.f = (int) TypedValue.applyDimension(1, 1, getResources().getDisplayMetrics());
        Paint paint = new Paint();
        this.i = paint;
        paint.setAntiAlias(true);
        this.j = new Path();
    }
}
