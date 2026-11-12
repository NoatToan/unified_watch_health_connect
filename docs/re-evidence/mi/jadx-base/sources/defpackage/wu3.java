package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public class wu3 extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38354b;
    public int c;
    public int d;
    public Paint e;
    public Paint f;
    public float g;
    public boolean h;

    public wu3(int i, int i2, int i3) {
        this(i, i2, i3, 0, 0, 0);
    }

    public void a(float f) {
        this.g = f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.bottom;
        int i5 = (i3 + i4) / 2;
        int iMin = Math.min(i - i2, i4 - i3) / 2;
        float f = (i + i2) / 2;
        float f2 = i5;
        float f3 = iMin;
        canvas.drawCircle(f, f2, (this.g * f3) - 1.0f, this.e);
        if (this.h) {
            canvas.drawCircle(f, f2, ((f3 * this.g) - 1.0f) - 1.0f, this.f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.setAlpha(i);
        if (this.h) {
            if (i == this.f38353a) {
                this.f.setAlpha(this.c);
            } else if (i == this.f38354b) {
                this.f.setAlpha(this.d);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public wu3(int i, int i2, int i3, int i4, int i5, int i6) {
        this.e = new Paint();
        this.f = new Paint();
        this.g = 1.0f;
        this.e.setAntiAlias(true);
        this.e.setColor(i);
        this.f38353a = i2;
        this.f38354b = i3;
        boolean z = i4 != 0;
        this.h = z;
        if (z) {
            this.f.setAntiAlias(true);
            this.f.setColor(i4);
            this.f.setStyle(Paint.Style.STROKE);
            this.f.setStrokeWidth(2.0f);
        }
        this.c = i5;
        this.d = i6;
    }
}
