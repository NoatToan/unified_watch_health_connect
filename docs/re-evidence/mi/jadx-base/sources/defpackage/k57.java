package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes.dex */
public class k57 extends Drawable {
    public static final float m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f23467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f23468b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f23469k;
    public int l;

    public k57(Context context) {
        Paint paint = new Paint();
        this.f23467a = paint;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, z5j.b1, qii.C, n3j.f27508a);
        d(typedArrayObtainStyledAttributes.getColor(z5j.f1, 0));
        c(typedArrayObtainStyledAttributes.getDimension(z5j.j1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(z5j.i1, true));
        e(Math.round(typedArrayObtainStyledAttributes.getDimension(z5j.h1, 0.0f)));
        this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5j.g1, 0);
        this.c = Math.round(typedArrayObtainStyledAttributes.getDimension(z5j.e1, 0.0f));
        this.f23468b = Math.round(typedArrayObtainStyledAttributes.getDimension(z5j.c1, 0.0f));
        this.d = typedArrayObtainStyledAttributes.getDimension(z5j.d1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float a() {
        return this.j;
    }

    public void c(float f) {
        if (this.f23467a.getStrokeWidth() != f) {
            this.f23467a.setStrokeWidth(f);
            this.f23469k = (float) (((double) (f / 2.0f)) * Math.cos(m));
            invalidateSelf();
        }
    }

    public void d(int i) {
        if (i != this.f23467a.getColor()) {
            this.f23467a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? k47.f(this) == 0 : k47.f(this) == 1))) {
            z = true;
        }
        float f = this.f23468b;
        float fB = b(this.c, (float) Math.sqrt(f * f * 2.0f), this.j);
        float fB2 = b(this.c, this.d, this.j);
        float fRound = Math.round(b(0.0f, this.f23469k, this.j));
        float fB3 = b(0.0f, m, this.j);
        float fB4 = b(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.j);
        double d = fB;
        double d2 = fB3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.g.rewind();
        float fB5 = b(this.e + this.f23467a.getStrokeWidth(), -this.f23469k, this.j);
        float f2 = (-fB2) / 2.0f;
        this.g.moveTo(f2 + fRound, 0.0f);
        this.g.rLineTo(fB2 - (fRound * 2.0f), 0.0f);
        this.g.moveTo(f2, fB5);
        this.g.rLineTo(fRound2, fRound3);
        this.g.moveTo(f2, -fB5);
        this.g.rLineTo(fRound2, -fRound3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.f23467a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f3 = this.e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * f3))) / 4) * 2) + (strokeWidth * 1.5f) + f3);
        if (this.f) {
            canvas.rotate(fB4 * (this.i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.f23467a);
        canvas.restore();
    }

    public void e(float f) {
        if (f != this.e) {
            this.e = f;
            invalidateSelf();
        }
    }

    public void f(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f23467a.getAlpha()) {
            this.f23467a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23467a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }
}
