package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeDelaySubscriptionWithSelector<T, U> implements Observable.OnSubscribe<T> {
    public final Observable<? extends T> a;
    public final Func0<? extends Observable<U>> b;

    public class a extends Subscriber<U> {
        public final /* synthetic */ Subscriber f;

        public a(Subscriber subscriber) {
            this.f = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            OnSubscribeDelaySubscriptionWithSelector.this.a.unsafeSubscribe(Subscribers.wrap(this.f));
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(U u) {
        }
    }

    public OnSubscribeDelaySubscriptionWithSelector(Observable<? extends T> observable, Func0<? extends Observable<U>> func0) {
        this.a = observable;
        this.b = func0;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        try {
            this.b.call().take(1).unsafeSubscribe(new a(subscriber));
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }
}
