package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorThrottleFirst<T> implements Observable.Operator<T, T> {
    public final long a;
    public final Scheduler b;

    public class a extends Subscriber<T> {
        private long f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
            this.f = -1L;
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
            long jNow = OperatorThrottleFirst.this.b.now();
            long j = this.f;
            if (j == -1 || jNow < j || jNow - j >= OperatorThrottleFirst.this.a) {
                this.f = jNow;
                this.g.onNext(t);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorThrottleFirst(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
