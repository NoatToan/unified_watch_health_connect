package q03;

import com.google.common.util.concurrent.ListenableFuture;
import e13.w;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r<T> implements v<T> {
    public static e13.i d(Throwable th3) {
        w03.b.a(th3, "exception is null");
        w03.a.f fVar = w03.a.f181170a;
        return new e13.i(new w03.a.k(th3));
    }

    public static a13.k e(ListenableFuture listenableFuture) {
        int i14 = g.f142048a;
        w03.b.a(listenableFuture, "future is null");
        return new a13.k(new a13.c(listenableFuture, 0L, null), null);
    }

    public static e13.n f(Object obj) {
        w03.b.a(obj, "item is null");
        return new e13.n(obj);
    }

    public static e13.u k(long j8) {
        q qVar = l13.a.f108326a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w03.b.a(timeUnit, "unit is null");
        w03.b.a(qVar, "scheduler is null");
        return new e13.u(j8, timeUnit, qVar);
    }

    public static w l(r rVar, r rVar2, u03.b bVar) {
        int i14 = w03.b.f181178a;
        w03.a.f fVar = w03.a.f181170a;
        return new w(new v[]{rVar, rVar2}, new w03.a.C3375a(bVar));
    }

    @Override // q03.v
    public final void a(t<? super T> tVar) {
        w03.b.a(tVar, "observer is null");
        try {
            i(tVar);
        } catch (NullPointerException e4) {
            throw e4;
        } catch (Throwable th3) {
            t03.a.a(th3);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    public final T c() {
        y03.c cVar = new y03.c();
        a(cVar);
        return (T) cVar.b();
    }

    public final e13.p g(q qVar) {
        w03.b.a(qVar, "scheduler is null");
        return new e13.p(this, qVar);
    }

    public final y03.e h(u03.d dVar, u03.d dVar2) {
        w03.b.a(dVar, "onSuccess is null");
        w03.b.a(dVar2, "onError is null");
        y03.e eVar = new y03.e(dVar, dVar2);
        a(eVar);
        return eVar;
    }

    public abstract void i(t<? super T> tVar);

    public final e13.s j(q qVar) {
        w03.b.a(qVar, "scheduler is null");
        return new e13.s(this, qVar);
    }
}
