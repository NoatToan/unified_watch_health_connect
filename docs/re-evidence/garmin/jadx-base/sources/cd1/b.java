package cd1;

import c2.q;
import c2.x2;
import h4.r;
import l4.k;
import o4.m1;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final void a(ad1.b bVar, r rVar, m mVar, int i14) {
        int i15;
        bVar.getClass();
        o0 o0VarE = mVar.E(-29218855);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            rVar = r.S;
            x1 x1Var = n.f135158a;
            q.a(u1.n.e(k.b(x2.q(rVar, bVar.f2766c), bVar.f2767d.f131016a), n5.a.a(o0VarE, bVar.f2768e), m1.f128891a), o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(bVar, rVar, i14, 11);
        }
    }
}
