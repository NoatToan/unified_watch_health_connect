package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSkipUntil<T, U> implements Observable.Operator<T, T> {
    public final Observable<U> a;

    public class a extends Subscriber<U> {
        public final /* synthetic */ AtomicBoolean f;
        public final /* synthetic */ SerializedSubscriber g;

        public a(AtomicBoolean atomicBoolean, SerializedSubscriber serializedSubscriber) {
            this.f = atomicBoolean;
            this.g = serializedSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            unsubscribe();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
            this.g.unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(U u) {
            this.f.set(true);
            unsubscribe();
        }
    }

    public class b extends Subscriber<T> {
        public final /* synthetic */ AtomicBoolean f;
        public final /* synthetic */ SerializedSubscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Subscriber subscriber, AtomicBoolean atomicBoolean, SerializedSubscriber serializedSubscriber) {
            super(subscriber);
            this.f = atomicBoolean;
            this.g = serializedSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.onCompleted();
            unsubscribe();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f.get()) {
                this.g.onNext(t);
            } else {
                request(1L);
            }
        }
    }

    public OperatorSkipUntil(Observable<U> observable) {
        this.a = observable;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        a aVar = new a(atomicBoolean, serializedSubscriber);
        subscriber.add(aVar);
        this.a.unsafeSubscribe(aVar);
        return new b(subscriber, atomicBoolean, serializedSubscriber);
    }
}
