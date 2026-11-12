package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action2;
import rx.functions.Func0;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeCollect<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<T> a;
    public final Func0<R> b;
    public final Action2<R, ? super T> c;

    public static final class a<T, R> extends DeferredScalarSubscriberSafe<T, R> {
        public final Action2<R, ? super T> k;

        public a(Subscriber<? super R> subscriber, R r, Action2<R, ? super T> action2) {
            super(subscriber);
            this.value = r;
            this.hasValue = true;
            this.k = action2;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                this.k.call(this.value, t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public OnSubscribeCollect(Observable<T> observable, Func0<R> func0, Action2<R, ? super T> action2) {
        this.a = observable;
        this.b = func0;
        this.c = action2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        try {
            new a(subscriber, this.b.call(), this.c).subscribeTo(this.a);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }
}
