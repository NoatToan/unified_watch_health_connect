package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorCast<T, R> implements Observable.Operator<R, T> {
    public final Class<R> a;

    public static final class a<T, R> extends Subscriber<T> {
        public final Subscriber<? super R> f;
        public final Class<R> g;
        public boolean h;

        public a(Subscriber<? super R> subscriber, Class<R> cls) {
            this.f = subscriber;
            this.g = cls;
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
                this.f.onNext(this.g.cast(t));
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

    public OperatorCast(Class<R> cls) {
        this.a = cls;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        a aVar = new a(subscriber, this.a);
        subscriber.add(aVar);
        return aVar;
    }
}
