package com.huami.chart.data;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.helper.DataConfig;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.chart.util.Index;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/chart/data/StaticChartConfig;", "", "Lcom/huami/chart/data/Data;", "component1", "Lcom/huami/chart/data/XYAxisData;", "component2", "Lcom/huami/chart/helper/DataConfig;", "component3", "Lcom/huami/chart/util/Index;", "component4", "chartData", "xyAxisData", "dataConfig", "defaultIndex", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/chart/data/Data;", "getChartData", "()Lcom/huami/chart/data/Data;", "b", "Lcom/huami/chart/data/XYAxisData;", "getXyAxisData", "()Lcom/huami/chart/data/XYAxisData;", "c", "Lcom/huami/chart/helper/DataConfig;", "getDataConfig", "()Lcom/huami/chart/helper/DataConfig;", GoogleApiAvailabilityLight.a, "Lcom/huami/chart/util/Index;", "getDefaultIndex", "()Lcom/huami/chart/util/Index;", "<init>", "(Lcom/huami/chart/data/Data;Lcom/huami/chart/data/XYAxisData;Lcom/huami/chart/helper/DataConfig;Lcom/huami/chart/util/Index;)V", "chart_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StaticChartConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Data chartData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final XYAxisData xyAxisData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final DataConfig dataConfig;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final Index defaultIndex;

    @JvmOverloads
    public StaticChartConfig(@NotNull Data data, @NotNull XYAxisData xYAxisData) {
        this(data, xYAxisData, null, null, 12, null);
    }

    @JvmOverloads
    public StaticChartConfig(@NotNull Data data, @NotNull XYAxisData xYAxisData, @NotNull DataConfig dataConfig) {
        this(data, xYAxisData, dataConfig, null, 8, null);
    }

    @JvmOverloads
    public StaticChartConfig(@NotNull Data data, @NotNull XYAxisData xYAxisData, @NotNull DataConfig dataConfig, @Nullable Index index) {
        this.chartData = data;
        this.xyAxisData = xYAxisData;
        this.dataConfig = dataConfig;
        this.defaultIndex = index;
    }

    public static /* synthetic */ StaticChartConfig copy$default(StaticChartConfig staticChartConfig, Data data, XYAxisData xYAxisData, DataConfig dataConfig, Index index, int i, Object obj) {
        if ((i & 1) != 0) {
            data = staticChartConfig.chartData;
        }
        if ((i & 2) != 0) {
            xYAxisData = staticChartConfig.xyAxisData;
        }
        if ((i & 4) != 0) {
            dataConfig = staticChartConfig.dataConfig;
        }
        if ((i & 8) != 0) {
            index = staticChartConfig.defaultIndex;
        }
        return staticChartConfig.copy(data, xYAxisData, dataConfig, index);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getChartData() {
        return this.chartData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final XYAxisData getXyAxisData() {
        return this.xyAxisData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DataConfig getDataConfig() {
        return this.dataConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Index getDefaultIndex() {
        return this.defaultIndex;
    }

    @NotNull
    public final StaticChartConfig copy(@NotNull Data chartData, @NotNull XYAxisData xyAxisData, @NotNull DataConfig dataConfig, @Nullable Index defaultIndex) {
        return new StaticChartConfig(chartData, xyAxisData, dataConfig, defaultIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticChartConfig)) {
            return false;
        }
        StaticChartConfig staticChartConfig = (StaticChartConfig) other;
        return Intrinsics.areEqual(this.chartData, staticChartConfig.chartData) && Intrinsics.areEqual(this.xyAxisData, staticChartConfig.xyAxisData) && Intrinsics.areEqual(this.dataConfig, staticChartConfig.dataConfig) && Intrinsics.areEqual(this.defaultIndex, staticChartConfig.defaultIndex);
    }

    @NotNull
    public final Data getChartData() {
        return this.chartData;
    }

    @NotNull
    public final DataConfig getDataConfig() {
        return this.dataConfig;
    }

    @Nullable
    public final Index getDefaultIndex() {
        return this.defaultIndex;
    }

    @NotNull
    public final XYAxisData getXyAxisData() {
        return this.xyAxisData;
    }

    public int hashCode() {
        int iHashCode = ((((this.chartData.hashCode() * 31) + this.xyAxisData.hashCode()) * 31) + this.dataConfig.hashCode()) * 31;
        Index index = this.defaultIndex;
        return iHashCode + (index == null ? 0 : index.hashCode());
    }

    @NotNull
    public String toString() {
        return "StaticChartConfig(chartData=" + this.chartData + ", xyAxisData=" + this.xyAxisData + ", dataConfig=" + this.dataConfig + ", defaultIndex=" + this.defaultIndex + ")";
    }

    public /* synthetic */ StaticChartConfig(Data data, XYAxisData xYAxisData, DataConfig dataConfig, Index index, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(data, xYAxisData, (i & 4) != 0 ? new DataConfig(HMChartHelperKt.getDpToPx(8.0f), null, 2, null) : dataConfig, (i & 8) != 0 ? null : index);
    }
}
