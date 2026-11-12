package e13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class t<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f62369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q03.q f62370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q03.v<? extends T> f62371e;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.t<T>, Runnable, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<s03.b> f62373b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1314a<T> f62374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public q03.v<? extends T> f62375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f62376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TimeUnit f62377f;

        /* JADX INFO: renamed from: e13.t$a$a, reason: collision with other inner class name */
        public static final class C1314a<T> extends AtomicReference<s03.b> implements q03.t<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final q03.t<? super T> f62378a;

            public C1314a(q03.t<? super T> tVar) {
                this.f62378a = tVar;
            }

            @Override // q03.t
            public final void a(s03.b bVar) {
                v03.c.f(this, bVar);
            }

            @Override // q03.t
            public final void onError(Throwable th3) {
                this.f62378a.onError(th3);
            }

            @Override // q03.t
            public final void onSuccess(T t7) {
                this.f62378a.onSuccess(t7);
            }
        }

        public a(q03.t<? super T> tVar, q03.v<? extends T> vVar, long j8, TimeUnit timeUnit) {
            this.f62372a = tVar;
            this.f62375d = vVar;
            this.f62376e = j8;
            this.f62377f = timeUnit;
            if (vVar != null) {
                this.f62374c = new C1314a<>(tVar);
            } else {
                this.f62374c = null;
            }
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            v03.c.f(this, bVar);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
            v03.c.a(this.f62373b);
            C1314a<T> c1314a = this.f62374c;
            if (c1314a != null) {
                v03.c.a(c1314a);
            }
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || !compareAndSet(bVar, cVar)) {
                k13.a.b(th3);
            } else {
                v03.c.a(this.f62373b);
                this.f62372a.onError(th3);
            }
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || !compareAndSet(bVar, cVar)) {
                return;
            }
            v03.c.a(this.f62373b);
            this.f62372a.onSuccess(t7);
        }

        @Override // java.lang.Runnable
        public final void run() {
            s03.b bVar = get();
            v03.c cVar = v03.c.DISPOSED;
            if (bVar == cVar || !compareAndSet(bVar, cVar)) {
                return;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            q03.v<? extends T> vVar = this.f62375d;
            if (vVar == null) {
                this.f62372a.onError(new TimeoutException(i13.d.a(this.f62376e, this.f62377f)));
            } else {
                this.f62375d = null;
                vVar.a(this.f62374c);
            }
        }
    }

    public t(q03.v<T> vVar, long j8, TimeUnit timeUnit, q03.q qVar, q03.v<? extends T> vVar2) {
        this.f62367a = vVar;
        this.f62368b = j8;
        this.f62369c = timeUnit;
        this.f62370d = qVar;
        this.f62371e = vVar2;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        a aVar = new a(tVar, this.f62371e, this.f62368b, this.f62369c);
        tVar.a(aVar);
        v03.c.d(aVar.f62373b, this.f62370d.c(aVar, this.f62368b, this.f62369c));
        this.f62367a.a(aVar);
    }
}
