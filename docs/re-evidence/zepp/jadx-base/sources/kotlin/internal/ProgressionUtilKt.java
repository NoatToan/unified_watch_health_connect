package kotlin.internal;

import kotlin.PublishedApi;

/* JADX INFO: loaded from: classes23.dex */
public final class ProgressionUtilKt {
    private static final int a(int i, int i2, int i3) {
        return c(c(i, i3) - c(i2, i3), i3);
    }

    private static final long b(long j, long j2, long j3) {
        return d(d(j, j3) - d(j2, j3), j3);
    }

    private static final int c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    private static final long d(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - a(i2, i, i3);
        }
        if (i3 < 0) {
            return i <= i2 ? i2 : i2 + a(i, i2, -i3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - b(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + b(j, j2, -j3);
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
