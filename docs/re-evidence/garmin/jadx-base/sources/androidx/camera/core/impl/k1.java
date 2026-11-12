package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements b3<b0.g0>, n1, m0.n {
    public static final h O = x0.a.a(b0.g0.b.class, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final h P = x0.a.a(Integer.TYPE, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final h Q = x0.a.a(b0.p0.class, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public static final h R = x0.a.a(b0.g0.e.class, "camerax.core.imageAnalysis.outputImageFormat");
    public static final h S = x0.a.a(Boolean.class, "camerax.core.imageAnalysis.onePixelShiftEnabled");
    public static final h T = x0.a.a(Boolean.class, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    public final a2 N;

    public k1(a2 a2Var) {
        this.N = a2Var;
    }

    @Override // androidx.camera.core.impl.j2
    public final x0 getConfig() {
        return this.N;
    }

    @Override // androidx.camera.core.impl.m1
    public final int z() {
        return 35;
    }
}
