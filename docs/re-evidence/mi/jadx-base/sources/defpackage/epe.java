package defpackage;

import android.annotation.TargetApi;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class epe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f16934a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        return (b() - j) * f16934a;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
