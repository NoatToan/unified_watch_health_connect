package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class a0b implements ExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f470b = TimeUnit.SECONDS.toMillis(10);
    public static volatile int c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f471a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f473b;
        public int c;
        public ThreadFactory d = new c();
        public e e = e.d;
        public String f;
        public long g;

        public b(boolean z) {
            this.f472a = z;
        }

        public a0b a() {
            if (TextUtils.isEmpty(this.f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f473b, this.c, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.d, this.f, this.e, this.f472a));
            if (this.g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a0b(threadPoolExecutor);
        }

        public b b(String str) {
            this.f = str;
            return this;
        }

        public b c(@IntRange(from = 1) int i) {
            this.f473b = i;
            this.c = i;
            return this;
        }
    }

    public static final class c implements ThreadFactory {

        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    public static final class d implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadFactory f475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f476b;
        public final e c;
        public final boolean d;
        public final AtomicInteger e = new AtomicInteger();

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f477a;

            public a(Runnable runnable) {
                this.f477a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f477a.run();
                } catch (Throwable th) {
                    d.this.c.a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z) {
            this.f475a = threadFactory;
            this.f476b = str;
            this.c = eVar;
            this.d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f475a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f476b + "-thread-" + this.e.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f479a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f480b;
        public static final e c;
        public static final e d;

        public class a implements e {
            @Override // a0b.e
            public void a(Throwable th) {
            }
        }

        public class b implements e {
            @Override // a0b.e
            public void a(Throwable th) {
                if (th != null) {
                    Log.isLoggable("GlideExecutor", 6);
                }
            }
        }

        public class c implements e {
            @Override // a0b.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f480b = bVar;
            c = new c();
            d = bVar;
        }

        void a(Throwable th);
    }

    @VisibleForTesting
    public a0b(ExecutorService executorService) {
        this.f471a = executorService;
    }

    public static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (c == 0) {
            c = Math.min(4, f5l.a());
        }
        return c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a0b d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a0b f() {
        return e().a();
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static a0b h() {
        return g().a();
    }

    public static a0b i() {
        return new a0b(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f470b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f471a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f471a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f471a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f471a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f471a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f471a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f471a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f471a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f471a.submit(runnable);
    }

    public String toString() {
        return this.f471a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f471a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f471a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f471a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f471a.submit(callable);
    }
}
