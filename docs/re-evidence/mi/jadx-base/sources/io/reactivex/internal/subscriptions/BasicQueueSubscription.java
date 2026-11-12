package io.reactivex.internal.subscriptions;

import defpackage.fgi;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements fgi<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // defpackage.joo
    public abstract /* synthetic */ void cancel();

    @Override // defpackage.jdm
    public abstract /* synthetic */ void clear();

    @Override // defpackage.jdm
    public abstract /* synthetic */ boolean isEmpty();

    @Override // defpackage.jdm
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.jdm
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // defpackage.joo
    public abstract /* synthetic */ void request(long j);

    @Override // defpackage.dgi
    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
