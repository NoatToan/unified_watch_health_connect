package rx.internal.util;

import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public final class ActionSubscriber<T> extends Subscriber<T> {
    public final Action1<? super T> f;
    public final Action1<Throwable> g;
    public final Action0 h;

    public ActionSubscriber(Action1<? super T> action1, Action1<Throwable> action2, Action0 action0) {
        this.f = action1;
        this.g = action2;
        this.h = action0;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.h.call();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.g.call(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.f.call(t);
    }
}
