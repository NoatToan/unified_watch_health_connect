package rx.subscriptions;

import rx.Subscription;
import rx.internal.subscriptions.SequentialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class MultipleAssignmentSubscription implements Subscription {
    public final SequentialSubscription a = new SequentialSubscription();

    public Subscription get() {
        return this.a.current();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    public void set(Subscription subscription) {
        if (subscription == null) {
            throw new IllegalArgumentException("Subscription can not be null");
        }
        this.a.replace(subscription);
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        this.a.unsubscribe();
    }
}
