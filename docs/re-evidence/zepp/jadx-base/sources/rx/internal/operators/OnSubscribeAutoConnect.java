package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements Observable.OnSubscribe<T> {
    public final ConnectableObservable<? extends T> a;
    public final int b;
    public final Action1<? super Subscription> c;

    public OnSubscribeAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i, Action1<? super Subscription> action1) {
        if (i <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.a = connectableObservable;
        this.b = i;
        this.c = action1;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.a.unsafeSubscribe(Subscribers.wrap(subscriber));
        if (incrementAndGet() == this.b) {
            this.a.connect(this.c);
        }
    }
}
