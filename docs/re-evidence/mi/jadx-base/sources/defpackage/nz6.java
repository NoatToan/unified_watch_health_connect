package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class nz6 {
    public static jz6 a() {
        return EmptyDisposable.INSTANCE;
    }

    public static jz6 b(Runnable runnable) {
        x3h.d(runnable, "run is null");
        return new g1l(runnable);
    }
}
