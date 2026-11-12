package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/Report;", "", "completedDaysCount", "", "tasks", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/ReportTask;", "sleep", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData;", "<init>", "(ILjava/util/List;Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData;)V", "getCompletedDaysCount", "()I", "getTasks", "()Ljava/util/List;", "getSleep", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Report {

    @SerializedName("completions")
    private final int completedDaysCount;

    @SerializedName("sleep")
    @Nullable
    private final SleepData sleep;

    @SerializedName("tasks")
    @Nullable
    private final List<ReportTask> tasks;

    public Report(int i, @Nullable List<ReportTask> list, @Nullable SleepData sleepData) {
        this.completedDaysCount = i;
        this.tasks = list;
        this.sleep = sleepData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Report copy$default(Report report, int i, List list, SleepData sleepData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = report.completedDaysCount;
        }
        if ((i2 & 2) != 0) {
            list = report.tasks;
        }
        if ((i2 & 4) != 0) {
            sleepData = report.sleep;
        }
        return report.copy(i, list, sleepData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCompletedDaysCount() {
        return this.completedDaysCount;
    }

    @Nullable
    public final List<ReportTask> component2() {
        return this.tasks;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SleepData getSleep() {
        return this.sleep;
    }

    @NotNull
    public final Report copy(int completedDaysCount, @Nullable List<ReportTask> tasks, @Nullable SleepData sleep) {
        return new Report(completedDaysCount, tasks, sleep);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Report)) {
            return false;
        }
        Report report = (Report) other;
        return this.completedDaysCount == report.completedDaysCount && Intrinsics.areEqual(this.tasks, report.tasks) && Intrinsics.areEqual(this.sleep, report.sleep);
    }

    public final int getCompletedDaysCount() {
        return this.completedDaysCount;
    }

    @Nullable
    public final SleepData getSleep() {
        return this.sleep;
    }

    @Nullable
    public final List<ReportTask> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.completedDaysCount) * 31;
        List<ReportTask> list = this.tasks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        SleepData sleepData = this.sleep;
        return iHashCode2 + (sleepData != null ? sleepData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Report(completedDaysCount=" + this.completedDaysCount + ", tasks=" + this.tasks + ", sleep=" + this.sleep + ")";
    }
}
