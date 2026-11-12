package defpackage;

import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.ParametricNullness;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aro {
    @ParametricNullness
    public static <V> V d(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static void a(long j, TimeUnit timeUnit) {
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = System.nanoTime();
            long jNanoTime2 = nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(jNanoTime2);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    jNanoTime2 = (jNanoTime + nanos) - System.nanoTime();
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }
}
