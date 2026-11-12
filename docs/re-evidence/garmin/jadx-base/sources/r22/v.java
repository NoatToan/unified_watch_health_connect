package r22;

import c2.x2;
import i3.mh;
import p3.b4;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class v {
    public static final void a(s sVar, p3.m mVar, int i14) {
        float f14;
        p3.o0 o0VarE = mVar.E(-1201698867);
        int i15 = i14 | (o0VarE.B(sVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (sVar.f149854a == null) {
                o0VarE.C(-889265839);
                o0VarE.g0(false);
                f14 = 1.0f;
            } else {
                o0VarE.C(-889265838);
                String str = sVar.f149854a;
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
                f14 = 1.0f;
            }
            j82.e.h(sVar.f149855b, x2.f(aVar, f14), null, o0VarE, 48, 4);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new t(sVar, i14);
        }
    }
}
