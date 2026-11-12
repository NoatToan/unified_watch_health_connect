package d13;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class j<T, U> extends d13.a<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super T, ? extends q03.o<? extends U>> f57163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57166e;

    public static final class a<T, U> extends AtomicReference<s03.b> implements q03.p<U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f57167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T, U> f57168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f57169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile x03.h<U> f57170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f57171e;

        public a(b<T, U> bVar, long j8) {
            this.f57167a = j8;
            this.f57168b = bVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar) && (bVar instanceof x03.c)) {
                x03.c cVar = (x03.c) bVar;
                int iE = cVar.e();
                if (iE == 1) {
                    this.f57171e = iE;
                    this.f57170d = cVar;
                    this.f57169c = true;
                    this.f57168b.f();
                    return;
                }
                if (iE == 2) {
                    this.f57171e = iE;
                    this.f57170d = cVar;
                }
            }
        }

        @Override // q03.p
        public final void c(U u8) {
            int i14 = this.f57171e;
            b<T, U> bVar = this.f57168b;
            if (i14 != 0) {
                bVar.f();
                return;
            }
            if (bVar.get() == 0 && bVar.compareAndSet(0, 1)) {
                bVar.f57174a.c(u8);
                if (bVar.decrementAndGet() == 0) {
                    return;
                }
            } else {
                x03.h bVar2 = this.f57170d;
                if (bVar2 == null) {
                    bVar2 = new f13.b(bVar.f57178e);
                    this.f57170d = bVar2;
                }
                bVar2.offer(u8);
                if (bVar.getAndIncrement() != 0) {
                    return;
                }
            }
            bVar.g();
        }

        @Override // q03.p
        public final void onComplete() {
            this.f57169c = true;
            this.f57168b.f();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (!this.f57168b.f57181h.a(th3)) {
                k13.a.b(th3);
                return;
            }
            b<T, U> bVar = this.f57168b;
            if (!bVar.f57176c) {
                bVar.e();
            }
            this.f57169c = true;
            this.f57168b.f();
        }
    }

    public static final class b<T, U> extends AtomicInteger implements s03.b, q03.p<T> {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a<?, ?>[] f57172q = new a[0];

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a<?, ?>[] f57173r = new a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super U> f57174a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super T, ? extends q03.o<? extends U>> f57175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f57176c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f57177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f57178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile x03.g<U> f57179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f57180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i13.b f57181h = new i13.b();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f57182i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicReference<a<?, ?>[]> f57183j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public s03.b f57184k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f57185l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f57186m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f57187n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final ArrayDeque f57188o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f57189p;

        public b(q03.p<? super U> pVar, u03.f<? super T, ? extends q03.o<? extends U>> fVar, boolean z14, int i14, int i15) {
            this.f57174a = pVar;
            this.f57175b = fVar;
            this.f57176c = z14;
            this.f57177d = i14;
            this.f57178e = i15;
            if (i14 != Integer.MAX_VALUE) {
                this.f57188o = new ArrayDeque(i14);
            }
            this.f57183j = new AtomicReference<>(f57172q);
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f57184k, bVar)) {
                this.f57184k = bVar;
                this.f57174a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57182i;
        }

        @Override // q03.p
        public final void c(T t7) {
            if (this.f57180g) {
                return;
            }
            try {
                q03.o<? extends U> oVarMo330apply = this.f57175b.mo330apply(t7);
                w03.b.a(oVarMo330apply, "The mapper returned a null ObservableSource");
                q03.o<? extends U> oVar = oVarMo330apply;
                if (this.f57177d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i14 = this.f57189p;
                            if (i14 == this.f57177d) {
                                this.f57188o.offer(oVar);
                                return;
                            }
                            this.f57189p = i14 + 1;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                i(oVar);
            } catch (Throwable th4) {
                t03.a.a(th4);
                this.f57184k.dispose();
                onError(th4);
            }
        }

        public final boolean d() {
            if (!this.f57182i) {
                Throwable th3 = this.f57181h.get();
                if (this.f57176c || th3 == null) {
                    return false;
                }
                e();
                Throwable thB = this.f57181h.b();
                if (thB != i13.d.f87106a) {
                    this.f57174a.onError(thB);
                }
            }
            return true;
        }

        @Override // s03.b
        public final void dispose() {
            Throwable thB;
            if (this.f57182i) {
                return;
            }
            this.f57182i = true;
            if (!e() || (thB = this.f57181h.b()) == null || thB == i13.d.f87106a) {
                return;
            }
            k13.a.b(thB);
        }

        public final boolean e() {
            a<?, ?>[] andSet;
            this.f57184k.dispose();
            AtomicReference<a<?, ?>[]> atomicReference = this.f57183j;
            a<?, ?>[] aVarArr = atomicReference.get();
            a<?, ?>[] aVarArr2 = f57173r;
            if (aVarArr == aVarArr2 || (andSet = atomicReference.getAndSet(aVarArr2)) == aVarArr2) {
                return false;
            }
            for (a<?, ?> aVar : andSet) {
                aVar.getClass();
                v03.c.a(aVar);
            }
            return true;
        }

        public final void f() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        /* JADX WARN: Code duplicated, block: B:112:0x011f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:0x0102 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:89:0x0101 A[PHI: r4
          0x0101: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e0, B:88:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void g() {
            int size;
            boolean z14;
            q03.p<? super U> pVar = this.f57174a;
            int iAddAndGet = 1;
            while (!d()) {
                x03.g<U> gVar = this.f57179f;
                int i14 = 0;
                if (gVar != null) {
                    while (!d()) {
                        U uPoll = gVar.poll();
                        if (uPoll != null) {
                            pVar.c(uPoll);
                            i14++;
                        }
                    }
                    return;
                }
                if (i14 == 0) {
                    boolean z15 = this.f57180g;
                    x03.g<U> gVar2 = this.f57179f;
                    a<?, ?>[] aVarArr = this.f57183j.get();
                    int length = aVarArr.length;
                    if (this.f57177d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.f57188o.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z15 && ((gVar2 == null || gVar2.isEmpty()) && length == 0 && size == 0)) {
                        Throwable thB = this.f57181h.b();
                        if (thB != i13.d.f87106a) {
                            if (thB == null) {
                                pVar.onComplete();
                                return;
                            } else {
                                pVar.onError(thB);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j8 = this.f57186m;
                        int i15 = this.f57187n;
                        if (length <= i15 || aVarArr[i15].f57167a != j8) {
                            if (length <= i15) {
                                i15 = 0;
                            }
                            for (int i16 = 0; i16 < length && aVarArr[i15].f57167a != j8; i16++) {
                                i15++;
                                if (i15 == length) {
                                    i15 = 0;
                                }
                            }
                            this.f57187n = i15;
                            this.f57186m = aVarArr[i15].f57167a;
                        }
                        for (int i17 = 0; i17 < length; i17++) {
                            if (d()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[i15];
                            x03.h<U> hVar = aVar.f57170d;
                            if (hVar != null) {
                                do {
                                    try {
                                        U uPoll2 = hVar.poll();
                                        if (uPoll2 == null) {
                                            z14 = aVar.f57169c;
                                            x03.h<U> hVar2 = aVar.f57170d;
                                            if (z14 && (hVar2 == null || hVar2.isEmpty())) {
                                                h(aVar);
                                                if (d()) {
                                                    return;
                                                } else {
                                                    i14++;
                                                }
                                            }
                                            i15++;
                                            if (i15 == length) {
                                                i15 = 0;
                                            }
                                        } else {
                                            pVar.c(uPoll2);
                                        }
                                    } catch (Throwable th3) {
                                        t03.a.a(th3);
                                        v03.c.a(aVar);
                                        this.f57181h.a(th3);
                                        if (d()) {
                                            return;
                                        }
                                        h(aVar);
                                        i14++;
                                        i15++;
                                        if (i15 == length) {
                                        }
                                    }
                                } while (!d());
                                return;
                            }
                            z14 = aVar.f57169c;
                            x03.h<U> hVar3 = aVar.f57170d;
                            if (z14) {
                                h(aVar);
                                if (d()) {
                                    return;
                                } else {
                                    i14++;
                                }
                            }
                            i15++;
                            if (i15 == length) {
                                i15 = 0;
                            }
                        }
                        this.f57187n = i15;
                        this.f57186m = aVarArr[i15].f57167a;
                    }
                    if (i14 == 0) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else if (this.f57177d != Integer.MAX_VALUE) {
                        k(i14);
                    }
                } else if (this.f57177d != Integer.MAX_VALUE) {
                    k(i14);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h(a<T, U> aVar) {
            a<?, ?>[] aVarArr;
            while (true) {
                AtomicReference<a<?, ?>[]> atomicReference = this.f57183j;
                a<?, ?>[] aVarArr2 = atomicReference.get();
                int length = aVarArr2.length;
                if (length == 0) {
                    return;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        i14 = -1;
                        break;
                    } else if (aVarArr2[i14] == aVar) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr = f57172q;
                } else {
                    a<?, ?>[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr2, 0, aVarArr3, 0, i14);
                    System.arraycopy(aVarArr2, i14 + 1, aVarArr3, i14, (length - i14) - 1);
                    aVarArr = aVarArr3;
                }
                while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                    if (atomicReference.get() != aVarArr2) {
                    }
                }
                return;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v5, types: [x03.h] */
        public final void i(q03.o<? extends U> oVar) {
            boolean z14;
            do {
                z14 = false;
                if (oVar instanceof Callable) {
                    try {
                        Object objCall = ((Callable) oVar).call();
                        if (objCall != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                this.f57174a.c(objCall);
                                if (decrementAndGet() != 0) {
                                    g();
                                }
                            } else {
                                x03.g<U> gVar = this.f57179f;
                                ?? r14 = gVar;
                                if (gVar == false) {
                                    x03.g<U> bVar = this.f57177d == Integer.MAX_VALUE ? new f13.b(this.f57178e) : new f13.a(this.f57177d);
                                    this.f57179f = bVar;
                                    r14 = bVar;
                                }
                                if (r14.offer(objCall)) {
                                    if (getAndIncrement() != 0) {
                                        return;
                                    }
                                    g();
                                } else {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        t03.a.a(th3);
                        this.f57181h.a(th3);
                        f();
                    }
                    if (this.f57177d == Integer.MAX_VALUE) {
                        return;
                    }
                    synchronized (this) {
                        try {
                            oVar = (q03.o) this.f57188o.poll();
                            if (oVar == null) {
                                this.f57189p--;
                                z14 = true;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } else {
                    long j8 = this.f57185l;
                    this.f57185l = 1 + j8;
                    a<?, ?> aVar = new a<>(this, j8);
                    AtomicReference<a<?, ?>[]> atomicReference = this.f57183j;
                    while (true) {
                        a<?, ?>[] aVarArr = atomicReference.get();
                        if (aVarArr == f57173r) {
                            v03.c.a(aVar);
                            return;
                        }
                        int length = aVarArr.length;
                        a<?, ?>[] aVarArr2 = new a[length + 1];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr2[length] = aVar;
                        do {
                            if (atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                                oVar.b(aVar);
                                return;
                            }
                        } while (atomicReference.get() == aVarArr);
                    }
                }
            } while (!z14);
            f();
        }

        public final void k(int i14) {
            while (true) {
                int i15 = i14 - 1;
                if (i14 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        q03.o<? extends U> oVar = (q03.o) this.f57188o.poll();
                        if (oVar == null) {
                            this.f57189p--;
                        } else {
                            i(oVar);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                i14 = i15;
            }
        }

        @Override // q03.p
        public final void onComplete() {
            if (this.f57180g) {
                return;
            }
            this.f57180g = true;
            f();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (this.f57180g) {
                k13.a.b(th3);
            } else if (!this.f57181h.a(th3)) {
                k13.a.b(th3);
            } else {
                this.f57180g = true;
                f();
            }
        }
    }

    public j(q03.o<T> oVar, u03.f<? super T, ? extends q03.o<? extends U>> fVar, boolean z14, int i14, int i15) {
        super(oVar);
        this.f57163b = fVar;
        this.f57164c = z14;
        this.f57165d = i14;
        this.f57166e = i15;
    }

    @Override // q03.l
    public final void f(q03.p<? super U> pVar) {
        u03.f<? super T, ? extends q03.o<? extends U>> fVar = this.f57163b;
        q03.o<T> oVar = this.f57107a;
        if (!(oVar instanceof Callable)) {
            oVar.b(new b(pVar, this.f57163b, this.f57164c, this.f57165d, this.f57166e));
            return;
        }
        try {
            a0.f fVar2 = (Object) ((Callable) oVar).call();
            if (fVar2 == null) {
                pVar.a(v03.d.INSTANCE);
                pVar.onComplete();
                return;
            }
            try {
                q03.o<? extends U> oVarMo330apply = fVar.mo330apply(fVar2);
                w03.b.a(oVarMo330apply, "The mapper returned a null ObservableSource");
                q03.o<? extends U> oVar2 = oVarMo330apply;
                if (!(oVar2 instanceof Callable)) {
                    oVar2.b(pVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) oVar2).call();
                    if (objCall == null) {
                        pVar.a(v03.d.INSTANCE);
                        pVar.onComplete();
                    } else {
                        r rVar = new r(pVar, objCall);
                        pVar.a(rVar);
                        rVar.run();
                    }
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    pVar.a(v03.d.INSTANCE);
                    pVar.onError(th3);
                }
            } catch (Throwable th4) {
                t03.a.a(th4);
                pVar.a(v03.d.INSTANCE);
                pVar.onError(th4);
            }
        } catch (Throwable th5) {
            t03.a.a(th5);
            pVar.a(v03.d.INSTANCE);
            pVar.onError(th5);
        }
    }
}
