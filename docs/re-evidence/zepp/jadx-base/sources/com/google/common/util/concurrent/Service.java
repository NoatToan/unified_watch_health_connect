package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public interface Service {

    @Beta
    public static abstract class Listener {
        public void failed(State state, Throwable th) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(State state) {
        }

        public void terminated(State state) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Beta
    public static abstract class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State FAILED;
        public static final State NEW;
        public static final State RUNNING;
        public static final State STARTING;
        public static final State STOPPING;
        public static final State TERMINATED;

        public static enum a extends State {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean a() {
                return false;
            }
        }

        public static enum b extends State {
            public b(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean a() {
                return false;
            }
        }

        public static enum c extends State {
            public c(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean a() {
                return false;
            }
        }

        public static enum d extends State {
            public d(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean a() {
                return false;
            }
        }

        public static enum e extends State {
            public e(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean a() {
                return true;
            }
        }

        public static enum f extends State {
            public f(String str, int i) {
                super(str, i);
            }

            @Override // com.google.common.util.concurrent.Service.State
            public boolean a() {
                return true;
            }
        }

        static {
            a aVar = new a("NEW", 0);
            NEW = aVar;
            b bVar = new b("STARTING", 1);
            STARTING = bVar;
            c cVar = new c(DebugCoroutineInfoImplKt.RUNNING, 2);
            RUNNING = cVar;
            d dVar = new d("STOPPING", 3);
            STOPPING = dVar;
            e eVar = new e("TERMINATED", 4);
            TERMINATED = eVar;
            f fVar = new f("FAILED", 5);
            FAILED = fVar;
            $VALUES = new State[]{aVar, bVar, cVar, dVar, eVar, fVar};
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

        public abstract boolean a();
    }

    void addListener(Listener listener, Executor executor);

    void awaitRunning();

    void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException;

    Throwable failureCause();

    boolean isRunning();

    @CanIgnoreReturnValue
    Service startAsync();

    State state();

    @CanIgnoreReturnValue
    Service stopAsync();
}
