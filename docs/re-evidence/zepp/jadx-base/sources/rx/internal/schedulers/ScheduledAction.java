package rx.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Subscription;
import rx.exceptions.OnErrorNotImplementedException;
import rx.functions.Action0;
import rx.internal.util.SubscriptionList;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class ScheduledAction extends AtomicReference<Thread> implements Runnable, Subscription {
    private static final long serialVersionUID = -3962399486978279857L;
    public final SubscriptionList a;
    public final Action0 b;

    public final class a implements Subscription {
        private final Future<?> a;

        public a(Future<?> future) {
            this.a = future;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isCancelled();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (ScheduledAction.this.get() != Thread.currentThread()) {
                this.a.cancel(true);
            } else {
                this.a.cancel(false);
            }
        }
    }

    public static final class b extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        public final ScheduledAction a;
        public final SubscriptionList b;

        public b(ScheduledAction scheduledAction, SubscriptionList subscriptionList) {
            this.a = scheduledAction;
            this.b = subscriptionList;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.b.remove(this.a);
            }
        }
    }

    public static final class c extends AtomicBoolean implements Subscription {
        private static final long serialVersionUID = 247232374289553518L;
        public final ScheduledAction a;
        public final CompositeSubscription b;

        public c(ScheduledAction scheduledAction, CompositeSubscription compositeSubscription) {
            this.a = scheduledAction;
            this.b = compositeSubscription;
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.b.remove(this.a);
            }
        }
    }

    public ScheduledAction(Action0 action0) {
        this.b = action0;
        this.a = new SubscriptionList();
    }

    public void a(Throwable th) {
        RxJavaHooks.onError(th);
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    public void add(Subscription subscription) {
        this.a.add(subscription);
    }

    public void addParent(CompositeSubscription compositeSubscription) {
        this.a.add(new c(this, compositeSubscription));
    }

    @Override // rx.Subscription
    public boolean isUnsubscribed() {
        return this.a.isUnsubscribed();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                lazySet(Thread.currentThread());
                this.b.call();
            } catch (Throwable th) {
                unsubscribe();
                throw th;
            }
        } catch (OnErrorNotImplementedException e) {
            a(new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", e));
        } catch (Throwable th2) {
            a(new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th2));
        }
        unsubscribe();
    }

    @Override // rx.Subscription
    public void unsubscribe() {
        if (this.a.isUnsubscribed()) {
            return;
        }
        this.a.unsubscribe();
    }

    public void add(Future<?> future) {
        this.a.add(new a(future));
    }

    public void addParent(SubscriptionList subscriptionList) {
        this.a.add(new b(this, subscriptionList));
    }

    public ScheduledAction(Action0 action0, CompositeSubscription compositeSubscription) {
        this.b = action0;
        this.a = new SubscriptionList(new c(this, compositeSubscription));
    }

    public ScheduledAction(Action0 action0, SubscriptionList subscriptionList) {
        this.b = action0;
        this.a = new SubscriptionList(new b(this, subscriptionList));
    }
}
