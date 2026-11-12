package androidx.work.multiprocess;

import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.zcp;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/work/multiprocess/RemoteWorkerWrapper;", "", "future", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "(Lcom/google/common/util/concurrent/ListenableFuture;)V", "getFuture", "()Lcom/google/common/util/concurrent/ListenableFuture;", "stopReason", "Ljava/util/concurrent/atomic/AtomicInteger;", "getStopReason$work_multiprocess_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "interrupt", "", "", "work-multiprocess_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteWorkerWrapper {
    private final ListenableFuture<ListenableWorker.Result> future;
    private final AtomicInteger stopReason;

    public RemoteWorkerWrapper(ListenableFuture<ListenableWorker.Result> listenableFuture) {
        zcp.c(listenableFuture, "");
        this.future = listenableFuture;
        this.stopReason = new AtomicInteger(-256);
    }

    public final ListenableFuture<ListenableWorker.Result> getFuture() {
        return this.future;
    }

    /* JADX INFO: renamed from: getStopReason$work_multiprocess_release, reason: from getter */
    public final AtomicInteger getStopReason() {
        return this.stopReason;
    }

    public final void interrupt(int stopReason) {
        this.stopReason.set(stopReason);
        this.future.cancel(true);
    }
}
