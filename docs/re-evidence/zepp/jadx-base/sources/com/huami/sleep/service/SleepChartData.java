package com.huami.sleep.service;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/service/SleepChartData;", "", "", "Lcom/huami/sleep/service/SleepChartSection;", "component1", "Ljava/util/Date;", "component2", "component3", "chartData", "sleepStartTime", "sleepEndTime", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "getChartData", "()Ljava/util/List;", "b", "Ljava/util/Date;", "getSleepStartTime", "()Ljava/util/Date;", "c", "getSleepEndTime", "<init>", "(Ljava/util/List;Ljava/util/Date;Ljava/util/Date;)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepChartData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<SleepChartSection> chartData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepEndTime;

    public SleepChartData(@NotNull List<SleepChartSection> list, @NotNull Date date, @NotNull Date date2) {
        this.chartData = list;
        this.sleepStartTime = date;
        this.sleepEndTime = date2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepChartData copy$default(SleepChartData sleepChartData, List list, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sleepChartData.chartData;
        }
        if ((i & 2) != 0) {
            date = sleepChartData.sleepStartTime;
        }
        if ((i & 4) != 0) {
            date2 = sleepChartData.sleepEndTime;
        }
        return sleepChartData.copy(list, date, date2);
    }

    @NotNull
    public final List<SleepChartSection> component1() {
        return this.chartData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    @NotNull
    public final SleepChartData copy(@NotNull List<SleepChartSection> chartData, @NotNull Date sleepStartTime, @NotNull Date sleepEndTime) {
        return new SleepChartData(chartData, sleepStartTime, sleepEndTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepChartData)) {
            return false;
        }
        SleepChartData sleepChartData = (SleepChartData) other;
        return Intrinsics.areEqual(this.chartData, sleepChartData.chartData) && Intrinsics.areEqual(this.sleepStartTime, sleepChartData.sleepStartTime) && Intrinsics.areEqual(this.sleepEndTime, sleepChartData.sleepEndTime);
    }

    @NotNull
    public final List<SleepChartSection> getChartData() {
        return this.chartData;
    }

    @NotNull
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    @NotNull
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    public int hashCode() {
        return (((this.chartData.hashCode() * 31) + this.sleepStartTime.hashCode()) * 31) + this.sleepEndTime.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepChartData(chartData=" + this.chartData + ", sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ")";
    }
}
