package i13;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private c() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(AtomicLong atomicLong, long j8) {
        long j14;
        long j15;
        do {
            j14 = atomicLong.get();
            if (j14 == Long.MAX_VALUE) {
                return;
            } else {
                j15 = j14 + j8;
            }
        } while (!atomicLong.compareAndSet(j14, j15 >= 0 ? j15 : Long.MAX_VALUE));
    }

    public static void b(AtomicLong atomicLong, long j8) {
        long j14;
        long j15;
        do {
            j14 = atomicLong.get();
            if (j14 == Long.MAX_VALUE) {
                return;
            }
            j15 = j14 - j8;
            if (j15 < 0) {
                k13.a.b(new IllegalStateException(org.apache.commons.lang3.e.e(j15, "More produced than requested: ")));
                j15 = 0;
            }
        } while (!atomicLong.compareAndSet(j14, j15));
    }
}
