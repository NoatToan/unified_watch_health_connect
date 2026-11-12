package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes22.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.a = null;
        this.b = th;
        countDown();
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        this.a = t;
    }
}
