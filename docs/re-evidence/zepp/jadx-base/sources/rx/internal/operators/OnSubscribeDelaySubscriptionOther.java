package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeDelaySubscriptionOther<T, U> implements Observable.OnSubscribe<T> {
    public final Observable<? extends T> a;
    public final Observable<U> b;

    public class a extends Subscriber<U> {
        public boolean f;
        public final /* synthetic */ Subscriber g;
        public final /* synthetic */ SerialSubscription h;

        public a(Subscriber subscriber, SerialSubscription serialSubscription) {
            this.g = subscriber;
            this.h = serialSubscription;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.h.set(Subscriptions.unsubscribed());
            OnSubscribeDelaySubscriptionOther.this.a.unsafeSubscribe(this.g);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
            } else {
                this.f = true;
                this.g.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(U u) {
            onCompleted();
        }
    }

    public OnSubscribeDelaySubscriptionOther(Observable<? extends T> observable, Observable<U> observable2) {
        this.a = observable;
        this.b = observable2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        a aVar = new a(Subscribers.wrap(subscriber), serialSubscription);
        serialSubscription.set(aVar);
        this.b.unsafeSubscribe(aVar);
    }
}
