package androidx.health.platform.client.impl.ipc.internal;

import defpackage.arb;

/* JADX INFO: loaded from: classes3.dex */
public interface ExecutionTracker {
    void cancelPendingFutures(Throwable th);

    void track(arb<?> arbVar);
}
