package z03;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.a f200761b;

    public static final class a extends AtomicInteger implements q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.a f200763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s03.b f200764c;

        public a(q03.d dVar, u03.a aVar) {
            this.f200762a = dVar;
            this.f200763b = aVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            if (v03.c.g(this.f200764c, bVar)) {
                this.f200764c = bVar;
                this.f200762a.a(this);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f200764c.b();
        }

        public final void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f200763b.run();
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    k13.a.b(th3);
                }
            }
        }

        @Override // s03.b
        public final void dispose() {
            this.f200764c.dispose();
            c();
        }

        @Override // q03.d
        public final void onComplete() {
            this.f200762a.onComplete();
            c();
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            this.f200762a.onError(th3);
            c();
        }
    }

    public e(q03.f fVar, u03.a aVar) {
        this.f200760a = fVar;
        this.f200761b = aVar;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        this.f200760a.a(new a(dVar, this.f200761b));
    }
}
