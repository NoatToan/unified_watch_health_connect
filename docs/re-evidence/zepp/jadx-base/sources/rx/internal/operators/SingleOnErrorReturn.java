package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleOnErrorReturn<T> implements Single.OnSubscribe<T> {
    public final Single.OnSubscribe<T> a;
    public final Func1<Throwable, ? extends T> b;

    public static final class a<T> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super T> b;
        public final Func1<Throwable, ? extends T> c;

        public a(SingleSubscriber<? super T> singleSubscriber, Func1<Throwable, ? extends T> func1) {
            this.b = singleSubscriber;
            this.c = func1;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            try {
                this.b.onSuccess(this.c.call(th));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.b.onError(th2);
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public SingleOnErrorReturn(Single.OnSubscribe<T> onSubscribe, Func1<Throwable, ? extends T> func1) {
        this.a = onSubscribe;
        this.b = func1;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b);
        singleSubscriber.add(aVar);
        this.a.call(aVar);
    }
}
