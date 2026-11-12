package androidx.camera.core.impl;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface n1 extends j2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f5643k = x0.a.a(b0.c.class, "camerax.core.imageOutput.targetAspectRatio");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f5644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f5645m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f5646n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f5647o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f5648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f5649q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f5650r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f5651s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f5652t;

    public interface a<B> {
        B a(Size size);

        B c(int i14);

        B e(u0.c cVar);
    }

    static {
        Class cls = Integer.TYPE;
        f5644l = x0.a.a(cls, "camerax.core.imageOutput.targetRotation");
        f5645m = x0.a.a(cls, "camerax.core.imageOutput.appTargetRotation");
        f5646n = x0.a.a(cls, "camerax.core.imageOutput.mirrorMode");
        f5647o = x0.a.a(Size.class, "camerax.core.imageOutput.targetResolution");
        f5648p = x0.a.a(Size.class, "camerax.core.imageOutput.defaultResolution");
        f5649q = x0.a.a(Size.class, "camerax.core.imageOutput.maxResolution");
        f5650r = x0.a.a(List.class, "camerax.core.imageOutput.supportedResolutions");
        f5651s = x0.a.a(u0.c.class, "camerax.core.imageOutput.resolutionSelector");
        f5652t = x0.a.a(List.class, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void s(n1 n1Var) {
        boolean zN = n1Var.N();
        boolean z14 = n1Var.k() != null;
        if (zN && z14) {
            vb.h.s("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (n1Var.r() != null) {
            if (zN || z14) {
                vb.h.s("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default u0.c B() {
        return (u0.c) e(f5651s);
    }

    default int D(int i14) {
        return ((Integer) f(f5644l, Integer.valueOf(i14))).intValue();
    }

    default int F() {
        return ((Integer) f(f5646n, -1)).intValue();
    }

    default List K() {
        return (List) f(f5650r, null);
    }

    default Size L() {
        return (Size) f(f5648p, null);
    }

    default boolean N() {
        return b(f5643k);
    }

    default Size k() {
        return (Size) f(f5647o, null);
    }

    default Size m() {
        return (Size) f(f5649q, null);
    }

    default ArrayList p() {
        List list = (List) f(f5652t, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    default int q() {
        return ((Integer) f(f5645m, -1)).intValue();
    }

    default u0.c r() {
        return (u0.c) f(f5651s, null);
    }

    default int u() {
        return ((Integer) e(f5643k)).intValue();
    }
}
