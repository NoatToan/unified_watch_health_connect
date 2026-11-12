package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorMapNotification<T, R> implements Observable.Operator<R, T> {
    public final Func1<? super T, ? extends R> a;
    public final Func1<? super Throwable, ? extends R> b;
    public final Func0<? extends R> c;

    public class a implements Producer {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.c(j);
        }
    }

    public static final class b<T, R> extends Subscriber<T> {
        public static final long o = Long.MIN_VALUE;
        public static final long p = Long.MAX_VALUE;
        public final Subscriber<? super R> f;
        public final Func1<? super T, ? extends R> g;
        public final Func1<? super Throwable, ? extends R> h;
        public final Func0<? extends R> i;
        public final AtomicLong j = new AtomicLong();
        public final AtomicLong k = new AtomicLong();
        public final AtomicReference<Producer> l = new AtomicReference<>();
        public long m;
        public R n;

        public b(Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func2, Func0<? extends R> func0) {
            this.f = subscriber;
            this.g = func1;
            this.h = func2;
            this.i = func0;
        }

        public void b() {
            long j = this.m;
            if (j == 0 || this.l.get() == null) {
                return;
            }
            BackpressureUtils.produced(this.j, j);
        }

        public void c(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == 0) {
                return;
            }
            while (true) {
                long j2 = this.j.get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    long j3 = Long.MAX_VALUE & j2;
                    if (this.j.compareAndSet(j2, Long.MIN_VALUE | BackpressureUtils.addCap(j3, j))) {
                        if (j3 == 0) {
                            if (!this.f.isUnsubscribed()) {
                                this.f.onNext(this.n);
                            }
                            if (this.f.isUnsubscribed()) {
                                return;
                            }
                            this.f.onCompleted();
                            return;
                        }
                        return;
                    }
                } else {
                    if (this.j.compareAndSet(j2, BackpressureUtils.addCap(j2, j))) {
                        AtomicReference<Producer> atomicReference = this.l;
                        Producer producer = atomicReference.get();
                        if (producer != null) {
                            producer.request(j);
                            return;
                        }
                        BackpressureUtils.getAndAddRequest(this.k, j);
                        Producer producer2 = atomicReference.get();
                        if (producer2 != null) {
                            long andSet = this.k.getAndSet(0L);
                            if (andSet != 0) {
                                producer2.request(andSet);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }

        public void d() {
            long j;
            do {
                j = this.j.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.j.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.l.get() == null) {
                if (!this.f.isUnsubscribed()) {
                    this.f.onNext(this.n);
                }
                if (this.f.isUnsubscribed()) {
                    return;
                }
                this.f.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            b();
            try {
                this.n = this.i.call();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.f);
            }
            d();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            b();
            try {
                this.n = this.h.call(th);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.f, th);
            }
            d();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.m++;
                this.f.onNext(this.g.call(t));
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.f, t);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (!this.l.compareAndSet(null, producer)) {
                throw new IllegalStateException("Producer already set!");
            }
            long andSet = this.k.getAndSet(0L);
            if (andSet != 0) {
                producer.request(andSet);
            }
        }
    }

    public OperatorMapNotification(Func1<? super T, ? extends R> func1, Func1<? super Throwable, ? extends R> func2, Func0<? extends R> func0) {
        this.a = func1;
        this.b = func2;
        this.c = func0;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        b bVar = new b(subscriber, this.a, this.b, this.c);
        subscriber.add(bVar);
        subscriber.setProducer(new a(bVar));
        return bVar;
    }
}
