package androidx.health.platform.client.impl.ipc.internal;

import defpackage.aqx;
import defpackage.arb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultExecutionTracker implements ExecutionTracker {
    private final Set<arb<?>> mFuturesInProgress = new HashSet();

    @Override // androidx.health.platform.client.impl.ipc.internal.ExecutionTracker
    public void track(final arb<?> arbVar) {
        synchronized (this.mFuturesInProgress) {
            this.mFuturesInProgress.add(arbVar);
            arbVar.addListener(new Runnable() { // from class: androidx.health.platform.client.impl.ipc.internal.DefaultExecutionTracker$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m457x59c09430(arbVar);
                }
            }, aqx.e());
        }
    }

    /* JADX INFO: renamed from: lambda$track$0$androidx-health-platform-client-impl-ipc-internal-DefaultExecutionTracker, reason: not valid java name */
    /* synthetic */ void m457x59c09430(arb arbVar) {
        synchronized (this.mFuturesInProgress) {
            this.mFuturesInProgress.remove(arbVar);
        }
    }

    @Override // androidx.health.platform.client.impl.ipc.internal.ExecutionTracker
    public void cancelPendingFutures(Throwable th) {
        HashSet hashSet;
        synchronized (this.mFuturesInProgress) {
            hashSet = new HashSet(this.mFuturesInProgress);
            this.mFuturesInProgress.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((arb) it.next()).setException(th);
        }
    }
}
