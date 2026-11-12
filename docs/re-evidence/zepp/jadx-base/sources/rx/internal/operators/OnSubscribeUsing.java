package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.observers.Subscribers;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeUsing<T, Resource> implements Observable.OnSubscribe<T> {
    private final Func0<Resource> a;
    private final Func1<? super Resource, ? extends Observable<? extends T>> b;
    private final Action1<? super Resource> c;
    private final boolean d;

    public static final class a<Resource> extends AtomicBoolean implements Action0, Subscription {
        private static final long serialVersionUID = 4262875056400218316L;
        private Action1<? super Resource> a;
        private Resource b;

        public a(Action1<? super Resource> action1, Resource resource) {
            this.a = action1;
            this.b = resource;
            lazySet(false);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Resource, rx.functions.Action1<? super Resource>] */
        @Override // rx.functions.Action0
        public void call() {
            if (compareAndSet(false, true)) {
                ?? r0 = (Resource) null;
                try {
                    this.a.call(this.b);
                } finally {
                    this.b = null;
                    this.a = null;
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return get();
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            call();
        }
    }

    public OnSubscribeUsing(Func0<Resource> func0, Func1<? super Resource, ? extends Observable<? extends T>> func1, Action1<? super Resource> action1, boolean z) {
        this.a = func0;
        this.b = func1;
        this.c = action1;
        this.d = z;
    }

    private Throwable a(Action0 action0) {
        try {
            action0.call();
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        try {
            Resource resourceCall = this.a.call();
            a aVar = new a(this.c, resourceCall);
            subscriber.add(aVar);
            try {
                Observable<? extends T> observableCall = this.b.call(resourceCall);
                try {
                    (this.d ? observableCall.doOnTerminate(aVar) : observableCall.doAfterTerminate(aVar)).unsafeSubscribe(Subscribers.wrap(subscriber));
                } catch (Throwable th) {
                    Throwable thA = a(aVar);
                    Exceptions.throwIfFatal(th);
                    Exceptions.throwIfFatal(thA);
                    if (thA != null) {
                        subscriber.onError(new CompositeException(th, thA));
                    } else {
                        subscriber.onError(th);
                    }
                }
            } catch (Throwable th2) {
                Throwable thA2 = a(aVar);
                Exceptions.throwIfFatal(th2);
                Exceptions.throwIfFatal(thA2);
                if (thA2 != null) {
                    subscriber.onError(new CompositeException(th2, thA2));
                } else {
                    subscriber.onError(th2);
                }
            }
        } catch (Throwable th3) {
            Exceptions.throwOrReport(th3, subscriber);
        }
    }
}
