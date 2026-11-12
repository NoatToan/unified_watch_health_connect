package c13;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q03.l;
import q03.o;
import q03.p;
import q03.t;
import q03.v;
import s03.b;
import u03.f;
import v03.c;
import v03.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a<T, R> extends l<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T> f22564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<? super T, ? extends v<? extends R>> f22565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f22566c;

    /* JADX INFO: renamed from: c13.a$a, reason: collision with other inner class name */
    public static final class C0340a<T, R> extends AtomicInteger implements p<T>, b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final C0341a<Object> f22567i = new C0341a<>(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<? super R> f22568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f<? super T, ? extends v<? extends R>> f22569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i13.b f22571d = new i13.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<C0341a<R>> f22572e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f22573f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f22574g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f22575h;

        /* JADX INFO: renamed from: c13.a$a$a, reason: collision with other inner class name */
        public static final class C0341a<R> extends AtomicReference<b> implements t<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C0340a<?, R> f22576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public volatile R f22577b;

            public C0341a(C0340a<?, R> c0340a) {
                this.f22576a = c0340a;
            }

            @Override // q03.t
            public final void a(b bVar) {
                c.f(this, bVar);
            }

            @Override // q03.t
            public final void onError(Throwable th3) {
                C0340a<?, R> c0340a = this.f22576a;
                AtomicReference<C0341a<R>> atomicReference = c0340a.f22572e;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        k13.a.b(th3);
                    }
                }
                if (c0340a.f22571d.a(th3)) {
                    if (!c0340a.f22570c) {
                        c0340a.f22573f.dispose();
                        c0340a.d();
                    }
                    c0340a.e();
                    return;
                }
                k13.a.b(th3);
            }

            @Override // q03.t
            public final void onSuccess(R r14) {
                this.f22577b = r14;
                this.f22576a.e();
            }
        }

        public C0340a(p<? super R> pVar, f<? super T, ? extends v<? extends R>> fVar, boolean z14) {
            this.f22568a = pVar;
            this.f22569b = fVar;
            this.f22570c = z14;
        }

        @Override // q03.p
        public final void a(b bVar) {
            if (c.g(this.f22573f, bVar)) {
                this.f22573f = bVar;
                this.f22568a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f22575h;
        }

        @Override // q03.p
        public final void c(T t7) {
            C0341a<Object> c0341a = f22567i;
            AtomicReference<C0341a<R>> atomicReference = this.f22572e;
            C0341a<R> c0341a2 = atomicReference.get();
            if (c0341a2 != null) {
                c.a(c0341a2);
            }
            try {
                v<? extends R> vVarMo330apply = this.f22569b.mo330apply(t7);
                w03.b.a(vVarMo330apply, "The mapper returned a null SingleSource");
                v<? extends R> vVar = vVarMo330apply;
                C0341a<R> c0341a3 = new C0341a<>(this);
                while (true) {
                    C0341a<R> c0341a4 = atomicReference.get();
                    if (c0341a4 == c0341a) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(c0341a4, c0341a3)) {
                            vVar.a(c0341a3);
                            return;
                        }
                    } while (atomicReference.get() == c0341a4);
                }
            } catch (Throwable th3) {
                t03.a.a(th3);
                this.f22573f.dispose();
                atomicReference.getAndSet((C0341a<R>) c0341a);
                onError(th3);
            }
        }

        public final void d() {
            AtomicReference<C0341a<R>> atomicReference = this.f22572e;
            C0341a<Object> c0341a = f22567i;
            C0341a<R> andSet = atomicReference.getAndSet((C0341a<R>) c0341a);
            if (andSet == null || andSet == c0341a) {
                return;
            }
            c.a(andSet);
        }

        @Override // s03.b
        public final void dispose() {
            this.f22575h = true;
            this.f22573f.dispose();
            d();
        }

        public final void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            p<? super R> pVar = this.f22568a;
            i13.b bVar = this.f22571d;
            AtomicReference<C0341a<R>> atomicReference = this.f22572e;
            int iAddAndGet = 1;
            while (!this.f22575h) {
                if (bVar.get() != null && !this.f22570c) {
                    pVar.onError(bVar.b());
                    return;
                }
                boolean z14 = this.f22574g;
                C0341a<R> c0341a = atomicReference.get();
                boolean z15 = c0341a == null;
                if (z14 && z15) {
                    Throwable thB = bVar.b();
                    if (thB != null) {
                        pVar.onError(thB);
                        return;
                    } else {
                        pVar.onComplete();
                        return;
                    }
                }
                if (z15 || c0341a.f22577b == null) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(c0341a, null) && atomicReference.get() == c0341a) {
                    }
                    pVar.c(c0341a.f22577b);
                }
            }
        }

        @Override // q03.p
        public final void onComplete() {
            this.f22574g = true;
            e();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            if (!this.f22571d.a(th3)) {
                k13.a.b(th3);
                return;
            }
            if (!this.f22570c) {
                d();
            }
            this.f22574g = true;
            e();
        }
    }

    public a(l<T> lVar, f<? super T, ? extends v<? extends R>> fVar, boolean z14) {
        this.f22564a = lVar;
        this.f22565b = fVar;
        this.f22566c = z14;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // q03.l
    public final void f(p<? super R> pVar) {
        v<? extends R> vVar;
        o oVar = this.f22564a;
        boolean z14 = oVar instanceof Callable;
        f<? super T, ? extends v<? extends R>> fVar = this.f22565b;
        if (!z14) {
            oVar.b(new C0340a(pVar, fVar, this.f22566c));
            return;
        }
        try {
            a0.f fVar2 = (Object) ((Callable) oVar).call();
            if (fVar2 != null) {
                v<? extends R> vVarMo330apply = fVar.mo330apply(fVar2);
                w03.b.a(vVarMo330apply, "The mapper returned a null SingleSource");
                vVar = vVarMo330apply;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                vVar.a(new e13.v.a(pVar));
            } else {
                pVar.a(d.INSTANCE);
                pVar.onComplete();
            }
        } catch (Throwable th3) {
            t03.a.a(th3);
            pVar.a(d.INSTANCE);
            pVar.onError(th3);
        }
    }
}
