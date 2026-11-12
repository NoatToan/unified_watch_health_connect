package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorUnsubscribeOn<T> implements Observable.Operator<T, T> {
    public final Scheduler a;

    public class a extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;

        public a(Subscriber subscriber) {
            this.f = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    public class b implements Action0 {
        public final /* synthetic */ Subscriber a;

        public class a implements Action0 {
            public final /* synthetic */ Scheduler.Worker a;

            public a(Scheduler.Worker worker) {
                this.a = worker;
            }

            @Override // rx.functions.Action0
            public void call() {
                b.this.a.unsubscribe();
                this.a.unsubscribe();
            }
        }

        public b(Subscriber subscriber) {
            this.a = subscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            Scheduler.Worker workerCreateWorker = OperatorUnsubscribeOn.this.a.createWorker();
            workerCreateWorker.schedule(new a(workerCreateWorker));
        }
    }

    public OperatorUnsubscribeOn(Scheduler scheduler) {
        this.a = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.add(Subscriptions.create(new b(aVar)));
        return aVar;
    }
}
