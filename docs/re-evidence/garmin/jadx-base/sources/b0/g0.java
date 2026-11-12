package b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i1 {
    public static final d A = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f13893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i0 f13894s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Executor f13895t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f13896u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rect f13897v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Matrix f13898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l2.b f13899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public p1 f13900y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l2.c f13901z;

    public interface a {
        default Size c() {
            return null;
        }

        void e(a1 a1Var);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final androidx.camera.core.impl.k1 f13903a;

        static {
            Size size = new Size(640, 480);
            b0 b0Var = b0.f13854d;
            u0.c.a aVar = new u0.c.a();
            aVar.f167328a = u0.a.f167321c;
            aVar.f167329b = new u0.d(q0.c.f141973c, 1);
            u0.c cVarA = aVar.a();
            c cVar = new c();
            androidx.camera.core.impl.h hVar = n1.f5648p;
            w1 w1Var = cVar.f13902a;
            w1Var.X(hVar, size);
            w1Var.X(b3.f5512y, 1);
            w1Var.X(n1.f5643k, 0);
            w1Var.X(n1.f5651s, cVarA);
            if (!Objects.equals(b0Var, b0Var)) {
                org.apache.commons.lang3.e.w("ImageAnalysis currently only supports SDR");
            } else {
                w1Var.X(m1.f5634j, b0Var);
                f13903a = new androidx.camera.core.impl.k1(a2.T(w1Var));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public g0(androidx.camera.core.impl.k1 k1Var) {
        super(k1Var);
        this.f13893r = new Object();
    }

    @Override // b0.i1
    public final void A(Matrix matrix) {
        super.A(matrix);
        synchronized (this.f13893r) {
            try {
                i0 i0Var = this.f13894s;
                if (i0Var != null) {
                    i0Var.j(matrix);
                }
                this.f13898w = matrix;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.i1
    public final void C(Rect rect) {
        this.f13972k = rect;
        synchronized (this.f13893r) {
            try {
                i0 i0Var = this.f13894s;
                if (i0Var != null) {
                    i0Var.k(rect);
                }
                this.f13897v = rect;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    public final l2.b F(androidx.camera.core.impl.k1 k1Var, q2 q2Var) {
        androidx.camera.core.g gVar;
        final i0 i0Var;
        boolean z14;
        j0.u.a();
        Size sizeF = q2Var.f();
        Executor executor = (Executor) k1Var.f(m0.n.M, k0.b.b());
        executor.getClass();
        boolean z15 = false;
        int iG = ((Integer) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.O, 0)).intValue() == 1 ? G() : 4;
        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.k1.Q;
        androidx.camera.core.g gVar2 = null;
        if (((p0) k1Var.f(hVar, null)) != null) {
            p0 p0Var = (p0) k1Var.f(hVar, null);
            sizeF.getWidth();
            sizeF.getHeight();
            this.f13969h.z();
            gVar = new androidx.camera.core.g(p0Var.newInstance());
        } else {
            gVar = new androidx.camera.core.g(q0.a(sizeF.getWidth(), sizeF.getHeight(), this.f13969h.z(), iG));
        }
        synchronized (this.f13893r) {
            I();
            i0Var = this.f13894s;
        }
        if (c() != null) {
            androidx.camera.core.impl.l0 l0VarC = c();
            if (!((Boolean) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.T, Boolean.FALSE)).booleanValue() || h(l0VarC, false) % 180 == 0) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        int height = z14 ? sizeF.getHeight() : sizeF.getWidth();
        int width = z14 ? sizeF.getWidth() : sizeF.getHeight();
        int i14 = H() == 2 ? 1 : 35;
        boolean z16 = this.f13969h.z() == 35 && H() == 2;
        boolean z17 = this.f13969h.z() == 35 && H() == 3;
        if (this.f13969h.z() == 35 && ((c() != null && h(c(), false) != 0) || Boolean.TRUE.equals((Boolean) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.S, null)))) {
            z15 = true;
        }
        if (z16 || (z15 && !z17)) {
            gVar2 = new androidx.camera.core.g(q0.a(height, width, i14, gVar.g()));
        }
        if (gVar2 != null) {
            synchronized (i0Var.f13960v) {
                i0Var.f13948h = gVar2;
            }
        }
        K();
        gVar.d(i0Var, executor);
        l2.b bVarD = l2.b.d(k1Var, q2Var.f());
        if (q2Var.d() != null) {
            bVarD.a(q2Var.d());
        }
        p1 p1Var = this.f13900y;
        if (p1Var != null) {
            p1Var.a();
        }
        p1 p1Var2 = new p1(gVar.getSurface(), sizeF, this.f13969h.z());
        this.f13900y = p1Var2;
        l0.j.f(p1Var2.f5471e).addListener(new ab.j(18, gVar, gVar2), k0.b.d());
        bVarD.f5618h = q2Var.g();
        a(bVarD, q2Var);
        bVarD.b(this.f13900y, q2Var.b(), -1);
        l2.c cVar = this.f13901z;
        if (cVar != null) {
            cVar.b();
        }
        l2.c cVar2 = new l2.c(new l2.d() { // from class: b0.f0
            @Override // androidx.camera.core.impl.l2.d
            public final void a(l2 l2Var, l2.g gVar3) {
                g0.d dVar = g0.A;
                g0 g0Var = this.f13883a;
                if (g0Var.c() == null) {
                    return;
                }
                j0.u.a();
                l2.c cVar3 = g0Var.f13901z;
                if (cVar3 != null) {
                    cVar3.b();
                    g0Var.f13901z = null;
                }
                p1 p1Var3 = g0Var.f13900y;
                if (p1Var3 != null) {
                    p1Var3.a();
                    g0Var.f13900y = null;
                }
                i0Var.d();
                g0Var.e();
                androidx.camera.core.impl.k1 k1Var2 = (androidx.camera.core.impl.k1) g0Var.f13969h;
                q2 q2Var2 = g0Var.f13970i;
                q2Var2.getClass();
                l2.b bVarF = g0Var.F(k1Var2, q2Var2);
                g0Var.f13899x = bVarF;
                Object[] objArr = {bVarF.c()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                g0Var.E(Collections.unmodifiableList(arrayList));
                g0Var.q();
            }
        });
        this.f13901z = cVar2;
        bVarD.f5616f = cVar2;
        return bVarD;
    }

    public final int G() {
        return ((Integer) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.P, 6)).intValue();
    }

    public final int H() {
        return ((Integer) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.R, 1)).intValue();
    }

    public final void I() {
        a aVar;
        synchronized (this.f13893r) {
            try {
                androidx.camera.core.impl.k1 k1Var = (androidx.camera.core.impl.k1) this.f13969h;
                if (((Integer) k1Var.f(androidx.camera.core.impl.k1.O, 0)).intValue() == 1) {
                    this.f13894s = new j0();
                } else {
                    this.f13894s = new androidx.camera.core.c((Executor) k1Var.f(m0.n.M, k0.b.b()));
                }
                this.f13894s.f13944d = H();
                this.f13894s.f13945e = ((Boolean) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.T, Boolean.FALSE)).booleanValue();
                androidx.camera.core.impl.l0 l0VarC = c();
                Boolean bool = (Boolean) ((androidx.camera.core.impl.k1) this.f13969h).f(androidx.camera.core.impl.k1.S, null);
                boolean zA = l0VarC != null ? l0VarC.c().j().a(OnePixelShiftQuirk.class) : false;
                i0 i0Var = this.f13894s;
                if (bool != null) {
                    zA = bool.booleanValue();
                }
                i0Var.f13946f = zA;
                if (l0VarC != null) {
                    this.f13894s.f13942b = h(l0VarC, false);
                }
                Rect rect = this.f13897v;
                if (rect != null) {
                    this.f13894s.k(rect);
                }
                Matrix matrix = this.f13898w;
                if (matrix != null) {
                    this.f13894s.j(matrix);
                }
                Executor executor = this.f13895t;
                if (executor != null && (aVar = this.f13896u) != null) {
                    this.f13894s.i(executor, aVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void J(Executor executor, y0.b bVar) {
        synchronized (this.f13893r) {
            try {
                i0 i0Var = this.f13894s;
                if (i0Var != null) {
                    i0Var.i(executor, new a73.j(bVar, 27));
                }
                if (this.f13896u == null) {
                    this.f13965d = i1.b.ACTIVE;
                    r();
                }
                this.f13895t = executor;
                this.f13896u = bVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void K() {
        synchronized (this.f13893r) {
            try {
                androidx.camera.core.impl.l0 l0VarC = c();
                if (l0VarC != null) {
                    this.f13894s.f13942b = h(l0VarC, false);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.i1
    public final b3<?> f(boolean z14, c3 c3Var) {
        A.getClass();
        androidx.camera.core.impl.k1 k1Var = d.f13903a;
        androidx.camera.core.impl.x0 x0VarA = c3Var.a(k1Var.y(), 1);
        if (z14) {
            x0VarA = androidx.camera.core.impl.x0.P(x0VarA, k1Var);
        }
        if (x0VarA == null) {
            return null;
        }
        return new androidx.camera.core.impl.k1(a2.T(c.f(x0VarA).f13902a));
    }

    @Override // b0.i1
    public final b3.b<?, ?, ?> m(androidx.camera.core.impl.x0 x0Var) {
        return c.f(x0Var);
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    @Override // b0.i1
    public final b3<?> u(androidx.camera.core.impl.k0 k0Var, b3.b<?, ?, ?> bVar) {
        Size sizeC;
        synchronized (this.f13893r) {
            try {
                a aVar = this.f13896u;
                sizeC = aVar != null ? aVar.c() : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (sizeC == null) {
            return bVar.b();
        }
        if (k0Var.r(((Integer) ((a2) bVar.d()).f(n1.f5644l, 0)).intValue()) % 180 == 90) {
            sizeC = new Size(sizeC.getHeight(), sizeC.getWidth());
        }
        b3 b3VarB = bVar.b();
        androidx.camera.core.impl.h hVar = n1.f5647o;
        if (!b3VarB.b(hVar)) {
            ((w1) bVar.d()).X(hVar, sizeC);
        }
        b3 b3VarB2 = bVar.b();
        androidx.camera.core.impl.h hVar2 = n1.f5651s;
        if (b3VarB2.b(hVar2)) {
            u0.c cVar = (u0.c) this.f13967f.f(hVar2, null);
            u0.c.a aVar2 = cVar == null ? new u0.c.a() : u0.c.a.b(cVar);
            if (cVar == null || cVar.f167325b == null) {
                aVar2.f167329b = new u0.d(sizeC, 1);
            }
            if (cVar == null) {
                aVar2.f167330c = new a73.j(sizeC, 28);
            }
            ((w1) bVar.d()).X(hVar2, aVar2.a());
        }
        return bVar.b();
    }

    @Override // b0.i1
    public final q2 x(androidx.camera.core.impl.x0 x0Var) {
        this.f13899x.f5612b.c(x0Var);
        Object[] objArr = {this.f13899x.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        androidx.camera.core.impl.q.b bVarI = this.f13970i.i();
        bVarI.f5710f = x0Var;
        return bVarI.a();
    }

    @Override // b0.i1
    public final q2 y(q2 q2Var, q2 q2Var2) {
        Objects.toString(q2Var);
        Objects.toString(q2Var2);
        androidx.camera.core.impl.k1 k1Var = (androidx.camera.core.impl.k1) this.f13969h;
        e();
        l2.b bVarF = F(k1Var, q2Var);
        this.f13899x = bVarF;
        Object[] objArr = {bVarF.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return q2Var;
    }

    @Override // b0.i1
    public final void z() {
        j0.u.a();
        l2.c cVar = this.f13901z;
        if (cVar != null) {
            cVar.b();
            this.f13901z = null;
        }
        p1 p1Var = this.f13900y;
        if (p1Var != null) {
            p1Var.a();
            this.f13900y = null;
        }
        synchronized (this.f13893r) {
            i0 i0Var = this.f13894s;
            i0Var.f13961w = false;
            i0Var.d();
            this.f13894s = null;
        }
    }

    public static final class c implements n1.a<c>, b3.b<g0, androidx.camera.core.impl.k1, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f13902a;

        private c(w1 w1Var) {
            this.f13902a = w1Var;
            androidx.camera.core.impl.h hVar = m0.m.L;
            Class cls = (Class) w1Var.f(hVar, null);
            if (cls != null && !cls.equals(g0.class)) {
                c22.t.i("Invalid target class configuration for ", this, ": ", cls);
                throw null;
            }
            w1Var.X(b3.E, c3.b.IMAGE_ANALYSIS);
            w1Var.X(hVar, g0.class);
            androidx.camera.core.impl.h hVar2 = m0.m.K;
            if (w1Var.f(hVar2, null) == null) {
                w1Var.X(hVar2, g0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }

        public static c f(androidx.camera.core.impl.x0 x0Var) {
            return new c(w1.V(x0Var));
        }

        @Override // androidx.camera.core.impl.n1.a
        @Deprecated
        public final c a(Size size) {
            this.f13902a.X(n1.f5647o, size);
            return this;
        }

        @Override // androidx.camera.core.impl.b3.b
        public final b3 b() {
            return new androidx.camera.core.impl.k1(a2.T(this.f13902a));
        }

        @Override // androidx.camera.core.impl.n1.a
        public final c c(int i14) {
            this.f13902a.X(n1.f5644l, Integer.valueOf(i14));
            return this;
        }

        @Override // b0.c0
        public final v1 d() {
            return this.f13902a;
        }

        @Override // androidx.camera.core.impl.n1.a
        public final c e(u0.c cVar) {
            this.f13902a.X(n1.f5651s, cVar);
            return this;
        }

        public c() {
            this(w1.U());
        }
    }
}
