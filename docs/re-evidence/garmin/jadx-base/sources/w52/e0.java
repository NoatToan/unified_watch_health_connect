package w52;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {
    public static final void a(c62.x0 x0Var, String str, String str2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(756472324);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            p3.x1 x1Var = p3.n.f135158a;
            b(str, str2, o0VarE, (i15 >> 3) & 126);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t21.l0(x0Var, str, str2, i14, 27);
        }
    }

    public static final void b(String str, String str2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1734079739);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97921f;
            float f15 = eVar2.f97920e;
            h4.r rVarY = c2.l.y(aVar, f14);
            String strP = gl1.y.P(R.string.workout_third_party_edit_details, new Object[]{str == null ? "" : str}, o0VarE);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            int i16 = i15;
            mh.c(strP, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            bVar2.getClass();
            h4.r rVarA = c2.l.A(aVar, f15, 0.0f, 2);
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7);
            String strQ = gl1.y.Q(o0VarE, R.string.activities_activity_source);
            fVar2.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 0, 0, 131068);
            p3.o0 o0Var2 = o0VarE;
            bVar2.getClass();
            h4.r rVarE = u1.n.e(c2.l.y(aVar, f15), p6.b.b(o0Var2), o4.m1.f128891a);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0Var2, 48);
            int iHashCode2 = Long.hashCode(o0Var2.U);
            i2 i2VarA1 = o0Var2.a0();
            h4.r rVarC3 = h4.k.c(rVarE, o0Var2);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0Var2.z();
            if (o0Var2.T) {
                o0Var2.M(aVar2);
            } else {
                o0Var2.c();
            }
            b4.c(eVar, s2VarA, o0Var2);
            b4.c(c1623g, i2VarA1, o0Var2);
            if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0Var2, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0Var2);
            u2 u2Var = u2.f22900a;
            if (g22.n.d(str2)) {
                o0Var2.C(-1568401165);
                bVar2.getClass();
                h4.r rVarC4 = c2.l.C(aVar, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11);
                bVar2.getClass();
                jf.r.b(str2, gl1.y.Q(o0Var2, R.string.default_image_view_content_description), x2.q(rVarC4, j92.b.f97901d.f97907f), n5.c.a(2131231969, o0Var2, 0), null, null, null, null, null, null, null, null, o0Var2, (i16 >> 3) & 14, 0, 32752);
                o0Var2 = o0Var2;
                o0Var2.g0(false);
            } else {
                o0Var2.C(-1567983657);
                o0Var2.g0(false);
            }
            p3.o0 o0Var3 = o0Var2;
            l72.p2.f111205a.h(str == null ? "" : str, gl1.y.Q(o0Var2, R.string.activities_third_party_app), null, null, null, false, false, null, null, null, null, o0Var3, 0, 0, 2044);
            o0Var = o0Var3;
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l71.e(i14, 2, (byte) 0, str, str2);
        }
    }
}
