package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class ei extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6015b = Color.argb(255, 235, 235, 235);
    public static final int c = Color.argb(255, 21, 21, 21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f6016a;

    public ei(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f6016a = paint;
        paint.setAntiAlias(true);
        this.f6016a.setColor(f6015b);
    }

    public final void a() {
        setVisibility(8);
    }

    public final void b(int i) {
        Paint paint = this.f6016a;
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
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f6016a);
    }
}
