package kotlin;

import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final class z3 {
    public static final y3 a(a aVar, b0 b0Var) {
        if (b0Var.getF7973d().compareTo(b0.b.DESTROYED) <= 0) {
            l2.l(aVar, " to disposeComposition at Lifecycle ON_DESTROY: ", b0Var, "is already destroyed", "Cannot configure ");
            return null;
        }
        a0 a0Var = new a0(aVar, 4);
        b0Var.a(a0Var);
        return new y3(b0Var, a0Var);
    }
}
