package com.xiaomi.fitness.repo.bloodsugar.utils;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.aggregation.AGPItem;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarAnalyzeData;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import com.xiaomi.fit.fitness.export.data.aggregation.SleepBloodSugarData;
import com.xiaomi.fit.fitness.export.data.aggregation.SportBloodSugarData;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.extentions.BloodSugarItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.utils.BloodSugarComputeUtil;
import com.xiaomi.fitness.aggregation.health.dao.FitnessDailyReportDaoProxy;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.xr5;
import java.util.ArrayList;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bJ,\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00182\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002¢\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/repo/bloodsugar/utils/BloodSugarAnalyzer;", "", "<init>", "()V", "analyzeDaySleepBloodSugar", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "preReport", "analyzeDaySportBloodSugar", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "analyzeBloodSugarInSleepOrSport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarAnalyzeData;", "startTime", "", "endTime", "thisReport", "analyzeBloodSugarGMIAndAGP", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "reportList", "computeBloodSugarGMI", "", "(Ljava/util/List;)Ljava/lang/Float;", "computeBloodSugarAGP", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBloodSugarAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BloodSugarAnalyzer.kt\ncom/xiaomi/fitness/repo/bloodsugar/utils/BloodSugarAnalyzer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,208:1\n1863#2,2:209\n1863#2:211\n1864#2:213\n1863#2:214\n1864#2:217\n1863#2,2:218\n1863#2:220\n1864#2:223\n1#3:212\n216#4,2:215\n216#4,2:221\n216#4,2:224\n*S KotlinDebug\n*F\n+ 1 BloodSugarAnalyzer.kt\ncom/xiaomi/fitness/repo/bloodsugar/utils/BloodSugarAnalyzer\n*L\n25#1:209,2\n49#1:211\n49#1:213\n127#1:214\n127#1:217\n152#1:218,2\n157#1:220\n157#1:223\n128#1:215,2\n158#1:221,2\n167#1:224,2\n*E\n"})
public final class BloodSugarAnalyzer {

    @NotNull
    public static final BloodSugarAnalyzer INSTANCE = new BloodSugarAnalyzer();

    private BloodSugarAnalyzer() {
    }

    private final BloodSugarAnalyzeData analyzeBloodSugarInSleepOrSport(long startTime, long endTime, DailyBloodSugarReport thisReport, DailyBloodSugarReport preReport) {
        Map<Long, BloodSugarItem> bloodSugarMap;
        boolean z;
        Map<Long, BloodSugarItem> bloodSugarMap2 = thisReport.getBloodSugarMap();
        if (bloodSugarMap2 == null || bloodSugarMap2.isEmpty() || (bloodSugarMap = thisReport.getBloodSugarMap()) == null) {
            return null;
        }
        BloodSugarAnalyzeData bloodSugarAnalyzeData = new BloodSugarAnalyzeData(startTime, endTime, 0, 0, 0, 0.0f, null, 124, null);
        Map<Long, BloodSugarItem> bloodSugarMap3 = preReport != null ? preReport.getBloodSugarMap() : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        long j = startTime;
        BloodSugarItem bloodSugarItem = null;
        BloodSugarItem bloodSugarItem2 = null;
        int i = 0;
        while (j <= endTime) {
            Map<Long, BloodSugarItem> map = bloodSugarMap;
            long j2 = 300;
            long time = (j - thisReport.getTime()) / j2;
            if (j < thisReport.getTime()) {
                time--;
            }
            long time2 = thisReport.getTime() + (time * j2);
            BloodSugarItem bloodSugarItem3 = map.get(Long.valueOf(time2));
            if (bloodSugarItem3 == null) {
                bloodSugarItem3 = bloodSugarMap3 != null ? bloodSugarMap3.get(Long.valueOf(time2)) : null;
            }
            if (bloodSugarItem3 == null) {
                z = false;
            } else {
                if (bloodSugarItem == null) {
                    bloodSugarItem = bloodSugarItem3;
                }
                linkedHashMap2.put(Long.valueOf(j), bloodSugarItem3);
                int targetLevel$default = BloodSugarItem.getTargetLevel$default(bloodSugarItem3, null, 1, null);
                Integer numValueOf = Integer.valueOf(targetLevel$default);
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(targetLevel$default));
                linkedHashMap.put(numValueOf, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                if (targetLevel$default == 3) {
                    i++;
                    bloodSugarItem2 = bloodSugarItem3;
                    z = true;
                } else {
                    bloodSugarItem2 = bloodSugarItem3;
                    z = false;
                }
            }
            if (!z || j + j2 > endTime) {
                if (i >= 3) {
                    bloodSugarAnalyzeData.setLowBSCount(bloodSugarAnalyzeData.getLowBSCount() + 1);
                    bloodSugarAnalyzeData.setLowBSDurationInMin(bloodSugarAnalyzeData.getLowBSDurationInMin() + (i * 5));
                }
                i = 0;
            }
            j += j2;
            bloodSugarMap = map;
        }
        if (linkedHashMap.isEmpty() || linkedHashMap2.isEmpty()) {
            return null;
        }
        bloodSugarAnalyzeData.setNormalPercent(BloodSugarComputeUtil.INSTANCE.computeLevelDistPercent(linkedHashMap).getNormalPercent());
        bloodSugarAnalyzeData.setLowBSDurationInMin(bloodSugarAnalyzeData.getLowBSCount() > 0 ? bloodSugarAnalyzeData.getLowBSDurationInMin() / bloodSugarAnalyzeData.getLowBSCount() : 0);
        bloodSugarAnalyzeData.setDataMap(linkedHashMap2);
        bloodSugarAnalyzeData.setBsDiff((bloodSugarItem == null || bloodSugarItem2 == null) ? 0.0f : BloodSugarItemExtKt.diff(bloodSugarItem2, bloodSugarItem));
        return bloodSugarAnalyzeData;
    }

