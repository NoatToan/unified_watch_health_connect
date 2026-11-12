package ur;

import ds.y;
import hs.g;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import qr.t;
import s9.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(t tVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1332309323);
        int i15 = (o0VarE.r(tVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            g.a(((nr.t.c) c.c(tVar.O1, o0VarE).getF182175a()).f127328a, tVar, o0VarE, (i15 << 3) & 112);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y(tVar, i14, 4);
        }
    }
}
