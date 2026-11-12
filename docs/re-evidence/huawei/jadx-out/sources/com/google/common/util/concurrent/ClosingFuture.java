package com.google.common.util.concurrent;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ClosingFuture;
import com.google.errorprone.annotations.DoNotMock;
import defpackage.aqx;
import defpackage.aqy;
import defpackage.arc;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
@ElementTypesAreNonnullByDefault
public final class ClosingFuture<V> {
    private static final aqy e = new aqy(ClosingFuture.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FluentFuture<V> f4690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference<State> f4691c;
    private final c d;

    public interface AsyncClosingCallable<V> {
        ClosingFuture<V> call(a aVar) throws Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        ClosingFuture<U> apply(a aVar, @ParametricNullness T t) throws Exception;
    }

    public interface ClosingCallable<V> {
        @ParametricNullness
        V call(a aVar) throws Exception;
    }

    public interface ClosingFunction<T, U> {
        @ParametricNullness
        U apply(a aVar, @ParametricNullness T t) throws Exception;
    }

    @DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {

        public interface AsyncCombiningCallable<V> {
            ClosingFuture<V> call(a aVar, e eVar) throws Exception;
        }

        public interface CombiningCallable<V> {
            @ParametricNullness
            V call(a aVar, e eVar) throws Exception;
        }
    }

    public static final class Combiner2<V1, V2> extends Combiner {

        public interface AsyncClosingFunction2<V1, V2, U> {
            ClosingFuture<U> apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2) throws Exception;
        }

        public interface ClosingFunction2<V1, V2, U> {
            @ParametricNullness
            U apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2) throws Exception;
        }
    }

    public static final class Combiner3<V1, V2, V3> extends Combiner {

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            ClosingFuture<U> apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3) throws Exception;
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            @ParametricNullness
            U apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3) throws Exception;
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            ClosingFuture<U> apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4) throws Exception;
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @ParametricNullness
            U apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4) throws Exception;
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            ClosingFuture<U> apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4, @ParametricNullness V5 v5) throws Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @ParametricNullness
            U apply(a aVar, @ParametricNullness V1 v1, @ParametricNullness V2 v2, @ParametricNullness V3 v3, @ParametricNullness V4 v4, @ParametricNullness V5 v5) throws Exception;
        }
    }

    enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(b<V> bVar);
    }

    public static final class a {
    }

    public static final class b<V> {
    }

    public static final class e {
    }

    public FluentFuture<V> a() {
        if (a(State.OPEN, State.WILL_CLOSE)) {
            e.b().log(Level.FINER, "will close {0}", this);
            this.f4690b.addListener(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.1
                @Override // java.lang.Runnable
                public void run() {
                    ClosingFuture.this.d(State.WILL_CLOSE, State.CLOSING);
                    ClosingFuture.this.e();
                    ClosingFuture.this.d(State.CLOSING, State.CLOSED);
                }
            }, aqx.e());
        } else {
            switch (AnonymousClass3.e[this.f4691c.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        return this.f4690b;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ClosingFuture$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[State.values().length];
            e = iArr;
            try {
                iArr[State.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[State.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[State.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[State.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[State.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        e.b().log(Level.FINER, "closing {0}", this);
        this.d.close();
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("state", this.f4691c.get()).addValue(this.f4690b).toString();
    }

    protected void finalize() {
        if (this.f4691c.get().equals(State.OPEN)) {
            e.b().log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(@CheckForNull final Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: aqo
                @Override // java.lang.Runnable
                public final void run() {
                    ClosingFuture.a(closeable);
                }
            });
        } catch (RejectedExecutionException e2) {
            aqy aqyVar = e;
            if (aqyVar.b().isLoggable(Level.WARNING)) {
                aqyVar.b().log(Level.WARNING, String.format("while submitting close to %s; will close inline", executor), (Throwable) e2);
            }
            d(closeable, aqx.e());
        }
    }

    public static /* synthetic */ void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception e2) {
            arc.e(e2);
            e.b().log(Level.WARNING, "thrown by close()", (Throwable) e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(State state, State state2) {
        Preconditions.checkState(a(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    private boolean a(State state, State state2) {
        return LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.f4691c, state, state2);
    }

    static final class c extends IdentityHashMap<Closeable, Executor> implements Closeable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f4693c;

        @CheckForNull
        private volatile CountDownLatch e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f4693c) {
                return;
            }
            synchronized (this) {
                if (this.f4693c) {
                    return;
                }
                this.f4693c = true;
                for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                    ClosingFuture.d(entry.getKey(), entry.getValue());
                }
                clear();
                if (this.e != null) {
                    this.e.countDown();
                }
            }
        }
    }
}
