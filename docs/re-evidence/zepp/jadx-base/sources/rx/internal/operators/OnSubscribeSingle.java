package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;

/* JADX INFO: loaded from: classes23.dex */
public class OnSubscribeSingle<T> implements Single.OnSubscribe<T> {
    private final Observable<T> a;

    public class a extends Subscriber<T> {
        private boolean f;
        private boolean g;
        private T h;
        public final /* synthetic */ SingleSubscriber i;

        public a(SingleSubscriber singleSubscriber) {
            this.i = singleSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            if (this.g) {
                this.i.onSuccess(this.h);
            } else {
                this.i.onError(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.i.onError(th);
            unsubscribe();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (!this.g) {
                this.g = true;
                this.h = t;
            } else {
                this.f = true;
                this.i.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(2L);
        }
    }

    public OnSubscribeSingle(Observable<T> observable) {
        this.a = observable;
    }

    public static <T> OnSubscribeSingle<T> create(Observable<T> observable) {
        return new OnSubscribeSingle<>(observable);
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber);
        singleSubscriber.add(aVar);
        this.a.unsafeSubscribe(aVar);
    }
}
