package com.xiaomi.fitness.repo.step;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.cloud.CloudStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.item.ActiveStageItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.StepItem;
import com.xiaomi.fit.fitness.persist.server.data.RelativeDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.BigValueDistinct;
import com.xiaomi.fitness.repo.IDistinctListener;
import com.xiaomi.fitness.repo.RepoUtils;
import com.xiaomi.fitness.repo.RepositoryManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J<\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/step/StepBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "<init>", "()V", "stepItemDistinct", "Lcom/xiaomi/fitness/repo/BigValueDistinct;", "Lcom/xiaomi/fit/fitness/export/data/item/StepItem;", "convertServerAggregateReport", "time", "", CloudContract.COL_VIEW_TAG, "", "dataModel", "Lcom/xiaomi/fit/fitness/persist/server/data/RelativeDataModel;", "splitDailyReport", "sid", "timestamp", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepBiz.kt\ncom/xiaomi/fitness/repo/step/StepBiz\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n216#2,2:159\n216#2,2:161\n1010#3,2:163\n*S KotlinDebug\n*F\n+ 1 StepBiz.kt\ncom/xiaomi/fitness/repo/step/StepBiz\n*L\n52#1:159,2\n117#1:161,2\n134#1:163,2\n*E\n"})
public final class StepBiz extends BaseProcessBiz<DailyStepReport> {

