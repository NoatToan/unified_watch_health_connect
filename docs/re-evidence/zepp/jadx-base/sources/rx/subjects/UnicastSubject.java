package rx.subjects;

import defpackage.a04;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Observer;
import rx.Producer;
import rx.Subscriber;
import rx.Subscription;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.functions.Action0;
import rx.internal.operators.BackpressureUtils;
import rx.internal.operators.NotificationLite;
import rx.internal.util.atomic.SpscLinkedAtomicQueue;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.SpscLinkedQueue;
import rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes23.dex */
public final class UnicastSubject<T> extends Subject<T, T> {
    public final a<T> b;

    public static final class a<T> extends AtomicLong implements Producer, Observer<T>, Observable.OnSubscribe<T>, Subscription {
        private static final long serialVersionUID = -9044104859202255786L;
        public final AtomicReference<Subscriber<? super T>> a = new AtomicReference<>();
        public final Queue<Object> b;
        public final boolean c;
        public final AtomicReference<Action0> d;
        public Throwable e;
        public volatile boolean f;
        public boolean g;
        public boolean h;
        public volatile boolean i;

        public a(int i, boolean z, Action0 action0) {
            Queue<Object> spscLinkedQueue;
            this.d = action0 != null ? new AtomicReference<>(action0) : null;
            this.c = z;
            if (i > 1) {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new SpscUnboundedAtomicArrayQueue<>(i);
            } else {
                spscLinkedQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscLinkedQueue<>() : new SpscLinkedAtomicQueue<>();
            }
            this.b = spscLinkedQueue;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super T> subscriber) {
            if (!this.a.compareAndSet(null, subscriber)) {
                subscriber.onError(new IllegalStateException("Only a single subscriber is allowed"));
            } else {
                subscriber.add(this);
                subscriber.setProducer(this);
            }
        }

        public boolean b(boolean z, boolean z2, boolean z3, Subscriber<? super T> subscriber) {
            if (subscriber.isUnsubscribed()) {
                this.b.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.e;
            if (th != null && !z3) {
                this.b.clear();
                subscriber.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            if (th != null) {
                subscriber.onError(th);
            } else {
                subscriber.onCompleted();
            }
            return true;
        }

        public void c() {
            Action0 action0;
            AtomicReference<Action0> atomicReference = this.d;
            if (atomicReference == null || (action0 = atomicReference.get()) == null || !atomicReference.compareAndSet(action0, null)) {
                return;
            }
            action0.call();
        }

        public void e() {
            boolean z;
            synchronized (this) {
                if (this.g) {
                    this.h = true;
                    return;
                }
                this.g = true;
                Queue<Object> queue = this.b;
                boolean z2 = this.c;
                while (true) {
                    Subscriber<? super T> subscriber = this.a.get();
                    if (subscriber == null) {
                        z = false;
                    } else {
                        if (b(this.f, queue.isEmpty(), z2, subscriber)) {
                            return;
                        }
                        long j = get();
                        z = j == Long.MAX_VALUE;
                        long j2 = 0;
                        while (j != 0) {
                            boolean z3 = this.f;
                            Object objPoll = queue.poll();
                            boolean z4 = objPoll == null;
                            if (b(z3, z4, z2, subscriber)) {
                                return;
                            }
                            if (z4) {
                                break;
                            }
                            a04 a04Var = (Object) NotificationLite.getValue(objPoll);
                            try {
                                subscriber.onNext(a04Var);
                                j--;
                                j2++;
                            } catch (Throwable th) {
                                queue.clear();
                                Exceptions.throwIfFatal(th);
                                subscriber.onError(OnErrorThrowable.addValueAsLastCause(th, a04Var));
                                return;
                            }
                        }
                        if (!z && j2 != 0) {
                            addAndGet(-j2);
                        }
                    }
                    synchronized (this) {
                        if (!this.h) {
                            if (z && queue.isEmpty()) {
                                this.i = true;
                            }
                            this.g = false;
                            return;
                        }
                        this.h = false;
                    }
                }
            }
        }

        @Override // rx.Subscription
        public boolean isUnsubscribed() {
            return this.f;
        }

        @Override // rx.Observer
        public void onCompleted() {
            if (this.f) {
                return;
            }
            c();
            boolean z = true;
            this.f = true;
            if (!this.i) {
                synchronized (this) {
                    if (this.i) {
                        z = false;
                    }
                }
                if (z) {
                    e();
                    return;
                }
            }
            this.a.get().onCompleted();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (this.f) {
                return;
            }
            c();
            this.e = th;
            boolean z = true;
            this.f = true;
            if (!this.i) {
                synchronized (this) {
                    if (this.i) {
                        z = false;
                    }
                }
                if (z) {
                    e();
                    return;
                }
            }
            this.a.get().onError(th);
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.f) {
                return;
            }
            if (!this.i) {
                boolean z = false;
                synchronized (this) {
                    if (!this.i) {
                        this.b.offer(NotificationLite.next(t));
                        z = true;
                    }
                }
                if (z) {
                    e();
                    return;
                }
            }
            Subscriber<? super T> subscriber = this.a.get();
            try {
                subscriber.onNext(t);
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, t);
            }
        }

        @Override // rx.Producer
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this, j);
                e();
            } else if (this.f) {
                e();
            }
        }

        @Override // rx.Subscription
        public void unsubscribe() {
            c();
            this.f = true;
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                this.b.clear();
            }
        }
    }

    private UnicastSubject(a<T> aVar) {
        super(aVar);
        this.b = aVar;
    }

    public static <T> UnicastSubject<T> create() {
        return create(16);
    }

    @Override // rx.subjects.Subject
    public boolean hasObservers() {
        return this.b.a.get() != null;
    }

    @Override // rx.Observer
    public void onCompleted() {
        this.b.onCompleted();
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        this.b.onError(th);
    }

    @Override // rx.Observer
    public void onNext(T t) {
        this.b.onNext(t);
    }

    public static <T> UnicastSubject<T> create(int i) {
        return new UnicastSubject<>(new a(i, false, null));
    }

    public static <T> UnicastSubject<T> create(boolean z) {
        return new UnicastSubject<>(new a(16, z, null));
    }

    public static <T> UnicastSubject<T> create(int i, Action0 action0) {
        return new UnicastSubject<>(new a(i, false, action0));
    }

    public static <T> UnicastSubject<T> create(int i, Action0 action0, boolean z) {
        return new UnicastSubject<>(new a(i, z, action0));
    }
}
