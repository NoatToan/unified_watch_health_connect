package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Single;
import rx.SingleSubscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleTakeUntilSingle<T, U> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final Single<? extends U> b;

    public static final class a<T, U> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super T> b;
        public final AtomicBoolean c = new AtomicBoolean();
        public final SingleSubscriber<U> d;

        /* JADX INFO: renamed from: rx.internal.operators.SingleTakeUntilSingle$a$a, reason: collision with other inner class name */
        public final class C1258a extends SingleSubscriber<U> {
            public C1258a() {
            }

            @Override // rx.SingleSubscriber
            public void onError(Throwable th) {
                a.this.onError(th);
            }

            @Override // rx.SingleSubscriber
            public void onSuccess(U u) {
                onError(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }
        }

        public a(SingleSubscriber<? super T> singleSubscriber) {
            this.b = singleSubscriber;
            C1258a c1258a = new C1258a();
            this.d = c1258a;
            add(c1258a);
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

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            if (this.c.compareAndSet(false, true)) {
                unsubscribe();
                this.b.onSuccess(t);
            }
        }
    }

    public SingleTakeUntilSingle(Single.OnSubscribe<T> onSubscribe, Single<? extends U> single) {
        this.a = onSubscribe;
        this.b = single;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber);
        singleSubscriber.add(aVar);
        this.b.subscribe((SingleSubscriber<? super Object>) aVar.d);
        this.a.call(aVar);
    }
}
