package com.huami.sleep.service;

import android.util.SparseArray;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u0012\b\b\u0002\u0010 \u001a\u00020\u0012\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0004\bL\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014HÆ\u0003J\u0097\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\b\u0002\u0010 \u001a\u00020\u00122\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014HÆ\u0001J\t\u0010$\u001a\u00020#HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\u0013\u0010'\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0019\u0010\u0018\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0019\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u001a\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00101R\u0019\u0010\u001b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00101R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u001e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010/\u001a\u0004\bA\u00101R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?R\u0019\u0010 \u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR!\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006N"}, d2 = {"Lcom/huami/sleep/service/ServiceSleepInfo;", "", "Ljava/util/Date;", "component1", "component2", "", "component3", "component4", "component5", "component6", "Lcom/huami/sleep/service/SleepChanges;", "component7", "", "Lcom/huami/sleep/service/SleepChartSection;", "component8", "component9", "Lcom/huami/sleep/service/ChartPoint;", "component10", "", "component11", "Landroid/util/SparseArray;", "component12", "sleepStartTime", "sleepEndTime", "sleepScore", "sleepDuration", "deepSleepDuration", "toBeSleepTimeCount", "sleepChanges", "chartData", "averageSleepDuration", "chartDataForSeven", "toBeMainSleep", "heartData", "copy", "", "toString", "hashCode", "other", "equals", "a", "Ljava/util/Date;", "getSleepStartTime", "()Ljava/util/Date;", "b", "getSleepEndTime", "c", LogUtil.I, "getSleepScore", "()I", GoogleApiAvailabilityLight.a, "getSleepDuration", "e", "getDeepSleepDuration", "f", "getToBeSleepTimeCount", "g", "Lcom/huami/sleep/service/SleepChanges;", "getSleepChanges", "()Lcom/huami/sleep/service/SleepChanges;", "h", "Ljava/util/List;", "getChartData", "()Ljava/util/List;", "i", "getAverageSleepDuration", z.j, "getChartDataForSeven", hl.k, "Z", "getToBeMainSleep", "()Z", "l", "Landroid/util/SparseArray;", "getHeartData", "()Landroid/util/SparseArray;", "<init>", "(Ljava/util/Date;Ljava/util/Date;IIIILcom/huami/sleep/service/SleepChanges;Ljava/util/List;ILjava/util/List;ZLandroid/util/SparseArray;)V", "sleep-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ServiceSleepInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepStartTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date sleepEndTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int sleepScore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int sleepDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int deepSleepDuration;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int toBeSleepTimeCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final SleepChanges sleepChanges;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<SleepChartSection> chartData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int averageSleepDuration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ChartPoint> chartDataForSeven;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final boolean toBeMainSleep;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private final SparseArray<ChartPoint> heartData;

    public ServiceSleepInfo(@NotNull Date date, @NotNull Date date2, int i, int i2, int i3, int i4, @Nullable SleepChanges sleepChanges, @NotNull List<SleepChartSection> list, int i5, @NotNull List<ChartPoint> list2, boolean z, @Nullable SparseArray<ChartPoint> sparseArray) {
        this.sleepStartTime = date;
        this.sleepEndTime = date2;
        this.sleepScore = i;
        this.sleepDuration = i2;
        this.deepSleepDuration = i3;
        this.toBeSleepTimeCount = i4;
        this.sleepChanges = sleepChanges;
        this.chartData = list;
        this.averageSleepDuration = i5;
        this.chartDataForSeven = list2;
        this.toBeMainSleep = z;
        this.heartData = sparseArray;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    @NotNull
    public final List<ChartPoint> component10() {
        return this.chartDataForSeven;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getToBeMainSleep() {
        return this.toBeMainSleep;
    }

    @Nullable
    public final SparseArray<ChartPoint> component12() {
        return this.heartData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSleepScore() {
        return this.sleepScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeepSleepDuration() {
        return this.deepSleepDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getToBeSleepTimeCount() {
        return this.toBeSleepTimeCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SleepChanges getSleepChanges() {
        return this.sleepChanges;
    }

    @NotNull
    public final List<SleepChartSection> component8() {
        return this.chartData;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getAverageSleepDuration() {
        return this.averageSleepDuration;
    }

    @NotNull
    public final ServiceSleepInfo copy(@NotNull Date sleepStartTime, @NotNull Date sleepEndTime, int sleepScore, int sleepDuration, int deepSleepDuration, int toBeSleepTimeCount, @Nullable SleepChanges sleepChanges, @NotNull List<SleepChartSection> chartData, int averageSleepDuration, @NotNull List<ChartPoint> chartDataForSeven, boolean toBeMainSleep, @Nullable SparseArray<ChartPoint> heartData) {
        return new ServiceSleepInfo(sleepStartTime, sleepEndTime, sleepScore, sleepDuration, deepSleepDuration, toBeSleepTimeCount, sleepChanges, chartData, averageSleepDuration, chartDataForSeven, toBeMainSleep, heartData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceSleepInfo)) {
            return false;
        }
        ServiceSleepInfo serviceSleepInfo = (ServiceSleepInfo) other;
        return Intrinsics.areEqual(this.sleepStartTime, serviceSleepInfo.sleepStartTime) && Intrinsics.areEqual(this.sleepEndTime, serviceSleepInfo.sleepEndTime) && this.sleepScore == serviceSleepInfo.sleepScore && this.sleepDuration == serviceSleepInfo.sleepDuration && this.deepSleepDuration == serviceSleepInfo.deepSleepDuration && this.toBeSleepTimeCount == serviceSleepInfo.toBeSleepTimeCount && Intrinsics.areEqual(this.sleepChanges, serviceSleepInfo.sleepChanges) && Intrinsics.areEqual(this.chartData, serviceSleepInfo.chartData) && this.averageSleepDuration == serviceSleepInfo.averageSleepDuration && Intrinsics.areEqual(this.chartDataForSeven, serviceSleepInfo.chartDataForSeven) && this.toBeMainSleep == serviceSleepInfo.toBeMainSleep && Intrinsics.areEqual(this.heartData, serviceSleepInfo.heartData);
    }

    public final int getAverageSleepDuration() {
        return this.averageSleepDuration;
    }

    @NotNull
    public final List<SleepChartSection> getChartData() {
        return this.chartData;
    }

    @NotNull
    public final List<ChartPoint> getChartDataForSeven() {
        return this.chartDataForSeven;
    }

    public final int getDeepSleepDuration() {
        return this.deepSleepDuration;
    }

    @Nullable
    public final SparseArray<ChartPoint> getHeartData() {
        return this.heartData;
    }

    @Nullable
    public final SleepChanges getSleepChanges() {
        return this.sleepChanges;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @NotNull
    public final Date getSleepEndTime() {
        return this.sleepEndTime;
    }

    public final int getSleepScore() {
        return this.sleepScore;
    }

    @NotNull
    public final Date getSleepStartTime() {
        return this.sleepStartTime;
    }

    public final boolean getToBeMainSleep() {
        return this.toBeMainSleep;
    }

    public final int getToBeSleepTimeCount() {
        return this.toBeSleepTimeCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    public int hashCode() {
        int iHashCode = ((((((((((this.sleepStartTime.hashCode() * 31) + this.sleepEndTime.hashCode()) * 31) + this.sleepScore) * 31) + this.sleepDuration) * 31) + this.deepSleepDuration) * 31) + this.toBeSleepTimeCount) * 31;
        SleepChanges sleepChanges = this.sleepChanges;
        int iHashCode2 = (((((((iHashCode + (sleepChanges == null ? 0 : sleepChanges.hashCode())) * 31) + this.chartData.hashCode()) * 31) + this.averageSleepDuration) * 31) + this.chartDataForSeven.hashCode()) * 31;
        boolean z = this.toBeMainSleep;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        SparseArray<ChartPoint> sparseArray = this.heartData;
        return i + (sparseArray != null ? sparseArray.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ServiceSleepInfo(sleepStartTime=" + this.sleepStartTime + ", sleepEndTime=" + this.sleepEndTime + ", sleepScore=" + this.sleepScore + ", sleepDuration=" + this.sleepDuration + ", deepSleepDuration=" + this.deepSleepDuration + ", toBeSleepTimeCount=" + this.toBeSleepTimeCount + ", sleepChanges=" + this.sleepChanges + ", chartData=" + this.chartData + ", averageSleepDuration=" + this.averageSleepDuration + ", chartDataForSeven=" + this.chartDataForSeven + ", toBeMainSleep=" + this.toBeMainSleep + ", heartData=" + this.heartData + ")";
    }

    public /* synthetic */ ServiceSleepInfo(Date date, Date date2, int i, int i2, int i3, int i4, SleepChanges sleepChanges, List list, int i5, List list2, boolean z, SparseArray sparseArray, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, date2, i, i2, i3, i4, sleepChanges, list, i5, list2, (i6 & 1024) != 0 ? true : z, (i6 & 2048) != 0 ? null : sparseArray);
    }
}
