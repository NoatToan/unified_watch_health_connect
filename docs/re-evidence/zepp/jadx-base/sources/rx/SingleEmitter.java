package rx;

import rx.functions.Cancellable;

/* JADX INFO: loaded from: classes23.dex */
public interface SingleEmitter<T> {
    void onError(Throwable th);

    void onSuccess(T t);

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
