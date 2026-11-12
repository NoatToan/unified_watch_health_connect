package com.xiaomi.fitness.repo.bloodsugar.utils;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.PostMealBSDiff;
import com.xiaomi.fit.fitness.export.data.aggregation.StatisticBloodSugar;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarMeasurePeriod;
import com.xiaomi.fit.fitness.export.data.extentions.BloodSugarItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.utils.BloodSugarComputeUtil;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import defpackage.xr5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u0005J\u001c\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\u0005J/\u0010\n\u001a\u0013\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0005J<\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0017\u0010 \u001a\u0013\u0012\t\u0012\u00070\f¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u000b2\b\b\u0001\u0010#\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\fH\u0002¢\u0006\u0002\u0010%J)\u0010&\u001a\u0015\u0012\t\u0012\u00070\f¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0002¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/utils/BloodSugarAggregateUtil;", "", "<init>", "()V", "aggregateWeekContinuousBloodSugar", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "dayReportList", "", "weekReport", "aggregateWeekFingerBloodSugar", "computeWeekDistMap", "", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarLevel;", "reportList", "isContinuousBloodSugar", "", "computeWeekStatisticBloodSugar", "Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "timestamp", "", "computeTheLatestItemItemTrend", "", "report", "computeDayBloodSugarTrend", "dailyReport", "preDailyReport", "computeDayFingerBSDifference", "Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;", "dayReport", "computePostMealDiff", "", "map", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarMeasurePeriod;", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "beforePeriod", "afterPeriod", "(Ljava/util/Map;II)Ljava/lang/Float;", "computeWeekAvgFingerBSByPeriod", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodSugarAggregateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarAggregateUtil.kt\ncom/xiaomi/fitness/repo/bloodsugar/utils/BloodSugarAggregateUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,222:1\n1863#2,2:223\n1863#2,2:225\n1863#2:227\n1864#2:230\n1863#2,2:231\n1863#2,2:236\n1863#2:239\n1863#2,2:241\n1864#2:244\n1863#2,2:246\n216#3,2:228\n216#3,2:233\n216#3:235\n217#3:238\n216#3:240\n217#3:243\n216#3:245\n217#3:248\n*S KotlinDebug\n*F\n+ 1 BloodSugarAggregateUtil.kt\ncom/xiaomi/fitness/repo/bloodsugar/utils/BloodSugarAggregateUtil\n*L\n22#1:223,2\n44#1:225,2\n66#1:227\n66#1:230\n79#1:231,2\n125#1:236,2\n156#1:239\n158#1:241,2\n156#1:244\n171#1:246,2\n68#1:228,2\n108#1:233,2\n124#1:235\n124#1:238\n157#1:240\n157#1:243\n168#1:245\n168#1:248\n*E\n"})
public final class BloodSugarAggregateUtil {

    @NotNull
    public static final BloodSugarAggregateUtil INSTANCE = new BloodSugarAggregateUtil();

    private BloodSugarAggregateUtil() {
    }

    private final Float computePostMealDiff(Map<Integer, BloodSugarItem> map, @BloodSugarMeasurePeriod int beforePeriod, @BloodSugarMeasurePeriod int afterPeriod) {
        if (!map.containsKey(Integer.valueOf(beforePeriod)) || !map.containsKey(Integer.valueOf(afterPeriod))) {
            return null;
        }
        BloodSugarItem bloodSugarItem = map.get(Integer.valueOf(afterPeriod));
        Intrinsics.checkNotNull(bloodSugarItem);
        BloodSugarItem bloodSugarItem2 = map.get(Integer.valueOf(beforePeriod));
        Intrinsics.checkNotNull(bloodSugarItem2);
        return Float.valueOf(BloodSugarItemExtKt.diff(bloodSugarItem, bloodSugarItem2));
    }

