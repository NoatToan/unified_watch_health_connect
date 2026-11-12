package v40;

import c22.x0;
import e23.l;
import l72.r1;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final void a(boolean z14, boolean z15, boolean z16, l<? super Boolean, Unit> lVar, l<? super Boolean, Unit> lVar2, l<? super Boolean, Unit> lVar3, m mVar, int i14) {
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(2138817375);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.h(z16) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192) | (o0VarE.r(lVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            x0.f23314a.getClass();
            r1.b(gl1.d.W(x0.f23345bc), z3.f.c(-1139197788, new f(lVar, z14, lVar3, z16, lVar2, z15), o0VarE), o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(z14, z15, z16, lVar, lVar2, lVar3, i14);
        }
    }
}
