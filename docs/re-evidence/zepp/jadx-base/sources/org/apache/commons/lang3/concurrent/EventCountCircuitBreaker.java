package org.apache.commons.lang3.concurrent;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public class EventCountCircuitBreaker extends AbstractCircuitBreaker<Integer> {
    private static final Map<AbstractCircuitBreaker.State, c> g = b();
    private final AtomicReference<b> b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public static class b {
        private final int a;
        private final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public b c(int i) {
            return i != 0 ? new b(b() + i, a()) : this;
        }
    }

    public static abstract class c {
        private c() {
        }

        public abstract long a(EventCountCircuitBreaker eventCountCircuitBreaker);

        public boolean b(EventCountCircuitBreaker eventCountCircuitBreaker, b bVar, long j) {
            return j - bVar.a() > a(eventCountCircuitBreaker);
        }

        public abstract boolean c(EventCountCircuitBreaker eventCountCircuitBreaker, b bVar, b bVar2);
    }

    public static class d extends c {
        private d() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.c
        public long a(EventCountCircuitBreaker eventCountCircuitBreaker) {
            return eventCountCircuitBreaker.getOpeningInterval();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.c
        public boolean c(EventCountCircuitBreaker eventCountCircuitBreaker, b bVar, b bVar2) {
            return bVar2.b() > eventCountCircuitBreaker.getOpeningThreshold();
        }
    }

    public static class e extends c {
        private e() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.c
        public long a(EventCountCircuitBreaker eventCountCircuitBreaker) {
            return eventCountCircuitBreaker.getClosingInterval();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.c
        public boolean c(EventCountCircuitBreaker eventCountCircuitBreaker, b bVar, b bVar2) {
            return bVar2.a() != bVar.a() && bVar.b() < eventCountCircuitBreaker.getClosingThreshold();
        }
    }

    public EventCountCircuitBreaker(int i, long j, TimeUnit timeUnit, int i2, long j2, TimeUnit timeUnit2) {
        this.b = new AtomicReference<>(new b(0, 0L));
        this.c = i;
        this.d = timeUnit.toNanos(j);
        this.e = i2;
        this.f = timeUnit2.toNanos(j2);
    }

    private void a(AbstractCircuitBreaker.State state) {
        changeState(state);
        this.b.set(new b(0, d()));
    }

    private static Map<AbstractCircuitBreaker.State, c> b() {
        EnumMap enumMap = new EnumMap(AbstractCircuitBreaker.State.class);
        enumMap.put(AbstractCircuitBreaker.State.CLOSED, new d());
        enumMap.put(AbstractCircuitBreaker.State.OPEN, new e());
        return enumMap;
    }

    private b c(int i, b bVar, AbstractCircuitBreaker.State state, long j) {
        return f(state).b(this, bVar, j) ? new b(i, j) : bVar.c(i);
    }

    private boolean e(int i) {
        AbstractCircuitBreaker.State stateOppositeState;
        b bVar;
        b bVarC;
        do {
            long jD = d();
            stateOppositeState = this.state.get();
            bVar = this.b.get();
            bVarC = c(i, bVar, stateOppositeState, jD);
        } while (!g(bVar, bVarC));
        if (f(stateOppositeState).c(this, bVar, bVarC)) {
            stateOppositeState = stateOppositeState.oppositeState();
            a(stateOppositeState);
        }
        return !AbstractCircuitBreaker.isOpen(stateOppositeState);
    }

    private static c f(AbstractCircuitBreaker.State state) {
        return g.get(state);
    }

    private boolean g(b bVar, b bVar2) {
        return bVar == bVar2 || this.b.compareAndSet(bVar, bVar2);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean checkState() {
        return e(0);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
        super.close();
        this.b.set(new b(0, d()));
    }

    public long d() {
        return System.nanoTime();
    }

    public long getClosingInterval() {
        return this.f;
    }

    public int getClosingThreshold() {
        return this.e;
    }

    public long getOpeningInterval() {
        return this.d;
    }

    public int getOpeningThreshold() {
        return this.c;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void open() {
        super.open();
        this.b.set(new b(0, d()));
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean incrementAndCheckState(Integer num) throws CircuitBreakingException {
        return e(1);
    }

    public boolean incrementAndCheckState() {
        return incrementAndCheckState((Integer) 1);
    }

    public EventCountCircuitBreaker(int i, long j, TimeUnit timeUnit, int i2) {
        this(i, j, timeUnit, i2, j, timeUnit);
    }

    public EventCountCircuitBreaker(int i, long j, TimeUnit timeUnit) {
        this(i, j, timeUnit, i);
    }
}
