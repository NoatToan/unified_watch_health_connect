package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes22.dex */
public final class MaybeMergeArray<T> extends Flowable<T> {
    public final MaybeSource<? extends T>[] b;

    public static final class a<T> extends ConcurrentLinkedQueue<T> implements d<T> {
        private static final long serialVersionUID = -4025173261791142821L;
        public int a;
        public final AtomicInteger b = new AtomicInteger();

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public void b() {
            poll();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public int c() {
            return this.a;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public int e() {
            return this.b.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.d, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T t = (T) super.poll();
            if (t != null) {
                this.a++;
            }
            return t;
        }

        @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            this.b.getAndIncrement();
            return super.offer(t);
        }
    }

    public static final class b<T> extends BasicIntQueueSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = -660395290758764731L;
        public final Subscriber<? super T> a;
        public final d<Object> d;
        public final int f;
        public volatile boolean g;
        public boolean h;
        public long i;
        public final CompositeDisposable b = new CompositeDisposable();
        public final AtomicLong c = new AtomicLong();
        public final AtomicThrowable e = new AtomicThrowable();

        public b(Subscriber<? super T> subscriber, int i, d<Object> dVar) {
            this.a = subscriber;
            this.f = i;
            this.d = dVar;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.b.dispose();
            if (getAndIncrement() == 0) {
                this.d.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.d.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.h) {
                f();
            } else {
                g();
            }
        }

        public void f() {
            Subscriber<? super T> subscriber = this.a;
            d<Object> dVar = this.d;
            int iAddAndGet = 1;
            while (!this.g) {
                Throwable th = this.e.get();
                if (th != null) {
                    dVar.clear();
                    subscriber.onError(th);
                    return;
                }
                boolean z = dVar.e() == this.f;
                if (!dVar.isEmpty()) {
                    subscriber.onNext(null);
                }
                if (z) {
                    subscriber.onComplete();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            dVar.clear();
        }

        public void g() {
            Subscriber<? super T> subscriber = this.a;
            d<Object> dVar = this.d;
            long j = this.i;
            int iAddAndGet = 1;
            do {
                long j2 = this.c.get();
                while (j != j2) {
                    if (this.g) {
                        dVar.clear();
                        return;
                    }
                    if (this.e.get() != null) {
                        dVar.clear();
                        subscriber.onError(this.e.terminate());
                        return;
                    } else {
                        if (dVar.c() == this.f) {
                            subscriber.onComplete();
                            return;
                        }
                        Object objPoll = dVar.poll();
                        if (objPoll == null) {
                            break;
                        } else if (objPoll != NotificationLite.COMPLETE) {
                            subscriber.onNext(objPoll);
                            j++;
                        }
                    }
                }
                if (j == j2) {
                    if (this.e.get() != null) {
                        dVar.clear();
                        subscriber.onError(this.e.terminate());
                        return;
                    } else {
                        while (dVar.peek() == NotificationLite.COMPLETE) {
                            dVar.b();
                        }
                        if (dVar.c() == this.f) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                this.i = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public boolean isCancelled() {
            return this.g;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.d.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            if (!this.e.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.b.dispose();
            this.d.offer(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.b.add(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.d.offer(t);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T t;
            do {
                t = (T) this.d.poll();
            } while (t == NotificationLite.COMPLETE);
            return t;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.c, j);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.h = true;
            return 2;
        }
    }

    public interface d<T> extends SimpleQueue<T> {
        void b();

        int c();

        int e();

        T peek();

        @Override // java.util.Queue, io.reactivex.internal.operators.maybe.MaybeMergeArray.d, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        T poll();
    }

    public MaybeMergeArray(MaybeSource<? extends T>[] maybeSourceArr) {
        this.b = maybeSourceArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        MaybeSource[] maybeSourceArr = this.b;
        int length = maybeSourceArr.length;
        b bVar = new b(subscriber, length, length <= Flowable.bufferSize() ? new c(length) : new a());
        subscriber.onSubscribe(bVar);
        AtomicThrowable atomicThrowable = bVar.e;
        for (MaybeSource maybeSource : maybeSourceArr) {
            if (bVar.isCancelled() || atomicThrowable.get() != null) {
                return;
            }
            maybeSource.subscribe(bVar);
        }
    }

    public static final class c<T> extends AtomicReferenceArray<T> implements d<T> {
        private static final long serialVersionUID = -7969063454040569579L;
        public final AtomicInteger a;
        public int b;

        public c(int i) {
            super(i);
            this.a = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public void b() {
            int i = this.b;
            lazySet(i, null);
            this.b = i + 1;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public int c() {
            return this.b;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            while (poll() != null && !isEmpty()) {
            }
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public int e() {
            return this.a.get();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.b == e();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t) {
            ObjectHelper.requireNonNull(t, "value is null");
            int andIncrement = this.a.getAndIncrement();
            if (andIncrement >= length()) {
                return false;
            }
            lazySet(andIncrement, t);
            return true;
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d
        public T peek() {
            int i = this.b;
            if (i == length()) {
                return null;
            }
            return get(i);
        }

        @Override // io.reactivex.internal.operators.maybe.MaybeMergeArray.d, java.util.Queue, io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i = this.b;
            if (i == length()) {
                return null;
            }
            AtomicInteger atomicInteger = this.a;
            do {
                T t = get(i);
                if (t != null) {
                    this.b = i + 1;
                    lazySet(i, null);
                    return t;
                }
            } while (atomicInteger.get() != i);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException();
        }
    }
}
