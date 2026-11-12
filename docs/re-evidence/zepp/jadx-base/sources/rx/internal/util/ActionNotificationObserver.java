package rx.internal.util;

import rx.Notification;
import rx.Observer;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public final class ActionNotificationObserver<T> implements Observer<T> {
    public final Action1<Notification<? super T>> a;

    public ActionNotificationObserver(Action1<Notification<? super T>> action1) {
        this.a = action1;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.a.call(Notification.createOnCompleted());
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.a.call(Notification.createOnError(th));
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.a.call(Notification.createOnNext(t));
    }
}
