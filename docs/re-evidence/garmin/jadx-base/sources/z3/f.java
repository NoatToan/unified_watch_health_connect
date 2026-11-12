package z3;

import p005kotlin.jvm.internal.s;
import p3.o2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f202098a = new Object();

    public static final int a(int i14, int i15) {
        return i14 << (((i15 % 10) * 3) + 1);
    }

    public static final e b(int i14, o13.h hVar, p3.m mVar) {
        e eVar;
        mVar.N(Integer.rotateLeft(i14, 1), f202098a);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            eVar = new e(i14, true, hVar);
            mVar.K(eVar);
        } else {
            objQ.getClass();
            eVar = (e) objQ;
            eVar.i(hVar);
        }
        mVar.Q();
        return eVar;
    }

    public static final e c(int i14, o13.h hVar, p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            objQ = new e(i14, true, hVar);
            mVar.K(objQ);
        }
        e eVar = (e) objQ;
        eVar.i(hVar);
        return eVar;
    }

    public static final boolean d(o2 o2Var, o2 o2Var2) {
        if (o2Var == null) {
            return true;
        }
        if (!(o2Var instanceof p2) || !(o2Var2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) o2Var;
        return !p2Var.b() || o2Var.equals(o2Var2) || s.g(p2Var.f135218c, ((p2) o2Var2).f135218c);
    }
}
