package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class ocp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29010a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f29011b = null;
    public Integer c = null;
    public Thread.UncaughtExceptionHandler d = null;
    public ThreadFactory e = null;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ThreadFactory f29012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f29013b;
        public final /* synthetic */ AtomicLong c;
        public final /* synthetic */ Boolean d;
        public final /* synthetic */ Integer e;
        public final /* synthetic */ Thread.UncaughtExceptionHandler f;

        public a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f29012a = threadFactory;
            this.f29013b = str;
            this.c = atomicLong;
            this.d = bool;
            this.e = num;
            this.f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f29012a.newThread(runnable);
            String str = this.f29013b;
            if (str != null) {
                AtomicLong atomicLong = this.c;
                Objects.requireNonNull(atomicLong);
                threadNewThread.setName(ocp.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.d;
            if (bool != null) {
                threadNewThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.e;
            if (num != null) {
                threadNewThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f;
            if (uncaughtExceptionHandler != null) {
                threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return threadNewThread;
        }
    }

    public static ThreadFactory c(ocp ocpVar) {
        String str = ocpVar.f29010a;
        Boolean bool = ocpVar.f29011b;
        Integer num = ocpVar.c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = ocpVar.d;
        ThreadFactory threadFactoryDefaultThreadFactory = ocpVar.e;
        if (threadFactoryDefaultThreadFactory == null) {
            threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactoryDefaultThreadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public ocp e(String str) {
        d(str, 0);
        this.f29010a = str;
        return this;
    }
}
