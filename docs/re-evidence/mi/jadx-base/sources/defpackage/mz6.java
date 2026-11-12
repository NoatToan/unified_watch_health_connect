package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mz6<T> implements z5h<T>, jz6 {
    final AtomicReference<jz6> upstream = new AtomicReference<>();

    @Override // defpackage.jz6
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
    }

    @Override // defpackage.jz6
    public final boolean isDisposed() {
        return this.upstream.get() == DisposableHelper.DISPOSED;
    }

    public void onStart() {
    }

    @Override // defpackage.z5h
    public final void onSubscribe(jz6 jz6Var) {
        if (ha8.c(this.upstream, jz6Var, getClass())) {
            onStart();
        }
    }
}