    @NotNull
    private final BigValueDistinct<StepItem> stepItemDistinct = new BigValueDistinct<>();

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyStepReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyStepReport convertServerAggregateReport(long time, @NotNull String viewTag, @Nullable RelativeDataModel dataModel) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        if (dataModel == null) {
            return new DailyStepReport(time, viewTag);
        }
        CloudStepReport cloudStepReport = (CloudStepReport) FitnessPersistUtils.INSTANCE.fromJson(dataModel.getValue(), CloudStepReport.class);
        return cloudStepReport == null ? new DailyStepReport(time, viewTag) : new DailyStepReport(time, viewTag, cloudStepReport.getSteps(), cloudStepReport.getDistance(), cloudStepReport.getCalories(), CollectionsKt__CollectionsKt.emptyList());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:53:0x01a8 A[PHI: r0
      0x01a8: PHI (r0v27 java.lang.String) = 
      (r0v11 java.lang.String)
      (r0v12 java.lang.String)
      (r0v15 java.lang.String)
      (r0v22 java.lang.String)
      (r0v28 java.lang.String)
     binds: [B:52:0x01a6, B:48:0x0194, B:94:?, B:93:?, B:38:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyStepReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        String str;
        int i;
        String str2;
        Map mapGroupByHalfHour;
        int calories;
        int i2;
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyStepReport(timestamp, viewTag);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<String, ? extends List<? extends DailyRecordItem>>> it = itemMap.entrySet().iterator();
        while (true) {
            str = "days";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ? extends List<? extends DailyRecordItem>> next = it.next();
            String key = next.getKey();
            if (Intrinsics.areEqual(key, "steps")) {
                List<? extends DailyRecordItem> value = next.getValue();
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.StepItem>");
                arrayList.addAll(value);
            } else if (Intrinsics.areEqual(key, FitnessPersistKey.ActiveStage) && Intrinsics.areEqual(viewTag, "days")) {
                List<? extends DailyRecordItem> value2 = next.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.ActiveStageItem>");
                arrayList2.addAll(value2);
            }
        }
        Iterator it2 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        long jCoerceAtLeast = Long.MIN_VALUE;
        long jCoerceAtMost = Long.MAX_VALUE;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            StepItem stepItem = (StepItem) next2;
            jCoerceAtMost = RangesKt___RangesKt.coerceAtMost(jCoerceAtMost, stepItem.getTime());
            jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(jCoerceAtLeast, stepItem.getTime());
            str = str;
        }
        String str3 = str;
        Map<String, List<DailyRecordItem>> mapGroupedBySid = RepoUtils.INSTANCE.groupedBySid(arrayList);
        if (!mapGroupedBySid.isEmpty()) {
            arrayList.clear();
        }
        Iterator<Map.Entry<String, List<DailyRecordItem>>> it3 = mapGroupedBySid.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it3.hasNext()) {
                break;
            }
            List<DailyRecordItem> value3 = it3.next().getValue();
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.StepItem>");
            long j = jCoerceAtLeast;
            long j2 = jCoerceAtMost;
            for (Map.Entry entry : groupDataByGap(timestamp, RepositoryManager.GAP_X_MINUTE, value3, new IDistinctListener<StepItem>() { // from class: com.xiaomi.fitness.repo.step.StepBiz$splitDailyReport$gapedItemMap$1
                @Override // com.xiaomi.fitness.repo.IDistinctListener
                public void distinct(Map<Long, StepItem> map, StepItem t) {
                    Intrinsics.checkNotNullParameter(map, "map");
                    if (t != null) {
                        long timestamp2 = t.getTimestamp();
                        StepItem stepItem2 = map.get(Long.valueOf(timestamp2));
                        if (stepItem2 != null) {
                            stepItem2.add(t);
                        } else {
                            map.put(Long.valueOf(timestamp2), t);
                        }
                    }
                }
            }).entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                float calories2 = 0.0f;
                int steps = 0;
                int distance = 0;
                for (StepItem stepItem2 : (List) entry.getValue()) {
                    steps += stepItem2.getSteps();
                    distance += stepItem2.getDistance();
                    calories2 += stepItem2.getCalories();
                }
                arrayList.add(new StepItem(jLongValue, steps, distance, calories2));
            }
            jCoerceAtMost = j2;
            jCoerceAtLeast = j;
        }
        long j3 = jCoerceAtLeast;
        long j4 = jCoerceAtMost;
        switch (viewTag.hashCode()) {
            case -1068487181:
                str2 = str3;
                if (viewTag.equals("months")) {
                    mapGroupByHalfHour = groupByDay(timestamp, arrayList, this.stepItemDistinct);
                } else {
                    mapGroupByHalfHour = null;
                }
                break;
            case 3076183:
                str2 = str3;
                if (viewTag.equals(str2)) {
                    mapGroupByHalfHour = groupByHalfHour(timestamp, arrayList, this.stepItemDistinct);
                } else {
                    mapGroupByHalfHour = null;
                }
                break;
            case 3208415:
                if (viewTag.equals("home")) {
                    mapGroupByHalfHour = groupByHour(timestamp, arrayList, this.stepItemDistinct);
                    str2 = str3;
                } else {
                    str2 = str3;
                    mapGroupByHalfHour = null;
                }
                break;
            case 113008383:
                if (viewTag.equals("weeks")) {
                    str2 = str3;
                    mapGroupByHalfHour = groupByDay(timestamp, arrayList, this.stepItemDistinct);
                } else {
                    str2 = str3;
                    mapGroupByHalfHour = null;
                }
                break;
            default:
                str2 = str3;
                mapGroupByHalfHour = null;
                break;
        }
        ArrayList arrayList3 = new ArrayList();
        if (mapGroupByHalfHour != null) {
            int steps2 = 0;
            int distance2 = 0;
            calories = 0;
            for (Map.Entry entry2 : mapGroupByHalfHour.entrySet()) {
                float calories3 = 0.0f;
                int steps3 = 0;
                int distance3 = 0;
                for (StepItem stepItem3 : (List) entry2.getValue()) {
                    steps3 += stepItem3.getSteps();
                    distance3 += stepItem3.getDistance();
                    calories3 += stepItem3.getCalories();
                }
                StepRecord stepRecord = new StepRecord(((Number) entry2.getKey()).longValue(), steps3, distance3, MathKt__MathJVMKt.roundToInt(calories3));
                arrayList3.add(stepRecord);
                steps2 += stepRecord.getSteps();
                distance2 += stepRecord.getDistance();
                calories += stepRecord.getCalories();
            }
            i2 = steps2;
            i = distance2;
        } else {
            calories = 0;
            i2 = 0;
        }
        if (arrayList3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList3, new Comparator() { // from class: com.xiaomi.fitness.repo.step.StepBiz$splitDailyReport$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StepRecord) t).getTime()), Long.valueOf(((StepRecord) t2).getTime()));
                }
            });
        }
        DailyStepReport dailyStepReport = new DailyStepReport(timestamp, viewTag, i2, i, calories, arrayList3);
        if (!arrayList3.isEmpty()) {
            dailyStepReport.setMinStartTime(Long.valueOf(j4));
            dailyStepReport.setMaxEndTime(Long.valueOf(j3));
        }
        if (Intrinsics.areEqual(viewTag, str2)) {
            Collections.sort(arrayList2, new Comparator<ActiveStageItem>() { // from class: com.xiaomi.fitness.repo.step.StepBiz.splitDailyReport.4
                @Override // java.util.Comparator
                public int compare(ActiveStageItem a2, ActiveStageItem b2) {
                    Intrinsics.checkNotNullParameter(a2, "a");
                    Intrinsics.checkNotNullParameter(b2, "b");
                    return Intrinsics.compare(b2.getEndTime(), a2.getEndTime());
                }
            });
            dailyStepReport.setActiveStageList(arrayList2);
        }
        return dailyStepReport;
    }
}
