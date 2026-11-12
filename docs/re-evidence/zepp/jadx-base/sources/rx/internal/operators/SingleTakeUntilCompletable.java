package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Completable;
import rx.CompletableSubscriber;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscription;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleTakeUntilCompletable<T> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final Completable b;

    public static final class a<T> extends SingleSubscriber<T> implements CompletableSubscriber {
        public final SingleSubscriber<? super T> b;
        public final AtomicBoolean c = new AtomicBoolean();

        public a(SingleSubscriber<? super T> singleSubscriber) {
            this.b = singleSubscriber;
        }

        @Override // rx.CompletableSubscriber
        public void onCompleted() {
            onError(new CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            if (!this.c.compareAndSet(false, true)) {
                RxJavaHooks.onError(th);
            } else {
                unsubscribe();
                this.b.onError(th);
            }
        }

        @Override // rx.CompletableSubscriber
        public void onSubscribe(Subscription subscription) {
            add(subscription);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            if (this.c.compareAndSet(false, true)) {
                unsubscribe();
                this.b.onSuccess(t);
            }
        }
    }

    public SingleTakeUntilCompletable(Single.OnSubscribe<T> onSubscribe, Completable completable) {
        this.a = onSubscribe;
        this.b = completable;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber);
        singleSubscriber.add(aVar);
        this.b.subscribe(aVar);
        this.a.call(aVar);
    }
}
