package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
import rx.observers.SerializedSubscriber;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorWithLatestFrom<T, U, R> implements Observable.Operator<R, T> {
    public static final Object c = new Object();
    public final Func2<? super T, ? super U, ? extends R> a;
    public final Observable<? extends U> b;

    public class a extends Subscriber<T> {
        public final /* synthetic */ AtomicReference f;
        public final /* synthetic */ SerializedSubscriber g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, boolean z, AtomicReference atomicReference, SerializedSubscriber serializedSubscriber) {
            super(subscriber, z);
            this.f = atomicReference;
            this.g = serializedSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g.onCompleted();
            this.g.unsubscribe();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
            this.g.unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            Object obj = this.f.get();
            if (obj != OperatorWithLatestFrom.c) {
                try {
                    this.g.onNext(OperatorWithLatestFrom.this.a.call(t, obj));
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, this);
                }
            }
        }
    }

    public class b extends Subscriber<U> {
        public final /* synthetic */ AtomicReference f;
        public final /* synthetic */ SerializedSubscriber g;

        public b(AtomicReference atomicReference, SerializedSubscriber serializedSubscriber) {
            this.f = atomicReference;
            this.g = serializedSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f.get() == OperatorWithLatestFrom.c) {
                this.g.onCompleted();
                this.g.unsubscribe();
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g.onError(th);
            this.g.unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(U u) {
            this.f.set(u);
        }
    }

    public OperatorWithLatestFrom(Observable<? extends U> observable, Func2<? super T, ? super U, ? extends R> func2) {
        this.b = observable;
        this.a = func2;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber, false);
        subscriber.add(serializedSubscriber);
        AtomicReference atomicReference = new AtomicReference(c);
        a aVar = new a(serializedSubscriber, true, atomicReference, serializedSubscriber);
        b bVar = new b(atomicReference, serializedSubscriber);
        serializedSubscriber.add(aVar);
        serializedSubscriber.add(bVar);
        this.b.unsafeSubscribe(bVar);
        return aVar;
    }
}
