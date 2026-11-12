package com.huami.devicerecorder.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/devicerecorder/model/SyncItemData;", "", "Lcom/huami/devicerecorder/model/RecordFile;", "component1", "Lcom/huami/devicerecorder/model/SyncItemData$SyncStatus;", "component2", "", "component3", "recordFile", "syncStatus", "progress", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Lcom/huami/devicerecorder/model/RecordFile;", "getRecordFile", "()Lcom/huami/devicerecorder/model/RecordFile;", "setRecordFile", "(Lcom/huami/devicerecorder/model/RecordFile;)V", "b", "Lcom/huami/devicerecorder/model/SyncItemData$SyncStatus;", "getSyncStatus", "()Lcom/huami/devicerecorder/model/SyncItemData$SyncStatus;", "setSyncStatus", "(Lcom/huami/devicerecorder/model/SyncItemData$SyncStatus;)V", "c", LogUtil.I, "getProgress", "()I", "setProgress", "(I)V", "<init>", "(Lcom/huami/devicerecorder/model/RecordFile;Lcom/huami/devicerecorder/model/SyncItemData$SyncStatus;I)V", "SyncStatus", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SyncItemData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private RecordFile recordFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private SyncStatus syncStatus;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private int progress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/devicerecorder/model/SyncItemData$SyncStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Pending", "Synced", "Error", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public enum SyncStatus {
        Pending,
        Synced,
        Error
    }

    public SyncItemData(@NotNull RecordFile recordFile, @NotNull SyncStatus syncStatus, int i) {
        this.recordFile = recordFile;
        this.syncStatus = syncStatus;
        this.progress = i;
    }

    public static /* synthetic */ SyncItemData copy$default(SyncItemData syncItemData, RecordFile recordFile, SyncStatus syncStatus, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            recordFile = syncItemData.recordFile;
        }
        if ((i2 & 2) != 0) {
            syncStatus = syncItemData.syncStatus;
        }
        if ((i2 & 4) != 0) {
            i = syncItemData.progress;
        }
        return syncItemData.copy(recordFile, syncStatus, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecordFile getRecordFile() {
        return this.recordFile;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final SyncItemData copy(@NotNull RecordFile recordFile, @NotNull SyncStatus syncStatus, int progress) {
        return new SyncItemData(recordFile, syncStatus, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncItemData)) {
            return false;
        }
        SyncItemData syncItemData = (SyncItemData) other;
        return Intrinsics.areEqual(this.recordFile, syncItemData.recordFile) && this.syncStatus == syncItemData.syncStatus && this.progress == syncItemData.progress;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final RecordFile getRecordFile() {
        return this.recordFile;
    }

    @NotNull
    public final SyncStatus getSyncStatus() {
        return this.syncStatus;
    }

    public int hashCode() {
        return (((this.recordFile.hashCode() * 31) + this.syncStatus.hashCode()) * 31) + this.progress;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setRecordFile(@NotNull RecordFile recordFile) {
        this.recordFile = recordFile;
    }

    public final void setSyncStatus(@NotNull SyncStatus syncStatus) {
        this.syncStatus = syncStatus;
    }

    @NotNull
    public String toString() {
        return "SyncItemData(recordFile=" + this.recordFile + ", syncStatus=" + this.syncStatus + ", progress=" + this.progress + ")";
    }
}
