package it1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import g6.f;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import ho0.g;
import i3.mh;
import j92.e;
import p002j6.c;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import pt1.p;
import s5.x0;
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    public static final void a(p pVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1506733144);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new g(pVar, 28);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(pVar, 28);
                    o0VarE.K(objQ);
                }
            }
            r rVarF = x2.f(r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            f.a aVar = f.f75994b;
            c.b((l) objQ, x2.h(c2.l.A(rVarF, j92.b.f97899b.f97918c, 0.0f, 2), 230), null, o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hn1.l(pVar, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x019d  */
    public static final void b(p pVar, r rVar, m mVar, int i14) {
        int i15;
        pVar.getClass();
        o0 o0VarE = mVar.E(897789412);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            d.f81522a.getClass();
            z zVarA = y.a(iVarI, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            bVar.getClass();
            r rVarA = c2.l.A(rVarF, f15, 0.0f, 2);
            h4.g.b bVar3 = d.a.f81534l;
            bVar.getClass();
            s2 s2VarA = q2.a(j.i(f15), bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            r rVarA2 = u2.f22900a.a(aVar2, 1.0f, true);
            String strQ = gl1.y.Q(o0VarE, R.string.trail_detail_popular_months);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            g02.c.a(strQ, rVarA2, 0L, null, 0, false, 1, x0.a(j92.f.f97930g, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), 0.0d, o0VarE, 1572864, 316);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_help);
            fVar2.getClass();
            x0 x0VarA = x0.a(j92.f.f97932i, hb.a.e(o0VarE), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ho0.a(context, 8);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ho0.a(context, 8);
                    o0VarE.K(objQ);
                }
            }
            mh.c(strQ2, w.d(aVar2, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            a(pVar, o0VarE, i16 & 14);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(pVar, rVar, i14, 5);
        }
    }
}
