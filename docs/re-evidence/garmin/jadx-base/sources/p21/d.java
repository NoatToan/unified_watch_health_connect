package p21;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import cn1.o;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import h4.r;
import h5.e0;
import i3.fe;
import i3.mh;
import l72.v2;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final void a(q21.a aVar, v21.e eVar, fe feVar, e23.a aVar2, e23.a aVar3, p pVar, e23.a aVar4, m mVar, int i14) {
        int i15;
        Object obj;
        o0 o0Var;
        aVar.getClass();
        eVar.getClass();
        feVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-1756604203);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = eVar;
            i15 |= o0VarE.r(obj) ? 32 : 16;
        } else {
            obj = eVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(aVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            z02.d.a(aVar.f142204c, z3.f.c(1040339696, new mw1.b(aVar4, 24, aVar, aVar2), o0VarE), z3.f.c(-915807217, new b(feVar, 0), o0VarE), null, null, z3.f.c(1805686636, new na0.a(aVar, aVar3, obj, pVar, 16), o0VarE), o0Var, 197040, 24);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(aVar, eVar, feVar, aVar2, aVar3, pVar, aVar4, i14, 13);
        }
    }

    public static final void b(r rVar, String str, String str2, float f14, e23.l lVar, String str3, m mVar, int i14) {
        h5.g.a.b bVar;
        str2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-262124899);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.i(f14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.B(str3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(rVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            float f16 = eVar.f97917b;
            r rVarY = c2.l.y(rVarE, f15);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            fVar2.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            r.a aVar2 = r.S;
            bVar2.getClass();
            int i16 = i15 >> 6;
            mh.c(str2, v2.a(c2.l.A(aVar2, 0.0f, f16, 1), str3 != null, new j21.p(str3, 15), o0VarE, 0), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i16 & 14, 0, 131068);
            bVar2.getClass();
            r rVarA = c2.l.A(aVar2, 0.0f, f16, 1);
            h4.g.b bVar4 = h4.d.a.f81534l;
            bVar2.getClass();
            s2 s2VarA = q2.a(c2.j.i(eVar.f97921f), bVar4, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarA, o0VarE);
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
                bVar = bVar3;
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                bVar = bVar3;
            }
            b4.c(fVar, rVarC2, o0VarE);
            n21.c.a(u2.f22900a.a(aVar2, 1.0f, true), f14, lVar, new j23.e(0.0f, 100.0f), o0VarE, i16 & 1008, 0);
            o0VarE.g0(true);
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarA2 = c2.l.A(x2.f(aVar2, 1.0f), 48, 0.0f, 2);
            s2 s2VarA2 = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarE, 6);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarA2, o0VarE);
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
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            String strP = gl1.y.P(R.string.lbl_value_percent, new Object[]{0}, o0VarE);
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            String strP2 = gl1.y.P(R.string.lbl_value_percent, new Object[]{100}, o0VarE);
            fVar2.getClass();
            mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, str, str2, f14, lVar, str3, i14, 0);
        }
    }
}
