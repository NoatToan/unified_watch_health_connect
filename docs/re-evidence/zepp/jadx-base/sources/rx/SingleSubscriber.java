package rx;

import rx.internal.util.SubscriptionList;

/* JADX INFO: loaded from: classes23.dex */
public abstract class SingleSubscriber<T> implements Subscription {
    private final SubscriptionList a = new SubscriptionList();

    public final void add(Subscription subscription) {
        this.a.add(subscription);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    public abstract void onError(Throwable th);

    public abstract void onSuccess(T t);

    @Override // rx.Subscription
    public final void unsubscribe() {
        this.a.unsubscribe();
    }
}
