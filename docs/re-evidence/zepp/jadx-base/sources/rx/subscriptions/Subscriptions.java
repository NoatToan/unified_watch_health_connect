package rx.subscriptions;

import java.util.concurrent.Future;
import rx.Subscription;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public final class Subscriptions {
    private static final b a = new b();

    public static final class a implements Subscription {
        public final Future<?> a;

        public a(Future<?> future) {
            this.a = future;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isCancelled();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            this.a.cancel(true);
        }
    }

    public static final class b implements Subscription {
        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
        }
    }

    private Subscriptions() {
        throw new IllegalStateException("No instances!");
    }

    public static Subscription create(Action0 action0) {
        return BooleanSubscription.create(action0);
    }

    public static Subscription empty() {
        return BooleanSubscription.create();
    }

    public static Subscription from(Future<?> future) {
        return new a(future);
    }

    public static Subscription unsubscribed() {
        return a;
    }

    public static CompositeSubscription from(Subscription... subscriptionArr) {
        return new CompositeSubscription(subscriptionArr);
    }
}
