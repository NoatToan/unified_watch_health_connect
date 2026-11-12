package q43;

import p43.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {
    public static final String a(m1 m1Var) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("type: " + m1Var);
        sb3.append('\n');
        sb3.append("hashCode: " + m1Var.hashCode());
        sb3.append('\n');
        sb3.append("javaClass: " + m1Var.getClass().getCanonicalName());
        sb3.append('\n');
        for (t23.l lVarT = m1Var.t(); lVarT != null; lVarT = lVarT.d()) {
            sb3.append("fqName: ".concat(a43.n.f1164b.y(lVarT)));
            sb3.append('\n');
            sb3.append("javaClass: " + lVarT.getClass().getCanonicalName());
            sb3.append('\n');
        }
        return sb3.toString();
    }
}
