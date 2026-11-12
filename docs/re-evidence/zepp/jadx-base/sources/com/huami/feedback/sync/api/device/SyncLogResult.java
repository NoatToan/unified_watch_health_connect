package com.huami.feedback.sync.api.device;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.feedback.sync.api.DeviceLogSyncError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/huami/feedback/sync/api/device/SyncLogResult;", "", "Lcom/huami/feedback/sync/api/device/SyncLogState;", "component1", "", "component2", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "component3", "state", "percent", "error", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/feedback/sync/api/device/SyncLogState;", "getState", "()Lcom/huami/feedback/sync/api/device/SyncLogState;", "b", LogUtil.I, "getPercent", "()I", "c", "Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "getError", "()Lcom/huami/feedback/sync/api/DeviceLogSyncError;", "<init>", "(Lcom/huami/feedback/sync/api/device/SyncLogState;ILcom/huami/feedback/sync/api/DeviceLogSyncError;)V", "feedback-sync-device-log-api_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SyncLogResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final SyncLogState state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int percent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final DeviceLogSyncError error;

    public SyncLogResult(@NotNull SyncLogState syncLogState, int i, @Nullable DeviceLogSyncError deviceLogSyncError) {
        this.state = syncLogState;
        this.percent = i;
        this.error = deviceLogSyncError;
    }

    public static /* synthetic */ SyncLogResult copy$default(SyncLogResult syncLogResult, SyncLogState syncLogState, int i, DeviceLogSyncError deviceLogSyncError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            syncLogState = syncLogResult.state;
        }
        if ((i2 & 2) != 0) {
            i = syncLogResult.percent;
        }
        if ((i2 & 4) != 0) {
            deviceLogSyncError = syncLogResult.error;
        }
        return syncLogResult.copy(syncLogState, i, deviceLogSyncError);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SyncLogState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DeviceLogSyncError getError() {
        return this.error;
    }

    @NotNull
    public final SyncLogResult copy(@NotNull SyncLogState state, int percent, @Nullable DeviceLogSyncError error) {
        return new SyncLogResult(state, percent, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncLogResult)) {
            return false;
        }
        SyncLogResult syncLogResult = (SyncLogResult) other;
        return this.state == syncLogResult.state && this.percent == syncLogResult.percent && this.error == syncLogResult.error;
    }

    @Nullable
    public final DeviceLogSyncError getError() {
        return this.error;
    }

    public final int getPercent() {
        return this.percent;
    }

    @NotNull
    public final SyncLogState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = ((this.state.hashCode() * 31) + this.percent) * 31;
        DeviceLogSyncError deviceLogSyncError = this.error;
        return iHashCode + (deviceLogSyncError == null ? 0 : deviceLogSyncError.hashCode());
    }

    @NotNull
    public String toString() {
        return "SyncLogResult(state=" + this.state + ", percent=" + this.percent + ", error=" + this.error + ')';
    }

    public /* synthetic */ SyncLogResult(SyncLogState syncLogState, int i, DeviceLogSyncError deviceLogSyncError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(syncLogState, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : deviceLogSyncError);
    }
}
