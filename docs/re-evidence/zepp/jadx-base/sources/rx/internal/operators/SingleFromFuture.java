package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleFromFuture<T> implements Single.OnSubscribe<T> {
    public final Future<? extends T> a;
    public final long b;
    public final TimeUnit c;

    public SingleFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.a = future;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Future<? extends T> future = this.a;
        singleSubscriber.add(Subscriptions.from(future));
        try {
            long j = this.b;
            singleSubscriber.onSuccess(j == 0 ? future.get() : future.get(j, this.c));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}
