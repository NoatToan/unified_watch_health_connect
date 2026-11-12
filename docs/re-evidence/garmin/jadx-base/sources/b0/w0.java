package b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a2;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.d2;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.n1;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.v1;
import androidx.camera.core.impl.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends i1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f14077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Executor f14078s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l2.b f14079t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DeferrableSurface f14080u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0.o f14081v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g1 f14082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public r0.r f14083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l2.c f14084y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f14076z = new b();
    public static final k0.d A = k0.b.d();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d2 f14086a;

        static {
            u0.c.a aVar = new u0.c.a();
            aVar.f167328a = u0.a.f167321c;
            aVar.f167329b = u0.d.f167332c;
            u0.c cVarA = aVar.a();
            b0 b0Var = b0.f13853c;
            a aVar2 = new a();
            androidx.camera.core.impl.h hVar = b3.f5512y;
            w1 w1Var = aVar2.f14085a;
            w1Var.X(hVar, 2);
            w1Var.X(n1.f5643k, 0);
            w1Var.X(n1.f5651s, cVarA);
            w1Var.X(b3.D, Boolean.TRUE);
            w1Var.X(m1.f5634j, b0Var);
            f14086a = new d2(a2.T(w1Var));
        }
    }

    public interface c {
        void a(g1 g1Var);
    }

    public w0(d2 d2Var) {
        super(d2Var);
        this.f14078s = A;
    }

    @Override // b0.i1
    public final void C(Rect rect) {
        this.f13972k = rect;
        androidx.camera.core.impl.l0 l0VarC = c();
        r0.o oVar = this.f14081v;
        if (l0VarC == null || oVar == null) {
            return;
        }
        j0.u.c(new com.mapbox.maps.d(oVar, h(l0VarC, o(l0VarC)), ((n1) this.f13969h).q(), 4));
    }

    public final void F() {
        l2.c cVar = this.f14084y;
        if (cVar != null) {
            cVar.b();
            this.f14084y = null;
        }
        DeferrableSurface deferrableSurface = this.f14080u;
        if (deferrableSurface != null) {
            deferrableSurface.a();
            this.f14080u = null;
        }
        r0.r rVar = this.f14083x;
        if (rVar != null) {
            rVar.b();
            this.f14083x = null;
        }
        r0.o oVar = this.f14081v;
        if (oVar != null) {
            oVar.c();
            this.f14081v = null;
        }
        g1 g1Var = this.f14082w;
        if (g1Var != null) {
            synchronized (g1Var.f13905a) {
                g1Var.f13919o = null;
                g1Var.f13920p = null;
            }
        }
        this.f14082w = null;
    }

    public final void G(c cVar) {
        j0.u.a();
        if (cVar == null) {
            this.f14077r = null;
            this.f13965d = i1.b.INACTIVE;
            r();
            return;
        }
        this.f14077r = cVar;
        this.f14078s = A;
        q2 q2Var = this.f13970i;
        if ((q2Var != null ? q2Var.f() : null) != null) {
            H((d2) this.f13969h, this.f13970i);
            q();
        }
        this.f13965d = i1.b.ACTIVE;
        r();
    }

    public final void H(d2 d2Var, q2 q2Var) {
        Rect rect;
        j0.u.a();
        androidx.camera.core.impl.l0 l0VarC = c();
        Objects.requireNonNull(l0VarC);
        F();
        k7.h.f(this.f14081v == null, null);
        Matrix matrix = this.f13973l;
        boolean zJ = l0VarC.j();
        Size sizeF = q2Var.f();
        Rect rect2 = this.f13972k;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = sizeF != null ? new Rect(0, 0, sizeF.getWidth(), sizeF.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        r0.o oVar = new r0.o(1, 34, q2Var, matrix, zJ, rect, h(l0VarC, o(l0VarC)), ((n1) this.f13969h).q(), l0VarC.j() && o(l0VarC));
        this.f14081v = oVar;
        l lVar = this.f13976o;
        if (lVar != null) {
            this.f14083x = new r0.r(l0VarC, new r0.s(lVar));
            this.f14081v.a(new a0.c(this, 20));
            r0.o oVar2 = this.f14081v;
            int i14 = oVar2.f148748f;
            int i15 = oVar2.f148743a;
            Rect rect3 = oVar2.f148746d;
            t0.b bVar = new t0.b(UUID.randomUUID(), i14, i15, rect3, j0.v.i(j0.v.g(rect3), oVar2.f148751i), oVar2.f148751i, oVar2.f148747e, false);
            r0.o oVar3 = this.f14083x.c(new r0.c(this.f14081v, Collections.singletonList(bVar))).get(bVar);
            Objects.requireNonNull(oVar3);
            oVar3.a(new ab.j(20, this, l0VarC));
            this.f14082w = oVar3.d(l0VarC, true);
            r0.o oVar4 = this.f14081v;
            oVar4.getClass();
            j0.u.a();
            oVar4.b();
            k7.h.f(!oVar4.f148752j, "Consumer can only be linked once.");
            oVar4.f148752j = true;
            this.f14080u = oVar4.f148754l;
        } else {
            oVar.a(new a0.c(this, 20));
            g1 g1VarD = this.f14081v.d(l0VarC, true);
            this.f14082w = g1VarD;
            this.f14080u = g1VarD.f13917m;
        }
        if (this.f14077r != null) {
            androidx.camera.core.impl.l0 l0VarC2 = c();
            r0.o oVar5 = this.f14081v;
            if (l0VarC2 != null && oVar5 != null) {
                j0.u.c(new com.mapbox.maps.d(oVar5, h(l0VarC2, o(l0VarC2)), ((n1) this.f13969h).q(), 4));
            }
            c cVar = this.f14077r;
            cVar.getClass();
            g1 g1Var = this.f14082w;
            g1Var.getClass();
            this.f14078s.execute(new ab.j(21, cVar, g1Var));
        }
        l2.b bVarD = l2.b.d(d2Var, q2Var.f());
        bVarD.f5618h = q2Var.g();
        a(bVarD, q2Var);
        int iC = d2Var.C();
        if (iC != 0) {
            androidx.camera.core.impl.v0.a aVar = bVarD.f5612b;
            aVar.getClass();
            if (iC != 0) {
                aVar.f5822b.X(b3.F, Integer.valueOf(iC));
            }
        }
        if (q2Var.d() != null) {
            bVarD.a(q2Var.d());
        }
        if (this.f14077r != null) {
            bVarD.b(this.f14080u, q2Var.b(), ((n1) this.f13969h).F());
        }
        l2.c cVar2 = this.f14084y;
        if (cVar2 != null) {
            cVar2.b();
        }
        l2.c cVar3 = new l2.c(new m2(this, 2));
        this.f14084y = cVar3;
        bVarD.f5616f = cVar3;
        this.f14079t = bVarD;
        Object[] objArr = {bVarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    @Override // b0.i1
    public final b3<?> f(boolean z14, c3 c3Var) {
        f14076z.getClass();
        d2 d2Var = b.f14086a;
        androidx.camera.core.impl.x0 x0VarA = c3Var.a(d2Var.y(), 1);
        if (z14) {
            x0VarA = androidx.camera.core.impl.x0.P(x0VarA, d2Var);
        }
        if (x0VarA == null) {
            return null;
        }
        return new d2(a2.T(a.f(x0VarA).f14085a));
    }

    @Override // b0.i1
    public final Set<Integer> k() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // b0.i1
    public final b3.b<?, ?, ?> m(androidx.camera.core.impl.x0 x0Var) {
        return a.f(x0Var);
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    @Override // b0.i1
    public final b3<?> u(androidx.camera.core.impl.k0 k0Var, b3.b<?, ?, ?> bVar) {
        ((w1) bVar.d()).X(m1.f5632h, 34);
        return bVar.b();
    }

    @Override // b0.i1
    public final q2 x(androidx.camera.core.impl.x0 x0Var) {
        this.f14079t.f5612b.c(x0Var);
        Object[] objArr = {this.f14079t.c()};
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
        H((d2) this.f13969h, q2Var);
        return q2Var;
    }

    @Override // b0.i1
    public final void z() {
        F();
    }

    public static final class a implements b3.b<w0, d2, a>, n1.a<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w1 f14085a;

        private a(w1 w1Var) {
            this.f14085a = w1Var;
            androidx.camera.core.impl.h hVar = m0.m.L;
            Class cls = (Class) w1Var.f(hVar, null);
            if (cls != null && !cls.equals(w0.class)) {
                c22.t.i("Invalid target class configuration for ", this, ": ", cls);
                throw null;
            }
            w1Var.X(b3.E, c3.b.PREVIEW);
            w1Var.X(hVar, w0.class);
            androidx.camera.core.impl.h hVar2 = m0.m.K;
            if (w1Var.f(hVar2, null) == null) {
                w1Var.X(hVar2, w0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            androidx.camera.core.impl.h hVar3 = n1.f5646n;
            if (((Integer) w1Var.f(hVar3, -1)).intValue() == -1) {
                w1Var.X(hVar3, 2);
            }
        }

        public static a f(androidx.camera.core.impl.x0 x0Var) {
            return new a(w1.V(x0Var));
        }

        @Override // androidx.camera.core.impl.n1.a
        @Deprecated
        public final a a(Size size) {
            this.f14085a.X(n1.f5647o, size);
            return this;
        }

        @Override // androidx.camera.core.impl.b3.b
        public final b3 b() {
            return new d2(a2.T(this.f14085a));
        }

        @Override // androidx.camera.core.impl.n1.a
        public final a c(int i14) {
            androidx.camera.core.impl.h hVar = n1.f5644l;
            Integer numValueOf = Integer.valueOf(i14);
            w1 w1Var = this.f14085a;
            w1Var.X(hVar, numValueOf);
            w1Var.X(n1.f5645m, Integer.valueOf(i14));
            return this;
        }

        @Override // b0.c0
        public final v1 d() {
            return this.f14085a;
        }

        @Override // androidx.camera.core.impl.n1.a
        public final a e(u0.c cVar) {
            this.f14085a.X(n1.f5651s, cVar);
            return this;
        }

        public a() {
            this(w1.U());
        }
    }
}
