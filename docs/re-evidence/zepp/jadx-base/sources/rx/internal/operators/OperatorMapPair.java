package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorMapPair<T, U, R> implements Observable.Operator<Observable<? extends R>, T> {
    public final Func1<? super T, ? extends Observable<? extends U>> a;
    public final Func2<? super T, ? super U, ? extends R> b;

    public static class a implements Func1<T, Observable<U>> {
        public final /* synthetic */ Func1 a;

        public a(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<U> call(T t) {
            return Observable.from((Iterable) this.a.call(t));
        }
    }

    public static final class b<T, U, R> extends Subscriber<T> {
        public final Subscriber<? super Observable<? extends R>> f;
        public final Func1<? super T, ? extends Observable<? extends U>> g;
        public final Func2<? super T, ? super U, ? extends R> h;
        public boolean i;

        public b(Subscriber<? super Observable<? extends R>> subscriber, Func1<? super T, ? extends Observable<? extends U>> func1, Func2<? super T, ? super U, ? extends R> func2) {
            this.f = subscriber;
            this.g = func1;
            this.h = func2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.i) {
                return;
            }
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.i) {
                RxJavaHooks.onError(th);
            } else {
                this.i = true;
                this.f.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                this.f.onNext(this.g.call(t).map(new c(t, this.h)));
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

    public static final class c<T, U, R> implements Func1<U, R> {
        public final T a;
        public final Func2<? super T, ? super U, ? extends R> b;

        public c(T t, Func2<? super T, ? super U, ? extends R> func2) {
            this.a = t;
            this.b = func2;
        }

        @Override // rx.functions.Func1
        public R call(U u) {
            return this.b.call(this.a, u);
        }
    }

    public OperatorMapPair(Func1<? super T, ? extends Observable<? extends U>> func1, Func2<? super T, ? super U, ? extends R> func2) {
        this.a = func1;
        this.b = func2;
    }

    public static <T, U> Func1<T, Observable<U>> convertSelector(Func1<? super T, ? extends Iterable<? extends U>> func1) {
        return new a(func1);
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Observable<? extends R>> subscriber) {
        b bVar = new b(subscriber, this.a, this.b);
        subscriber.add(bVar);
        return bVar;
    }
}
