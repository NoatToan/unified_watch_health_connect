package rx.internal.operators;

import rx.Single;
import rx.SingleSubscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes23.dex */
public final class SingleDoOnEvent<T> implements Single.OnSubscribe<T> {
    public final Single<T> a;
    public final Action1<? super T> b;
    public final Action1<Throwable> c;

    public static final class a<T> extends SingleSubscriber<T> {
        public final SingleSubscriber<? super T> b;
        public final Action1<? super T> c;
        public final Action1<Throwable> d;

        public a(SingleSubscriber<? super T> singleSubscriber, Action1<? super T> action1, Action1<Throwable> action2) {
            this.b = singleSubscriber;
            this.c = action1;
            this.d = action2;
        }

        @Override // rx.SingleSubscriber
        public void onError(Throwable th) {
            try {
                this.d.call(th);
                this.b.onError(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.b.onError(new CompositeException(th, th2));
            }
        }

        @Override // rx.SingleSubscriber
        public void onSuccess(T t) {
            try {
                this.c.call(t);
                this.b.onSuccess(t);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, this, t);
            }
        }
    }

    public SingleDoOnEvent(Single<T> single, Action1<? super T> action1, Action1<Throwable> action2) {
        this.a = single;
        this.b = action1;
        this.c = action2;
    }

    @Override // rx.functions.Action1
    public void call(SingleSubscriber<? super T> singleSubscriber) {
        a aVar = new a(singleSubscriber, this.b, this.c);
        singleSubscriber.add(aVar);
        this.a.subscribe(aVar);
    }
}
