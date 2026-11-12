package p3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f135148a = new i0();

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    public static final void a(Object obj, e23.l lVar, m mVar) {
        x1 x1Var = n.f135158a;
        boolean zB = mVar.B(obj);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new g0(lVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new g0(lVar);
                mVar.K(objQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001a  */
    public static final void b(Object obj, Object obj2, e23.l lVar, m mVar) {
        x1 x1Var = n.f135158a;
        boolean zB = mVar.B(obj) | mVar.B(obj2);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new g0(lVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new g0(lVar);
                mVar.K(objQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001f  */
    public static final void c(Object obj, Object obj2, Object obj3, e23.l lVar, m mVar) {
        x1 x1Var = n.f135158a;
        boolean zB = mVar.B(obj) | mVar.B(obj2) | mVar.B(obj3);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new g0(lVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new g0(lVar);
                mVar.K(objQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public static final void d(Object[] objArr, e23.l lVar, m mVar) {
        x1 x1Var = n.f135158a;
        boolean zB = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zB |= mVar.B(obj);
        }
        Object objQ = mVar.q();
        if (zB) {
            mVar.K(new g0(lVar));
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                mVar.K(new g0(lVar));
            }
        }
        x1 x1Var2 = n.f135158a;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    public static final void e(e23.p pVar, Object obj, m mVar) {
        x1 x1Var = n.f135158a;
        t13.g s8 = mVar.getS();
        boolean zB = mVar.B(obj);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new b1(s8, pVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new b1(s8, pVar);
                mVar.K(objQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    public static final void f(Object obj, Object obj2, e23.p pVar, m mVar) {
        x1 x1Var = n.f135158a;
        t13.g s8 = mVar.getS();
        boolean zB = mVar.B(obj) | mVar.B(obj2);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new b1(s8, pVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new b1(s8, pVar);
                mVar.K(objQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0023  */
    public static final void g(Object obj, Object obj2, Object obj3, e23.p pVar, m mVar) {
        x1 x1Var = n.f135158a;
        t13.g s8 = mVar.getS();
        boolean zB = mVar.B(obj) | mVar.B(obj2) | mVar.B(obj3);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new b1(s8, pVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new b1(s8, pVar);
                mVar.K(objQ);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    public static final void h(Object[] objArr, e23.p pVar, m mVar) {
        x1 x1Var = n.f135158a;
        t13.g s8 = mVar.getS();
        boolean zB = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zB |= mVar.B(obj);
        }
        Object objQ = mVar.q();
        if (zB) {
            mVar.K(new b1(s8, pVar));
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                mVar.K(new b1(s8, pVar));
            }
        }
        x1 x1Var2 = n.f135158a;
    }

    public static final void i(e23.a aVar, m mVar) {
        x1 x1Var = n.f135158a;
        mVar.J(aVar);
    }

    public static final o53.b0 j(t13.g gVar, m mVar) {
        if (gVar.get(o53.l1.f129368i0) == null) {
            return new a3(mVar.getS(), gVar);
        }
        o53.m1 m1VarC = g8.i.c();
        m1VarC.g0(new o53.v(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false, 2, null));
        return o53.c0.a(m1VarC);
    }
}
