package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func2;
import rx.internal.producers.ProducerArbiter;
import rx.schedulers.Schedulers;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorRetryWithPredicate<T> implements Observable.Operator<T, Observable<T>> {
    public final Func2<Integer, Throwable, Boolean> a;

    public static final class a<T> extends Subscriber<Observable<T>> {
        public final Subscriber<? super T> f;
        public final Func2<Integer, Throwable, Boolean> g;
        public final Scheduler.Worker h;
        public final SerialSubscription i;
        public final ProducerArbiter j;
        public final AtomicInteger k = new AtomicInteger();

        /* JADX INFO: renamed from: rx.internal.operators.OperatorRetryWithPredicate$a$a, reason: collision with other inner class name */
        public class C1246a implements Action0 {
            public final /* synthetic */ Observable a;

            /* JADX INFO: renamed from: rx.internal.operators.OperatorRetryWithPredicate$a$a$a, reason: collision with other inner class name */
            public class C1247a extends Subscriber<T> {
                public boolean f;
                public final /* synthetic */ Action0 g;

                public C1247a(Action0 action0) {
                    this.g = action0;
                }

                @Override // rx.Observer
                public void onCompleted() {
                    if (this.f) {
                        return;
                    }
                    this.f = true;
                    a.this.f.onCompleted();
                }

                @Override // rx.Observer
                public void onError(Throwable th) {
                    if (this.f) {
                        return;
                    }
                    this.f = true;
                    a aVar = a.this;
                    if (!aVar.g.call(Integer.valueOf(aVar.k.get()), th).booleanValue() || a.this.h.isUnsubscribed()) {
                        a.this.f.onError(th);
                    } else {
                        a.this.h.schedule(this.g);
                    }
                }

                @Override // rx.Observer
                public void onNext(T t) {
                    if (this.f) {
                        return;
                    }
                    a.this.f.onNext(t);
                    a.this.j.produced(1L);
                }

                @Override // rx.Subscriber, rx.observers.AssertableSubscriber
                public void setProducer(Producer producer) {
                    a.this.j.setProducer(producer);
                }
            }

            public C1246a(Observable observable) {
                this.a = observable;
            }

            @Override // rx.functions.Action0
            public void call() {
                a.this.k.incrementAndGet();
                C1247a c1247a = new C1247a(this);
                a.this.i.set(c1247a);
                this.a.unsafeSubscribe(c1247a);
            }
        }

        public a(Subscriber<? super T> subscriber, Func2<Integer, Throwable, Boolean> func2, Scheduler.Worker worker, SerialSubscription serialSubscription, ProducerArbiter producerArbiter) {
            this.f = subscriber;
            this.g = func2;
            this.h = worker;
            this.i = serialSubscription;
            this.j = producerArbiter;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(Observable<T> observable) {
            this.h.schedule(new C1246a(observable));
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }
    }

    public OperatorRetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
        this.a = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super Observable<T>> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = Schedulers.trampoline().createWorker();
        subscriber.add(workerCreateWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        ProducerArbiter producerArbiter = new ProducerArbiter();
        subscriber.setProducer(producerArbiter);
        return new a(subscriber, this.a, workerCreateWorker, serialSubscription, producerArbiter);
    }
}
