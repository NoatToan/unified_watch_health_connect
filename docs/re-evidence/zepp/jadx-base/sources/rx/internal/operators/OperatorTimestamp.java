package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTimestamp<T> implements Observable.Operator<Timestamped<T>, T> {
    public final Scheduler a;

    public class a extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.f = subscriber2;
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
            this.f.onNext(new Timestamped(OperatorTimestamp.this.a.now(), t));
        }
    }

    public OperatorTimestamp(Scheduler scheduler) {
        this.a = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Timestamped<T>> subscriber) {
        return new a(subscriber, subscriber);
    }
}
