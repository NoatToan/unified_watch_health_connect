package com.xiaomi.hm.health.healthdata.ui.vo.temperature;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.RangeIndex;
import com.xiaomi.hm.health.healthdata.core.dto.DataItemDto;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b1\u00102J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001dR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R(\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\b.\u0010$\"\u0004\b/\u0010&¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/temperature/TempMixLineChartBuilderData;", "", "Ljava/util/Date;", "component1", "", "Lcom/xiaomi/hm/health/healthdata/core/dto/DataItemDto;", "component2", "startDate", "rawData", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/Date;", "getStartDate", "()Ljava/util/Date;", "b", "Ljava/util/List;", "getRawData", "()Ljava/util/List;", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "c", "getChartData", "setChartData", "(Ljava/util/List;)V", "chartData", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "getSubIndex", "()Ljava/util/ArrayList;", "setSubIndex", "(Ljava/util/ArrayList;)V", "subIndex", "", "e", "getSubIndexShadowColors", "setSubIndexShadowColors", "subIndexShadowColors", "f", "getSubPointIndex", "setSubPointIndex", "subPointIndex", "<init>", "(Ljava/util/Date;Ljava/util/List;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TempMixLineChartBuilderData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Date startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<DataItemDto> rawData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<HealthChartDataVo> chartData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private ArrayList<RangeIndex> subIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private ArrayList<int[]> subIndexShadowColors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private ArrayList<Integer> subPointIndex;

    public TempMixLineChartBuilderData(@NotNull Date date, @NotNull List<DataItemDto> list) {
        this.startDate = date;
        this.rawData = list;
        this.chartData = CollectionsKt__CollectionsKt.emptyList();
        this.subIndex = new ArrayList<>();
        this.subIndexShadowColors = new ArrayList<>();
        this.subPointIndex = new ArrayList<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TempMixLineChartBuilderData copy$default(TempMixLineChartBuilderData tempMixLineChartBuilderData, Date date, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            date = tempMixLineChartBuilderData.startDate;
        }
        if ((i & 2) != 0) {
            list = tempMixLineChartBuilderData.rawData;
        }
        return tempMixLineChartBuilderData.copy(date, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final List<DataItemDto> component2() {
        return this.rawData;
    }

    @NotNull
    public final TempMixLineChartBuilderData copy(@NotNull Date startDate, @NotNull List<DataItemDto> rawData) {
        return new TempMixLineChartBuilderData(startDate, rawData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TempMixLineChartBuilderData)) {
            return false;
        }
        TempMixLineChartBuilderData tempMixLineChartBuilderData = (TempMixLineChartBuilderData) other;
        return Intrinsics.areEqual(this.startDate, tempMixLineChartBuilderData.startDate) && Intrinsics.areEqual(this.rawData, tempMixLineChartBuilderData.rawData);
    }

    @NotNull
    public final List<HealthChartDataVo> getChartData() {
        return this.chartData;
    }

    @NotNull
    public final List<DataItemDto> getRawData() {
        return this.rawData;
    }

    @NotNull
    public final Date getStartDate() {
        return this.startDate;
    }

    @NotNull
    public final ArrayList<RangeIndex> getSubIndex() {
        return this.subIndex;
    }

    @NotNull
    public final ArrayList<int[]> getSubIndexShadowColors() {
        return this.subIndexShadowColors;
    }

    @NotNull
    public final ArrayList<Integer> getSubPointIndex() {
        return this.subPointIndex;
    }

    public int hashCode() {
        return (this.startDate.hashCode() * 31) + this.rawData.hashCode();
    }

    public final void setChartData(@NotNull List<HealthChartDataVo> list) {
        this.chartData = list;
    }

    public final void setSubIndex(@NotNull ArrayList<RangeIndex> arrayList) {
        this.subIndex = arrayList;
    }

    public final void setSubIndexShadowColors(@NotNull ArrayList<int[]> arrayList) {
        this.subIndexShadowColors = arrayList;
    }

    public final void setSubPointIndex(@NotNull ArrayList<Integer> arrayList) {
        this.subPointIndex = arrayList;
    }

    @NotNull
    public String toString() {
        return "TempMixLineChartBuilderData(startDate=" + this.startDate + ", rawData=" + this.rawData + ")";
    }

    public /* synthetic */ TempMixLineChartBuilderData(Date date, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(date, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
