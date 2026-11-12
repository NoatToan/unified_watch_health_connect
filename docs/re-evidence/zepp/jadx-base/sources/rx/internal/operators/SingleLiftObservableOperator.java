package rx.internal.operators;

import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.internal.producers.SingleProducer;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleLiftObservableOperator<T, R> implements Single.OnSubscribe<R> {
    public final Single.OnSubscribe<T> a;
    public final Observable.Operator<? extends R, ? super T> b;

    public static final class a<T> extends SingleSubscriber<T> {
        public final Subscriber<? super T> b;

        public a(Subscriber<? super T> subscriber) {
            this.b = subscriber;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.setProducer(new SingleProducer(this.b, t));
        }
    }

    public SingleLiftObservableOperator(Single.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.a = onSubscribe;
        this.b = operator;
    }

    public static <T> SingleSubscriber<T> wrap(Subscriber<T> subscriber) {
        a aVar = new a(subscriber);
        subscriber.add(aVar);
        return aVar;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super R> singleSubscriber) {
        SingleFromObservable.a aVar = new SingleFromObservable.a(singleSubscriber);
        singleSubscriber.add(aVar);
        try {
            Subscriber<? super T> subscriberCall = RxJavaHooks.onSingleLift(this.b).call(aVar);
            SingleSubscriber singleSubscriberWrap = wrap(subscriberCall);
            subscriberCall.onStart();
            this.a.call(singleSubscriberWrap);
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, singleSubscriber);
        }
    }
}
