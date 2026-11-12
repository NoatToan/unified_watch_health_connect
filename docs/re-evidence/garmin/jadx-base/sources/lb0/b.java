package lb0;

import c2.b0;
import c2.j;
import c2.q;
import c2.u;
import c2.x2;
import c2.z;
import e23.l;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import k2.i;
import l72.n2;
import l72.t;
import mb0.h;
import o4.d0;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111709a;

        static {
            int[] iArr = new int[mb0.c.values().length];
            try {
                iArr[mb0.c.SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mb0.c.UNSELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mb0.c.ALREADY_SELECTED_CLICKABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mb0.c.ALREADY_SELECTED_NOT_CLICKABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f111709a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:102:0x041a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0421  */
    /* JADX WARN: Code duplicated, block: B:106:0x0434  */
    /* JADX WARN: Code duplicated, block: B:108:0x0443  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0312  */
    /* JADX WARN: Code duplicated, block: B:86:0x0319  */
    /* JADX WARN: Code duplicated, block: B:87:0x031d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0338  */
    /* JADX WARN: Code duplicated, block: B:95:0x0355  */
    /* JADX WARN: Code duplicated, block: B:97:0x035c  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mb0.b bVar, e23.a aVar, r rVar, m mVar, int i14) {
        o0 o0Var;
        r rVar2;
        long jB;
        long jB2;
        long jB3;
        mb0.c cVar;
        h5.g.a.f fVar;
        b0 b0Var;
        boolean z14;
        Object objQ;
        m.a aVar2;
        boolean zB;
        Object objQ2;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean zL;
        Object objQ3;
        r.a aVar3;
        long jB4;
        boolean zL2;
        Object objQ4;
        long jG;
        bVar.getClass();
        h hVar = bVar.f117715a;
        mb0.c cVar2 = bVar.f117716b;
        aVar.getClass();
        o0 o0VarE = mVar.E(996315606);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | 384;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar4 = r.S;
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, hVar.f117749a);
            String strP = y.P(cVar2.f117722a, new Object[]{y.Q(o0VarE, hVar.f117751c)}, o0VarE);
            int[] iArr = a.f111709a;
            int i16 = iArr[cVar2.ordinal()];
            if (i16 == 1) {
                o0VarE.C(-318396451);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).k().b();
                o0VarE.g0(false);
            } else if (i16 == 2) {
                o0VarE.C(-318394691);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).k().b();
                o0VarE.g0(false);
            } else if (i16 == 3) {
                o0VarE.C(-318392417);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).k().d();
                o0VarE.g0(false);
            } else {
                if (i16 != 4) {
                    throw kg.f.h(o0VarE, -318398255, false);
                }
                o0VarE.C(-318389953);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).k().d();
                o0VarE.g0(false);
            }
            int i17 = iArr[cVar2.ordinal()];
            if (i17 == 1) {
                o0VarE.C(-318386312);
                d92.b.f58623a.getClass();
                jB2 = d92.b.a(o0VarE).i().a().b();
                o0VarE.g0(false);
            } else if (i17 != 2) {
                if (i17 == 3) {
                    o0VarE.C(-318381954);
                    d92.b.f58623a.getClass();
                    jG = d92.b.a(o0VarE).c().g();
                    o0VarE.g0(false);
                } else {
                    if (i17 != 4) {
                        throw kg.f.h(o0VarE, -318388406, false);
                    }
                    o0VarE.C(-318379298);
                    d92.b.f58623a.getClass();
                    jG = d92.b.a(o0VarE).c().g();
                    o0VarE.g0(false);
                }
                jB2 = jG;
            } else {
                o0VarE.C(-318384327);
                d92.b.f58623a.getClass();
                jB2 = ((d0) ((i92.c) d92.b.a(o0VarE).i().f92362b.getF182175a()).f92370a.getF182175a()).f128833a;
                o0VarE.g0(false);
            }
            int i18 = iArr[cVar2.ordinal()];
            if (i18 == 1) {
                o0VarE.C(-318375752);
                d92.b.f58623a.getClass();
                jB3 = d92.b.a(o0VarE).i().a().b();
                o0VarE.g0(false);
            } else if (i18 == 2) {
                o0VarE.C(-318373831);
                d92.b.f58623a.getClass();
                jB3 = d92.b.a(o0VarE).i().a().a();
                o0VarE.g0(false);
            } else if (i18 == 3) {
                o0VarE.C(-318371362);
                d92.b.f58623a.getClass();
                jB3 = ((d0) d92.b.a(o0VarE).i().a().f92369g.getF182175a()).f128833a;
                o0VarE.g0(false);
            } else {
                if (i18 != 4) {
                    throw kg.f.h(o0VarE, -318377842, false);
                }
                o0VarE.C(-318368610);
                d92.b.f58623a.getClass();
                jB3 = ((d0) d92.b.a(o0VarE).i().a().f92369g.getF182175a()).f128833a;
                o0VarE.g0(false);
            }
            mb0.c cVar4 = mb0.c.ALREADY_SELECTED_NOT_CLICKABLE;
            boolean z15 = cVar2 != cVar4;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            if (cVar3 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0Var = b0.f22601a;
                g6.f.a aVar6 = g6.f.f75994b;
                r rVarB = l4.k.b(x2.q(aVar4, 40), i.f102406a);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ = o0VarE.q();
                aVar2 = m.f135153a;
                if (z14) {
                    objQ = new t(aVar, 16);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new t(aVar, 16);
                        o0VarE.K(objQ);
                    }
                }
                r rVarD = w.d(rVarB, z15, null, null, (e23.a) objQ, 14);
                zB = o0VarE.B(strP);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new n2(strP, 7);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new n2(strP, 7);
                        o0VarE.K(objQ2);
                    }
                }
                r rVarC3 = v.c((l) objQ2, rVarD, false);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarC3, o0VarE);
                if (cVar3 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u uVar = u.f22885a;
                r rVarD2 = x2.d(aVar4, 1.0f);
                zL = o0VarE.l(jB2) | o0VarE.l(jB3);
                objQ3 = o0VarE.q();
                if (zL) {
                    objQ3 = new cq.f(jB2, jB3, 1);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == m.a.f135155b) {
                        objQ3 = new cq.f(jB2, jB3, 1);
                        o0VarE.K(objQ3);
                    }
                }
                u1.n.b(rVarD2, (l) objQ3, o0VarE, 6);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0Var = j92.f.f97932i;
                d6.h.f57752b.getClass();
                mh.c(strQ, uVar.c(aVar4, h4.d.a.f81528f), jB, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 130040);
                o0Var = o0VarE;
                o0Var.g0(true);
                if (x.k(mb0.c.ALREADY_SELECTED_CLICKABLE, cVar4).contains(cVar)) {
                    o0Var.C(409613510);
                    jB4 = d92.b.a(o0Var).i().a().b();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    aVar3 = aVar4;
                    r rVarB2 = b0Var.b(c2.l.C(aVar4, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), h4.d.a.f81537o);
                    bVar3.getClass();
                    r rVarQ = x2.q(rVarB2, eVar2.f97918c);
                    zL2 = o0Var.l(jB4);
                    objQ4 = o0Var.q();
                    if (zL2) {
                        objQ4 = new j82.d(jB4, 10);
                        o0Var.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new j82.d(jB4, 10);
                            o0Var.K(objQ4);
                        }
                    }
                    u1.n.b(rVarQ, (l) objQ4, o0Var, 0);
                    o0Var.g0(false);
                } else {
                    aVar3 = aVar4;
                    o0Var.C(409978690);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                rVar2 = aVar3;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0Var = b0.f22601a;
            g6.f.a aVar7 = g6.f.f75994b;
            r rVarB3 = l4.k.b(x2.q(aVar4, 40), i.f102406a);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ = o0VarE.q();
            aVar2 = m.f135153a;
            if (z14) {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new t(aVar, 16);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new t(aVar, 16);
                o0VarE.K(objQ);
            }
            r rVarD3 = w.d(rVarB3, z15, null, null, (e23.a) objQ, 14);
            zB = o0VarE.B(strP);
            objQ2 = o0VarE.q();
            if (zB) {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new n2(strP, 7);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new n2(strP, 7);
                o0VarE.K(objQ2);
            }
            r rVarC4 = v.c((l) objQ2, rVarD3, false);
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarC4, o0VarE);
            if (cVar3 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u uVar2 = u.f22885a;
            r rVarD4 = x2.d(aVar4, 1.0f);
            zL = o0VarE.l(jB2) | o0VarE.l(jB3);
            objQ3 = o0VarE.q();
            if (zL) {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new cq.f(jB2, jB3, 1);
                    o0VarE.K(objQ3);
                }
            } else {
                objQ3 = new cq.f(jB2, jB3, 1);
                o0VarE.K(objQ3);
            }
            u1.n.b(rVarD4, (l) objQ3, o0VarE, 6);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var2 = j92.f.f97932i;
            d6.h.f57752b.getClass();
            mh.c(strQ, uVar2.c(aVar4, h4.d.a.f81528f), jB, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var2, o0VarE, 0, 0, 130040);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (x.k(mb0.c.ALREADY_SELECTED_CLICKABLE, cVar4).contains(cVar)) {
                o0Var.C(409613510);
                jB4 = d92.b.a(o0Var).i().a().b();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar3 = j92.b.f97899b;
                aVar3 = aVar4;
                r rVarB4 = b0Var.b(c2.l.C(aVar4, 0.0f, eVar3.f97918c, 0.0f, 0.0f, 13), h4.d.a.f81537o);
                bVar4.getClass();
                r rVarQ2 = x2.q(rVarB4, eVar3.f97918c);
                zL2 = o0Var.l(jB4);
                objQ4 = o0Var.q();
                if (zL2) {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new j82.d(jB4, 10);
                        o0Var.K(objQ4);
                    }
                } else {
                    objQ4 = new j82.d(jB4, 10);
                    o0Var.K(objQ4);
                }
                u1.n.b(rVarQ2, (l) objQ4, o0Var, 0);
                o0Var.g0(false);
            } else {
                aVar3 = aVar4;
                o0Var.C(409978690);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            rVar2 = aVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(bVar, aVar, rVar2, i14, 0);
        }
    }
}
