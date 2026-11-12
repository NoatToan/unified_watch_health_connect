package ok;

import ak.g;
import android.os.RemoteException;
import bk.k;
import bk.l;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f132413a;

    public b(d dVar) {
        this.f132413a = dVar;
    }

    public final void a(l lVar, dk.a aVar) {
        e eVar;
        int i14 = d.a.f132430a[lVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3) {
            k kVar = (k) bk.b.f(aVar);
            kVar.getClass();
            if (g.a(kVar)) {
                new g(kVar).f3531b.getClass();
                Hashtable<Long, qk.a.C2735a[]> hashtable = qk.a.f145057a;
            }
        }
        synchronized (this.f132413a.f132426k) {
            try {
                d.c cVar = this.f132413a.f132424i;
                eVar = cVar != null ? cVar.f132431a : null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (eVar != null) {
            try {
                eVar.q(lVar, aVar);
            } catch (RemoteException unused) {
                d dVar = this.f132413a;
                eVar.g();
                d.a(dVar);
            }
        }
    }
}
