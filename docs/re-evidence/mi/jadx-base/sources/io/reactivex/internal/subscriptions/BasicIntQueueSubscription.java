package io.reactivex.internal.subscriptions;

import defpackage.fgi;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements fgi<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    @Override // defpackage.jdm
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ Object poll() throws Exception;

    public abstract /* synthetic */ void request(long j);

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
