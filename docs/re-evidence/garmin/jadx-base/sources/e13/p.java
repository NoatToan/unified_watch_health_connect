package e13;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class p<T> extends q03.r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.v<T> f62347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.q f62348b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.t<T>, s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.t<? super T> f62349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.q f62350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f62351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f62352d;

        public a(q03.t<? super T> tVar, q03.q qVar) {
            this.f62349a = tVar;
            this.f62350b = qVar;
        }

        @Override // q03.t
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f62349a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.t
        public final void onError(Throwable th3) {
            this.f62352d = th3;
            v03.c.d(this, this.f62350b.b(this));
        }

        @Override // q03.t
        public final void onSuccess(T t7) {
            this.f62351c = t7;
            v03.c.d(this, this.f62350b.b(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th3 = this.f62352d;
            q03.t<? super T> tVar = this.f62349a;
            if (th3 != null) {
                tVar.onError(th3);
            } else {
                tVar.onSuccess(this.f62351c);
            }
        }
    }

    public p(q03.v<T> vVar, q03.q qVar) {
        this.f62347a = vVar;
        this.f62348b = qVar;
    }

    @Override // q03.r
    public final void i(q03.t<? super T> tVar) {
        this.f62347a.a(new a(tVar, this.f62348b));
    }
}
