package com.xiaomi.fitness.repo.bloodsugar;

import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BJ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b0\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u001a\u0010\u0017\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003JR\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/ContinuousAggregateResult;", "", "latestRecord", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "resultMap", "", "", "targetLevelMap", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarLevel;", "statisticBS", "Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;Ljava/util/Map;Ljava/util/Map;Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;)V", "getLatestRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "getResultMap", "()Ljava/util/Map;", "getTargetLevelMap", "getStatisticBS", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class ContinuousAggregateResult {

    @Nullable
    private final BloodSugarItem latestRecord;

    @NotNull
    private final Map<Long, BloodSugarItem> resultMap;

    @Nullable
    private final StatisticBloodSugar statisticBS;

    @NotNull
    private final Map<Integer, Integer> targetLevelMap;

    public ContinuousAggregateResult(@Nullable BloodSugarItem bloodSugarItem, @NotNull Map<Long, BloodSugarItem> resultMap, @NotNull Map<Integer, Integer> targetLevelMap, @Nullable StatisticBloodSugar statisticBloodSugar) {
        Intrinsics.checkNotNullParameter(resultMap, "resultMap");
        Intrinsics.checkNotNullParameter(targetLevelMap, "targetLevelMap");
        this.latestRecord = bloodSugarItem;
        this.resultMap = resultMap;
        this.targetLevelMap = targetLevelMap;
        this.statisticBS = statisticBloodSugar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContinuousAggregateResult copy$default(ContinuousAggregateResult continuousAggregateResult, BloodSugarItem bloodSugarItem, Map map, Map map2, StatisticBloodSugar statisticBloodSugar, int i, Object obj) {
        if ((i & 1) != 0) {
            bloodSugarItem = continuousAggregateResult.latestRecord;
        }
        if ((i & 2) != 0) {
            map = continuousAggregateResult.resultMap;
        }
        if ((i & 4) != 0) {
            map2 = continuousAggregateResult.targetLevelMap;
        }
        if ((i & 8) != 0) {
            statisticBloodSugar = continuousAggregateResult.statisticBS;
        }
        return continuousAggregateResult.copy(bloodSugarItem, map, map2, statisticBloodSugar);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BloodSugarItem getLatestRecord() {
        return this.latestRecord;
    }

    @NotNull
    public final Map<Long, BloodSugarItem> component2() {
        return this.resultMap;
    }

    @NotNull
    public final Map<Integer, Integer> component3() {
        return this.targetLevelMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StatisticBloodSugar getStatisticBS() {
        return this.statisticBS;
    }

    @NotNull
    public final ContinuousAggregateResult copy(@Nullable BloodSugarItem latestRecord, @NotNull Map<Long, BloodSugarItem> resultMap, @NotNull Map<Integer, Integer> targetLevelMap, @Nullable StatisticBloodSugar statisticBS) {
        Intrinsics.checkNotNullParameter(resultMap, "resultMap");
        Intrinsics.checkNotNullParameter(targetLevelMap, "targetLevelMap");
        return new ContinuousAggregateResult(latestRecord, resultMap, targetLevelMap, statisticBS);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContinuousAggregateResult)) {
            return false;
        }
        ContinuousAggregateResult continuousAggregateResult = (ContinuousAggregateResult) other;
        return Intrinsics.areEqual(this.latestRecord, continuousAggregateResult.latestRecord) && Intrinsics.areEqual(this.resultMap, continuousAggregateResult.resultMap) && Intrinsics.areEqual(this.targetLevelMap, continuousAggregateResult.targetLevelMap) && Intrinsics.areEqual(this.statisticBS, continuousAggregateResult.statisticBS);
    }

    @Nullable
    public final BloodSugarItem getLatestRecord() {
        return this.latestRecord;
    }

    @NotNull
    public final Map<Long, BloodSugarItem> getResultMap() {
        return this.resultMap;
    }

    @Nullable
    public final StatisticBloodSugar getStatisticBS() {
        return this.statisticBS;
    }

    @NotNull
    public final Map<Integer, Integer> getTargetLevelMap() {
        return this.targetLevelMap;
    }

    public int hashCode() {
        BloodSugarItem bloodSugarItem = this.latestRecord;
        int iHashCode = (((((bloodSugarItem == null ? 0 : bloodSugarItem.hashCode()) * 31) + this.resultMap.hashCode()) * 31) + this.targetLevelMap.hashCode()) * 31;
        StatisticBloodSugar statisticBloodSugar = this.statisticBS;
        return iHashCode + (statisticBloodSugar != null ? statisticBloodSugar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ContinuousAggregateResult(latestRecord=" + this.latestRecord + ", resultMap=" + this.resultMap + ", targetLevelMap=" + this.targetLevelMap + ", statisticBS=" + this.statisticBS + ")";
    }

    public /* synthetic */ ContinuousAggregateResult(BloodSugarItem bloodSugarItem, Map map, Map map2, StatisticBloodSugar statisticBloodSugar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bloodSugarItem, map, map2, (i & 8) != 0 ? null : statisticBloodSugar);
    }
}
