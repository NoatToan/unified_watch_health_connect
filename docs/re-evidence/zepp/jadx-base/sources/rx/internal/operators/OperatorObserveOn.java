package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Scheduler;
import rx.Subscriber;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Action0;
import rx.internal.schedulers.ImmediateScheduler;
import rx.internal.schedulers.TrampolineScheduler;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorObserveOn<T> implements Observable.Operator<T, T> {
    private final Scheduler a;
    private final boolean b;
    private final int c;

    public static class a implements Observable.Operator<T, T> {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // rx.functions.Func1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
            b bVar = new b(Schedulers.immediate(), subscriber, false, this.a);
            bVar.c();
            return bVar;
        }
    }

    public static final class b<T> extends Subscriber<T> implements Action0 {
        public final Subscriber<? super T> f;
        public final Scheduler.Worker g;
        public final boolean h;
        public final Queue<Object> i;
        public final int j;
        public volatile boolean k;
        public final AtomicLong l = new AtomicLong();
        public final AtomicLong m = new AtomicLong();
        public Throwable n;
        public long o;

        public class a implements Producer {
            public a() {
            }

            @Override // rx.Producer
            public void request(long j) {
                if (j > 0) {
                    BackpressureUtils.getAndAddRequest(b.this.l, j);
                    b.this.d();
                }
            }
        }

        public b(Scheduler scheduler, Subscriber<? super T> subscriber, boolean z, int i) {
            this.f = subscriber;
            this.g = scheduler.createWorker();
            this.h = z;
            i = i <= 0 ? RxRingBuffer.SIZE : i;
            this.j = i - (i >> 2);
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.i = new SpscArrayQueue(i);
            } else {
                this.i = new SpscAtomicArrayQueue(i);
            }
            request(i);
        }

        public boolean b(boolean z, boolean z2, Subscriber<? super T> subscriber, Queue<Object> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.n;
                try {
                    if (th != null) {
                        subscriber.onError(th);
                    } else {
                        subscriber.onCompleted();
                    }
                    this.g.unsubscribe();
                    return false;
                } catch (Throwable th2) {
                    this.g.unsubscribe();
                    throw th2;
                }
            }
            Throwable th3 = this.n;
            if (th3 != null) {
                queue.clear();
                try {
                    subscriber.onError(th3);
                    return true;
                } finally {
                    this.g.unsubscribe();
                }
            }
            if (!z2) {
                return false;
            }
            try {
                subscriber.onCompleted();
                return true;
            } finally {
                this.g.unsubscribe();
            }
        }

        public void c() {
            Subscriber<? super T> subscriber = this.f;
            subscriber.setProducer(new a());
            subscriber.add(this.g);
            subscriber.add(this);
        }

        @Override // rx.functions.Action0
        public void call() {
            long j = this.o;
            Queue<Object> queue = this.i;
            Subscriber<? super T> subscriber = this.f;
            long jAddAndGet = 1;
            do {
                long jProduced = this.l.get();
                while (jProduced != j) {
                    boolean z = this.k;
                    Object objPoll = queue.poll();
                    boolean z2 = objPoll == null;
                    if (b(z, z2, subscriber, queue)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                    j++;
                    if (j == this.j) {
                        jProduced = BackpressureUtils.produced(this.l, j);
                        request(j);
                        j = 0;
                    }
                }
                if (jProduced == j && b(this.k, queue.isEmpty(), subscriber, queue)) {
                    return;
                }
                this.o = j;
                jAddAndGet = this.m.addAndGet(-jAddAndGet);
            } while (jAddAndGet != 0);
        }

        public void d() {
            if (this.m.getAndIncrement() == 0) {
                this.g.schedule(this);
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (isUnsubscribed() || this.k) {
                return;
            }
            this.k = true;
            d();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.k) {
                RxJavaHooks.onError(th);
                return;
            }
            this.n = th;
            this.k = true;
            d();
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (isUnsubscribed() || this.k) {
                return;
            }
            if (this.i.offer(NotificationLite.next(t))) {
                d();
            } else {
                onError(new MissingBackpressureException());
            }
        }
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z) {
        this(scheduler, z, RxRingBuffer.SIZE);
    }

    public static <T> Observable.Operator<T, T> rebatch(int i) {
        return new a(i);
    }

    public OperatorObserveOn(Scheduler scheduler, boolean z, int i) {
        this.a = scheduler;
        this.b = z;
        this.c = i <= 0 ? RxRingBuffer.SIZE : i;
    }

    @Override // rx.functions.Func1
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler scheduler = this.a;
        if ((scheduler instanceof ImmediateScheduler) || (scheduler instanceof TrampolineScheduler)) {
            return subscriber;
        }
        b bVar = new b(scheduler, subscriber, this.b, this.c);
        bVar.c();
        return bVar;
    }
}
