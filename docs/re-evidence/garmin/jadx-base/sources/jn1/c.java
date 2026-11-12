package jn1;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import in1.i;
import j92.f;
import km1.v;
import o4.m1;
import o72.t;
import org.joda.time.DateTime;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import sm1.s;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    public static final void a(km1.c cVar, DateTime dateTime, s sVar, m mVar, int i14) {
        int i15;
        int i16;
        cVar.getClass();
        sVar.getClass();
        o0 o0VarE = mVar.E(807825377);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            r rVarP = l.p(l.C(aVar, 0.0f, 0.0f, 0.0f, f14, 7));
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarP, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            bVar.getClass();
            r rVarC2 = l.C(aVar, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13);
            tm1.a.C3110a c3110a = tm1.a.f165439a;
            tm1.b bVarN = t.N(cVar);
            c3110a.getClass();
            in1.j.a(rVarC2, tm1.a.C3110a.c(bVarN), in1.a.a(cVar), true, o0VarE, 3072, 0);
            tn.k.n(bVar, aVar, f15, o0VarE);
            int i17 = i15 & 14;
            int i18 = km1.c.B | i17;
            b(cVar, dateTime, sVar, o0VarE, (i15 & 112) | i18 | (i15 & 896));
            if (in1.a.a(cVar)) {
                o0VarE.C(-1381360599);
                bVar.getClass();
                l.f(x2.h(aVar, f15), o0VarE);
                in1.s.q(cVar, sVar, o0VarE, i18 | ((i15 >> 3) & 112));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1381224137);
                o0VarE.g0(false);
            }
            v dailySleep = cVar.getDailySleep();
            String userNote = dailySleep != null ? dailySleep.getUserNote() : null;
            boolean zR = (i17 == 4 || ((i15 & 8) != 0 && o0VarE.r(cVar))) | o0VarE.r(sVar);
            Object objQ = o0VarE.q();
            if (zR) {
                i16 = 0;
                objQ = new a(sVar, cVar, 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    i16 = 0;
                    objQ = new a(sVar, cVar, 0);
                    o0VarE.K(objQ);
                } else {
                    i16 = 0;
                }
            }
            i.a(userNote, (e23.l) objQ, o0VarE, i16);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(cVar, dateTime, sVar, i14, 0);
        }
    }

    public static final void b(km1.c cVar, DateTime dateTime, s sVar, m mVar, int i14) {
        int i15;
        DateTime dateTime2;
        o0 o0VarE = mVar.E(508387370);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            dateTime2 = dateTime;
            i15 |= o0VarE.r(dateTime2) ? 32 : 16;
        } else {
            dateTime2 = dateTime;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = l.C(rVarE, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            u uVar = u.f22885a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_sleep_timeline);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(f.f97931h), o0VarE);
            r rVarC3 = uVar.c(aVar, gVar);
            bVar.getClass();
            mh.c(strQ, l.C(rVarC3, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            in1.d.a(cVar, dateTime2, sVar, in1.a.d(cVar), o0VarE, km1.c.B | (i15 & 14) | (i15 & 112) | (i15 & 896));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(cVar, dateTime, sVar, i14, 1);
        }
    }
}
