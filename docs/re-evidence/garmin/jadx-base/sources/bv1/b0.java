package bv1;

import b21.s4;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import kotlin.t1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {
    /* JADX WARN: Code duplicated, block: B:60:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x01eb  */
    public static final void a(vu1.w wVar, p1<Boolean> p1Var, p3.m mVar, int i14) {
        int i15;
        vu1.w wVar2;
        char c14;
        boolean z14;
        Object objQ;
        wVar.getClass();
        p1Var.getClass();
        o0 o0VarE = mVar.E(1059861306);
        if ((i14 & 6) == 0) {
            i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(wVar) : o0VarE.r(wVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(p1Var) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.see_all_camel_case);
            String strP = gl1.y.P(R.string.lbl_button_desc, new Object[]{strQ}, o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarF, f15, 0.0f, eVar.f97920e, f14, 2);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22698h, bVar2, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            h4.r rVarC3 = u2Var.c(aVar, bVar2);
            bVar.getClass();
            h4.r rVarC4 = c2.l.C(rVarC3, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            bVar.getClass();
            zd0.e.c(j92.b.f97901d.f97904c, 0, 6, 0L, rVarC4, o0VarE);
            h4.r rVarA = u2Var.a(aVar, 8.0f, true);
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                c14 = 4;
                objQ2 = new bt1.s(4);
                o0VarE.K(objQ2);
            } else {
                c14 = 4;
            }
            h4.r rVarC5 = p5.v.c((e23.l) objQ2, rVarA, false);
            String strQ2 = gl1.y.Q(o0VarE, R.string.training_guidance);
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            int i16 = i15;
            mh.c(strQ2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            if (p1Var.getF182175a().booleanValue()) {
                o0VarE.C(519850298);
                boolean zB = o0VarE.B(strP);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new defpackage.b(strP, 25);
                    o0VarE.K(objQ3);
                }
                h4.r rVarC6 = p5.v.c((e23.l) objQ3, aVar, false);
                if ((i16 & 14) != 4) {
                    if ((i16 & 8) != 0) {
                        wVar2 = wVar;
                        if (o0VarE.r(wVar2)) {
                        }
                        objQ = o0VarE.q();
                        if (z14 || objQ == c2565a) {
                            objQ = new s4(wVar2, 27);
                            o0VarE.K(objQ);
                        }
                        h4.r rVarD = u1.w.d(rVarC6, false, null, null, (e23.a) objQ, 15);
                        fVar.getClass();
                        x0 x0VarA = x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.h.f57752b.getClass();
                        mh.c(strQ, rVarD, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 130044);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        wVar2 = wVar;
                    }
                    z14 = false;
                    objQ = o0VarE.q();
                    if (z14) {
                        objQ = new s4(wVar2, 27);
                        o0VarE.K(objQ);
                    } else {
                        objQ = new s4(wVar2, 27);
                        o0VarE.K(objQ);
                    }
                    h4.r rVarD2 = u1.w.d(rVarC6, false, null, null, (e23.a) objQ, 15);
                    fVar.getClass();
                    x0 x0VarA2 = x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarD2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarA2, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    wVar2 = wVar;
                }
                z14 = true;
                objQ = o0VarE.q();
                if (z14) {
                    objQ = new s4(wVar2, 27);
                    o0VarE.K(objQ);
                } else {
                    objQ = new s4(wVar2, 27);
                    o0VarE.K(objQ);
                }
                h4.r rVarD3 = u1.w.d(rVarC6, false, null, null, (e23.a) objQ, 15);
                fVar.getClass();
                x0 x0VarA3 = x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                d6.h.f57752b.getClass();
                mh.c(strQ, rVarD3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarA3, o0VarE, 0, 0, 130044);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                wVar2 = wVar;
                o0VarE.C(520331108);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            wVar2 = wVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(wVar2, p1Var, i14, 7);
        }
    }

    public static final void b(i53.c<av1.g> cVar, int i14, vu1.w wVar, p3.m mVar, int i15) {
        cVar.getClass();
        wVar.getClass();
        o0 o0VarE = mVar.E(1480583632);
        int i16 = i15 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(wVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarX = x2.x(x2.f(h4.r.S, 1.0f), null, 3);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(rVarX, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            float f69051c = ((g6.c) o0VarE.A(t1.f91490h)).getF69051c();
            tu1.i.a aVar2 = tu1.i.f166483a;
            int size = cVar.size();
            aVar2.getClass();
            if (f69051c <= 1.5f) {
                size = (size + 1) / 2;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = hb.a.n(i14 > 6, o0VarE);
            }
            a(wVar, (p1) objQ, o0VarE, ((i16 >> 6) & 14) | 48);
            boolean z14 = (i16 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new a61.d(wVar, 24);
                o0VarE.K(objQ2);
            }
            cv1.h.a(size, cVar, (e23.p) objQ2, o0VarE, (i16 << 3) & 112);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(cVar, i14, wVar, i15, 6);
        }
    }
}
