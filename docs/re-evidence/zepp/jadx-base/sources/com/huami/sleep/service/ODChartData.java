package com.huami.sleep.service;

import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/service/ODChartData;", "", "Ljava/util/Date;", "component1", "component2", "", "Lcom/huami/sleep/service/ChartPoint;", "component3", "sleepStartTime", "sleepEndTime", "odChardData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getSleepStartTime", "()Ljava/util/Date;", "b", "getSleepEndTime", "c", "Ljava/util/List;", "getOdChardData", "()Ljava/util/List;", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ODChartData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepEndTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ChartPoint> odChardData;

    public ODChartData(@NotNull Date date, @NotNull Date date2, @NotNull List<ChartPoint> list) {
        this.sleepStartTime = date;
        this.sleepEndTime = date2;
        this.odChardData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ODChartData copy$default(ODChartData oDChartData, Date date, Date date2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            date = oDChartData.sleepStartTime;
        }
        if ((i & 2) != 0) {
            date2 = oDChartData.sleepEndTime;
        }
        if ((i & 4) != 0) {
            list = oDChartData.odChardData;
        }
        return oDChartData.copy(date, date2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    @NotNull
    public final List<ChartPoint> component3() {
        return this.odChardData;
    }

    @NotNull
    public final ODChartData copy(@NotNull Date sleepStartTime, @NotNull Date sleepEndTime, @NotNull List<ChartPoint> odChardData) {
        return new ODChartData(sleepStartTime, sleepEndTime, odChardData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ODChartData)) {
            return false;
        }
        ODChartData oDChartData = (ODChartData) other;
        return Intrinsics.areEqual(this.sleepStartTime, oDChartData.sleepStartTime) && Intrinsics.areEqual(this.sleepEndTime, oDChartData.sleepEndTime) && Intrinsics.areEqual(this.odChardData, oDChartData.odChardData);
    }

    @NotNull
    public final List<ChartPoint> getOdChardData() {
        return this.odChardData;
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
        return (((this.sleepStartTime.hashCode() * 31) + this.sleepEndTime.hashCode()) * 31) + this.odChardData.hashCode();
    }

    @NotNull
    public String toString() {
        return "ODChartData(sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ", odChardData=" + this.odChardData + ")";
    }
}
