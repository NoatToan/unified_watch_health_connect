package io.reactivex.internal.disposables;

import defpackage.jz6;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class SequentialDisposable extends AtomicReference<jz6> implements jz6 {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    public boolean replace(jz6 jz6Var) {
        return DisposableHelper.replace(this, jz6Var);
    }

    public boolean update(jz6 jz6Var) {
        return DisposableHelper.set(this, jz6Var);
    }

    public SequentialDisposable(jz6 jz6Var) {
        lazySet(jz6Var);
    }
}
