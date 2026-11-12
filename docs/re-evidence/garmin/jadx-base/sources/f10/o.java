package f10;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import h4.r;
import h5.e0;
import l72.y2;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class o {
    public static final void a(boolean z14, float f14, final int i14, final int i15, p3.m mVar, final int i16, final int i17) {
        boolean z15;
        int i18;
        o0 o0Var;
        final float f15;
        final boolean z16;
        boolean z17;
        boolean z18;
        o0 o0VarE = mVar.E(-102935115);
        int i19 = i17 & 1;
        if (i19 != 0) {
            i18 = i16 | 6;
            z15 = z14;
        } else if ((i16 & 6) == 0) {
            z15 = z14;
            i18 = i16 | (o0VarE.h(z15) ? 4 : 2);
        } else {
            z15 = z14;
            i18 = i16;
        }
        int i24 = i18 | 16 | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.k(i15) ? 2048 : 1024);
        if (o0VarE.n(i24 & 1, (i24 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                if (i19 != 0) {
                    z15 = true;
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                boolean z19 = z15;
                f15 = j92.b.f97899b.f97920e;
                z17 = z19;
            } else {
                o0VarE.e();
                z17 = z15;
                f15 = f14;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarC = c2.l.C(rVarE, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            if (z17) {
                o0VarE.C(1276417746);
                y2 y2Var = y2.f111386a;
                r rVarF = x2.f(aVar, 1.0f);
                bVar.getClass();
                z18 = true;
                y2Var.a(i15 != 0 ? i14 / i15 : 0.0f, 0.0f, 0, 0, 124, 0L, 0L, c2.l.A(c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), f15, 0.0f, 2), o0VarE);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                z18 = true;
                o0Var.C(1276659267);
                o0Var.g0(false);
            }
            o0Var.g0(z18);
            z16 = z17;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f15 = f14;
            z16 = z15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: f10.n
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o.a(z16, f15, i14, i15, (p3.m) obj, p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
