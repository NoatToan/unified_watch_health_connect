package rx.observables;

import rx.Observable;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public class GroupedObservable<K, T> extends Observable<T> {
    private final K b;

    public static class a implements Observable.OnSubscribe<T> {
        public final /* synthetic */ Observable a;

        public a(Observable observable) {
            this.a = observable;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            this.a.unsafeSubscribe(subscriber);
        }
    }

    public GroupedObservable(K k, Observable.OnSubscribe<T> onSubscribe) {
        super(onSubscribe);
        this.b = k;
    }

    public static <K, T> GroupedObservable<K, T> create(K k, Observable.OnSubscribe<T> onSubscribe) {
        return new GroupedObservable<>(k, onSubscribe);
    }

    public static <K, T> GroupedObservable<K, T> from(K k, Observable<T> observable) {
        return new GroupedObservable<>(k, new a(observable));
    }

    public K getKey() {
        return this.b;
    }
}
