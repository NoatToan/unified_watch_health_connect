package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorMaterialize<T> implements Observable.Operator<Notification<T>, T> {

    public class a implements Producer {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j > 0) {
                this.a.requestMore(j);
            }
        }
    }

    public static final class b {
        public static final OperatorMaterialize<Object> a = new OperatorMaterialize<>();
    }

    public static class c<T> extends Subscriber<T> {
        private final Subscriber<? super Notification<T>> f;
        private volatile Notification<T> g;
        private boolean h;
        private boolean i;
        private final AtomicLong j = new AtomicLong();

        public c(Subscriber<? super Notification<T>> subscriber) {
            this.f = subscriber;
        }

        private void b() {
            long j;
            AtomicLong atomicLong = this.j;
            do {
                j = atomicLong.get();
                if (j == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLong.compareAndSet(j, j - 1));
        }

        private void c() {
            synchronized (this) {
                if (this.h) {
                    this.i = true;
                    return;
                }
                AtomicLong atomicLong = this.j;
                while (!this.f.isUnsubscribed()) {
                    Notification<T> notification = this.g;
                    if (notification != null && atomicLong.get() > 0) {
                        this.g = null;
                        this.f.onNext(notification);
                        if (this.f.isUnsubscribed()) {
                            return;
                        }
                        this.f.onCompleted();
                        return;
                    }
                    synchronized (this) {
                        if (!this.i) {
                            this.h = false;
                            return;
                        }
                    }
                }
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.g = Notification.createOnCompleted();
            c();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            this.g = Notification.createOnError(th);
            RxJavaHooks.onError(th);
            c();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(Notification.createOnNext(t));
            b();
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        public void requestMore(long j) {
            BackpressureUtils.getAndAddRequest(this.j, j);
            request(j);
            c();
        }
    }

    public static <T> OperatorMaterialize<T> instance() {
        return (OperatorMaterialize<T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super Notification<T>> subscriber) {
        c cVar = new c(subscriber);
        subscriber.add(cVar);
        subscriber.setProducer(new a(cVar));
        return cVar;
    }
}
