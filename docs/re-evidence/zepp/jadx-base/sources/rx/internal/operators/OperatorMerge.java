package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.Observable;
import rx.Producer;
import rx.Subscriber;
import rx.exceptions.CompositeException;
import rx.exceptions.Exceptions;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.RxRingBuffer;
import rx.internal.util.ScalarSynchronousObservable;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import rx.internal.util.unsafe.Pow2;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes23.dex */
public final class OperatorMerge<T> implements Observable.Operator<T, Observable<? extends T>> {
    public final boolean a;
    public final int b;

    public static final class a {
        public static final OperatorMerge<Object> a = new OperatorMerge<>(true, Integer.MAX_VALUE);
    }

    public static final class b {
        public static final OperatorMerge<Object> a = new OperatorMerge<>(false, Integer.MAX_VALUE);
    }

    public static final class c<T> extends Subscriber<T> {
        public static final int k = RxRingBuffer.SIZE / 4;
        public final e<T> f;
        public final long g;
        public volatile boolean h;
        public volatile RxRingBuffer i;
        public int j;

        public c(e<T> eVar, long j) {
            this.f = eVar;
            this.g = j;
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.h = true;
            this.f.d();
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            this.h = true;
            this.f.j().offer(th);
            this.f.d();
        }

        @Override // rx.Observer
        public void onNext(T t) throws Throwable {
            this.f.q(this, t);
        }

        @Override // rx.Subscriber, rx.observers.AssertableSubscriber
        public void onStart() {
            int i = RxRingBuffer.SIZE;
            this.j = i;
            request(i);
        }

