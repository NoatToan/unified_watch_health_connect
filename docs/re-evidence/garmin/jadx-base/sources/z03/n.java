package z03;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super s03.b> f200782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.d<? super Throwable> f200783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u03.a f200784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u03.a f200785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u03.a f200786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u03.a f200787g;

    public final class a implements q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s03.b f200789b;

        public a(q03.d dVar) {
            this.f200788a = dVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            q03.d dVar = this.f200788a;
            try {
                n.this.f200782b.accept(bVar);
                if (v03.c.g(this.f200789b, bVar)) {
                    this.f200789b = bVar;
                    dVar.a(this);
                }
            } catch (Throwable th3) {
                t03.a.a(th3);
                bVar.dispose();
                this.f200789b = v03.c.DISPOSED;
                v03.d.c(th3, dVar);
            }
        }

        @Override // s03.b
        public final boolean b() {
            return this.f200789b.b();
        }

        @Override // s03.b
        public final void dispose() {
            try {
                n.this.f200787g.run();
            } catch (Throwable th3) {
                t03.a.a(th3);
                k13.a.b(th3);
            }
            this.f200789b.dispose();
        }

        @Override // q03.d
        public final void onComplete() {
            q03.d dVar = this.f200788a;
            n nVar = n.this;
            if (this.f200789b == v03.c.DISPOSED) {
                return;
            }
            try {
                nVar.f200784d.run();
                nVar.f200785e.run();
                dVar.onComplete();
                try {
                    nVar.f200786f.run();
                } catch (Throwable th3) {
                    t03.a.a(th3);
                    k13.a.b(th3);
                }
            } catch (Throwable th4) {
                t03.a.a(th4);
                dVar.onError(th4);
            }
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            n nVar = n.this;
            if (this.f200789b == v03.c.DISPOSED) {
                k13.a.b(th3);
                return;
            }
            try {
                nVar.f200783c.accept(th3);
                nVar.f200785e.run();
            } catch (Throwable th4) {
                t03.a.a(th4);
                th3 = new CompositeException(th3, th4);
            }
            this.f200788a.onError(th3);
            try {
                nVar.f200786f.run();
            } catch (Throwable th5) {
                t03.a.a(th5);
                k13.a.b(th5);
            }
        }
    }

    public n(q03.f fVar, u03.d<? super s03.b> dVar, u03.d<? super Throwable> dVar2, u03.a aVar, u03.a aVar2, u03.a aVar3, u03.a aVar4) {
        this.f200781a = fVar;
        this.f200782b = dVar;
        this.f200783c = dVar2;
        this.f200784d = aVar;
        this.f200785e = aVar2;
        this.f200786f = aVar3;
        this.f200787g = aVar4;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        this.f200781a.a(new a(dVar));
    }
}
