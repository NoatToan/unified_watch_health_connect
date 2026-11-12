package com.xiaomi.fitness.mine.weeklyreport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/mine/weeklyreport/WeekReportItem;", "", "userId", "", "weeklyTimeStamp", "<init>", "(JJ)V", "getUserId", "()J", "getWeeklyTimeStamp", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeekReportItem {
    private final long userId;
    private final long weeklyTimeStamp;

    public WeekReportItem(long j, long j2) {
        this.userId = j;
        this.weeklyTimeStamp = j2;
    }

    public static /* synthetic */ WeekReportItem copy$default(WeekReportItem weekReportItem, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = weekReportItem.userId;
        }
        if ((i & 2) != 0) {
            j2 = weekReportItem.weeklyTimeStamp;
        }
        return weekReportItem.copy(j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getWeeklyTimeStamp() {
        return this.weeklyTimeStamp;
    }

    @NotNull
    public final WeekReportItem copy(long userId, long weeklyTimeStamp) {
        return new WeekReportItem(userId, weeklyTimeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekReportItem)) {
            return false;
        }
        WeekReportItem weekReportItem = (WeekReportItem) other;
        return this.userId == weekReportItem.userId && this.weeklyTimeStamp == weekReportItem.weeklyTimeStamp;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getWeeklyTimeStamp() {
        return this.weeklyTimeStamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.userId) * 31) + Long.hashCode(this.weeklyTimeStamp);
    }

    @NotNull
    public String toString() {
        return "WeekReportItem(userId=" + this.userId + ", weeklyTimeStamp=" + this.weeklyTimeStamp + ")";
    }
}
