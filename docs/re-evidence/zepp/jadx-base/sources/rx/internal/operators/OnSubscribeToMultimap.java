package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeToMultimap<T, K, V> implements Observable.OnSubscribe<Map<K, Collection<V>>>, Func0<Map<K, Collection<V>>> {
    private final Func1<? super T, ? extends K> a;
    private final Func1<? super T, ? extends V> b;
    private final Func0<? extends Map<K, Collection<V>>> c;
    private final Func1<? super K, ? extends Collection<V>> d;
    private final Observable<T> e;

    public static final class a<K, V> implements Func1<K, Collection<V>> {
        private static final a<Object, Object> a = new a<>();

        private a() {
        }

        public static <K, V> a<K, V> b() {
            return (a<K, V>) a;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<V> call(K k) {
            return new ArrayList();
        }
    }

    public static final class b<T, K, V> extends DeferredScalarSubscriberSafe<T, Map<K, Collection<V>>> {
        private final Func1<? super T, ? extends K> k;
        private final Func1<? super T, ? extends V> l;
        private final Func1<? super K, ? extends Collection<V>> m;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Subscriber<? super Map<K, Collection<V>>> subscriber, Map<K, Collection<V>> map, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, Func1<? super K, ? extends Collection<V>> func3) {
            super(subscriber);
            this.value = map;
            this.hasValue = true;
            this.k = func1;
            this.l = func2;
            this.m = func3;
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                K kCall = this.k.call(t);
                V vCall = this.l.call(t);
                Collection<V> collectionCall = (Collection) ((Map) this.value).get(kCall);
                if (collectionCall == null) {
                    collectionCall = this.m.call(kCall);
                    ((Map) this.value).put(kCall, collectionCall);
                }
                collectionCall.add(vCall);
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

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2) {
        this(observable, func1, func2, null, a.b());
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, Func0<? extends Map<K, Collection<V>>> func0) {
        this(observable, func1, func2, func0, a.b());
    }

    public OnSubscribeToMultimap(Observable<T> observable, Func1<? super T, ? extends K> func1, Func1<? super T, ? extends V> func2, Func0<? extends Map<K, Collection<V>>> func0, Func1<? super K, ? extends Collection<V>> func3) {
        this.e = observable;
        this.a = func1;
        this.b = func2;
        if (func0 == null) {
            this.c = this;
        } else {
            this.c = func0;
        }
        this.d = func3;
    }

    @Override // rx.functions.Func0, java.util.concurrent.Callable
    public Map<K, Collection<V>> call() {
        return new HashMap();
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super Map<K, Collection<V>>> subscriber) {
        try {
            new b(subscriber, this.c.call(), this.a, this.b, this.d).subscribeTo(this.e);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }
}
