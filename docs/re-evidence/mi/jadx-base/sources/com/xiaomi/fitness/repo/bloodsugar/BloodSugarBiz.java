package com.xiaomi.fitness.repo.bloodsugar;

import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.utils.BloodSugarComputeUtil;
import com.xiaomi.fit.fitness.export.utils.BloodSugarTargetRange;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.repo.BaseProcessBiz;
import com.xiaomi.fitness.repo.bloodsugar.utils.BloodSugarAggregateUtil;
import com.xiaomi.fitness.repo.bloodsugar.utils.StatisticProcessData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J<\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016J\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0013\u001a\u00020\nH\u0002J&\u0010\u0014\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/BloodSugarBiz;", "Lcom/xiaomi/fitness/repo/BaseProcessBiz;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "<init>", "()V", "splitDailyReport", "sid", "", CloudContract.COL_VIEW_TAG, "timestamp", "", "itemMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "aggregateFingerBloodSugar", "Lcom/xiaomi/fitness/repo/bloodsugar/FingerAggregateResult;", "list", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "startTime", "aggregateContinuousBloodSugar", "Lcom/xiaomi/fitness/repo/bloodsugar/ContinuousAggregateResult;", "count", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodSugarBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarBiz.kt\ncom/xiaomi/fitness/repo/bloodsugar/BloodSugarBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,148:1\n1863#2,2:149\n1863#2,2:153\n1062#2:156\n216#3,2:151\n216#3:155\n217#3:157\n*S KotlinDebug\n*F\n+ 1 BloodSugarBiz.kt\ncom/xiaomi/fitness/repo/bloodsugar/BloodSugarBiz\n*L\n71#1:149,2\n95#1:153,2\n120#1:156\n87#1:151,2\n118#1:155\n118#1:157\n*E\n"})
public final class BloodSugarBiz extends BaseProcessBiz<DailyBloodSugarReport> {
    private final ContinuousAggregateResult aggregateContinuousBloodSugar(List<BloodSugarItem> list, long startTime, int count) {
        Map mapGroupDataByGap$default = BaseProcessBiz.groupDataByGap$default(this, startTime, 300L, list, null, 8, null);
        BloodSugarTargetRange bloodSugarTargetRange = BloodSugarComputeUtil.INSTANCE.getBloodSugarTargetRange();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StatisticProcessData statisticProcessData = new StatisticProcessData(startTime);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        BloodSugarItem bloodSugarItem = null;
        for (Map.Entry entry : mapGroupDataByGap$default.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                BloodSugarItem bloodSugarItem2 = (BloodSugarItem) CollectionsKt___CollectionsKt.sortedWith((Iterable) entry.getValue(), new Comparator() { // from class: com.xiaomi.fitness.repo.bloodsugar.BloodSugarBiz$aggregateContinuousBloodSugar$lambda$7$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((BloodSugarItem) t2).getTime()), Long.valueOf(((BloodSugarItem) t).getTime()));
                    }
                }).get(0);
                if (bloodSugarItem == null || bloodSugarItem.getTime() < bloodSugarItem2.getTime()) {
                    bloodSugarItem = bloodSugarItem2;
                }
                int targetLevel = bloodSugarItem2.getTargetLevel(bloodSugarTargetRange);
                Integer numValueOf = Integer.valueOf(targetLevel);
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(targetLevel));
                linkedHashMap.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                statisticProcessData.refresh(bloodSugarItem2);
                linkedHashMap2.put(entry.getKey(), bloodSugarItem2);
            }
        }
        return new ContinuousAggregateResult(bloodSugarItem, linkedHashMap2, linkedHashMap, statisticProcessData.toResult(bloodSugarTargetRange));
    }

    private final FingerAggregateResult aggregateFingerBloodSugar(List<BloodSugarItem> list, long startTime) {
        List<BloodSugarItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return new FingerAggregateResult(null, null, null, null, 15, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (BloodSugarItem bloodSugarItem : list) {
            Integer measurePeriod = bloodSugarItem.getMeasurePeriod();
            if (measurePeriod != null) {
                if (measurePeriod.intValue() == 9) {
                    arrayList.add(bloodSugarItem);
                } else {
                    BloodSugarItem bloodSugarItem2 = (BloodSugarItem) linkedHashMap.get(measurePeriod);
                    if ((bloodSugarItem2 != null ? bloodSugarItem2.getTime() : 0L) < bloodSugarItem.getTime()) {
                        linkedHashMap.put(measurePeriod, bloodSugarItem);
                    }
                }
            }
        }
        BloodSugarTargetRange bloodSugarTargetRange = BloodSugarComputeUtil.INSTANCE.getBloodSugarTargetRange();
        ArrayList<BloodSugarItem> arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(((Map.Entry) it.next()).getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        StatisticProcessData statisticProcessData = new StatisticProcessData(startTime);
        Map mapGroupDataByGap$default = BaseProcessBiz.groupDataByGap$default(this, startTime, 300L, arrayList2, null, 8, null);
        BloodSugarItem bloodSugarItem3 = null;
        for (BloodSugarItem bloodSugarItem4 : arrayList2) {
            int targetLevel = bloodSugarItem4.getTargetLevel(bloodSugarTargetRange);
            if (bloodSugarItem3 == null || bloodSugarItem3.getTime() < bloodSugarItem4.getTime()) {
                bloodSugarItem3 = bloodSugarItem4;
            }
            Integer numValueOf = Integer.valueOf(targetLevel);
            Integer num = (Integer) linkedHashMap2.get(Integer.valueOf(targetLevel));
            linkedHashMap2.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            statisticProcessData.refresh(bloodSugarItem4);
        }
        return new FingerAggregateResult(bloodSugarItem3, mapGroupDataByGap$default, linkedHashMap2, statisticProcessData.toResult(bloodSugarTargetRange));
    }

    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    public /* bridge */ /* synthetic */ DailyBloodSugarReport splitDailyReport(String str, String str2, long j, Map map) {
        return splitDailyReport(str, str2, j, (Map<String, ? extends List<? extends DailyRecordItem>>) map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.repo.BaseProcessBiz
    @NotNull
    public DailyBloodSugarReport splitDailyReport(@Nullable String sid, @NotNull String viewTag, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        Intrinsics.checkNotNullParameter(viewTag, "viewTag");
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        if (itemMap.isEmpty()) {
            return new DailyBloodSugarReport(timestamp, viewTag);
        }
        List<BloodSugarItem> list = (List) itemMap.get("blood_sugar");
        List<BloodSugarItem> list2 = (List) itemMap.get(FitnessPersistKey.ManualBloodSugar);
        DailyBloodSugarReport dailyBloodSugarReport = new DailyBloodSugarReport(timestamp, viewTag);
        if (Intrinsics.areEqual(viewTag, "home")) {
            List<BloodSugarItem> list3 = list;
            if (list3 == null || list3.isEmpty()) {
                List<BloodSugarItem> list4 = list2;
                dailyBloodSugarReport.setLatestFingerItem((list4 == null || list4.isEmpty()) ? null : list2.get(0));
            } else {
                ContinuousAggregateResult continuousAggregateResultAggregateContinuousBloodSugar = aggregateContinuousBloodSugar(list, (list.get(0).getTime() - (list.get(0).getTime() % ((long) 300))) - ((long) 10500), 36);
                dailyBloodSugarReport.setBloodSugarMap(continuousAggregateResultAggregateContinuousBloodSugar.getResultMap());
                dailyBloodSugarReport.setLatestItem(continuousAggregateResultAggregateContinuousBloodSugar.getLatestRecord());
                BloodSugarAggregateUtil.INSTANCE.computeTheLatestItemItemTrend(dailyBloodSugarReport);
            }
        } else if (Intrinsics.areEqual(viewTag, "days")) {
            if (list != null && (!list.isEmpty())) {
                ContinuousAggregateResult continuousAggregateResultAggregateContinuousBloodSugar2 = aggregateContinuousBloodSugar(list, timestamp, 288);
                dailyBloodSugarReport.setBloodSugarMap(continuousAggregateResultAggregateContinuousBloodSugar2.getResultMap());
                dailyBloodSugarReport.setLatestItem(continuousAggregateResultAggregateContinuousBloodSugar2.getLatestRecord());
                dailyBloodSugarReport.setTargetDistMap(continuousAggregateResultAggregateContinuousBloodSugar2.getTargetLevelMap());
                dailyBloodSugarReport.setStatisticBloodSugar(continuousAggregateResultAggregateContinuousBloodSugar2.getStatisticBS());
            }
            if (list2 != null && (!list2.isEmpty())) {
                FingerAggregateResult fingerAggregateResultAggregateFingerBloodSugar = aggregateFingerBloodSugar(list2, timestamp);
                dailyBloodSugarReport.setLatestFingerItem(fingerAggregateResultAggregateFingerBloodSugar.getLatestRecord());
                dailyBloodSugarReport.setFingerBSMap(fingerAggregateResultAggregateFingerBloodSugar.getResultMap());
                dailyBloodSugarReport.setTargetDistFingerMap(fingerAggregateResultAggregateFingerBloodSugar.getTargetLevelMap());
                dailyBloodSugarReport.setStatisticFingerBS(fingerAggregateResultAggregateFingerBloodSugar.getStatisticBS());
            }
        }
        return dailyBloodSugarReport;
    }
}
