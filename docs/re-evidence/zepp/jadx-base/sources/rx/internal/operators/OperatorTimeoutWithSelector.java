package rx.internal.operators;

import rx.Observable;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public class OperatorTimeoutWithSelector<T, U, V> extends rx.internal.operators.a<T> {

    public class a implements rx.internal.operators.a.InterfaceC1260a<T> {
        public final /* synthetic */ Func0 a;

        /* JADX INFO: renamed from: rx.internal.operators.OperatorTimeoutWithSelector$a$a, reason: collision with other inner class name */
        public class C1252a extends Subscriber<U> {
            public final /* synthetic */ rx.internal.operators.a.c f;
            public final /* synthetic */ Long g;

            public C1252a(rx.internal.operators.a.c cVar, Long l) {
                this.f = cVar;
                this.g = l;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.b(this.g.longValue());
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.f.onError(th);
            }

            @Override // rx.Observer
            public void onNext(U u) {
                this.f.b(this.g.longValue());
            }
        }

        public a(Func0 func0) {
            this.a = func0;
        }

        @Override // rx.functions.Func3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call(rx.internal.operators.a.c<T> cVar, Long l, Scheduler.Worker worker) {
            Func0 func0 = this.a;
            if (func0 == null) {
                return Subscriptions.unsubscribed();
            }
            try {
                return ((Observable) func0.call()).unsafeSubscribe(new C1252a(cVar, l));
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, cVar);
                return Subscriptions.unsubscribed();
            }
        }
    }

    public class b implements rx.internal.operators.a.b<T> {
        public final /* synthetic */ Func1 a;

        public class a extends Subscriber<V> {
            public final /* synthetic */ rx.internal.operators.a.c f;
            public final /* synthetic */ Long g;

            public a(rx.internal.operators.a.c cVar, Long l) {
                this.f = cVar;
                this.g = l;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.b(this.g.longValue());
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.f.onError(th);
            }

            @Override // rx.Observer
            public void onNext(V v) {
                this.f.b(this.g.longValue());
            }
        }

        public b(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call(rx.internal.operators.a.c<T> cVar, Long l, T t, Scheduler.Worker worker) {
            try {
                return ((Observable) this.a.call(t)).unsafeSubscribe(new a(cVar, l));
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, cVar);
                return Subscriptions.unsubscribed();
            }
        }
    }

    public OperatorTimeoutWithSelector(Func0<? extends Observable<U>> func0, Func1<? super T, ? extends Observable<V>> func1, Observable<? extends T> observable) {
        super(new a(func0), new b(func1), observable, Schedulers.immediate());
    }

    @Override // rx.internal.operators.a
    public /* bridge */ /* synthetic */ Subscriber call(Subscriber subscriber) {
        return super.call(subscriber);
    }
}
