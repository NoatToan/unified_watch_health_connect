package z1;

import h2.j0;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final float a(j0 j0Var) {
        return j0Var.n().getF80848e() == b2.Horizontal ? Float.intBitsToFloat((int) (j0Var.r() >> 32)) : Float.intBitsToFloat((int) (j0Var.r() & 4294967295L));
    }

    public static final boolean b(j0 j0Var, float f14) {
        boolean f80851h = j0Var.n().getF80851h();
        boolean z14 = (j0Var.s() ? -f14 : a(j0Var)) > 0.0f;
        return (z14 && f80851h) || !(z14 || f80851h);
    }
}
