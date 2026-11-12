package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.base.Stopwatch;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.MultimapBuilder;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Ordering;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.xiaomi.hm.health.HMIntentHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class ServiceManager {
    private static final Logger c = Logger.getLogger(ServiceManager.class.getName());
    private static final p.a<Listener> d = new a();
    private static final p.a<Listener> e = new b();
    private final f a;
    private final ImmutableList<Service> b;

    @Beta
    public static abstract class Listener {
        public void failure(Service service) {
        }

        public void healthy() {
        }

        public void stopped() {
        }
    }

    public static class a implements p.a<Listener> {
        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Listener listener) {
            listener.healthy();
        }

        public String toString() {
            return "healthy()";
        }
    }

    public static class b implements p.a<Listener> {
        @Override // com.google.common.util.concurrent.p.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Listener listener) {
            listener.stopped();
        }

        public String toString() {
            return "stopped()";
        }
    }

    public static final class c extends Throwable {
        private c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static final class d extends AbstractService {
        private d() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStart() {
            notifyStarted();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            notifyStopped();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e extends Service.Listener {
        public final Service a;
        public final WeakReference<f> b;

        public e(Service service, WeakReference<f> weakReference) {
            this.a = service;
            this.b = weakReference;
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void failed(Service.State state, Throwable th) {
            f fVar = this.b.get();
            if (fVar != null) {
                if (!(this.a instanceof d)) {
                    ServiceManager.c.log(Level.SEVERE, "Service " + this.a + " has failed in the " + state + " state.", th);
                }
                fVar.n(this.a, state, Service.State.FAILED);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void running() {
            f fVar = this.b.get();
            if (fVar != null) {
                fVar.n(this.a, Service.State.STARTING, Service.State.RUNNING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void starting() {
            f fVar = this.b.get();
            if (fVar != null) {
                fVar.n(this.a, Service.State.NEW, Service.State.STARTING);
                if (this.a instanceof d) {
                    return;
                }
                ServiceManager.c.log(Level.FINE, "Starting {0}.", this.a);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void stopping(Service.State state) {
            f fVar = this.b.get();
            if (fVar != null) {
                fVar.n(this.a, state, Service.State.STOPPING);
            }
        }

        @Override // com.google.common.util.concurrent.Service.Listener
        public void terminated(Service.State state) {
            f fVar = this.b.get();
            if (fVar != null) {
                if (!(this.a instanceof d)) {
                    ServiceManager.c.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.a, state});
                }
                fVar.n(this.a, state, Service.State.TERMINATED);
            }
        }
    }

    public static final class f {
        public final Monitor a = new Monitor();

        @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
        public final SetMultimap<Service.State, Service> b;

        @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
        public final Multiset<Service.State> c;

        @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
        public final Map<Service, Stopwatch> d;

        @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
        public boolean e;

        @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
        public boolean f;
        public final int g;
        public final Monitor.Guard h;
        public final Monitor.Guard i;
        public final p<Listener> j;

        public class a implements Function<Map.Entry<Service, Long>, Long> {
            public a() {
            }

            @Override // com.google.common.base.Function
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Long apply(Map.Entry<Service, Long> entry) {
                return entry.getValue();
            }
        }

        public class b implements p.a<Listener> {
            public final /* synthetic */ Service a;

            public b(Service service) {
                this.a = service;
            }

            @Override // com.google.common.util.concurrent.p.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(Listener listener) {
                listener.failure(this.a);
            }

            public String toString() {
                return "failed({service=" + this.a + "})";
            }
        }

        public final class c extends Monitor.Guard {
            public c() {
                super(f.this.a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                int iCount = f.this.c.count(Service.State.RUNNING);
                f fVar = f.this;
                return iCount == fVar.g || fVar.c.contains(Service.State.STOPPING) || f.this.c.contains(Service.State.TERMINATED) || f.this.c.contains(Service.State.FAILED);
            }
        }

        public final class d extends Monitor.Guard {
            public d() {
                super(f.this.a);
            }

            @Override // com.google.common.util.concurrent.Monitor.Guard
            @GuardedBy("ServiceManagerState.this.monitor")
            public boolean isSatisfied() {
                return f.this.c.count(Service.State.TERMINATED) + f.this.c.count(Service.State.FAILED) == f.this.g;
            }
        }

        public f(ImmutableCollection<Service> immutableCollection) {
            SetMultimap<Service.State, Service> setMultimapBuild = MultimapBuilder.enumKeys(Service.State.class).linkedHashSetValues().build();
            this.b = setMultimapBuild;
            this.c = setMultimapBuild.keys();
            this.d = Maps.newIdentityHashMap();
            this.h = new c();
            this.i = new d();
            this.j = new p<>();
            this.g = immutableCollection.size();
            setMultimapBuild.putAll(Service.State.NEW, immutableCollection);
        }

        public void a(Listener listener, Executor executor) {
            this.j.b(listener, executor);
        }

        public void b() {
            this.a.enterWhenUninterruptibly(this.h);
            try {
                f();
            } finally {
                this.a.leave();
            }
        }

        public void c(long j, TimeUnit timeUnit) throws TimeoutException {
            this.a.enter();
            try {
                if (this.a.waitForUninterruptibly(this.h, j, timeUnit)) {
                    f();
                    this.a.leave();
                } else {
                    throw new TimeoutException("Timeout waiting for the services to become healthy. The following services have not started: " + Multimaps.filterKeys((SetMultimap) this.b, Predicates.in(ImmutableSet.of(Service.State.NEW, Service.State.STARTING))));
                }
            } catch (Throwable th) {
                this.a.leave();
                throw th;
            }
        }

        public void d() {
            this.a.enterWhenUninterruptibly(this.i);
            this.a.leave();
        }

        public void e(long j, TimeUnit timeUnit) throws TimeoutException {
            this.a.enter();
            try {
                if (this.a.waitForUninterruptibly(this.i, j, timeUnit)) {
                    this.a.leave();
                    return;
                }
                throw new TimeoutException("Timeout waiting for the services to stop. The following services have not stopped: " + Multimaps.filterKeys((SetMultimap) this.b, Predicates.not(Predicates.in(EnumSet.of(Service.State.TERMINATED, Service.State.FAILED)))));
            } catch (Throwable th) {
                this.a.leave();
                throw th;
            }
        }

        @GuardedBy(HMIntentHandler.TARGET_SNORE_MONITOR)
        public void f() {
            Multiset<Service.State> multiset = this.c;
            Service.State state = Service.State.RUNNING;
            if (multiset.count(state) == this.g) {
                return;
            }
            throw new IllegalStateException("Expected to be healthy after starting. The following services are not running: " + Multimaps.filterKeys((SetMultimap) this.b, Predicates.not(Predicates.equalTo(state))));
        }

        public void g() {
            Preconditions.checkState(!this.a.isOccupiedByCurrentThread(), "It is incorrect to execute listeners with the monitor held.");
            this.j.c();
        }

        public void h(Service service) {
            this.j.d(new b(service));
        }

        public void i() {
            this.j.d(ServiceManager.d);
        }

        public void j() {
            this.j.d(ServiceManager.e);
        }

        public void k() {
            this.a.enter();
            try {
                if (!this.f) {
                    this.e = true;
                    this.a.leave();
                    return;
                }
                ArrayList arrayListNewArrayList = Lists.newArrayList();
                UnmodifiableIterator<Service> it2 = l().values().iterator();
                while (it2.hasNext()) {
                    Service next = it2.next();
                    if (next.state() != Service.State.NEW) {
                        arrayListNewArrayList.add(next);
                    }
                }
                throw new IllegalArgumentException("Services started transitioning asynchronously before the ServiceManager was constructed: " + arrayListNewArrayList);
            } catch (Throwable th) {
                this.a.leave();
                throw th;
            }
        }

        public ImmutableMultimap<Service.State, Service> l() {
            ImmutableSetMultimap.Builder builder = ImmutableSetMultimap.builder();
            this.a.enter();
            try {
                for (Map.Entry<Service.State, Service> entry : this.b.entries()) {
                    if (!(entry.getValue() instanceof d)) {
                        builder.put((Map.Entry) entry);
                    }
                }
                this.a.leave();
                return builder.build();
            } catch (Throwable th) {
                this.a.leave();
                throw th;
            }
        }

        public ImmutableMap<Service, Long> m() {
            this.a.enter();
            try {
                ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(this.d.size());
                for (Map.Entry<Service, Stopwatch> entry : this.d.entrySet()) {
                    Service key = entry.getKey();
                    Stopwatch value = entry.getValue();
                    if (!value.isRunning() && !(key instanceof d)) {
                        arrayListNewArrayListWithCapacity.add(Maps.immutableEntry(key, Long.valueOf(value.elapsed(TimeUnit.MILLISECONDS))));
                    }
                }
                this.a.leave();
                Collections.sort(arrayListNewArrayListWithCapacity, Ordering.natural().onResultOf(new a()));
                return ImmutableMap.copyOf(arrayListNewArrayListWithCapacity);
            } catch (Throwable th) {
                this.a.leave();
                throw th;
            }
        }

        public void n(Service service, Service.State state, Service.State state2) {
            Preconditions.checkNotNull(service);
            Preconditions.checkArgument(state != state2);
            this.a.enter();
            try {
                this.f = true;
                if (this.e) {
                    Preconditions.checkState(this.b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                    Preconditions.checkState(this.b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                    Stopwatch stopwatchCreateStarted = this.d.get(service);
                    if (stopwatchCreateStarted == null) {
                        stopwatchCreateStarted = Stopwatch.createStarted();
                        this.d.put(service, stopwatchCreateStarted);
                    }
                    Service.State state3 = Service.State.RUNNING;
                    if (state2.compareTo(state3) >= 0 && stopwatchCreateStarted.isRunning()) {
                        stopwatchCreateStarted.stop();
                        if (!(service instanceof d)) {
                            ServiceManager.c.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, stopwatchCreateStarted});
                        }
                    }
                    Service.State state4 = Service.State.FAILED;
                    if (state2 == state4) {
                        h(service);
                    }
                    if (this.c.count(state3) == this.g) {
                        i();
                    } else if (this.c.count(Service.State.TERMINATED) + this.c.count(state4) == this.g) {
                        j();
                    }
                }
            } finally {
                this.a.leave();
                g();
            }
        }

        public void o(Service service) {
            this.a.enter();
            try {
                if (this.d.get(service) == null) {
                    this.d.put(service, Stopwatch.createStarted());
                }
            } finally {
                this.a.leave();
            }
        }
    }

    public ServiceManager(Iterable<? extends Service> iterable) {
        ImmutableList<Service> immutableListCopyOf = ImmutableList.copyOf(iterable);
        if (immutableListCopyOf.isEmpty()) {
            a aVar = null;
            c.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", (Throwable) new c(aVar));
            immutableListCopyOf = ImmutableList.of(new d(aVar));
        }
        f fVar = new f(immutableListCopyOf);
        this.a = fVar;
        this.b = immutableListCopyOf;
        WeakReference weakReference = new WeakReference(fVar);
        UnmodifiableIterator<Service> it2 = immutableListCopyOf.iterator();
        while (it2.hasNext()) {
            Service next = it2.next();
            next.addListener(new e(next, weakReference), MoreExecutors.directExecutor());
            Preconditions.checkArgument(next.state() == Service.State.NEW, "Can only manage NEW services, %s", next);
        }
        this.a.k();
    }

    public void addListener(Listener listener, Executor executor) {
        this.a.a(listener, executor);
    }

    public void awaitHealthy() {
        this.a.b();
    }

    public void awaitStopped() {
        this.a.d();
    }

    public boolean isHealthy() {
        UnmodifiableIterator<Service> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (!it2.next().isRunning()) {
                return false;
            }
        }
        return true;
    }

    public ImmutableMultimap<Service.State, Service> servicesByState() {
        return this.a.l();
    }

    @CanIgnoreReturnValue
    public ServiceManager startAsync() {
        UnmodifiableIterator<Service> it2 = this.b.iterator();
        while (it2.hasNext()) {
            Service next = it2.next();
            Service.State state = next.state();
            Preconditions.checkState(state == Service.State.NEW, "Service %s is %s, cannot start it.", next, state);
        }
        UnmodifiableIterator<Service> it3 = this.b.iterator();
        while (it3.hasNext()) {
            Service next2 = it3.next();
            try {
                this.a.o(next2);
                next2.startAsync();
            } catch (IllegalStateException e2) {
                c.log(Level.WARNING, "Unable to start Service " + next2, (Throwable) e2);
            }
        }
        return this;
    }

    public ImmutableMap<Service, Long> startupTimes() {
        return this.a.m();
    }

    @CanIgnoreReturnValue
    public ServiceManager stopAsync() {
        UnmodifiableIterator<Service> it2 = this.b.iterator();
        while (it2.hasNext()) {
            it2.next().stopAsync();
        }
        return this;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Class<?>) ServiceManager.class).add("services", Collections2.filter(this.b, Predicates.not(Predicates.instanceOf(d.class)))).toString();
    }

    public void addListener(Listener listener) {
        this.a.a(listener, MoreExecutors.directExecutor());
    }

    public void awaitHealthy(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.c(j, timeUnit);
    }

    public void awaitStopped(long j, TimeUnit timeUnit) throws TimeoutException {
        this.a.e(j, timeUnit);
    }
}
