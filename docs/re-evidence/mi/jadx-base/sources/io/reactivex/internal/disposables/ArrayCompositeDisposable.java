package io.reactivex.internal.disposables;

import defpackage.jz6;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<jz6> implements jz6 {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    @Override // defpackage.jz6
    public void dispose() {
        jz6 andSet;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                jz6 jz6Var = get(i);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (jz6Var != disposableHelper && (andSet = getAndSet(i, disposableHelper)) != disposableHelper && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public jz6 replaceResource(int i, jz6 jz6Var) {
        jz6 jz6Var2;
        do {
            jz6Var2 = get(i);
            if (jz6Var2 == DisposableHelper.DISPOSED) {
                jz6Var.dispose();
                return null;
            }
        } while (!compareAndSet(i, jz6Var2, jz6Var));
        return jz6Var2;
    }

    public boolean setResource(int i, jz6 jz6Var) {
        jz6 jz6Var2;
        do {
            jz6Var2 = get(i);
            if (jz6Var2 == DisposableHelper.DISPOSED) {
                jz6Var.dispose();
                return false;
            }
        } while (!compareAndSet(i, jz6Var2, jz6Var));
        if (jz6Var2 == null) {
            return true;
        }
        jz6Var2.dispose();
        return true;
    }
}
