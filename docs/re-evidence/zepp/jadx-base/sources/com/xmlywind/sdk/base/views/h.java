package com.xmlywind.sdk.base.views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes22.dex */
public class h extends Drawable {
    private final Paint a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int[] g;
    private RectF h;

    public static class a {
        private int e;
        private int f;
        private int a = 1;
        private int b = 12;
        private int c = Color.parseColor("#4d000000");
        private int d = 18;
        private int[] g = {0};

        public a() {
            this.e = 0;
            this.f = 0;
            this.e = 0;
            this.f = 0;
        }

        public a a(int i) {
            this.b = i;
            return this;
        }

        public h a() {
            return new h(this.a, this.g, this.b, this.c, this.d, this.e, this.f);
        }

        public a b(int i) {
            this.c = i;
            return this;
        }

        public a c(int i) {
            this.d = i;
            return this;
        }

        public a d(int i) {
            this.e = i;
            return this;
        }

        public a e(int i) {
            this.f = i;
            return this;
        }

        public a f(int i) {
            this.g[0] = i;
            return this;
        }
    }

    private h(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.c = i;
        this.g = iArr;
        this.d = i2;
        this.b = i4;
        this.e = i5;
        this.f = i6;
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i4, i5, i6, i3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
    }

    public static void a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        h hVarA = new a().f(i).a(i2).b(i3).c(i4).d(i5).e(i6).a();
        view.setLayerType(1, null);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(hVarA);
        } else {
            view.setBackgroundDrawable(hVarA);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        int[] iArr = this.g;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                RectF rectF = this.h;
                float f = rectF.left;
                float fHeight = rectF.height() / 2.0f;
                RectF rectF2 = this.h;
                paint.setShader(new LinearGradient(f, fHeight, rectF2.right, rectF2.height() / 2.0f, this.g, (float[]) null, Shader.TileMode.CLAMP));
            }
        }
        paint.setAntiAlias(true);
        if (this.c != 1) {
            canvas.drawCircle(this.h.centerX(), this.h.centerY(), Math.min(this.h.width(), this.h.height()) / 2.0f, this.a);
            canvas.drawCircle(this.h.centerX(), this.h.centerY(), Math.min(this.h.width(), this.h.height()) / 2.0f, paint);
            return;
        }
        RectF rectF3 = this.h;
        int i = this.d;
        canvas.drawRoundRect(rectF3, i, i, this.a);
        RectF rectF4 = this.h;
        int i2 = this.d;
        canvas.drawRoundRect(rectF4, i2, i2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.b;
        int i6 = this.e;
        int i7 = this.f;
        this.h = new RectF((i + i5) - i6, (i2 + i5) - i7, (i3 - i5) - i6, (i4 - i5) - i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
