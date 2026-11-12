package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.b6i;
import defpackage.m1a;
import defpackage.qxk;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class RoundedCornersDrawable extends m1a implements qxk {
    public Type e;
    public final RectF f;
    public RectF g;
    public Matrix h;
    public final float[] i;
    public final float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f7102k;
    public boolean l;
    public float m;
    public int n;
    public int o;
    public float p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7103r;
    public final Path s;
    public final Path t;
    public final RectF u;

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7104a;

        static {
            int[] iArr = new int[Type.values().length];
            f7104a = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7104a[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) b6i.g(drawable));
        this.e = Type.OVERLAY_COLOR;
        this.f = new RectF();
        this.i = new float[8];
        this.j = new float[8];
        this.f7102k = new Paint(1);
        this.l = false;
        this.m = 0.0f;
        this.n = 0;
        this.o = 0;
        this.p = 0.0f;
        this.q = false;
        this.f7103r = false;
        this.s = new Path();
        this.t = new Path();
        this.u = new RectF();
    }

    private void r() {
        float[] fArr;
        this.s.reset();
        this.t.reset();
        this.u.set(getBounds());
        RectF rectF = this.u;
        float f = this.p;
        rectF.inset(f, f);
        Path path = this.s;
        RectF rectF2 = this.u;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(rectF2, direction);
        if (this.l) {
            this.s.addCircle(this.u.centerX(), this.u.centerY(), Math.min(this.u.width(), this.u.height()) / 2.0f, direction);
        } else {
            this.s.addRoundRect(this.u, this.i, direction);
        }
        RectF rectF3 = this.u;
        float f2 = this.p;
        rectF3.inset(-f2, -f2);
        RectF rectF4 = this.u;
        float f3 = this.m;
        rectF4.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.l) {
            this.t.addCircle(this.u.centerX(), this.u.centerY(), Math.min(this.u.width(), this.u.height()) / 2.0f, direction);
        } else {
            int i = 0;
            while (true) {
                fArr = this.j;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.i[i] + this.p) - (this.m / 2.0f);
                i++;
            }
            this.t.addRoundRect(this.u, fArr, Path.Direction.CW);
        }
        RectF rectF5 = this.u;
        float f4 = this.m;
        rectF5.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    @Override // defpackage.qxk
    public void a(int i, float f) {
        this.n = i;
        this.m = f;
        r();
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void b(boolean z) {
        this.l = z;
        r();
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void c(float f) {
        this.p = f;
        r();
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void d(float f) {
        Arrays.fill(this.i, f);
        r();
        invalidateSelf();
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f.set(getBounds());
        int i = a.f7104a[this.e.ordinal()];
        if (i == 1) {
            int iSave = canvas.save();
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.clipPath(this.s);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        } else if (i == 2) {
            if (this.q) {
                RectF rectF = this.g;
                if (rectF == null) {
                    this.g = new RectF(this.f);
                    this.h = new Matrix();
                } else {
                    rectF.set(this.f);
                }
                RectF rectF2 = this.g;
                float f = this.m;
                rectF2.inset(f, f);
                this.h.setRectToRect(this.f, this.g, Matrix.ScaleToFit.FILL);
                int iSave2 = canvas.save();
                canvas.clipRect(this.f);
                canvas.concat(this.h);
                super.draw(canvas);
                canvas.restoreToCount(iSave2);
            } else {
                super.draw(canvas);
            }
            this.f7102k.setStyle(Paint.Style.FILL);
            this.f7102k.setColor(this.o);
            this.f7102k.setStrokeWidth(0.0f);
            this.f7102k.setFilterBitmap(p());
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.s, this.f7102k);
            if (this.l) {
                float fWidth = ((this.f.width() - this.f.height()) + this.m) / 2.0f;
                float fHeight = ((this.f.height() - this.f.width()) + this.m) / 2.0f;
                if (fWidth > 0.0f) {
                    RectF rectF3 = this.f;
                    float f2 = rectF3.left;
                    canvas.drawRect(f2, rectF3.top, f2 + fWidth, rectF3.bottom, this.f7102k);
                    RectF rectF4 = this.f;
                    float f3 = rectF4.right;
                    canvas.drawRect(f3 - fWidth, rectF4.top, f3, rectF4.bottom, this.f7102k);
                }
                if (fHeight > 0.0f) {
                    RectF rectF5 = this.f;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    canvas.drawRect(f4, f5, rectF5.right, f5 + fHeight, this.f7102k);
                    RectF rectF6 = this.f;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas.drawRect(f6, f7 - fHeight, rectF6.right, f7, this.f7102k);
                }
            }
        }
        if (this.n != 0) {
            this.f7102k.setStyle(Paint.Style.STROKE);
            this.f7102k.setColor(this.n);
            this.f7102k.setStrokeWidth(this.m);
            this.s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.t, this.f7102k);
        }
    }

    @Override // defpackage.qxk
    public void e(boolean z) {
        if (this.f7103r != z) {
            this.f7103r = z;
            invalidateSelf();
        }
    }

    @Override // defpackage.qxk
    public void j(boolean z) {
        this.q = z;
        r();
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void l(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
        } else {
            b6i.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.i, 0, 8);
        }
        r();
        invalidateSelf();
    }

    @Override // defpackage.m1a, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        r();
    }

    public boolean p() {
        return this.f7103r;
    }

    public void q(int i) {
        this.o = i;
        invalidateSelf();
    }
}
