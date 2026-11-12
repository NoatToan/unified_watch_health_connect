package com.google.common.util.concurrent;

import com.google.common.base.Supplier;
import defpackage.aqx;
import defpackage.aqy;
import defpackage.arc;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractExecutionThreadService implements Service {
    private static final aqy logger = new aqy(AbstractExecutionThreadService.class);
    private final Service delegate = new AnonymousClass3();

    protected abstract void run() throws Exception;

    protected void shutDown() throws Exception {
    }

    protected void startUp() throws Exception {
    }

    protected void triggerShutdown() {
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$3, reason: invalid class name */
    public class AnonymousClass3 extends AbstractService {
        AnonymousClass3() {
        }

        public /* synthetic */ String b() {
            return AbstractExecutionThreadService.this.serviceName();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected final void doStart() {
            aqx.a(AbstractExecutionThreadService.this.executor(), (Supplier<String>) new Supplier() { // from class: aqb
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return this.f681b.b();
                }
            }).execute(new Runnable() { // from class: apx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        }

        public /* synthetic */ void a() {
            try {
                AbstractExecutionThreadService.this.startUp();
                notifyStarted();
                if (isRunning()) {
                    try {
                        AbstractExecutionThreadService.this.run();
                    } catch (Throwable th) {
                        arc.e(th);
                        try {
                            AbstractExecutionThreadService.this.shutDown();
                        } catch (Exception e) {
                            arc.e(e);
                            AbstractExecutionThreadService.logger.b().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e);
                        }
                        notifyFailed(th);
                        return;
                    }
                }
                AbstractExecutionThreadService.this.shutDown();
                notifyStopped();
            } catch (Throwable th2) {
                arc.e(th2);
                notifyFailed(th2);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        protected void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    }

    protected AbstractExecutionThreadService() {
    }

    protected Executor executor() {
        return new Executor() { // from class: apy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f675c.m794xafeb5522(runnable);
            }
        };
    }

    /* JADX INFO: renamed from: lambda$executor$0$com-google-common-util-concurrent-AbstractExecutionThreadService, reason: not valid java name */
    public /* synthetic */ void m794xafeb5522(Runnable runnable) {
        aqx.e(serviceName(), runnable).start();
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
