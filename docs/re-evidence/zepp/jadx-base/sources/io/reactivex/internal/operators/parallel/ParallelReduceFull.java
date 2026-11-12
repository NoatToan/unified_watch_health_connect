package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes22.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {
    public final ParallelFlowable<? extends T> b;
    public final BiFunction<T, T, T> c;

    public static final class a<T> extends AtomicReference<Subscription> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        public final b<T> a;
        public final BiFunction<T, T, T> b;
        public T c;
        public boolean d;

        public a(b<T> bVar, BiFunction<T, T, T> biFunction) {
            this.a = bVar;
            this.b = biFunction;
        }

        public void a() {
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.g(this.c);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.onError(th);
            } else {
                this.d = true;
                this.a.a(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.d) {
                return;
            }
            T t2 = this.c;
            if (t2 == null) {
                this.c = t;
                return;
            }
            try {
                this.c = (T) ObjectHelper.requireNonNull(this.b.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class b<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        public final a<T>[] i;
        public final BiFunction<T, T, T> j;
        public final AtomicReference<c<T>> k;
        public final AtomicInteger l;
        public final AtomicReference<Throwable> m;

        public b(Subscriber<? super T> subscriber, int i, BiFunction<T, T, T> biFunction) {
            super(subscriber);
            this.k = new AtomicReference<>();
            this.l = new AtomicInteger();
            this.m = new AtomicReference<>();
            a<T>[] aVarArr = new a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = new a<>(this, biFunction);
            }
            this.i = aVarArr;
            this.j = biFunction;
            this.l.lazySet(i);
        }

        public void a(Throwable th) {
            if (this.m.compareAndSet(null, th)) {
                cancel();
                this.downstream.onError(th);
            } else if (th != this.m.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            for (a<T> aVar : this.i) {
                aVar.a();
            }
        }

        public c<T> f(T t) {
            c<T> cVar;
            int iB;
            while (true) {
                cVar = this.k.get();
                if (cVar == null) {
                    cVar = new c<>();
                    if (!this.k.compareAndSet(null, cVar)) {
                        continue;
                    }
                }
                iB = cVar.b();
                if (iB >= 0) {
                    break;
                }
                this.k.compareAndSet(cVar, null);
            }
            if (iB == 0) {
                cVar.a = t;
            } else {
                cVar.b = t;
            }
            if (!cVar.a()) {
                return null;
            }
            this.k.compareAndSet(cVar, null);
            return cVar;
        }

        public void g(T t) {
            if (t != null) {
                while (true) {
                    c<T> cVarF = f(t);
                    if (cVarF == null) {
                        break;
                    }
                    try {
                        t = (T) ObjectHelper.requireNonNull(this.j.apply(cVarF.a, cVarF.b), "The reducer returned a null value");
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        a(th);
                        return;
                    }
                }
            }
            if (this.l.decrementAndGet() == 0) {
                c<T> cVar = this.k.get();
                this.k.lazySet(null);
                if (cVar != null) {
                    complete(cVar.a);
                } else {
                    this.downstream.onComplete();
                }
            }
        }
    }

    public static final class c<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        public T a;
        public T b;
        public final AtomicInteger c = new AtomicInteger();

        public boolean a() {
            return this.c.incrementAndGet() == 2;
        }

        public int b() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }
    }

    public ParallelReduceFull(ParallelFlowable<? extends T> parallelFlowable, BiFunction<T, T, T> biFunction) {
        this.b = parallelFlowable;
        this.c = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        b bVar = new b(subscriber, this.b.parallelism(), this.c);
        subscriber.onSubscribe(bVar);
        this.b.subscribe(bVar.i);
    }
}
