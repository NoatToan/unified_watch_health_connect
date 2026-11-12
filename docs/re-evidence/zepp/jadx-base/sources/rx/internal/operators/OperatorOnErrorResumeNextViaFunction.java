package rx.internal.operators;

import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Func1;
import rx.internal.producers.ProducerArbiter;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorOnErrorResumeNextViaFunction<T> implements Observable.Operator<T, T> {
    public final Func1<? super Throwable, ? extends Observable<? extends T>> a;

    public static class a implements Func1<Throwable, Observable<? extends T>> {
        public final /* synthetic */ Func1 a;

        public a(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<? extends T> call(Throwable th) {
            return Observable.just(this.a.call(th));
        }
    }

    public static class b implements Func1<Throwable, Observable<? extends T>> {
        public final /* synthetic */ Observable a;

        public b(Observable observable) {
            this.a = observable;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<? extends T> call(Throwable th) {
            return this.a;
        }
    }

    public static class c implements Func1<Throwable, Observable<? extends T>> {
        public final /* synthetic */ Observable a;

        public c(Observable observable) {
            this.a = observable;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<? extends T> call(Throwable th) {
            return th instanceof Exception ? this.a : Observable.error(th);
        }
    }

    public class d extends Subscriber<T> {
        private boolean f;
        public long g;
        public final /* synthetic */ Subscriber h;
        public final /* synthetic */ ProducerArbiter i;
        public final /* synthetic */ SerialSubscription j;

        public class a extends Subscriber<T> {
            public a() {
            }

            @Override // rx.Observer
            public void onCompleted() {
                d.this.h.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                d.this.h.onError(th);
            }

            @Override // rx.Observer
            public void onNext(T t) {
                d.this.h.onNext(t);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                d.this.i.setProducer(producer);
            }
        }

        public d(Subscriber subscriber, ProducerArbiter producerArbiter, SerialSubscription serialSubscription) {
            this.h = subscriber;
            this.i = producerArbiter;
            this.j = serialSubscription;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.h.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                Exceptions.throwIfFatal(th);
                RxJavaHooks.onError(th);
                return;
            }
            this.f = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.j.set(aVar);
                long j = this.g;
                if (j != 0) {
                    this.i.produced(j);
                }
                OperatorOnErrorResumeNextViaFunction.this.a.call(th).unsafeSubscribe(aVar);
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, this.h);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f) {
                return;
            }
            this.g++;
            this.h.onNext(t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.i.setProducer(producer);
        }
    }

    public OperatorOnErrorResumeNextViaFunction(Func1<? super Throwable, ? extends Observable<? extends T>> func1) {
        this.a = func1;
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withException(Observable<? extends T> observable) {
        return new OperatorOnErrorResumeNextViaFunction<>(new c(observable));
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withOther(Observable<? extends T> observable) {
        return new OperatorOnErrorResumeNextViaFunction<>(new b(observable));
    }

    public static <T> OperatorOnErrorResumeNextViaFunction<T> withSingle(Func1<? super Throwable, ? extends T> func1) {
        return new OperatorOnErrorResumeNextViaFunction<>(new a(func1));
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        ProducerArbiter producerArbiter = new ProducerArbiter();
        SerialSubscription serialSubscription = new SerialSubscription();
        d dVar = new d(subscriber, producerArbiter, serialSubscription);
        serialSubscription.set(dVar);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        return dVar;
    }
}
