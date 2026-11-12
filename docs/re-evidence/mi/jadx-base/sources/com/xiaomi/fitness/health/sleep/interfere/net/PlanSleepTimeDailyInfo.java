package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/PlanSleepTimeDailyInfo;", "", DialWidgetType.DATE, "", "time", "<init>", "(JJ)V", "getDate", "()J", "getTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlanSleepTimeDailyInfo {

    @SerializedName(DialWidgetType.DATE)
    private final long date;

    @SerializedName("time")
    private final long time;

    public PlanSleepTimeDailyInfo(long j, long j2) {
        this.date = j;
        this.time = j2;
    }

    public static /* synthetic */ PlanSleepTimeDailyInfo copy$default(PlanSleepTimeDailyInfo planSleepTimeDailyInfo, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = planSleepTimeDailyInfo.date;
        }
        if ((i & 2) != 0) {
            j2 = planSleepTimeDailyInfo.time;
        }
        return planSleepTimeDailyInfo.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final PlanSleepTimeDailyInfo copy(long date, long time) {
        return new PlanSleepTimeDailyInfo(date, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanSleepTimeDailyInfo)) {
            return false;
        }
        PlanSleepTimeDailyInfo planSleepTimeDailyInfo = (PlanSleepTimeDailyInfo) other;
        return this.date == planSleepTimeDailyInfo.date && this.time == planSleepTimeDailyInfo.time;
    }

    public final long getDate() {
        return this.date;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.date) * 31) + Long.hashCode(this.time);
    }

    @NotNull
    public String toString() {
        return "PlanSleepTimeDailyInfo(date=" + this.date + ", time=" + this.time + ")";
    }
}
