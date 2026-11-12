package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes22.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    public final T[] b;

    public static final class a<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final ConditionalSubscriber<? super T> d;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.d = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public void a() {
            T[] tArr = this.a;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.d;
            for (int i = this.b; i != length; i++) {
                if (this.c) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    conditionalSubscriber.onError(new NullPointerException("array element is null"));
                    return;
                }
                conditionalSubscriber.tryOnNext(t);
            }
            if (this.c) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public void f(long j) {
            T[] tArr = this.a;
            int length = tArr.length;
            int i = this.b;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.c) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.c) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            conditionalSubscriber.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            if (conditionalSubscriber.tryOnNext(t)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
                this.b = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class b<T> extends c<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final Subscriber<? super T> d;

        public b(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.d = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public void a() {
            T[] tArr = this.a;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.d;
            for (int i = this.b; i != length; i++) {
                if (this.c) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    subscriber.onError(new NullPointerException("array element is null"));
                    return;
                }
                subscriber.onNext(t);
            }
            if (this.c) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public void f(long j) {
            T[] tArr = this.a;
            int length = tArr.length;
            int i = this.b;
            Subscriber<? super T> subscriber = this.d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.c) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.c) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            subscriber.onError(new NullPointerException("array element is null"));
                            return;
                        } else {
                            subscriber.onNext(t);
                            j2++;
                            i++;
                        }
                    }
                }
                this.b = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static abstract class c<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public final T[] a;
        public int b;
        public volatile boolean c;

        public c(T[] tArr) {
            this.a = tArr;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.c = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.b = this.a.length;
        }

        public abstract void f(long j);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.b == this.a.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i = this.b;
            T[] tArr = this.a;
            if (i == tArr.length) {
                return null;
            }
            this.b = i + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i], "array element is null");
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (SubscriptionHelper.validate(j) && BackpressureHelper.add(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    a();
                } else {
                    f(j);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            return i & 1;
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.b = tArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            subscriber.onSubscribe(new a((ConditionalSubscriber) subscriber, this.b));
        } else {
            subscriber.onSubscribe(new b(subscriber, this.b));
        }
    }
}
