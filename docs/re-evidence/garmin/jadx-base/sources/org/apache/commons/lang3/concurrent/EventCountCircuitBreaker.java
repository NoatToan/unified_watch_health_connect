package org.apache.commons.lang3.concurrent;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class EventCountCircuitBreaker extends AbstractCircuitBreaker<Integer> {
    private static final Map<AbstractCircuitBreaker.State, StateStrategy> STRATEGY_MAP = createStrategyMap();
    private final AtomicReference<CheckIntervalData> checkIntervalData;
    private final long closingInterval;
    private final int closingThreshold;
    private final long openingInterval;
    private final int openingThreshold;

    public static class CheckIntervalData {
        private final long checkIntervalStart;
        private final int eventCount;

        public CheckIntervalData(int i14, long j8) {
            this.eventCount = i14;
            this.checkIntervalStart = j8;
        }

        public long getCheckIntervalStart() {
            return this.checkIntervalStart;
        }

        public int getEventCount() {
            return this.eventCount;
        }

        public CheckIntervalData increment(int i14) {
            return i14 == 0 ? this : new CheckIntervalData(getEventCount() + i14, getCheckIntervalStart());
        }
    }

    public static abstract class StateStrategy {
        private StateStrategy() {
        }

        public abstract long fetchCheckInterval(EventCountCircuitBreaker eventCountCircuitBreaker);

        public boolean isCheckIntervalFinished(EventCountCircuitBreaker eventCountCircuitBreaker, CheckIntervalData checkIntervalData, long j8) {
            return j8 - checkIntervalData.getCheckIntervalStart() > fetchCheckInterval(eventCountCircuitBreaker);
        }

        public abstract boolean isStateTransition(EventCountCircuitBreaker eventCountCircuitBreaker, CheckIntervalData checkIntervalData, CheckIntervalData checkIntervalData2);
    }

    public static class StateStrategyClosed extends StateStrategy {
        private StateStrategyClosed() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        public long fetchCheckInterval(EventCountCircuitBreaker eventCountCircuitBreaker) {
            return eventCountCircuitBreaker.getOpeningInterval();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        public boolean isStateTransition(EventCountCircuitBreaker eventCountCircuitBreaker, CheckIntervalData checkIntervalData, CheckIntervalData checkIntervalData2) {
            return checkIntervalData2.getEventCount() > eventCountCircuitBreaker.getOpeningThreshold();
        }
    }

    public static class StateStrategyOpen extends StateStrategy {
        private StateStrategyOpen() {
            super();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        public long fetchCheckInterval(EventCountCircuitBreaker eventCountCircuitBreaker) {
            return eventCountCircuitBreaker.getClosingInterval();
        }

        @Override // org.apache.commons.lang3.concurrent.EventCountCircuitBreaker.StateStrategy
        public boolean isStateTransition(EventCountCircuitBreaker eventCountCircuitBreaker, CheckIntervalData checkIntervalData, CheckIntervalData checkIntervalData2) {
            return checkIntervalData2.getCheckIntervalStart() != checkIntervalData.getCheckIntervalStart() && checkIntervalData.getEventCount() < eventCountCircuitBreaker.getClosingThreshold();
        }
    }

    public EventCountCircuitBreaker(int i14, long j8, TimeUnit timeUnit, int i15, long j14, TimeUnit timeUnit2) {
        this.checkIntervalData = new AtomicReference<>(new CheckIntervalData(0, 0L));
        this.openingThreshold = i14;
        this.openingInterval = timeUnit.toNanos(j8);
        this.closingThreshold = i15;
        this.closingInterval = timeUnit2.toNanos(j14);
    }

    private void changeStateAndStartNewCheckInterval(AbstractCircuitBreaker.State state) {
        changeState(state);
        this.checkIntervalData.set(new CheckIntervalData(0, nanoTime()));
    }

    private static Map<AbstractCircuitBreaker.State, StateStrategy> createStrategyMap() {
        EnumMap enumMap = new EnumMap(AbstractCircuitBreaker.State.class);
        enumMap.put(AbstractCircuitBreaker.State.CLOSED, new StateStrategyClosed());
        enumMap.put(AbstractCircuitBreaker.State.OPEN, new StateStrategyOpen());
        return enumMap;
    }

    private CheckIntervalData nextCheckIntervalData(int i14, CheckIntervalData checkIntervalData, AbstractCircuitBreaker.State state, long j8) {
        return stateStrategy(state).isCheckIntervalFinished(this, checkIntervalData, j8) ? new CheckIntervalData(i14, j8) : checkIntervalData.increment(i14);
    }

    private boolean performStateCheck(int i14) {
        AbstractCircuitBreaker.State stateOppositeState;
        CheckIntervalData checkIntervalData;
        CheckIntervalData checkIntervalDataNextCheckIntervalData;
        while (true) {
            long jNanoTime = nanoTime();
            stateOppositeState = this.state.get();
            checkIntervalData = this.checkIntervalData.get();
            int i15 = i14;
            checkIntervalDataNextCheckIntervalData = nextCheckIntervalData(i15, checkIntervalData, stateOppositeState, jNanoTime);
            if (updateCheckIntervalData(checkIntervalData, checkIntervalDataNextCheckIntervalData)) {
                break;
            }
            i14 = i15;
        }
        if (stateStrategy(stateOppositeState).isStateTransition(this, checkIntervalData, checkIntervalDataNextCheckIntervalData)) {
            stateOppositeState = stateOppositeState.oppositeState();
            changeStateAndStartNewCheckInterval(stateOppositeState);
        }
        return !AbstractCircuitBreaker.isOpen(stateOppositeState);
    }

    private static StateStrategy stateStrategy(AbstractCircuitBreaker.State state) {
        return STRATEGY_MAP.get(state);
    }

    private boolean updateCheckIntervalData(CheckIntervalData checkIntervalData, CheckIntervalData checkIntervalData2) {
        if (checkIntervalData == checkIntervalData2) {
            return true;
        }
        AtomicReference<CheckIntervalData> atomicReference = this.checkIntervalData;
        while (!atomicReference.compareAndSet(checkIntervalData, checkIntervalData2)) {
            if (atomicReference.get() != checkIntervalData) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean checkState() {
        return performStateCheck(0);
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
        super.close();
        this.checkIntervalData.set(new CheckIntervalData(0, nanoTime()));
    }

    public long getClosingInterval() {
        return this.closingInterval;
    }

    public int getClosingThreshold() {
        return this.closingThreshold;
    }

    public long getOpeningInterval() {
        return this.openingInterval;
    }

    public int getOpeningThreshold() {
        return this.openingThreshold;
    }

    public boolean incrementAndCheckState() {
        return incrementAndCheckState((Integer) 1);
    }

    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public void open() {
        super.open();
        this.checkIntervalData.set(new CheckIntervalData(0, nanoTime()));
    }

    @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker, org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean incrementAndCheckState(Integer num) {
        return performStateCheck(num.intValue());
    }

    public EventCountCircuitBreaker(int i14, long j8, TimeUnit timeUnit, int i15) {
        this(i14, j8, timeUnit, i15, j8, timeUnit);
    }

    public EventCountCircuitBreaker(int i14, long j8, TimeUnit timeUnit) {
        this(i14, j8, timeUnit, i14);
    }
}
