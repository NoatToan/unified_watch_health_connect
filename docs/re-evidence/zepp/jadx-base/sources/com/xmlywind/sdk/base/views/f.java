package com.xmlywind.sdk.base.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import com.xmlywind.logger.SigmobLog;

/* JADX INFO: loaded from: classes22.dex */
public class f extends a {
    private final Paint a;
    private final Paint b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private final int h;

    public f(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        paint.setAlpha(128);
        paint.setStyle(c.a.a);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(c.a.b);
        paint2.setAlpha(255);
        paint2.setStyle(c.a.c);
        paint2.setAntiAlias(true);
        this.h = com.xmlywind.sdk.common.utils.c.b(4.0f, context);
    }

    private void a() {
        this.e = this.c;
    }

    @SuppressLint({"DefaultLocale"})
    public void a(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.e = i;
            this.f = i;
        } else if (i != 0) {
            SigmobLog.d(String.format("Progress not monotonically increasing: last = %d, current = %d", Integer.valueOf(i2), Integer.valueOf(i)));
            a();
        }
        invalidateSelf();
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.g = i2 / i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.a);
        canvas.drawRect(getBounds().left, getBounds().top, getBounds().right * (this.e / this.c), getBounds().bottom, this.b);
        int i = this.d;
        if (i <= 0 || i >= this.c) {
            return;
        }
        float f = this.g * getBounds().right;
        canvas.drawRect(f, getBounds().top, f + this.h, getBounds().bottom, this.b);
    }

    @Override // com.xmlywind.sdk.base.views.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.xmlywind.sdk.base.views.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // com.xmlywind.sdk.base.views.a, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }
}
