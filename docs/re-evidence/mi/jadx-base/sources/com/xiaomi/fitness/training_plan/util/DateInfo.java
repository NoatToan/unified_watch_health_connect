package com.xiaomi.fitness.training_plan.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/util/DateInfo;", "", "year", "", "month", "day", "<init>", "(III)V", "getYear", "()I", "getMonth", "getDay", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DateInfo {
    private final int day;
    private final int month;
    private final int year;

    public DateInfo(int i, int i2, int i3) {
        this.year = i;
        this.month = i2;
        this.day = i3;
    }

    public static /* synthetic */ DateInfo copy$default(DateInfo dateInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dateInfo.year;
        }
        if ((i4 & 2) != 0) {
            i2 = dateInfo.month;
        }
        if ((i4 & 4) != 0) {
            i3 = dateInfo.day;
        }
        return dateInfo.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    @NotNull
    public final DateInfo copy(int year, int month, int day) {
        return new DateInfo(year, month, day);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateInfo)) {
            return false;
        }
        DateInfo dateInfo = (DateInfo) other;
        return this.year == dateInfo.year && this.month == dateInfo.month && this.day == dateInfo.day;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.day);
    }

    @NotNull
    public String toString() {
        return "DateInfo(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ")";
    }
}
