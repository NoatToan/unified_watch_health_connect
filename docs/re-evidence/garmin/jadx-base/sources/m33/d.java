package m33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k23.l;
import k33.n;
import o33.t;
import o33.u;
import o33.x;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.m0;
import p13.n0;
import p13.o0;
import p13.w;
import p13.y;
import p43.c2;
import p43.d2;
import p43.f2;
import p43.g2;
import p43.k1;
import p43.m1;
import p43.q0;
import p43.s0;
import p43.s1;
import p43.t1;
import p43.u1;
import p43.v;
import p43.v0;
import p43.v1;
import r43.k;
import t23.d1;
import w52.u0;
import z23.e0;
import z23.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k33.i f116437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f116438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f116439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s1 f116440d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(k33.i iVar, n nVar) {
        iVar.getClass();
        nVar.getClass();
        this.f116437a = iVar;
        this.f116438b = nVar;
        f fVar = new f();
        this.f116439c = fVar;
        this.f116440d = new s1(fVar, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, o13.l] */
    public final v0 a(o33.i iVar, a aVar, v0 v0Var) {
        k1 k1VarA;
        m1 m1VarH;
        m1 m1Var;
        q43.f fVar;
        Iterator it;
        List<d1> list;
        d dVar;
        u1 v1Var;
        Object next;
        List listB1;
        List listB2;
        d dVar2;
        m1 m1Var2;
        t1 t1VarA;
        t23.e eVarC;
        g2 g2VarM;
        d dVar3 = this;
        a aVar2 = aVar;
        c2 c2Var = aVar2.f116422d;
        b bVar = aVar2.f116423e;
        boolean z14 = aVar2.f116425g;
        k33.i iVar2 = dVar3.f116437a;
        k33.c cVar = iVar2.f102785a;
        if (v0Var == null || (k1VarA = v0Var.E0()) == null) {
            k1VarA = v.f135927a.a(new k33.f(iVar2, iVar, false, 4, null));
        }
        k1 k1Var = k1VarA;
        o33.h hVarG = iVar.g();
        l33.d1 d1Var = null;
        if (hVarG == null) {
            b(iVar);
            throw null;
        }
        if (hVarG instanceof o33.f) {
            o33.f fVar2 = (o33.f) hVarG;
            x33.c cVarC = fVar2.c();
            if (cVarC == null) {
                o2.c.l(hVarG, "Class type should have a FQ name: ");
                return null;
            }
            if (z14 && cVarC.equals(e.f116441a)) {
                p005kotlin.reflect.jvm.internal.impl.builtins.e eVar = cVar.f102766p;
                kotlin.reflect.jvm.internal.impl.builtins.e.a aVar3 = eVar.f105847c;
                l<Object> lVar = p005kotlin.reflect.jvm.internal.impl.builtins.e.f105844e[0];
                aVar3.getClass();
                lVar.getClass();
                String strH = u0.h(lVar.getF122483i());
                int i14 = aVar3.f105848a;
                x33.f fVarE = x33.f.e(strH);
                t23.h hVarF = ((i43.l) eVar.f105846b.getValue()).f(fVarE, b33.b.FROM_REFLECTION);
                eVarC = hVarF instanceof t23.e ? (t23.e) hVarF : null;
                if (eVarC == null) {
                    eVarC = eVar.f105845a.a(new x33.b(p005kotlin.reflect.jvm.internal.impl.builtins.f.f105857i, fVarE), w.c(Integer.valueOf(i14)));
                }
            } else {
                eVarC = s23.d.c(s23.d.f156251a, cVarC, cVar.f102765o.e());
                if (eVarC == null) {
                    eVarC = null;
                } else {
                    s23.c cVar2 = s23.c.f156232a;
                    x33.d dVarF = b43.i.f(eVarC);
                    cVar2.getClass();
                    if (s23.c.f156243l.containsKey(dVarF)) {
                        if (bVar == b.FLEXIBLE_LOWER_BOUND || c2Var == c2.SUPERTYPE) {
                            eVarC = s23.d.a(eVarC);
                        } else {
                            t tVar = (t) h0.n0(iVar.r());
                            x xVar = tVar instanceof x ? (x) tVar : null;
                            if (xVar != null && xVar.l() != null && !xVar.o()) {
                                List<d1> parameters = s23.d.a(eVarC).h().getParameters();
                                parameters.getClass();
                                d1 d1Var2 = (d1) h0.n0(parameters);
                                if (d1Var2 != null && (g2VarM = d1Var2.m()) != null && g2VarM != g2.OUT_VARIANCE) {
                                    eVarC = s23.d.a(eVarC);
                                }
                            }
                        }
                    }
                }
            }
            if (eVarC == null) {
                eVarC = cVar.f102761k.a(fVar2);
            }
            if (eVarC == null || (m1VarH = eVarC.h()) == null) {
                b(iVar);
                throw null;
            }
        } else {
            if (!(hVarG instanceof u)) {
                com.google.firebase.messaging.l.n(hVarG, "Unknown classifier kind: ");
                return null;
            }
            d1 d1VarA = dVar3.f116438b.a((u) hVarG);
            m1VarH = d1VarA != null ? d1VarA.h() : null;
        }
        if (m1VarH == null) {
            return null;
        }
        boolean z15 = true;
        boolean z16 = (bVar == b.FLEXIBLE_LOWER_BOUND || z14 || c2Var == c2.SUPERTYPE) ? false : true;
        if (s.g(v0Var != null ? v0Var.F0() : null, m1VarH) && !iVar.y() && z16) {
            return v0Var.J0(true);
        }
        if (!iVar.y()) {
            if (iVar.r().isEmpty()) {
                List<d1> parameters2 = m1VarH.getParameters();
                parameters2.getClass();
                if (parameters2.isEmpty()) {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
        }
        List<d1> parameters3 = m1VarH.getParameters();
        parameters3.getClass();
        if (!z15) {
            m1Var = m1VarH;
            d dVar4 = dVar3;
            if (parameters3.size() != iVar.r().size()) {
                ArrayList arrayList = new ArrayList(y.r(parameters3, 10));
                for (d1 d1Var3 : parameters3) {
                    k kVar = k.f150380t;
                    String strB = d1Var3.getName().b();
                    strB.getClass();
                    arrayList.add(new v1(r43.l.c(kVar, strB)));
                }
                listB2 = h0.b1(arrayList);
            } else {
                n0 n0VarJ1 = h0.j1(iVar.r());
                ArrayList arrayList2 = new ArrayList(y.r(n0VarJ1, 10));
                Iterator it3 = n0VarJ1.iterator();
                while (true) {
                    o0 o0Var = (o0) it3;
                    if (o0Var.f134956a.hasNext()) {
                        m0 m0Var = (m0) o0Var.next();
                        int i15 = m0Var.f134951a;
                        t tVar2 = (t) m0Var.f134952b;
                        parameters3.size();
                        d1 d1Var4 = parameters3.get(i15);
                        a aVarP = gg.b.P(c2.COMMON, false, d1Var, 7);
                        d1Var4.getClass();
                        if (tVar2 instanceof x) {
                            x xVar2 = (x) tVar2;
                            g0 g0VarL = xVar2.l();
                            g2 g2Var = xVar2.o() ? g2.OUT_VARIANCE : g2.IN_VARIANCE;
                            if (g0VarL == null || !(d1Var4.m() == g2.INVARIANT || g2Var == d1Var4.m())) {
                                it = it3;
                                list = parameters3;
                                dVar = dVar4;
                                v1Var = d2.m(d1Var4, aVarP);
                            } else {
                                if (xVar2.l() == null) {
                                    vb.h.s("Nullability annotations on unbounded wildcards aren't supported");
                                    return null;
                                }
                                m1 m1Var3 = m1Var;
                                g2 g2Var2 = g2Var;
                                dVar = this;
                                Iterator<u23.c> it4 = new k33.f(iVar2, xVar2, false, 4, null).iterator();
                                while (true) {
                                    c53.g.a aVar4 = (c53.g.a) it4;
                                    if (!aVar4.hasNext()) {
                                        it = it3;
                                        list = parameters3;
                                        next = null;
                                        break;
                                    }
                                    next = aVar4.next();
                                    u23.c cVar3 = (u23.c) next;
                                    x33.c[] cVarArr = h33.u.f81501b;
                                    int length = cVarArr.length;
                                    int i16 = 0;
                                    while (i16 < length) {
                                        it = it3;
                                        list = parameters3;
                                        if (s.g(cVar3.c(), cVarArr[i16])) {
                                            break;
                                        }
                                        i16++;
                                        it3 = it;
                                        parameters3 = list;
                                    }
                                }
                                u23.c cVar4 = (u23.c) next;
                                p43.n0 n0VarD = dVar.d(g0VarL, gg.b.P(c2.COMMON, false, null, 7));
                                if (cVar4 != null) {
                                    u23.h.a aVar5 = u23.h.f168226x0;
                                    ArrayList arrayListB0 = h0.B0(n0VarD.getAnnotations(), cVar4);
                                    aVar5.getClass();
                                    n0VarD = o72.t.X(n0VarD, u23.h.a.a(arrayListB0));
                                }
                                v1Var = o72.t.t(n0VarD, g2Var2, d1Var4);
                                m1Var = m1Var3;
                            }
                        } else {
                            it = it3;
                            list = parameters3;
                            dVar = dVar4;
                            v1Var = new v1(g2.INVARIANT, dVar.d(tVar2, aVarP));
                        }
                        arrayList2.add(v1Var);
                        it3 = it;
                        parameters3 = list;
                        dVar4 = dVar;
                        d1Var = null;
                    } else {
                        fVar = null;
                        listB1 = h0.b1(arrayList2);
                    }
                }
            }
            return q0.e(k1Var, m1Var, listB1, z16, fVar);
        }
        ArrayList arrayList3 = new ArrayList(y.r(parameters3, 10));
        for (d1 d1Var5 : parameters3) {
            if (o72.t.Q(d1Var5, null, aVar2.f116426h)) {
                t1VarA = d2.m(d1Var5, aVar2);
                m1Var2 = m1VarH;
                dVar2 = dVar3;
            } else {
                m1 m1Var4 = m1VarH;
                dVar2 = dVar3;
                m1Var2 = m1Var4;
                t1VarA = dVar2.f116439c.a(d1Var5, a.e(aVar, null, iVar.y(), null, null, 59), dVar2.f116440d, new s0(cVar.f102751a, new c(dVar3, d1Var5, aVar, m1Var4, iVar)));
            }
            arrayList3.add(t1VarA);
            aVar2 = aVar;
            dVar3 = dVar2;
            m1VarH = m1Var2;
        }
        m1Var = m1VarH;
        listB2 = arrayList3;
        fVar = null;
        listB1 = listB2;
        return q0.e(k1Var, m1Var, listB1, z16, fVar);
    }

    public final m1 b(o33.i iVar) {
        x33.b.a aVar = x33.b.f188590d;
        iVar.u();
        throw null;
    }

    public final f2 c(o33.e eVar, a aVar, boolean z14) {
        k33.i iVar = this.f116437a;
        k33.c cVar = iVar.f102785a;
        eVar.getClass();
        boolean z15 = aVar.f116425g;
        g0 g0VarC = eVar.C();
        e0 e0Var = g0VarC instanceof e0 ? (e0) g0VarC : null;
        q23.h hVarI = e0Var != null ? e0Var.I() : null;
        k33.f fVar = new k33.f(iVar, eVar, true);
        if (hVarI == null) {
            p43.n0 n0VarD = d(g0VarC, gg.b.P(c2.COMMON, z15, null, 6));
            if (z15) {
                return cVar.f102765o.e().i(z14 ? g2.OUT_VARIANCE : g2.INVARIANT, n0VarD, fVar);
            }
            return q0.b(cVar.f102765o.e().i(g2.INVARIANT, n0VarD, fVar), cVar.f102765o.e().i(g2.OUT_VARIANCE, n0VarD, fVar).J0(true));
        }
        v0 v0VarR = cVar.f102765o.e().r(hVarI);
        v0VarR.getClass();
        p43.n0 n0VarX = o72.t.X(v0VarR, new u23.n(v0VarR.getAnnotations(), fVar));
        n0VarX.getClass();
        v0 v0Var = (v0) n0VarX;
        return z15 ? v0Var : q0.b(v0Var, v0Var.J0(true));
    }

    public final p43.n0 d(t tVar, a aVar) {
        v0 v0VarA;
        k33.c cVar = this.f116437a.f102785a;
        if (tVar instanceof e0) {
            q23.h hVarI = ((e0) tVar).I();
            v0 v0VarT = hVarI != null ? cVar.f102765o.e().t(hVarI) : cVar.f102765o.e().x();
            v0VarT.getClass();
            return v0VarT;
        }
        boolean z14 = false;
        if (!(tVar instanceof o33.i)) {
            if (tVar instanceof o33.e) {
                return c((o33.e) tVar, aVar, false);
            }
            if (tVar instanceof x) {
                g0 g0VarL = ((x) tVar).l();
                return g0VarL != null ? d(g0VarL, aVar) : cVar.f102765o.e().n();
            }
            if (tVar == null) {
                return cVar.f102765o.e().n();
            }
            j20.x.k(tVar, "Unsupported type: ");
            return null;
        }
        o33.i iVar = (o33.i) tVar;
        if (!aVar.f116425g && aVar.f116422d != c2.SUPERTYPE) {
            z14 = true;
        }
        boolean zY = iVar.y();
        if (!zY && !z14) {
            v0 v0VarA2 = a(iVar, aVar, null);
            return v0VarA2 != null ? v0VarA2 : r43.l.c(k.f150364c, iVar.t());
        }
        v0 v0VarA3 = a(iVar, aVar.f(b.FLEXIBLE_LOWER_BOUND), null);
        if (v0VarA3 != null && (v0VarA = a(iVar, aVar.f(b.FLEXIBLE_UPPER_BOUND), v0VarA3)) != null) {
            return zY ? new j(v0VarA3, v0VarA) : q0.b(v0VarA3, v0VarA);
        }
        return r43.l.c(k.f150364c, iVar.t());
    }
}
