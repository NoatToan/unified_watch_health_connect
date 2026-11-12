package oy0;

import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import ov1.o;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v62.h1;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x0172  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x0213  */
    /* JADX WARN: Code duplicated, block: B:83:0x0261  */
    /* JADX WARN: Code duplicated, block: B:85:0x026f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0271  */
    /* JADX WARN: Code duplicated, block: B:90:0x027a  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:98:0x0334  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i iVar, l<? super i, Unit> lVar, r rVar, e23.a<Unit> aVar, boolean z14, m mVar, int i14, int i15) {
        int i16;
        r rVar2;
        int i17;
        l<? super i, Unit> lVar2;
        r rVar3;
        h5.g.a.f fVar;
        r.a aVar2;
        j92.b bVar;
        j92.e eVar;
        s2 s2VarA;
        int i18;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        Object objQ;
        j92.f fVar2;
        x0 x0Var;
        o0 o0Var;
        Object objQ2;
        Object objQ3;
        boolean z15;
        Object objQ4;
        o0 o0VarE = mVar.E(1642062569);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.k(iVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i19 = i15 & 4;
        if (i19 != 0) {
            i17 = i16 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = i16 | (o0VarE.B(rVar2) ? 256 : 128);
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            r rVar4 = i19 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            Object objQ5 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var = (p1) objQ5;
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                rVar3 = rVar4;
            } else {
                rVar3 = rVar4;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u uVar = u.f22885a;
                aVar2 = r.S;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar.getClass();
                r rVarF = x2.f(c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar.f97918c, 5), 1.0f);
                h4.g.b bVar3 = h4.d.a.f81534l;
                j.f22691a.getClass();
                s2VarA = q2.a(j.f22692b, bVar3, o0VarE, 54);
                i18 = i17;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = new om0.h(p1Var, 8);
                    o0VarE.K(objQ);
                }
                r rVarD = w.d(aVar2, false, null, null, (e23.a) objQ, 15);
                String strQ = y.Q(o0VarE, iVar.f134417a);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0Var = j92.f.f97931h;
                mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var), o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                s62.a.f157643a.getClass();
                u4.d dVarA = h1.a(t62.b.f162798a);
                objQ2 = o0Var.q();
                if (objQ2 == c2565a) {
                    objQ2 = new om0.h(p1Var, 9);
                    o0Var.K(objQ2);
                }
                r rVarD2 = w.d(aVar2, false, null, null, (e23.a) objQ2, 15);
                bVar.getClass();
                r rVarC3 = c2.l.C(rVarD2, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
                bVar.getClass();
                i7.b(dVarA, null, x2.q(rVarC3, j92.b.f97901d.f97903b), am.j.d(o0Var), o0Var, 48, 0);
                c2.l.f(u2Var.a(aVar2, 1.0f, true), o0Var);
                if (z14) {
                    o0Var.C(-556730312);
                    if ((i18 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ4 = o0Var.q();
                    if (z15 || objQ4 == c2565a) {
                        objQ4 = new o(aVar, 6);
                        o0Var.K(objQ4);
                    }
                    r rVarD3 = w.d(aVar2, false, null, null, (e23.a) objQ4, 15);
                    String strQ2 = y.Q(o0Var, R.string.edit_notes);
                    fVar2.getClass();
                    x0 x0VarB = d92.c.b(x0Var, o0Var);
                    long jE = hb.a.e(o0Var);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, rVarD3, jE, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 130040);
                    o0Var = o0Var;
                    o0Var.g0(false);
                } else {
                    o0Var.C(-556367581);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                objQ3 = o0Var.q();
                if (objQ3 == c2565a) {
                    objQ3 = new om0.h(p1Var, 10);
                    o0Var.K(objQ3);
                }
                lVar2 = lVar;
                o0 o0Var2 = o0Var;
                i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, null, ds.e0.w(o0Var), 0.0f, 0.0f, z3.f.c(1681585886, new k11.k(lVar2, p1Var, 3), o0Var), o0Var2, 48, 48, 1916);
                o0VarE = o0Var2;
                o0VarE.g0(true);
                rVar2 = rVar3;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u uVar2 = u.f22885a;
            aVar2 = r.S;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            bVar.getClass();
            r rVarF2 = x2.f(c2.l.C(aVar2, 0.0f, f15, 0.0f, eVar.f97918c, 5), 1.0f);
            h4.g.b bVar4 = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2VarA = q2.a(j.f22692b, bVar4, o0VarE, 54);
            i18 = i17;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarF2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = new om0.h(p1Var, 8);
                o0VarE.K(objQ);
            }
            r rVarD4 = w.d(aVar2, false, null, null, (e23.a) objQ, 15);
            String strQ3 = y.Q(o0VarE, iVar.f134417a);
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0Var = j92.f.f97931h;
            mh.c(strQ3, rVarD4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(x0Var), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            s62.a.f157643a.getClass();
            u4.d dVarA2 = h1.a(t62.b.f162798a);
            objQ2 = o0Var.q();
            if (objQ2 == c2565a) {
                objQ2 = new om0.h(p1Var, 9);
                o0Var.K(objQ2);
            }
            r rVarD5 = w.d(aVar2, false, null, null, (e23.a) objQ2, 15);
            bVar.getClass();
            r rVarC4 = c2.l.C(rVarD5, eVar.f97918c, 0.0f, 0.0f, 0.0f, 14);
            bVar.getClass();
            i7.b(dVarA2, null, x2.q(rVarC4, j92.b.f97901d.f97903b), am.j.d(o0Var), o0Var, 48, 0);
            c2.l.f(u2Var2.a(aVar2, 1.0f, true), o0Var);
            if (z14) {
                o0Var.C(-556730312);
                if ((i18 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = o0Var.q();
                if (z15) {
                    objQ4 = new o(aVar, 6);
                    o0Var.K(objQ4);
                } else {
                    objQ4 = new o(aVar, 6);
                    o0Var.K(objQ4);
                }
                r rVarD6 = w.d(aVar2, false, null, null, (e23.a) objQ4, 15);
                String strQ4 = y.Q(o0Var, R.string.edit_notes);
                fVar2.getClass();
                x0 x0VarB2 = d92.c.b(x0Var, o0Var);
                long jE2 = hb.a.e(o0Var);
                d6.h.f57752b.getClass();
                mh.c(strQ4, rVarD6, jE2, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB2, o0Var, 0, 0, 130040);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(-556367581);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
            objQ3 = o0Var.q();
            if (objQ3 == c2565a) {
                objQ3 = new om0.h(p1Var, 10);
                o0Var.K(objQ3);
            }
            lVar2 = lVar;
            o0 o0Var3 = o0Var;
            i3.u.a(zBooleanValue2, (e23.a) objQ3, null, 0L, null, null, null, ds.e0.w(o0Var), 0.0f, 0.0f, z3.f.c(1681585886, new k11.k(lVar2, p1Var, 3), o0Var), o0Var3, 48, 48, 1916);
            o0VarE = o0Var3;
            o0VarE.g0(true);
            rVar2 = rVar3;
        } else {
            lVar2 = lVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(iVar, lVar2, rVar2, aVar, z14, i14, i15);
        }
    }
}
