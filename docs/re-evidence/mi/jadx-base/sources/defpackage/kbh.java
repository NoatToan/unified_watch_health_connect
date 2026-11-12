package defpackage;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import rx.internal.util.unsafe.Pow2;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class kbh<T> implements p4h.b<T, p4h<? extends T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23686b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final kbh<Object> f23687a = new kbh<>(true, Integer.MAX_VALUE);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final kbh<Object> f23688a = new kbh<>(false, Integer.MAX_VALUE);
    }

    public static final class c<T> extends xno<T> {
        public static final int h = x5l.d / 4;
        public final e<T> c;
        public final long d;
        public volatile boolean e;
        public volatile x5l f;
        public int g;

        public c(e<T> eVar, long j) {
            this.c = eVar;
            this.d = j;
        }

        public void a(long j) {
            int i = this.g - ((int) j);
            if (i > h) {
                this.g = i;
                return;
            }
            int i2 = x5l.d;
            this.g = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                request(i3);
            }
        }

        @Override // defpackage.a6h
        public void onCompleted() throws Throwable {
            this.e = true;
            this.c.c();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) throws Throwable {
            this.e = true;
            this.c.i().offer(th);
            this.c.c();
        }

        @Override // defpackage.a6h
        public void onNext(T t) throws Throwable {
            this.c.p(this, t);
        }

        @Override // defpackage.xno
        public void onStart() {
            int i = x5l.d;
            this.g = i;
            request(i);
        }
    }

    public static final class d<T> extends AtomicLong implements cbi {
        private static final long serialVersionUID = -1214379189873595503L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e<T> f23689a;

        public d(e<T> eVar) {
            this.f23689a = eVar;
        }

        public long a(int i) {
            return addAndGet(-i);
        }

        @Override // defpackage.cbi
        public void request(long j) throws Throwable {
            if (j <= 0) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                hx1.b(this, j);
                this.f23689a.c();
            }
        }
    }

    public static final class e<T> extends xno<p4h<? extends T>> {
        public static final c<?>[] t = new c[0];
        public final xno<? super T> c;
        public final boolean d;
        public final int e;
        public d<T> f;
        public volatile Queue<Object> g;
        public volatile sa4 h;
        public volatile ConcurrentLinkedQueue<Throwable> i;
        public volatile boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f23690k;
        public boolean l;
        public final Object m = new Object();
        public volatile c<?>[] n = t;
        public long o;
        public long p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f23691r;
        public int s;

        public e(xno<? super T> xnoVar, boolean z, int i) {
            this.c = xnoVar;
            this.d = z;
            this.e = i;
            if (i == Integer.MAX_VALUE) {
                this.f23691r = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.f23691r = Math.max(1, i >> 1);
                request(i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void a(c<T> cVar) {
            h().a(cVar);
            synchronized (this.m) {
                c<?>[] cVarArr = this.n;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.n = cVarArr2;
            }
        }

        public boolean b() {
            if (this.c.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.i;
            if (this.d || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                n();
                return true;
            } finally {
                unsubscribe();
            }
        }

        public void c() throws Throwable {
            synchronized (this) {
                try {
                    if (this.f23690k) {
                        this.l = true;
                    } else {
                        this.f23690k = true;
                        e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void d() {
            int i = this.s + 1;
            if (i != this.f23691r) {
                this.s = i;
            } else {
                this.s = 0;
                o(i);
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x01a9 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void e() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kbh.e.e():void");
        }

        /* JADX WARN: Code duplicated, block: B:35:0x004c  */
        /* JADX WARN: Code duplicated, block: B:43:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void f(c<T> cVar, T t2, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.c.onNext(t2);
                } catch (Throwable th) {
                    try {
                        if (!this.d) {
                            pf8.d(th);
                            cVar.unsubscribe();
                            cVar.onError(th);
                            return;
                        }
                        i().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f23690k = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f.a(1);
                }
                cVar.a(1L);
                synchronized (this) {
                    try {
                        if (!this.l) {
                            this.f23690k = false;
                        } else {
                            this.l = false;
                            e();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f23690k = false;
                    }
                }
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0057  */
        /* JADX WARN: Code duplicated, block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void g(T t2, long j) throws Throwable {
            boolean z = true;
            try {
                try {
                    this.c.onNext(t2);
                } catch (Throwable th) {
                    try {
                        if (!this.d) {
                            pf8.d(th);
                            unsubscribe();
                            onError(th);
                            return;
                        }
                        i().offer(th);
                    } catch (Throwable th2) {
                        th = th2;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.f23690k = false;
                            }
                        }
                        throw th;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    this.f.a(1);
                }
                int i = this.s + 1;
                if (i == this.f23691r) {
                    this.s = 0;
                    o(i);
                } else {
                    this.s = i;
                }
                synchronized (this) {
                    try {
                        if (!this.l) {
                            this.f23690k = false;
                        } else {
                            this.l = false;
                            e();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                    synchronized (this) {
                        this.f23690k = false;
                    }
                }
                throw th;
            }
        }

        public sa4 h() {
            boolean z;
            sa4 sa4Var = this.h;
            if (sa4Var == null) {
                synchronized (this) {
                    try {
                        sa4Var = this.h;
                        if (sa4Var == null) {
                            sa4Var = new sa4();
                            this.h = sa4Var;
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    add(sa4Var);
                }
            }
            return sa4Var;
        }

        public Queue<Throwable> i() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.i;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    try {
                        concurrentLinkedQueue = this.i;
                        if (concurrentLinkedQueue == null) {
                            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                            this.i = concurrentLinkedQueue;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.a6h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onNext(p4h<? extends T> p4hVar) throws Throwable {
            if (p4hVar == null) {
                return;
            }
            if (p4hVar == p4h.c()) {
                d();
                return;
            }
            if (p4hVar instanceof hal) {
                q(((hal) p4hVar).E());
                return;
            }
            long j = this.o;
            this.o = 1 + j;
            c cVar = new c(this, j);
            a(cVar);
            p4hVar.B(cVar);
            c();
        }

        public void k(c<T> cVar, T t2) throws Throwable {
            x5l x5lVarA = cVar.f;
            if (x5lVarA == null) {
                x5lVarA = x5l.a();
                cVar.add(x5lVarA);
                cVar.f = x5lVarA;
            }
            try {
                x5lVarA.c(bxg.g(t2));
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

        public void l(T t2) throws Throwable {
            Queue<Object> spscExactAtomicArrayQueue;
            Queue<Object> e8oVar = this.g;
            if (e8oVar == null) {
                int i = this.e;
                if (i == Integer.MAX_VALUE) {
                    e8oVar = new e8o<>(x5l.d);
                } else {
                    if (Pow2.isPowerOfTwo(i)) {
                        spscExactAtomicArrayQueue = UnsafeAccess.isUnsafeAvailable() ? new SpscArrayQueue<>(i) : new b8o<>(i);
                    } else {
                        spscExactAtomicArrayQueue = new SpscExactAtomicArrayQueue<>(i);
                    }
                    e8oVar = spscExactAtomicArrayQueue;
                }
                this.g = e8oVar;
            }
            if (e8oVar.offer(bxg.g(t2))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t2));
        }

        public void m(c<T> cVar) {
            x5l x5lVar = cVar.f;
            if (x5lVar != null) {
                x5lVar.e();
            }
            this.h.b(cVar);
            synchronized (this.m) {
                try {
                    c<?>[] cVarArr = this.n;
                    int length = cVarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        } else if (cVar.equals(cVarArr[i])) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.n = t;
                        return;
                    }
                    c<?>[] cVarArr2 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i);
                    System.arraycopy(cVarArr, i + 1, cVarArr2, i, (length - i) - 1);
                    this.n = cVarArr2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void n() {
            ArrayList arrayList = new ArrayList(this.i);
            if (arrayList.size() == 1) {
                this.c.onError((Throwable) arrayList.get(0));
            } else {
                this.c.onError(new CompositeException(arrayList));
            }
        }

        public void o(long j) {
            request(j);
        }

        @Override // defpackage.a6h
        public void onCompleted() throws Throwable {
            this.j = true;
            c();
        }

        @Override // defpackage.a6h
        public void onError(Throwable th) throws Throwable {
            i().offer(th);
            this.j = true;
            c();
        }

        public void p(c<T> cVar, T t2) throws Throwable {
            long j = this.f.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f.get();
                        if (!this.f23690k && j != 0) {
                            z = true;
                            this.f23690k = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (!z) {
                k(cVar, t2);
                c();
                return;
            }
            x5l x5lVar = cVar.f;
            if (x5lVar == null || x5lVar.b()) {
                f(cVar, t2, j);
            } else {
                k(cVar, t2);
                e();
            }
        }

        public void q(T t2) throws Throwable {
            long j = this.f.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    try {
                        j = this.f.get();
                        if (!this.f23690k && j != 0) {
                            z = true;
                            this.f23690k = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (!z) {
                l(t2);
                c();
                return;
            }
            Queue<Object> queue = this.g;
            if (queue == null || queue.isEmpty()) {
                g(t2, j);
            } else {
                l(t2);
                e();
            }
        }
    }

    public kbh(boolean z, int i) {
        this.f23685a = z;
        this.f23686b = i;
    }

    public static <T> kbh<T> b(boolean z) {
        return z ? (kbh<T>) a.f23687a : (kbh<T>) b.f23688a;
    }

    @Override // defpackage.zta
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xno<p4h<? extends T>> call(xno<? super T> xnoVar) {
        e eVar = new e(xnoVar, this.f23685a, this.f23686b);
        d<T> dVar = new d<>(eVar);
        eVar.f = dVar;
        xnoVar.add(eVar);
        xnoVar.setProducer(dVar);
        return eVar;
    }
}
