package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeDefer<T> implements Observable.OnSubscribe<T> {
    public final Func0<? extends Observable<? extends T>> a;

    public OnSubscribeDefer(Func0<? extends Observable<? extends T>> func0) {
        this.a = func0;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        try {
            this.a.call().unsafeSubscribe(Subscribers.wrap(subscriber));
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }
}
