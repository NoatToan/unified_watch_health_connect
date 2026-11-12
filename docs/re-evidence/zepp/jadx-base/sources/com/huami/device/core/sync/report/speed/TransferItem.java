package com.huami.device.core.sync.report.speed;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/device/core/sync/report/speed/TransferItem;", "", "", "component1", "", "component2", "component3", "taskId", "dataSize", "bleCost", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getTaskId", "()I", "J", "getDataSize", "()J", "getBleCost", "<init>", "(IJJ)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TransferItem {
    private final long bleCost;
    private final long dataSize;
    private final int taskId;

    public TransferItem(int i, long j, long j2) {
        this.taskId = i;
        this.dataSize = j;
        this.bleCost = j2;
    }

    public static /* synthetic */ TransferItem copy$default(TransferItem transferItem, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transferItem.taskId;
        }
        if ((i2 & 2) != 0) {
            j = transferItem.dataSize;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = transferItem.bleCost;
        }
        return transferItem.copy(i, j3, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTaskId() {
        return this.taskId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDataSize() {
        return this.dataSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBleCost() {
        return this.bleCost;
    }

    @NotNull
    public final TransferItem copy(int taskId, long dataSize, long bleCost) {
        return new TransferItem(taskId, dataSize, bleCost);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferItem)) {
            return false;
        }
        TransferItem transferItem = (TransferItem) other;
        return this.taskId == transferItem.taskId && this.dataSize == transferItem.dataSize && this.bleCost == transferItem.bleCost;
    }

    public final long getBleCost() {
        return this.bleCost;
    }

    public final long getDataSize() {
        return this.dataSize;
    }

    public final int getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((this.taskId * 31) + b.a(this.dataSize)) * 31) + b.a(this.bleCost);
    }

    @NotNull
    public String toString() {
        return "TransferItem(taskId=" + this.taskId + ", dataSize=" + this.dataSize + ", bleCost=" + this.bleCost + ')';
    }
}
