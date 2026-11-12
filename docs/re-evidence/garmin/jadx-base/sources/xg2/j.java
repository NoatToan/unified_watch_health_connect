package xg2;

import c2.l;
import c2.x2;
import h4.r;
import java.util.List;
import java.util.Map;
import l72.x0;
import o4.m1;
import p13.h0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import rv1.q;

/* JADX INFO: loaded from: classes11.dex */
public final class j {
    public static final void a(Map<ag2.c.a, String> map, m mVar, int i14) {
        o0 o0VarE = mVar.E(145379937);
        int i15 = (o0VarE.r(map) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (map.isEmpty()) {
                o0VarE.C(1687881025);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1686803744);
                for (List list : h0.Q(h0.b1(map.entrySet()), 2)) {
                    x0 x0Var = x0.f111346a;
                    r rVarE = u1.n.e(x2.f(r.S, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarA = l.A(rVarE, eVar.f97920e, 0.0f, 2);
                    bVar.getClass();
                    float f14 = eVar.f97920e;
                    bVar.getClass();
                    float f15 = eVar.f97919d;
                    bVar.getClass();
                    x0Var.e(l.C(rVarA, 0.0f, f15, f14, eVar.f97918c, 1), z3.f.c(-1340032254, new a31.a(list, 13), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
                }
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(map, i14, 3);
        }
    }
}
