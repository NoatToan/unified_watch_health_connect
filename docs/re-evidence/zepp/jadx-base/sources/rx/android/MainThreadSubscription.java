package rx.android;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class MainThreadSubscription implements Subscription {
    private final AtomicBoolean a = new AtomicBoolean();

    public class a implements Action0 {
        public a() {
        }

        @Override // rx.functions.Action0
        public void call() {
            MainThreadSubscription.this.onUnsubscribe();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    @Override // rx.Subscription
    public final boolean isUnsubscribed() {
        return this.a.get();
    }

    public abstract void onUnsubscribe();

    @Override // rx.Subscription
    public final void unsubscribe() {
        if (this.a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onUnsubscribe();
            } else {
                AndroidSchedulers.mainThread().createWorker().schedule(new a());
            }
        }
    }
}
