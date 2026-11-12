package f21;

import java.util.List;
import l72.x0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class x {
    public static final void a(List<s21.n> list, g21.c cVar, v21.e eVar, p3.m mVar, int i14) {
        list.getClass();
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(554685428);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        Object obj = cVar;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(obj) ? 32 : 16;
        }
        Object obj2 = eVar;
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(obj2) ? 256 : 128;
        }
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l22.a aVarS = w2.a0.s(o0VarE);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(-1869747699);
            for (List list2 : p13.h0.i1(list, 2, 2, true)) {
                x0 x0Var = x0.f111346a;
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                x0Var.e(c2.l.y(aVar3, j92.b.f97899b.f97920e), z3.f.c(-955023078, new a42.y(list2, obj2, obj, aVarS, 26), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                obj = cVar;
                obj2 = eVar;
                z14 = z14;
            }
            o0VarE.g0(false);
            o0VarE.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(list, cVar, eVar, i14, 28);
        }
    }
}
