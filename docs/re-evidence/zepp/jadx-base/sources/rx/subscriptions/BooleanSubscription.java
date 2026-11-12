package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class BooleanSubscription implements Subscription {
    public static final Action0 b = new a();
    public final AtomicReference<Action0> a;

    public static class a implements Action0 {
        @Override // rx.functions.Action0
        public void call() {
        }
    }

    public BooleanSubscription() {
        this.a = new AtomicReference<>();
    }

    public static BooleanSubscription create() {
        return new BooleanSubscription();
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        Action0 andSet;
        Action0 action0 = this.a.get();
        Action0 action1 = b;
        if (action0 == action1 || (andSet = this.a.getAndSet(action1)) == null || andSet == action1) {
            return;
        }
        andSet.call();
    }

    public static BooleanSubscription create(Action0 action0) {
        return new BooleanSubscription(action0);
    }

    private BooleanSubscription(Action0 action0) {
        this.a = new AtomicReference<>(action0);
    }
}
