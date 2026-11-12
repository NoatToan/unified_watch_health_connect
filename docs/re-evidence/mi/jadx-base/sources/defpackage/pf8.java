package defpackage;

import java.util.HashSet;
import java.util.List;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.OnErrorThrowable;

/* JADX INFO: loaded from: classes3.dex */
public final class pf8 {
    public static void a(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (hashSet.contains(th.getCause())) {
                    break;
                }
                hashSet.add(th.getCause());
                i = i2;
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    public static Throwable b(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    public static void c(List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new CompositeException(list);
        }
        Throwable th = list.get(0);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new RuntimeException(th);
        }
        throw ((Error) th);
    }

    public static void d(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        }
        if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        }
        if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void e(Throwable th, a6h<?> a6hVar) {
        d(th);
        a6hVar.onError(th);
    }

    public static void f(Throwable th, a6h<?> a6hVar, Object obj) {
        d(th);
        a6hVar.onError(OnErrorThrowable.addValueAsLastCause(th, obj));
    }
}