    private final Map<Integer, Float> computeWeekAvgFingerBSByPeriod(List<DailyBloodSugarReport> reportList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = reportList.iterator();
        while (it.hasNext()) {
            Map<Long, List<BloodSugarItem>> fingerBSMap = ((DailyBloodSugarReport) it.next()).getFingerBSMap();
            if (fingerBSMap != null) {
                Iterator<Map.Entry<Long, List<BloodSugarItem>>> it2 = fingerBSMap.entrySet().iterator();
                while (it2.hasNext()) {
                    for (BloodSugarItem bloodSugarItem : it2.next().getValue()) {
                        Integer measurePeriod = bloodSugarItem.getMeasurePeriod();
                        Intrinsics.checkNotNull(measurePeriod);
                        measurePeriod.intValue();
                        List arrayList = (List) linkedHashMap.get(measurePeriod);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ListExtKt.add(arrayList, bloodSugarItem);
                        linkedHashMap.put(measurePeriod, arrayList);
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Collection collection = (Collection) entry.getValue();
            if (collection != null && !collection.isEmpty()) {
                Iterator it3 = ((Iterable) entry.getValue()).iterator();
                float fBloodSugar = 0.0f;
                while (it3.hasNext()) {
                    fBloodSugar += ((BloodSugarItem) it3.next()).bloodSugar();
                }
                linkedHashMap2.put(entry.getKey(), Float.valueOf(xr5.e(1, fBloodSugar / ((List) entry.getValue()).size())));
            }
        }
        if (linkedHashMap2.isEmpty()) {
            return null;
        }
        return linkedHashMap2;
    }

    private final Map<Integer, Integer> computeWeekDistMap(List<DailyBloodSugarReport> reportList, boolean isContinuousBloodSugar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyBloodSugarReport dailyBloodSugarReport : reportList) {
            Map<Integer, Integer> targetDistMap = isContinuousBloodSugar ? dailyBloodSugarReport.getTargetDistMap() : dailyBloodSugarReport.getTargetDistFingerMap();
            if (targetDistMap != null) {
                for (Map.Entry<Integer, Integer> entry : targetDistMap.entrySet()) {
                    Integer key = entry.getKey();
                    Integer num = (Integer) linkedHashMap.get(entry.getKey());
                    linkedHashMap.put(key, Integer.valueOf((num != null ? num.intValue() : 0) + entry.getValue().intValue()));
                }
            }
        }
        return linkedHashMap;
    }

    private final StatisticBloodSugar computeWeekStatisticBloodSugar(List<DailyBloodSugarReport> reportList, long timestamp, boolean isContinuousBloodSugar) {
        StatisticProcessData statisticProcessData = new StatisticProcessData(timestamp);
        for (DailyBloodSugarReport dailyBloodSugarReport : reportList) {
            statisticProcessData.refresh(isContinuousBloodSugar ? dailyBloodSugarReport.getStatisticBloodSugar() : dailyBloodSugarReport.getStatisticFingerBS());
        }
        return statisticProcessData.toResult(BloodSugarComputeUtil.INSTANCE.getBloodSugarTargetRange());
    }

    @NotNull
    public final DailyBloodSugarReport aggregateWeekContinuousBloodSugar(@NotNull List<DailyBloodSugarReport> dayReportList, @NotNull DailyBloodSugarReport weekReport) {
        Intrinsics.checkNotNullParameter(dayReportList, "dayReportList");
        Intrinsics.checkNotNullParameter(weekReport, "weekReport");
        long time = weekReport.getTime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyBloodSugarReport dailyBloodSugarReport : dayReportList) {
            Map<Long, BloodSugarItem> bloodSugarMap = dailyBloodSugarReport.getBloodSugarMap();
            if (bloodSugarMap != null) {
                linkedHashMap.putAll(bloodSugarMap);
            }
            if (weekReport.getLatestItem() != null) {
                BloodSugarItem latestItem = weekReport.getLatestItem();
                Intrinsics.checkNotNull(latestItem);
                long time2 = latestItem.getTime();
                BloodSugarItem latestItem2 = dailyBloodSugarReport.getLatestItem();
                if (time2 < (latestItem2 != null ? latestItem2.getTime() : 0L)) {
                }
            }
            weekReport.setLatestItem(dailyBloodSugarReport.getLatestItem());
        }
        weekReport.setBloodSugarMap(linkedHashMap);
        weekReport.setStatisticBloodSugar(computeWeekStatisticBloodSugar(dayReportList, time, true));
        weekReport.setTargetDistMap(computeWeekDistMap(dayReportList, true));
        return weekReport;
    }

    @NotNull
    public final DailyBloodSugarReport aggregateWeekFingerBloodSugar(@NotNull List<DailyBloodSugarReport> dayReportList, @NotNull DailyBloodSugarReport weekReport) {
        Intrinsics.checkNotNullParameter(dayReportList, "dayReportList");
        Intrinsics.checkNotNullParameter(weekReport, "weekReport");
        long time = weekReport.getTime();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyBloodSugarReport dailyBloodSugarReport : dayReportList) {
            Map<Long, List<BloodSugarItem>> fingerBSMap = dailyBloodSugarReport.getFingerBSMap();
            if (fingerBSMap != null) {
                linkedHashMap.putAll(fingerBSMap);
            }
            if (weekReport.getLatestFingerItem() != null) {
                BloodSugarItem latestFingerItem = weekReport.getLatestFingerItem();
                Intrinsics.checkNotNull(latestFingerItem);
                long time2 = latestFingerItem.getTime();
                BloodSugarItem latestFingerItem2 = dailyBloodSugarReport.getLatestFingerItem();
                if (time2 < (latestFingerItem2 != null ? latestFingerItem2.getTime() : 0L)) {
                }
            }
            weekReport.setLatestFingerItem(dailyBloodSugarReport.getLatestFingerItem());
        }
        weekReport.setFingerBSMap(linkedHashMap);
        weekReport.setStatisticFingerBS(computeWeekStatisticBloodSugar(dayReportList, time, false));
        weekReport.setTargetDistFingerMap(computeWeekDistMap(dayReportList, false));
        weekReport.setAvgFingerBSByPeriod(computeWeekAvgFingerBSByPeriod(dayReportList));
        return weekReport;
    }

