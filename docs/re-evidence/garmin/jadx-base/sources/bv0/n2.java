package bv0;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class n2 {
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    public static final void a(final sc.f fVar, final gv0.d dVar, yu0.f fVar2, kv0.j jVar, final e23.a aVar, e23.a aVar2, int i14, e23.a aVar3, final e23.a aVar4, e23.l lVar, final e23.a aVar5, final e23.a aVar6, p3.m mVar, int i15) {
        char c14;
        fVar.getClass();
        dVar.getClass();
        fVar2.getClass();
        jVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        lVar.getClass();
        aVar5.getClass();
        aVar6.getClass();
        p3.o0 o0VarE = mVar.E(965325629);
        int i16 = i15 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(fVar2) ? 256 : 128) | (o0VarE.r(jVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304) | (o0VarE.r(aVar4) ? 67108864 : 33554432) | (o0VarE.r(lVar) ? 536870912 : 268435456);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (((o0VarE.r(aVar5) ? (char) 4 : (char) 2) | (o0VarE.r(aVar6) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i17 = i16 & 14;
            boolean zR = ((i16 & 57344) == 16384) | (i17 == 4) | ((234881024 & i16) == 67108864) | o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            if (zR) {
                c14 = 0;
                c cVar = new c(fVar, aVar4, dVar, aVar, 0);
                o0VarE.K(cVar);
                objQ = cVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    c14 = 0;
                    c cVar2 = new c(fVar, aVar4, dVar, aVar, 0);
                    o0VarE.K(cVar2);
                    objQ = cVar2;
                } else {
                    c14 = 0;
                }
            }
            sc.k kVarW = o72.t.W(o0VarE);
            x9.c cVarT = w5.r.t(o0VarE);
            sc.i[] iVarArr = new sc.i[2];
            iVarArr[c14] = kVarW;
            iVarArr[1] = cVarT;
            List listK = p13.x.k(iVarArr);
            tn2.n0 n0Var = new tn2.n0(24);
            tn2.n0 n0Var2 = new tn2.n0(25);
            ty1.q1 q1Var = new ty1.q1(2);
            o0VarE.C(-34945718);
            sc.e eVar = new sc.e(s.f21367a);
            z3.e eVarC = z3.f.c(-1215986259, new e(fVar2, dVar, jVar, aVar5, aVar6, fVar, aVar2), o0VarE);
            x1 x1Var2 = x1.f21373a;
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
            eVar.a(t0Var.b(a.p.class), x1Var2, k0Var, eVarC);
            eVar.a(t0Var.b(a.g.class), f2.f21305a, k0Var, z3.f.c(-390469797, new a42.y(12, aVar5, dVar, aVar6, aVar), o0VarE));
            final int i18 = 1;
            eVar.a(t0Var.b(a.h.class), g2.f21313a, k0Var, z3.f.c(1125831263, new e23.q() { // from class: bv0.g
                /* JADX WARN: Code duplicated, block: B:13:0x0050  */
                /* JADX WARN: Code duplicated, block: B:27:0x009d  */
                /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i19 = i18;
                    p3.m.a aVar7 = p3.m.f135153a;
                    switch (i19) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((a.q) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                p3.x1 x1Var3 = p3.n.f135158a;
                                sc.f fVar3 = fVar;
                                boolean zR2 = mVar2.r(fVar3);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new o(fVar3, 8);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar7.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new o(fVar3, 8);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(fVar3);
                                e23.a aVar9 = aVar4;
                                boolean zB = zR3 | mVar2.B(aVar9);
                                gv0.d dVar2 = dVar;
                                boolean zR4 = zB | mVar2.r(dVar2);
                                e23.a aVar10 = aVar;
                                boolean zB2 = zR4 | mVar2.B(aVar10);
                                Object objQ3 = mVar2.q();
                                if (zB2) {
                                    c cVar3 = new c(fVar3, aVar9, dVar2, aVar10, 12);
                                    mVar2.K(cVar3);
                                    objQ3 = cVar3;
                                } else {
                                    aVar7.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        c cVar4 = new c(fVar3, aVar9, dVar2, aVar10, 12);
                                        mVar2.K(cVar4);
                                        objQ3 = cVar4;
                                    }
                                }
                                zu0.a.a(dVar2, aVar5, aVar6, aVar8, (e23.a) objQ3, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((a.h) obj).getClass();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                p3.x1 x1Var4 = p3.n.f135158a;
                                sc.f fVar4 = fVar;
                                boolean zR5 = mVar3.r(fVar4);
                                e23.a aVar11 = aVar4;
                                boolean zB3 = zR5 | mVar3.B(aVar11);
                                gv0.d dVar3 = dVar;
                                boolean zR6 = zB3 | mVar3.r(dVar3);
                                e23.a aVar12 = aVar;
                                boolean zB4 = zR6 | mVar3.B(aVar12);
                                Object objQ4 = mVar3.q();
                                if (zB4) {
                                    c cVar5 = new c(fVar4, aVar11, dVar3, aVar12, 14);
                                    mVar3.K(cVar5);
                                    objQ4 = cVar5;
                                } else {
                                    aVar7.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        c cVar6 = new c(fVar4, aVar11, dVar3, aVar12, 14);
                                        mVar3.K(cVar6);
                                        objQ4 = cVar6;
                                    }
                                }
                                hv0.i.a(dVar3, aVar5, aVar6, (e23.a) objQ4, mVar3, 0);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE));
            eVar.a(t0Var.b(a.b.class), h2.f21327a, k0Var, z3.f.c(146074339, new f(fVar, aVar4, dVar, aVar, 5), o0VarE));
            eVar.a(t0Var.b(a.f.class), i2.f21335a, k0Var, z3.f.c(-1358653454, new i(dVar, i14, aVar3, fVar, aVar4, aVar), o0VarE));
            eVar.a(t0Var.b(a.k.class), j2.f21338a, k0Var, z3.f.c(162030401, new f(fVar, aVar4, dVar, aVar, 6), o0VarE));
            eVar.a(t0Var.b(a.i.class), k2.f21341a, k0Var, z3.f.c(-1381792354, new f(dVar, fVar, aVar4, aVar, 7), o0VarE));
            eVar.a(t0Var.b(a.n.class), l2.f21345a, k0Var, z3.f.c(-840113108, new f(dVar, fVar, aVar4, aVar, 8), o0VarE));
            eVar.a(t0Var.b(a.a0.class), m2.f21348a, k0Var, z3.f.c(-150505926, new ak0.j(dVar, lVar, fVar, aVar4, aVar), o0VarE));
            eVar.a(t0Var.b(a.j.class), n1.f21351a, k0Var, z3.f.c(-27146197, new f(dVar, fVar, aVar4, aVar, 4), o0VarE));
            eVar.a(t0Var.b(a.z.class), o1.f21354a, k0Var, z3.f.c(-2086536416, new ak0.h(dVar, fVar2, fVar, lVar, aVar4, aVar), o0VarE));
            eVar.a(t0Var.b(a.s.class), p1.f21358a, k0Var, z3.f.c(1219959938, new d(fVar2, dVar, fVar, aVar4, aVar, 2), o0VarE));
            eVar.a(t0Var.b(a.y.class), q1.f21362a, k0Var, z3.f.c(-1971518395, new ak0.g(dVar, fVar2, fVar, lVar, aVar5, aVar6, aVar4, aVar), o0VarE));
            eVar.a(t0Var.b(a.t.class), r1.f21366a, k0Var, z3.f.c(678159534, new ak0.j((Object) dVar, aVar2, (Object) fVar, (Object) aVar4, (o13.h) aVar, 11), o0VarE));
            eVar.a(t0Var.b(a.m.class), s1.f21368a, k0Var, z3.f.c(-1668904266, new q(dVar, aVar, 0), o0VarE));
            eVar.a(t0Var.b(a.l.class), t1.f21369a, k0Var, z3.f.c(-1725167522, new f(dVar, fVar, aVar4, aVar, 9), o0VarE));
            eVar.a(t0Var.b(a.v.class), u1.f21370a, k0Var, z3.f.c(-1097732772, new f(dVar, fVar, aVar4, aVar, 10), o0VarE));
            eVar.a(t0Var.b(a.C0300a.class), v1.f21371a, k0Var, z3.f.c(-1801328012, new d(dVar, fVar2, fVar, aVar4, aVar), o0VarE));
            eVar.a(t0Var.b(a.u.class), w1.f21372a, k0Var, z3.f.c(2119223914, new d(fVar2, dVar, fVar, aVar4, aVar, 0), o0VarE));
            eVar.a(t0Var.b(a.r.class), y1.f21374a, k0Var, z3.f.c(568764267, new d(fVar2, dVar, fVar, aVar4, aVar, 1), o0VarE));
            eVar.a(t0Var.b(a.w.class), z1.f21375a, k0Var, z3.f.c(-1919163464, new f(dVar, fVar, aVar4, aVar, 0), o0VarE));
            eVar.a(t0Var.b(a.x.class), a2.f21275a, k0Var, z3.f.c(773106362, new f(fVar, aVar4, dVar, aVar, 1), o0VarE));
            eVar.a(t0Var.b(a.e.class), b2.f21277a, k0Var, z3.f.c(1343789733, new f(fVar, aVar4, dVar, aVar, 2), o0VarE));
            eVar.a(t0Var.b(a.o.class), c2.f21283a, k0Var, z3.f.c(-869426834, new a42.a(dVar, fVar, aVar, 9), o0VarE));
            eVar.a(t0Var.b(a.c.class), d2.f21290a, k0Var, z3.f.c(1184584176, new f(dVar, fVar, aVar4, aVar, 3), o0VarE));
            final int i19 = 0;
            eVar.a(t0Var.b(a.q.class), e2.f21299a, k0Var, z3.f.c(1223982478, new e23.q() { // from class: bv0.g
                /* JADX WARN: Code duplicated, block: B:13:0x0050  */
                /* JADX WARN: Code duplicated, block: B:27:0x009d  */
                /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i110 = i19;
                    p3.m.a aVar7 = p3.m.f135153a;
                    switch (i110) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((a.q) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                p3.x1 x1Var3 = p3.n.f135158a;
                                sc.f fVar3 = fVar;
                                boolean zR2 = mVar2.r(fVar3);
                                Object objQ2 = mVar2.q();
                                if (zR2) {
                                    objQ2 = new o(fVar3, 8);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar7.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new o(fVar3, 8);
                                        mVar2.K(objQ2);
                                    }
                                }
                                e23.a aVar8 = (e23.a) objQ2;
                                boolean zR3 = mVar2.r(fVar3);
                                e23.a aVar9 = aVar4;
                                boolean zB = zR3 | mVar2.B(aVar9);
                                gv0.d dVar2 = dVar;
                                boolean zR4 = zB | mVar2.r(dVar2);
                                e23.a aVar10 = aVar;
                                boolean zB2 = zR4 | mVar2.B(aVar10);
                                Object objQ3 = mVar2.q();
                                if (zB2) {
                                    c cVar4 = new c(fVar3, aVar9, dVar2, aVar10, 12);
                                    mVar2.K(cVar4);
                                    objQ3 = cVar4;
                                } else {
                                    aVar7.getClass();
                                    if (objQ3 == p3.m.a.f135155b) {
                                        c cVar5 = new c(fVar3, aVar9, dVar2, aVar10, 12);
                                        mVar2.K(cVar5);
                                        objQ3 = cVar5;
                                    }
                                }
                                zu0.a.a(dVar2, aVar5, aVar6, aVar8, (e23.a) objQ3, mVar2, 0);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((a.h) obj).getClass();
                            if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                p3.x1 x1Var4 = p3.n.f135158a;
                                sc.f fVar4 = fVar;
                                boolean zR5 = mVar3.r(fVar4);
                                e23.a aVar11 = aVar4;
                                boolean zB3 = zR5 | mVar3.B(aVar11);
                                gv0.d dVar3 = dVar;
                                boolean zR6 = zB3 | mVar3.r(dVar3);
                                e23.a aVar12 = aVar;
                                boolean zB4 = zR6 | mVar3.B(aVar12);
                                Object objQ4 = mVar3.q();
                                if (zB4) {
                                    c cVar6 = new c(fVar4, aVar11, dVar3, aVar12, 14);
                                    mVar3.K(cVar6);
                                    objQ4 = cVar6;
                                } else {
                                    aVar7.getClass();
                                    if (objQ4 == p3.m.a.f135155b) {
                                        c cVar7 = new c(fVar4, aVar11, dVar3, aVar12, 14);
                                        mVar3.K(cVar7);
                                        objQ4 = cVar7;
                                    }
                                }
                                hv0.i.a(dVar3, aVar5, aVar6, (e23.a) objQ4, mVar3, 0);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE));
            Unit unit = Unit.INSTANCE;
            s70.b0 b0Var = new s70.b0(eVar, 6);
            o0VarE.g0(false);
            sc.f.Companion companion = sc.f.INSTANCE;
            o72.t.f(fVar, null, null, (e23.a) objQ, listK, null, n0Var, n0Var2, q1Var, b0Var, o0VarE, i17, 102);
            p3.x1 x1Var3 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(fVar, dVar, fVar2, jVar, aVar, aVar2, i14, aVar3, aVar4, lVar, aVar5, aVar6, i15);
        }
    }
}
