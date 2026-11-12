package rx.internal.operators;

import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleOnSubscribeDelaySubscriptionOther<T> implements Single.OnSubscribe<T> {
    public final Single<? extends T> a;
    public final Observable<?> b;

    public class a extends SingleSubscriber<T> {
        public final /* synthetic */ SingleSubscriber b;

        public a(SingleSubscriber singleSubscriber) {
            this.b = singleSubscriber;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            this.b.onError(th);
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            this.b.onSuccess(t);
        }
    }

    public class b extends Subscriber<Object> {
        public boolean f;
        public final /* synthetic */ SingleSubscriber g;
        public final /* synthetic */ SerialSubscription h;

        public b(SingleSubscriber singleSubscriber, SerialSubscription serialSubscription) {
            this.g = singleSubscriber;
            this.h = serialSubscription;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.h.set(this.g);
            SingleOnSubscribeDelaySubscriptionOther.this.a.subscribe(this.g);
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                RxJavaHooks.onError(th);
            } else {
                this.f = true;
                this.g.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public SingleOnSubscribeDelaySubscriptionOther(Single<? extends T> single, Observable<?> observable) {
        this.a = single;
        this.b = observable;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber);
        SerialSubscription serialSubscription = new SerialSubscription();
        singleSubscriber.add(serialSubscription);
        b bVar = new b(aVar, serialSubscription);
        serialSubscription.set(bVar);
        this.b.subscribe((Subscriber<? super Object>) bVar);
    }
}
