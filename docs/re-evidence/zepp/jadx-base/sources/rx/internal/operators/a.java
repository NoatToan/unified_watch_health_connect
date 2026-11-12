package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Func3;
import rx.functions.Func4;
import rx.internal.producers.ProducerArbiter;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
class a<T> implements Observable.Operator<T, T> {
    public final InterfaceC1260a<T> a;
    public final b<T> b;
    public final Observable<? extends T> c;
    public final Scheduler d;

    /* JADX INFO: renamed from: rx.internal.operators.a$a, reason: collision with other inner class name */
    public interface InterfaceC1260a<T> extends Func3<c<T>, Long, Scheduler.Worker, Subscription> {
    }

    public interface b<T> extends Func4<c<T>, Long, T, Scheduler.Worker, Subscription> {
    }

    public static final class c<T> extends Subscriber<T> {
        public final SerialSubscription f;
        public final SerializedSubscriber<T> g;
        public final b<T> h;
        public final Observable<? extends T> i;
        public final Scheduler.Worker j;
        public final ProducerArbiter k = new ProducerArbiter();
        public boolean l;
        public long m;

        /* JADX INFO: renamed from: rx.internal.operators.a$c$a, reason: collision with other inner class name */
        public class C1261a extends Subscriber<T> {
            public C1261a() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                c.this.g.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                c.this.g.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                c.this.g.onNext(t);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                c.this.k.setProducer(producer);
            }
        }

        public c(SerializedSubscriber<T> serializedSubscriber, b<T> bVar, SerialSubscription serialSubscription, Observable<? extends T> observable, Scheduler.Worker worker) {
            this.g = serializedSubscriber;
            this.h = bVar;
            this.f = serialSubscription;
            this.i = observable;
            this.j = worker;
        }

        public void b(long j) {
            boolean z;
            synchronized (this) {
                z = true;
                if (j != this.m || this.l) {
                    z = false;
                } else {
                    this.l = true;
                }
            }
            if (z) {
                if (this.i == null) {
                    this.g.onError(new TimeoutException());
                    return;
                }
                C1261a c1261a = new C1261a();
                this.i.unsafeSubscribe(c1261a);
                this.f.set(c1261a);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            boolean z;
            synchronized (this) {
                z = true;
                if (this.l) {
                    z = false;
                } else {
                    this.l = true;
                }
            }
            if (z) {
                this.f.unsubscribe();
                this.g.onCompleted();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            boolean z;
            synchronized (this) {
                z = true;
                if (this.l) {
                    z = false;
                } else {
                    this.l = true;
                }
            }
            if (z) {
                this.f.unsubscribe();
                this.g.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long j;
            boolean z;
            synchronized (this) {
                if (this.l) {
                    j = this.m;
                    z = false;
                } else {
                    j = this.m + 1;
                    this.m = j;
                    z = true;
                }
            }
            if (z) {
                this.g.onNext(t);
                this.f.set(this.h.call(this, Long.valueOf(j), t, this.j));
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.k.setProducer(producer);
        }
    }

    public a(InterfaceC1260a<T> interfaceC1260a, b<T> bVar, Observable<? extends T> observable, Scheduler scheduler) {
        this.a = interfaceC1260a;
        this.b = bVar;
        this.c = observable;
        this.d = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        subscriber.add(workerCreateWorker);
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        serializedSubscriber.add(serialSubscription);
        c cVar = new c(serializedSubscriber, this.b, serialSubscription, this.c, workerCreateWorker);
        serializedSubscriber.add(cVar);
        serializedSubscriber.setProducer(cVar.k);
        serialSubscription.set(this.a.call(cVar, 0L, workerCreateWorker));
        return cVar;
    }
}
