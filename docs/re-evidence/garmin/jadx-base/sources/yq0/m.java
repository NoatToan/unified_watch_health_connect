package yq0;

import c2.t0;
import h4.r;
import java.util.List;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import vd0.s0;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    public static final void a(r rVar, tq0.e eVar, List<tq0.e> list, e23.l<? super tq0.e, Unit> lVar, p3.m mVar, int i14) {
        rVar.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-304513555);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(eVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            t0.a(rVar, null, null, null, 0, 0, z3.f.c(2004706002, new s0(list, 21, eVar, lVar), o0VarE), o0VarE, (i15 & 14) | 1572864, 62);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(rVar, eVar, list, lVar, i14, 14);
        }
    }
}
