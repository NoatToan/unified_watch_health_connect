package rx.internal.operators;

import java.util.NoSuchElementException;
import rx.Observable;
import rx.Single;
import rx.SingleSubscriber;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleFromObservable<T> implements Single.OnSubscribe<T> {
    public final Observable.OnSubscribe<T> a;

    public static final class a<T> extends Subscriber<T> {
        public static final int i = 0;
        public static final int j = 1;
        public static final int k = 2;
        public final SingleSubscriber<? super T> f;
        public T g;
        public int h;

        public a(SingleSubscriber<? super T> singleSubscriber) {
            this.f = singleSubscriber;
        }

        @Override // rx.Observer
        public void onCompleted() {
            int i2 = this.h;
            if (i2 == 0) {
                this.f.onError(new NoSuchElementException());
            } else if (i2 == 1) {
                this.h = 2;
                T t = this.g;
                this.g = null;
                this.f.onSuccess(t);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.h == 2) {
                RxJavaHooks.onError(th);
            } else {
                this.g = null;
                this.f.onError(th);
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            int i2 = this.h;
            if (i2 == 0) {
                this.h = 1;
                this.g = t;
            } else if (i2 == 1) {
                this.h = 2;
                this.f.onError(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }
    }

    public SingleFromObservable(Observable.OnSubscribe<T> onSubscribe) {
        this.a = onSubscribe;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber);
        singleSubscriber.add(aVar);
        this.a.call(aVar);
    }
}