    private final Map<Integer, AGPItem> computeBloodSugarAGP(List<DailyBloodSugarReport> reportList) {
        List<DailyBloodSugarReport> list = reportList;
        Iterator<T> it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            Map<Long, BloodSugarItem> bloodSugarMap = ((DailyBloodSugarReport) it.next()).getBloodSugarMap();
            if (bloodSugarMap == null || bloodSugarMap.size() < 280) {
                i2 = 0;
            }
            i += i2;
        }
        if (i < 5) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (DailyBloodSugarReport dailyBloodSugarReport : list) {
            Map<Long, BloodSugarItem> bloodSugarMap2 = dailyBloodSugarReport.getBloodSugarMap();
            if (bloodSugarMap2 != null) {
                for (Map.Entry<Long, BloodSugarItem> entry : bloodSugarMap2.entrySet()) {
                    int iLongValue = ((((int) (entry.getKey().longValue() - dailyBloodSugarReport.getTime())) / 1800) + 1) / 2;
                    List arrayList = (List) linkedHashMap.get(Integer.valueOf(iLongValue));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Float.valueOf(entry.getValue().bloodSugar()));
                    linkedHashMap.put(Integer.valueOf(iLongValue), arrayList);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            AGPItem aGPItemComputeTheAGPOfOneTime = BloodSugarAnalyzerKt.computeTheAGPOfOneTime((List) entry2.getValue());
            if (aGPItemComputeTheAGPOfOneTime != null) {
                linkedHashMap2.put(entry2.getKey(), aGPItemComputeTheAGPOfOneTime);
            }
        }
        return linkedHashMap2;
    }

    private final Float computeBloodSugarGMI(List<DailyBloodSugarReport> reportList) {
        Iterator<T> it = reportList.iterator();
        float fBloodSugar = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            Map<Long, BloodSugarItem> bloodSugarMap = ((DailyBloodSugarReport) it.next()).getBloodSugarMap();
            if (bloodSugarMap != null) {
                Iterator<Map.Entry<Long, BloodSugarItem>> it2 = bloodSugarMap.entrySet().iterator();
                while (it2.hasNext()) {
                    fBloodSugar += it2.next().getValue().bloodSugar();
                    i++;
                }
            }
        }
        if (i < 2880) {
            return null;
        }
        return Float.valueOf((float) xr5.d(1, (((double) ((fBloodSugar / i) / 18)) * 0.02392d) + 3.31d).doubleValue());
    }

    @NotNull
    public final BloodSugarGMIAndAGPResult analyzeBloodSugarGMIAndAGP(long startTime, long endTime, @NotNull List<DailyBloodSugarReport> reportList) {
        Intrinsics.checkNotNullParameter(reportList, "reportList");
        return new BloodSugarGMIAndAGPResult(startTime, endTime, computeBloodSugarGMI(reportList), computeBloodSugarAGP(reportList));
    }

    @Nullable
    public final List<SleepBloodSugarData> analyzeDaySleepBloodSugar(@NotNull DailyBloodSugarReport report, @NotNull DailyBloodSugarReport preReport) {
        List<SleepSegmentReport> sleepSegments;
        BloodSugarAnalyzeData bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport;
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(preReport, "preReport");
        AllDaySleepReport allDaySleepReport = (AllDaySleepReport) FitnessDailyReportDaoProxy.INSTANCE.queryDailyReportEntitySync(HomeDataType.SLEEP, report.getTime());
        if (allDaySleepReport == null || (sleepSegments = allDaySleepReport.getSleepSegments()) == null || sleepSegments.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<SleepSegmentReport> sleepSegments2 = allDaySleepReport.getSleepSegments();
        Intrinsics.checkNotNull(sleepSegments2);
        for (SleepSegmentReport sleepSegmentReport : sleepSegments2) {
            if (sleepSegmentReport.hasStageData() && (bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport = INSTANCE.analyzeBloodSugarInSleepOrSport(sleepSegmentReport.getBedTime(), sleepSegmentReport.getWakeupTime(), report, preReport)) != null && bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport.getNormalPercent() < 100) {
                arrayList.add(new SleepBloodSugarData(sleepSegmentReport, bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Nullable
    public final List<SportBloodSugarData> analyzeDaySportBloodSugar(@NotNull FitnessDataGetter dbGetter, @NotNull DailyBloodSugarReport report) {
        BloodSugarAnalyzeData bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport;
        Intrinsics.checkNotNullParameter(dbGetter, "dbGetter");
        Intrinsics.checkNotNullParameter(report, "report");
        long time = report.getTime();
        List<SportBasicReport> sportReport = dbGetter.getSportReport(time, ((long) RepositoryManager.GAP_A_DAY) + time);
        if (sportReport.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (SportBasicReport sportBasicReport : sportReport) {
            if (sportBasicReport.getDuration() >= 900 && (bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport = INSTANCE.analyzeBloodSugarInSleepOrSport(sportBasicReport.getStartTime(), sportBasicReport.getEndTime(), report, null)) != null) {
                arrayList.add(new SportBloodSugarData(sportBasicReport, bloodSugarAnalyzeDataAnalyzeBloodSugarInSleepOrSport));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}
