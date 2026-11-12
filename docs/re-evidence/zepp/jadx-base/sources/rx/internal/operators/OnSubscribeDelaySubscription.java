package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeDelaySubscription<T> implements Observable.OnSubscribe<T> {
    public final Observable<? extends T> a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public class a implements Action0 {
        public final /* synthetic */ Subscriber a;

        public a(Subscriber subscriber) {
            this.a = subscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.a.isUnsubscribed()) {
                return;
            }
            OnSubscribeDelaySubscription.this.a.unsafeSubscribe(Subscribers.wrap(this.a));
        }
    }

    public OnSubscribeDelaySubscription(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = observable;
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedule(new a(subscriber), this.b, this.c);
    }
}
