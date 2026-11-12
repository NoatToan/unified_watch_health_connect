package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeReduce<T> implements Observable.OnSubscribe<T> {
    public final Observable<T> a;
    public final Func2<T, T, T> b;

    public class a implements Producer {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.b(j);
        }
    }

    public static final class b<T> extends Subscriber<T> {
        public static final Object j = new Object();
        public final Subscriber<? super T> f;
        public final Func2<T, T, T> g;
        public T h = (T) j;
        public boolean i;

        public b(Subscriber<? super T> subscriber, Func2<T, T, T> func2) {
            this.f = subscriber;
            this.g = func2;
            request(0L);
        }

        public void b(long j2) {
            if (j2 >= 0) {
                if (j2 != 0) {
                    request(Long.MAX_VALUE);
                }
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j2);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.i) {
                return;
            }
            this.i = true;
            T t = this.h;
            if (t == j) {
                this.f.onError(new NoSuchElementException());
            } else {
                this.f.onNext(t);
                this.f.onCompleted();
            }
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
            if (this.i) {
                return;
            }
            T t2 = this.h;
            if (t2 == j) {
                this.h = t;
                return;
            }
            try {
                this.h = this.g.call(t2, t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }
    }

    public OnSubscribeReduce(Observable<T> observable, Func2<T, T, T> func2) {
        this.a = observable;
        this.b = func2;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, this.b);
        subscriber.add(bVar);
        subscriber.setProducer(new a(bVar));
        this.a.unsafeSubscribe(bVar);
    }
}
