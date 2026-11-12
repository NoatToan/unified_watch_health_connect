package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.internal.producers.ProducerArbiter;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeSwitchIfEmpty<T> implements Observable.OnSubscribe<T> {
    public final Observable<? extends T> a;
    public final Observable<? extends T> b;

    public static final class a<T> extends Subscriber<T> {
        private final ProducerArbiter f;
        private final Subscriber<? super T> g;

        public a(Subscriber<? super T> subscriber, ProducerArbiter producerArbiter) {
            this.g = subscriber;
            this.f = producerArbiter;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.g.onNext(t);
            this.f.produced(1L);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f.setProducer(producer);
        }
    }

    public static final class b<T> extends Subscriber<T> {
        private final Subscriber<? super T> g;
        private final SerialSubscription h;
        private final ProducerArbiter i;
        private final Observable<? extends T> j;
        public volatile boolean l;
        private boolean f = true;
        public final AtomicInteger k = new AtomicInteger();

        public b(Subscriber<? super T> subscriber, SerialSubscription serialSubscription, ProducerArbiter producerArbiter, Observable<? extends T> observable) {
            this.g = subscriber;
            this.h = serialSubscription;
            this.i = producerArbiter;
            this.j = observable;
        }

        public void b(Observable<? extends T> observable) {
            if (this.k.getAndIncrement() == 0) {
                while (!this.g.isUnsubscribed()) {
                    if (!this.l) {
                        if (observable == null) {
                            a aVar = new a(this.g, this.i);
                            this.h.set(aVar);
                            this.l = true;
                            this.j.unsafeSubscribe(aVar);
                        } else {
                            this.l = true;
                            observable.unsafeSubscribe(this);
                            observable = null;
                        }
                    }
                    if (this.k.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (!this.f) {
                this.g.onCompleted();
            } else {
                if (this.g.isUnsubscribed()) {
                    return;
                }
                this.l = false;
                b(null);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f = false;
            this.g.onNext(t);
            this.i.produced(1L);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.i.setProducer(producer);
        }
    }

    public OnSubscribeSwitchIfEmpty(Observable<? extends T> observable, Observable<? extends T> observable2) {
        this.a = observable;
        this.b = observable2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        ProducerArbiter producerArbiter = new ProducerArbiter();
        b bVar = new b(subscriber, serialSubscription, producerArbiter, this.b);
        serialSubscription.set(bVar);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        bVar.b(this.a);
    }
}
