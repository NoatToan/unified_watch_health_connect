package q03;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements f {
    public static z03.g g(Throwable th3) {
        w03.b.a(th3, "error is null");
        return new z03.g(th3);
    }

    @Override // q03.f
    public final void a(d dVar) {
        int i14 = w03.b.f181178a;
        try {
            j(dVar);
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th3) {
            t03.a.a(th3);
            k13.a.b(th3);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final e13.c c(r rVar) {
        w03.b.a(rVar, "next is null");
        return new e13.c(rVar, this);
    }

    public final z03.a d(b bVar) {
        w03.b.a(bVar, "next is null");
        return new z03.a(this, bVar);
    }

    public final void e() {
        y03.c cVar = new y03.c();
        a(cVar);
        cVar.b();
    }

    public final z03.n f(u03.d dVar, u03.d dVar2, u03.a aVar, u03.a aVar2, u03.a aVar3, u03.a aVar4) {
        w03.b.a(dVar, "onSubscribe is null");
        w03.b.a(dVar2, "onError is null");
        w03.b.a(aVar, "onComplete is null");
        w03.b.a(aVar2, "onTerminate is null");
        w03.b.a(aVar3, "onAfterTerminate is null");
        w03.b.a(aVar4, "onDispose is null");
        return new z03.n(this, dVar, dVar2, aVar, aVar2, aVar3, aVar4);
    }

    public final z03.m h(q qVar) {
        w03.b.a(qVar, "scheduler is null");
        return new z03.m(this, qVar);
    }

    public final y03.d i(u03.d dVar, u03.a aVar) {
        int i14 = w03.b.f181178a;
        y03.d dVar2 = new y03.d(dVar, aVar);
        a(dVar2);
        return dVar2;
    }

    public abstract void j(d dVar);

    public final z03.p k(q qVar) {
        w03.b.a(qVar, "scheduler is null");
        return new z03.p(this, qVar);
    }
}
