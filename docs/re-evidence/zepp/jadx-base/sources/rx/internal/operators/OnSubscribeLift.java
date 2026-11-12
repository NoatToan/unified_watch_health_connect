package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeLift<T, R> implements Observable.OnSubscribe<R> {
    public final Observable.OnSubscribe<T> a;
    public final Observable.Operator<? extends R, ? super T> b;

    public OnSubscribeLift(Observable.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.a = onSubscribe;
        this.b = operator;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        try {
            Subscriber<? super T> subscriberCall = RxJavaHooks.onObservableLift(this.b).call(subscriber);
            try {
                subscriberCall.onStart();
                this.a.call(subscriberCall);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                subscriberCall.onError(th);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }
}
