package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeReduceSeed<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<T> a;
    public final R b;
    public final Func2<R, ? super T, R> c;

    public static final class a<T, R> extends DeferredScalarSubscriber<T, R> {
        public final Func2<R, ? super T, R> k;

        public a(Subscriber<? super R> subscriber, R r, Func2<R, ? super T, R> func2) {
            super(subscriber);
            this.value = r;
            this.hasValue = true;
            this.k = func2;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.value = this.k.call(this.value, t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                this.actual.onError(th);
            }
        }
    }

    public OnSubscribeReduceSeed(Observable<T> observable, R r, Func2<R, ? super T, R> func2) {
        this.a = observable;
        this.b = r;
        this.c = func2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        new a(subscriber, this.b, this.c).subscribeTo(this.a);
    }
}
