package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import defpackage.aqt;
import defpackage.aqx;
import defpackage.aqy;
import defpackage.arc;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractScheduledService implements Service {
    private static final aqy logger = new aqy(AbstractScheduledService.class);
    private final AbstractService delegate = new b();

    interface Cancellable {
        void cancel(boolean z);

        boolean isCancelled();
    }

    protected abstract void runOneIteration() throws Exception;

    protected abstract Scheduler scheduler();

    protected void shutDown() throws Exception {
    }

    protected void startUp() throws Exception {
    }

    public static abstract class Scheduler {
        abstract Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        public static Scheduler newFixedDelaySchedule(final long j, final long j2, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            Preconditions.checkArgument(j2 > 0, "delay must be > 0, found %s", j2);
            return new Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                    return new d(scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j2, timeUnit));
                }
            };
        }

        public static Scheduler newFixedRateSchedule(final long j, final long j2, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(timeUnit);
            Preconditions.checkArgument(j2 > 0, "period must be > 0, found %s", j2);
            return new Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                    return new d(scheduledExecutorService.scheduleAtFixedRate(runnable, j, j2, timeUnit));
                }
            };
        }

        private Scheduler() {
        }
    }

    public final class b extends AbstractService {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f4676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        private volatile Cancellable f4677c;

        @CheckForNull
        private volatile ScheduledExecutorService d;
        private final ReentrantLock e;

        private b() {
            this.e = new ReentrantLock();
            this.f4676b = new a();
        }

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.e.lock();
                try {
                    if (!((Cancellable) Objects.requireNonNull(b.this.f4677c)).isCancelled()) {
                        AbstractScheduledService.this.runOneIteration();
                    }
                } catch (Throwable th) {
                    try {
                        arc.e(th);
                        try {
                            AbstractScheduledService.this.shutDown();
                        } catch (Exception e) {
                            arc.e(e);
                            AbstractScheduledService.logger.b().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e);
                        }
                        b.this.notifyFailed(th);
                        ((Cancellable) Objects.requireNonNull(b.this.f4677c)).cancel(false);
                    } catch (Throwable th2) {
                        b.this.e.unlock();
                        throw th2;
                    }
                }
                b.this.e.unlock();
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            this.d = aqx.a(AbstractScheduledService.this.executor(), (Supplier<String>) new Supplier() { // from class: aqf
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return this.d.c();
                }
            });
            this.d.execute(new Runnable() { // from class: aqe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f684b.e();
                }
            });
        }

        public /* synthetic */ String c() {
            return AbstractScheduledService.this.serviceName() + " " + state();
        }

        public /* synthetic */ void e() {
            this.e.lock();
            try {
                AbstractScheduledService.this.startUp();
                Objects.requireNonNull(this.d);
                this.f4677c = AbstractScheduledService.this.scheduler().schedule(AbstractScheduledService.this.delegate, this.d, this.f4676b);
                notifyStarted();
            } catch (Throwable th) {
                try {
                    arc.e(th);
                    notifyFailed(th);
                    if (this.f4677c != null) {
                        this.f4677c.cancel(false);
                    }
                } finally {
                    this.e.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            Objects.requireNonNull(this.f4677c);
            Objects.requireNonNull(this.d);
            this.f4677c.cancel(false);
            this.d.execute(new Runnable() { // from class: aql
                @Override // java.lang.Runnable
                public final void run() {
                    this.f690c.a();
                }
            });
        }

        public /* synthetic */ void a() {
            try {
                this.e.lock();
                try {
                    if (state() == Service.State.STOPPING) {
                        AbstractScheduledService.this.shutDown();
                        this.e.unlock();
                        notifyStopped();
                        return;
                    }
                    this.e.unlock();
                } catch (Throwable th) {
                    this.e.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                arc.e(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractScheduledService.this.toString();
        }
    }

    protected AbstractScheduledService() {
    }

    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return aqx.e(AbstractScheduledService.this.serviceName(), runnable);
        }
    }

    protected ScheduledExecutorService executor() {
        final ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new a());
        addListener(new Service.Listener(this) { // from class: com.google.common.util.concurrent.AbstractScheduledService.4
            @Override // com.google.common.util.concurrent.Service.Listener
            public void terminated(Service.State state) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void failed(Service.State state, Throwable th) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }
        }, aqx.e());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    protected String serviceName() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service startAsync() throws Exception {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service stopAsync() throws Exception {
        this.delegate.stopAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.delegate.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.delegate.awaitTerminated(j, timeUnit);
    }

    static final class d implements Cancellable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Future<?> f4678b;

        d(Future<?> future) {
            this.f4678b = future;
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean z) {
            this.f4678b.cancel(z);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
            return this.f4678b.isCancelled();
        }
    }

    public static abstract class CustomScheduler extends Scheduler {
        protected abstract c getNextSchedule() throws Exception;

        public CustomScheduler() {
            super();
        }

        final class e implements Callable<Void> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final AbstractService f4669b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @CheckForNull
            private d f4670c;
            private final ScheduledExecutorService d;
            private final ReentrantLock e = new ReentrantLock();
            private final Runnable g;

            e(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.g = runnable;
                this.d = scheduledExecutorService;
                this.f4669b = abstractService;
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.g.run();
                b();
                return null;
            }

            public Cancellable b() throws Exception {
                Cancellable dVar;
                try {
                    c nextSchedule = CustomScheduler.this.getNextSchedule();
                    this.e.lock();
                    try {
                        dVar = c(nextSchedule);
                        this.e.unlock();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            dVar = new d(aqt.b());
                            this.e.unlock();
                        } catch (Throwable th2) {
                            this.e.unlock();
                            throw th2;
                        }
                    }
                    if (th != null) {
                        this.f4669b.notifyFailed(th);
                    }
                    return dVar;
                } catch (Throwable th3) {
                    arc.e(th3);
                    this.f4669b.notifyFailed(th3);
                    return new d(aqt.b());
                }
            }

            private Cancellable c(c cVar) {
                d dVar = this.f4670c;
                if (dVar == null) {
                    d dVar2 = new d(this.e, e(cVar));
                    this.f4670c = dVar2;
                    return dVar2;
                }
                if (!dVar.f4666a.isCancelled()) {
                    this.f4670c.f4666a = e(cVar);
                }
                return this.f4670c;
            }

            private ScheduledFuture<Void> e(c cVar) {
                return this.d.schedule(this, cVar.f4665b, cVar.d);
            }
        }

        static final class d implements Cancellable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Future<Void> f4666a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ReentrantLock f4667b;

            d(ReentrantLock reentrantLock, Future<Void> future) {
                this.f4667b = reentrantLock;
                this.f4666a = future;
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean z) {
                this.f4667b.lock();
                try {
                    this.f4666a.cancel(z);
                } finally {
                    this.f4667b.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
                this.f4667b.lock();
                try {
                    return this.f4666a.isCancelled();
                } finally {
                    this.f4667b.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        final Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new e(abstractService, scheduledExecutorService, runnable).b();
        }

        protected static final class c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f4665b;
            private final TimeUnit d;
        }
    }
}
