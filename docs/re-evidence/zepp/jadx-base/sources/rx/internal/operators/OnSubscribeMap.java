package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeMap<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<T> a;
    public final Func1<? super T, ? extends R> b;

    public static final class a<T, R> extends Subscriber<T> {
        public final Subscriber<? super R> f;
        public final Func1<? super T, ? extends R> g;
        public boolean h;

        public a(Subscriber<? super R> subscriber, Func1<? super T, ? extends R> func1) {
            this.f = subscriber;
            this.g = func1;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.h) {
                return;
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.h) {
                RxJavaHooks.onError(th);
            } else {
                this.h = true;
                this.f.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.f.onNext(this.g.call(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f.setProducer(producer);
        }
    }

    public OnSubscribeMap(Observable<T> observable, Func1<? super T, ? extends R> func1) {
        this.a = observable;
        this.b = func1;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.b);
        subscriber.add(aVar);
        this.a.unsafeSubscribe(aVar);
    }
}
