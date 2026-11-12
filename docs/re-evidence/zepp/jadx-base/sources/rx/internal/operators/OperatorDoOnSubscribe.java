package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action0;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorDoOnSubscribe<T> implements Observable.Operator<T, T> {
    private final Action0 a;

    public OperatorDoOnSubscribe(Action0 action0) {
        this.a = action0;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        this.a.call();
        return Subscribers.wrap(subscriber);
    }
}
