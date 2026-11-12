package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements b3<b0.l0>, n1, m0.f {
    public static final h O;
    public static final h P;
    public static final h Q;
    public static final h R;
    public static final h S;
    public static final h T;
    public static final h U;
    public static final h V;
    public static final h W;
    public static final h X;
    public static final h Y;
    public static final h Z;
    public final a2 N;

    static {
        Class cls = Integer.TYPE;
        O = x0.a.a(cls, "camerax.core.imageCapture.captureMode");
        P = x0.a.a(cls, "camerax.core.imageCapture.flashMode");
        Q = x0.a.a(u0.class, "camerax.core.imageCapture.captureBundle");
        R = x0.a.a(Integer.class, "camerax.core.imageCapture.bufferFormat");
        S = x0.a.a(Integer.class, "camerax.core.imageCapture.outputFormat");
        x0.a.a(Integer.class, "camerax.core.imageCapture.maxCaptureStages");
        T = x0.a.a(b0.p0.class, "camerax.core.imageCapture.imageReaderProxyProvider");
        U = x0.a.a(Boolean.TYPE, "camerax.core.imageCapture.useSoftwareJpegEncoder");
        V = x0.a.a(cls, "camerax.core.imageCapture.flashType");
        W = x0.a.a(cls, "camerax.core.imageCapture.jpegCompressionQuality");
        X = x0.a.a(b0.l0.j.class, "camerax.core.imageCapture.screenFlash");
        Y = x0.a.a(u0.c.class, "camerax.core.useCase.postviewResolutionSelector");
        Z = x0.a.a(Boolean.class, "camerax.core.useCase.isPostviewEnabled");
    }

    public l1(a2 a2Var) {
        this.N = a2Var;
    }

    @Override // androidx.camera.core.impl.j2
    public final x0 getConfig() {
        return this.N;
    }

    @Override // androidx.camera.core.impl.m1
    public final int z() {
        return ((Integer) e(m1.f5632h)).intValue();
    }
}
