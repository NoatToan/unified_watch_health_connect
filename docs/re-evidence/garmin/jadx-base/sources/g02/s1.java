package g02;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import i3.i7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class s1 {
    public static final void a(final String str, final s5.x0 x0Var, final int i14, final o4.d0 d0Var, float f14, float f15, h4.r rVar, p3.m mVar, final int i15, final int i16) {
        float f16;
        int i17;
        final h4.r rVar2;
        final float f17;
        final float f18;
        long j8;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-491615878);
        int i18 = (o0VarE.B(str) ? 4 : 2) | i15 | (o0VarE.B(x0Var) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128);
        if ((i15 & 3072) == 0) {
            i18 |= o0VarE.B(d0Var) ? 2048 : 1024;
        }
        int i19 = i16 & 16;
        if (i19 != 0) {
            i17 = i18 | 24576;
            f16 = f14;
        } else {
            f16 = f14;
            i17 = i18 | (o0VarE.i(f16) ? 16384 : 8192);
        }
        int i24 = i17 | 14352384;
        if (o0VarE.n(i24 & 1, (4793491 & i24) != 4793490)) {
            if (i19 != 0) {
                g6.f.a aVar = g6.f.f75994b;
                f16 = 8;
            }
            float f19 = 8;
            g6.f.a aVar2 = g6.f.f75994b;
            rVar2 = h4.r.S;
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            t4.d dVarA = n5.c.a(i14, o0VarE, (i24 >> 6) & 14);
            if (d0Var != null) {
                j8 = d0Var.f128833a;
            } else {
                o4.d0.f128823b.getClass();
                j8 = o4.d0.f128832k;
            }
            i7.a(dVarA, null, x2.q(rVar2, f16), j8, o0VarE, 48, 0);
            c2.l.f(x2.u(rVar2, f19), o0VarE);
            c.a(str, null, 0L, null, 0, false, 0, x0Var, 0.0d, o0VarE, (i24 & 14) | ((i24 << 18) & 29360128), 382);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            float f22 = f16;
            f18 = f19;
            f17 = f22;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            f17 = f16;
            f18 = f15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: g02.r1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s1.a(str, x0Var, i14, d0Var, f17, f18, rVar2, (p3.m) obj, p3.p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
