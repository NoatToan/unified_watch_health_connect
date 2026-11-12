package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.internal.producers.SingleProducer;
import rx.internal.schedulers.EventLoopsScheduler;
import rx.observers.Subscribers;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class ScalarSynchronousObservable<T> extends Observable<T> {
    public static final boolean c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();
    public final T b;

    public class a implements Func1<Action0, Subscription> {
        public final /* synthetic */ EventLoopsScheduler a;

        public a(EventLoopsScheduler eventLoopsScheduler) {
            this.a = eventLoopsScheduler;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call(Action0 action0) {
            return this.a.scheduleDirect(action0);
        }
    }

    public class b implements Func1<Action0, Subscription> {
        public final /* synthetic */ Scheduler a;

        public class a implements Action0 {
            public final /* synthetic */ Action0 a;
            public final /* synthetic */ Scheduler.Worker b;

            public a(Action0 action0, Scheduler.Worker worker) {
                this.a = action0;
                this.b = worker;
            }

            @Override // rx.functions.Action0
            public void call() {
                try {
                    this.a.call();
                } finally {
                    this.b.unsubscribe();
                }
            }
        }

        public b(Scheduler scheduler) {
            this.a = scheduler;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscription call(Action0 action0) {
            Scheduler.Worker workerCreateWorker = this.a.createWorker();
            workerCreateWorker.schedule(new a(action0, workerCreateWorker));
            return workerCreateWorker;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public class c<R> implements Observable.OnSubscribe<R> {
        public final /* synthetic */ Func1 a;

        public c(Func1 func1) {
            this.a = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super R> subscriber) {
            Observable observable = (Observable) this.a.call(ScalarSynchronousObservable.this.b);
            if (observable instanceof ScalarSynchronousObservable) {
                subscriber.setProducer(ScalarSynchronousObservable.c(subscriber, ((ScalarSynchronousObservable) observable).b));
            } else {
                observable.unsafeSubscribe(Subscribers.wrap(subscriber));
            }
        }
    }

    public static final class d<T> implements Observable.OnSubscribe<T> {
        public final T a;

        public d(T t) {
            this.a = t;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(ScalarSynchronousObservable.c(subscriber, this.a));
        }
    }

    public static final class e<T> implements Observable.OnSubscribe<T> {
        public final T a;
        public final Func1<Action0, Subscription> b;

        public e(T t, Func1<Action0, Subscription> func1) {
            this.a = t;
            this.b = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            subscriber.setProducer(new f(subscriber, this.a, this.b));
        }
    }

    public static final class f<T> extends AtomicBoolean implements Producer, Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        public final Subscriber<? super T> a;
        public final T b;
        public final Func1<Action0, Subscription> c;

        public f(Subscriber<? super T> subscriber, T t, Func1<Action0, Subscription> func1) {
            this.a = subscriber;
            this.b = t;
            this.c = func1;
        }

        @Override // rx.functions.Action0
        public void call() {
            Subscriber<? super T> subscriber = this.a;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t = this.b;
            try {
                subscriber.onNext(t);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, t);
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
            if (j == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.a.add(this.c.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.b + ", " + get() + "]";
        }
    }

    public static final class g<T> implements Producer {
        public final Subscriber<? super T> a;
        public final T b;
        public boolean c;

        public g(Subscriber<? super T> subscriber, T t) {
            this.a = subscriber;
            this.b = t;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (this.c) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("n >= required but it was " + j);
            }
            if (j == 0) {
                return;
            }
            this.c = true;
            Subscriber<? super T> subscriber = this.a;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            T t = this.b;
            try {
                subscriber.onNext(t);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, t);
            }
        }
    }

    public ScalarSynchronousObservable(T t) {
        super(RxJavaHooks.onCreate(new d(t)));
        this.b = t;
    }

    public static <T> Producer c(Subscriber<? super T> subscriber, T t) {
        return c ? new SingleProducer(subscriber, t) : new g(subscriber, t);
    }

    public static <T> ScalarSynchronousObservable<T> create(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    public T get() {
        return this.b;
    }

    public <R> Observable<R> scalarFlatMap(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.unsafeCreate(new c(func1));
    }

    public Observable<T> scalarScheduleOn(Scheduler scheduler) {
        return Observable.unsafeCreate(new e(this.b, scheduler instanceof EventLoopsScheduler ? new a((EventLoopsScheduler) scheduler) : new b(scheduler)));
    }
}
