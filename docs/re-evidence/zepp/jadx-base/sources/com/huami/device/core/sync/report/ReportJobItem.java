package com.huami.device.core.sync.report;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.device.core.sync.report.speed.TimeFormatter;
import com.huami.device.core.sync.report.speed.TransferItem;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineAnalyticsKt;
import defpackage.b;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0019\u0010\u0011\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b%\u0010\"R\u0019\u0010\u0012\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b&\u0010\"R\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/huami/device/core/sync/report/ReportJobItem;", "", "", "tozCsv", "", "component1", "component2", "", "component3", "component4", "component5", "", "Lcom/huami/device/core/sync/report/speed/TransferItem;", "component6", "jobId", "name", HMFwOnlineAnalyticsKt.COST, "dataSize", "bleCost", "data", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getJobId", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "J", "getCost", "()J", "setCost", "(J)V", "getDataSize", "getBleCost", "Ljava/lang/Iterable;", "getData", "()Ljava/lang/Iterable;", "<init>", "(ILjava/lang/String;JJJLjava/lang/Iterable;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ReportJobItem {
    private final long bleCost;
    private long cost;

    @NotNull
    private final Iterable<TransferItem> data;
    private final long dataSize;
    private final int jobId;

    @NotNull
    private final String name;

    public ReportJobItem(int i, @NotNull String str, long j, long j2, long j3, @NotNull Iterable<TransferItem> iterable) {
        this.jobId = i;
        this.name = str;
        this.cost = j;
        this.dataSize = j2;
        this.bleCost = j3;
        this.data = iterable;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getJobId() {
        return this.jobId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCost() {
        return this.cost;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDataSize() {
        return this.dataSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBleCost() {
        return this.bleCost;
    }

    @NotNull
    public final Iterable<TransferItem> component6() {
        return this.data;
    }

    @NotNull
    public final ReportJobItem copy(int jobId, @NotNull String name, long cost, long dataSize, long bleCost, @NotNull Iterable<TransferItem> data) {
        return new ReportJobItem(jobId, name, cost, dataSize, bleCost, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportJobItem)) {
            return false;
        }
        ReportJobItem reportJobItem = (ReportJobItem) other;
        return this.jobId == reportJobItem.jobId && Intrinsics.areEqual(this.name, reportJobItem.name) && this.cost == reportJobItem.cost && this.dataSize == reportJobItem.dataSize && this.bleCost == reportJobItem.bleCost && Intrinsics.areEqual(this.data, reportJobItem.data);
    }

    public final long getBleCost() {
        return this.bleCost;
    }

    public final long getCost() {
        return this.cost;
    }

    @NotNull
    public final Iterable<TransferItem> getData() {
        return this.data;
    }

    public final long getDataSize() {
        return this.dataSize;
    }

    public final int getJobId() {
        return this.jobId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((this.jobId * 31) + this.name.hashCode()) * 31) + b.a(this.cost)) * 31) + b.a(this.dataSize)) * 31) + b.a(this.bleCost)) * 31) + this.data.hashCode();
    }

    public final void setCost(long j) {
        this.cost = j;
    }

    @NotNull
    public String toString() {
        return "ReportJobItem(jobId=" + this.jobId + ", name=" + this.name + ", cost=" + this.cost + ", dataSize=" + this.dataSize + ", bleCost=" + this.bleCost + ", data=" + this.data + ')';
    }

    @NotNull
    public final String tozCsv() {
        return TimeFormatter.INSTANCE.toUTCTimeStr(new Date()) + ',' + this.jobId + ',' + this.name + ',' + this.cost + ',' + this.dataSize + ',' + this.bleCost + ",\"" + this.data + '\"';
    }

    public /* synthetic */ ReportJobItem(int i, String str, long j, long j2, long j3, Iterable iterable, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, j, j2, j3, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : iterable);
    }
}
