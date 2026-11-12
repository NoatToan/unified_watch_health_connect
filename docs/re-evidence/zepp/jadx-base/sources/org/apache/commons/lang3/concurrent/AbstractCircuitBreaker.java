package org.apache.commons.lang3.concurrent;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractCircuitBreaker<T> implements CircuitBreaker<T> {
    public static final String PROPERTY_NAME = "open";
    public final AtomicReference<State> state = new AtomicReference<>(State.CLOSED);
    private final PropertyChangeSupport a = new PropertyChangeSupport(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State CLOSED;
        public static final State OPEN;

        public static enum a extends State {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State
            public State oppositeState() {
                return State.OPEN;
            }
        }

        public static enum b extends State {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // org.apache.commons.lang3.concurrent.AbstractCircuitBreaker.State
            public State oppositeState() {
                return State.CLOSED;
            }
        }

        static {
            a aVar = new a("CLOSED", 0);
            CLOSED = aVar;
            b bVar = new b(com.thanosfisherman.wifiutils.a.a, 1);
            OPEN = bVar;
            $VALUES = new State[]{aVar, bVar};
        }

        private State(String str, int i) {
            super(str, i);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public abstract State oppositeState();
    }

    public void addChangeListener(PropertyChangeListener propertyChangeListener) {
        this.a.addPropertyChangeListener(propertyChangeListener);
    }

    public void changeState(State state) {
        if (this.state.compareAndSet(state.oppositeState(), state)) {
            this.a.firePropertyChange("open", !isOpen(state), isOpen(state));
        }
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public abstract boolean checkState();

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public void close() {
        changeState(State.CLOSED);
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public abstract boolean incrementAndCheckState(T t);

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean isClosed() {
        return !isOpen();
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public boolean isOpen() {
        return isOpen(this.state.get());
    }

    @Override // org.apache.commons.lang3.concurrent.CircuitBreaker
    public void open() {
        changeState(State.OPEN);
    }

    public void removeChangeListener(PropertyChangeListener propertyChangeListener) {
        this.a.removePropertyChangeListener(propertyChangeListener);
    }

    public static boolean isOpen(State state) {
        return state == State.OPEN;
    }
}
