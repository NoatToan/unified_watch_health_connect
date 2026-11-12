package nc1;

import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import dc1.f;
import e23.l;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import o4.m1;
import org.joda.time.DateTime;
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
import tn.k;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(f fVar, DateTime dateTime, DateTime dateTime2, l<? super DateTime, Unit> lVar, m mVar, int i14) {
        List<dc1.c> list;
        Double d14;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1342011988);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
            i53.c cVarE = null;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            c.a(fVar, dateTime, dateTime2, o0VarE, i15 & 1022);
            b.a((fVar == null || (d14 = fVar.f59149c) == null) ? 0.0d : d14.doubleValue(), o0VarE, 0);
            if (fVar != null && (list = fVar.f59148b) != null) {
                cVarE = i53.a.e(list);
            }
            d.a(cVarE, dateTime, dateTime2, lVar, o0VarE, i15 & 8176);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) fVar, (Object) dateTime, (Object) dateTime2, (l) lVar, i14, 2);
        }
    }
}
