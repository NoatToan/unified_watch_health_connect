package u53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f168719a = new x("CLOSED");

    public static final <S extends u<S>> Object a(S s8, long j8, e23.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s8.f168771c >= j8 && !s8.d()) {
                return s8;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f168721a;
            Object obj = atomicReferenceFieldUpdater.get(s8);
            x xVar = f168719a;
            if (obj == xVar) {
                return xVar;
            }
            S sInvoke = (S) ((c) obj);
            if (sInvoke == null) {
                sInvoke = pVar.invoke(Long.valueOf(s8.f168771c + 1), s8);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(s8, null, sInvoke)) {
                        if (s8.d()) {
                            s8.e();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(s8) == null);
            }
            s8 = (Object) sInvoke;
        }
    }
}
