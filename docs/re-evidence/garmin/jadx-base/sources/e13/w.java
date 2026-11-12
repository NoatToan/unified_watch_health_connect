package e13;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class w<T, R> extends q03.r<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<? extends T>[] f62385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super Object[], ? extends R> f62386b;

    public final class a implements u03.f<T, R> {
        public a() {
        }

        @Override // u03.f
        /* JADX INFO: renamed from: apply */
        public final R mo330apply(T t7) {
            R rMo330apply = w.this.f62386b.mo330apply(new Object[]{t7});
            w03.b.a(rMo330apply, "The zipper returned a null value");
            return rMo330apply;
        }
    }

    public static final class b<T, R> extends AtomicInteger implements s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super R> f62388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super Object[], ? extends R> f62389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>[] f62390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object[] f62391d;

        public b(q03.t<? super R> tVar, int i14, u03.f<? super Object[], ? extends R> fVar) {
            super(i14);
            this.f62388a = tVar;
            this.f62389b = fVar;
            c<T>[] cVarArr = new c[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                cVarArr[i15] = new c<>(this, i15);
            }
            this.f62390c = cVarArr;
            this.f62391d = new Object[i14];
        }

        public final void a(int i14, Throwable th3) {
            if (getAndSet(0) <= 0) {
                k13.a.b(th3);
                return;
            }
            c<T>[] cVarArr = this.f62390c;
            int length = cVarArr.length;
            for (int i15 = 0; i15 < i14; i15++) {
                c<T> cVar = cVarArr[i15];
                cVar.getClass();
                v03.c.a(cVar);
            }
            while (true) {
                i14++;
                if (i14 >= length) {
                    this.f62388a.onError(th3);
                    return;
                } else {
                    c<T> cVar2 = cVarArr[i14];
                    cVar2.getClass();
                    v03.c.a(cVar2);
                }
            }
        }

        @Override // s03.b
        public final boolean b() {
            return get() <= 0;
        }

        @Override // s03.b
        public final void dispose() {
            if (getAndSet(0) > 0) {
                for (c<T> cVar : this.f62390c) {
                    cVar.getClass();
                    v03.c.a(cVar);
                }
            }
        }
    }

    public static final class c<T> extends AtomicReference<s03.b> implements q03.t<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T, ?> f62392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62393b;

        public c(b<T, ?> bVar, int i14) {
            this.f62392a = bVar;
            this.f62393b = i14;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            v03.c.f(this, bVar);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62392a.a(this.f62393b, th3);
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            b<T, ?> bVar = this.f62392a;
            q03.t<? super Object> tVar = bVar.f62388a;
            Object[] objArr = bVar.f62391d;
            objArr[this.f62393b] = t7;
            if (bVar.decrementAndGet() == 0) {
                try {
                    Object objMo330apply = bVar.f62389b.mo330apply(objArr);
                    w03.b.a(objMo330apply, "The zipper returned a null value");
                    tVar.onSuccess(objMo330apply);
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    tVar.onError(th3);
                }
            }
        }
    }

    public w(q03.v<? extends T>[] vVarArr, u03.f<? super Object[], ? extends R> fVar) {
        this.f62385a = vVarArr;
        this.f62386b = fVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super R> tVar) {
        q03.v<? extends T>[] vVarArr = this.f62385a;
        int length = vVarArr.length;
        if (length == 1) {
            vVarArr[0].a(new o.a(tVar, new a()));
            return;
        }
        b bVar = new b(tVar, length, this.f62386b);
        tVar.a(bVar);
        for (int i14 = 0; i14 < length && !bVar.b(); i14++) {
            q03.v<? extends T> vVar = vVarArr[i14];
            if (vVar == null) {
                bVar.a(i14, new NullPointerException("One of the sources is null"));
                return;
            }
            vVar.a(bVar.f62390c[i14]);
        }
    }
}
