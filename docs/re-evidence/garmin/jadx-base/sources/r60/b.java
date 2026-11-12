package r60;

import a42.a0;
import b82.i;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j21.p;
import j92.f;
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
import p5.v;
import s5.x0;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    public static final void a(int i14, int i15, e23.a aVar, String str, String str2, String str3, String str4, m mVar) {
        o0 o0Var;
        boolean z14;
        long jB;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str3, mVar, -406688228);
        int i16 = (o0VarK.B(str) ? 4 : 2) | i15;
        if ((i15 & 48) == 0) {
            i16 |= o0VarK.B(str2) ? 32 : 16;
        }
        int i17 = i16 | (o0VarK.B(str3) ? 256 : 128);
        if ((i15 & 3072) == 0) {
            i17 |= o0VarK.B(str4) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarK.k(i14) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i17 |= o0VarK.r(aVar) ? 131072 : 65536;
        }
        if (o0VarK.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarK, R.string.msg_no_data_available);
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.f(v2.b(v2.a(aVar2, str4 == null && str2 == null, new p(strQ, 18), o0VarK, 6), aVar, new i(23), o0VarK, (i17 >> 12) & 112), 1.0f), n5.a.a(o0VarK, i14 % 2 == 1 ? R.color.gcm_table_row_even : R.color.gcm_table_row_odd), m1.f128891a);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVarE, j92.b.f97899b.f97920e);
            h4.d.f81522a.getClass();
            g.b bVar = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar, o0VarK, 48);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            r rVarC = k.c(rVarY, o0VarK);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarK.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar3);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarK.T || !s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarK, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarK);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar2, 0.5f, true);
            boolean z15 = (i17 & 112) == 32;
            Object objQ = o0VarK.q();
            m.a aVar4 = m.f135153a;
            if (z15) {
                objQ = new o60.b(str2, 18);
                o0VarK.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new o60.b(str2, 18);
                    o0VarK.K(objQ);
                }
            }
            r rVarB = v.b(rVarA, (e23.l) objQ);
            f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = f.f97932i;
            mh.c(str, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarK), o0VarK, i17 & 14, 0, 131068);
            r rVarA2 = u2Var.a(aVar2, 0.5f, true);
            boolean z16 = (i17 & 7168) == 2048;
            Object objQ2 = o0VarK.q();
            if (z16) {
                objQ2 = new o60.b(str4, 19);
                o0VarK.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new o60.b(str4, 19);
                    o0VarK.K(objQ2);
                }
            }
            r rVarB2 = v.b(rVarA2, (e23.l) objQ2);
            fVar.getClass();
            if (str3.equals(y.Q(o0VarK, R.string.no_value))) {
                z14 = false;
                o0VarK.C(52987391);
                jB = d92.b.a(o0VarK).k().b();
            } else {
                o0VarK.C(52986494);
                jB = d92.b.a(o0VarK).k().a();
                z14 = false;
            }
            o0VarK.g0(z14);
            mh.c(str3, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, jB, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarK, (i17 >> 6) & 14, 0, 131068);
            o0Var = o0VarK;
            o0Var.g0(true);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(str, str2, str3, str4, i14, aVar, i15, 24);
        }
    }
}
