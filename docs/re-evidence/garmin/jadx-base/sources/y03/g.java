package y03;

import q03.p;

/* JADX INFO: loaded from: classes3.dex */
public final class g<T> implements p<T>, s03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<? super T> f193063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.d<? super s03.b> f193064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u03.a f193065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s03.b f193066d;

    public g(p<? super T> pVar, u03.d<? super s03.b> dVar, u03.a aVar) {
        this.f193063a = pVar;
        this.f193064b = dVar;
        this.f193065c = aVar;
    }

    @Override // q03.p
    public final void a(s03.b bVar) {
        p<? super T> pVar = this.f193063a;
        try {
            this.f193064b.accept(bVar);
            if (v03.c.g(this.f193066d, bVar)) {
                this.f193066d = bVar;
                pVar.a(this);
            }
        } catch (Throwable th3) {
            t03.a.a(th3);
            bVar.dispose();
            this.f193066d = v03.c.DISPOSED;
            v03.d.d(th3, pVar);
        }
    }

    @Override // s03.b
    public final boolean b() {
        return this.f193066d.b();
    }

    @Override // q03.p
    public final void c(T t7) {
        this.f193063a.c(t7);
    }

    @Override // s03.b
    public final void dispose() {
        s03.b bVar = this.f193066d;
        v03.c cVar = v03.c.DISPOSED;
        if (bVar != cVar) {
            this.f193066d = cVar;
            try {
                this.f193065c.run();
            } catch (Throwable th3) {
                t03.a.a(th3);
                k13.a.b(th3);
            }
            bVar.dispose();
        }
    }

    @Override // q03.p
    public final void onComplete() {
        s03.b bVar = this.f193066d;
        v03.c cVar = v03.c.DISPOSED;
        if (bVar != cVar) {
            this.f193066d = cVar;
            this.f193063a.onComplete();
        }
    }

    @Override // q03.p
    public final void onError(Throwable th3) {
        s03.b bVar = this.f193066d;
        v03.c cVar = v03.c.DISPOSED;
        if (bVar == cVar) {
            k13.a.b(th3);
        } else {
            this.f193066d = cVar;
            this.f193063a.onError(th3);
        }
    }
}
