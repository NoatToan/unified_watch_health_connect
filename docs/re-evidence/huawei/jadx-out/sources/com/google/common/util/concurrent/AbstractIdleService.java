package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import defpackage.aqx;
import defpackage.arc;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractIdleService implements Service {
    private final Service delegate;
    private final Supplier<String> threadNameSupplier;

    protected abstract void shutDown() throws Exception;

    protected abstract void startUp() throws Exception;

    final class b implements Supplier<String> {
        private b() {
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String get() {
            return AbstractIdleService.this.serviceName() + " " + AbstractIdleService.this.state();
        }
    }

    public final class c extends AbstractService {
        private c() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            aqx.a(AbstractIdleService.this.executor(), (Supplier<String>) AbstractIdleService.this.threadNameSupplier).execute(new Runnable() { // from class: aqg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f685c.a();
                }
            });
        }

        public /* synthetic */ void a() {
            try {
                AbstractIdleService.this.startUp();
                notifyStarted();
            } catch (Throwable th) {
                arc.e(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStop() {
            aqx.a(AbstractIdleService.this.executor(), (Supplier<String>) AbstractIdleService.this.threadNameSupplier).execute(new Runnable() { // from class: aqd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f683a.e();
                }
            });
        }

        public /* synthetic */ void e() {
            try {
                AbstractIdleService.this.shutDown();
                notifyStopped();
            } catch (Throwable th) {
                arc.e(th);
                notifyFailed(th);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }
    }

    protected AbstractIdleService() {
        this.threadNameSupplier = new b();
        this.delegate = new c();
    }

    protected Executor executor() {
        return new Executor() { // from class: aqc
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f682a.m795xc998c392(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$executor$0$com-google-common-util-concurrent-AbstractIdleService, reason: not valid java name */
    public /* synthetic */ void m795xc998c392(Runnable runnable) {
        aqx.e(this.threadNameSupplier.get(), runnable).start();
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
    public final Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service stopAsync() {
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

    protected String serviceName() {
        return getClass().getSimpleName();
    }
}
