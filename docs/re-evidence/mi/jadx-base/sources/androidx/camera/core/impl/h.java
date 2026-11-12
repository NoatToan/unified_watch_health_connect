package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.mcp;
import defpackage.q5d;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class h implements r<androidx.camera.core.g>, k, mcp {
    public static final Config.a<Integer> A = Config.a.a("camerax.core.imageAnalysis.backpressureStrategy", androidx.camera.core.g.b.class);
    public static final Config.a<Integer> B = Config.a.a("camerax.core.imageAnalysis.imageQueueDepth", Integer.TYPE);
    public static final Config.a<q5d> C = Config.a.a("camerax.core.imageAnalysis.imageReaderProxyProvider", q5d.class);
    public static final Config.a<Integer> D = Config.a.a("camerax.core.imageAnalysis.outputImageFormat", androidx.camera.core.g.e.class);
    public static final Config.a<Boolean> E = Config.a.a("camerax.core.imageAnalysis.onePixelShiftEnabled", Boolean.class);
    public static final Config.a<Boolean> F = Config.a.a("camerax.core.imageAnalysis.outputImageRotationEnabled", Boolean.class);
    public final n z;

    public h(n nVar) {
        this.z = nVar;
    }

    public int K(int i) {
        return ((Integer) d(A, Integer.valueOf(i))).intValue();
    }

    public int L(int i) {
        return ((Integer) d(B, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public q5d M() {
        return (q5d) d(C, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Boolean N(Boolean bool) {
        return (Boolean) d(E, bool);
    }

    public int O(int i) {
        return ((Integer) d(D, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Boolean P(Boolean bool) {
        return (Boolean) d(F, bool);
    }

    @Override // androidx.camera.core.impl.p
    public Config e() {
        return this.z;
    }

    @Override // androidx.camera.core.impl.j
    public int m() {
        return 35;
    }
}
