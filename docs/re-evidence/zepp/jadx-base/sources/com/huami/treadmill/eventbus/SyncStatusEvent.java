package com.huami.treadmill.eventbus;

import com.huami.treadmill.data.SyncStatus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/huami/treadmill/eventbus/SyncStatusEvent;", "", "Lcom/huami/treadmill/data/SyncStatus;", "a", "Lcom/huami/treadmill/data/SyncStatus;", "getStatus", "()Lcom/huami/treadmill/data/SyncStatus;", "setStatus", "(Lcom/huami/treadmill/data/SyncStatus;)V", "status", "", "b", "Z", "getResult", "()Z", "setResult", "(Z)V", "result", "c", "getShowDetail", "setShowDetail", "showDetail", "<init>", "(Lcom/huami/treadmill/data/SyncStatus;ZZ)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class SyncStatusEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private SyncStatus status;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean showDetail;

    public SyncStatusEvent(@NotNull SyncStatus syncStatus, boolean z, boolean z2) {
        this.status = syncStatus;
        this.result = z;
        this.showDetail = z2;
    }

    public final boolean getResult() {
        return this.result;
    }

    public final boolean getShowDetail() {
        return this.showDetail;
    }

    @NotNull
    public final SyncStatus getStatus() {
        return this.status;
    }

    public final void setResult(boolean z) {
        this.result = z;
    }

    public final void setShowDetail(boolean z) {
        this.showDetail = z;
    }

    public final void setStatus(@NotNull SyncStatus syncStatus) {
        this.status = syncStatus;
    }
}
