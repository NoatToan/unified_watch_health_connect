package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSerialize<T> implements Observable.Operator<T, T> {

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
            this.f.onNext(t);
        }
    }

    public static final class b {
        public static final OperatorSerialize<Object> a = new OperatorSerialize<>();
    }

    public static <T> OperatorSerialize<T> instance() {
        return (OperatorSerialize<T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return new SerializedSubscriber(new a(subscriber, subscriber));
    }
}
