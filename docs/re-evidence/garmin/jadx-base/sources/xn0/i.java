package xn0;

import c2.q;
import c2.u;
import c2.x2;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import hz0.w;
import kotlin.t1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import z72.l;

/* JADX INFO: loaded from: classes8.dex */
public final class i {
    public static final void a(i53.c<l> cVar, float f14, String str, String str2, m mVar, int i14) {
        float f15;
        cVar.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(-1397143625);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.i(f14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = c2.l.A(rVarF, eVar.f97920e, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            z0 z0VarD = q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
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
            u uVar = u.f22885a;
            y3 y3Var = t1.f91490h;
            float f75992b = ((g6.c) o0VarE.A(y3Var)).getF75992b();
            float f16 = 175.0f;
            if (f75992b > 1.0f) {
                f16 = 175.0f * f75992b;
                g6.f.a aVar3 = g6.f.f75994b;
            } else {
                g6.f.a aVar4 = g6.f.f75994b;
            }
            r rVarH = x2.h(aVar, f16);
            bVar.getClass();
            r rVarC2 = uVar.c(c2.l.C(rVarH, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), gVar);
            Float fValueOf = Float.valueOf(f14);
            float f75992b2 = ((g6.c) o0VarE.A(y3Var)).getF75992b();
            if (f75992b2 <= 1.0f || f75992b2 > 1.5f) {
                f15 = f75992b2 > 1.5f ? 14.0f : 10.0f;
            } else {
                f15 = 12.0f;
            }
            int i16 = i15 << 3;
            z72.k.a(rVarC2, cVar, fValueOf, null, null, f15, 2.0f, false, false, z3.f.c(948414269, new c40.i(str, str2, 14), o0VarE), o0VarE, (i16 & 896) | (i16 & 112) | 806879232, 408);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w(cVar, f14, str, str2, i14, 7);
        }
    }
}
