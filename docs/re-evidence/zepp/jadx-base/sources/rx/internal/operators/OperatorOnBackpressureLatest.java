package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorOnBackpressureLatest<T> implements Observable.Operator<T, T> {

    public static final class a {
        public static final OperatorOnBackpressureLatest<Object> a = new OperatorOnBackpressureLatest<>();
    }

    public static final class b<T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        public static final Object h = new Object();
        public static final long i = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;
        public final Subscriber<? super T> a;
        public c<? super T> b;
        public final AtomicReference<Object> c = new AtomicReference<>(h);
        public Throwable d;
        public volatile boolean e;
        public boolean f;
        public boolean g;

        public b(Subscriber<? super T> subscriber) {
            this.a = subscriber;
            lazySet(-4611686018427387904L);
        }

        public void a() throws Throwable {
            boolean z;
            Object obj;
            synchronized (this) {
                boolean z2 = true;
                if (this.f) {
                    this.g = true;
                    return;
                }
                this.f = true;
                this.g = false;
                while (true) {
                    try {
                        long j = get();
                        if (j == Long.MIN_VALUE) {
                            return;
                        }
                        Object obj2 = this.c.get();
                        if (j > 0 && obj2 != (obj = h)) {
                            this.a.onNext(obj2);
                            this.c.compareAndSet(obj2, obj);
                            b(1L);
                            obj2 = obj;
                        }
                        if (obj2 == h && this.e) {
                            Throwable th = this.d;
                            if (th != null) {
                                this.a.onError(th);
                            } else {
                                this.a.onCompleted();
                            }
                        }
                        try {
                            synchronized (this) {
                                try {
                                    if (!this.g) {
                                        this.f = false;
                                        return;
                                    }
                                    this.g = false;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z2 = false;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            z = z2;
                            th = th4;
                            if (!z) {
                                synchronized (this) {
                                    this.f = false;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z = false;
                    }
                }
            }
        }

        public long b(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return j2;
                }
                j3 = j2 - j;
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.e = true;
            a();
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            this.d = th;
            this.e = true;
            a();
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            this.c.lazySet(t);
            a();
        }

        @Override // rx.Producer
        public void request(long j) throws Throwable {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j2 == -4611686018427387904L) {
                        j3 = j;
                    } else {
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j2, j3));
                if (j2 == -4611686018427387904L) {
                    this.b.requestMore(Long.MAX_VALUE);
                }
                a();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    public static final class c<T> extends Subscriber<T> {
        private final b<T> f;

        public c(b<T> bVar) {
            this.f = bVar;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            this.f.onNext(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public static <T> OperatorOnBackpressureLatest<T> instance() {
        return (OperatorOnBackpressureLatest<T>) a.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber);
        c<? super T> cVar = new c<>(bVar);
        bVar.b = cVar;
        subscriber.add(cVar);
        subscriber.add(bVar);
        subscriber.setProducer(bVar);
        return cVar;
    }
}
