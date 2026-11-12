package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorTakeUntil<T, E> implements Observable.Operator<T, T> {
    private final Observable<? extends E> a;

    public class a extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, boolean z, Subscriber subscriber2) {
            super(subscriber, z);
            this.f = subscriber2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            try {
                this.f.onCompleted();
            } finally {
                this.f.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            try {
                this.f.onError(th);
            } finally {
                this.f.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    public class b extends Subscriber<E> {
        public final /* synthetic */ Subscriber f;

        public b(Subscriber subscriber) {
            this.f = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(E e) {
            onCompleted();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorTakeUntil(Observable<? extends E> observable) {
        this.a = observable;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        a aVar = new a(serializedSubscriber, false, serializedSubscriber);
        b bVar = new b(aVar);
        serializedSubscriber.add(aVar);
        serializedSubscriber.add(bVar);
        subscriber.add(serializedSubscriber);
        this.a.unsafeSubscribe(bVar);
        return aVar;
    }
}
