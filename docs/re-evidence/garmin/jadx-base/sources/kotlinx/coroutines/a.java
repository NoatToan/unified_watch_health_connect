package kotlinx.coroutines;

import oc.b;
import t13.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final void a(Throwable th3, g gVar) {
        if (th3 instanceof DispatchException) {
            th3 = ((DispatchException) th3).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f105965e0);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.L(th3, gVar);
            } else {
                b.w(th3, gVar);
            }
        } catch (Throwable th4) {
            if (th3 != th4) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th4);
                o13.g.a(runtimeException, th3);
                th3 = runtimeException;
            }
            b.w(th3, gVar);
        }
    }
}
