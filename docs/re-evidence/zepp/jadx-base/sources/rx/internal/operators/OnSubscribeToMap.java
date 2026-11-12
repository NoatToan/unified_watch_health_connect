package rx.internal.operators;

import java.util.HashMap;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeToMap<T, K, V> implements Observable.OnSubscribe<Map<K, V>>, Func0<Map<K, V>> {
    public final Observable<T> a;
    public final Func1<? super T, ? extends K> b;
    public final Func1<? super T, ? extends V> c;
    public final Func0<? extends Map<K, V>> d;

    public static final class a<T, K, V> extends DeferredScalarSubscriberSafe<T, Map<K, V>> {
        public final Func1<? super T, ? extends K> k;
        public final Func1<? super T, ? extends V> l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Subscriber<? super Map<K, V>> subscriber, Map<K, V> map, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.k = func1;
            this.l = func2;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                ((Map) this.value).put(this.k.call(t), this.l.call(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(th);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OnSubscribeToMap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2) {
        this(observable, func1, func2, null);
    }

    public OnSubscribeToMap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, Func0<? extends Map<K, V>> func0) {
        this.a = observable;
        this.b = func1;
        this.c = func2;
        if (func0 == null) {
            this.d = this;
        } else {
            this.d = func0;
        }
    }

    @Override // rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, V> call() {
        return new HashMap();
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Map<K, V>> subscriber) {
        try {
            new a(subscriber, this.d.call(), this.b, this.c).subscribeTo(this.a);
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, subscriber);
        }
    }
}
