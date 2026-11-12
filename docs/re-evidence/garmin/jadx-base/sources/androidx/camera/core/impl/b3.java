package androidx.camera.core.impl;

import android.util.Range;
import b0.i1;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface b3<T extends b0.i1> extends m0.m<T>, m1 {
    public static final h A;
    public static final h B;
    public static final h C;
    public static final h D;
    public static final h E;
    public static final h F;
    public static final h G;
    public static final h H;
    public static final h I;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f5508u = x0.a.a(l2.class, "camerax.core.useCase.defaultSessionConfig");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f5509v = x0.a.a(v0.class, "camerax.core.useCase.defaultCaptureConfig");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f5510w = x0.a.a(l2.e.class, "camerax.core.useCase.sessionConfigUnpacker");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f5511x = x0.a.a(v0.b.class, "camerax.core.useCase.captureConfigUnpacker");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f5512y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f5513z;

    public class a implements h0.p0.b {
        public a() {
        }

        @Override // h0.p0.b
        public final h0.t0 a(b0.l0.a aVar) {
            return new h0.t0(aVar);
        }
    }

    public interface b<T extends b0.i1, C extends b3<T>, B> extends b0.c0<T> {
        C b();
    }

    static {
        Class cls = Integer.TYPE;
        f5512y = x0.a.a(cls, "camerax.core.useCase.surfaceOccupancyPriority");
        f5513z = x0.a.a(cls, "camerax.core.useCase.sessionType");
        A = x0.a.a(Range.class, "camerax.core.useCase.targetFrameRate");
        B = x0.a.a(Boolean.class, "camerax.core.useCase.isStrictFrameRateRequired");
        Class cls2 = Boolean.TYPE;
        C = x0.a.a(cls2, "camerax.core.useCase.zslDisabled");
        D = x0.a.a(cls2, "camerax.core.useCase.highResolutionDisabled");
        E = x0.a.a(c3.b.class, "camerax.core.useCase.captureType");
        F = x0.a.a(cls, "camerax.core.useCase.previewStabilizationMode");
        G = x0.a.a(cls, "camerax.core.useCase.videoStabilizationMode");
        H = x0.a.a(h0.p0.b.class, "camerax.core.useCase.takePictureManagerProvider");
        I = x0.a.a(r2.class, "camerax.core.useCase.streamUseCase");
    }

    default boolean A() {
        return ((Boolean) f(D, Boolean.FALSE)).booleanValue();
    }

    default int C() {
        return ((Integer) f(F, 0)).intValue();
    }

    default l2 H() {
        return (l2) f(f5508u, null);
    }

    default l2 I() {
        return (l2) e(f5508u);
    }

    default Range<Integer> M(Range<Integer> range) {
        return (Range) f(A, range);
    }

    default l2.e O() {
        return (l2.e) f(f5510w, null);
    }

    default v0 R() {
        return (v0) f(f5509v, null);
    }

    default boolean S() {
        return b(A);
    }

    default int getSessionType() {
        return ((Integer) f(f5513z, 0)).intValue();
    }

    default h0.p0.b i() {
        h0.p0.b bVar = (h0.p0.b) f(H, new a());
        Objects.requireNonNull(bVar);
        return bVar;
    }

    default int l() {
        return ((Integer) f(G, 0)).intValue();
    }

    default boolean n() {
        return ((Boolean) f(C, Boolean.FALSE)).booleanValue();
    }

    default boolean v() {
        Boolean bool = (Boolean) f(B, Boolean.FALSE);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    default int w() {
        return ((Integer) f(f5512y, 0)).intValue();
    }

    default r2 x() {
        r2 r2Var = (r2) f(I, r2.DEFAULT);
        Objects.requireNonNull(r2Var);
        return r2Var;
    }

    default c3.b y() {
        return (c3.b) e(E);
    }
}
