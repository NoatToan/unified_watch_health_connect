package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractListeningExecutorService;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableScheduledFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.ListeningScheduledExecutorService;
import com.google.common.util.concurrent.WrappingScheduledExecutorService;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class aqx {
    public static Executor e() {
        return DirectExecutor.INSTANCE;
    }

    public static ListeningExecutorService c(ExecutorService executorService) {
        if (executorService instanceof ListeningExecutorService) {
            return (ListeningExecutorService) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new c((ScheduledExecutorService) executorService);
        }
        return new a(executorService);
    }

    /* JADX INFO: loaded from: classes21.dex */
    static class a extends AbstractListeningExecutorService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ExecutorService f707b;

        a(ExecutorService executorService) {
            this.f707b = (ExecutorService) Preconditions.checkNotNull(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f707b.awaitTermination(j, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f707b.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f707b.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f707b.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f707b.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f707b.execute(runnable);
        }

        public final String toString() {
            return super.toString() + "[" + this.f707b + "]";
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    static final class c extends a implements ListeningScheduledExecutorService {
        final ScheduledExecutorService d;

        c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.d = (ScheduledExecutorService) Preconditions.checkNotNull(scheduledExecutorService);
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            arl arlVarB = arl.b(runnable, null);
            return new C0011c(arlVarB, this.d.schedule(arlVarB, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public <V> ListenableScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
            arl arlVarD = arl.d(callable);
            return new C0011c(arlVarD, this.d.schedule(arlVarD, j, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            e eVar = new e(runnable);
            return new C0011c(eVar, this.d.scheduleAtFixedRate(eVar, j, j2, timeUnit));
        }

        @Override // com.google.common.util.concurrent.ListeningScheduledExecutorService, java.util.concurrent.ScheduledExecutorService
        public ListenableScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            e eVar = new e(runnable);
            return new C0011c(eVar, this.d.scheduleWithFixedDelay(eVar, j, j2, timeUnit));
        }

        /* JADX INFO: renamed from: aqx$c$c, reason: collision with other inner class name */
        static final class C0011c<V> extends ForwardingListenableFuture.SimpleForwardingListenableFuture<V> implements ListenableScheduledFuture<V> {
            private final ScheduledFuture<?> e;

            public C0011c(ListenableFuture<V> listenableFuture, ScheduledFuture<?> scheduledFuture) {
                super(listenableFuture);
                this.e = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.ForwardingFuture, java.util.concurrent.Future
            public boolean cancel(boolean z) {
                boolean zCancel = super.cancel(z);
                if (zCancel) {
                    this.e.cancel(z);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.e.getDelay(timeUnit);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.e.compareTo(delayed);
            }
        }

        static final class e extends AbstractFuture.TrustedFuture<Void> implements Runnable {
            private final Runnable e;

            public e(Runnable runnable) {
                this.e = (Runnable) Preconditions.checkNotNull(runnable);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.e.run();
                } catch (Throwable th) {
                    setException(th);
                    throw th;
                }
            }

            @Override // com.google.common.util.concurrent.AbstractFuture
            public String pendingToString() {
                return "task=[" + this.e + "]";
            }
        }
    }

    public static ThreadFactory b() {
        if (!d()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (InvocationTargetException e4) {
            throw Throwables.propagate(e4.getCause());
        }
    }

    private static boolean d() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public static Thread e(String str, Runnable runnable) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(runnable);
        Thread thread = (Thread) Objects.requireNonNull(b().newThread(runnable));
        try {
            thread.setName(str);
        } catch (SecurityException unused) {
        }
        return thread;
    }

    public static Executor a(final Executor executor, final Supplier<String> supplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(supplier);
        return new Executor() { // from class: aqx.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                executor.execute(aqi.a(runnable, (Supplier<String>) supplier));
            }
        };
    }

    public static ScheduledExecutorService a(ScheduledExecutorService scheduledExecutorService, final Supplier<String> supplier) {
        Preconditions.checkNotNull(scheduledExecutorService);
        Preconditions.checkNotNull(supplier);
        return new WrappingScheduledExecutorService(scheduledExecutorService) { // from class: aqx.3
            @Override // com.google.common.util.concurrent.WrappingExecutorService
            public <T> Callable<T> wrapTask(Callable<T> callable) {
                return aqi.d(callable, supplier);
            }

            @Override // com.google.common.util.concurrent.WrappingExecutorService
            public Runnable wrapTask(Runnable runnable) {
                return aqi.a(runnable, (Supplier<String>) supplier);
            }
        };
    }

    public static Executor e(final Executor executor, final AbstractFuture<?> abstractFuture) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(abstractFuture);
        return executor == e() ? executor : new Executor() { // from class: aqx.5
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    abstractFuture.setException(e);
                }
            }
        };
    }
}
