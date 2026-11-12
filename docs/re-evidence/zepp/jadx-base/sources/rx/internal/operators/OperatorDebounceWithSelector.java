package rx.internal.operators;

import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.observers.SerializedSubscriber;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorDebounceWithSelector<T, U> implements Observable.Operator<T, T> {
    public final Func1<? super T, ? extends Observable<U>> a;

    public class a extends Subscriber<T> {
        public final OperatorDebounceWithTime.b<T> f;
        public final Subscriber<?> g;
        public final /* synthetic */ SerializedSubscriber h;
        public final /* synthetic */ SerialSubscription i;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorDebounceWithSelector$a$a, reason: collision with other inner class name */
        public class C1242a extends Subscriber<U> {
            public final /* synthetic */ int f;

            public C1242a(int i) {
                this.f = i;
            }

            @Override // rx.Observer
            public void onCompleted() {
                a aVar = a.this;
                aVar.f.b(this.f, aVar.h, aVar.g);
                unsubscribe();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                a.this.g.onError(th);
            }

            @Override // rx.Observer
            public void onNext(U u) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Subscriber subscriber, SerializedSubscriber serializedSubscriber, SerialSubscription serialSubscription) {
            super(subscriber);
            this.h = serializedSubscriber;
            this.i = serialSubscription;
            this.f = new OperatorDebounceWithTime.b<>();
            this.g = this;
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.f.c(this.h, this);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.h.onError(th);
            unsubscribe();
            this.f.a();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            try {
                Observable<U> observableCall = OperatorDebounceWithSelector.this.a.call(t);
                C1242a c1242a = new C1242a(this.f.d(t));
                this.i.set(c1242a);
                observableCall.unsafeSubscribe(c1242a);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this);
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorDebounceWithSelector(Func1<? super T, ? extends Observable<U>> func1) {
        this.a = func1;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        return new a(subscriber, serializedSubscriber, serialSubscription);
    }
}
