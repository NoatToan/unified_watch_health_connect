package j83;

import rx.exceptions.OnErrorFailedException;
import v83.s;
import v83.v;

/* JADX INFO: loaded from: classes11.dex */
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f97747a;

    public interface a<T> extends n83.b<n<? super T>> {
    }

    public interface b<R, T> extends n83.d<n<? super R>, n<? super T>> {
    }

    public e(a<T> aVar) {
        this.f97747a = aVar;
    }

    public static <T> e<T> e(a<T> aVar) {
        v83.g gVar = s.f176257b;
        if (gVar != null) {
            aVar = (a) gVar.call(aVar);
        }
        return new e<>(aVar);
    }

    public final e b(l83.b bVar) {
        int i14 = s83.c.f157956b;
        if (!(this instanceof s83.i)) {
            return e(new o83.h(this.f97747a, new o83.l(bVar, false, i14)));
        }
        s83.i iVar = (s83.i) this;
        return e(new s83.i.b(iVar.f157967b, new s83.g(iVar, bVar)));
    }

    public final void d(n nVar) {
        if (this.f97747a == null) {
            vb.h.z("onSubscribe function can not be null.");
            return;
        }
        nVar.g();
        if (!(nVar instanceof u83.a)) {
            nVar = new u83.a(nVar);
        }
        try {
            a<T> aVar = this.f97747a;
            if (s.f176260e != null) {
                v.f176271f.c().getClass();
            }
            aVar.call(nVar);
            v83.l lVar = s.f176264i;
            if (lVar != null) {
                lVar.call(nVar);
            }
        } catch (Throwable th3) {
            m83.a.b(th3);
            if (nVar.f97758a.f157986b) {
                s.a(s.b(th3));
            } else {
                try {
                    ((u83.a) nVar).onError(s.b(th3));
                } catch (Throwable th4) {
                    m83.a.b(th4);
                    OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th3.getMessage() + "] and then again while trying to pass to onError.", th4);
                    s.b(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            y83.d.a aVar2 = y83.d.f195249a;
        }
    }

    public final void f(n nVar) {
        try {
            nVar.g();
            a<T> aVar = this.f97747a;
            if (s.f176260e != null) {
                v.f176271f.c().getClass();
            }
            aVar.call(nVar);
            v83.l lVar = s.f176264i;
            if (lVar != null) {
                lVar.call(nVar);
            }
        } catch (Throwable th3) {
            m83.a.b(th3);
            try {
                nVar.onError(s.b(th3));
                y83.d.a aVar2 = y83.d.f195249a;
            } catch (Throwable th4) {
                m83.a.b(th4);
                OnErrorFailedException onErrorFailedException = new OnErrorFailedException("Error occurred attempting to subscribe [" + th3.getMessage() + "] and then again while trying to pass to onError.", th4);
                s.b(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }
}
