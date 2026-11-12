package g02;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 {
    public static final void a(long j8, String str, float f14, String str2, p3.m mVar, int i14) {
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -1913029150);
        p3.c<?> cVar = o0VarK.f135177b;
        int i15 = i14 | (o0VarK.l(j8) ? 4 : 2) | (o0VarK.B(str) ? 32 : 16) | (o0VarK.i(f14) ? 256 : 128) | (o0VarK.B(str2) ? 2048 : 1024);
        if (o0VarK.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarK);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarK);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarK, 0);
            int iHashCode2 = Long.hashCode(o0VarK.U);
            i2 i2VarA1 = o0VarK.a0();
            h4.r rVarC2 = h4.k.c(rVarF, o0VarK);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar, s2VarA, o0VarK);
            b4.c(c1623g, i2VarA1, o0VarK);
            if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarK);
            u2 u2Var = u2.f22900a;
            h4.r rVarA = u2Var.a(aVar, 1.0f, true);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarH = x2.h(rVarA, eVar2.f97918c);
            bVar2.getClass();
            f1.j(u2Var.c(c2.l.C(rVarH, eVar2.f97920e, 0.0f, 0.0f, 0.0f, 14), h4.d.a.f81534l), R.color.gcm_surface_3, false, j8, f14, 0.0f, 0.0f, o0VarK, ((i15 << 9) & 7168) | (57344 & (i15 << 6)), 100);
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarU = x2.u(aVar, 60);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57758h;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97933j;
            mh.c(str2, rVarU, com.nimbusds.jose.shaded.gson.internal.a.d(o0VarK), null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarK, ((i15 >> 9) & 14) | 48, 0, 130040);
            bVar2.getClass();
            h4.r rVarU2 = x2.u(c2.l.C(aVar, 0.0f, 0.0f, eVar2.f97920e, 0.0f, 11), 50);
            fVar2.getClass();
            mh.c(str, rVarU2, d92.b.a(o0VarK).k().d(), null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0VarK, (i15 >> 3) & 14, 0, 130040);
            o0VarK = o0VarK;
            o0VarK.g0(true);
            o0VarK.g0(true);
        } else {
            o0VarK.e();
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m0(j8, str, f14, str2, i14);
        }
    }
}
