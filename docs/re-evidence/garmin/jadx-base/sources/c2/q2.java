package c2;

/* JADX INFO: loaded from: classes.dex */
public final class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2 f22847a;

    static {
        j.f22691a.getClass();
        j.C0343j c0343j = j.f22692b;
        h4.d.f81522a.getClass();
        f22847a = new s2(c0343j, h4.d.a.f81533k);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    public static final s2 a(j.e eVar, h4.d.c cVar, p3.m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        j.f22691a.getClass();
        if (p005kotlin.jvm.internal.s.g(eVar, j.f22692b)) {
            h4.d.f81522a.getClass();
            if (p005kotlin.jvm.internal.s.g(cVar, h4.d.a.f81533k)) {
                mVar.C(-1073830487);
                mVar.f();
                return f22847a;
            }
        }
        mVar.C(-1073779616);
        boolean z14 = ((((i14 & 14) ^ 6) > 4 && mVar.B(eVar)) || (i14 & 6) == 4) | ((((i14 & 112) ^ 48) > 32 && mVar.B(cVar)) || (i14 & 48) == 32);
        Object objQ = mVar.q();
        if (z14) {
            objQ = new s2(eVar, cVar);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new s2(eVar, cVar);
                mVar.K(objQ);
            }
        }
        s2 s2Var = (s2) objQ;
        mVar.f();
        return s2Var;
    }
}
