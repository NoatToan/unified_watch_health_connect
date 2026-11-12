package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class vw3 extends Drawable implements Animatable {
    public static final Interpolator g = new LinearInterpolator();
    public static final Interpolator h = new ha9();
    public static final int[] i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f37286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f37287b;
    public Resources c;
    public Animator d;
    public float e;
    public boolean f;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f37288a;

        public a(c cVar) {
            this.f37288a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            vw3.this.t(fFloatValue, this.f37288a);
            vw3.this.b(fFloatValue, this.f37288a, false);
            vw3.this.invalidateSelf();
        }
    }

    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f37290a;

        public b(c cVar) {
            this.f37290a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            vw3.this.b(1.0f, this.f37290a, true);
            this.f37290a.F();
            this.f37290a.o();
            vw3 vw3Var = vw3.this;
            if (!vw3Var.f) {
                vw3Var.e += 1.0f;
                return;
            }
            vw3Var.f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f37290a.B(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            vw3.this.e = 0.0f;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f37292a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f37293b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f37294k;
        public float l;
        public float m;
        public boolean n;
        public Path o;
        public float p;
        public float q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f37295r;
        public int s;
        public int t;
        public int u;

        public c() {
            Paint paint = new Paint();
            this.f37293b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A(float f) {
            this.g = f;
        }

        public void B(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        public void C(float f) {
            this.e = f;
        }

        public void D(Paint.Cap cap) {
            this.f37293b.setStrokeCap(cap);
        }

        public void E(float f) {
            this.h = f;
            this.f37293b.setStrokeWidth(f);
        }

        public void F() {
            this.f37294k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f37292a;
            float f = this.q;
            float fMin = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f37295r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.e;
            float f3 = this.g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f + f3) * 360.0f) - f4;
            this.f37293b.setColor(this.u);
            this.f37293b.setAlpha(this.t);
            float f6 = this.h / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.f37293b);
            b(canvas, f4, f5, rectF);
        }

        public void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f37295r * this.p) / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.f37295r * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.f37295r;
                float f5 = this.p;
                path3.lineTo((f4 * f5) / 2.0f, this.s * f5);
                this.o.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        public int c() {
            return this.t;
        }

        public int d() {
            return this.d.getColor();
        }

        public int[] e() {
            return this.i;
        }

        public float f() {
            return this.f;
        }

        public int g() {
            return this.i[h()];
        }

        public int h() {
            return (this.j + 1) % this.i.length;
        }

        public float i() {
            return this.e;
        }

        public int j() {
            return this.i[this.j];
        }

        public float k() {
            return this.l;
        }

        public float l() {
            return this.m;
        }

        public float m() {
            return this.f37294k;
        }

        public float n() {
            return this.h;
        }

        public void o() {
            x(h());
        }

        public void p() {
            this.f37294k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            C(0.0f);
            z(0.0f);
            A(0.0f);
        }

        public void q(int i) {
            this.t = i;
        }

        public void r(float f, float f2) {
            this.f37295r = (int) f;
            this.s = (int) f2;
        }

        public void s(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }

        public void t(int i) {
            this.d.setColor(i);
        }

        public void u(float f) {
            this.q = f;
        }

        public void v(int i) {
            this.u = i;
        }

        public void w(ColorFilter colorFilter) {
            this.f37293b.setColorFilter(colorFilter);
        }

        public void x(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        public void y(int[] iArr) {
            this.i = iArr;
            x(0);
        }

        public void z(float f) {
            this.f = f;
        }
    }

    public vw3(Context context) {
        this.c = ((Context) g6i.g(context)).getResources();
        c cVar = new c();
        this.f37286a = cVar;
        cVar.y(i);
        q(2.5f);
        s();
    }

    public final void a(float f, c cVar) {
        t(f, cVar);
        float fFloor = (float) (Math.floor(cVar.l() / 0.8f) + 1.0d);
        cVar.C(cVar.m() + (((cVar.k() - 0.01f) - cVar.m()) * f));
        cVar.z(cVar.k());
        cVar.A(cVar.l() + ((fFloor - cVar.l()) * f));
    }

    public void b(float f, c cVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f) {
            a(f, cVar);
            return;
        }
        if (f != 1.0f || z) {
            float fL = cVar.l();
            if (f < 0.5f) {
                interpolation = cVar.m();
                interpolation2 = (h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM = cVar.m() + 0.79f;
                interpolation = fM - (((1.0f - h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM;
            }
            float f2 = fL + (0.20999998f * f);
            float f3 = (f + this.e) * 216.0f;
            cVar.C(interpolation);
            cVar.z(interpolation2);
            cVar.A(f2);
            m(f3);
        }
    }

    public final int c(float f, int i2, int i3) {
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        return ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f))) << 8) | (i7 + ((int) (f * ((i3 & 255) - i7))));
    }

    public int d() {
        return this.f37286a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f37287b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f37286a.a(canvas, bounds);
        canvas.restore();
    }

    public int[] e() {
        return this.f37286a.e();
    }

    public float f() {
        return this.f37286a.n();
    }

    public void g(boolean z) {
        this.f37286a.B(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37286a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(float f) {
        this.f37286a.s(f);
        invalidateSelf();
    }

    public void i(int i2) {
        this.f37286a.t(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.d.isRunning();
    }

    public void j(float f) {
        this.f37286a.u(f);
        invalidateSelf();
    }

    public void k(int... iArr) {
        this.f37286a.y(iArr);
        this.f37286a.x(0);
        invalidateSelf();
    }

    public void l(float f) {
        this.f37286a.A(f);
        invalidateSelf();
    }

    public final void m(float f) {
        this.f37287b = f;
    }

    public final void n(float f, float f2, float f3, float f4) {
        c cVar = this.f37286a;
        float f5 = this.c.getDisplayMetrics().density;
        cVar.E(f2 * f5);
        cVar.u(f * f5);
        cVar.x(0);
        cVar.r(f3 * f5, f4 * f5);
    }

    public void o(float f, float f2) {
        this.f37286a.C(f);
        this.f37286a.z(f2);
        invalidateSelf();
    }

    public void p(Paint.Cap cap) {
        this.f37286a.D(cap);
        invalidateSelf();
    }

    public void q(float f) {
        this.f37286a.E(f);
        invalidateSelf();
    }

    public void r(int i2) {
        if (i2 == 0) {
            n(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            n(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void s() {
        c cVar = this.f37286a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.d = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f37286a.q(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37286a.w(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.d.cancel();
        this.f37286a.F();
        if (this.f37286a.f() != this.f37286a.i()) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
        } else {
            this.f37286a.x(0);
            this.f37286a.p();
            this.d.setDuration(1332L);
            this.d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.d.cancel();
        m(0.0f);
        this.f37286a.B(false);
        this.f37286a.x(0);
        this.f37286a.p();
        invalidateSelf();
    }

    public void t(float f, c cVar) {
        if (f > 0.75f) {
            cVar.v(c((f - 0.75f) / 0.25f, cVar.j(), cVar.g()));
        } else {
            cVar.v(cVar.j());
        }
    }
}
