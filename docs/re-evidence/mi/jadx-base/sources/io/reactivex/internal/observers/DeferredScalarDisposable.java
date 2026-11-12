package io.reactivex.internal.observers;

import defpackage.t5l;
import defpackage.z5h;

/* JADX INFO: loaded from: classes2.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final z5h<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(z5h<? super T> z5hVar) {
        this.downstream = z5hVar;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jdm
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t) {
        int i = get();
        if ((i & 54) != 0) {
            return;
        }
        z5h<? super T> z5hVar = this.downstream;
        if (i == 8) {
            this.value = t;
            lazySet(16);
            z5hVar.onNext(null);
        } else {
            lazySet(2);
            z5hVar.onNext(t);
        }
        if (get() != 4) {
            z5hVar.onComplete();
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jz6
    public void dispose() {
        set(4);
        this.value = null;
    }

    public final void error(Throwable th) {
        if ((get() & 54) != 0) {
            t5l.p(th);
        } else {
            lazySet(2);
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jz6
    public final boolean isDisposed() {
        return get() == 4;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jdm
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jdm
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.dgi
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }
}
