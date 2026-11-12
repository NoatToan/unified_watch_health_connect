package rx.internal.util;

import rx.Observer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class ObserverSubscriber<T> extends Subscriber<T> {
    public final Observer<? super T> f;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.f = observer;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.f.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.f.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.f.onNext(t);
    }
}
