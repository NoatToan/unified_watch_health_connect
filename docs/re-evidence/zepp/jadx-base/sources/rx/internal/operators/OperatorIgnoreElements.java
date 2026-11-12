package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorIgnoreElements<T> implements Observable.Operator<T, T> {

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
        }
    }

    public static final class b {
        public static final OperatorIgnoreElements<?> a = new OperatorIgnoreElements<>();
    }

    public static <T> OperatorIgnoreElements<T> instance() {
        return (OperatorIgnoreElements<T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.add(aVar);
        return aVar;
    }
}
