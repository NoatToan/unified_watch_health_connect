package p1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f134768a = new h0(0);

    public static final h0 a(int... iArr) {
        h0 h0Var = new h0(iArr.length);
        int i14 = h0Var.f134763b;
        if (i14 < 0) {
            org.apache.commons.lang3.e.v("");
            return null;
        }
        if (iArr.length == 0) {
            return h0Var;
        }
        h0Var.e(iArr.length + i14);
        int[] iArr2 = h0Var.f134762a;
        int i15 = h0Var.f134763b;
        if (i14 != i15) {
            p13.s.d(iArr.length + i14, i14, i15, iArr2, iArr2);
        }
        p13.s.i(i14, 0, 12, iArr, iArr2);
        h0Var.f134763b += iArr.length;
        return h0Var;
    }
}
