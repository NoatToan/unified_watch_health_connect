package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.observables.ConnectableObservable;
import rx.subscriptions.CompositeSubscription;
import rx.subscriptions.Subscriptions;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeRefCount<T> implements Observable.OnSubscribe<T> {
    private final ConnectableObservable<? extends T> a;
    public volatile CompositeSubscription b = new CompositeSubscription();
    public final AtomicInteger c = new AtomicInteger(0);
    public final ReentrantLock d = new ReentrantLock();

    public class a implements Action1<Subscription> {
        public final /* synthetic */ Subscriber a;
        public final /* synthetic */ AtomicBoolean b;

        public a(Subscriber subscriber, AtomicBoolean atomicBoolean) {
            this.a = subscriber;
            this.b = atomicBoolean;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscription subscription) {
            try {
                OnSubscribeRefCount.this.b.add(subscription);
                OnSubscribeRefCount onSubscribeRefCount = OnSubscribeRefCount.this;
                onSubscribeRefCount.c(this.a, onSubscribeRefCount.b);
            } finally {
                OnSubscribeRefCount.this.d.unlock();
                this.b.set(false);
            }
        }
    }

    public class b extends Subscriber<T> {
        public final /* synthetic */ Subscriber f;
        public final /* synthetic */ CompositeSubscription g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Subscriber subscriber, Subscriber subscriber2, CompositeSubscription compositeSubscription) {
            super(subscriber);
            this.f = subscriber2;
            this.g = compositeSubscription;
        }

        public void b() {
            OnSubscribeRefCount.this.d.lock();
            try {
                if (OnSubscribeRefCount.this.b == this.g) {
                    if (OnSubscribeRefCount.this.a instanceof Subscription) {
                        ((Subscription) OnSubscribeRefCount.this.a).unsubscribe();
                    }
                    OnSubscribeRefCount.this.b.unsubscribe();
                    OnSubscribeRefCount.this.b = new CompositeSubscription();
                    OnSubscribeRefCount.this.c.set(0);
                }
            } finally {
                OnSubscribeRefCount.this.d.unlock();
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            b();
            this.f.onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            b();
            this.f.onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            this.f.onNext(t);
        }
    }

    public class c implements Action0 {
        public final /* synthetic */ CompositeSubscription a;

        public c(CompositeSubscription compositeSubscription) {
            this.a = compositeSubscription;
        }

        @Override // rx.functions.Action0
        public void call() {
            OnSubscribeRefCount.this.d.lock();
            try {
                if (OnSubscribeRefCount.this.b == this.a && OnSubscribeRefCount.this.c.decrementAndGet() == 0) {
                    if (OnSubscribeRefCount.this.a instanceof Subscription) {
                        ((Subscription) OnSubscribeRefCount.this.a).unsubscribe();
                    }
                    OnSubscribeRefCount.this.b.unsubscribe();
                    OnSubscribeRefCount.this.b = new CompositeSubscription();
                }
            } finally {
                OnSubscribeRefCount.this.d.unlock();
            }
        }
    }

    public OnSubscribeRefCount(ConnectableObservable<? extends T> connectableObservable) {
        this.a = connectableObservable;
    }

    private Subscription b(CompositeSubscription compositeSubscription) {
        return Subscriptions.create(new c(compositeSubscription));
    }

    private Action1<Subscription> d(Subscriber<? super T> subscriber, AtomicBoolean atomicBoolean) {
        return new a(subscriber, atomicBoolean);
    }

    public void c(Subscriber<? super T> subscriber, CompositeSubscription compositeSubscription) {
        subscriber.add(b(compositeSubscription));
        this.a.unsafeSubscribe(new b(subscriber, subscriber, compositeSubscription));
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        this.d.lock();
        if (this.c.incrementAndGet() != 1) {
            try {
                c(subscriber, this.b);
            } finally {
                this.d.unlock();
            }
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            try {
                this.a.connect(d(subscriber, atomicBoolean));
            } finally {
                if (atomicBoolean.get()) {
                    this.d.unlock();
                }
            }
        }
    }
}
