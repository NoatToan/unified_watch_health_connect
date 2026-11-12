package m33;

import java.util.List;
import lc.u0;
import p43.c0;
import p43.d0;
import p43.d2;
import p43.g2;
import p43.n0;
import p43.s1;
import p43.t1;
import p43.v1;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends c0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116442a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116442a = iArr;
        }
    }

    @Override // p43.c0
    public final t1 a(d1 d1Var, d0 d0Var, s1 s1Var, n0 n0Var) {
        d0Var.getClass();
        s1Var.getClass();
        if (!(d0Var instanceof m33.a)) {
            return super.a(d1Var, d0Var, s1Var, n0Var);
        }
        m33.a aVarF = (m33.a) d0Var;
        if (!aVarF.f116424f) {
            aVarF = aVarF.f(b.INFLEXIBLE);
        }
        int i14 = a.f116442a[aVarF.f116423e.ordinal()];
        if (i14 == 1) {
            return new v1(g2.INVARIANT, n0Var);
        }
        if (i14 != 2 && i14 != 3) {
            u0.r();
            return null;
        }
        if (!d1Var.m().f135848b) {
            return new v1(g2.INVARIANT, f43.e.e(d1Var).o());
        }
        List<d1> parameters = n0Var.F0().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new v1(g2.OUT_VARIANCE, n0Var) : d2.m(d1Var, aVarF);
    }
}
