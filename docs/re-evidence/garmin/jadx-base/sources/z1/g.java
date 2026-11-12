package z1;

import e2.i0;
import p008y1.b2;
import p008y1.t3;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final int a(float f14, g6.c cVar) {
        if (Math.abs(f14) < cVar.s0(s.f200874a)) {
            d.f200826b.getClass();
            return 0;
        }
        if (f14 > 0.0f) {
            d.f200826b.getClass();
            return d.f200827c;
        }
        d.f200826b.getClass();
        return d.f200828d;
    }

    public static final int b(e2.v vVar) {
        return (int) (vVar.getF62556p() == b2.Vertical ? vVar.a() & 4294967295L : vVar.a() >> 32);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    public static final t3 c(i0 i0Var, p3.m mVar) {
        u.a aVar = u.a.f200875a;
        x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(i0Var);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new f(i0Var, aVar);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new f(i0Var, aVar);
                mVar.K(objQ);
            }
        }
        return s.e((t) objQ, mVar);
    }
}
