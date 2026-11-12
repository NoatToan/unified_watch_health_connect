package wv0;

import c2.b0;
import c2.x2;
import c2.z;
import h5.e0;
import i3.mh;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class y {
    public static final void a(String str, String str2, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 364609058);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarK.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarK.B(str2) ? 32 : 16;
        }
        int i16 = i15;
        if (o0VarK.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVarF, 0.0f, f14, 0.0f, eVar.f97920e, 5);
            bVar.getClass();
            h4.r rVarA = c2.l.A(rVarC, eVar.f97920e, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(cVar, h4.d.a.f81537o, o0VarK, 54);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarK);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarK.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarK);
            b0 b0Var = b0.f22601a;
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarK);
            d6.h.f57752b.getClass();
            int i17 = d6.h.f57755e;
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, o0VarK, i16 & 14, 0, 130046);
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            long jD = d92.b.a(o0VarK).k().d();
            bVar.getClass();
            mh.c(str2, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), jD, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0Var, o0VarK, (i16 >> 3) & 14, 0, 130040);
            o0Var = o0VarK;
            o0Var.g0(true);
        } else {
            o0Var = o0VarK;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l71.e(i14, 4, (byte) 0, str, str2);
        }
    }
}
