package defpackage;

import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class ark {

    @CheckForNull
    private String e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private Boolean f710b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    private Integer f709a = null;

    @CheckForNull
    private Thread.UncaughtExceptionHandler d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private ThreadFactory f711c = null;

    public ark a(String str) {
        a(str, 0);
        this.e = str;
        return this;
    }

    public ThreadFactory b() {
        return a(this);
    }

    private static ThreadFactory a(ark arkVar) {
        final String str = arkVar.e;
        final Boolean bool = arkVar.f710b;
        final Integer num = arkVar.f709a;
        final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = arkVar.d;
        ThreadFactory threadFactoryDefaultThreadFactory = arkVar.f711c;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        final ThreadFactory threadFactory = threadFactoryDefaultThreadFactory;
        final AtomicLong atomicLong = str != null ? new AtomicLong(0L) : null;
        return new ThreadFactory() { // from class: ark.4
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = threadFactory.newThread(runnable);
                Objects.requireNonNull(threadNewThread);
                String str2 = str;
                if (str2 != null) {
                    threadNewThread.setName(ark.a(str2, Long.valueOf(((AtomicLong) Objects.requireNonNull(atomicLong)).getAndIncrement())));
                }
                Boolean bool2 = bool;
                if (bool2 != null) {
                    threadNewThread.setDaemon(bool2.booleanValue());
                }
                Integer num2 = num;
                if (num2 != null) {
                    threadNewThread.setPriority(num2.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandler;
                if (uncaughtExceptionHandler2 != null) {
                    threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return threadNewThread;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }
}
