package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class drk<T> implements z5h<T>, jz6 {
    private final AtomicReference<jz6> upstream = new AtomicReference<>();
    private final uge resources = new uge();

    public final void add(jz6 jz6Var) {
        x3h.d(jz6Var, "resource is null");
        this.resources.a(jz6Var);
    }

    @Override // defpackage.jz6
    public final void dispose() {
        if (DisposableHelper.dispose(this.upstream)) {
            this.resources.dispose();
        }
    }

    @Override // defpackage.jz6
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
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
