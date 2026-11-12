package rx;

import rx.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes23.dex */
public final class BackpressureOverflow {
    public static final Strategy ON_OVERFLOW_DEFAULT;
    public static final Strategy ON_OVERFLOW_DROP_LATEST;
    public static final Strategy ON_OVERFLOW_DROP_OLDEST;
    public static final Strategy ON_OVERFLOW_ERROR;

    public interface Strategy {
        boolean mayAttemptDrop() throws MissingBackpressureException;
    }

    public static final class a implements Strategy {
        public static final a a = new a();

        private a() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return false;
        }
    }

    public static final class b implements Strategy {
        public static final b a = new b();

        private b() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return true;
        }
    }

    public static final class c implements Strategy {
        public static final c a = new c();

        private c() {
        }

        @Override // rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    static {
        c cVar = c.a;
        ON_OVERFLOW_ERROR = cVar;
        ON_OVERFLOW_DEFAULT = cVar;
        ON_OVERFLOW_DROP_OLDEST = b.a;
        ON_OVERFLOW_DROP_LATEST = a.a;
    }

    private BackpressureOverflow() {
        throw new IllegalStateException("No instances!");
    }
}
