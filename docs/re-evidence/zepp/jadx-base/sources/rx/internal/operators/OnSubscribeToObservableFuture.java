package rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.internal.producers.SingleProducer;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeToObservableFuture {
    private OnSubscribeToObservableFuture() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future) {
        return new a(future);
    }

    public static <T> Observable.OnSubscribe<T> toObservableFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return new a(future, j, timeUnit);
    }

    public static class a<T> implements Observable.OnSubscribe<T> {
        public final Future<? extends T> a;
        private final long b;
        private final TimeUnit c;

        /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeToObservableFuture$a$a, reason: collision with other inner class name */
        public class C1238a implements Action0 {
            public C1238a() {
            }

            @Override // rx.functions.Action0
            public void call() {
                a.this.a.cancel(true);
            }
        }

        public a(Future<? extends T> future) {
            this.a = future;
            this.b = 0L;
            this.c = null;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            subscriber.add(Subscriptions.create(new C1238a()));
            try {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                TimeUnit timeUnit = this.c;
                subscriber.setProducer(new SingleProducer(subscriber, timeUnit == null ? this.a.get() : this.a.get(this.b, timeUnit)));
            } catch (Throwable th) {
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                Exceptions.throwOrReport(th, subscriber);
            }
        }

        public a(Future<? extends T> future, long j, TimeUnit timeUnit) {
            this.a = future;
            this.b = j;
            this.c = timeUnit;
        }
    }
}
