package defpackage;

import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.RecentMonthRecordFromDB;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginachievement.report.bean.ReportDataBean;
import com.huawei.pluginachievement.report.bean.ReportFitnessData;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class oud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44789a;
    private Map<Long, RecentMonthRecordFromDB> d;

    public oud(boolean z, Map<Long, RecentMonthRecordFromDB> map) {
        this.f44789a = z;
        this.d = map;
    }

    public void e(ArrayList<AnnualReportFitnessRaw> arrayList, Map<Integer, List<HiHealthData>> map) {
        CountDownLatch countDownLatch = null;
        if (map != null) {
            if (map.containsKey(1004)) {
                countDownLatch = new CountDownLatch(1);
                ouj.d((Task<Void>) Tasks.callInBackground(d(map.get(1004), 2147483646)), countDownLatch);
            }
            for (Map.Entry<Integer, List<HiHealthData>> entry : map.entrySet()) {
                switch (entry.getKey().intValue()) {
                    case 1000:
                        b(entry.getValue());
                        break;
                    case 1001:
                        d(entry.getValue());
                        break;
                    case 1002:
                        c(2, entry.getValue());
                        break;
                    case 1003:
                        e(entry.getValue(), Integer.MAX_VALUE);
                        break;
                }
            }
        }
        if (arrayList != null) {
            c(arrayList);
        }
        if (countDownLatch != null) {
            ouj.d(countDownLatch, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS, "dealMonthSportTask");
        }
    }

    private Callable<Void> d(final List<HiHealthData> list, final int i) {
        return new Callable<Void>() { // from class: oud.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void call() {
                oud.this.e((List<HiHealthData>) list, i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, int i) {
        HiTrackMetaData hiTrackMetaDataA;
        long jE = pal.e(System.currentTimeMillis(), 1);
        for (int i2 = 0; i2 < list.size(); i2++) {
            HiHealthData hiHealthData = list.get(i2);
            if (hiHealthData.getStartTime() < jE && (hiTrackMetaDataA = ouj.a(hiHealthData)) != null) {
                ouj.a(i, c(hiHealthData.getStartTime()).mReportDataMap, hiTrackMetaDataA, hiHealthData.getStartTime(), hiHealthData.getEndTime());
            }
        }
    }

    private void d(List<HiHealthData> list) {
        long jE = pal.e(System.currentTimeMillis(), 1);
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getLong("start_time") < jE) {
                ouj.d(c(hiHealthData.getStartTime()).mReportDataMap, hiHealthData);
            }
        }
    }

    private void b(List<HiHealthData> list) {
        long jE = pal.e(System.currentTimeMillis(), 1);
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getLong("start_time") < jE) {
                RecentMonthRecordFromDB recentMonthRecordFromDBC = c(hiHealthData.getStartTime());
                long j = hiHealthData.getLong("Track_Duration_Sum");
                recentMonthRecordFromDBC.setSumAllTime(recentMonthRecordFromDBC.acquireSumAllTime() + j);
                recentMonthRecordFromDBC.setSumCalorie(recentMonthRecordFromDBC.acquireSumCalorie() + hiHealthData.getFloat("sport_calorie_sum"));
                recentMonthRecordFromDBC.setSumAllCount((recentMonthRecordFromDBC.acquireSumAllCount() + hiHealthData.getInt("Track_Count_Sum")) - hiHealthData.getInt("Track_Abnormal_Count_Sum"));
                if (hiHealthData.getInt("sport_calorie_sum") > 0) {
                    recentMonthRecordFromDBC.acquireSportDays().put(Long.valueOf(HiDateUtil.p(hiHealthData.getLong("start_time"))), 1);
                }
                recentMonthRecordFromDBC.setSumCalcCalorie(recentMonthRecordFromDBC.acquireSumCalcCalorie() + ouj.c(hiHealthData));
                d(hiHealthData.getLong("start_time"), hiHealthData.getFloat("sport_calorie_sum"), j, recentMonthRecordFromDBC);
                ouj.b(recentMonthRecordFromDBC.mReportDataMap, hiHealthData);
            }
        }
    }

    private void c(ArrayList<AnnualReportFitnessRaw> arrayList) {
        long jE = pal.e(System.currentTimeMillis(), 1);
        for (int i = 0; i < arrayList.size(); i++) {
            AnnualReportFitnessRaw annualReportFitnessRaw = arrayList.get(i);
            if (annualReportFitnessRaw.acquireExerciseTime() < jE) {
                RecentMonthRecordFromDB recentMonthRecordFromDBC = c(annualReportFitnessRaw.acquireExerciseTime());
                ReportDataBean reportDataBeanA = ouj.a(recentMonthRecordFromDBC.mReportDataMap, 10001);
                if (reportDataBeanA instanceof ReportFitnessData) {
                    ReportFitnessData reportFitnessData = (ReportFitnessData) reportDataBeanA;
                    String str = annualReportFitnessRaw.acquireWorkoutId() + "|" + annualReportFitnessRaw.acquireExerciseTime();
                    if (!reportFitnessData.getRecordList().contains(str)) {
                        reportFitnessData.getRecordList().add(str);
                        ouj.c(reportFitnessData, annualReportFitnessRaw);
                        recentMonthRecordFromDBC.setSumAllCount(recentMonthRecordFromDBC.acquireSumAllCount() + 1);
                        long jAcquireDuring = annualReportFitnessRaw.acquireDuring();
                        recentMonthRecordFromDBC.setSumAllTime(recentMonthRecordFromDBC.acquireSumAllTime() + jAcquireDuring);
                        d(annualReportFitnessRaw.acquireExerciseTime(), 0.0f, jAcquireDuring, recentMonthRecordFromDBC);
                    }
                } else {
                    recentMonthRecordFromDBC.setSumAllCount(recentMonthRecordFromDBC.acquireSumAllCount() + 1);
                    long jAcquireDuring2 = annualReportFitnessRaw.acquireDuring();
                    recentMonthRecordFromDBC.setSumAllTime(recentMonthRecordFromDBC.acquireSumAllTime() + jAcquireDuring2);
                    d(annualReportFitnessRaw.acquireExerciseTime(), 0.0f, jAcquireDuring2, recentMonthRecordFromDBC);
                }
            }
        }
    }

    private void d(long j, float f, long j2, RecentMonthRecordFromDB recentMonthRecordFromDB) {
        if (recentMonthRecordFromDB.acquireWeekTime().size() == 0) {
            d(recentMonthRecordFromDB);
        }
        long jMax = Math.max(pal.c(j, 1, this.f44789a), recentMonthRecordFromDB.acquireFirstday());
        recentMonthRecordFromDB.acquireWeekTime().put(Long.valueOf(jMax), Long.valueOf(j2 + recentMonthRecordFromDB.acquireWeekTime().get(Long.valueOf(jMax)).longValue()));
        recentMonthRecordFromDB.acquireWeekCalorie().put(Long.valueOf(jMax), Float.valueOf(f + recentMonthRecordFromDB.acquireWeekCalorie().get(Long.valueOf(jMax)).floatValue()));
    }

    private void d(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        long jAcquireFirstday = recentMonthRecordFromDB.acquireFirstday();
        recentMonthRecordFromDB.acquireWeekTime().put(Long.valueOf(jAcquireFirstday), 0L);
        Map<Long, Float> mapAcquireWeekCalorie = recentMonthRecordFromDB.acquireWeekCalorie();
        Float fValueOf = Float.valueOf(0.0f);
        mapAcquireWeekCalorie.put(Long.valueOf(jAcquireFirstday), fValueOf);
        long jC = pal.c(recentMonthRecordFromDB.acquireLastDay(), 1, this.f44789a);
        while (jC > jAcquireFirstday) {
            recentMonthRecordFromDB.acquireWeekTime().put(Long.valueOf(jC), 0L);
            recentMonthRecordFromDB.acquireWeekCalorie().put(Long.valueOf(jC), fValueOf);
            jC = pal.d(1, 1, jC, this.f44789a);
        }
    }

    private RecentMonthRecordFromDB c(long j) {
        long jE = pal.e(j, 1);
        long jE2 = pal.e(j, 2);
        RecentMonthRecordFromDB recentMonthRecordFromDB = this.d.get(Long.valueOf(jE));
        if (recentMonthRecordFromDB != null) {
            return recentMonthRecordFromDB;
        }
        RecentMonthRecordFromDB recentMonthRecordFromDB2 = new RecentMonthRecordFromDB();
        recentMonthRecordFromDB2.setFirstday(jE);
        recentMonthRecordFromDB2.setLastDay(jE2);
        this.d.put(Long.valueOf(jE), recentMonthRecordFromDB2);
        return recentMonthRecordFromDB2;
    }

    private void c(int i, List<HiHealthData> list) {
        LogUtil.a("PLGACHIEVE_AchieveReportMonthData", "Enter dataClassification.");
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        long jE = pal.e(System.currentTimeMillis(), 1);
        LogUtil.a("PLGACHIEVE_AchieveReportMonthData", "AchieveReport_dataClassification currentStartTime ", Long.valueOf(jE));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2).getLong("start_time") >= jE) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        if (arrayList.size() == 0) {
            LogUtil.j("PLGACHIEVE_AchieveReportMonthData", "classificationList size == 0");
        } else {
            a(i, pal.e(arrayList.get(0).getLong("start_time"), 1), pal.e(arrayList.get(0).getLong("start_time"), 2), arrayList);
        }
    }

    private void a(int i, long j, long j2, List<HiHealthData> list) {
        boolean z;
        int i2;
        LogUtil.a("PLGACHIEVE_AchieveReportMonthData", "AchieveReport_dataClassification startTime", Long.valueOf(j), " endTime", Long.valueOf(j2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(list.size());
        HashMap<String, Integer> map = new HashMap<>(8);
        ouj.e(map, i, list.get(0).getInt("sport_walk_step_sum"));
        long jC = j2;
        LinkedHashMap linkedHashMap3 = linkedHashMap;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        int i3 = 0;
        long jC2 = j;
        while (i3 < list.size()) {
            HiHealthData hiHealthData = list.get(i3);
            int i4 = 1;
            if (hiHealthData.getLong("start_time") <= jC && hiHealthData.getLong("start_time") >= jC2) {
                linkedHashMap3.put(Long.valueOf(hiHealthData.getLong("start_time")), Integer.valueOf(hiHealthData.getInt("Track_Run_Distance_Sum")));
                linkedHashMap4.put(Long.valueOf(hiHealthData.getLong("start_time")), Integer.valueOf(hiHealthData.getInt("sport_walk_step_sum")));
                ouj.a(map, hiHealthData);
                if (i3 == list.size() - 1) {
                    ouj.a(map);
                    e(jC2, map, linkedHashMap3, linkedHashMap4);
                }
                i2 = i3;
                linkedHashMap4 = linkedHashMap4;
                z = false;
            } else {
                i4 = 1;
                ouj.a(map);
                e(jC2, map, linkedHashMap3, linkedHashMap4);
                z = false;
                ouj.e(map, i, 0);
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(0);
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(0);
                jC2 = pal.c(-1, jC2, 1);
                linkedHashMap3 = linkedHashMap5;
                jC = pal.c(-1, jC, 2);
                i2 = i3 - 1;
                linkedHashMap4 = linkedHashMap6;
            }
            i3 = i2 + i4;
        }
    }

    private void e(long j, HashMap<String, Integer> map, Map<Long, Integer> map2, Map<Long, Integer> map3) {
        RecentMonthRecordFromDB recentMonthRecordFromDBC = c(j);
        recentMonthRecordFromDBC.setSumTime(map.get("sumDuration").intValue());
        recentMonthRecordFromDBC.setOneMonthDis(map2);
        recentMonthRecordFromDBC.setSumDis(map.get("sumDis").intValue());
        recentMonthRecordFromDBC.setSumCount(map.get("sumCount").intValue());
        recentMonthRecordFromDBC.setDisBeatPercent(osv.d(((double) map.get("sumDis").intValue()) / 1000.0d, 1));
        recentMonthRecordFromDBC.setAvgSteps(map.get("avgSteps").intValue());
        recentMonthRecordFromDBC.setMaxSteps(map.get(ParsedFieldTag.MAX_STEPS).intValue());
        recentMonthRecordFromDBC.setSumSteps(map.get("sumSteps").intValue());
        recentMonthRecordFromDBC.setOneMonthSteps(map3);
        recentMonthRecordFromDBC.setStepBeatPercent(osv.c(map.get("sumSteps").intValue(), pal.d(j)));
    }
}
