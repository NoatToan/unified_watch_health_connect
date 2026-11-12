package defpackage;

import io.sentry.util.p;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class abc {
    public static final long g = TimeUnit.HOURS.toMillis(5);
    public static final long h = TimeUnit.SECONDS.toMillis(1);

    @Nullable
    public static abc i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile String f854b;
    public volatile long c;

    @NotNull
    public final AtomicBoolean d;

    @NotNull
    public final Callable<InetAddress> e;

    @NotNull
    public final ExecutorService f;

    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f855a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryHostnameCache-");
            int i = this.f855a;
            this.f855a = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public abc() {
        this(g);
    }

    @NotNull
    public static abc e() {
        if (i == null) {
            i = new abc();
        }
        return i;
    }

    public void c() {
        this.f.shutdown();
    }

    @Nullable
    public String d() {
        if (this.c < System.currentTimeMillis() && this.d.compareAndSet(false, true)) {
            i();
        }
        return this.f854b;
    }

    public final void f() {
        this.c = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    public final /* synthetic */ Void h() throws Exception {
        try {
            this.f854b = this.e.call().getCanonicalHostName();
            this.c = System.currentTimeMillis() + this.f853a;
            return null;
        } finally {
            this.d.set(false);
        }
    }

    public final void i() {
        try {
            this.f.submit(new Callable() { // from class: zac
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f41070a.h();
                }
            }).get(h, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            f();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            f();
        }
    }

    public abc(long j) {
        this(j, new Callable() { // from class: yac
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    public abc(long j, @NotNull Callable<InetAddress> callable) {
        this.d = new AtomicBoolean(false);
        this.f = Executors.newSingleThreadExecutor(new b());
        this.f853a = j;
        this.e = (Callable) p.c(callable, "getLocalhost is required");
        i();
    }
}
