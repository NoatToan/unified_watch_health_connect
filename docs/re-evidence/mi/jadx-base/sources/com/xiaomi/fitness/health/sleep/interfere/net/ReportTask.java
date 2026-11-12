package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/ReportTask;", "", "type", "", "totalCount", "", "completeCount", "<init>", "(Ljava/lang/String;II)V", "getType", "()Ljava/lang/String;", "getTotalCount", "()I", "getCompleteCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportTask {

    @SerializedName("completions")
    private final int completeCount;

    @SerializedName(SportDataTypeKt.DIMEN_TOTAL)
    private final int totalCount;

    @SerializedName("type")
    @NotNull
    private final String type;

    public ReportTask(@NotNull String type, int i, int i2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.totalCount = i;
        this.completeCount = i2;
    }

    public static /* synthetic */ ReportTask copy$default(ReportTask reportTask, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = reportTask.type;
        }
        if ((i3 & 2) != 0) {
            i = reportTask.totalCount;
        }
        if ((i3 & 4) != 0) {
            i2 = reportTask.completeCount;
        }
        return reportTask.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCompleteCount() {
        return this.completeCount;
    }

    @NotNull
    public final ReportTask copy(@NotNull String type, int totalCount, int completeCount) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ReportTask(type, totalCount, completeCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportTask)) {
            return false;
        }
        ReportTask reportTask = (ReportTask) other;
        return Intrinsics.areEqual(this.type, reportTask.type) && this.totalCount == reportTask.totalCount && this.completeCount == reportTask.completeCount;
    }

    public final int getCompleteCount() {
        return this.completeCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.totalCount)) * 31) + Integer.hashCode(this.completeCount);
    }

    @NotNull
    public String toString() {
        return "ReportTask(type=" + this.type + ", totalCount=" + this.totalCount + ", completeCount=" + this.completeCount + ")";
    }
}
