package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.schedulers.Timestamped;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorSkipLastTimed<T> implements Observable.Operator<T, T> {
    public final long a;
    public final Scheduler b;

    public class a extends Subscriber<T> {
        private Deque<Timestamped<T>> f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
            this.f = new ArrayDeque();
        }

        private void b(long j) {
            long j2 = j - OperatorSkipLastTimed.this.a;
            while (!this.f.isEmpty()) {
                Timestamped<T> first = this.f.getFirst();
                if (first.getTimestampMillis() >= j2) {
                    return;
                }
                this.f.removeFirst();
                this.g.onNext(first.getValue());
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            b(OperatorSkipLastTimed.this.b.now());
            this.g.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            long jNow = OperatorSkipLastTimed.this.b.now();
            b(jNow);
            this.f.offerLast(new Timestamped<>(jNow, t));
        }
    }

    public OperatorSkipLastTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = timeUnit.toMillis(j);
        this.b = scheduler;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
