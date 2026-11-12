package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ei extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2423a = Color.argb(255, 235, 235, 235);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2424b = Color.argb(255, 21, 21, 21);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f2425c;

    public ei(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f2425c = paint;
        paint.setAntiAlias(true);
        this.f2425c.setColor(f2423a);
    }

    public final void a(int i) {
        Paint paint = this.f2425c;
        if (paint != null) {
            paint.setColor(i);
            try {
                postInvalidate();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f2425c);
    }

    public final void a() {
        setVisibility(8);
    }
}
