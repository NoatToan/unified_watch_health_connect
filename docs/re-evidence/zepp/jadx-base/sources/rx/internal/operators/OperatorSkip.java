package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSkip<T> implements Observable.Operator<T, T> {
    public final int a;

    public class a extends Subscriber<T> {
        public int f;
        public final /* synthetic */ Subscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, Subscriber subscriber2) {
            super(subscriber);
            this.g = subscriber2;
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
            int i = this.f;
            if (i >= OperatorSkip.this.a) {
                this.g.onNext(t);
            } else {
                this.f = i + 1;
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.g.setProducer(producer);
            producer.request(OperatorSkip.this.a);
        }
    }

    public OperatorSkip(int i) {
        if (i >= 0) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new a(subscriber, subscriber);
    }
}
