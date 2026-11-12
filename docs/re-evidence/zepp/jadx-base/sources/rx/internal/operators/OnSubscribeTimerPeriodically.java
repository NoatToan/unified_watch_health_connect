package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeTimerPeriodically implements Observable.OnSubscribe<Long> {
    public final long a;
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public class a implements Action0 {
        public long a;
        public final /* synthetic */ Subscriber b;
        public final /* synthetic */ Scheduler.Worker c;

        public a(Subscriber subscriber, Scheduler.Worker worker) {
            this.b = subscriber;
            this.c = worker;
        }

        @Override // rx.functions.Action0
        public void call() {
            try {
                Subscriber subscriber = this.b;
                long j = this.a;
                this.a = 1 + j;
                subscriber.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                try {
                    this.c.unsubscribe();
                } finally {
                    Exceptions.throwOrReport(th, this.b);
                }
            }
        }
    }

    public OnSubscribeTimerPeriodically(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = scheduler;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Long> subscriber) {
        Scheduler.Worker workerCreateWorker = this.d.createWorker();
        subscriber.add(workerCreateWorker);
        workerCreateWorker.schedulePeriodically(new a(subscriber, workerCreateWorker), this.a, this.b, this.c);
    }
}
