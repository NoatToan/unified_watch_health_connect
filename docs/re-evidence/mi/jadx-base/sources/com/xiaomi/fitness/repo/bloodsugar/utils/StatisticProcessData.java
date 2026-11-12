package com.xiaomi.fitness.repo.bloodsugar.utils;

import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.extentions.BloodSugarItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.utils.BloodSugarTargetRange;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/utils/StatisticProcessData;", "", "timestamp", "", "<init>", "(J)V", "getTimestamp", "()J", "sumValue", "", "count", "", "maxItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "minItem", "refresh", "", "record", "statistic", "Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "toResult", "targetRange", "Lcom/xiaomi/fit/fitness/export/utils/BloodSugarTargetRange;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StatisticProcessData {
    private int count;

    @Nullable
    private BloodSugarItem maxItem;

    @Nullable
    private BloodSugarItem minItem;
    private float sumValue;
    private final long timestamp;

    public StatisticProcessData(long j) {
        this.timestamp = j;
    }

    public static /* synthetic */ StatisticProcessData copy$default(StatisticProcessData statisticProcessData, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = statisticProcessData.timestamp;
        }
        return statisticProcessData.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final StatisticProcessData copy(long timestamp) {
        return new StatisticProcessData(timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StatisticProcessData) && this.timestamp == ((StatisticProcessData) other).timestamp;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    public final void refresh(@NotNull BloodSugarItem record) {
        Intrinsics.checkNotNullParameter(record, "record");
        BloodSugarItem bloodSugarItem = this.maxItem;
        if (bloodSugarItem != null) {
            Intrinsics.checkNotNull(bloodSugarItem);
            if (BloodSugarItemExtKt.lessThan(bloodSugarItem, record)) {
                this.maxItem = record;
            }
        } else {
            this.maxItem = record;
        }
        BloodSugarItem bloodSugarItem2 = this.minItem;
        if (bloodSugarItem2 != null) {
            Intrinsics.checkNotNull(bloodSugarItem2);
            if (BloodSugarItemExtKt.moreThan(bloodSugarItem2, record)) {
                this.minItem = record;
            }
        } else {
            this.minItem = record;
        }
        this.sumValue += record.bloodSugar();
        this.count++;
    }

    @Nullable
    public final StatisticBloodSugar toResult(@NotNull BloodSugarTargetRange targetRange) {
        Intrinsics.checkNotNullParameter(targetRange, "targetRange");
        if (this.maxItem == null || this.minItem == null) {
            return null;
        }
        int i = this.count;
        BloodSugarItem bloodSugarItem = new BloodSugarItem(this.timestamp, i == 0 ? 0.0f : xr5.e(1, this.sumValue / i), null, 4, null);
        bloodSugarItem.getTargetLevel(targetRange);
        BloodSugarItem bloodSugarItem2 = this.maxItem;
        Intrinsics.checkNotNull(bloodSugarItem2);
        BloodSugarItem bloodSugarItem3 = this.minItem;
        Intrinsics.checkNotNull(bloodSugarItem3);
        return new StatisticBloodSugar(bloodSugarItem2, bloodSugarItem3, bloodSugarItem);
    }

    @NotNull
    public String toString() {
        return "StatisticProcessData(timestamp=" + this.timestamp + ")";
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    public final void refresh(@Nullable StatisticBloodSugar statistic) {
        if (statistic != null && statistic.getAvgItem().bloodSugar() > 0.0f) {
            BloodSugarItem bloodSugarItem = this.maxItem;
            if (bloodSugarItem != null) {
                Intrinsics.checkNotNull(bloodSugarItem);
                if (BloodSugarItemExtKt.lessThan(bloodSugarItem, statistic.getMaxItem())) {
                    this.maxItem = statistic.getMaxItem();
                }
            } else {
                this.maxItem = statistic.getMaxItem();
            }
            BloodSugarItem bloodSugarItem2 = this.minItem;
            if (bloodSugarItem2 != null) {
                Intrinsics.checkNotNull(bloodSugarItem2);
                if (BloodSugarItemExtKt.moreThan(bloodSugarItem2, statistic.getMinItem())) {
                    this.minItem = statistic.getMinItem();
                }
            } else {
                this.minItem = statistic.getMinItem();
            }
            this.sumValue += statistic.getAvgItem().bloodSugar();
            this.count++;
        }
    }
}
