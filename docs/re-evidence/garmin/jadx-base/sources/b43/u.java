package b43;

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
public final class u implements q43.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<m1, m1> f15736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q43.d.a f15737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q43.f f15738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q43.e f15739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.p<n0, n0, Boolean> f15740e;

    /* JADX WARN: Multi-variable type inference failed */
    public u(Map<m1, ? extends m1> map, q43.d.a aVar, q43.f fVar, q43.e eVar, e23.p<? super n0, ? super n0, Boolean> pVar) {
        aVar.getClass();
        fVar.getClass();
        eVar.getClass();
        this.f15736a = map;
        this.f15737b = aVar;
        this.f15738c = fVar;
        this.f15739d = eVar;
        this.f15740e = pVar;
    }

    @Override // t43.p
    public final /* bridge */ t43.i A(t43.i iVar, t43.b bVar) {
        return q43.b.a.k(iVar, bVar);
    }

    @Override // t43.p
    public final t43.i A0(t43.h hVar) {
        v0 v0VarT;
        hVar.getClass();
        f0 f0VarH = q43.b.a.h(hVar);
        if (f0VarH != null && (v0VarT = q43.b.a.T(f0VarH)) != null) {
            return v0VarT;
        }
        v0 v0VarI = q43.b.a.i(hVar);
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
        return q43.b.a.f(iVar) != null;
    }

    @Override // t43.p
    public final boolean C(t43.h hVar) {
        hVar.getClass();
        return hVar instanceof p33.l;
    }

    @Override // t43.p
    public final /* bridge */ boolean C0(t43.m mVar) {
        return q43.b.a.I(mVar);
    }

    @Override // t43.p
    public final boolean D(t43.h hVar) {
        hVar.getClass();
        v0 v0VarI = q43.b.a.i(hVar);
        return (v0VarI != null ? q43.b.a.f(v0VarI) : null) != null;
    }

    @Override // t43.p
    public final /* bridge */ t43.l D0(t43.c cVar) {
        return q43.b.a.Y(cVar);
    }

    @Override // t43.p
    public final boolean E(t43.i iVar) {
        iVar.getClass();
        return q43.b.a.D(q43.b.a.c0(iVar));
    }

    @Override // t43.p
    public final /* bridge */ Collection<t43.h> E0(t43.m mVar) {
        return q43.b.a.b0(mVar);
    }

    @Override // t43.p
    public final /* bridge */ int F(t43.m mVar) {
        return q43.b.a.W(mVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.m F0(t43.i iVar) {
        return q43.b.a.c0(iVar);
    }

    @Override // t43.p
    public final t43.m G(t43.h hVar) {
        hVar.getClass();
        t43.i iVarI = q43.b.a.i(hVar);
        if (iVarI == null) {
            iVarI = A0(hVar);
        }
        return q43.b.a.c0(iVarI);
    }

    public final l1 G0() {
        e23.p<n0, n0, Boolean> pVar = this.f15740e;
        q43.e eVar = this.f15739d;
        q43.f fVar = this.f15738c;
        return pVar == null ? new l1(true, true, false, true, this, eVar, fVar) : new t(true, true, false, this, eVar, fVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean H(t43.l lVar) {
        return q43.b.a.Q(lVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.n I(t43.s sVar) {
        return q43.b.a.u(sVar);
    }

    @Override // t43.p
    public final /* bridge */ Collection<t43.h> J(t43.i iVar) {
        return q43.b.a.X(this, iVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean K(t43.d dVar) {
        return q43.b.a.O(dVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.c L(t43.d dVar) {
        return q43.b.a.d0(dVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean M(t43.h hVar) {
        return q43.b.a.P(hVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.b N(t43.d dVar) {
        return q43.b.a.l(dVar);
    }

    @Override // t43.p
    public final t43.h O(ArrayList arrayList) {
        return oe2.f.F(arrayList);
    }

    @Override // t43.p
    public final boolean P(t43.m mVar, t43.m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        if (!(mVar instanceof m1)) {
            vb.h.s("Failed requirement.");
            return false;
        }
        if (!(mVar2 instanceof m1)) {
            vb.h.s("Failed requirement.");
            return false;
        }
        if (q43.b.a.a(mVar, mVar2)) {
            return true;
        }
        m1 m1Var = (m1) mVar;
        m1 m1Var2 = (m1) mVar2;
        if (this.f15737b.a(m1Var, m1Var2)) {
            return true;
        }
        Map<m1, m1> map = this.f15736a;
        if (map == null) {
            return false;
        }
        m1 m1Var3 = map.get(m1Var);
        m1 m1Var4 = map.get(m1Var2);
        if (m1Var3 == null || !m1Var3.equals(m1Var2)) {
            return m1Var4 != null && m1Var4.equals(m1Var);
        }
        return true;
    }

    @Override // t43.p
    public final /* bridge */ t43.t Q(t43.n nVar) {
        return q43.b.a.y(nVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.n R(t43.m mVar) {
        return q43.b.a.v(mVar);
    }

    @Override // t43.p
    public final boolean S(t43.d dVar) {
        return dVar instanceof c43.a;
    }

    @Override // t43.p
    public final /* bridge */ boolean T(t43.h hVar) {
        return q43.b.a.M(hVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean U(t43.h hVar) {
        return q43.b.a.G(hVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean V(t43.m mVar) {
        return q43.b.a.J(mVar);
    }

    @Override // t43.p
    public final boolean W(t43.h hVar) {
        hVar.getClass();
        return q43.b.a.K(A0(hVar)) != q43.b.a.K(k(hVar));
    }

    @Override // t43.p
    public final boolean X(t43.i iVar) {
        iVar.getClass();
        return q43.b.a.L(G(iVar)) && !q43.b.a.M(iVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean Y(t43.m mVar) {
        return q43.b.a.D(mVar);
    }

    @Override // t43.p
    public final t43.l Z(t43.k kVar, int i14) {
        kVar.getClass();
        if (kVar instanceof t43.j) {
            return q43.b.a.n((t43.h) kVar, i14);
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
        return q43.b.a.f0(fVar);
    }

    @Override // t43.p
    public final boolean a0(t43.i iVar) {
        t43.d dVarE;
        v0 v0Var;
        v0 v0VarI = q43.b.a.i(iVar);
        if (v0VarI != null) {
            p43.w wVarF = q43.b.a.f(v0VarI);
            if (wVarF != null && (v0Var = wVarF.f135931b) != null) {
                v0VarI = v0Var;
            }
            dVarE = q43.b.a.e(this, v0VarI);
        } else {
            dVarE = null;
        }
        return dVarE != null;
    }

    @Override // q43.b, t43.p
    public final /* bridge */ v0 b(t43.f fVar) {
        return q43.b.a.T(fVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean b0(t43.i iVar) {
        return q43.b.a.S(iVar);
    }

    @Override // q43.b, t43.p
    public final /* bridge */ v0 c(t43.i iVar) {
        return q43.b.a.g0(iVar, true);
    }

    @Override // t43.p
    public final /* bridge */ boolean c0(t43.m mVar) {
        return q43.b.a.L(mVar);
    }

    @Override // p43.b2
    public final /* bridge */ boolean d(t43.h hVar) {
        return q43.b.a.C(hVar);
    }

    @Override // t43.p
    public final boolean d0(t43.h hVar) {
        hVar.getClass();
        return !p005kotlin.jvm.internal.s.g(q43.b.a.c0(A0(hVar)), q43.b.a.c0(k(hVar)));
    }

    @Override // q43.b
    public final p005kotlin.reflect.jvm.internal.impl.builtins.d e() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // t43.p
    public final /* bridge */ boolean e0(t43.m mVar) {
        return q43.b.a.F(mVar);
    }

    @Override // t43.p
    public final t43.j f(t43.i iVar) {
        v0 v0Var;
        p43.w wVarF = q43.b.a.f(iVar);
        return (wVarF == null || (v0Var = wVarF.f135931b) == null) ? (t43.j) iVar : v0Var;
    }

    @Override // t43.p
    public final /* bridge */ List<t43.n> f0(t43.m mVar) {
        return q43.b.a.q(mVar);
    }

    @Override // t43.p
    public final /* bridge */ int g(t43.h hVar) {
        return q43.b.a.b(hVar);
    }

    @Override // p43.b2
    public final /* bridge */ n0 g0(t43.n nVar) {
        return q43.b.a.r(nVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.l h(t43.h hVar, int i14) {
        return q43.b.a.n(hVar, i14);
    }

    @Override // p43.b2
    public final /* bridge */ v0 h0(t43.h hVar) {
        return q43.b.a.w(hVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.n i(t43.m mVar, int i14) {
        return q43.b.a.p(mVar, i14);
    }

    @Override // t43.p
    public final /* bridge */ t43.l i0(t43.h hVar) {
        return q43.b.a.j(hVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.h j(t43.h hVar) {
        return q43.b.a.h0(this, hVar);
    }

    @Override // t43.p
    public final t43.d j0(t43.i iVar) {
        return q43.b.a.e(this, f(iVar));
    }

    @Override // t43.p
    public final t43.i k(t43.h hVar) {
        v0 v0VarF0;
        hVar.getClass();
        f0 f0VarH = q43.b.a.h(hVar);
        if (f0VarH != null && (v0VarF0 = q43.b.a.f0(f0VarH)) != null) {
            return v0VarF0;
        }
        v0 v0VarI = q43.b.a.i(hVar);
        v0VarI.getClass();
        return v0VarI;
    }

    @Override // t43.p
    public final /* bridge */ boolean k0(t43.m mVar) {
        return q43.b.a.B(mVar);
    }

    @Override // t43.p
    public final void l(t43.i iVar, t43.m mVar) {
    }

    @Override // t43.p
    public final /* bridge */ List<t43.l> l0(t43.h hVar) {
        return q43.b.a.o(hVar);
    }

    @Override // t43.p
    public final t43.l m(t43.i iVar, int i14) {
        if (i14 < 0 || i14 >= q43.b.a.b(iVar)) {
            return null;
        }
        return q43.b.a.n(iVar, i14);
    }

    @Override // q43.b
    public final /* bridge */ v0 m0(n0 n0Var) {
        return q43.b.a.i(n0Var);
    }

    @Override // t43.p
    public final /* bridge */ t43.t n(t43.l lVar) {
        return q43.b.a.x(lVar);
    }

    @Override // t43.p
    public final /* bridge */ n0 n0(t43.o oVar, t43.h hVar) {
        return q43.b.a.Z(oVar, hVar);
    }

    @Override // t43.p
    public final int o(t43.k kVar) {
        kVar.getClass();
        if (kVar instanceof t43.i) {
            return q43.b.a.b((t43.h) kVar);
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
        return q43.b.a.R(iVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.h p(t43.l lVar) {
        return q43.b.a.s(this, lVar);
    }

    @Override // t43.p
    public final boolean p0(t43.h hVar) {
        hVar.getClass();
        f0 f0VarH = q43.b.a.h(hVar);
        return (f0VarH != null ? q43.b.a.g(f0VarH) : null) != null;
    }

    @Override // q43.b
    public final /* bridge */ f2 q(t43.j jVar, t43.j jVar2) {
        return q43.b.a.m(this, jVar, jVar2);
    }

    @Override // t43.p
    public final /* bridge */ l1.c q0(t43.i iVar) {
        return q43.b.a.a0(this, iVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean r(t43.h hVar) {
        return q43.b.a.K(hVar);
    }

    @Override // p43.b2
    public final /* bridge */ a2 r0(Map map) {
        return q43.b.a.e0(map);
    }

    @Override // t43.p
    public final t43.h s(t43.h hVar) {
        return q43.b.a.V(hVar);
    }

    @Override // t43.p
    public final boolean s0(t43.i iVar) {
        return q43.b.a.I(q43.b.a.c0(iVar));
    }

    @Override // t43.p
    public final /* bridge */ boolean t(t43.j jVar) {
        return q43.b.a.N(jVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.i t0(t43.h hVar) {
        return q43.b.a.i(hVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean u(t43.m mVar) {
        return q43.b.a.E(mVar);
    }

    @Override // t43.p
    public final /* bridge */ boolean u0(t43.n nVar, t43.m mVar) {
        return q43.b.a.z(nVar, mVar);
    }

    @Override // t43.p
    public final /* bridge */ m1 v(t43.n nVar) {
        return q43.b.a.t(nVar);
    }

    @Override // p43.b2
    public final t43.h v0(t43.h hVar) {
        v0 v0VarG0;
        hVar.getClass();
        v0 v0VarI = q43.b.a.i(hVar);
        return (v0VarI == null || (v0VarG0 = q43.b.a.g0(v0VarI, true)) == null) ? hVar : v0VarG0;
    }

    @Override // t43.p
    public final /* bridge */ t43.h w(t43.d dVar) {
        return q43.b.a.U(dVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.k w0(t43.i iVar) {
        return q43.b.a.d(iVar);
    }

    @Override // t43.p
    public final boolean x(t43.h hVar) {
        return q43.b.a.h(hVar) != null;
    }

    @Override // p43.b2
    public final /* bridge */ v0 x0(t43.h hVar) {
        q43.b.a.c(this, hVar);
        throw null;
    }

    @Override // t43.p
    public final /* bridge */ t43.d y(t43.j jVar) {
        return q43.b.a.e(this, jVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.f y0(t43.h hVar) {
        return q43.b.a.h(hVar);
    }

    @Override // p43.b2
    public final /* bridge */ boolean z(t43.m mVar) {
        return q43.b.a.H(mVar);
    }

    @Override // t43.r
    public final /* bridge */ boolean z0(t43.i iVar, t43.i iVar2) {
        return q43.b.a.A(iVar, iVar2);
    }

    @Override // t43.p
    public final /* bridge */ t43.i a(t43.f fVar) {
        return q43.b.a.f0(fVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.i b(t43.f fVar) {
        return q43.b.a.T(fVar);
    }

    @Override // t43.p
    public final /* bridge */ t43.i c(t43.i iVar) {
        return q43.b.a.g0(iVar, false);
    }
}
