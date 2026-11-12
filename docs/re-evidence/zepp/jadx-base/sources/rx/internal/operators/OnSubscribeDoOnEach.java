package rx.internal.operators;

import java.util.Arrays;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public class OnSubscribeDoOnEach<T> implements Observable.OnSubscribe<T> {
    private final Observer<? super T> a;
    private final Observable<T> b;

    public static final class a<T> extends Subscriber<T> {
        private final Subscriber<? super T> f;
        private final Observer<? super T> g;
        private boolean h;

        public a(Subscriber<? super T> subscriber, Observer<? super T> observer) {
            super(subscriber);
            this.f = subscriber;
            this.g = observer;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.h) {
                return;
            }
            try {
                this.g.onCompleted();
                this.h = true;
                this.f.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this);
            }
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.h) {
                RxJavaHooks.onError(th);
                return;
            }
            this.h = true;
            try {
                this.g.onError(th);
                this.f.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.h) {
                return;
            }
            try {
                this.g.onNext(t);
                this.f.onNext(t);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this, t);
            }
        }
    }

    public OnSubscribeDoOnEach(Observable<T> observable, Observer<? super T> observer) {
        this.b = observable;
        this.a = observer;
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.b.unsafeSubscribe(new a(subscriber, this.a));
    }
}
