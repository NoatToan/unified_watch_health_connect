package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xxk extends Drawable implements qxk, ayp {
    public byp C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f39565a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f39567k;
    public RectF p;
    public Matrix v;
    public Matrix w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39566b = false;
    public boolean c = false;
    public float d = 0.0f;
    public final Path e = new Path();
    public boolean f = true;
    public int g = 0;
    public final Path h = new Path();
    public final float[] i = new float[8];
    public final float[] j = new float[8];
    public final RectF l = new RectF();
    public final RectF m = new RectF();
    public final RectF n = new RectF();
    public final RectF o = new RectF();
    public final Matrix q = new Matrix();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f39568r = new Matrix();
    public final Matrix s = new Matrix();
    public final Matrix t = new Matrix();
    public final Matrix u = new Matrix();
    public final Matrix x = new Matrix();
    public float y = 0.0f;
    public boolean z = false;
    public boolean A = false;
    public boolean B = true;

    public xxk(Drawable drawable) {
        this.f39565a = drawable;
    }

    @Override // defpackage.qxk
    public void a(int i, float f) {
        if (this.g == i && this.d == f) {
            return;
        }
        this.g = i;
        this.d = f;
        this.B = true;
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void b(boolean z) {
        this.f39566b = z;
        this.B = true;
        invalidateSelf();
    }

    @Override // defpackage.qxk
    public void c(float f) {
        if (this.y != f) {
            this.y = f;
            this.B = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f39565a.clearColorFilter();
    }

    @Override // defpackage.qxk
    public void d(float f) {
        b6i.i(f >= 0.0f);
        Arrays.fill(this.i, f);
        this.c = f != 0.0f;
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (epa.d()) {
            epa.a("RoundedDrawable#draw");
        }
        this.f39565a.draw(canvas);
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // defpackage.qxk
    public void e(boolean z) {
        if (this.A != z) {
            this.A = z;
            invalidateSelf();
        }
    }

    public boolean f() {
        return this.A;
    }

    public boolean g() {
        return this.f39566b || this.c || this.d > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        return this.f39565a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        return this.f39565a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f39565a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f39565a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f39565a.getOpacity();
    }

    public void h() {
        float[] fArr;
        if (this.B) {
            this.h.reset();
            RectF rectF = this.l;
            float f = this.d;
            rectF.inset(f / 2.0f, f / 2.0f);
            if (this.f39566b) {
                this.h.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.j;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.i[i] + this.y) - (this.d / 2.0f);
                    i++;
                }
                this.h.addRoundRect(this.l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.l;
            float f2 = this.d;
            rectF2.inset((-f2) / 2.0f, (-f2) / 2.0f);
            this.e.reset();
            float f3 = this.y + (this.z ? this.d : 0.0f);
            this.l.inset(f3, f3);
            if (this.f39566b) {
                this.e.addCircle(this.l.centerX(), this.l.centerY(), Math.min(this.l.width(), this.l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.z) {
                if (this.f39567k == null) {
                    this.f39567k = new float[8];
                }
                for (int i2 = 0; i2 < this.j.length; i2++) {
                    this.f39567k[i2] = this.i[i2] - this.d;
                }
                this.e.addRoundRect(this.l, this.f39567k, Path.Direction.CW);
            } else {
                this.e.addRoundRect(this.l, this.i, Path.Direction.CW);
            }
            float f4 = -f3;
            this.l.inset(f4, f4);
            this.e.setFillType(Path.FillType.WINDING);
            this.B = false;
        }
    }

    @Override // defpackage.ayp
    public void i(byp bypVar) {
        this.C = bypVar;
    }

    @Override // defpackage.qxk
    public void j(boolean z) {
        if (this.z != z) {
            this.z = z;
            this.B = true;
            invalidateSelf();
        }
    }

    public void k() {
        Matrix matrix;
        byp bypVar = this.C;
        if (bypVar != null) {
            bypVar.g(this.s);
            this.C.f(this.l);
        } else {
            this.s.reset();
            this.l.set(getBounds());
        }
        this.n.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        this.o.set(this.f39565a.getBounds());
        Matrix matrix2 = this.q;
        RectF rectF = this.n;
        RectF rectF2 = this.o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix2.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.z) {
            RectF rectF3 = this.p;
            if (rectF3 == null) {
                this.p = new RectF(this.l);
            } else {
                rectF3.set(this.l);
            }
            RectF rectF4 = this.p;
            float f = this.d;
            rectF4.inset(f, f);
            if (this.v == null) {
                this.v = new Matrix();
            }
            this.v.setRectToRect(this.l, this.p, scaleToFit);
        } else {
            Matrix matrix3 = this.v;
            if (matrix3 != null) {
                matrix3.reset();
            }
        }
        if (!this.s.equals(this.t) || !this.q.equals(this.f39568r) || ((matrix = this.v) != null && !matrix.equals(this.w))) {
            this.f = true;
            this.s.invert(this.u);
            this.x.set(this.s);
            if (this.z) {
                this.x.postConcat(this.v);
            }
            this.x.preConcat(this.q);
            this.t.set(this.s);
            this.f39568r.set(this.q);
            if (this.z) {
                Matrix matrix4 = this.w;
                if (matrix4 == null) {
                    this.w = new Matrix(this.v);
                } else {
                    matrix4.set(this.v);
                }
            } else {
                Matrix matrix5 = this.w;
                if (matrix5 != null) {
                    matrix5.reset();
                }
            }
        }
        if (this.l.equals(this.m)) {
            return;
        }
        this.B = true;
        this.m.set(this.l);
    }

    @Override // defpackage.qxk
    public void l(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.i, 0.0f);
            this.c = false;
        } else {
            b6i.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.i, 0, 8);
            this.c = false;
            for (int i = 0; i < 8; i++) {
                this.c |= fArr[i] > 0.0f;
            }
        }
        this.B = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f39565a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f39565a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f39565a.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f39565a.setColorFilter(colorFilter);
    }
}
