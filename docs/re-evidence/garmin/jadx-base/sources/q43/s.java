package q43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p005kotlin.jvm.internal.s0;
import p43.a2;
import p43.f0;
import p43.f2;
import p43.l1;
import p43.m1;
import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f142813a = new s();

    private s() {
    }

    @Override // t43.p
    public final /* bridge */ t43.i A(t43.i iVar, t43.b bVar) {
        return b.a.k(iVar, bVar);
    }

    @Override // t43.p
    public final t43.i A0(t43.h hVar) {
        v0 v0VarT;
        hVar.getClass();
        f0 f0VarH = b.a.h(hVar);
        if (f0VarH != null && (v0VarT = b.a.T(f0VarH)) != null) {
            return v0VarT;
        }
        v0 v0VarI = b.a.i(hVar);
        v0VarI.getClass();
        return v0VarI;
    }

    @Override // p43.b2
    public final t43.j B() {
        e();
        throw null;
    }

    @Override // t43.p
    public final boolean B0(t43.i iVar) {
        iVar.getClass();
        return b.a.f(iVar) != null;
    }

    @Override // t43.p
    public final boolean C(t43.h hVar) {
        hVar.getClass();
        return hVar instanceof p33.l;
    }

    @Override // t43.p
    public final /* bridge */ boolean C0(t43.m mVar) {
        return b.a.I(mVar);
    }

    @Override // t43.p
    public final boolean D(t43.h hVar) {
        hVar.getClass();
        v0 v0VarI = b.a.i(hVar);
        return (v0VarI != null ? b.a.f(v0VarI) : null) != null;
    }

    @Override // t43.p
    public final /* bridge */ t43.l D0(t43.c cVar) {
        return b.a.Y(cVar);
    }

    @Override // t43.p
    public final boolean E(t43.i iVar) {
        iVar.getClass();
        return b.a.D(b.a.c0(iVar));
    }

    @Override // t43.p
    public final /* bridge */ Collection<t43.h> E0(t43.m mVar) {
        return b.a.b0(mVar);
    }

    @Override // t43.p
    public final /* bridge */ int F(t43.m mVar) {
        return b.a.W(mVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.m F0(t43.i iVar) {
        return b.a.c0(iVar);
    }

    @Override // t43.p
    public final t43.m G(t43.h hVar) {
        hVar.getClass();
        t43.i iVarI = b.a.i(hVar);
        if (iVarI == null) {
            iVarI = A0(hVar);
        }
        return b.a.c0(iVarI);
    }

    public final boolean G0(t43.h hVar, x33.c cVar) {
        hVar.getClass();
        cVar.getClass();
        if (hVar instanceof n0) {
            return ((n0) hVar).getAnnotations().I3(cVar);
        }
        StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb3.append(hVar);
        sb3.append(", ");
        vb.h.x(p6.b.h(s0.f105811a, hVar.getClass(), sb3));
        return false;
    }

    @Override // t43.p
    public final /* bridge */ boolean H(t43.l lVar) {
        return b.a.Q(lVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.n I(t43.s sVar) {
        return b.a.u(sVar);
    }

    @Override // t43.p
    public final /* bridge */ Collection<t43.h> J(t43.i iVar) {
        return b.a.X(this, iVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean K(t43.d dVar) {
        return b.a.O(dVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.c L(t43.d dVar) {
        return b.a.d0(dVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean M(t43.h hVar) {
        return b.a.P(hVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.b N(t43.d dVar) {
        return b.a.l(dVar);
    }

    @Override // t43.p
    public final t43.h O(ArrayList arrayList) {
        return oe2.f.F(arrayList);
    }

    @Override // t43.p
    public final /* bridge */ boolean P(t43.m mVar, t43.m mVar2) {
        return b.a.a(mVar, mVar2);
    }

    @Override // t43.p
    public final /* bridge */ t43.t Q(t43.n nVar) {
        return b.a.y(nVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.n R(t43.m mVar) {
        return b.a.v(mVar);
    }

    @Override // t43.p
    public final boolean S(t43.d dVar) {
        return dVar instanceof c43.a;
    }

    @Override // t43.p
    public final /* bridge */ boolean T(t43.h hVar) {
        return b.a.M(hVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean U(t43.h hVar) {
        return b.a.G(hVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean V(t43.m mVar) {
        return b.a.J(mVar);
    }

    @Override // t43.p
    public final boolean W(t43.h hVar) {
        hVar.getClass();
        return b.a.K(A0(hVar)) != b.a.K(k(hVar));
    }

    @Override // t43.p
    public final boolean X(t43.i iVar) {
        iVar.getClass();
        return b.a.L(G(iVar)) && !b.a.M(iVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean Y(t43.m mVar) {
        return b.a.D(mVar);
    }

    @Override // t43.p
    public final t43.l Z(t43.k kVar, int i14) {
        kVar.getClass();
        if (kVar instanceof t43.j) {
            return b.a.n((t43.h) kVar, i14);
        }
        if (kVar instanceof t43.a) {
            t43.l lVar = ((t43.a) kVar).get(i14);
            lVar.getClass();
            return lVar;
        }
        StringBuilder sb3 = new StringBuilder("unknown type argument list type: ");
        sb3.append(kVar);
        o2.c.o(sb3, ", ", s0.f105811a.b(kVar.getClass()));
        return null;
    }

    @Override // q43.b, t43.p
    public final /* bridge */ v0 a(t43.f fVar) {
        return b.a.f0(fVar);
    }

    @Override // t43.p
    public final boolean a0(t43.i iVar) {
        t43.d dVarE;
        v0 v0Var;
        v0 v0VarI = b.a.i(iVar);
        if (v0VarI != null) {
            p43.w wVarF = b.a.f(v0VarI);
            if (wVarF != null && (v0Var = wVarF.f135931b) != null) {
                v0VarI = v0Var;
            }
            dVarE = b.a.e(this, v0VarI);
        } else {
            dVarE = null;
        }
        return dVarE != null;
    }

    @Override // q43.b, t43.p
    public final /* bridge */ v0 b(t43.f fVar) {
        return b.a.T(fVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean b0(t43.i iVar) {
        return b.a.S(iVar);
    }

    @Override // q43.b, t43.p
    public final /* bridge */ v0 c(t43.i iVar) {
        return b.a.g0(iVar, true);
    }

    @Override // t43.p
    public final /* bridge */ boolean c0(t43.m mVar) {
        return b.a.L(mVar);
    }

    @Override // p43.b2
    public final /* bridge */ boolean d(t43.h hVar) {
        return b.a.C(hVar);
    }

    @Override // t43.p
    public final boolean d0(t43.h hVar) {
        hVar.getClass();
        return !p005kotlin.jvm.internal.s.g(b.a.c0(A0(hVar)), b.a.c0(k(hVar)));
    }

    @Override // q43.b
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // t43.p
    public final /* bridge */ boolean e0(t43.m mVar) {
        return b.a.F(mVar);
    }

    @Override // t43.p
    public final t43.j f(t43.i iVar) {
        v0 v0Var;
        p43.w wVarF = b.a.f(iVar);
        return (wVarF == null || (v0Var = wVarF.f135931b) == null) ? (t43.j) iVar : v0Var;
    }

    @Override // t43.p
    public final /* bridge */ List<t43.n> f0(t43.m mVar) {
        return b.a.q(mVar);
    }

    @Override // t43.p
    public final /* bridge */ int g(t43.h hVar) {
        return b.a.b(hVar);
    }

    @Override // p43.b2
    public final /* bridge */ n0 g0(t43.n nVar) {
        return b.a.r(nVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.l h(t43.h hVar, int i14) {
        return b.a.n(hVar, i14);
    }

    @Override // p43.b2
    public final /* bridge */ v0 h0(t43.h hVar) {
        return b.a.w(hVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.n i(t43.m mVar, int i14) {
        return b.a.p(mVar, i14);
    }

    @Override // t43.p
    public final /* bridge */ t43.l i0(t43.h hVar) {
        return b.a.j(hVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.h j(t43.h hVar) {
        return b.a.h0(this, hVar);
    }

    @Override // t43.p
    public final t43.d j0(t43.i iVar) {
        return b.a.e(this, f(iVar));
    }

    @Override // t43.p
    public final t43.i k(t43.h hVar) {
        v0 v0VarF0;
        hVar.getClass();
        f0 f0VarH = b.a.h(hVar);
        if (f0VarH != null && (v0VarF0 = b.a.f0(f0VarH)) != null) {
            return v0VarF0;
        }
        v0 v0VarI = b.a.i(hVar);
        v0VarI.getClass();
        return v0VarI;
    }

    @Override // t43.p
    public final /* bridge */ boolean k0(t43.m mVar) {
        return b.a.B(mVar);
    }

    @Override // t43.p
    public final void l(t43.i iVar, t43.m mVar) {
    }

    @Override // t43.p
    public final /* bridge */ List<t43.l> l0(t43.h hVar) {
        return b.a.o(hVar);
    }

    @Override // t43.p
    public final t43.l m(t43.i iVar, int i14) {
        if (i14 < 0 || i14 >= b.a.b(iVar)) {
            return null;
        }
        return b.a.n(iVar, i14);
    }

    @Override // q43.b
    public final /* bridge */ v0 m0(n0 n0Var) {
        return b.a.i(n0Var);
    }

    @Override // t43.p
    public final /* bridge */ t43.t n(t43.l lVar) {
        return b.a.x(lVar);
    }

    @Override // t43.p
    public final /* bridge */ n0 n0(t43.o oVar, t43.h hVar) {
        return b.a.Z(oVar, hVar);
    }

    @Override // t43.p
    public final int o(t43.k kVar) {
        kVar.getClass();
        if (kVar instanceof t43.i) {
            return b.a.b((t43.h) kVar);
        }
        if (kVar instanceof t43.a) {
            return ((t43.a) kVar).size();
        }
        StringBuilder sb3 = new StringBuilder("unknown type argument list type: ");
        sb3.append(kVar);
        o2.c.o(sb3, ", ", s0.f105811a.b(kVar.getClass()));
        return 0;
    }

    @Override // t43.p
    public final /* bridge */ boolean o0(t43.i iVar) {
        return b.a.R(iVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.h p(t43.l lVar) {
        return b.a.s(this, lVar);
    }

    @Override // t43.p
    public final boolean p0(t43.h hVar) {
        hVar.getClass();
        f0 f0VarH = b.a.h(hVar);
        return (f0VarH != null ? b.a.g(f0VarH) : null) != null;
    }

    @Override // q43.b
    public final /* bridge */ f2 q(t43.j jVar, t43.j jVar2) {
        return b.a.m(this, jVar, jVar2);
    }

    @Override // t43.p
    public final /* bridge */ l1.c q0(t43.i iVar) {
        return b.a.a0(this, iVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean r(t43.h hVar) {
        return b.a.K(hVar);
    }

    @Override // p43.b2
    public final /* bridge */ a2 r0(Map map) {
        return b.a.e0(map);
    }

    @Override // t43.p
    public final t43.h s(t43.h hVar) {
        return b.a.V(hVar);
    }

    @Override // t43.p
    public final boolean s0(t43.i iVar) {
        return b.a.I(b.a.c0(iVar));
    }

    @Override // t43.p
    public final /* bridge */ boolean t(t43.j jVar) {
        return b.a.N(jVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.i t0(t43.h hVar) {
        return b.a.i(hVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean u(t43.m mVar) {
        return b.a.E(mVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean u0(t43.n nVar, t43.m mVar) {
        return b.a.z(nVar, mVar);
    }

    @Override // t43.p
    public final /* bridge */ m1 v(t43.n nVar) {
        return b.a.t(nVar);
    }

    @Override // p43.b2
    public final t43.h v0(t43.h hVar) {
        v0 v0VarG0;
        hVar.getClass();
        v0 v0VarI = b.a.i(hVar);
        return (v0VarI == null || (v0VarG0 = b.a.g0(v0VarI, true)) == null) ? hVar : v0VarG0;
    }

    @Override // t43.p
    public final /* bridge */ t43.h w(t43.d dVar) {
        return b.a.U(dVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.k w0(t43.i iVar) {
        return b.a.d(iVar);
    }

    @Override // t43.p
    public final boolean x(t43.h hVar) {
        return b.a.h(hVar) != null;
    }

    @Override // p43.b2
    public final /* bridge */ v0 x0(t43.h hVar) {
        b.a.c(this, hVar);
        throw null;
    }

    @Override // t43.p
    public final /* bridge */ t43.d y(t43.j jVar) {
        return b.a.e(this, jVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.f y0(t43.h hVar) {
        return b.a.h(hVar);
    }

    @Override // p43.b2
    public final /* bridge */ boolean z(t43.m mVar) {
        return b.a.H(mVar);
    }

    @Override // t43.r
    public final /* bridge */ boolean z0(t43.i iVar, t43.i iVar2) {
        return b.a.A(iVar, iVar2);
    }

    @Override // t43.p
    public final /* bridge */ t43.i a(t43.f fVar) {
        return b.a.f0(fVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.i b(t43.f fVar) {
        return b.a.T(fVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.i c(t43.i iVar) {
        return b.a.g0(iVar, false);
    }
}
