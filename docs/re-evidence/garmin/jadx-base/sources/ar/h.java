package ar;

import am.z0;
import c22.b2;
import ps.x0;
import qs.t;
import zm.p;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private h() {
    }

    public static qs.f a(x0 x0Var) {
        if (x0Var != null) {
            return b(x0Var) == t.REST ? qs.f.NULL : x0Var.q0();
        }
        return null;
    }

    public static t b(x0 x0Var) {
        t tVar = t.UNKNOWN;
        if (x0Var != null) {
            if (x0Var.getDistance() != null && x0Var.getDistance().doubleValue() == 0.0d) {
                return t.REST;
            }
            t tVarO3 = x0Var.o3();
            if (x0Var.E3() || tVarO3 != t.DRILL || x0Var.q0() != qs.f.KICK) {
                return tVarO3;
            }
        }
        return tVar;
    }

    public static boolean c(am.x0 x0Var, double d14) {
        if (x0Var != am.x0.f4313o1) {
            return x0Var == am.x0.f4324r && b2.a(Double.valueOf(d14)) && d14 > 0.0d;
        }
        return true;
    }

    public static boolean d(p pVar) {
        if (pVar == null) {
            return false;
        }
        String strU = pVar.U();
        int iG1 = pVar.g1();
        if ((iG1 != 1 && iG1 != 68) || strU == null) {
            return false;
        }
        z0 z0Var = z0.f4390a;
        return z0.b(am.x0.f4313o1, strU);
    }
}
