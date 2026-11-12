package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleOnSubscribeMap<T, R> implements Single.OnSubscribe<R> {
    public final Single<T> a;
    public final Func1<? super T, ? extends R> b;

    public static final class a<T, R> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super R> b;
        public final Func1<? super T, ? extends R> c;
        public boolean d;

        public a(SingleSubscriber<? super R> singleSubscriber, Func1<? super T, ? extends R> func1) {
            this.b = singleSubscriber;
            this.c = func1;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaHooks.onError(th);
            } else {
                this.d = true;
                this.b.onError(th);
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                this.b.onSuccess(this.c.call(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }
    }

    public SingleOnSubscribeMap(Single<T> single, Func1<? super T, ? extends R> func1) {
        this.a = single;
        this.b = func1;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super R> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b);
        singleSubscriber.add(aVar);
        this.a.subscribe(aVar);
    }
}
