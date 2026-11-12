package u1;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.a0 f167682a = new p3.a0(new tn2.n0(29));

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    public static final r1 a(p3.m mVar) {
        mVar.C(282942128);
        p3.x1 x1Var = p3.n.f135158a;
        s1 s1Var = (s1) mVar.A(f167682a);
        if (s1Var == null) {
            mVar.f();
            return null;
        }
        boolean zB = mVar.B(s1Var);
        Object objQ = mVar.q();
        if (zB) {
            objQ = s1Var.a();
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = s1Var.a();
                mVar.K(objQ);
            }
        }
        r1 r1Var = (r1) objQ;
        mVar.f();
        return r1Var;
    }
}
