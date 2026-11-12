package h13;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public enum e implements b83.c {
    CANCELLED;

    public static void a(AtomicReference atomicReference) {
        b83.c cVar;
        b83.c cVar2 = (b83.c) atomicReference.get();
        e eVar = CANCELLED;
        if (cVar2 == eVar || (cVar = (b83.c) atomicReference.getAndSet(eVar)) == eVar || cVar == null) {
            return;
        }
        cVar.cancel();
    }

    public static boolean c(AtomicReference<b83.c> atomicReference, b83.c cVar) {
        w03.b.a(cVar, "s is null");
        while (!atomicReference.compareAndSet(null, cVar)) {
            if (atomicReference.get() != null) {
                cVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                k13.a.b(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(long j8) {
        if (j8 > 0) {
            return true;
        }
        k13.a.b(new IllegalArgumentException(org.apache.commons.lang3.e.e(j8, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(b83.c cVar, b83.c cVar2) {
        if (cVar2 == null) {
            k13.a.b(new NullPointerException("next is null"));
            return false;
        }
        if (cVar == null) {
            return true;
        }
        cVar2.cancel();
        k13.a.b(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    @Override // b83.c
    public final void b(long j8) {
    }

    @Override // b83.c
    public final void cancel() {
    }
}
