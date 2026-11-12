package v03;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public enum c implements s03.b {
    DISPOSED;

    public static void a(AtomicReference atomicReference) {
        s03.b bVar;
        s03.b bVar2 = (s03.b) atomicReference.get();
        c cVar = DISPOSED;
        if (bVar2 == cVar || (bVar = (s03.b) atomicReference.getAndSet(cVar)) == cVar || bVar == null) {
            return;
        }
        bVar.dispose();
    }

    public static boolean c(s03.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean d(AtomicReference<s03.b> atomicReference, s03.b bVar) {
        while (true) {
            s03.b bVar2 = atomicReference.get();
            if (bVar2 != DISPOSED) {
                while (!atomicReference.compareAndSet(bVar2, bVar)) {
                    if (atomicReference.get() != bVar2) {
                    }
                }
                return true;
            }
            if (bVar == null) {
                return false;
            }
            bVar.dispose();
            return false;
        }
    }

    public static void e(AtomicReference atomicReference, s03.b bVar) {
        while (true) {
            s03.b bVar2 = (s03.b) atomicReference.get();
            if (bVar2 == DISPOSED) {
                bVar.dispose();
                return;
            }
            do {
                if (atomicReference.compareAndSet(bVar2, bVar)) {
                    if (bVar2 != null) {
                        bVar2.dispose();
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == bVar2);
        }
    }

    public static boolean f(AtomicReference<s03.b> atomicReference, s03.b bVar) {
        w03.b.a(bVar, "d is null");
        while (!atomicReference.compareAndSet(null, bVar)) {
            if (atomicReference.get() != null) {
                bVar.dispose();
                if (atomicReference.get() == DISPOSED) {
                    return false;
                }
                k13.a.b(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean g(s03.b bVar, s03.b bVar2) {
        if (bVar2 == null) {
            k13.a.b(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        k13.a.b(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    @Override // s03.b
    public final boolean b() {
        return true;
    }

    @Override // s03.b
    public final void dispose() {
    }
}
