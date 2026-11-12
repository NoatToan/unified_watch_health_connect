package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeTimerOnce implements Observable.OnSubscribe<Long> {
    public final long a;
    public final TimeUnit b;
    public final Scheduler c;

    public class a implements Action0 {
        public final /* synthetic */ Subscriber a;

        public a(Subscriber subscriber) {
            this.a = subscriber;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                this.a.onNext(0L);
                this.a.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this.a);
            }
        }
    }

    public OnSubscribeTimerOnce(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = timeUnit;
        this.c = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Long> subscriber) {
        Scheduler.Worker workerCreateWorker = this.c.createWorker();
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedule(new a(subscriber), this.a, this.b);
    }
}
