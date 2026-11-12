package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public abstract class AbstractExecutionThreadService implements Service {
    private static final Logger b = Logger.getLogger(AbstractExecutionThreadService.class.getName());
    private final Service a = new a();

    public class a extends AbstractService {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$a$a, reason: collision with other inner class name */
        public class C0233a implements Supplier<String> {
            public C0233a() {
            }

            @Override // com.google.common.base.Supplier
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return AbstractExecutionThreadService.this.serviceName();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractExecutionThreadService.this.startUp();
                    a.this.notifyStarted();
                    if (a.this.isRunning()) {
                        try {
                            AbstractExecutionThreadService.this.run();
                        } catch (Throwable th) {
                            try {
                                AbstractExecutionThreadService.this.shutDown();
                            } catch (Exception e) {
                                AbstractExecutionThreadService.b.log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e);
                            }
                            a.this.notifyFailed(th);
                            return;
                        }
                    }
                    AbstractExecutionThreadService.this.shutDown();
                    a.this.notifyStopped();
                } catch (Throwable th2) {
                    a.this.notifyFailed(th2);
                }
            }
        }

        public a() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.f(AbstractExecutionThreadService.this.executor(), new C0233a()).execute(new b());
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    }

    public class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            MoreExecutors.d(AbstractExecutionThreadService.this.serviceName(), runnable).start();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.a.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.a.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.a.awaitTerminated();
    }

    public Executor executor() {
        return new b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.a.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    public abstract void run() throws Exception;

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public void shutDown() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.a.startAsync();
        return this;
    }

    public void startUp() throws Exception {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.a.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.a.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    public void triggerShutdown() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.awaitTerminated(j, timeUnit);
    }
}
