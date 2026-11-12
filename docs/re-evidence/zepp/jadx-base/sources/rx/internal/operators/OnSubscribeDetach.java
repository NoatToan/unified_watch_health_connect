package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeDetach<T> implements Observable.OnSubscribe<T> {
    public final Observable<T> a;

    public static final class a<T> implements Producer, Subscription {
        public final b<T> a;

        public a(b<T> bVar) {
            this.a = bVar;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.b(j);
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.c();
        }
    }

    public static final class b<T> extends Subscriber<T> {
        public final AtomicReference<Subscriber<? super T>> f;
        public final AtomicReference<Producer> g = new AtomicReference<>();
        public final AtomicLong h = new AtomicLong();

        public b(Subscriber<? super T> subscriber) {
            this.f = new AtomicReference<>(subscriber);
        }

        public void b(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            Producer producer = this.g.get();
            if (producer != null) {
                producer.request(j);
                return;
            }
            BackpressureUtils.getAndAddRequest(this.h, j);
            Producer producer2 = this.g.get();
            if (producer2 == null || producer2 == c.INSTANCE) {
                return;
            }
            producer2.request(this.h.getAndSet(0L));
        }

        public void c() {
            this.g.lazySet(c.INSTANCE);
            this.f.lazySet(null);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.lazySet(c.INSTANCE);
            Subscriber<? super T> andSet = this.f.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.lazySet(c.INSTANCE);
            Subscriber<? super T> andSet = this.f.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            Subscriber<? super T> subscriber = this.f.get();
            if (subscriber != null) {
                subscriber.onNext(t);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            if (this.g.compareAndSet(null, producer)) {
                producer.request(this.h.getAndSet(0L));
            } else if (this.g.get() != c.INSTANCE) {
                throw new IllegalStateException("Producer already set!");
            }
        }
    }

    public enum c implements Producer {
        INSTANCE;

        @Override // rx.Producer
        public void request(long j) {
        }
    }

    public OnSubscribeDetach(Observable<T> observable) {
        this.a = observable;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber);
        a aVar = new a(bVar);
        subscriber.add(aVar);
        subscriber.setProducer(aVar);
        this.a.unsafeSubscribe(bVar);
    }
}
