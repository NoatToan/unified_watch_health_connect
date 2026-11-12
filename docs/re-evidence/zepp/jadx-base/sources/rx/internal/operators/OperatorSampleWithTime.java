package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSampleWithTime<T> implements Observable.Operator<T, T> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public static final class a<T> extends Subscriber<T> implements Action0 {
        private static final Object h = new Object();
        private final Subscriber<? super T> f;
        public final AtomicReference<Object> g = new AtomicReference<>(h);

        public a(Subscriber<? super T> subscriber) {
            this.f = subscriber;
        }

        private void b() {
            AtomicReference<Object> atomicReference = this.g;
            Object obj = h;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f.onNext(andSet);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }

        @Override // rx.functions.Action0
        public void call() {
            b();
        }

        @Override // rx.Observer
        public void onCompleted() {
            b();
            this.f.onCompleted();
            unsubscribe();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.g.set(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorSampleWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Scheduler.Worker workerCreateWorker = this.c.createWorker();
        subscriber.add(workerCreateWorker);
        a aVar = new a(serializedSubscriber);
        subscriber.add(aVar);
        long j = this.a;
        workerCreateWorker.schedulePeriodically(aVar, j, j, this.b);
        return aVar;
    }
}
