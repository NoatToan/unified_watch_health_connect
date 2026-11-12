package io.reactivex.internal.observers;

import defpackage.jz6;
import defpackage.kem;
import defpackage.ni2;
import defpackage.qf8;
import defpackage.t5l;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<jz6> implements kem<T>, jz6 {
    private static final long serialVersionUID = 4943102778943297569L;
    final ni2<? super T, ? super Throwable> onCallback;

    public BiConsumerSingleObserver(ni2<? super T, ? super Throwable> ni2Var) {
    }

    @Override // defpackage.jz6
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // defpackage.kem
    public void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            throw null;
        } catch (Throwable th2) {
            qf8.b(th2);
            t5l.p(new CompositeException(th, th2));
        }
    }

    @Override // defpackage.kem
    public void onSubscribe(jz6 jz6Var) {
        DisposableHelper.setOnce(this, jz6Var);
    }

    public void onSuccess(T t) {
        try {
            lazySet(DisposableHelper.DISPOSED);
            throw null;
        } catch (Throwable th) {
            qf8.b(th);
            t5l.p(th);
        }
    }
}
