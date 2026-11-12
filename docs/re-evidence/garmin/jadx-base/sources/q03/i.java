package q03;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i<T> implements k<T> {
    @Override // q03.k
    public final void a(j<? super T> jVar) {
        w03.b.a(jVar, "observer is null");
        try {
            c(jVar);
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th3) {
            t03.a.a(th3);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final b13.b b(u03.d dVar, u03.d dVar2, u03.a aVar) {
        w03.b.a(aVar, "onComplete is null");
        b13.b bVar = new b13.b(dVar, dVar2, aVar);
        a(bVar);
        return bVar;
    }

    public abstract void c(j<? super T> jVar);
}
