package hw1;

import c2.u;
import c2.x2;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import l4.k;
import o4.r1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.q;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(r rVar, final boolean z14, float f14, long j8, r1 r1Var, final z3.e eVar, m mVar, final int i14) {
        final r rVar2;
        final float f15;
        final long j14;
        final r1 r1Var2;
        float f16;
        long jB;
        r1 r1VarA;
        int i15;
        o0 o0VarE = mVar.E(1009916122);
        int i16 = i14 | 6;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i17 = i16 | 384;
        if ((i14 & 3072) == 0) {
            i17 = i16 | 1408;
        }
        if ((i14 & 24576) == 0) {
            i17 |= 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= o0VarE.r(eVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar2 = r.S;
                f16 = 1;
                g6.f.a aVar = g6.f.f75994b;
                d92.b bVar = d92.b.f58623a;
                bVar.getClass();
                jB = d92.b.a(o0VarE).k().b();
                bVar.getClass();
                d92.b.f58625c.getClass();
                r1VarA = k2.i.a(j92.b.f97899b.f97918c);
                i15 = i17 & (-64513);
            } else {
                o0VarE.e();
                f16 = f14;
                jB = j8;
                r1VarA = r1Var;
                i15 = i17 & (-64513);
                rVar2 = rVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar2, 1.0f);
            if (z14) {
                rVarF = k.b(q.b(f16, jB, rVarF, r1VarA), r1VarA);
            }
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            eVar.invoke(u.f22885a, o0VarE, Integer.valueOf(((i15 >> 12) & 112) | 6));
            o0VarE.g0(true);
            f15 = f16;
            r1Var2 = r1VarA;
            j14 = jB;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            f15 = f14;
            j14 = j8;
            r1Var2 = r1Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: hw1.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.a(rVar2, z14, f15, j14, r1Var2, eVar, (m) obj, p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
