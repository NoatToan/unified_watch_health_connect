package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.internal.operators.flowable.a<T, T> {
    public final long b;
    public final Action c;
    public final BackpressureOverflowStrategy d;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            a = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = 3240706908776709697L;
        public final Subscriber<? super T> a;
        public final Action b;
        public final BackpressureOverflowStrategy c;
        public final long d;
        public final AtomicLong e = new AtomicLong();
        public final Deque<T> f = new ArrayDeque();
        public Subscription g;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable j;

        public b(Subscriber<? super T> subscriber, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j) {
            this.a = subscriber;
            this.b = action;
            this.c = backpressureOverflowStrategy;
            this.d = j;
        }

        public void a(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        public void b() {
            boolean zIsEmpty;
            T tPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            Deque<T> deque = this.f;
            Subscriber<? super T> subscriber = this.a;
            int iAddAndGet = 1;
            do {
                long j = this.e.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.h) {
                        a(deque);
                        return;
                    }
                    boolean z = this.i;
                    synchronized (deque) {
                        tPoll = deque.poll();
                    }
                    boolean z2 = tPoll == null;
                    if (z) {
                        Throwable th = this.j;
                        if (th != null) {
                            a(deque);
                            subscriber.onError(th);
                            return;
                        } else if (z2) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    subscriber.onNext(tPoll);
                    j2++;
                }
                if (j2 == j) {
                    if (this.h) {
                        a(deque);
                        return;
                    }
                    boolean z3 = this.i;
                    synchronized (deque) {
                        zIsEmpty = deque.isEmpty();
                    }
                    if (z3) {
                        Throwable th2 = this.j;
                        if (th2 != null) {
                            a(deque);
                            subscriber.onError(th2);
                            return;
                        } else if (zIsEmpty) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.produced(this.e, j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.h = true;
            this.g.cancel();
            if (getAndIncrement() == 0) {
                a(this.f);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.i) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.j = th;
            this.i = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            boolean z;
            boolean z2;
            if (this.i) {
                return;
            }
            Deque<T> deque = this.f;
            synchronized (deque) {
                z = false;
                z2 = true;
                if (deque.size() == this.d) {
                    int i = a.a[this.c.ordinal()];
                    if (i == 1) {
                        deque.pollLast();
                        deque.offer(t);
                    } else if (i == 2) {
                        deque.poll();
                        deque.offer(t);
                    }
                    z = true;
                } else {
                    deque.offer(t);
                }
                z2 = false;
            }
            if (!z) {
                if (!z2) {
                    b();
                    return;
                } else {
                    this.g.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            Action action = this.b;
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.g.cancel();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.g, subscription)) {
                this.g = subscription;
                this.a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.e, j);
                b();
            }
        }
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.b = j;
        this.c = action;
        this.d = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(subscriber, this.c, this.d, this.b));
    }
}
