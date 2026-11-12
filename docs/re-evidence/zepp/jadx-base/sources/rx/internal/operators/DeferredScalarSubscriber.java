package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public abstract class DeferredScalarSubscriber<T, R> extends Subscriber<T> {
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public final Subscriber<? super R> actual;
    public final AtomicInteger f = new AtomicInteger();
    public boolean hasValue;
    public R value;

    public static final class a implements Producer {
        public final DeferredScalarSubscriber<?, ?> a;

        public a(DeferredScalarSubscriber<?, ?> deferredScalarSubscriber) {
            this.a = deferredScalarSubscriber;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.b(j);
        }
    }

    public DeferredScalarSubscriber(Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    public final void b(long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + j2);
        }
        if (j2 != 0) {
            Subscriber<? super R> subscriber = this.actual;
            do {
                int i2 = this.f.get();
                if (i2 == 1 || i2 == 3 || subscriber.isUnsubscribed()) {
                    return;
                }
                if (i2 == 2) {
                    if (this.f.compareAndSet(2, 3)) {
                        subscriber.onNext(this.value);
                        if (subscriber.isUnsubscribed()) {
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    return;
                }
            } while (!this.f.compareAndSet(0, 1));
        }
    }

    public final void c() {
        Subscriber<? super R> subscriber = this.actual;
        subscriber.add(this);
        subscriber.setProducer(new a(this));
    }

    public final void complete() {
        this.actual.onCompleted();
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            complete();
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.value = null;
        this.actual.onError(th);
    }

    @Override // rx.Subscriber, rx.observers.AssertableSubscriber
    public final void setProducer(Producer producer) {
        producer.request(Long.MAX_VALUE);
    }

    public final void subscribeTo(Observable<? extends T> observable) {
        c();
        observable.unsafeSubscribe(this);
    }

    public final void complete(R r) {
        Subscriber<? super R> subscriber = this.actual;
        do {
            int i2 = this.f.get();
            if (i2 == 2 || i2 == 3 || subscriber.isUnsubscribed()) {
                return;
            }
            if (i2 == 1) {
                subscriber.onNext(r);
                if (!subscriber.isUnsubscribed()) {
                    subscriber.onCompleted();
                }
                this.f.lazySet(3);
                return;
            }
            this.value = r;
        } while (!this.f.compareAndSet(0, 2));
    }
}
