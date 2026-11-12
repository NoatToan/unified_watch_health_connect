package j0;

import ch.qos.logback.core.spi.AbstractComponentTracker;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f95956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f95957b;

    public o(double d14) {
        this((long) (d14 * 10000.0d), AbstractComponentTracker.LINGERING_TIMEOUT);
    }

    public final String toString() {
        return this.f95956a + "/" + this.f95957b;
    }

    public o(long j8, long j14) {
        this.f95956a = j8;
        this.f95957b = j14;
    }
}
