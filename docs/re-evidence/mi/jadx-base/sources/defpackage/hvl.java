package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class hvl implements dyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScheduledExecutorService f20520a;

    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20521a;

        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryExecutorServiceThreadFactory-");
            int i = this.f20521a;
            this.f20521a = i + 1;
            sb.append(i);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @TestOnly
    public hvl(@NotNull ScheduledExecutorService scheduledExecutorService) {
        this.f20520a = scheduledExecutorService;
    }

    @Override // defpackage.dyc
    @NotNull
    public Future<?> a(@NotNull Runnable runnable, long j) {
        return this.f20520a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.dyc
    public void b(long j) {
        synchronized (this.f20520a) {
            if (!this.f20520a.isShutdown()) {
                this.f20520a.shutdown();
                try {
                    if (!this.f20520a.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        this.f20520a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f20520a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // defpackage.dyc
    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.f20520a) {
            zIsShutdown = this.f20520a.isShutdown();
        }
        return zIsShutdown;
    }

    @Override // defpackage.dyc
    @NotNull
    public Future<?> submit(@NotNull Runnable runnable) {
        return this.f20520a.submit(runnable);
    }

    public hvl() {
        this(Executors.newSingleThreadScheduledExecutor(new b()));
    }
}
