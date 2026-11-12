package rx.internal.operators;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.functions.Func1;
import rx.internal.util.ExceptionsUtils;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.atomic.SpscLinkedArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.plugins.RxJavaHooks;

/* JADX INFO: loaded from: classes23.dex */
public final class OnSubscribeFlattenIterable<T, R> implements Observable.OnSubscribe<R> {
    public final Observable<? extends T> a;
    public final Func1<? super T, ? extends Iterable<? extends R>> b;
    public final int c;

    public class a implements Producer {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // rx.Producer
        public void request(long j) {
            this.a.requestMore(j);
        }
    }

    public static final class b<T, R> extends Subscriber<T> {
        public final Subscriber<? super R> f;
        public final Func1<? super T, ? extends Iterable<? extends R>> g;
        public final long h;
        public final Queue<Object> i;
        public volatile boolean m;
        public long n;
        public Iterator<? extends R> o;
        public final AtomicReference<Throwable> j = new AtomicReference<>();
        public final AtomicInteger l = new AtomicInteger();
        public final AtomicLong k = new AtomicLong();

        public b(Subscriber<? super R> subscriber, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
            this.f = subscriber;
            this.g = func1;
            if (i == Integer.MAX_VALUE) {
                this.h = Long.MAX_VALUE;
                this.i = new SpscLinkedArrayQueue(RxRingBuffer.SIZE);
            } else {
                this.h = i - (i >> 2);
                if (UnsafeAccess.isUnsafeAvailable()) {
                    this.i = new SpscArrayQueue(i);
                } else {
                    this.i = new SpscAtomicArrayQueue(i);
                }
            }
            request(i);
        }

        public boolean b(boolean z, boolean z2, Subscriber<?> subscriber, Queue<?> queue) {
            if (subscriber.isUnsubscribed()) {
                queue.clear();
                this.o = null;
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.j.get() == null) {
                if (!z2) {
                    return false;
                }
                subscriber.onCompleted();
                return true;
            }
            Throwable thTerminate = ExceptionsUtils.terminate(this.j);
            unsubscribe();
            queue.clear();
            this.o = null;
            subscriber.onError(thTerminate);
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0063  */
        /* JADX WARN: Code duplicated, block: B:28:0x0066  */
        /* JADX WARN: Code duplicated, block: B:31:0x0072  */
        /* JADX WARN: Code duplicated, block: B:38:0x008b  */
        /* JADX WARN: Code duplicated, block: B:49:0x00af  */
        /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:64:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x007a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x008a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x00c0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:75:0x00cc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x00d8 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x0010 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0092 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:? A[LOOP:1: B:29:0x006d->B:84:?, LOOP_END, SYNTHETIC] */
        public void c() {
            int i;
            long j;
            long j2;
            boolean z;
            if (this.l.getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f;
            Queue<?> queue = this.i;
            int iAddAndGet = 1;
            while (true) {
                Iterator<? extends R> it2 = this.o;
                boolean z2 = false;
                if (it2 == null) {
                    boolean z3 = this.m;
                    Object objPoll = queue.poll();
                    boolean z4 = objPoll == null;
                    if (b(z3, z4, subscriber, queue)) {
                        return;
                    }
                    if (z4) {
                        i = iAddAndGet;
                    } else {
                        long j3 = this.n + 1;
                        i = iAddAndGet;
                        if (j3 == this.h) {
                            this.n = 0L;
                            request(j3);
                        } else {
                            this.n = j3;
                        }
                        try {
                            it2 = this.g.call((Object) NotificationLite.getValue(objPoll)).iterator();
                            if (it2.hasNext()) {
                                this.o = it2;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            onError(th);
                        }
                    }
                    if (it2 != null) {
                        j = this.k.get();
                        j2 = 0;
                        while (j2 != j) {
                            if (b(this.m, false, subscriber, queue)) {
                                return;
                            }
                            try {
                                subscriber.onNext(it2.next());
                                if (b(this.m, false, subscriber, queue)) {
                                    return;
                                }
                                j2++;
                                try {
                                    if (!it2.hasNext()) {
                                        this.o = null;
                                        it2 = null;
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.o = null;
                                    onError(th2);
                                }
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                this.o = null;
                                onError(th3);
                            }
                        }
                        if (j2 == j) {
                            z = this.m;
                            if (queue.isEmpty() && it2 == null) {
                                z2 = true;
                            }
                            if (b(z, z2, subscriber, queue)) {
                                return;
                            }
                        }
                        if (j2 != 0) {
                            BackpressureUtils.produced(this.k, j2);
                        }
                        if (it2 == null) {
                        }
                    }
                    iAddAndGet = this.l.addAndGet(-i);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    i = iAddAndGet;
                    if (it2 != null) {
                        j = this.k.get();
                        j2 = 0;
                        while (j2 != j) {
                            if (b(this.m, false, subscriber, queue)) {
                                return;
                            }
                            subscriber.onNext(it2.next());
                            if (b(this.m, false, subscriber, queue)) {
                                return;
                            }
                            j2++;
                            if (!it2.hasNext()) {
                                this.o = null;
                                it2 = null;
                                break;
                            }
                        }
                        if (j2 == j) {
                            z = this.m;
                            if (queue.isEmpty()) {
                                z2 = true;
                            }
                            if (b(z, z2, subscriber, queue)) {
                                return;
                            }
                        }
                        if (j2 != 0) {
                            BackpressureUtils.produced(this.k, j2);
                        }
                        if (it2 == null) {
                        }
                    }
                    iAddAndGet = this.l.addAndGet(-i);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                iAddAndGet = i;
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
            this.m = true;
            c();
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (!ExceptionsUtils.addThrowable(this.j, th)) {
                RxJavaHooks.onError(th);
            } else {
                this.m = true;
                c();
            }
        }

        @Override // rx.Observer
        public void onNext(T t) {
            if (this.i.offer(NotificationLite.next(t))) {
                c();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        public void requestMore(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.k, j);
                c();
            } else {
                if (j >= 0) {
                    return;
                }
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
        }
    }

    public static final class c<T, R> implements Observable.OnSubscribe<R> {
        public final T a;
        public final Func1<? super T, ? extends Iterable<? extends R>> b;

        public c(T t, Func1<? super T, ? extends Iterable<? extends R>> func1) {
            this.a = t;
            this.b = func1;
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Subscriber<? super R> subscriber) {
            try {
                Iterator<? extends R> it2 = this.b.call(this.a).iterator();
                if (it2.hasNext()) {
                    subscriber.setProducer(new OnSubscribeFromIterable.a(subscriber, it2));
                } else {
                    subscriber.onCompleted();
                }
            } catch (Throwable th) {
                Exceptions.throwOrReport(th, subscriber, this.a);
            }
        }
    }

    public OnSubscribeFlattenIterable(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        this.a = observable;
        this.b = func1;
        this.c = i;
    }

    public static <T, R> Observable<R> createFrom(Observable<? extends T> observable, Func1<? super T, ? extends Iterable<? extends R>> func1, int i) {
        return observable instanceof ScalarSynchronousObservable ? Observable.unsafeCreate(new c(((ScalarSynchronousObservable) observable).get(), func1)) : Observable.unsafeCreate(new OnSubscribeFlattenIterable(observable, func1, i));
    }

    @Override // rx.functions.Action1
    public void call(Subscriber<? super R> subscriber) {
        b bVar = new b(subscriber, this.b, this.c);
        subscriber.add(bVar);
        subscriber.setProducer(new a(bVar));
        this.a.unsafeSubscribe(bVar);
    }
}
