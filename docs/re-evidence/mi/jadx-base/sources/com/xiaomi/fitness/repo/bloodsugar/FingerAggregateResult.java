package com.xiaomi.fitness.repo.bloodsugar;

import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BZ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005\u0012\u001b\b\u0002\u0010\b\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005HÆ\u0003J\u001c\u0010\u0018\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003J\\\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u00052\u001b\b\u0002\u0010\b\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\b\u001a\u0015\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/FingerAggregateResult;", "", "latestRecord", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "resultMap", "", "", "", "targetLevelMap", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarLevel;", "statisticBS", "Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;Ljava/util/Map;Ljava/util/Map;Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;)V", "getLatestRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "getResultMap", "()Ljava/util/Map;", "getTargetLevelMap", "getStatisticBS", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FingerAggregateResult {

    @Nullable
    private final BloodSugarItem latestRecord;

    @Nullable
    private final Map<Long, List<BloodSugarItem>> resultMap;

    @Nullable
    private final StatisticBloodSugar statisticBS;

    @Nullable
    private final Map<Integer, Integer> targetLevelMap;

    public FingerAggregateResult() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FingerAggregateResult copy$default(FingerAggregateResult fingerAggregateResult, BloodSugarItem bloodSugarItem, Map map, Map map2, StatisticBloodSugar statisticBloodSugar, int i, Object obj) {
        if ((i & 1) != 0) {
            bloodSugarItem = fingerAggregateResult.latestRecord;
        }
        if ((i & 2) != 0) {
            map = fingerAggregateResult.resultMap;
        }
        if ((i & 4) != 0) {
            map2 = fingerAggregateResult.targetLevelMap;
        }
        if ((i & 8) != 0) {
            statisticBloodSugar = fingerAggregateResult.statisticBS;
        }
        return fingerAggregateResult.copy(bloodSugarItem, map, map2, statisticBloodSugar);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BloodSugarItem getLatestRecord() {
        return this.latestRecord;
    }

    @Nullable
    public final Map<Long, List<BloodSugarItem>> component2() {
        return this.resultMap;
    }

    @Nullable
    public final Map<Integer, Integer> component3() {
        return this.targetLevelMap;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StatisticBloodSugar getStatisticBS() {
        return this.statisticBS;
    }

    @NotNull
    public final FingerAggregateResult copy(@Nullable BloodSugarItem latestRecord, @Nullable Map<Long, ? extends List<BloodSugarItem>> resultMap, @Nullable Map<Integer, Integer> targetLevelMap, @Nullable StatisticBloodSugar statisticBS) {
        return new FingerAggregateResult(latestRecord, resultMap, targetLevelMap, statisticBS);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FingerAggregateResult)) {
            return false;
        }
        FingerAggregateResult fingerAggregateResult = (FingerAggregateResult) other;
        return Intrinsics.areEqual(this.latestRecord, fingerAggregateResult.latestRecord) && Intrinsics.areEqual(this.resultMap, fingerAggregateResult.resultMap) && Intrinsics.areEqual(this.targetLevelMap, fingerAggregateResult.targetLevelMap) && Intrinsics.areEqual(this.statisticBS, fingerAggregateResult.statisticBS);
    }

    @Nullable
    public final BloodSugarItem getLatestRecord() {
        return this.latestRecord;
    }

    @Nullable
    public final Map<Long, List<BloodSugarItem>> getResultMap() {
        return this.resultMap;
    }

    @Nullable
    public final StatisticBloodSugar getStatisticBS() {
        return this.statisticBS;
    }

    @Nullable
    public final Map<Integer, Integer> getTargetLevelMap() {
        return this.targetLevelMap;
    }

    public int hashCode() {
        BloodSugarItem bloodSugarItem = this.latestRecord;
        int iHashCode = (bloodSugarItem == null ? 0 : bloodSugarItem.hashCode()) * 31;
        Map<Long, List<BloodSugarItem>> map = this.resultMap;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<Integer, Integer> map2 = this.targetLevelMap;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        StatisticBloodSugar statisticBloodSugar = this.statisticBS;
        return iHashCode3 + (statisticBloodSugar != null ? statisticBloodSugar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FingerAggregateResult(latestRecord=" + this.latestRecord + ", resultMap=" + this.resultMap + ", targetLevelMap=" + this.targetLevelMap + ", statisticBS=" + this.statisticBS + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FingerAggregateResult(@Nullable BloodSugarItem bloodSugarItem, @Nullable Map<Long, ? extends List<BloodSugarItem>> map, @Nullable Map<Integer, Integer> map2, @Nullable StatisticBloodSugar statisticBloodSugar) {
        this.latestRecord = bloodSugarItem;
        this.resultMap = map;
        this.targetLevelMap = map2;
        this.statisticBS = statisticBloodSugar;
    }

    public /* synthetic */ FingerAggregateResult(BloodSugarItem bloodSugarItem, Map map, Map map2, StatisticBloodSugar statisticBloodSugar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bloodSugarItem, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : map2, (i & 8) != 0 ? null : statisticBloodSugar);
    }
}
