package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.internal.producers.ProducerArbiter;
import rx.observers.Subscribers;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;
import rx.subscriptions.SerialSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeRedo<T> implements Observable.OnSubscribe<T> {
    public static final Func1<Observable<? extends Notification<?>>, Observable<?>> f = new a();
    public final Observable<T> a;
    private final Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> b;
    public final boolean c;
    public final boolean d;
    private final Scheduler e;

    public static final class RedoFinite implements Func1<Observable<? extends Notification<?>>, Observable<?>> {
        public final long a;

        public class a implements Func1<Notification<?>, Notification<?>> {
            public int a;

            public a() {
            }

            @Override // rx.functions.Func1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                long j = RedoFinite.this.a;
                if (j == 0) {
                    return notification;
                }
                int i = this.a + 1;
                this.a = i;
                return ((long) i) <= j ? Notification.createOnNext(Integer.valueOf(i)) : notification;
            }
        }

        public RedoFinite(long j) {
            this.a = j;
        }

        @Override // rx.functions.Func1
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new a()).dematerialize();
        }
    }

    public static final class RetryWithPredicate implements Func1<Observable<? extends Notification<?>>, Observable<? extends Notification<?>>> {
        public final Func2<Integer, Throwable, Boolean> a;

        public class a implements Func2<Notification<Integer>, Notification<?>, Notification<Integer>> {
            public a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // rx.functions.Func2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<Integer> call(Notification<Integer> notification, Notification<?> notification2) {
                int iIntValue = notification.getValue().intValue();
                return RetryWithPredicate.this.a.call(Integer.valueOf(iIntValue), notification2.getThrowable()).booleanValue() ? Notification.createOnNext(Integer.valueOf(iIntValue + 1)) : notification2;
            }
        }

        public RetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
            this.a = func2;
        }

        @Override // rx.functions.Func1
        public Observable<? extends Notification<?>> call(Observable<? extends Notification<?>> observable) {
            return observable.scan(Notification.createOnNext(0), new a());
        }
    }

    public static class a implements Func1<Observable<? extends Notification<?>>, Observable<?>> {

        /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeRedo$a$a, reason: collision with other inner class name */
        public class C1237a implements Func1<Notification<?>, Notification<?>> {
            public C1237a() {
            }

            @Override // rx.functions.Func1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                return Notification.createOnNext(null);
            }
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new C1237a());
        }
    }

    public class b implements Action0 {
        public final /* synthetic */ Subscriber a;
        public final /* synthetic */ Subject b;
        public final /* synthetic */ ProducerArbiter c;
        public final /* synthetic */ AtomicLong d;
        public final /* synthetic */ SerialSubscription e;

        public class a extends Subscriber<T> {
            public boolean f;

            public a() {
            }

            private void b() {
                long j;
                do {
                    j = b.this.d.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!b.this.d.compareAndSet(j, j - 1));
            }

            @Override // rx.Observer
            public void onCompleted() {
                if (this.f) {
                    return;
                }
                this.f = true;
                unsubscribe();
                b.this.b.onNext(Notification.createOnCompleted());
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                if (this.f) {
                    return;
                }
                this.f = true;
                unsubscribe();
                b.this.b.onNext(Notification.createOnError(th));
            }

            @Override // rx.Observer
            public void onNext(T t) {
                if (this.f) {
                    return;
                }
                b.this.a.onNext(t);
                b();
                b.this.c.produced(1L);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                b.this.c.setProducer(producer);
            }
        }

        public b(Subscriber subscriber, Subject subject, ProducerArbiter producerArbiter, AtomicLong atomicLong, SerialSubscription serialSubscription) {
            this.a = subscriber;
            this.b = subject;
            this.c = producerArbiter;
            this.d = atomicLong;
            this.e = serialSubscription;
        }

        @Override // rx.functions.Action0
        public void call() {
            if (this.a.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.e.set(aVar);
            OnSubscribeRedo.this.a.unsafeSubscribe(aVar);
        }
    }

    public class c implements Observable.Operator<Notification<?>, Notification<?>> {

        public class a extends Subscriber<Notification<?>> {
            public final /* synthetic */ Subscriber f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Subscriber subscriber, Subscriber subscriber2) {
                super(subscriber);
                this.f = subscriber2;
            }

            @Override // rx.Observer
            public void onCompleted() {
                this.f.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                this.f.onError(th);
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producer.request(Long.MAX_VALUE);
            }

            @Override // rx.Observer
            public void onNext(Notification<?> notification) {
                if (notification.isOnCompleted() && OnSubscribeRedo.this.c) {
                    this.f.onCompleted();
                } else if (notification.isOnError() && OnSubscribeRedo.this.d) {
                    this.f.onError(notification.getThrowable());
                } else {
                    this.f.onNext(notification);
                }
            }
        }

        public c() {
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscriber<? super Notification<?>> call(Subscriber<? super Notification<?>> subscriber) {
            return new a(subscriber, subscriber);
        }
    }

    public class d implements Action0 {
        public final /* synthetic */ Observable a;
        public final /* synthetic */ Subscriber b;
        public final /* synthetic */ AtomicLong c;
        public final /* synthetic */ Scheduler.Worker d;
        public final /* synthetic */ Action0 e;
        public final /* synthetic */ AtomicBoolean f;

        public class a extends Subscriber<Object> {
            public a(Subscriber subscriber) {
                super(subscriber);
            }

            @Override // rx.Observer
            public void onCompleted() {
                d.this.b.onCompleted();
            }

            @Override // rx.Observer
            public void onError(Throwable th) {
                d.this.b.onError(th);
            }

            @Override // rx.Observer
            public void onNext(Object obj) {
                if (d.this.b.isUnsubscribed()) {
                    return;
                }
                if (d.this.c.get() <= 0) {
                    d.this.f.compareAndSet(false, true);
                } else {
                    d dVar = d.this;
                    dVar.d.schedule(dVar.e);
                }
            }

            @Override // rx.Subscriber, rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producer.request(Long.MAX_VALUE);
            }
        }

        public d(Observable observable, Subscriber subscriber, AtomicLong atomicLong, Scheduler.Worker worker, Action0 action0, AtomicBoolean atomicBoolean) {
            this.a = observable;
            this.b = subscriber;
            this.c = atomicLong;
            this.d = worker;
            this.e = action0;
            this.f = atomicBoolean;
        }

        @Override // rx.functions.Action0
        public void call() {
            this.a.unsafeSubscribe(new a(this.b));
        }
    }

    public class e implements Producer {
        public final /* synthetic */ AtomicLong a;
        public final /* synthetic */ ProducerArbiter b;
        public final /* synthetic */ AtomicBoolean c;
        public final /* synthetic */ Scheduler.Worker d;
        public final /* synthetic */ Action0 e;

        public e(AtomicLong atomicLong, ProducerArbiter producerArbiter, AtomicBoolean atomicBoolean, Scheduler.Worker worker, Action0 action0) {
            this.a = atomicLong;
            this.b = producerArbiter;
            this.c = atomicBoolean;
            this.d = worker;
            this.e = action0;
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.a, j);
                this.b.request(j);
                if (this.c.compareAndSet(true, false)) {
                    this.d.schedule(this.e);
                }
            }
        }
    }

    private OnSubscribeRedo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, boolean z, boolean z2, Scheduler scheduler) {
        this.a = observable;
        this.b = func1;
        this.c = z;
        this.d = z2;
        this.e = scheduler;
    }

    public static <T> Observable<T> redo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable) {
        return repeat(observable, Schedulers.trampoline());
    }

    public static <T> Observable<T> retry(Observable<T> observable) {
        return retry(observable, f);
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Scheduler scheduler) {
        return repeat(observable, f, scheduler);
    }

    public static <T> Observable<T> retry(Observable<T> observable, long j) {
        if (j >= 0) {
            return j == 0 ? observable : retry(observable, new RedoFinite(j));
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super T> subscriber) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        Scheduler.Worker workerCreateWorker = this.e.createWorker();
        subscriber.add(workerCreateWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        SerializedSubject<T, T> serialized = BehaviorSubject.create().toSerialized();
        serialized.subscribe((Subscriber) Subscribers.empty());
        ProducerArbiter producerArbiter = new ProducerArbiter();
        b bVar = new b(subscriber, serialized, producerArbiter, atomicLong, serialSubscription);
        workerCreateWorker.schedule(new d(this.b.call(serialized.lift(new c())), subscriber, atomicLong, workerCreateWorker, bVar, atomicBoolean));
        subscriber.setProducer(new e(atomicLong, producerArbiter, atomicBoolean, workerCreateWorker, bVar));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j) {
        return repeat(observable, j, Schedulers.trampoline());
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j, Scheduler scheduler) {
        if (j == 0) {
            return Observable.empty();
        }
        if (j >= 0) {
            return repeat(observable, new RedoFinite(j - 1), scheduler);
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, true, false, Schedulers.trampoline()));
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, true, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, true, Schedulers.trampoline()));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, true, scheduler));
    }
}
