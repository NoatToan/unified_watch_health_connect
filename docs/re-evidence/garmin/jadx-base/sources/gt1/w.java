package gt1;

import c2.t0;
import c2.x2;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class w {
    public static final void a(String str, String str2, String str3, p3.m mVar, int i14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        o0 o0VarE = mVar.E(606144112);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, eVar.f97920e, f14);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97918c;
            jVar.getClass();
            t0.a(rVarZ, c2.j.i(f15), null, null, 0, 0, z3.f.c(-1269970283, new f21.v(str, str2, str3, i16), o0VarE), o0VarE, 1572864, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c81.i(i14, 2, str, str2, str3);
        }
    }
}
