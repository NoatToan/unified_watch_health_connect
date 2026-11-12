package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import defpackage.arc;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractService implements Service {
    private static final ListenerCallQueue.Event<Service.Listener> STARTING_EVENT = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.2
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.starting();
        }

        public String toString() {
            return "starting()";
        }
    };
    private static final ListenerCallQueue.Event<Service.Listener> RUNNING_EVENT = new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.3
        @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void call(Service.Listener listener) {
            listener.running();
        }

        public String toString() {
            return "running()";
        }
    };
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_STARTING_EVENT = stoppingEvent(Service.State.STARTING);
    private static final ListenerCallQueue.Event<Service.Listener> STOPPING_FROM_RUNNING_EVENT = stoppingEvent(Service.State.RUNNING);
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_NEW_EVENT = terminatedEvent(Service.State.NEW);
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STARTING_EVENT = terminatedEvent(Service.State.STARTING);
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_RUNNING_EVENT = terminatedEvent(Service.State.RUNNING);
    private static final ListenerCallQueue.Event<Service.Listener> TERMINATED_FROM_STOPPING_EVENT = terminatedEvent(Service.State.STOPPING);
    private final Monitor monitor = new Monitor();
    private final Monitor.Guard isStartable = new c();
    private final Monitor.Guard isStoppable = new a();
    private final Monitor.Guard hasReachedRunning = new b();
    private final Monitor.Guard isStopped = new d();
    private final ListenerCallQueue<Service.Listener> listeners = new ListenerCallQueue<>();
    private volatile e snapshot = new e(Service.State.NEW);

    protected void doCancelStart() {
    }

    protected abstract void doStart();

    protected abstract void doStop();

    private static ListenerCallQueue.Event<Service.Listener> terminatedEvent(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.1
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void call(Service.Listener listener) {
                listener.terminated(state);
            }

            public String toString() {
                return "terminated({from = " + state + "})";
            }
        };
    }

    private static ListenerCallQueue.Event<Service.Listener> stoppingEvent(final Service.State state) {
        return new ListenerCallQueue.Event<Service.Listener>() { // from class: com.google.common.util.concurrent.AbstractService.4
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void call(Service.Listener listener) {
                listener.stopping(state);
            }

            public String toString() {
                return "stopping({from = " + state + "})";
            }
        };
    }

    final class c extends Monitor.Guard {
        c() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state() == Service.State.NEW;
        }
    }

    final class a extends Monitor.Guard {
        a() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) <= 0;
        }
    }

    final class b extends Monitor.Guard {
        b() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.RUNNING) >= 0;
        }
    }

    final class d extends Monitor.Guard {
        d() {
            super(AbstractService.this.monitor);
        }

        @Override // com.google.common.util.concurrent.Monitor.Guard
        public boolean isSatisfied() {
            return AbstractService.this.state().compareTo(Service.State.TERMINATED) >= 0;
        }
    }

    protected AbstractService() {
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service startAsync() throws Exception {
        if (this.monitor.b(this.isStartable)) {
            try {
                this.snapshot = new e(Service.State.STARTING);
                enqueueStartingEvent();
                doStart();
            } catch (Throwable th) {
                try {
                    arc.e(th);
                    notifyFailed(th);
                } finally {
                    this.monitor.b();
                    dispatchListenerEvents();
                }
            }
            return this;
        }
        throw new IllegalStateException("Service " + this + " has already been started");
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service stopAsync() throws Exception {
        if (this.monitor.b(this.isStoppable)) {
            try {
                Service.State state = state();
                switch (AnonymousClass9.f4682b[state.ordinal()]) {
                    case 1:
                        this.snapshot = new e(Service.State.TERMINATED);
                        enqueueTerminatedEvent(Service.State.NEW);
                        break;
                    case 2:
                        this.snapshot = new e(Service.State.STARTING, true, null);
                        enqueueStoppingEvent(Service.State.STARTING);
                        doCancelStart();
                        break;
                    case 3:
                        this.snapshot = new e(Service.State.STOPPING);
                        enqueueStoppingEvent(Service.State.RUNNING);
                        doStop();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        throw new AssertionError("isStoppable is incorrectly implemented, saw: " + state);
                }
                this.monitor.b();
                dispatchListenerEvents();
                return this;
            } catch (Throwable th) {
                try {
                    arc.e(th);
                    notifyFailed(th);
                } finally {
                    this.monitor.b();
                    dispatchListenerEvents();
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractService$9, reason: invalid class name */
    static /* synthetic */ class AnonymousClass9 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4682b;

        static {
            int[] iArr = new int[Service.State.values().length];
            f4682b = iArr;
            try {
                iArr[Service.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4682b[Service.State.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4682b[Service.State.RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4682b[Service.State.STOPPING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4682b[Service.State.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4682b[Service.State.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.monitor.d(this.hasReachedRunning);
        try {
            checkCurrentState(Service.State.RUNNING);
        } finally {
            this.monitor.b();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.monitor.e(this.hasReachedRunning, j, timeUnit)) {
            try {
                checkCurrentState(Service.State.RUNNING);
            } finally {
                this.monitor.b();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach the RUNNING state.");
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.monitor.d(this.isStopped);
        try {
            checkCurrentState(Service.State.TERMINATED);
        } finally {
            this.monitor.b();
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.monitor.e(this.isStopped, j, timeUnit)) {
            try {
                checkCurrentState(Service.State.TERMINATED);
            } finally {
                this.monitor.b();
            }
        } else {
            throw new TimeoutException("Timed out waiting for " + this + " to reach a terminal state. Current state: " + state());
        }
    }

    private void checkCurrentState(Service.State state) {
        Service.State state2 = state();
        if (state2 != state) {
            if (state2 == Service.State.FAILED) {
                throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but the service has FAILED", failureCause());
            }
            throw new IllegalStateException("Expected the service " + this + " to be " + state + ", but was " + state2);
        }
    }

    protected final void notifyStarted() throws Exception {
        this.monitor.c();
        try {
            if (this.snapshot.d != Service.State.STARTING) {
                IllegalStateException illegalStateException = new IllegalStateException("Cannot notifyStarted() when the service is " + this.snapshot.d);
                notifyFailed(illegalStateException);
                throw illegalStateException;
            }
            if (this.snapshot.f4686a) {
                this.snapshot = new e(Service.State.STOPPING);
                doStop();
            } else {
                this.snapshot = new e(Service.State.RUNNING);
                enqueueRunningEvent();
            }
            this.monitor.b();
            dispatchListenerEvents();
        } catch (Throwable th) {
            this.monitor.b();
            dispatchListenerEvents();
            throw th;
        }
    }

    protected final void notifyStopped() throws Exception {
        this.monitor.c();
        try {
            Service.State state = state();
            switch (AnonymousClass9.f4682b[state.ordinal()]) {
                case 1:
                case 5:
                case 6:
                    throw new IllegalStateException("Cannot notifyStopped() when the service is " + state);
                case 2:
                case 3:
                case 4:
                    this.snapshot = new e(Service.State.TERMINATED);
                    enqueueTerminatedEvent(state);
                    break;
            }
            this.monitor.b();
            dispatchListenerEvents();
        } catch (Throwable th) {
            this.monitor.b();
            dispatchListenerEvents();
            throw th;
        }
    }

    protected final void notifyFailed(Throwable th) throws Exception {
        Preconditions.checkNotNull(th);
        this.monitor.c();
        try {
            Service.State state = state();
            int i = AnonymousClass9.f4682b[state.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    this.snapshot = new e(Service.State.FAILED, false, th);
                    enqueueFailedEvent(state, th);
                } else if (i != 5) {
                }
                this.monitor.b();
                dispatchListenerEvents();
                return;
            }
            throw new IllegalStateException("Failed while in state:" + state, th);
        } catch (Throwable th2) {
            this.monitor.b();
            dispatchListenerEvents();
            throw th2;
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return state() == Service.State.RUNNING;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.snapshot.a();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.snapshot.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.listeners.d(listener, executor);
    }

    public String toString() {
        return getClass().getSimpleName() + " [" + state() + "]";
    }

    private void dispatchListenerEvents() throws Exception {
        if (this.monitor.d()) {
            return;
        }
        this.listeners.c();
    }

    private void enqueueStartingEvent() {
        this.listeners.b(STARTING_EVENT);
    }

    private void enqueueRunningEvent() {
        this.listeners.b(RUNNING_EVENT);
    }

    private void enqueueStoppingEvent(Service.State state) {
        if (state == Service.State.STARTING) {
            this.listeners.b(STOPPING_FROM_STARTING_EVENT);
        } else {
            if (state == Service.State.RUNNING) {
                this.listeners.b(STOPPING_FROM_RUNNING_EVENT);
                return;
            }
            throw new AssertionError();
        }
    }

    private void enqueueTerminatedEvent(Service.State state) {
        switch (AnonymousClass9.f4682b[state.ordinal()]) {
            case 1:
                this.listeners.b(TERMINATED_FROM_NEW_EVENT);
                return;
            case 2:
                this.listeners.b(TERMINATED_FROM_STARTING_EVENT);
                return;
            case 3:
                this.listeners.b(TERMINATED_FROM_RUNNING_EVENT);
                return;
            case 4:
                this.listeners.b(TERMINATED_FROM_STOPPING_EVENT);
                return;
            case 5:
            case 6:
                throw new AssertionError();
            default:
                return;
        }
    }

    private void enqueueFailedEvent(final Service.State state, final Throwable th) {
        this.listeners.b(new ListenerCallQueue.Event<Service.Listener>(this) { // from class: com.google.common.util.concurrent.AbstractService.5
            @Override // com.google.common.util.concurrent.ListenerCallQueue.Event
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void call(Service.Listener listener) {
                listener.failed(state, th);
            }

            public String toString() {
                return "failed({from = " + state + ", cause = " + th + "})";
            }
        });
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f4686a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final Throwable f4687c;
        final Service.State d;

        e(Service.State state) {
            this(state, false, null);
        }

        e(Service.State state, boolean z, @CheckForNull Throwable th) {
            Preconditions.checkArgument(!z || state == Service.State.STARTING, "shutdownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            Preconditions.checkArgument((th != null) == (state == Service.State.FAILED), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.d = state;
            this.f4686a = z;
            this.f4687c = th;
        }

        Service.State a() {
            if (this.f4686a && this.d == Service.State.STARTING) {
                return Service.State.STOPPING;
            }
            return this.d;
        }

        Throwable e() {
            Preconditions.checkState(this.d == Service.State.FAILED, "failureCause() is only valid if the service has failed, service is %s", this.d);
            return (Throwable) Objects.requireNonNull(this.f4687c);
        }
    }
}
