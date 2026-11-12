package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleDoOnUnsubscribe<T> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final Action0 b;

    public SingleDoOnUnsubscribe(Single.OnSubscribe<T> onSubscribe, Action0 action0) {
        this.a = onSubscribe;
        this.b = action0;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        singleSubscriber.add(Subscriptions.create(this.b));
        this.a.call(singleSubscriber);
    }
}
