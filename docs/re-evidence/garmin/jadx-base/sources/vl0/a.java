package vl0;

import am.j;
import b21.n9;
import c2.b0;
import c2.l;
import c2.q;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import d6.p;
import f5.z0;
import g6.f;
import h4.k;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import k2.i;
import kotlin.t1;
import o4.f0;
import p005kotlin.jvm.internal.s;
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
import u4.d;
import u62.i1;
import u62.j1;
import ux1.g;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:119:0x024b  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e6  */
    public static final void a(r rVar, boolean z14, String str, String str2, String str3, String str4, e23.a aVar, m mVar, int i14) {
        int i15;
        boolean z15;
        x0 x0VarB;
        d dVarA;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str3, mVar, 331129141);
        p3.c<?> cVar = o0VarK.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarK.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarK.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarK.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarK.B(str2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarK.B(str3) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarK.B(str4) ? 131072 : 65536;
        }
        int i16 = i15 | 920125440;
        char c14 = o0VarK.r(aVar) ? (char) 4 : (char) 2;
        if (o0VarK.n(i16 & 1, ((i16 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            x1 x1Var = n.f135158a;
            r rVarO = l.o(rVar, q1.Min);
            long jA = j.A(d92.b.f58623a, o0VarK);
            float f14 = 8;
            f.a aVar2 = f.f75994b;
            r rVarE = u1.n.e(rVarO, jA, i.a(f14));
            boolean z16 = aVar != null;
            boolean z17 = (c14 & 14) == 4;
            Object objQ = o0VarK.q();
            m.a aVar3 = m.f135153a;
            if (z17) {
                objQ = new g(aVar, 18);
                o0VarK.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(aVar, 18);
                    o0VarK.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, z16, null, null, (e23.a) objQ, 14);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = k.c(rVarD, o0VarK);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar4);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            u uVar = u.f22885a;
            if (z14) {
                o0VarK.C(1039135467);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(j92.f.f97932i, o0VarK);
                z15 = false;
            } else {
                z15 = false;
                o0VarK.C(1039136649);
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(j92.f.f97932i, o0VarK);
            }
            o0VarK.g0(z15);
            x0 x0Var = x0VarB;
            c2.j.f22691a.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            r.a aVar5 = r.S;
            r rVarY = l.y(aVar5, 16);
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarK, 6);
            int iHashCode2 = Long.hashCode(o0VarK.U);
            i2 i2VarA1 = o0VarK.a0();
            r rVarC2 = k.c(rVarY, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar4);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, zVarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarK, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarK);
            b0 b0Var = b0.f22601a;
            r rVarF = x2.f(aVar5, 1.0f);
            c2.j.i iVarI2 = c2.j.i(f14);
            h4.g.b bVar2 = h4.d.a.f81533k;
            s2 s2VarA = q2.a(iVarI2, bVar2, o0VarK, 6);
            int iHashCode3 = Long.hashCode(o0VarK.U);
            i2 i2VarA2 = o0VarK.a0();
            r rVarC3 = k.c(rVarF, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar4);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA, o0VarK);
            b4.c(c1623g, i2VarA2, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode3))) {
                h.A(iHashCode3, o0VarK, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarK);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar5, 1.0f, true);
            boolean z18 = (i16 & 3670016) == 1048576;
            Object objQ2 = o0VarK.q();
            if (z18) {
                objQ2 = new vb1.d(20);
                o0VarK.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new vb1.d(20);
                    o0VarK.K(objQ2);
                }
            }
            r rVarA2 = l.A(v.c((e23.l) objQ2, rVarA, false), 0.0f, 2, 1);
            p.f57793b.getClass();
            mh.c(str, rVarA2, 0L, null, 0L, null, 0L, null, 0L, p.f57795d, false, 1, 0, null, x0Var, o0VarK, (i16 >> 6) & 14, 24960, 110588);
            d92.b.f58625c.getClass();
            r rVarQ = x2.q(aVar5, j92.b.f97901d.f97904c);
            h4.g.b bVar3 = h4.d.a.f81534l;
            i7.a(n5.c.a(R.drawable.exterior_link, o0VarK, 0), null, u2Var.c(rVarQ, bVar3), j.d(o0VarK), o0VarK, 48, 0);
            o0VarK.g0(true);
            if (((g6.c) o0VarK.A(t1.f91490h)).getF75992b() > 1.5d) {
                bVar3 = bVar2;
            }
            bv.b.f21239a.getClass();
            bv.b.a();
            if (k1.f37122a.l0()) {
                s62.a.f157643a.getClass();
                dVarA = j1.a(t62.a.f162797a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = i1.a(t62.a.f162797a);
            }
            d dVar = dVarA;
            s2 s2VarA2 = q2.a(c2.j.f22692b, bVar3, o0VarK, 0);
            int iHashCode4 = Long.hashCode(o0VarK.U);
            i2 i2VarA3 = o0VarK.a0();
            r rVarC4 = k.c(aVar5, o0VarK);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar4);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA2, o0VarK);
            b4.c(c1623g, i2VarA3, o0VarK);
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode4))) {
                h.A(iHashCode4, o0VarK, iHashCode4, bVar);
            }
            b4.c(fVar, rVarC4, o0VarK);
            r rVarC5 = l.C(aVar5, 0.0f, 0.0f, 12, 0.0f, 11);
            f02.h.f67736a.getClass();
            long jA2 = f02.h.a(o0VarK);
            f02.m.f67741a.getClass();
            g02.i.a(rVarC5, dVar, jA2, f0.d(4290711332L), 40, 0.0f, null, o0VarK, 24582, 224);
            g02.e0.a(str2, str3, str4, null, false, false, false, null, null, null, null, null, o0VarK, ((i16 >> 9) & 1022) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192), 0, 3192);
            o0VarK = o0VarK;
            e5.u(o0VarK, true, true, true);
        } else {
            o0VarK.e();
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(rVar, z14, str, str2, str3, str4, aVar, i14);
        }
    }
}
