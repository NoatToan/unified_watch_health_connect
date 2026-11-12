package z03;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q03.q f200777b;

    public static final class a extends AtomicReference<s03.b> implements q03.d, s03.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q03.q f200779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Throwable f200780c;

        public a(q03.d dVar, q03.q qVar) {
            this.f200778a = dVar;
            this.f200779b = qVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            if (v03.c.f(this, bVar)) {
                this.f200778a.a(this);
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

        @Override // q03.d
        public final void onComplete() {
            v03.c.d(this, this.f200779b.b(this));
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200780c = th3;
            v03.c.d(this, this.f200779b.b(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th3 = this.f200780c;
            q03.d dVar = this.f200778a;
            if (th3 == null) {
                dVar.onComplete();
            } else {
                this.f200780c = null;
                dVar.onError(th3);
            }
        }
    }

    public m(q03.f fVar, q03.q qVar) {
        this.f200776a = fVar;
        this.f200777b = qVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        this.f200776a.a(new a(dVar, this.f200777b));
    }
}
