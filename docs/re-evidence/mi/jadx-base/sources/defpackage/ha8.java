package defpackage;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ha8 {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        t5l.p(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<jz6> atomicReference, jz6 jz6Var, Class<?> cls) {
        x3h.d(jz6Var, "next is null");
        if (d8i.a(atomicReference, null, jz6Var)) {
            return true;
        }
        jz6Var.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
