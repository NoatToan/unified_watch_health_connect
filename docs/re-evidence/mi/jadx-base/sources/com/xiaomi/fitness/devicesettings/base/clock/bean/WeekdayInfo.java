package com.xiaomi.fitness.devicesettings.base.clock.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/bean/WeekdayInfo;", "", "year", "", "workdayList", "", "", "freedayList", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "getYear", "()I", "getWorkdayList", "()Ljava/util/List;", "getFreedayList", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeekdayInfo {

    @SerializedName("freeday")
    @NotNull
    private final List<String> freedayList;

    @SerializedName("workday")
    @NotNull
    private final List<String> workdayList;
    private final int year;

    public WeekdayInfo(int i, @NotNull List<String> workdayList, @NotNull List<String> freedayList) {
        Intrinsics.checkNotNullParameter(workdayList, "workdayList");
        Intrinsics.checkNotNullParameter(freedayList, "freedayList");
        this.year = i;
        this.workdayList = workdayList;
        this.freedayList = freedayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeekdayInfo copy$default(WeekdayInfo weekdayInfo, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = weekdayInfo.year;
        }
        if ((i2 & 2) != 0) {
            list = weekdayInfo.workdayList;
        }
        if ((i2 & 4) != 0) {
            list2 = weekdayInfo.freedayList;
        }
        return weekdayInfo.copy(i, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final List<String> component2() {
        return this.workdayList;
    }

    @NotNull
    public final List<String> component3() {
        return this.freedayList;
    }

    @NotNull
    public final WeekdayInfo copy(int year, @NotNull List<String> workdayList, @NotNull List<String> freedayList) {
        Intrinsics.checkNotNullParameter(workdayList, "workdayList");
        Intrinsics.checkNotNullParameter(freedayList, "freedayList");
        return new WeekdayInfo(year, workdayList, freedayList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekdayInfo)) {
            return false;
        }
        WeekdayInfo weekdayInfo = (WeekdayInfo) other;
        return this.year == weekdayInfo.year && Intrinsics.areEqual(this.workdayList, weekdayInfo.workdayList) && Intrinsics.areEqual(this.freedayList, weekdayInfo.freedayList);
    }

    @NotNull
    public final List<String> getFreedayList() {
        return this.freedayList;
    }

    @NotNull
    public final List<String> getWorkdayList() {
        return this.workdayList;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.year) * 31) + this.workdayList.hashCode()) * 31) + this.freedayList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WeekdayInfo(year=" + this.year + ", workdayList=" + this.workdayList + ", freedayList=" + this.freedayList + ")";
    }
}
