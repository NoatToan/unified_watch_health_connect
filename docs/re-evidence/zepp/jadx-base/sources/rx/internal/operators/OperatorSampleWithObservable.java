package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorSampleWithObservable<T, U> implements Observable.Operator<T, T> {
    public static final Object b = new Object();
    public final Observable<U> a;

    public class a extends Subscriber<U> {
        public final /* synthetic */ AtomicReference f;
        public final /* synthetic */ SerializedSubscriber g;
        public final /* synthetic */ AtomicReference h;

        public a(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber, AtomicReference atomicReference2) {
            this.f = atomicReference;
            this.g = serializedSubscriber;
            this.h = atomicReference2;
        }

        @Override // rx.Observer
        public void onCompleted() {
            onNext(null);
            this.g.onCompleted();
            ((Subscription) this.h.get()).unsubscribe();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
            ((Subscription) this.h.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        public void onNext(U u) {
            AtomicReference atomicReference = this.f;
            Object obj = OperatorSampleWithObservable.b;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                this.g.onNext(andSet);
            }
        }
    }

    public class b extends Subscriber<T> {
        public final /* synthetic */ AtomicReference f;
        public final /* synthetic */ SerializedSubscriber g;
        public final /* synthetic */ Subscriber h;

        public b(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber, Subscriber subscriber) {
            this.f = atomicReference;
            this.g = serializedSubscriber;
            this.h = subscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.h.onNext(null);
            this.g.onCompleted();
            this.h.unsubscribe();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
            this.h.unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.set(t);
        }
    }

    public OperatorSampleWithObservable(Observable<U> observable) {
        this.a = observable;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        AtomicReference atomicReference = new AtomicReference(b);
        AtomicReference atomicReference2 = new AtomicReference();
        a aVar = new a(atomicReference, serializedSubscriber, atomicReference2);
        b bVar = new b(atomicReference, serializedSubscriber, aVar);
        atomicReference2.lazySet(bVar);
        subscriber.add(bVar);
        subscriber.add(aVar);
        this.a.unsafeSubscribe(aVar);
        return bVar;
    }
}
