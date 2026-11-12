package wv0;

import c2.b0;
import c2.t0;
import c2.z;
import h5.e0;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public static final void a(String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        String str3;
        int i16;
        String str4;
        String str5;
        boolean z14;
        o0 o0VarE = mVar.E(-111447168);
        int i17 = 2;
        int i18 = i14 | (o0VarE.B(str) ? 4 : 2);
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 = i18 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i16 = i18 | (o0VarE.B(str3) ? 32 : 16);
        }
        int i24 = i16 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i24 & 1, (i24 & 147) != 146)) {
            String str6 = i19 != 0 ? null : str3;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.f fVar = c2.j.f22699i;
            h4.r.a aVar2 = h4.r.S;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(fVar, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String str7 = str6;
            t0.a(null, null, null, h4.d.a.f81534l, 0, 0, z3.f.c(769535643, new kh0.t(str6, i17, str, aVar), o0VarE), o0VarE, 1575936, 55);
            if (str7 != null) {
                o0VarE.C(-2012539725);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                str5 = str7;
                z14 = true;
                mh.c(str5, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, (i24 >> 3) & 14, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                str5 = str7;
                z14 = true;
                o0VarE.C(-2012352020);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
            str4 = str5;
        } else {
            o0VarE.e();
            str4 = str3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.d(str, str4, aVar, i14, i15, 3);
        }
    }
}
