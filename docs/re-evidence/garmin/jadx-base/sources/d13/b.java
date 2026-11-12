package d13;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T, R> extends q03.l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.o<? extends T>[] f57108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<? extends q03.o<? extends T>> f57109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.f<? super Object[], ? extends R> f57110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57112e;

    public static final class a<T, R> extends AtomicReference<s03.b> implements q03.p<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1223b<T, R> f57113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f57114b;

        public a(C1223b<T, R> c1223b, int i14) {
            this.f57113a = c1223b;
            this.f57114b = i14;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            v03.c.f(this, bVar);
        }

        @Override // q03.p
        public final void c(T t7) {
            boolean z14;
            C1223b<T, R> c1223b = this.f57113a;
            int i14 = this.f57114b;
            synchronized (c1223b) {
                try {
                    Object[] objArr = c1223b.f57118d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i14];
                    int i15 = c1223b.f57124j;
                    if (obj == null) {
                        i15++;
                        c1223b.f57124j = i15;
                    }
                    objArr[i14] = t7;
                    if (i15 == objArr.length) {
                        c1223b.f57119e.offer((Object[]) objArr.clone());
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        c1223b.d();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
        @Override // q03.p
        public final void onComplete() {
            C1223b<T, R> c1223b = this.f57113a;
            int i14 = this.f57114b;
            synchronized (c1223b) {
                try {
                    Object[] objArr = c1223b.f57118d;
                    if (objArr == null) {
                        return;
                    }
                    boolean z14 = objArr[i14] == null;
                    if (z14) {
                        c1223b.f57122h = true;
                    } else {
                        int i15 = c1223b.f57125k + 1;
                        c1223b.f57125k = i15;
                        if (i15 == objArr.length) {
                            c1223b.f57122h = true;
                        }
                    }
                    if (z14) {
                        c1223b.a();
                    }
                    c1223b.d();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x002b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001a, B:18:0x0023, B:21:0x002d, B:20:0x002b), top: B:31:0x0012 }] */
        @Override // q03.p
        public final void onError(Throwable th3) {
            C1223b<T, R> c1223b = this.f57113a;
            int i14 = this.f57114b;
            if (!c1223b.f57123i.a(th3)) {
                k13.a.b(th3);
                return;
            }
            boolean z14 = true;
            if (c1223b.f57120f) {
                synchronized (c1223b) {
                    try {
                        Object[] objArr = c1223b.f57118d;
                        if (objArr == null) {
                            return;
                        }
                        boolean z15 = objArr[i14] == null;
                        if (z15) {
                            c1223b.f57122h = true;
                        } else {
                            int i15 = c1223b.f57125k + 1;
                            c1223b.f57125k = i15;
                            if (i15 == objArr.length) {
                                c1223b.f57122h = true;
                            }
                        }
                        z14 = z15;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            if (z14) {
                c1223b.a();
            }
            c1223b.d();
        }
    }

    /* JADX INFO: renamed from: d13.b$b, reason: collision with other inner class name */
    public static final class C1223b<T, R> extends AtomicInteger implements s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super R> f57115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super Object[], ? extends R> f57116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a<T, R>[] f57117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object[] f57118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final f13.b<Object[]> f57119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f57120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f57121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f57122h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final i13.b f57123i = new i13.b();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f57124j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f57125k;

        public C1223b(q03.p<? super R> pVar, u03.f<? super Object[], ? extends R> fVar, int i14, int i15, boolean z14) {
            this.f57115a = pVar;
            this.f57116b = fVar;
            this.f57120f = z14;
            this.f57118d = new Object[i14];
            a<T, R>[] aVarArr = new a[i14];
            for (int i16 = 0; i16 < i14; i16++) {
                aVarArr[i16] = new a<>(this, i16);
            }
            this.f57117c = aVarArr;
            this.f57119e = new f13.b<>(i15);
        }

        public final void a() {
            for (a<T, R> aVar : this.f57117c) {
                aVar.getClass();
                v03.c.a(aVar);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f57121g;
        }

        public final void c(f13.b<?> bVar) {
            synchronized (this) {
                this.f57118d = null;
            }
            bVar.clear();
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            f13.b<Object[]> bVar = this.f57119e;
            q03.p<? super R> pVar = this.f57115a;
            boolean z14 = this.f57120f;
            int iAddAndGet = 1;
            while (!this.f57121g) {
                if (!z14 && this.f57123i.get() != null) {
                    a();
                    c(bVar);
                    pVar.onError(this.f57123i.b());
                    return;
                }
                boolean z15 = this.f57122h;
                Object[] objArrPoll = bVar.poll();
                boolean z16 = objArrPoll == null;
                if (z15 && z16) {
                    c(bVar);
                    Throwable thB = this.f57123i.b();
                    if (thB == null) {
                        pVar.onComplete();
                        return;
                    } else {
                        pVar.onError(thB);
                        return;
                    }
                }
                if (z16) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rMo330apply = this.f57116b.mo330apply(objArrPoll);
                        w03.b.a(rMo330apply, "The combiner returned a null value");
                        pVar.c(rMo330apply);
                    } catch (Throwable th3) {
                        t03.a.a(th3);
                        this.f57123i.a(th3);
                        a();
                        c(bVar);
                        pVar.onError(this.f57123i.b());
                        return;
                    }
                }
            }
            c(bVar);
        }

        @Override // s03.b
        public final void dispose() {
            if (this.f57121g) {
                return;
            }
            this.f57121g = true;
            a();
            if (getAndIncrement() == 0) {
                c(this.f57119e);
            }
        }
    }

    public b(q03.o<? extends T>[] oVarArr, Iterable<? extends q03.o<? extends T>> iterable, u03.f<? super Object[], ? extends R> fVar, int i14, boolean z14) {
        this.f57108a = oVarArr;
        this.f57109b = iterable;
        this.f57110c = fVar;
        this.f57111d = i14;
        this.f57112e = z14;
    }

    @Override // q03.l
    public final void f(q03.p<? super R> pVar) {
        int length;
        q03.o<? extends T>[] oVarArr = this.f57108a;
        if (oVarArr == null) {
            oVarArr = new q03.o[8];
            length = 0;
            for (q03.o<? extends T> oVar : this.f57109b) {
                if (length == oVarArr.length) {
                    q03.o<? extends T>[] oVarArr2 = new q03.o[(length >> 2) + length];
                    System.arraycopy(oVarArr, 0, oVarArr2, 0, length);
                    oVarArr = oVarArr2;
                }
                oVarArr[length] = oVar;
                length++;
            }
        } else {
            length = oVarArr.length;
        }
        int i14 = length;
        if (i14 == 0) {
            pVar.a(v03.d.INSTANCE);
            pVar.onComplete();
            return;
        }
        C1223b c1223b = new C1223b(pVar, this.f57110c, i14, this.f57111d, this.f57112e);
        a<T, R>[] aVarArr = c1223b.f57117c;
        int length2 = aVarArr.length;
        c1223b.f57115a.a(c1223b);
        for (int i15 = 0; i15 < length2 && !c1223b.f57122h && !c1223b.f57121g; i15++) {
            oVarArr[i15].b(aVarArr[i15]);
        }
    }
}
