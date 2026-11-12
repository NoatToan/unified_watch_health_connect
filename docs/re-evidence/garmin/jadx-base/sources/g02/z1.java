package g02;

import c2.q2;
import c2.s2;
import c2.u2;
import i3.mh;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class z1 {
    public static final void a(String str, s5.i0 i0Var, String str2, s5.i0 i0Var2, p3.m mVar, int i14) {
        i0Var.getClass();
        i0Var2.getClass();
        p3.o0 o0VarE = mVar.E(-1364168101);
        int i15 = i14 | (o0VarE.B(i0Var) ? 32 : 16) | (o0VarE.B(i0Var2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            s5.c.b bVar2 = new s5.c.b(0, 1, null);
            int iJ = bVar2.j(i0Var);
            try {
                bVar2.b(str.concat(StringUtils.SPACE));
                Unit unit = Unit.INSTANCE;
                bVar2.f(iJ);
                int iJ2 = bVar2.j(i0Var2);
                try {
                    bVar2.b(str2);
                    bVar2.f(iJ2);
                    mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, null, o0VarE, 0, 0, 524286);
                    o0VarE.g0(true);
                } catch (Throwable th3) {
                    bVar2.f(iJ2);
                    throw th3;
                }
            } catch (Throwable th4) {
                bVar2.f(iJ);
                throw th4;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.i(str, i0Var, str2, i0Var2, i14, 28);
        }
    }
}
