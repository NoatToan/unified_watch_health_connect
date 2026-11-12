package defpackage;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class sxk extends Drawable implements qxk {
    public float[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f34084a = new float[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f34085b = new float[8];
    public final Paint d = new Paint(1);
    public boolean e = false;
    public float f = 0.0f;
    public float g = 0.0f;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f34086k = new Path();
    public final Path l = new Path();
    public int m = 0;
    public final RectF n = new RectF();
    public int o = 255;

    public sxk(int i) {
        h(i);
    }

    @TargetApi(11)
    public static sxk f(ColorDrawable colorDrawable) {
        return new sxk(colorDrawable.getColor());
    }

    private void i() {
        float[] fArr;
        float[] fArr2;
        this.f34086k.reset();
        this.l.reset();
        this.n.set(getBounds());
        RectF rectF = this.n;
        float f = this.f;
        rectF.inset(f / 2.0f, f / 2.0f);
        int i = 0;
        if (this.e) {
            this.l.addCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr = this.f34085b;
                if (i2 >= fArr.length) {
                    break;
                }
                fArr[i2] = (this.f34084a[i2] + this.g) - (this.f / 2.0f);
                i2++;
            }
            this.l.addRoundRect(this.n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.n;
        float f2 = this.f;
        rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.g + (this.i ? this.f : 0.0f);
        this.n.inset(f3, f3);
        if (this.e) {
            this.f34086k.addCircle(this.n.centerX(), this.n.centerY(), Math.min(this.n.width(), this.n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.i) {
            if (this.c == null) {
                this.c = new float[8];
            }
            while (true) {
                fArr2 = this.c;
                if (i >= fArr2.length) {
                    break;
                }
                fArr2[i] = this.f34084a[i] - this.f;
                i++;
            }
            this.f34086k.addRoundRect(this.n, fArr2, Path.Direction.CW);
        } else {
            this.f34086k.addRoundRect(this.n, this.f34084a, Path.Direction.CW);
        }
        float f4 = -f3;
        this.n.inset(f4, f4);
    }

    @Override // defpackage.qxk
    public void a(int i, float f) {
        if (this.h != i) {
            this.h = i;
            invalidateSelf();
        }
        if (this.f != f) {
            this.f = f;
            i();
            invalidateSelf();
        }
    }

    @Override // defpackage.qxk
    public void b(boolean z) {
        this.e = z;
        i();
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void c(float f) {
        if (this.g != f) {
            this.g = f;
            i();
            invalidateSelf();
        }
    }

    @Override // defpackage.qxk
    public void d(float f) {
        b6i.c(f >= 0.0f, "radius should be non negative");
        Arrays.fill(this.f34084a, f);
        i();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.d.setColor(y47.c(this.m, this.o));
        this.d.setStyle(Paint.Style.FILL);
        this.d.setFilterBitmap(g());
        canvas.drawPath(this.f34086k, this.d);
        if (this.f != 0.0f) {
            this.d.setColor(y47.c(this.h, this.o));
            this.d.setStyle(Paint.Style.STROKE);
            this.d.setStrokeWidth(this.f);
            canvas.drawPath(this.l, this.d);
        }
    }

    @Override // defpackage.qxk
    public void e(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    public boolean g() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return y47.b(y47.c(this.m, this.o));
    }

    public void h(int i) {
        if (this.m != i) {
            this.m = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.qxk
    public void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            i();
            invalidateSelf();
        }
    }

    @Override // defpackage.qxk
    public void l(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f34084a, 0.0f);
        } else {
            b6i.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f34084a, 0, 8);
        }
        i();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.o) {
            this.o = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
