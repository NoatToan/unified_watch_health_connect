package rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import rx.CompletableSubscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public abstract class AsyncCompletableSubscriber implements CompletableSubscriber, Subscription {
    public static final a b = new a();
    private final AtomicReference<Subscription> a = new AtomicReference<>();

    public static final class a implements Subscription {
        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return true;
        }

        @Override // rx.Subscription
        public void unsubscribe() {
        }
    }

    public final void clear() {
        this.a.set(b);
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    public void onStart() {
    }

    @Override // rx.CompletableSubscriber
    public final void onSubscribe(Subscription subscription) {
        if (this.a.compareAndSet(null, subscription)) {
            onStart();
            return;
        }
        subscription.unsubscribe();
        if (this.a.get() != b) {
            RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
        }
    }

    @Override // rx.Subscription
    public final void unsubscribe() {
        Subscription andSet;
        Subscription subscription = this.a.get();
        a aVar = b;
        if (subscription == aVar || (andSet = this.a.getAndSet(aVar)) == null || andSet == aVar) {
            return;
        }
        andSet.unsubscribe();
    }
}
