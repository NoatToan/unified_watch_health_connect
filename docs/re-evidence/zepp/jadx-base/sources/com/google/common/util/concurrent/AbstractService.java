package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.xiaomi.hm.health.HMIntentHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public abstract class AbstractService implements Service {
    private static final p.a<Service.Listener> h = new a();
    private static final p.a<Service.Listener> i = new b();
    private static final p.a<Service.Listener> j;
    private static final p.a<Service.Listener> k;
    private static final p.a<Service.Listener> l;
    private static final p.a<Service.Listener> m;
    private static final p.a<Service.Listener> n;
    private static final p.a<Service.Listener> o;
    private final Monitor a = new Monitor();
    private final Monitor.Guard b = new h();
    private final Monitor.Guard c = new i();
    private final Monitor.Guard d = new g();
    private final Monitor.Guard e = new j();
    private final p<Service.Listener> f = new p<>();
    private volatile k g = new k(Service.State.NEW);

    public static class a implements p.a<Service.Listener> {
        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.starting();
        }

        public String toString() {
            return "starting()";
        }
    }

    public static class b implements p.a<Service.Listener> {
        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.running();
        }

        public String toString() {
            return "running()";
        }
    }

    public static class c implements p.a<Service.Listener> {
        public final /* synthetic */ Service.State a;

        public c(Service.State state) {
            this.a = state;
        }

        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.terminated(this.a);
        }

        public String toString() {
            return "terminated({from = " + this.a + "})";
        }
    }

    public static class d implements p.a<Service.Listener> {
        public final /* synthetic */ Service.State a;

        public d(Service.State state) {
            this.a = state;
        }

        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.stopping(this.a);
        }

        public String toString() {
            return "stopping({from = " + this.a + "})";
        }
    }

    public class e implements p.a<Service.Listener> {
        public final /* synthetic */ Service.State a;
        public final /* synthetic */ Throwable b;

        public e(Service.State state, Throwable th) {
            this.a = state;
            this.b = th;
        }

        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.failed(this.a, this.b);
        }

        public String toString() {
            return "failed({from = " + this.a + ", cause = " + this.b + "})";
        }
    }

    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Service.State.values().length];
            a = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final class g extends Monitor.Guard {
        public g() {
            super(AbstractService.this.a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    public final class h extends Monitor.Guard {
        public h() {
            super(AbstractService.this.a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state() == Service.State.NEW;
        }
    }

    public final class i extends Monitor.Guard {
        public i() {
            super(AbstractService.this.a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    public final class j extends Monitor.Guard {
        public j() {
            super(AbstractService.this.a);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().a();
        }
    }

    public static final class k {
        public final Service.State a;
        public final boolean b;

        @NullableDecl
        public final Throwable c;

        public k(Service.State state) {
            this(state, false, null);
        }

        public Service.State a() {
            return (this.b && this.a == Service.State.STARTING) ? Service.State.STOPPING : this.a;
        }

        public Throwable b() {
            Service.State state = this.a;
            Preconditions.checkState(state == Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", state);
            return this.c;
        }

        public k(Service.State state, boolean z, @NullableDecl Throwable th) {
            Preconditions.checkArgument(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.checkArgument(!((state == Service.State.FAILED) ^ (th != null)), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.a = state;
            this.b = z;
            this.c = th;
        }
    }

    static {
        Service.State state = Service.State.STARTING;
        j = i(state);
        Service.State state2 = Service.State.RUNNING;
        k = i(state2);
        l = j(Service.State.NEW);
        m = j(state);
        n = j(state2);
        o = j(Service.State.STOPPING);
    }

    @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
    private void b(Service.State state) {
        Service.State state2 = state();
        if (state2 != state) {
            if (state2 == Service.State.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but the service has FAILED", failureCause());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but was " + state2);
        }
    }

    private void c() {
        if (this.a.isOccupiedByCurrentThread()) {
            return;
        }
        this.f.c();
    }

    private void d(Service.State state, Throwable th) {
        this.f.d(new e(state, th));
    }

    private void e() {
        this.f.d(i);
    }

    private void f() {
        this.f.d(h);
    }

    private void g(Service.State state) {
        if (state == Service.State.STARTING) {
            this.f.d(j);
        } else {
            if (state != Service.State.RUNNING) {
                throw new AssertionError();
            }
            this.f.d(k);
        }
    }

    private void h(Service.State state) {
        switch (f.a[state.ordinal()]) {
            case 1:
                this.f.d(l);
                return;
            case 2:
                this.f.d(m);
                return;
            case 3:
                this.f.d(n);
                return;
            case 4:
                this.f.d(o);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private static p.a<Service.Listener> i(Service.State state) {
        return new d(state);
    }

    private static p.a<Service.Listener> j(Service.State state) {
        return new c(state);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.f.b(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.a.enterWhenUninterruptibly(this.d);
        try {
            b(Service.State.RUNNING);
        } finally {
            this.a.leave();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.a.enterWhenUninterruptibly(this.e);
        try {
            b(Service.State.TERMINATED);
        } finally {
            this.a.leave();
        }
    }

    @ForOverride
    public void doCancelStart() {
    }

    @ForOverride
    public abstract void doStart();

    @ForOverride
    public abstract void doStop();

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.g.b();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return state() == Service.State.RUNNING;
    }

    public final void notifyFailed(Throwable th) {
        Preconditions.checkNotNull(th);
        this.a.enter();
        try {
            Service.State state = state();
            int i2 = f.a[state.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3 || i2 == 4) {
                    this.g = new k(Service.State.FAILED, false, th);
                    d(state, th);
                } else if (i2 != 5) {
                }
                this.a.leave();
                c();
                return;
            }
            throw new IllegalStateException("Failed while in state:" + state, th);
        } catch (Throwable th2) {
            this.a.leave();
            c();
            throw th2;
        }
    }

    public final void notifyStarted() {
        this.a.enter();
        try {
            if (this.g.a != Service.State.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.g.a);
                notifyFailed(illegalStateException);
                throw illegalStateException;
            }
            if (this.g.b) {
                this.g = new k(Service.State.STOPPING);
                doStop();
            } else {
                this.g = new k(Service.State.RUNNING);
                e();
            }
            this.a.leave();
            c();
        } catch (Throwable th) {
            this.a.leave();
            c();
            throw th;
        }
    }

    public final void notifyStopped() {
        this.a.enter();
        try {
            Service.State state = state();
            switch (f.a[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + state);
                case 2:
                case 3:
                case 4:
                    this.g = new k(Service.State.TERMINATED);
                    h(state);
                    break;
            }
            this.a.leave();
            c();
        } catch (Throwable th) {
            this.a.leave();
            c();
            throw th;
        }
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() {
        if (!this.a.enterIf(this.b)) {
            throw new IllegalStateException("Service " + this + " has already been started");
        }
        try {
            this.g = new k(Service.State.STARTING);
            f();
            doStart();
        } catch (Throwable th) {
            try {
                notifyFailed(th);
            } finally {
                this.a.leave();
                c();
            }
        }
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.g.a();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        if (this.a.enterIf(this.c)) {
            try {
                Service.State state = state();
                switch (f.a[state.ordinal()]) {
                    case 1:
                        this.g = new k(Service.State.TERMINATED);
                        h(Service.State.NEW);
                        break;
                    case 2:
                        Service.State state2 = Service.State.STARTING;
                        this.g = new k(state2, true, null);
                        g(state2);
                        doCancelStart();
                        break;
                    case 3:
                        this.g = new k(Service.State.STOPPING);
                        g(Service.State.RUNNING);
                        doStop();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new AssertionError("isStoppable is incorrectly implemented, saw: " + state);
                }
            } catch (Throwable th) {
                try {
                    notifyFailed(th);
                } finally {
                    this.a.leave();
                    c();
                }
            }
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + state() + "]";
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.a.enterWhenUninterruptibly(this.d, j2, timeUnit)) {
            try {
                b(Service.State.RUNNING);
            } finally {
                this.a.leave();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.a.enterWhenUninterruptibly(this.e, j2, timeUnit)) {
            try {
                b(Service.State.TERMINATED);
            } finally {
                this.a.leave();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
        }
    }
}
