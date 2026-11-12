package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(21)
public class lxk extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f25526a;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean h;
    public boolean i;
    public RoundRectShape j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25528k;
    public int l;
    public int[] m;
    public float[] n;
    public Shader o;
    public ColorStateList q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PorterDuffColorFilter f25529r;
    public ColorStateList s;
    public boolean f = false;
    public boolean g = true;
    public Paint p = null;
    public PorterDuff.Mode t = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f25527b = new Paint(5);

    public lxk(ColorStateList colorStateList, float f, int i, int i2) {
        this.f25526a = f;
        d(colorStateList);
        this.c = new RectF();
        this.d = new Rect();
        this.f25528k = i;
        this.l = i2;
        if (i > 0) {
            a();
            this.h = true;
        }
    }

    public final void a() {
        Paint paint = new Paint(1);
        this.p = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.p.setColor(this.l);
        this.p.setStrokeWidth(this.f25528k);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public ColorStateList c() {
        return this.q;
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.q = colorStateList;
        this.f25527b.setColor(colorStateList.getColorForState(getState(), this.q.getDefaultColor()));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f25527b;
        Paint paint2 = this.p;
        if (this.f25529r == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f25529r);
            z = true;
        }
        RectF rectF = this.c;
        float f = this.f25526a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (paint2 != null) {
            if (this.i && this.m != null) {
                this.i = false;
                this.o = new LinearGradient(0.0f, 0.0f, 0.0f, getBounds().height(), this.m, this.n, Shader.TileMode.CLAMP);
            }
            if (this.h) {
                l();
            }
            Shader shader = this.o;
            if (shader != null) {
                paint2.setShader(shader);
                paint2.setColor(-16777216);
            } else {
                paint2.setColor(this.l);
            }
            RoundRectShape roundRectShape = this.j;
            if (roundRectShape != null) {
                roundRectShape.draw(canvas, this.p);
            }
        }
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public void e(ColorStateList colorStateList) {
        d(colorStateList);
        invalidateSelf();
    }

    public void f(float f) {
        if (f == this.f25526a) {
            return;
        }
        this.f25526a = f;
        k(null);
        invalidateSelf();
    }

    public void g(int i) {
        if (this.l != i) {
            this.l = i;
            this.h = true;
            Paint paint = this.p;
            if (paint != null) {
                paint.setColor(i);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f25526a);
    }

    public void h(float[] fArr) {
        this.n = fArr;
        this.i = true;
    }

    public void i(int[] iArr) {
        this.m = iArr;
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.s;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.q) != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void j(int i) {
        if (this.f25528k != i) {
            this.f25528k = i;
            this.h = true;
            Paint paint = this.p;
            if (paint != null) {
                paint.setStrokeWidth(i);
            } else if (i > 0) {
                a();
            }
            invalidateSelf();
        }
    }

    public final void k(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.d.set(rect);
        if (this.f) {
            this.d.inset((int) Math.ceil(nxk.a(this.e, this.f25526a, this.g)), (int) Math.ceil(nxk.b(this.e, this.f25526a, this.g)));
            this.c.set(this.d);
        }
    }

    public final void l() {
        this.h = false;
        float f = this.f25526a;
        float[] fArr = {f, f, f, f, f, f, f, f};
        float f2 = f - this.f25528k;
        int i = this.f25528k;
        this.j = new RoundRectShape(fArr, new RectF(i, i, i, i), new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        Rect bounds = getBounds();
        this.j.resize(bounds.width(), bounds.height());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        k(rect);
        RoundRectShape roundRectShape = this.j;
        if (roundRectShape != null) {
            roundRectShape.resize(rect.width(), rect.height());
        }
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.q;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f25527b.getColor();
        if (z) {
            this.f25527b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.s;
        if (colorStateList2 == null || (mode = this.t) == null) {
            return z;
        }
        this.f25529r = b(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f25527b.setAlpha((Color.alpha(this.q.getColorForState(getState(), this.q.getDefaultColor())) * i) / 255);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f25527b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.f25529r = b(colorStateList, this.t);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.f25529r = b(this.s, mode);
        invalidateSelf();
    }
}
