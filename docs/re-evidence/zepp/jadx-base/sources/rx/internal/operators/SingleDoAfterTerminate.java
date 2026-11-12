package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleDoAfterTerminate<T> implements Single.OnSubscribe<T> {
    public final Single<T> a;
    public final Action0 b;

    public static final class a<T> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super T> b;
        public final Action0 c;

        public a(SingleSubscriber<? super T> singleSubscriber, Action0 action0) {
            this.b = singleSubscriber;
            this.c = action0;
        }

        public void a() {
            try {
                this.c.call();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
            }
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            try {
                this.b.onError(th);
            } finally {
                a();
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                this.b.onSuccess(t);
            } finally {
                a();
            }
        }
    }

    public SingleDoAfterTerminate(Single<T> single, Action0 action0) {
        this.a = single;
        this.b = action0;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b);
        singleSubscriber.add(aVar);
        this.a.subscribe(aVar);
    }
}
