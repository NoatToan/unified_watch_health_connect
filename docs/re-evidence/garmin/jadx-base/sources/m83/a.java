package m83;

import j83.f;
import java.util.ArrayList;
import o2.c;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != 1) {
            throw new CompositeException(arrayList);
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof RuntimeException) {
            throw ((RuntimeException) th3);
        }
        if (th3 instanceof Error) {
            throw ((Error) th3);
        }
        c.p(th3);
    }

    public static void b(Throwable th3) {
        if (th3 instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th3);
        }
        if (th3 instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th3);
        }
        if (th3 instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th3);
        }
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }

    public static void c(Throwable th3, f<?> fVar) {
        b(th3);
        fVar.onError(th3);
    }
}
