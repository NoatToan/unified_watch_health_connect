package rx.internal.operators;

import rx.Observable;
import rx.Single;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleToObservable<T> implements Observable.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;

    public SingleToObservable(Single.OnSubscribe<T> onSubscribe) {
        this.a = onSubscribe;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        SingleLiftObservableOperator.a aVar = new SingleLiftObservableOperator.a(subscriber);
        subscriber.add(aVar);
        this.a.call(aVar);
    }
}
