package d13;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class q<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super q03.l<Throwable>, ? extends q03.o<?>> f57216b;

    public static final class a<T> extends AtomicInteger implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57217a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final m13.c<Throwable> f57220d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final q03.o<T> f57223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f57224h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f57218b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i13.b f57219c = new i13.b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a<T>.C1224a f57221e = new C1224a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference<s03.b> f57222f = new AtomicReference<>();

        /* JADX INFO: renamed from: d13.q$a$a, reason: collision with other inner class name */
        public final class C1224a extends AtomicReference<s03.b> implements q03.p<Object> {
            public C1224a() {
            }

            @Override // q03.p
            public final void a(s03.b bVar) {
                v03.c.f(this, bVar);
            }

            @Override // q03.p
            public final void c(Object obj) {
                a.this.d();
            }

            @Override // q03.p
            public final void onComplete() {
                a aVar = a.this;
                v03.c.a(aVar.f57222f);
                i13.e.a(aVar.f57217a, aVar, aVar.f57219c);
            }

            @Override // q03.p
            public final void onError(Throwable th3) {
                a aVar = a.this;
                v03.c.a(aVar.f57222f);
                q03.p<? super T> pVar = aVar.f57217a;
                i13.b bVar = aVar.f57219c;
                if (!bVar.a(th3)) {
                    k13.a.b(th3);
                } else if (aVar.getAndIncrement() == 0) {
                    pVar.onError(bVar.b());
                }
            }
        }

        public a(q03.p<? super T> pVar, m13.c<Throwable> cVar, q03.o<T> oVar) {
            this.f57217a = pVar;
            this.f57220d = cVar;
            this.f57223g = oVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            v03.c.d(this.f57222f, bVar);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(this.f57222f.get());
        }

        @Override // q03.p
        public final void c(T t7) {
            if (get() == 0 && compareAndSet(0, 1)) {
                q03.p<? super T> pVar = this.f57217a;
                pVar.c(t7);
                if (decrementAndGet() != 0) {
                    Throwable thB = this.f57219c.b();
                    if (thB != null) {
                        pVar.onError(thB);
                    } else {
                        pVar.onComplete();
                    }
                }
            }
        }

        public final void d() {
            if (this.f57218b.getAndIncrement() == 0) {
                while (!b()) {
                    if (!this.f57224h) {
                        this.f57224h = true;
                        this.f57223g.b(this);
                    }
                    if (this.f57218b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this.f57222f);
            v03.c.a(this.f57221e);
        }

        @Override // q03.p
        public final void onComplete() {
            v03.c.a(this.f57221e);
            i13.e.a(this.f57217a, this, this.f57219c);
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            v03.c.d(this.f57222f, null);
            this.f57224h = false;
            this.f57220d.c(th3);
        }
    }

    public q(q03.o<T> oVar, u03.f<? super q03.l<Throwable>, ? extends q03.o<?>> fVar) {
        super(oVar);
        this.f57216b = fVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        m13.b bVar = new m13.b(new m13.a());
        try {
            q03.o<?> oVarMo330apply = this.f57216b.mo330apply(bVar);
            w03.b.a(oVarMo330apply, "The handler returned a null ObservableSource");
            q03.o<?> oVar = oVarMo330apply;
            a aVar = new a(pVar, bVar, this.f57107a);
            pVar.a(aVar);
            oVar.b(aVar.f57221e);
            aVar.d();
        } catch (Throwable th3) {
            t03.a.a(th3);
            pVar.a(v03.d.INSTANCE);
            pVar.onError(th3);
        }
    }
}
