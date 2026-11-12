package d13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class v<T> extends d13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.q f57242b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.p<T>, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.p<? super T> f57243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<s03.b> f57244b = new AtomicReference<>();

        public a(q03.p<? super T> pVar) {
            this.f57243a = pVar;
        }

        @Override // q03.p
        public final void a(s03.b bVar) {
            v03.c.f(this.f57244b, bVar);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // q03.p
        public final void c(T t7) {
            this.f57243a.c(t7);
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this.f57244b);
            v03.c.a(this);
        }

        @Override // q03.p
        public final void onComplete() {
            this.f57243a.onComplete();
        }

        @Override // q03.p
        public final void onError(Throwable th3) {
            this.f57243a.onError(th3);
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<T> f57245a;

        public b(a<T> aVar) {
            this.f57245a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            v.this.f57107a.b(this.f57245a);
        }
    }

    public v(q03.o<T> oVar, q03.q qVar) {
        super(oVar);
        this.f57242b = qVar;
    }

    @Override // q03.l
    public final void f(q03.p<? super T> pVar) {
        a aVar = new a(pVar);
        pVar.a(aVar);
        v03.c.f(aVar, this.f57242b.b(new b(aVar)));
    }
}
