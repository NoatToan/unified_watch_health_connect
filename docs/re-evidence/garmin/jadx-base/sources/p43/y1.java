package p43;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y1 {
    public static final v0 a(n0 n0Var) {
        n0Var.getClass();
        f2 f2VarI0 = n0Var.I0();
        v0 v0Var = f2VarI0 instanceof v0 ? (v0) f2VarI0 : null;
        if (v0Var != null) {
            return v0Var;
        }
        ds.e0.t(n0Var, "This is should be simple type: ");
        return null;
    }

    public static final v0 b(v0 v0Var, List<? extends t1> list, k1 k1Var) {
        v0Var.getClass();
        list.getClass();
        k1Var.getClass();
        if (list.isEmpty() && k1Var == v0Var.E0()) {
            return v0Var;
        }
        if (list.isEmpty()) {
            return v0Var.L0(k1Var);
        }
        if (!(v0Var instanceof r43.i)) {
            return q0.e(k1Var, v0Var.F0(), list, v0Var.G0(), null);
        }
        r43.i iVar = (r43.i) v0Var;
        m1 m1Var = iVar.f150354b;
        i43.l lVar = iVar.f150355c;
        r43.k kVar = iVar.f150356d;
        boolean z14 = iVar.f150358f;
        String[] strArr = iVar.f150359g;
        return new r43.i(m1Var, lVar, kVar, list, z14, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static n0 c(n0 n0Var, List list, u23.h hVar, int i14) {
        if ((i14 & 2) != 0) {
            hVar = n0Var.getAnnotations();
        }
        n0Var.getClass();
        hVar.getClass();
        if ((list.isEmpty() || list == n0Var.D0()) && hVar == n0Var.getAnnotations()) {
            return n0Var;
        }
        k1 k1VarE0 = n0Var.E0();
        if ((hVar instanceof u23.o) && ((u23.o) hVar).isEmpty()) {
            u23.h.f168226x0.getClass();
            hVar = u23.h.a.f168228b;
        }
        k1 k1VarR = oe2.f.R(k1VarE0, hVar);
        f2 f2VarI0 = n0Var.I0();
        if (f2VarI0 instanceof f0) {
            f0 f0Var = (f0) f2VarI0;
            return q0.b(b(f0Var.f135829b, list, k1VarR), b(f0Var.f135830c, list, k1VarR));
        }
        if (f2VarI0 instanceof v0) {
            return b((v0) f2VarI0, list, k1VarR);
        }
        lc.u0.r();
        return null;
    }

    public static /* synthetic */ v0 d(v0 v0Var, List list, k1 k1Var, int i14) {
        if ((i14 & 1) != 0) {
            list = v0Var.D0();
        }
        if ((i14 & 2) != 0) {
            k1Var = v0Var.E0();
        }
        return b(v0Var, list, k1Var);
    }
}
