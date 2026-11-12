package j83;

import j20.x;
import java.util.concurrent.Callable;
import o83.q;
import v83.s;
import v83.v;
import v83.y;

/* JADX INFO: loaded from: classes11.dex */
public class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f97754a;

    public class a implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f97755a;

        public a(h hVar) {
            this.f97755a = hVar;
        }

        @Override // n83.b
        public final void call(Object obj) {
            m mVar = (m) obj;
            h.a aVarCreateWorker = this.f97755a.createWorker();
            mVar.a(aVarCreateWorker);
            aVarCreateWorker.a(new k(this, mVar, aVarCreateWorker));
        }
    }

    public interface b<T> extends n83.b<m<? super T>> {
    }

    @Deprecated
    public l(e.a<T> aVar) {
        b<T> oVar = new o83.o<>(aVar);
        v83.h hVar = s.f176258c;
        this.f97754a = hVar != null ? (b) hVar.call(oVar) : oVar;
    }

    public static <T> l<T> a(Callable<? extends T> callable) {
        return new l<>(new o83.n(callable));
    }

    public final l b(l83.b bVar) {
        if (this instanceof s83.j) {
            return ((s83.j) this).e(bVar);
        }
        if (bVar != null) {
            return new l(new q(this.f97754a, bVar));
        }
        x.l("scheduler is null");
        return null;
    }

    public final o c(m<? super T> mVar) {
        v83.x xVarF;
        try {
            b<T> oVar = this.f97754a;
            if (s.f176261f != null && (xVarF = v.f176271f.f()) != y.f176279a) {
                o83.s sVar = new o83.s(oVar);
                xVarF.getClass();
                oVar = new o83.o(sVar);
            }
            oVar.call(mVar);
            v83.n nVar = s.f176265j;
            return nVar != null ? (o) nVar.call(mVar) : mVar;
        } catch (Throwable th3) {
            m83.a.b(th3);
            try {
                v83.c cVar = s.f176267l;
                mVar.b(cVar != null ? (Throwable) cVar.call(th3) : th3);
                y83.d.a aVar = y83.d.f195249a;
                return new y83.a();
            } catch (Throwable th4) {
                m83.a.b(th4);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th3.getMessage() + "] and then again while trying to pass to onError.", th4);
                v83.c cVar2 = s.f176267l;
                if (cVar2 == null) {
                    throw runtimeException;
                }
                cVar2.call(runtimeException);
                throw runtimeException;
            }
        }
    }

    public final l<T> d(h hVar) {
        return this instanceof s83.j ? ((s83.j) this).e(hVar) : new l<>(new a(hVar));
    }

    public l(b<T> bVar) {
        v83.h hVar = s.f176258c;
        this.f97754a = hVar != null ? (b) hVar.call(bVar) : bVar;
    }
}
