package com.xiaomi.fit.fitness.export.data.stat;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00060\u0005\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ)\u0010\u001a\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00060\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0093\u0001\u0010\u001f\u001a\u00020\u00002(\b\u0002\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00060\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R:\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00060\u0005\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalInsightReport;", "", "scheduleMap", "", "", "", "Lkotlin/Pair;", "awakeCountMap", "", "napMap", "stressMap", "strengthMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getScheduleMap", "()Ljava/util/Map;", "setScheduleMap", "(Ljava/util/Map;)V", "getAwakeCountMap", "setAwakeCountMap", "getNapMap", "setNapMap", "getStressMap", "setStressMap", "getStrengthMap", "setStrengthMap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepAnimalInsightReport {

    @Nullable
    private Map<Long, Integer> awakeCountMap;

    @Nullable
    private Map<Long, Integer> napMap;

    @Nullable
    private Map<Long, ? extends List<Pair<Long, Long>>> scheduleMap;

    @Nullable
    private Map<Long, Integer> strengthMap;

    @Nullable
    private Map<Long, Integer> stressMap;

    public SleepAnimalInsightReport() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAnimalInsightReport copy$default(SleepAnimalInsightReport sleepAnimalInsightReport, Map map, Map map2, Map map3, Map map4, Map map5, int i, Object obj) {
        if ((i & 1) != 0) {
            map = sleepAnimalInsightReport.scheduleMap;
        }
        if ((i & 2) != 0) {
            map2 = sleepAnimalInsightReport.awakeCountMap;
        }
        Map map6 = map2;
        if ((i & 4) != 0) {
            map3 = sleepAnimalInsightReport.napMap;
        }
        Map map7 = map3;
        if ((i & 8) != 0) {
            map4 = sleepAnimalInsightReport.stressMap;
        }
        Map map8 = map4;
        if ((i & 16) != 0) {
            map5 = sleepAnimalInsightReport.strengthMap;
        }
        return sleepAnimalInsightReport.copy(map, map6, map7, map8, map5);
    }

    @Nullable
    public final Map<Long, List<Pair<Long, Long>>> component1() {
        return this.scheduleMap;
    }

    @Nullable
    public final Map<Long, Integer> component2() {
        return this.awakeCountMap;
    }

    @Nullable
    public final Map<Long, Integer> component3() {
        return this.napMap;
    }

    @Nullable
    public final Map<Long, Integer> component4() {
        return this.stressMap;
    }

    @Nullable
    public final Map<Long, Integer> component5() {
        return this.strengthMap;
    }

    @NotNull
    public final SleepAnimalInsightReport copy(@Nullable Map<Long, ? extends List<Pair<Long, Long>>> scheduleMap, @Nullable Map<Long, Integer> awakeCountMap, @Nullable Map<Long, Integer> napMap, @Nullable Map<Long, Integer> stressMap, @Nullable Map<Long, Integer> strengthMap) {
        return new SleepAnimalInsightReport(scheduleMap, awakeCountMap, napMap, stressMap, strengthMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAnimalInsightReport)) {
            return false;
        }
        SleepAnimalInsightReport sleepAnimalInsightReport = (SleepAnimalInsightReport) other;
        return Intrinsics.areEqual(this.scheduleMap, sleepAnimalInsightReport.scheduleMap) && Intrinsics.areEqual(this.awakeCountMap, sleepAnimalInsightReport.awakeCountMap) && Intrinsics.areEqual(this.napMap, sleepAnimalInsightReport.napMap) && Intrinsics.areEqual(this.stressMap, sleepAnimalInsightReport.stressMap) && Intrinsics.areEqual(this.strengthMap, sleepAnimalInsightReport.strengthMap);
    }

    @Nullable
    public final Map<Long, Integer> getAwakeCountMap() {
        return this.awakeCountMap;
    }

    @Nullable
    public final Map<Long, Integer> getNapMap() {
        return this.napMap;
    }

    @Nullable
    public final Map<Long, List<Pair<Long, Long>>> getScheduleMap() {
        return this.scheduleMap;
    }

    @Nullable
    public final Map<Long, Integer> getStrengthMap() {
        return this.strengthMap;
    }

    @Nullable
    public final Map<Long, Integer> getStressMap() {
        return this.stressMap;
    }

    public int hashCode() {
        Map<Long, ? extends List<Pair<Long, Long>>> map = this.scheduleMap;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<Long, Integer> map2 = this.awakeCountMap;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<Long, Integer> map3 = this.napMap;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<Long, Integer> map4 = this.stressMap;
        int iHashCode4 = (iHashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map<Long, Integer> map5 = this.strengthMap;
        return iHashCode4 + (map5 != null ? map5.hashCode() : 0);
    }

    public final void setAwakeCountMap(@Nullable Map<Long, Integer> map) {
        this.awakeCountMap = map;
    }

    public final void setNapMap(@Nullable Map<Long, Integer> map) {
        this.napMap = map;
    }

    public final void setScheduleMap(@Nullable Map<Long, ? extends List<Pair<Long, Long>>> map) {
        this.scheduleMap = map;
    }

    public final void setStrengthMap(@Nullable Map<Long, Integer> map) {
        this.strengthMap = map;
    }

    public final void setStressMap(@Nullable Map<Long, Integer> map) {
        this.stressMap = map;
    }

    @NotNull
    public String toString() {
        return "SleepAnimalInsightReport(scheduleMap=" + this.scheduleMap + ", awakeCountMap=" + this.awakeCountMap + ", napMap=" + this.napMap + ", stressMap=" + this.stressMap + ", strengthMap=" + this.strengthMap + ")";
    }

    public SleepAnimalInsightReport(@Nullable Map<Long, ? extends List<Pair<Long, Long>>> map, @Nullable Map<Long, Integer> map2, @Nullable Map<Long, Integer> map3, @Nullable Map<Long, Integer> map4, @Nullable Map<Long, Integer> map5) {
        this.scheduleMap = map;
        this.awakeCountMap = map2;
        this.napMap = map3;
        this.stressMap = map4;
        this.strengthMap = map5;
    }

    public /* synthetic */ SleepAnimalInsightReport(Map map, Map map2, Map map3, Map map4, Map map5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4, (i & 16) != 0 ? null : map5);
    }
}
