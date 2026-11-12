package io.reactivex.internal.disposables;

import defpackage.jz6;
import defpackage.pi3;
import defpackage.qf8;
import defpackage.t5l;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class CancellableDisposable extends AtomicReference<pi3> implements jz6 {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(pi3 pi3Var) {
        super(pi3Var);
    }

    @Override // defpackage.jz6
    public void dispose() {
        pi3 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            qf8.b(e);
            t5l.p(e);
        }
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == null;
    }
}
