package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.TimeInterval;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTimeInterval<T> implements Observable.Operator<TimeInterval<T>, T> {
    public final Scheduler a;

    public class a extends Subscriber<T> {
        private long f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
            this.f = OperatorTimeInterval.this.a.now();
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
            long jNow = OperatorTimeInterval.this.a.now();
            this.g.onNext(new TimeInterval(jNow - this.f, t));
            this.f = jNow;
        }
    }

    public OperatorTimeInterval(Scheduler scheduler) {
        this.a = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super TimeInterval<T>> subscriber) {
        return new a(subscriber, subscriber);
    }
}
