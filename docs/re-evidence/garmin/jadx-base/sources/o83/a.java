package o83;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static long a(AtomicLong atomicLong, long j8) {
        long j14;
        long j15;
        do {
            j14 = atomicLong.get();
            if (j14 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j15 = j14 - j8;
            if (j15 < 0) {
                vb.h.z(org.apache.commons.lang3.e.e(j15, "More produced than requested: "));
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j14, j15));
        return j15;
    }
}
