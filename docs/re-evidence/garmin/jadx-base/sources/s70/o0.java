package s70;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 {
    public static final void a(List<? extends r70.s> list, boolean z14, r70.q qVar, p3.m mVar, int i14) {
        float f14;
        float F;
        int i15;
        boolean z15 = z14;
        final r70.q qVar2 = qVar;
        p3.o0 o0VarE = mVar.E(-1792286276);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z15) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(qVar2) ? 256 : 128;
        }
        int i17 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(kotlin.t1.f91490h)).getF75992b();
            float f15 = 1.0f;
            if (f75992b > 1.5f) {
                g6.f.a aVar = g6.f.f75994b;
                f14 = 212.0f;
            } else if (f75992b <= 1.0f || f75992b > 1.5f) {
                g6.f.a aVar2 = g6.f.f75994b;
                f14 = 120.0f;
            } else {
                g6.f.a aVar3 = g6.f.f75994b;
                f14 = 152.0f;
            }
            int size = list.size();
            if (f75992b > 1.5f) {
                size = 2;
            }
            float f16 = 1.0f / size;
            int size2 = list.size();
            if (f75992b > 1.5f) {
                size2 = 2;
            }
            if (z15) {
                o0VarE.C(-105212173);
                F = jg.b.F(o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2098771266);
                o0VarE.g0(false);
                F = 1.0f;
            }
            for (List<r70.s> list2 : p13.h0.i1(list, size2, size2, true)) {
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f17 = j92.b.f97899b.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f17);
                float f18 = f75992b;
                h4.r rVarX = x2.x(x2.f(h4.r.S, f15), null, 3);
                h4.d.f81522a.getClass();
                s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, i17);
                p3.x1 x1Var2 = p3.n.f135158a;
                final float f19 = F;
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(rVarX, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(808537030);
                for (final r70.s sVar : list2) {
                    h4.r rVarH = x2.h(u2Var.a(h4.r.S, f16, true), f14);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC2 = h4.k.c(rVarH, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    p3.c<?> cVar2 = cVar;
                    if (o0VarE.T) {
                        o0VarE.M(aVar5);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    int i18 = i16;
                    Boolean boolValueOf = Boolean.valueOf(z15);
                    xz1.a.f192853a.getClass();
                    r1.b.a(boolValueOf, null, new xd2.m0(14), null, null, null, z3.f.c(809127247, new e23.r() { // from class: s70.m0
                        @Override // e23.r
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                            p3.m mVar2 = (p3.m) obj3;
                            ((Integer) obj4).getClass();
                            ((r1.l) obj).getClass();
                            p3.x1 x1Var4 = p3.n.f135158a;
                            if (zBooleanValue) {
                                mVar2.C(1353408197);
                                a02.c.a(x2.d(h4.r.S, 1.0f), f19, mVar2, 6);
                                mVar2.f();
                            } else {
                                mVar2.C(1353660103);
                                r70.r rVarA = m70.f.a(sVar);
                                if (rVarA == null) {
                                    mVar2.C(1353660102);
                                    mVar2.f();
                                } else {
                                    mVar2.C(182213787);
                                    rVarA.a(x2.d(h4.r.S, 1.0f), qVar2, mVar2, 6);
                                    mVar2.f();
                                    Unit unit = Unit.INSTANCE;
                                }
                                mVar2.f();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0VarE), o0VarE, ((i18 >> 3) & 14) | 1572864, 58);
                    o0VarE.g0(true);
                    qVar2 = qVar;
                    f14 = f14;
                    f16 = f16;
                    i16 = i18;
                    f19 = f19;
                    z15 = z14;
                    f18 = f18;
                    cVar = cVar2;
                }
                p3.c<?> cVar3 = cVar;
                float f22 = f14;
                float f24 = f16;
                float f25 = f19;
                float f26 = f18;
                int i19 = i16;
                o0VarE.g0(false);
                if (f26 <= 1.5d || list2.size() % 2 != 1) {
                    i15 = 0;
                    o0VarE.C(-703996289);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-704164464);
                    i15 = 0;
                    c2.q.a(x2.h(u2Var.a(h4.r.S, f24, true), f22), o0VarE, 0);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                f75992b = f26;
                f14 = f22;
                f16 = f24;
                i17 = i15;
                i16 = i19;
                f15 = 1.0f;
                cVar = cVar3;
                F = f25;
                z15 = z14;
                qVar2 = qVar;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n0(list, z14, qVar, i14, 0);
        }
    }
}
