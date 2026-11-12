package rx.internal.util;

import rx.Observer;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public final class ActionObserver<T> implements Observer<T> {
    public final Action1<? super T> a;
    public final Action1<? super Throwable> b;
    public final Action0 c;

    public ActionObserver(Action1<? super T> action1, Action1<? super Throwable> action2, Action0 action0) {
        this.a = action1;
        this.b = action2;
        this.c = action0;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.c.call();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.call(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.a.call(t);
    }
}
