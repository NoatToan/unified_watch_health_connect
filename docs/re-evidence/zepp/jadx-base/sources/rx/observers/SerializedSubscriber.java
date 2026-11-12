package rx.observers;

import rx.Observer;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public class SerializedSubscriber<T> extends Subscriber<T> {
    private final Observer<T> f;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
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

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z) {
        super(subscriber, z);
        this.f = new SerializedObserver(subscriber);
    }
}
