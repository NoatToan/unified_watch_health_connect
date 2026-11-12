package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "", "maxItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "minItem", "avgItem", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;)V", "getMaxItem", "()Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "setMaxItem", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;)V", "getMinItem", "setMinItem", "getAvgItem", "setAvgItem", "toString", "", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StatisticBloodSugar {

    @NotNull
    private BloodSugarItem avgItem;

    /* JADX INFO: renamed from: maxItem, reason: from kotlin metadata and from toString and from toString and from toString */
    @NotNull
    private BloodSugarItem avg;

    @NotNull
    private BloodSugarItem minItem;

    public StatisticBloodSugar(@NotNull BloodSugarItem maxItem, @NotNull BloodSugarItem minItem, @NotNull BloodSugarItem avgItem) {
        Intrinsics.checkNotNullParameter(maxItem, "maxItem");
        Intrinsics.checkNotNullParameter(minItem, "minItem");
        Intrinsics.checkNotNullParameter(avgItem, "avgItem");
        this.avg = maxItem;
        this.minItem = minItem;
        this.avgItem = avgItem;
    }

    public static /* synthetic */ StatisticBloodSugar copy$default(StatisticBloodSugar statisticBloodSugar, BloodSugarItem bloodSugarItem, BloodSugarItem bloodSugarItem2, BloodSugarItem bloodSugarItem3, int i, Object obj) {
        if ((i & 1) != 0) {
            bloodSugarItem = statisticBloodSugar.avg;
        }
        if ((i & 2) != 0) {
            bloodSugarItem2 = statisticBloodSugar.minItem;
        }
        if ((i & 4) != 0) {
            bloodSugarItem3 = statisticBloodSugar.avgItem;
        }
        return statisticBloodSugar.copy(bloodSugarItem, bloodSugarItem2, bloodSugarItem3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BloodSugarItem getAvg() {
        return this.avg;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BloodSugarItem getMinItem() {
        return this.minItem;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BloodSugarItem getAvgItem() {
        return this.avgItem;
    }

    @NotNull
    public final StatisticBloodSugar copy(@NotNull BloodSugarItem maxItem, @NotNull BloodSugarItem minItem, @NotNull BloodSugarItem avgItem) {
        Intrinsics.checkNotNullParameter(maxItem, "maxItem");
        Intrinsics.checkNotNullParameter(minItem, "minItem");
        Intrinsics.checkNotNullParameter(avgItem, "avgItem");
        return new StatisticBloodSugar(maxItem, minItem, avgItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticBloodSugar)) {
            return false;
        }
        StatisticBloodSugar statisticBloodSugar = (StatisticBloodSugar) other;
        return Intrinsics.areEqual(this.avg, statisticBloodSugar.avg) && Intrinsics.areEqual(this.minItem, statisticBloodSugar.minItem) && Intrinsics.areEqual(this.avgItem, statisticBloodSugar.avgItem);
    }

    @NotNull
    public final BloodSugarItem getAvgItem() {
        return this.avgItem;
    }

    @NotNull
    public final BloodSugarItem getMaxItem() {
        return this.avg;
    }

    @NotNull
    public final BloodSugarItem getMinItem() {
        return this.minItem;
    }

    public int hashCode() {
        return (((this.avg.hashCode() * 31) + this.minItem.hashCode()) * 31) + this.avgItem.hashCode();
    }

    public final void setAvgItem(@NotNull BloodSugarItem bloodSugarItem) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<set-?>");
        this.avgItem = bloodSugarItem;
    }

    public final void setMaxItem(@NotNull BloodSugarItem bloodSugarItem) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<set-?>");
        this.avg = bloodSugarItem;
    }

    public final void setMinItem(@NotNull BloodSugarItem bloodSugarItem) {
        Intrinsics.checkNotNullParameter(bloodSugarItem, "<set-?>");
        this.minItem = bloodSugarItem;
    }

    @NotNull
    public String toString() {
        BloodSugarItem bloodSugarItem = this.avg;
        return "max=" + bloodSugarItem + ", min=" + bloodSugarItem + ", avg=" + bloodSugarItem;
    }
}
