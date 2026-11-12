package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;

/* JADX INFO: loaded from: classes22.dex */
final class d extends c<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public d(Runnable runnable) {
        super(runnable);
    }

    @Override // io.reactivex.disposables.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NonNull Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
