package s1;

import s1.n0.a;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public static final n0.a a(n0 n0Var, float f14, float f15, m0 m0Var, String str, p3.m mVar, int i14, int i15) {
        if ((i15 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        p3.x1 x1Var = p3.n.f135158a;
        Float fValueOf = Float.valueOf(f14);
        Float fValueOf2 = Float.valueOf(f15);
        p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
        return b(n0Var, fValueOf, fValueOf2, e2.f155568a, m0Var, str2, mVar, 33208 | ((i14 << 3) & 458752), 0);
    }

    public static final n0.a b(n0 n0Var, Object obj, Object obj2, c2 c2Var, m0 m0Var, String str, p3.m mVar, int i14, int i15) {
        n0 n0Var2;
        Object obj3;
        if ((i15 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            n0Var2 = n0Var;
            n0.a aVar = n0Var2.new a(obj, obj2, c2Var, m0Var, str2);
            obj3 = obj2;
            mVar.K(aVar);
            objQ = aVar;
        } else {
            n0Var2 = n0Var;
            obj3 = obj2;
        }
        n0.a aVar2 = (n0.a) objQ;
        boolean z14 = true;
        boolean z15 = ((((i14 & 112) ^ 48) > 32 && mVar.r(obj)) || (i14 & 48) == 32) | ((((i14 & 896) ^ 384) > 256 && mVar.r(obj3)) || (i14 & 384) == 256);
        if ((((57344 & i14) ^ 24576) <= 16384 || !mVar.r(m0Var)) && (i14 & 24576) != 16384) {
            z14 = false;
        }
        boolean z16 = z15 | z14;
        Object objQ2 = mVar.q();
        if (z16 || objQ2 == c2565a) {
            ok0.d dVar = new ok0.d(obj, aVar2, obj3, m0Var, 17);
            mVar.K(dVar);
            objQ2 = dVar;
        }
        p3.l0.i((e23.a) objQ2, mVar);
        boolean zR = mVar.r(n0Var2);
        Object objQ3 = mVar.q();
        if (zR || objQ3 == c2565a) {
            objQ3 = new rk0.g(10, n0Var2, aVar2);
            mVar.K(objQ3);
        }
        p3.l0.a(aVar2, (e23.l) objQ3, mVar);
        return aVar2;
    }

    public static final n0 c(String str, p3.m mVar, int i14) {
        if ((i14 & 1) != 0) {
            str = "InfiniteTransition";
        }
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            objQ = new n0(str);
            mVar.K(objQ);
        }
        n0 n0Var = (n0) objQ;
        n0Var.a(mVar, 0);
        return n0Var;
    }
}
