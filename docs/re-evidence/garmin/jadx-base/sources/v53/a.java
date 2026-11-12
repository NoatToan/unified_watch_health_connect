package v53;

import e23.p;
import kotlinx.coroutines.DispatchException;
import o13.q;
import o13.r;
import p005kotlin.Unit;
import t13.d;
import u13.f;
import u53.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final void a(p pVar, o53.a aVar, o53.a aVar2) {
        try {
            d dVarB = f.b(f.a(pVar, aVar, aVar2));
            int i14 = q.f128596b;
            g.a(Unit.INSTANCE, dVarB);
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            int i15 = q.f128596b;
            aVar2.resumeWith(r.a(th));
            throw th;
        }
    }
}
