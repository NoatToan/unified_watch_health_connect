package com.xiaomi.fitness.detail.util;

import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/detail/util/StatisticData;", "", "avgValue", "", "minItem", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "maxItem", "<init>", "(FLcom/xiaomi/fit/data/common/data/sport/SportRecordItem;Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;)V", "getAvgValue", "()F", "getMinItem", "()Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "getMaxItem", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StatisticData {
    private final float avgValue;

    @NotNull
    private final SportRecordItem maxItem;

    @NotNull
    private final SportRecordItem minItem;

    public StatisticData(float f, @NotNull SportRecordItem minItem, @NotNull SportRecordItem maxItem) {
        Intrinsics.checkNotNullParameter(minItem, "minItem");
        Intrinsics.checkNotNullParameter(maxItem, "maxItem");
        this.avgValue = f;
        this.minItem = minItem;
        this.maxItem = maxItem;
    }

    public static /* synthetic */ StatisticData copy$default(StatisticData statisticData, float f, SportRecordItem sportRecordItem, SportRecordItem sportRecordItem2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = statisticData.avgValue;
        }
        if ((i & 2) != 0) {
            sportRecordItem = statisticData.minItem;
        }
        if ((i & 4) != 0) {
            sportRecordItem2 = statisticData.maxItem;
        }
        return statisticData.copy(f, sportRecordItem, sportRecordItem2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SportRecordItem getMinItem() {
        return this.minItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SportRecordItem getMaxItem() {
        return this.maxItem;
    }

    @NotNull
    public final StatisticData copy(float avgValue, @NotNull SportRecordItem minItem, @NotNull SportRecordItem maxItem) {
        Intrinsics.checkNotNullParameter(minItem, "minItem");
        Intrinsics.checkNotNullParameter(maxItem, "maxItem");
        return new StatisticData(avgValue, minItem, maxItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticData)) {
            return false;
        }
        StatisticData statisticData = (StatisticData) other;
        return Float.compare(this.avgValue, statisticData.avgValue) == 0 && Intrinsics.areEqual(this.minItem, statisticData.minItem) && Intrinsics.areEqual(this.maxItem, statisticData.maxItem);
    }

    public final float getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    public final SportRecordItem getMaxItem() {
        return this.maxItem;
    }

    @NotNull
    public final SportRecordItem getMinItem() {
        return this.minItem;
    }

    public int hashCode() {
        return (((Float.hashCode(this.avgValue) * 31) + this.minItem.hashCode()) * 31) + this.maxItem.hashCode();
    }

    @NotNull
    public String toString() {
        return "StatisticData(avgValue=" + this.avgValue + ", minItem=" + this.minItem + ", maxItem=" + this.maxItem + ")";
    }
}
