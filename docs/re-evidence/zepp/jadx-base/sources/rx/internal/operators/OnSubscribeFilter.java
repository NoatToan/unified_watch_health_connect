package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeFilter<T> implements Observable.OnSubscribe<T> {
    public final Observable<T> a;
    public final Func1<? super T, Boolean> b;

    public static final class a<T> extends Subscriber<T> {
        public final Subscriber<? super T> f;
        public final Func1<? super T, Boolean> g;
        public boolean h;

        public a(Subscriber<? super T> subscriber, Func1<? super T, Boolean> func1) {
            this.f = subscriber;
            this.g = func1;
            request(0L);
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
                if (this.g.call(t).booleanValue()) {
                    this.f.onNext(t);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            super.setProducer(producer);
            this.f.setProducer(producer);
        }
    }

    public OnSubscribeFilter(Observable<T> observable, Func1<? super T, Boolean> func1) {
        this.a = observable;
        this.b = func1;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.b);
        subscriber.add(aVar);
        this.a.unsafeSubscribe(aVar);
    }
}
