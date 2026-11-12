package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTakeTimed<T> implements Observable.Operator<T, T> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public static final class a<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super T> f;

        public a(Subscriber<? super T> subscriber) {
            super(subscriber);
            this.f = subscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            onCompleted();
        }

        @Override // rx.Observer
        public void onCompleted() {
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
            this.f.onNext(t);
        }
    }

    public OperatorTakeTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.c.createWorker();
        subscriber.add(workerCreateWorker);
        a aVar = new a(new SerializedSubscriber(subscriber));
        workerCreateWorker.schedule(aVar, this.a, this.b);
        return aVar;
    }
}
