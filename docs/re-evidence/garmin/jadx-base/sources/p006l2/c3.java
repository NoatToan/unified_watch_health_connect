package p006l2;

import f5.v1;
import n4.d;
import p008y1.b2;
import x5.q0;

/* JADX INFO: loaded from: classes.dex */
public final class c3 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108431a;

        static {
            int[] iArr = new int[b2.values().length];
            try {
                iArr[b2.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b2.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f108431a = iArr;
        }
    }

    public static final d a(v1.a aVar, int i14, q0 q0Var, s5.q0 q0Var2, boolean z14, int i15) {
        d dVarC;
        float f14;
        if (q0Var2 != null) {
            dVarC = q0Var2.c(q0Var.f188940b.b(i14));
        } else {
            d.f123545e.getClass();
            dVarC = d.f123546f;
        }
        int iF0 = aVar.f0(r2.f108753a);
        float f15 = z14 ? (i15 - dVarC.f123547a) - iF0 : dVarC.f123547a;
        if (z14) {
            f14 = i15 - dVarC.f123547a;
        } else {
            f14 = iF0 + dVarC.f123547a;
        }
        return d.b(dVarC, f15, f14, 0.0f, 10);
    }
}
