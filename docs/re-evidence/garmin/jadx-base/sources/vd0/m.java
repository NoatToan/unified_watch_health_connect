package vd0;

import android.net.Uri;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(oe0.d dVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1152887590);
        int i15 = (o0VarE.r(dVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Uri uri = ((pe0.c) s9.c.c(dVar.f131262g, o0VarE).getF182175a()).f137415j;
            boolean z14 = (i15 & 14) == 4 || o0VarE.r(dVar);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(dVar, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(dVar, 1);
                    o0VarE.K(objQ);
                }
            }
            int i16 = i15 << 3;
            c1.a(uri, null, aVar, aVar2, (e23.l) objQ, false, o0VarE, (i16 & 896) | 48 | (i16 & 7168), 32);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(dVar, aVar, aVar2, i14, 23);
        }
    }
}