        public void requestMore(long j) {
            int i = this.j - ((int) j);
            if (i > k) {
                this.j = i;
                return;
            }
            int i2 = RxRingBuffer.SIZE;
            this.j = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                request(i3);
            }
        }
    }

    public static final class d<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        public final e<T> a;

        public d(e<T> eVar) {
            this.a = eVar;
        }

        public long a(int i) {
            return addAndGet(-i);
        }

        @Override // rx.Producer
        public void request(long j) throws Throwable {
            if (j <= 0) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                BackpressureUtils.getAndAddRequest(this, j);
                this.a.d();
            }
        }
    }

    public static final class e<T> extends Subscriber<Observable<? extends T>> {
        public static final c<?>[] w = new c[0];
        public final Subscriber<? super T> f;
        public final boolean g;
        public final int h;
        public d<T> i;
        public volatile Queue<Object> j;
        public volatile CompositeSubscription k;
        public volatile ConcurrentLinkedQueue<Throwable> l;
        public volatile boolean m;
        public boolean n;
        public boolean o;
        public final Object p = new Object();
        public volatile c<?>[] q = w;
        public long r;
        public long s;
        public int t;
        public final int u;
        public int v;

        public e(Subscriber<? super T> subscriber, boolean z, int i) {
            this.f = subscriber;
            this.g = z;
            this.h = i;
            if (i == Integer.MAX_VALUE) {
                this.u = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.u = Math.max(1, i >> 1);
                request(i);
            }
        }

        private void o() {
            ArrayList arrayList = new ArrayList(this.l);
            if (arrayList.size() == 1) {
                this.f.onError((Throwable) arrayList.get(0));
            } else {
                this.f.onError(new CompositeException(arrayList));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(c<T> cVar) {
            i().add(cVar);
            synchronized (this.p) {
                c<?>[] cVarArr = this.q;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.q = cVarArr2;
            }
        }

        public boolean c() {
            if (this.f.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.l;
            if (this.g || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                o();
                return true;
            } finally {
                unsubscribe();
            }
        }

        public void d() throws Throwable {
            synchronized (this) {
                if (this.n) {
                    this.o = true;
                } else {
                    this.n = true;
                    f();
                }
            }
        }

        public void e() {
            int i = this.v + 1;
            if (i != this.u) {
                this.v = i;
            } else {
                this.v = 0;
                requestMore(i);
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x0195 */
        /* JADX WARN: Code duplicated, block: B:159:0x019b  */
        /* JADX WARN: Code duplicated, block: B:167:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void f() throws Throwable {
            boolean z;
            long jA;
            int i;
            boolean z2;
            try {
                Subscriber<? super T> subscriber = this.f;
                while (!c()) {
                    Queue<Object> queue = this.j;
                    long j = this.i.get();
                    boolean z3 = j == Long.MAX_VALUE;
                    if (queue != null) {
                        int i2 = 0;
                        while (true) {
                            jA = j;
                            int i3 = 0;
                            i = i2;
                            Object obj = null;
                            while (jA > 0) {
                                Object objPoll = queue.poll();
                                if (c()) {
                                    return;
                                }
                                if (objPoll == null) {
                                    obj = objPoll;
                                    break;
                                }
                                try {
                                    subscriber.onNext((Object) NotificationLite.getValue(objPoll));
                                } catch (Throwable th) {
                                    if (!this.g) {
                                        Exceptions.throwIfFatal(th);
                                        unsubscribe();
                                        subscriber.onError(th);
                                        return;
                                    }
                                    j().offer(th);
                                }
                                i++;
                                i3++;
                                jA--;
                                obj = objPoll;
                                if (!z) {
                                    synchronized (this) {
                                        this.n = false;
                                    }
                                }
                                throw th;
                            }
                            if (i3 > 0) {
                                jA = z3 ? Long.MAX_VALUE : this.i.a(i3);
                            }
                            if (jA == 0 || obj == null) {
                                break;
                                break;
                            } else {
                                i2 = i;
                                j = jA;
                            }
                        }
                    } else {
                        jA = j;
                        i = 0;
                    }
                    boolean z4 = this.m;
                    Queue<Object> queue2 = this.j;
                    c<?>[] cVarArr = this.q;
                    int length = cVarArr.length;
                    if (z4 && ((queue2 == null || queue2.isEmpty()) && length == 0)) {
                        ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.l;
                        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
                            o();
                            return;
                        }
                        subscriber.onCompleted();
                        return;
                    }
                    if (length > 0) {
                        long j2 = this.s;
                        int i4 = this.t;
                        if (length <= i4 || cVarArr[i4].g != j2) {
                            if (length <= i4) {
                                i4 = 0;
                            }
                            for (int i5 = 0; i5 < length && cVarArr[i4].g != j2; i5++) {
                                i4++;
                                if (i4 == length) {
                                    i4 = 0;
                                }
                            }
                            this.t = i4;
                            this.s = cVarArr[i4].g;
                        }
                        z2 = false;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (c()) {
                                return;
                            }
                            c<?> cVar = cVarArr[i4];
                            Object objPoll2 = null;
                            do {
                                int i7 = 0;
                                while (jA > 0) {
                                    if (c()) {
                                        return;
                                    }
                                    RxRingBuffer rxRingBuffer = cVar.i;
                                    if (rxRingBuffer != null && (objPoll2 = rxRingBuffer.poll()) != null) {
                                        try {
                                            try {
                                                subscriber.onNext((Object) NotificationLite.getValue(objPoll2));
                                                jA--;
                                                i7++;
                                            } catch (Throwable th2) {
                                                Exceptions.throwIfFatal(th2);
                                                try {
                                                    subscriber.onError(th2);
                                                    return;
                                                } finally {
                                                    unsubscribe();
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        synchronized (this) {
                                            this.n = false;
                                        }
                                    }
                                    throw th;
                                }
                                if (i7 > 0) {
                                    jA = !z3 ? this.i.a(i7) : Long.MAX_VALUE;
                                    cVar.requestMore(i7);
                                }
                                if (jA == 0) {
                                    break;
                                }
                            } while (objPoll2 != null);
                            boolean z5 = cVar.h;
                            RxRingBuffer rxRingBuffer2 = cVar.i;
                            if (z5 && (rxRingBuffer2 == null || rxRingBuffer2.isEmpty())) {
                                n(cVar);
                                if (c()) {
                                    return;
                                }
                                i++;
                                z2 = true;
                            }
                            if (jA == 0) {
                                break;
                            }
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.t = i4;
                        this.s = cVarArr[i4].g;
                    } else {
                        z2 = false;
                    }
                    if (i > 0) {
                        request(i);
                    }
                    if (!z2) {
                        try {
                            synchronized (this) {
                                try {
                                    if (this.o) {
                                        this.o = false;
                                    } else {
                                        try {
                                            this.n = false;
                                            return;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            z = true;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    z = false;
                                }
                                while (true) {
                                }
                                throw th;
                            }
                            throw th;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                z = false;
            }
        }

        public void g(T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    try {
                        this.f.onNext(t);
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.n = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (!this.g) {
                        Exceptions.throwIfFatal(th2);
                        unsubscribe();
                        onError(th2);
                        return;
                    }
                    j().offer(th2);
                }
                if (j != Long.MAX_VALUE) {
                    this.i.a(1);
                }
                int i = this.v + 1;
                if (i == this.u) {
                    this.v = 0;
                    requestMore(i);
                } else {
                    this.v = i;
                }
                synchronized (this) {
                    if (!this.o) {
                        this.n = false;
                    } else {
                        this.o = false;
                        f();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x004a  */
        /* JADX WARN: Code duplicated, block: B:46:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void h(c<T> cVar, T t, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    try {
                        this.f.onNext(t);
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.n = false;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    if (!this.g) {
                        Exceptions.throwIfFatal(th2);
                        cVar.unsubscribe();
                        cVar.onError(th2);
                        return;
                    }
                    j().offer(th2);
                }
                if (j != Long.MAX_VALUE) {
                    this.i.a(1);
                }
                cVar.requestMore(1L);
                synchronized (this) {
                    if (!this.o) {
                        this.n = false;
                    } else {
                        this.o = false;
                        f();
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (!z) {
                    synchronized (this) {
                        this.n = false;
                    }
                }
                throw th;
            }
        }

        public CompositeSubscription i() {
            CompositeSubscription compositeSubscription;
            CompositeSubscription compositeSubscription2 = this.k;
            if (compositeSubscription2 != null) {
                return compositeSubscription2;
            }
            boolean z = false;
            synchronized (this) {
                compositeSubscription = this.k;
                if (compositeSubscription == null) {
                    CompositeSubscription compositeSubscription3 = new CompositeSubscription();
                    this.k = compositeSubscription3;
                    compositeSubscription = compositeSubscription3;
                    z = true;
                }
            }
            if (z) {
                add(compositeSubscription);
            }
            return compositeSubscription;
        }

        public Queue<Throwable> j() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.l;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.l;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.l = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // rx.Observer
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onNext(Observable<? extends T> observable) throws Throwable {
            if (observable == null) {
                return;
            }
            if (observable == Observable.empty()) {
                e();
                return;
            }
            if (observable instanceof ScalarSynchronousObservable) {
                p(((ScalarSynchronousObservable) observable).get());
                return;
            }
            long j = this.r;
            this.r = 1 + j;
            c cVar = new c(this, j);
            b(cVar);
            observable.unsafeSubscribe(cVar);
            d();
        }

        public void l(T t) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> spscUnboundedAtomicArrayQueue = this.j;
            if (spscUnboundedAtomicArrayQueue == null) {
                int i = this.h;
                if (i == Integer.MAX_VALUE) {
                    spscUnboundedAtomicArrayQueue = new SpscUnboundedAtomicArrayQueue<>(RxRingBuffer.SIZE);
                } else {
                    if (Pow2.isPowerOfTwo(i)) {
                        spscExactAtomicArrayQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new SpscAtomicArrayQueue<>(i);
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i);
                    }
                    spscUnboundedAtomicArrayQueue = spscExactAtomicArrayQueue;
                }
                this.j = spscUnboundedAtomicArrayQueue;
            }
            if (spscUnboundedAtomicArrayQueue.offer(NotificationLite.next(t))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
        }

        public void m(c<T> cVar, T t) throws Throwable {
            RxRingBuffer spscInstance = cVar.i;
            if (spscInstance == null) {
                spscInstance = RxRingBuffer.getSpscInstance();
                cVar.add(spscInstance);
                cVar.i = spscInstance;
            }
            try {
                spscInstance.onNext(NotificationLite.next(t));
            } catch (IllegalStateException e) {
                if (cVar.isUnsubscribed()) {
                    return;
                }
                cVar.unsubscribe();
                cVar.onError(e);
            } catch (MissingBackpressureException e2) {
                cVar.unsubscribe();
                cVar.onError(e2);
            }
        }

        public void n(c<T> cVar) {
            RxRingBuffer rxRingBuffer = cVar.i;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.k.remove(cVar);
            synchronized (this.p) {
                c<?>[] cVarArr = this.q;
                int length = cVarArr.length;
                int i = -1;
                for (int i2 = 0; i2 < length; i2++) {
                    if (cVar.equals(cVarArr[i2])) {
                        i = i2;
                        break;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    this.q = w;
                    return;
                }
                c<?>[] cVarArr2 = new c[length - 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
                System.arraycopy(cVarArr, i + 1, cVarArr2, i, (length - i) - 1);
                this.q = cVarArr2;
            }
        }

        @Override // rx.Observer
        public void onCompleted() throws Throwable {
            this.m = true;
            d();
        }

        @Override // rx.Observer
        public void onError(Throwable th) throws Throwable {
            j().offer(th);
            this.m = true;
            d();
        }

        public void p(T t) throws Throwable {
            long j = this.i.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.i.get();
                    if (!this.n && j != 0) {
                        this.n = true;
                        z = true;
                    }
                }
            }
            if (!z) {
                l(t);
                d();
                return;
            }
            Queue<Object> queue = this.j;
            if (queue == null || queue.isEmpty()) {
                g(t, j);
            } else {
                l(t);
                f();
            }
        }

        public void q(c<T> cVar, T t) throws Throwable {
            long j = this.i.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.i.get();
                    if (!this.n && j != 0) {
                        this.n = true;
                        z = true;
                    }
                }
            }
            if (!z) {
                m(cVar, t);
                d();
                return;
            }
            RxRingBuffer rxRingBuffer = cVar.i;
            if (rxRingBuffer == null || rxRingBuffer.isEmpty()) {
                h(cVar, t, j);
            } else {
                m(cVar, t);
                f();
            }
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static <T> OperatorMerge<T> instance(boolean z) {
        return z ? (OperatorMerge<T>) a.a : (OperatorMerge<T>) b.a;
    }

    @Override // rx.functions.Func1
    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        e eVar = new e(subscriber, this.a, this.b);
        d<T> dVar = new d<>(eVar);
        eVar.i = dVar;
        subscriber.add(eVar);
        subscriber.setProducer(dVar);
        return eVar;
    }

    public static <T> OperatorMerge<T> instance(boolean z, int i) {
        if (i > 0) {
            if (i == Integer.MAX_VALUE) {
                return instance(z);
            }
            return new OperatorMerge<>(z, i);
        }
        throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i);
    }
}
