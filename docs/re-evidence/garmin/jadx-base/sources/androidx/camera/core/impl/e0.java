package androidx.camera.core.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface e0 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f5531a = x0.a.a(c3.class, "camerax.core.camera.useCaseConfigFactory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f5532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f5533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f5534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f5535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f5536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d0 f5537g;

    public interface a {
        int a(ArrayList arrayList);
    }

    static {
        x0.a.a(j1.class, "camerax.core.camera.compatibilityId");
        f5532b = x0.a.a(Integer.class, "camerax.core.camera.useCaseCombinationRequiredRule");
        f5533c = x0.a.a(n2.class, "camerax.core.camera.SessionProcessor");
        x0.a.a(Boolean.class, "camerax.core.camera.isZslDisabled");
        f5534d = x0.a.a(Boolean.class, "camerax.core.camera.isPostviewSupported");
        f5535e = x0.a.a(a.class, "camerax.core.camera.PostviewFormatSelector");
        f5536f = x0.a.a(Boolean.class, "camerax.core.camera.isCaptureProcessProgressSupported");
        f5537g = new d0();
    }

    default n2 t() {
        return (n2) f(f5533c, null);
    }
}
