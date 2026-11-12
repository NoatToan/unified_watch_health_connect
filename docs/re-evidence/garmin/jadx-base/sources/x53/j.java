package x53;

import java.util.concurrent.TimeUnit;
import u53.y;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f189160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f189161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f189162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f189163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f189164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f189165f;

    static {
        String property;
        int i14 = y.f168775a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f189160a = property;
        f189161b = og2.k.J(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i15 = y.f168775a;
        if (i15 < 2) {
            i15 = 2;
        }
        f189162c = og2.k.K(i15, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f189163d = og2.k.K(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f189164e = TimeUnit.SECONDS.toNanos(og2.k.J(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f189165f = e.f189155a;
    }
}
