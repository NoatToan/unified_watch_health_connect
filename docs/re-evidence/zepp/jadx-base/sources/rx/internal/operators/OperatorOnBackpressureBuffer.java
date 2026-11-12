package rx.internal.operators;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.BackpressureOverflow;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.util.BackpressureDrainManager;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorOnBackpressureBuffer<T> implements Observable.Operator<T, T> {
    private final Long a;
    private final Action0 b;
    private final BackpressureOverflow.Strategy c;

    public static final class a<T> extends Subscriber<T> implements BackpressureDrainManager.BackpressureQueueCallback {
        private final AtomicLong g;
        private final Subscriber<? super T> h;
        private final BackpressureDrainManager j;
        private final Action0 k;
        private final BackpressureOverflow.Strategy l;
        private final ConcurrentLinkedQueue<Object> f = new ConcurrentLinkedQueue<>();
        private final AtomicBoolean i = new AtomicBoolean(false);

        public a(Subscriber<? super T> subscriber, Long l, Action0 action0, BackpressureOverflow.Strategy strategy) {
            this.h = subscriber;
            this.g = l != null ? new AtomicLong(l.longValue()) : null;
            this.k = action0;
            this.j = new BackpressureDrainManager(this);
            this.l = strategy;
        }

        private boolean b() throws Throwable {
            long j;
            boolean z;
            if (this.g == null) {
                return true;
            }
            do {
                j = this.g.get();
                if (j <= 0) {
                    try {
                        z = this.l.mayAttemptDrop() && poll() != null;
                    } catch (MissingBackpressureException e) {
                        if (this.i.compareAndSet(false, true)) {
                            unsubscribe();
                            this.h.onError(e);
                        }
                    }
                    Action0 action0 = this.k;
                    if (action0 != null) {
                        try {
                            action0.call();
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.j.terminateAndDrain(th);
                            return false;
                        }
                    }
                    if (!z) {
                        return false;
                    }
                }
            } while (!this.g.compareAndSet(j, j - 1));
            return true;
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public boolean accept(Object obj) {
            return NotificationLite.accept(this.h, obj);
        }

        public Producer c() {
            return this.j;
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public void complete(Throwable th) {
            if (th != null) {
                this.h.onError(th);
            } else {
                this.h.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            if (this.i.get()) {
                return;
            }
            this.j.terminateAndDrain();
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            if (this.i.get()) {
                return;
            }
            this.j.terminateAndDrain(th);
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            if (b()) {
                this.f.offer(NotificationLite.next(t));
                this.j.drain();
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object peek() {
            return this.f.peek();
        }

        @Override // rx.internal.util.BackpressureDrainManager.BackpressureQueueCallback
        public Object poll() {
            Object objPoll = this.f.poll();
            AtomicLong atomicLong = this.g;
            if (atomicLong != null && objPoll != null) {
                atomicLong.incrementAndGet();
            }
            return objPoll;
        }
    }

    public static final class b {
        public static final OperatorOnBackpressureBuffer<?> a = new OperatorOnBackpressureBuffer<>();
    }

    public OperatorOnBackpressureBuffer() {
        this.a = null;
        this.b = null;
        this.c = BackpressureOverflow.ON_OVERFLOW_DEFAULT;
    }

    public static <T> OperatorOnBackpressureBuffer<T> instance() {
        return (OperatorOnBackpressureBuffer<T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.a, this.b, this.c);
        subscriber.add(aVar);
        subscriber.setProducer(aVar.c());
        return aVar;
    }

    public OperatorOnBackpressureBuffer(long j) {
        this(j, null, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, Action0 action0) {
        this(j, action0, BackpressureOverflow.ON_OVERFLOW_DEFAULT);
    }

    public OperatorOnBackpressureBuffer(long j, Action0 action0, BackpressureOverflow.Strategy strategy) {
        if (j > 0) {
            Objects.requireNonNull(strategy, "The BackpressureOverflow strategy must not be null");
            this.a = Long.valueOf(j);
            this.b = action0;
            this.c = strategy;
            return;
        }
        throw new IllegalArgumentException("Buffer capacity must be > 0");
    }
}
