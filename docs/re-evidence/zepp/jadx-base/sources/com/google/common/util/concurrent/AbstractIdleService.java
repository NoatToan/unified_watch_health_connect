package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public abstract class AbstractIdleService implements Service {
    private final Supplier<String> a;
    private final Service b;

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            MoreExecutors.d((String) AbstractIdleService.this.a.get(), runnable).start();
        }
    }

    public final class b extends AbstractService {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractIdleService.this.startUp();
                    b.this.notifyStarted();
                } catch (Throwable th) {
                    b.this.notifyFailed(th);
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractIdleService$b$b, reason: collision with other inner class name */
        public class RunnableC0234b implements Runnable {
            public RunnableC0234b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractIdleService.this.shutDown();
                    b.this.notifyStopped();
                } catch (Throwable th) {
                    b.this.notifyFailed(th);
                }
            }
        }

        private b() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.f(AbstractIdleService.this.executor(), AbstractIdleService.this.a).execute(new a());
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            MoreExecutors.f(AbstractIdleService.this.executor(), AbstractIdleService.this.a).execute(new RunnableC0234b());
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }

        public /* synthetic */ b(AbstractIdleService abstractIdleService, a aVar) {
            this();
        }
    }

    public final class c implements Supplier<String> {
        private c() {
        }

        @Override // com.google.common.base.Supplier
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return AbstractIdleService.this.serviceName() + " " + AbstractIdleService.this.state();
        }

        public /* synthetic */ c(AbstractIdleService abstractIdleService, a aVar) {
            this();
        }
    }

    public AbstractIdleService() {
        a aVar = null;
        this.a = new c(this, aVar);
        this.b = new b(this, aVar);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.b.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.b.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.b.awaitTerminated();
    }

    public Executor executor() {
        return new a();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.b.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public abstract void shutDown() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        this.b.startAsync();
        return this;
    }

    public abstract void startUp() throws Exception;

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.b.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.b.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        this.b.awaitRunning(j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        this.b.awaitTerminated(j, timeUnit);
    }
}
