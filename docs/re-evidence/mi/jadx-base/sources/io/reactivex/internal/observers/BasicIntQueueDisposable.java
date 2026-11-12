package io.reactivex.internal.observers;

import defpackage.bgi;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements bgi<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract /* synthetic */ boolean isEmpty();

    @Override // defpackage.jdm
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public abstract /* synthetic */ Object poll() throws Exception;

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
