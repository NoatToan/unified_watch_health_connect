package p43;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {
    public static final f2 a(f2 f2Var, boolean z14) {
        f2Var.getClass();
        w wVarA = w.a.a(w.f135930d, f2Var, z14);
        if (wVarA != null) {
            return wVarA;
        }
        v0 v0VarB = b(f2Var);
        return v0VarB != null ? v0VarB : f2Var.J0(false);
    }

    public static final v0 b(f2 f2Var) {
        m0 m0VarF;
        m1 m1VarF0 = f2Var.F0();
        m0 m0Var = m1VarF0 instanceof m0 ? (m0) m1VarF0 : null;
        if (m0Var != null) {
            LinkedHashSet<n0> linkedHashSet = m0Var.f135886b;
            ArrayList arrayList = new ArrayList(p13.y.r(linkedHashSet, 10));
            boolean z14 = false;
            for (n0 n0VarA : linkedHashSet) {
                if (d2.g(n0VarA)) {
                    n0VarA = a(n0VarA.I0(), false);
                    z14 = true;
                }
                arrayList.add(n0VarA);
            }
            if (z14) {
                n0 n0VarA2 = m0Var.f135885a;
                if (n0VarA2 == null) {
                    n0VarA2 = null;
                } else if (d2.g(n0VarA2)) {
                    n0VarA2 = a(n0VarA2.I0(), false);
                }
                m0VarF = new m0(arrayList).f(n0VarA2);
            } else {
                m0VarF = null;
            }
            if (m0VarF != null) {
                return m0VarF.a();
            }
        }
        return null;
    }

    public static final v0 c(v0 v0Var, v0 v0Var2) {
        v0Var.getClass();
        v0Var2.getClass();
        return o72.t.R(v0Var) ? v0Var : new a(v0Var, v0Var2);
    }
}
