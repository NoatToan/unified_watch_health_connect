package p006l2;

import e23.a;
import e23.p;
import h4.r;
import o53.b0;
import p3.l0;
import p3.m;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.q2;
import r2.i;
import t13.h;
import t42.l;
import u1.g0;
import v13.c;
import w2.n;
import x1.d;
import x1.k;
import yt.f;
import z2.a2;
import z2.b2;
import z2.f1;
import z2.g1;
import z2.h0;
import z2.h2;
import z2.o1;
import z2.z1;
import z3.e;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    /* JADX WARN: Code duplicated, block: B:38:0x0080  */
    public static final void a(n nVar, boolean z14, e eVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        r rVarB;
        o0 o0VarE = mVar.E(-1442752422);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(nVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        int i17 = i15;
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = g0.f167495b;
            m.a aVar = m.f135153a;
            if (z15) {
                o0VarE.C(-1299459355);
                if (z14) {
                    o0VarE.C(-1299415211);
                    r.a aVar2 = r.S;
                    boolean zR = o0VarE.r(nVar);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new m0(nVar, null);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new m0(nVar, null);
                            o0VarE.K(objQ);
                        }
                    }
                    rVarB = i.b(aVar2, (p) objQ);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1298836224);
                    o0VarE.g0(false);
                    rVarB = r.S;
                }
                q2.m.b(rVarB, eVar, o0VarE, (i17 >> 3) & 112);
                o0VarE.g0(false);
                o0Var = o0VarE;
            } else {
                Object objH = q2.h(o0VarE, -1298667367, aVar);
                m.a.C2565a c2565a = m.a.f135155b;
                if (objH == c2565a) {
                    objH = new k(null, 1, null);
                    o0VarE.K(objH);
                }
                k kVar = (k) objH;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0 b0Var = (b0) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    j2.f108585b.getClass();
                    objQ3 = p0.n(j2.a(0));
                    o0VarE.K(objQ3);
                }
                p1 p1Var = (p1) objQ3;
                boolean zR2 = o0VarE.r(b0Var);
                Object objQ4 = o0VarE.q();
                int i18 = 12;
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new kk1.h(b0Var, i18);
                    o0VarE.K(objQ4);
                }
                l lVar = new l(p1Var, kVar, (p) objQ4, nVar, 22);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = new f0(kVar, 1);
                    o0VarE.K(objQ5);
                }
                a aVar3 = (a) objQ5;
                boolean zR3 = o0VarE.r(b0Var) | o0VarE.r(nVar);
                Object objQ6 = o0VarE.q();
                if (zR3 || objQ6 == c2565a) {
                    objQ6 = new kk1.a(b0Var, p1Var, nVar, i16);
                    o0VarE.K(objQ6);
                }
                o0Var = o0VarE;
                d.b(kVar, aVar3, lVar, null, z14, (a) objQ6, eVar, o0Var, ((i17 << 9) & 57344) | 54 | (3670016 & (i17 << 12)), 8);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h0(nVar, z14, eVar, i14, 0);
        }
    }

    public static final void b(o1 o1Var, e eVar, m mVar, int i14) {
        e eVar2;
        o0 o0VarE = mVar.E(-614342087);
        int i15 = (o0VarE.r(o1Var) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (g0.f167495b) {
                o0VarE.C(-1009319487);
                q2.m.b(r2.l.a(i.b(r.S, new f1(o1Var, null)), o1Var.f201717h, new g1(o1Var, null), null, new h0(o1Var, 3)), eVar, o0VarE, 48);
                o0VarE.g0(false);
                eVar2 = eVar;
            } else {
                o0VarE.C(-1009204043);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new k(null, 1, null);
                    o0VarE.K(objQ);
                }
                k kVar = (k) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new f0(kVar, 2);
                    o0VarE.K(objQ2);
                }
                a aVar = (a) objQ2;
                n4.d dVar = z2.p1.f201741a;
                eVar2 = eVar;
                d.b(kVar, aVar, new f(5, o1Var, kVar), null, false, null, eVar2, o0VarE, 1572918, 56);
                o0VarE.g0(false);
            }
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i0(o1Var, eVar2, i14, i16);
        }
    }

    public static final void c(h2 h2Var, e eVar, m mVar, int i14) {
        int i15;
        e eVar2;
        o0 o0VarE = mVar.E(1533506138);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(h2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (g0.f167495b) {
                o0VarE.C(-885604480);
                q2.m.b(!h2Var.r() ? r.S : r2.l.a(i.b(r.S, new z1(h2Var, null)), h2Var.f201629z, new a2(h2Var, null), new b2(h2Var, null), new a1(h2Var, 2)), eVar, o0VarE, i15 & 112);
                o0VarE.g0(false);
                eVar2 = eVar;
            } else {
                o0VarE.C(-885475365);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new k(null, 1, null);
                    o0VarE.K(objQ);
                }
                k kVar = (k) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                b0 b0Var = (b0) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    j2.f108585b.getClass();
                    objQ3 = p0.n(j2.a(0));
                    o0VarE.K(objQ3);
                }
                p1 p1Var = (p1) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new f0(kVar, 0);
                    o0VarE.K(objQ4);
                }
                a aVar = (a) objQ4;
                wn2.f fVar = new wn2.f(p1Var, 25, h2Var, kVar);
                boolean zR = h2Var.r();
                boolean zR2 = o0VarE.r(b0Var) | o0VarE.r(h2Var);
                Object objQ5 = o0VarE.q();
                if (zR2 || objQ5 == c2565a) {
                    objQ5 = new kk1.a(b0Var, p1Var, h2Var, 3);
                    o0VarE.K(objQ5);
                }
                eVar2 = eVar;
                d.b(kVar, aVar, fVar, null, zR, (a) objQ5, eVar2, o0VarE, ((i15 << 15) & 3670016) | 54, 8);
                o0VarE.g0(false);
            }
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(h2Var, eVar2, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(n nVar, c cVar) {
        p0 p0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f108698c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f108698c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(cVar);
            }
        } else {
            p0Var = new p0(cVar);
        }
        Object obj = p0Var.f108697b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f108698c;
        if (i15 == 0) {
            o13.r.b(obj);
            p0Var.f108696a = nVar;
            p0Var.f108698c = 1;
            if (nVar.F() == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nVar = p0Var.f108696a;
            o13.r.b(obj);
        }
        return j2.a(j2.b(nVar.e(), nVar.g(), nVar.f(), nVar.h(), nVar.d()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(h2 h2Var, c cVar) {
        q0 q0Var;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f108738c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f108738c = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(cVar);
            }
        } else {
            q0Var = new q0(cVar);
        }
        Object obj = q0Var.f108737b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f108738c;
        if (i15 == 0) {
            o13.r.b(obj);
            q0Var.f108736a = h2Var;
            q0Var.f108738c = 1;
            if (h2Var.C(q0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h2Var = q0Var.f108736a;
            o13.r.b(obj);
        }
        return j2.a(j2.b(h2Var.f(), h2Var.h(), h2Var.g(), h2Var.i(), h2Var.e()));
    }
}
