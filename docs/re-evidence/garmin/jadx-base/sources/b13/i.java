package b13;

import java.util.concurrent.atomic.AtomicReference;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class i<T> extends b13.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f14444b;

    public static final class a<T> extends AtomicReference<s03.b> implements q03.j<T>, s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.j<? super T> f14445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f14446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T f14447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Throwable f14448d;

        public a(q03.j<? super T> jVar, q qVar) {
            this.f14445a = jVar;
            this.f14446b = qVar;
        }

        @Override // q03.j
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f14445a.a(this);
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

        @Override // q03.j
        public final void onComplete() {
            v03.c.d(this, this.f14446b.b(this));
        }

        @Override // q03.j
        public final void onError(Throwable th3) {
            this.f14448d = th3;
            v03.c.d(this, this.f14446b.b(this));
        }

        @Override // q03.j
        public final void onSuccess(T t7) {
            this.f14447c = t7;
            v03.c.d(this, this.f14446b.b(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th3 = this.f14448d;
            q03.j<? super T> jVar = this.f14445a;
            if (th3 != null) {
                this.f14448d = null;
                jVar.onError(th3);
                return;
            }
            T t7 = this.f14447c;
            if (t7 == null) {
                jVar.onComplete();
            } else {
                this.f14447c = null;
                jVar.onSuccess(t7);
            }
        }
    }

    public i(q03.k<T> kVar, q qVar) {
        super(kVar);
        this.f14444b = qVar;
    }

    @Override // q03.i
    public final void c(q03.j<? super T> jVar) {
        this.f14422a.a(new a(jVar, this.f14444b));
    }
}
