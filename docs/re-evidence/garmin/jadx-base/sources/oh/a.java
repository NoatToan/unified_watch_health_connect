package oh;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f132147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f132148b = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: oh.a$a, reason: collision with other inner class name */
    public interface InterfaceC2506a<T, R> {
        Boolean a(Object obj);
    }

    public static Pair a(int i14, long j8, TimeUnit timeUnit) {
        Pair<Long, ?> pair;
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f132147a;
        if (concurrentHashMap != null && (pair = concurrentHashMap.get(Integer.valueOf(i14))) != null) {
            Long l14 = (Long) pair.first;
            return (l14 == null || SystemClock.elapsedRealtime() - l14.longValue() > TimeUnit.MILLISECONDS.convert(j8, timeUnit)) ? new Pair(Boolean.FALSE, null) : new Pair(Boolean.TRUE, pair.second);
        }
        return new Pair(Boolean.FALSE, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x001f, B:12:0x002b, B:18:0x0040, B:23:0x0065, B:20:0x0053, B:22:0x0062, B:21:0x005e), top: B:27:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x001f, B:12:0x002b, B:18:0x0040, B:23:0x0065, B:20:0x0053, B:22:0x0062, B:21:0x005e), top: B:27:0x0005 }] */
    public static <T> T b(int i14, long j8, TimeUnit timeUnit, InterfaceC2506a<Object, Boolean> interfaceC2506a, Callable<T> callable, boolean z14, long j14, TimeUnit timeUnit2, lh.a aVar, boolean z15) {
        T tCall;
        try {
            Pair pairA = a(i14, j8, timeUnit);
            if (((Boolean) pairA.first).booleanValue() && interfaceC2506a.a(pairA.second).booleanValue()) {
                Objects.toString(pairA.second);
                return (T) pairA.second;
            }
            if (z15) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    wg.a.g(aVar, "biz", "ch_get_main", "" + i14);
                    tCall = null;
                } else {
                    if (z14) {
                        tCall = f132148b.submit(callable).get(j14, timeUnit2);
                    } else {
                        tCall = callable.call();
                    }
                    c(i14, tCall);
                }
            } else {
                if (z14) {
                    tCall = f132148b.submit(callable).get(j14, timeUnit2);
                } else {
                    tCall = callable.call();
                }
                c(i14, tCall);
            }
            Objects.toString(tCall);
            return tCall;
        } catch (Throwable th3) {
            StringWriter stringWriter = new StringWriter();
            th3.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
            wg.a.d(aVar, "biz", "ch_get_e|" + i14, th3);
            return null;
        }
    }

    public static synchronized void c(int i14, Object obj) {
        try {
            if (f132147a == null) {
                f132147a = new ConcurrentHashMap<>();
            }
            f132147a.put(Integer.valueOf(i14), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
