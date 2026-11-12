package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y4h<T, U> extends h10<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bua<? super T, ? extends o5h<? extends U>> f39779b;
    public final boolean c;
    public final int d;
    public final int e;

    public static final class a<T, U> extends AtomicReference<jz6> implements z5h<U> {
        private static final long serialVersionUID = -4606175640614850599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T, U> f39781b;
        public volatile boolean c;
        public volatile jdm<U> d;
        public int e;

        public a(b<T, U> bVar, long j) {
            this.f39780a = j;
            this.f39781b = bVar;
        }

        public void a() {
            DisposableHelper.dispose(this);
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.c = true;
            this.f39781b.d();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (!this.f39781b.h.addThrowable(th)) {
                t5l.p(th);
                return;
            }
            b<T, U> bVar = this.f39781b;
            if (!bVar.c) {
                bVar.c();
            }
            this.c = true;
            this.f39781b.d();
        }

        @Override // defpackage.z5h
        public void onNext(U u) {
            if (this.e == 0) {
                this.f39781b.i(u, this);
            } else {
                this.f39781b.d();
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.setOnce(this, jz6Var) && (jz6Var instanceof bgi)) {
                bgi bgiVar = (bgi) jz6Var;
                int iRequestFusion = bgiVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.e = iRequestFusion;
                    this.d = bgiVar;
                    this.c = true;
                    this.f39781b.d();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.e = iRequestFusion;
                    this.d = bgiVar;
                }
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements jz6, z5h<T> {
        public static final a<?, ?>[] q = new a[0];

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a<?, ?>[] f39782r = new a[0];
        private static final long serialVersionUID = -2117620485640801370L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super U> f39783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bua<? super T, ? extends o5h<? extends U>> f39784b;
        public final boolean c;
        public final int d;
        public final int e;
        public volatile fdm<U> f;
        public volatile boolean g;
        public final AtomicThrowable h = new AtomicThrowable();
        public volatile boolean i;
        public final AtomicReference<a<?, ?>[]> j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public jz6 f39785k;
        public long l;
        public long m;
        public int n;
        public Queue<o5h<? extends U>> o;
        public int p;

        public b(z5h<? super U> z5hVar, bua<? super T, ? extends o5h<? extends U>> buaVar, boolean z, int i, int i2) {
            this.f39783a = z5hVar;
            this.f39784b = buaVar;
            this.c = z;
            this.d = i;
            this.e = i2;
            if (i != Integer.MAX_VALUE) {
                this.o = new ArrayDeque(i);
            }
            this.j = new AtomicReference<>(q);
        }

        public boolean a(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = this.j.get();
                if (aVarArr == f39782r) {
                    aVar.a();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!d8i.a(this.j, aVarArr, aVarArr2));
            return true;
        }

        public boolean b() {
            if (this.i) {
                return true;
            }
            Throwable th = this.h.get();
            if (this.c || th == null) {
                return false;
            }
            c();
            Throwable thTerminate = this.h.terminate();
            if (thTerminate != jf8.f22731a) {
                this.f39783a.onError(thTerminate);
            }
            return true;
        }

        public boolean c() {
            a<?, ?>[] andSet;
            this.f39785k.dispose();
            a<?, ?>[] aVarArr = this.j.get();
            a<?, ?>[] aVarArr2 = f39782r;
            if (aVarArr == aVarArr2 || (andSet = this.j.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.a();
            }
            return true;
        }

        public void d() {
            if (getAndIncrement() == 0) {
                e();
            }
        }

        @Override // defpackage.jz6
        public void dispose() {
            Throwable thTerminate;
            if (this.i) {
                return;
            }
            this.i = true;
            if (!c() || (thTerminate = this.h.terminate()) == null || thTerminate == jf8.f22731a) {
                return;
            }
            t5l.p(thTerminate);
        }

        /* JADX WARN: Code duplicated, block: B:113:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:0x00fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:90:0x00fc A[PHI: r4
          0x00fc: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:77:0x00db, B:89:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public void e() {
            int size;
            boolean z;
            z5h<? super U> z5hVar = this.f39783a;
            int iAddAndGet = 1;
            while (!b()) {
                fdm<U> fdmVar = this.f;
                int i = 0;
                if (fdmVar != null) {
                    while (!b()) {
                        U uPoll = fdmVar.poll();
                        if (uPoll != null) {
                            z5hVar.onNext(uPoll);
                            i++;
                        }
                    }
                    return;
                }
                if (i == 0) {
                    boolean z2 = this.g;
                    fdm<U> fdmVar2 = this.f;
                    a<?, ?>[] aVarArr = this.j.get();
                    int length = aVarArr.length;
                    if (this.d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.o.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((fdmVar2 == null || fdmVar2.isEmpty()) && length == 0 && size == 0)) {
                        Throwable thTerminate = this.h.terminate();
                        if (thTerminate != jf8.f22731a) {
                            if (thTerminate == null) {
                                z5hVar.onComplete();
                                return;
                            } else {
                                z5hVar.onError(thTerminate);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.m;
                        int i2 = this.n;
                        if (length <= i2 || aVarArr[i2].f39780a != j) {
                            if (length <= i2) {
                                i2 = 0;
                            }
                            for (int i3 = 0; i3 < length && aVarArr[i2].f39780a != j; i3++) {
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                            }
                            this.n = i2;
                            this.m = aVarArr[i2].f39780a;
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            if (b()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[i2];
                            jdm<U> jdmVar = aVar.d;
                            if (jdmVar != null) {
                                do {
                                    try {
                                        U uPoll2 = jdmVar.poll();
                                        if (uPoll2 == null) {
                                            z = aVar.c;
                                            jdm<U> jdmVar2 = aVar.d;
                                            if (z && (jdmVar2 == null || jdmVar2.isEmpty())) {
                                                f(aVar);
                                                if (b()) {
                                                    return;
                                                } else {
                                                    i++;
                                                }
                                            }
                                            i2++;
                                            if (i2 == length) {
                                                i2 = 0;
                                            }
                                        } else {
                                            z5hVar.onNext(uPoll2);
                                        }
                                    } catch (Throwable th) {
                                        qf8.b(th);
                                        aVar.a();
                                        this.h.addThrowable(th);
                                        if (b()) {
                                            return;
                                        }
                                        f(aVar);
                                        i++;
                                        i2++;
                                        if (i2 == length) {
                                        }
                                    }
                                } while (!b());
                                return;
                            }
                            z = aVar.c;
                            jdm<U> jdmVar3 = aVar.d;
                            if (z) {
                                f(aVar);
                                if (b()) {
                                    return;
                                } else {
                                    i++;
                                }
                            }
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.n = i2;
                        this.m = aVarArr[i2].f39780a;
                    }
                    if (i == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.d != Integer.MAX_VALUE) {
                        h(i);
                    }
                } else if (this.d != Integer.MAX_VALUE) {
                    h(i);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void f(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            a<?, ?>[] aVarArr2;
            do {
                aVarArr = this.j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (aVarArr[i] == aVar) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                    System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!d8i.a(this.j, aVarArr, aVarArr2));
        }

        public void g(o5h<? extends U> o5hVar) {
            boolean z;
            while (o5hVar instanceof Callable) {
                if (!j((Callable) o5hVar) || this.d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        o5hVar = this.o.poll();
                        if (o5hVar == null) {
                            z = true;
                            this.p--;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    d();
                    return;
                }
            }
            long j = this.l;
            this.l = 1 + j;
            a<T, U> aVar = new a<>(this, j);
            if (a(aVar)) {
                o5hVar.a(aVar);
            }
        }

        public void h(int i) {
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        o5h<? extends U> o5hVarPoll = this.o.poll();
                        if (o5hVarPoll == null) {
                            this.p--;
                        } else {
                            g(o5hVarPoll);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i = i2;
            }
        }

        public void i(U u, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f39783a.onNext(u);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                jdm c8oVar = aVar.d;
                if (c8oVar == null) {
                    c8oVar = new c8o(this.e);
                    aVar.d = c8oVar;
                }
                c8oVar.offer(u);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            e();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.i;
        }

        public boolean j(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f39783a.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    fdm<U> c8oVar = this.f;
                    if (c8oVar == null) {
                        c8oVar = this.d == Integer.MAX_VALUE ? new c8o<>(this.e) : new SpscArrayQueue<>(this.d);
                        this.f = c8oVar;
                    }
                    if (!c8oVar.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                e();
                return true;
            } catch (Throwable th) {
                qf8.b(th);
                this.h.addThrowable(th);
                d();
                return true;
            }
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            d();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.g) {
                t5l.p(th);
            } else if (!this.h.addThrowable(th)) {
                t5l.p(th);
            } else {
                this.g = true;
                d();
            }
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.g) {
                return;
            }
            try {
                o5h<? extends U> o5hVar = (o5h) x3h.d(this.f39784b.apply(t), "The mapper returned a null ObservableSource");
                if (this.d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.p;
                            if (i == this.d) {
                                this.o.offer(o5hVar);
                                return;
                            }
                            this.p = i + 1;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                g(o5hVar);
            } catch (Throwable th2) {
                qf8.b(th2);
                this.f39785k.dispose();
                onError(th2);
            }
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.f39785k, jz6Var)) {
                this.f39785k = jz6Var;
                this.f39783a.onSubscribe(this);
            }
        }
    }

    public y4h(o5h<T> o5hVar, bua<? super T, ? extends o5h<? extends U>> buaVar, boolean z, int i, int i2) {
        super(o5hVar);
        this.f39779b = buaVar;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super U> z5hVar) {
        if (ObservableScalarXMap.b(this.f19561a, z5hVar, this.f39779b)) {
            return;
        }
        this.f19561a.a(new b(z5hVar, this.f39779b, this.c, this.d, this.e));
    }
}
