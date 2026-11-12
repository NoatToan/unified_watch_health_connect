package wx1;

import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import w51.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class v {
    public static final void a(String str, boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1237247397);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 6;
            og2.k.g(str, aVar2, aVar3, z14, null, z3.f.c(1679223338, new n0(aVar, 12), o0VarE), o0VarE, (i15 & 14) | 196608 | (i16 & 112) | (i16 & 896) | ((i15 << 6) & 7168), 16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug2.p(str, aVar, aVar2, aVar3, z14, i14, 8);
        }
    }
}