    public final void computeDayBloodSugarTrend(@NotNull DailyBloodSugarReport dailyReport, @NotNull DailyBloodSugarReport preDailyReport) {
        Intrinsics.checkNotNullParameter(dailyReport, "dailyReport");
        Intrinsics.checkNotNullParameter(preDailyReport, "preDailyReport");
        Map<Long, BloodSugarItem> bloodSugarMap = preDailyReport.getBloodSugarMap();
        Map<Long, BloodSugarItem> bloodSugarMap2 = dailyReport.getBloodSugarMap();
        if (bloodSugarMap2 != null) {
            for (Map.Entry<Long, BloodSugarItem> entry : bloodSugarMap2.entrySet()) {
                long jLongValue = entry.getKey().longValue() - ((long) 300);
                BloodSugarItem bloodSugarItem = bloodSugarMap2.get(Long.valueOf(jLongValue));
                if (bloodSugarItem == null) {
                    bloodSugarItem = bloodSugarMap != null ? bloodSugarMap.get(Long.valueOf(jLongValue)) : null;
                }
                if (bloodSugarItem != null) {
                    entry.getValue().setTrend(BloodSugarItemExtKt.computeTrend(entry.getValue(), bloodSugarItem));
                } else {
                    entry.getValue().setTrend(0);
                }
            }
        }
    }

    @Nullable
    public final PostMealBSDiff computeDayFingerBSDifference(@NotNull DailyBloodSugarReport dayReport) {
        Intrinsics.checkNotNullParameter(dayReport, "dayReport");
        Map<Long, List<BloodSugarItem>> fingerBSMap = dayReport.getFingerBSMap();
        if (fingerBSMap == null || fingerBSMap.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<Long, List<BloodSugarItem>> fingerBSMap2 = dayReport.getFingerBSMap();
        Intrinsics.checkNotNull(fingerBSMap2);
        Iterator<Map.Entry<Long, List<BloodSugarItem>>> it = fingerBSMap2.entrySet().iterator();
        while (it.hasNext()) {
            for (BloodSugarItem bloodSugarItem : it.next().getValue()) {
                Integer measurePeriod = bloodSugarItem.getMeasurePeriod();
                Intrinsics.checkNotNull(measurePeriod);
                linkedHashMap.put(measurePeriod, bloodSugarItem);
            }
        }
        PostMealBSDiff postMealBSDiff = new PostMealBSDiff(null, null, null, 7, null);
        postMealBSDiff.setBreakfast(computePostMealDiff(linkedHashMap, 2, 3));
        postMealBSDiff.setLunch(computePostMealDiff(linkedHashMap, 4, 5));
        postMealBSDiff.setDinner(computePostMealDiff(linkedHashMap, 6, 7));
        dayReport.setFingerBSDiff(postMealBSDiff.isEmpty() ? null : postMealBSDiff);
        return dayReport.getFingerBSDiff();
    }

    public final void computeTheLatestItemItemTrend(@NotNull DailyBloodSugarReport report) {
        BloodSugarItem latestItem;
        Map<Long, BloodSugarItem> bloodSugarMap;
        Intrinsics.checkNotNullParameter(report, "report");
        if (report.getBloodSugarMap() == null || (latestItem = report.getLatestItem()) == null || (bloodSugarMap = report.getBloodSugarMap()) == null) {
            return;
        }
        long j = 300;
        BloodSugarItem bloodSugarItem = bloodSugarMap.get(Long.valueOf(((((latestItem.getTime() - report.getTime()) / j) * j) + report.getTime()) - j));
        if (bloodSugarItem != null) {
            latestItem.setTrend(BloodSugarItemExtKt.computeTrend(latestItem, bloodSugarItem));
        } else {
            latestItem.setTrend(0);
        }
    }
}
