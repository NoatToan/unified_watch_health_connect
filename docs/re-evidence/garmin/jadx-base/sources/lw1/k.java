package lw1;

import ak0.o;
import c2.c3;
import c2.j0;
import gt1.t;
import i3.d0;
import i3.fe;
import i3.hb;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static final void a(String str, fe feVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        fe feVar2;
        feVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1037472737);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            hb.f88319a.getClass();
            c3 c3VarA = hb.a(o0VarE);
            d0.f87812a.getClass();
            feVar2 = feVar;
            z02.d.a(false, z3.f.c(-442540700, new ll1.g(aVar3, 3), o0VarE), z3.f.c(1067481125, new o(feVar2, 27), o0VarE), null, new j0(c3VarA, d0.a(o0VarE)), z3.f.c(1302579304, new t(str, aVar, aVar2), o0VarE), o0VarE, 197040, 9);
        } else {
            feVar2 = feVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(str, feVar2, aVar, aVar2, aVar3, i14, 20);
        }
    }
}
