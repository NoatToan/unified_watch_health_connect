package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.collection.ScatterMapKt;
import com.airbnb.lottie.RenderMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class jte extends Drawable implements Drawable.Callback, Animatable {
    public Rect A;
    public RectF B;
    public Paint C;
    public Rect D;
    public Rect E;
    public RectF F;
    public RectF G;
    public Matrix H;
    public Matrix I;
    public boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lse f23114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xte f23115b;
    public boolean c;
    public boolean d;
    public boolean e;
    public c f;
    public final ArrayList<b> g;
    public final ValueAnimator.AnimatorUpdateListener h;
    public t2d i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public uz9 f23116k;
    public Map<String, Typeface> l;
    public String m;
    public boolean n;
    public boolean o;
    public boolean p;
    public com.airbnb.lottie.model.layer.b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23117r;
    public boolean s;
    public boolean t;
    public boolean u;
    public RenderMode v;
    public boolean w;
    public final Matrix x;
    public Bitmap y;
    public Canvas z;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (jte.this.q != null) {
                jte.this.q.L(jte.this.f23115b.j());
            }
        }
    }

    public interface b {
        void a(lse lseVar);
    }

    public enum c {
        NONE,
        PLAY,
        RESUME
    }

    public jte() {
        xte xteVar = new xte();
        this.f23115b = xteVar;
        this.c = true;
        this.d = false;
        this.e = false;
        this.f = c.NONE;
        this.g = new ArrayList<>();
        a aVar = new a();
        this.h = aVar;
        this.o = false;
        this.p = true;
        this.f23117r = 255;
        this.v = RenderMode.AUTOMATIC;
        this.w = false;
        this.x = new Matrix();
        this.J = false;
        xteVar.addUpdateListener(aVar);
    }

    public boolean A() {
        return this.n;
    }

    public void A0(String str) {
        this.m = str;
        uz9 uz9VarI = I();
        if (uz9VarI != null) {
            uz9VarI.c(str);
        }
    }

    public void B() {
        this.g.clear();
        this.f23115b.i();
        if (isVisible()) {
            return;
        }
        this.f = c.NONE;
    }

    public void B0(tz9 tz9Var) {
        uz9 uz9Var = this.f23116k;
        if (uz9Var != null) {
            uz9Var.d(tz9Var);
        }
    }

    public final void C(int i, int i2) {
        Bitmap bitmap = this.y;
        if (bitmap == null || bitmap.getWidth() < i || this.y.getHeight() < i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.y = bitmapCreateBitmap;
            this.z.setBitmap(bitmapCreateBitmap);
            this.J = true;
            return;
        }
        if (this.y.getWidth() > i || this.y.getHeight() > i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.y, 0, 0, i, i2);
            this.y = bitmapCreateBitmap2;
            this.z.setBitmap(bitmapCreateBitmap2);
            this.J = true;
        }
    }

    public void C0(Map<String, Typeface> map) {
        if (map == this.l) {
            return;
        }
        this.l = map;
        invalidateSelf();
    }

    public final void D() {
        if (this.z != null) {
            return;
        }
        this.z = new Canvas();
        this.G = new RectF();
        this.H = new Matrix();
        this.I = new Matrix();
        this.A = new Rect();
        this.B = new RectF();
        this.C = new x1e();
        this.D = new Rect();
        this.E = new Rect();
        this.F = new RectF();
    }

    public void D0(final int i) {
        if (this.f23114a == null) {
            this.g.add(new b() { // from class: gte
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f19317a.f0(i, lseVar);
                }
            });
        } else {
            this.f23115b.A(i);
        }
    }

    public Bitmap E(String str) {
        t2d t2dVarK = K();
        if (t2dVarK != null) {
            return t2dVarK.a(str);
        }
        return null;
    }

    public void E0(boolean z) {
        this.d = z;
    }

    public boolean F() {
        return this.p;
    }

    public void F0(s2d s2dVar) {
        t2d t2dVar = this.i;
        if (t2dVar != null) {
            t2dVar.d(s2dVar);
        }
    }

    public lse G() {
        return this.f23114a;
    }

    public void G0(String str) {
        this.j = str;
    }

    public final Context H() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void H0(boolean z) {
        this.o = z;
    }

    public final uz9 I() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f23116k == null) {
            uz9 uz9Var = new uz9(getCallback(), null);
            this.f23116k = uz9Var;
            String str = this.m;
            if (str != null) {
                uz9Var.c(str);
            }
        }
        return this.f23116k;
    }

    public void I0(final int i) {
        if (this.f23114a == null) {
            this.g.add(new b() { // from class: hte
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f20434a.g0(i, lseVar);
                }
            });
        } else {
            this.f23115b.B(i + 0.99f);
        }
    }

    public int J() {
        return (int) this.f23115b.k();
    }

    public void J0(final String str) {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            this.g.add(new b() { // from class: bte
                @Override // jte.b
                public final void a(lse lseVar2) {
                    this.f4589a.h0(str, lseVar2);
                }
            });
            return;
        }
        g5f g5fVarL = lseVar.l(str);
        if (g5fVarL != null) {
            I0((int) (g5fVarL.f18618b + g5fVarL.c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public final t2d K() {
        t2d t2dVar = this.i;
        if (t2dVar != null && !t2dVar.b(H())) {
            this.i = null;
        }
        if (this.i == null) {
            this.i = new t2d(getCallback(), this.j, null, this.f23114a.j());
        }
        return this.i;
    }

    public void K0(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            this.g.add(new b() { // from class: xse
                @Override // jte.b
                public final void a(lse lseVar2) {
                    this.f39416a.i0(f, lseVar2);
                }
            });
        } else {
            this.f23115b.B(d5g.i(lseVar.p(), this.f23114a.f(), f));
        }
    }

    public String L() {
        return this.j;
    }

    public void L0(final int i, final int i2) {
        if (this.f23114a == null) {
            this.g.add(new b() { // from class: yse
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f40489a.j0(i, i2, lseVar);
                }
            });
        } else {
            this.f23115b.C(i, i2 + 0.99f);
        }
    }

    public mte M(String str) {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            return null;
        }
        return lseVar.j().get(str);
    }

    public void M0(final String str) {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            this.g.add(new b() { // from class: wse
                @Override // jte.b
                public final void a(lse lseVar2) {
                    this.f38309a.k0(str, lseVar2);
                }
            });
            return;
        }
        g5f g5fVarL = lseVar.l(str);
        if (g5fVarL != null) {
            int i = (int) g5fVarL.f18618b;
            L0(i, ((int) g5fVarL.c) + i);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public boolean N() {
        return this.o;
    }

    public void N0(final int i) {
        if (this.f23114a == null) {
            this.g.add(new b() { // from class: ite
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f22074a.l0(i, lseVar);
                }
            });
        } else {
            this.f23115b.D(i);
        }
    }

    public float O() {
        return this.f23115b.n();
    }

    public void O0(final String str) {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            this.g.add(new b() { // from class: cte
                @Override // jte.b
                public final void a(lse lseVar2) {
                    this.f14696a.m0(str, lseVar2);
                }
            });
            return;
        }
        g5f g5fVarL = lseVar.l(str);
        if (g5fVarL != null) {
            N0((int) g5fVarL.f18618b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public float P() {
        return this.f23115b.p();
    }

    public void P0(final float f) {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            this.g.add(new b() { // from class: ete
                @Override // jte.b
                public final void a(lse lseVar2) {
                    this.f17045a.n0(f, lseVar2);
                }
            });
        } else {
            N0((int) d5g.i(lseVar.p(), this.f23114a.f(), f));
        }
    }

    public tqh Q() {
        lse lseVar = this.f23114a;
        if (lseVar != null) {
            return lseVar.n();
        }
        return null;
    }

    public void Q0(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        com.airbnb.lottie.model.layer.b bVar = this.q;
        if (bVar != null) {
            bVar.J(z);
        }
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float R() {
        return this.f23115b.j();
    }

    public void R0(boolean z) {
        this.s = z;
        lse lseVar = this.f23114a;
        if (lseVar != null) {
            lseVar.v(z);
        }
    }

    public RenderMode S() {
        return this.w ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public void S0(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        if (this.f23114a == null) {
            this.g.add(new b() { // from class: fte
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f18223a.o0(f, lseVar);
                }
            });
            return;
        }
        w1e.a("Drawable#setProgress");
        this.f23115b.A(this.f23114a.h(f));
        w1e.b("Drawable#setProgress");
    }

    public int T() {
        return this.f23115b.getRepeatCount();
    }

    public void T0(RenderMode renderMode) {
        this.v = renderMode;
        v();
    }

    @SuppressLint({"WrongConstant"})
    public int U() {
        return this.f23115b.getRepeatMode();
    }

    public void U0(int i) {
        this.f23115b.setRepeatCount(i);
    }

    public float V() {
        return this.f23115b.q();
    }

    public void V0(int i) {
        this.f23115b.setRepeatMode(i);
    }

    public r7p W() {
        return null;
    }

    public void W0(boolean z) {
        this.e = z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface X(sz9 sz9Var) {
        Map<String, Typeface> map = this.l;
        if (map != null) {
            String strA = sz9Var.a();
            if (map.containsKey(strA)) {
                return map.get(strA);
            }
            String strB = sz9Var.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String str = sz9Var.a() + "-" + sz9Var.c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        uz9 uz9VarI = I();
        if (uz9VarI != null) {
            return uz9VarI.b(sz9Var);
        }
        return null;
    }

    public void X0(float f) {
        this.f23115b.F(f);
    }

    public final boolean Y() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    public void Y0(Boolean bool) {
        this.c = bool.booleanValue();
    }

    public boolean Z() {
        xte xteVar = this.f23115b;
        if (xteVar == null) {
            return false;
        }
        return xteVar.isRunning();
    }

    public void Z0(r7p r7pVar) {
    }

    public boolean a0() {
        if (isVisible()) {
            return this.f23115b.isRunning();
        }
        c cVar = this.f;
        return cVar == c.PLAY || cVar == c.RESUME;
    }

    public void a1(boolean z) {
        this.f23115b.G(z);
    }

    public boolean b0() {
        return this.u;
    }

    public boolean b1() {
        return this.l == null && this.f23114a.c().size() > 0;
    }

    public final /* synthetic */ void c0(f0e f0eVar, Object obj, yte yteVar, lse lseVar) {
        q(f0eVar, obj, yteVar);
    }

    public final /* synthetic */ void d0(lse lseVar) {
        q0();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        w1e.a("Drawable#draw");
        if (this.e) {
            try {
                if (this.w) {
                    t0(canvas, this.q);
                } else {
                    y(canvas);
                }
            } catch (Throwable th) {
                rpe.b("Lottie crashed in draw!", th);
            }
        } else if (this.w) {
            t0(canvas, this.q);
        } else {
            y(canvas);
        }
        this.J = false;
        w1e.b("Drawable#draw");
    }

    public final /* synthetic */ void e0(lse lseVar) {
        v0();
    }

    public final /* synthetic */ void f0(int i, lse lseVar) {
        D0(i);
    }

    public final /* synthetic */ void g0(int i, lse lseVar) {
        I0(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23117r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            return -1;
        }
        return lseVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            return -1;
        }
        return lseVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final /* synthetic */ void h0(String str, lse lseVar) {
        J0(str);
    }

    public final /* synthetic */ void i0(float f, lse lseVar) {
        K0(f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.J) {
            return;
        }
        this.J = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return Z();
    }

    public final /* synthetic */ void j0(int i, int i2, lse lseVar) {
        L0(i, i2);
    }

    public final /* synthetic */ void k0(String str, lse lseVar) {
        M0(str);
    }

    public final /* synthetic */ void l0(int i, lse lseVar) {
        N0(i);
    }

    public final /* synthetic */ void m0(String str, lse lseVar) {
        O0(str);
    }

    public final /* synthetic */ void n0(float f, lse lseVar) {
        P0(f);
    }

    public final /* synthetic */ void o0(float f, lse lseVar) {
        S0(f);
    }

    public void p(Animator.AnimatorListener animatorListener) {
        this.f23115b.addListener(animatorListener);
    }

    public void p0() {
        this.g.clear();
        this.f23115b.s();
        if (isVisible()) {
            return;
        }
        this.f = c.NONE;
    }

    public <T> void q(final f0e f0eVar, final T t, final yte<T> yteVar) {
        com.airbnb.lottie.model.layer.b bVar = this.q;
        if (bVar == null) {
            this.g.add(new b() { // from class: zse
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f41625a.c0(f0eVar, t, yteVar, lseVar);
                }
            });
            return;
        }
        if (f0eVar == f0e.c) {
            bVar.h(t, yteVar);
        } else if (f0eVar.d() != null) {
            f0eVar.d().h(t, yteVar);
        } else {
            List<f0e> listU0 = u0(f0eVar);
            for (int i = 0; i < listU0.size(); i++) {
                listU0.get(i).d().h(t, yteVar);
            }
            if (!(!listU0.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == ste.E) {
            S0(R());
        }
    }

    public void q0() {
        if (this.q == null) {
            this.g.add(new b() { // from class: dte
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f15914a.d0(lseVar);
                }
            });
            return;
        }
        v();
        if (r() || T() == 0) {
            if (isVisible()) {
                this.f23115b.t();
                this.f = c.NONE;
            } else {
                this.f = c.PLAY;
            }
        }
        if (r()) {
            return;
        }
        D0((int) (V() < 0.0f ? P() : O()));
        this.f23115b.i();
        if (isVisible()) {
            return;
        }
        this.f = c.NONE;
    }

    public final boolean r() {
        return this.c || this.d;
    }

    public void r0() {
        this.f23115b.removeAllListeners();
    }

    public final void s() {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, t6e.a(lseVar), lseVar.k(), lseVar);
        this.q = bVar;
        if (this.t) {
            bVar.J(true);
        }
        this.q.O(this.p);
    }

    public void s0() {
        this.f23115b.removeAllUpdateListeners();
        this.f23115b.addUpdateListener(this.h);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = ScatterMapKt.Sentinel) int i) {
        this.f23117r = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        rpe.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            c cVar = this.f;
            if (cVar == c.PLAY) {
                q0();
            } else if (cVar == c.RESUME) {
                v0();
            }
        } else if (this.f23115b.isRunning()) {
            p0();
            this.f = c.RESUME;
        } else if (!z3) {
            this.f = c.NONE;
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        q0();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        B();
    }

    public void t() {
        this.g.clear();
        this.f23115b.cancel();
        if (isVisible()) {
            return;
        }
        this.f = c.NONE;
    }

    public final void t0(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        if (this.f23114a == null || bVar == null) {
            return;
        }
        D();
        canvas.getMatrix(this.H);
        canvas.getClipBounds(this.A);
        w(this.A, this.B);
        this.H.mapRect(this.B);
        x(this.B, this.A);
        if (this.p) {
            this.G.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.a(this.G, null, false);
        }
        this.H.mapRect(this.G);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        w0(this.G, fWidth, fHeight);
        if (!Y()) {
            RectF rectF = this.G;
            Rect rect = this.A;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.G.width());
        int iCeil2 = (int) Math.ceil(this.G.height());
        if (iCeil == 0 || iCeil2 == 0) {
            return;
        }
        C(iCeil, iCeil2);
        if (this.J) {
            this.x.set(this.H);
            this.x.preScale(fWidth, fHeight);
            Matrix matrix = this.x;
            RectF rectF2 = this.G;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.y.eraseColor(0);
            bVar.d(this.z, this.x, this.f23117r);
            this.H.invert(this.I);
            this.I.mapRect(this.F, this.G);
            x(this.F, this.E);
        }
        this.D.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.y, this.D, this.E, this.C);
    }

    public void u() {
        if (this.f23115b.isRunning()) {
            this.f23115b.cancel();
            if (!isVisible()) {
                this.f = c.NONE;
            }
        }
        this.f23114a = null;
        this.q = null;
        this.i = null;
        this.f23115b.h();
        invalidateSelf();
    }

    public List<f0e> u0(f0e f0eVar) {
        if (this.q == null) {
            rpe.c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.q.c(f0eVar, 0, arrayList, new f0e(new String[0]));
        return arrayList;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final void v() {
        lse lseVar = this.f23114a;
        if (lseVar == null) {
            return;
        }
        this.w = this.v.useSoftwareRendering(Build.VERSION.SDK_INT, lseVar.q(), lseVar.m());
    }

    public void v0() {
        if (this.q == null) {
            this.g.add(new b() { // from class: ate
                @Override // jte.b
                public final void a(lse lseVar) {
                    this.f3431a.e0(lseVar);
                }
            });
            return;
        }
        v();
        if (r() || T() == 0) {
            if (isVisible()) {
                this.f23115b.x();
                this.f = c.NONE;
            } else {
                this.f = c.RESUME;
            }
        }
        if (r()) {
            return;
        }
        D0((int) (V() < 0.0f ? P() : O()));
        this.f23115b.i();
        if (isVisible()) {
            return;
        }
        this.f = c.NONE;
    }

    public final void w(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void w0(RectF rectF, float f, float f2) {
        rectF.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    public final void x(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void x0(boolean z) {
        this.u = z;
    }

    public final void y(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.q;
        lse lseVar = this.f23114a;
        if (bVar == null || lseVar == null) {
            return;
        }
        this.x.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.x.preScale(bounds.width() / lseVar.b().width(), bounds.height() / lseVar.b().height());
            this.x.preTranslate(bounds.left, bounds.top);
        }
        bVar.d(canvas, this.x, this.f23117r);
    }

    public void y0(boolean z) {
        if (z != this.p) {
            this.p = z;
            com.airbnb.lottie.model.layer.b bVar = this.q;
            if (bVar != null) {
                bVar.O(z);
            }
            invalidateSelf();
        }
    }

    public void z(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (this.f23114a != null) {
            s();
        }
    }

    public boolean z0(lse lseVar) {
        if (this.f23114a == lseVar) {
            return false;
        }
        this.J = true;
        u();
        this.f23114a = lseVar;
        s();
        this.f23115b.z(lseVar);
        S0(this.f23115b.getAnimatedFraction());
        Iterator it = new ArrayList(this.g).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(lseVar);
            }
            it.remove();
        }
        this.g.clear();
        lseVar.v(this.s);
        v();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }
}
