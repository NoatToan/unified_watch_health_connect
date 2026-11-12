package u1;

/* JADX INFO: loaded from: classes.dex */
public final class a2 {
    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    public static final d2 a(p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        Object[] objArr = new Object[0];
        d2.f167431j.getClass();
        d4.l lVar = d2.f167432k;
        boolean zK = mVar.k(0);
        Object objQ = mVar.q();
        if (zK) {
            objQ = new p1(1);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new p1(1);
                mVar.K(objQ);
            }
        }
        return (d2) d4.a.c(objArr, lVar, (e23.a) objQ, mVar, 0);
    }

    public static h4.r b(h4.r rVar, d2 d2Var, boolean z14) {
        p008y1.b2 b2Var = z14 ? p008y1.b2.Vertical : p008y1.b2.Horizontal;
        a2.k kVar = d2Var.f167436d;
        float f14 = a0.f167346a;
        return rVar.then(b2Var == p008y1.b2.Vertical ? l4.k.b(h4.r.S, j2.f167578a) : l4.k.b(h4.r.S, s0.f167677a)).then(new e2(d2Var, b2Var, true, false, null, kVar, null, true, null)).then(new g2(d2Var, false, z14));
    }
}
