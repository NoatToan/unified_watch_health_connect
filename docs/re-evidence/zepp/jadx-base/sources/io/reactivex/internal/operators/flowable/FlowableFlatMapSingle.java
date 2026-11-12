package io.reactivex.internal.operators.flowable;

import defpackage.a05;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableFlatMapSingle<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {
    public final Function<? super T, ? extends SingleSource<? extends R>> b;
    public final boolean c;
    public final int d;

    public static final class a<T, R> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 8600231336733376951L;
        public final Subscriber<? super R> a;
        public final boolean b;
        public final int c;
        public final Function<? super T, ? extends SingleSource<? extends R>> h;
        public Subscription j;
        public volatile boolean k;
        public final AtomicLong d = new AtomicLong();
        public final CompositeDisposable e = new CompositeDisposable();
        public final AtomicThrowable g = new AtomicThrowable();
        public final AtomicInteger f = new AtomicInteger(1);
        public final AtomicReference<SpscLinkedArrayQueue<R>> i = new AtomicReference<>();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapSingle$a$a, reason: collision with other inner class name */
        public final class C1102a extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public C1102a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                a.this.f(this, th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r) {
                a.this.g(this, r);
            }
        }

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
            this.a = subscriber;
            this.h = function;
            this.b = z;
            this.c = i;
        }

        public void a() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.i.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void b() {
            if (getAndIncrement() == 0) {
                c();
            }
        }

        public void c() {
            Subscriber<? super R> subscriber = this.a;
            AtomicInteger atomicInteger = this.f;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.i;
            int iAddAndGet = 1;
            do {
                long j = this.d.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.k) {
                        a();
                        return;
                    }
                    if (!this.b && this.g.get() != null) {
                        Throwable thTerminate = this.g.terminate();
                        a();
                        subscriber.onError(thTerminate);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                    a05 a05VarPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z2 = a05VarPoll == null;
                    if (z && z2) {
                        Throwable thTerminate2 = this.g.terminate();
                        if (thTerminate2 != null) {
                            subscriber.onError(thTerminate2);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(a05VarPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.k) {
                        a();
                        return;
                    }
                    if (!this.b && this.g.get() != null) {
                        Throwable thTerminate3 = this.g.terminate();
                        a();
                        subscriber.onError(thTerminate3);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                    boolean z4 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z3 && z4) {
                        Throwable thTerminate4 = this.g.terminate();
                        if (thTerminate4 != null) {
                            subscriber.onError(thTerminate4);
                            return;
                        } else {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.d, j2);
                    if (this.c != Integer.MAX_VALUE) {
                        this.j.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.k = true;
            this.j.cancel();
            this.e.dispose();
        }

        public SpscLinkedArrayQueue<R> e() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.i.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            } while (!this.i.compareAndSet(null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        public void f(a<T, R>.C1102a c1102a, Throwable th) {
            this.e.delete(c1102a);
            if (!this.g.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.b) {
                this.j.cancel();
                this.e.dispose();
            } else if (this.c != Integer.MAX_VALUE) {
                this.j.request(1L);
            }
            this.f.decrementAndGet();
            b();
        }

        /* JADX WARN: Code duplicated, block: B:34:0x007a  */
        /* JADX WARN: Code duplicated, block: B:40:0x008e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void g(a<T, R>.C1102a c1102a, R r) {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueueE;
            this.e.delete(c1102a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f.decrementAndGet() == 0;
                    if (this.d.get() != 0) {
                        this.a.onNext(r);
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.i.get();
                        if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                            Throwable thTerminate = this.g.terminate();
                            if (thTerminate != null) {
                                this.a.onError(thTerminate);
                                return;
                            } else {
                                this.a.onComplete();
                                return;
                            }
                        }
                        BackpressureHelper.produced(this.d, 1L);
                        if (this.c != Integer.MAX_VALUE) {
                            this.j.request(1L);
                        }
                    } else {
                        SpscLinkedArrayQueue<R> spscLinkedArrayQueueE2 = e();
                        synchronized (spscLinkedArrayQueueE2) {
                            spscLinkedArrayQueueE2.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    spscLinkedArrayQueueE = e();
                    synchronized (spscLinkedArrayQueueE) {
                        spscLinkedArrayQueueE.offer(r);
                    }
                    this.f.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                spscLinkedArrayQueueE = e();
                synchronized (spscLinkedArrayQueueE) {
                    spscLinkedArrayQueueE.offer(r);
                    this.f.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            c();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f.decrementAndGet();
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f.decrementAndGet();
            if (!this.g.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (!this.b) {
                this.e.dispose();
            }
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.h.apply(t), "The mapper returned a null SingleSource");
                this.f.getAndIncrement();
                C1102a c1102a = new C1102a();
                if (this.k || !this.e.add(c1102a)) {
                    return;
                }
                singleSource.subscribe(c1102a);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.j.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.j, subscription)) {
                this.j = subscription;
                this.a.onSubscribe(this);
                int i = this.c;
                if (i == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.d, j);
                b();
            }
        }
    }

    public FlowableFlatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z, int i) {
        super(flowable);
        this.b = function;
        this.c = z;
        this.d = i;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.b, this.c, this.d));
    }
}
