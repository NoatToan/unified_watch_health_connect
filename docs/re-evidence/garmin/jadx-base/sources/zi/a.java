package zi;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n23.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile int f204826b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f204827a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f204828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f204829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f204830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f204831d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e.b f204832e = e.f204841a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f204833f;

        public b(boolean z14) {
            this.f204828a = z14;
        }

        public final a a() {
            if (TextUtils.isEmpty(this.f204833f)) {
                j.A(this.f204833f, "Name must be non-null and non-empty, but given: ");
                return null;
            }
            return new a(new ThreadPoolExecutor(this.f204829b, this.f204830c, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f204831d, this.f204833f, this.f204832e, this.f204828a)));
        }
    }

    public static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: zi.a$c$a, reason: collision with other inner class name */
        public class C3821a extends Thread {
            public C3821a(c cVar, Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new C3821a(this, runnable);
        }
    }

    public static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadFactory f204834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f204835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f204836c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f204837d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicInteger f204838e = new AtomicInteger();

        /* JADX INFO: renamed from: zi.a$d$a, reason: collision with other inner class name */
        public class RunnableC3822a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f204839a;

            public RunnableC3822a(Runnable runnable) {
                this.f204839a = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                if (dVar.f204837d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f204839a.run();
                } catch (Throwable th3) {
                    dVar.f204836c.a(th3);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z14) {
            this.f204834a = threadFactory;
            this.f204835b = str;
            this.f204836c = eVar;
            this.f204837d = z14;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f204834a.newThread(new RunnableC3822a(runnable));
            threadNewThread.setName("glide-" + this.f204835b + "-thread-" + this.f204838e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f204841a;

        /* JADX INFO: renamed from: zi.a$e$a, reason: collision with other inner class name */
        public class C3823a implements e {
            @Override // zi.a.e
            public final void a(Throwable th3) {
            }
        }

        public class b implements e {
            @Override // zi.a.e
            public final void a(Throwable th3) {
            }
        }

        public class c implements e {
            @Override // zi.a.e
            public final void a(Throwable th3) {
                throw new RuntimeException("Request threw uncaught throwable", th3);
            }
        }

        static {
            new C3823a();
            b bVar = new b();
            new c();
            f204841a = bVar;
        }

        void a(Throwable th3);
    }

    public a(ExecutorService executorService) {
        this.f204827a = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j8, TimeUnit timeUnit) {
        return this.f204827a.awaitTermination(j8, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z14 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z14) {
                    shutdownNow();
                    z14 = true;
                }
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f204827a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f204827a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f204827a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f204827a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f204827a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f204827a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f204827a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f204827a.submit(runnable);
    }

    public final String toString() {
        return this.f204827a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
        return this.f204827a.invokeAll(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j8, TimeUnit timeUnit) {
        return (T) this.f204827a.invokeAny(collection, j8, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t7) {
        return this.f204827a.submit(runnable, t7);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f204827a.submit(callable);
    }
}
