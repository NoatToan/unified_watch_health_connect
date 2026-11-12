package androidx.camera.core.impl;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.mj3;
import defpackage.q5d;
import defpackage.zhd;
import defpackage.zj3;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class i implements r<androidx.camera.core.j>, k, zhd {
    public static final Config.a<Integer> A;
    public static final Config.a<Integer> B;
    public static final Config.a<mj3> C;
    public static final Config.a<zj3> D;
    public static final Config.a<Integer> E;
    public static final Config.a<Integer> F;
    public static final Config.a<q5d> G;
    public static final Config.a<Boolean> H;
    public static final Config.a<Integer> I;
    public static final Config.a<Integer> J;
    public static final Config.a<Boolean> K;
    public final n z;

    static {
        Class cls = Integer.TYPE;
        A = Config.a.a("camerax.core.imageCapture.captureMode", cls);
        B = Config.a.a("camerax.core.imageCapture.flashMode", cls);
        C = Config.a.a("camerax.core.imageCapture.captureBundle", mj3.class);
        D = Config.a.a("camerax.core.imageCapture.captureProcessor", zj3.class);
        E = Config.a.a("camerax.core.imageCapture.bufferFormat", Integer.class);
        F = Config.a.a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        G = Config.a.a("camerax.core.imageCapture.imageReaderProxyProvider", q5d.class);
        Class cls2 = Boolean.TYPE;
        H = Config.a.a("camerax.core.imageCapture.useSoftwareJpegEncoder", cls2);
        I = Config.a.a("camerax.core.imageCapture.flashType", cls);
        J = Config.a.a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        K = Config.a.a("camerax.core.imageCapture.sessionProcessorEnabled", cls2);
    }

    public i(n nVar) {
        this.z = nVar;
    }

    public mj3 K(mj3 mj3Var) {
        return (mj3) d(C, mj3Var);
    }

    public int L() {
        return ((Integer) a(A)).intValue();
    }

    public zj3 M(zj3 zj3Var) {
        return (zj3) d(D, zj3Var);
    }

    public int N(int i) {
        return ((Integer) d(B, Integer.valueOf(i))).intValue();
    }

    public int O(int i) {
        return ((Integer) d(I, Integer.valueOf(i))).intValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public q5d P() {
        return (q5d) d(G, null);
    }

    public Executor Q(Executor executor) {
        return (Executor) d(zhd.f41274a, executor);
    }

    @IntRange(from = 1, to = 100)
    public int R() {
        return ((Integer) a(J)).intValue();
    }

    public int S(int i) {
        return ((Integer) d(F, Integer.valueOf(i))).intValue();
    }

    public boolean T() {
        return f(A);
    }

    public boolean U() {
        return ((Boolean) d(K, Boolean.FALSE)).booleanValue();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean V() {
        return ((Boolean) d(H, Boolean.FALSE)).booleanValue();
    }

    @Override // androidx.camera.core.impl.p
    public Config e() {
        return this.z;
    }

    @Override // androidx.camera.core.impl.j
    public int m() {
        return ((Integer) a(j.f1737k)).intValue();
    }
}
