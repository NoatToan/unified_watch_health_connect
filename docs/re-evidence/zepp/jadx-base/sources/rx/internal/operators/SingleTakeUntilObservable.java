package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleTakeUntilObservable<T, U> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final Observable<? extends U> b;

    public static final class a<T, U> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super T> b;
        public final AtomicBoolean c = new AtomicBoolean();
        public final Subscriber<U> d;

        /* JADX INFO: renamed from: rx.internal.operators.SingleTakeUntilObservable$a$a, reason: collision with other inner class name */
        public final class C1257a extends Subscriber<U> {
            public C1257a() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.onError(th);
            }

            @Override // rx.Observer
            public void onNext(U u) {
                onCompleted();
            }
        }

        public a(SingleSubscriber<? super T> singleSubscriber) {
            this.b = singleSubscriber;
            C1257a c1257a = new C1257a();
            this.d = c1257a;
            add(c1257a);
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

    public SingleTakeUntilObservable(Single.OnSubscribe<T> onSubscribe, Observable<? extends U> observable) {
        this.a = onSubscribe;
        this.b = observable;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber);
        singleSubscriber.add(aVar);
        this.b.subscribe((Subscriber<? super Object>) aVar.d);
        this.a.call(aVar);
    }
}
