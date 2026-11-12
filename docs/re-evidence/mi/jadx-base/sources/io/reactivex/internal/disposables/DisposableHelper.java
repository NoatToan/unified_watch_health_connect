package io.reactivex.internal.disposables;

import defpackage.d8i;
import defpackage.jz6;
import defpackage.t5l;
import defpackage.x3h;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public enum DisposableHelper implements jz6 {
    DISPOSED;

    public static boolean replace(AtomicReference<jz6> atomicReference, jz6 jz6Var) {
        jz6 jz6Var2;
        do {
            jz6Var2 = atomicReference.get();
            if (jz6Var2 == DISPOSED) {
                if (jz6Var == null) {
                    return false;
                }
                jz6Var.dispose();
                return false;
            }
        } while (!d8i.a(atomicReference, jz6Var2, jz6Var));
        return true;
    }

    public static void reportDisposableSet() {
        t5l.p(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<jz6> atomicReference, jz6 jz6Var) {
        jz6 jz6Var2;
        do {
            jz6Var2 = atomicReference.get();
            if (jz6Var2 == DISPOSED) {
                if (jz6Var == null) {
                    return false;
                }
                jz6Var.dispose();
                return false;
            }
        } while (!d8i.a(atomicReference, jz6Var2, jz6Var));
        if (jz6Var2 == null) {
            return true;
        }
        jz6Var2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<jz6> atomicReference, jz6 jz6Var) {
        x3h.d(jz6Var, "d is null");
        if (d8i.a(atomicReference, null, jz6Var)) {
            return true;
        }
        jz6Var.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<jz6> atomicReference, jz6 jz6Var) {
        if (d8i.a(atomicReference, null, jz6Var)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        jz6Var.dispose();
        return false;
    }

    public static boolean validate(jz6 jz6Var, jz6 jz6Var2) {
        if (jz6Var2 == null) {
            t5l.p(new NullPointerException("next is null"));
            return false;
        }
        if (jz6Var == null) {
            return true;
        }
        jz6Var2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // defpackage.jz6
    public void dispose() {
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return true;
    }

    public static boolean dispose(AtomicReference<jz6> atomicReference) {
        jz6 andSet;
        jz6 jz6Var = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (jz6Var == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(jz6 jz6Var) {
        return jz6Var == DISPOSED;
    }
}
