package defpackage;

import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.model.RecentWeekRecordFromDB;
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
public class oua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44785a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Long, RecentWeekRecordFromDB> f44786c;

    public oua(boolean z, Map<Long, RecentWeekRecordFromDB> map) {
        this.f44785a = z;
        this.f44786c = map;
    }

    public void e(ArrayList<AnnualReportFitnessRaw> arrayList, Map<Integer, List<HiHealthData>> map) {
        CountDownLatch countDownLatch = null;
        if (map != null) {
            if (map.containsKey(1004)) {
                countDownLatch = new CountDownLatch(1);
                ouj.d((Task<Void>) Tasks.callInBackground(e(map.get(1004), 2147483646)), countDownLatch);
            }
            for (Map.Entry<Integer, List<HiHealthData>> entry : map.entrySet()) {
                switch (entry.getKey().intValue()) {
                    case 1000:
                        d(entry.getValue());
                        break;
                    case 1001:
                        e(entry.getValue());
                        break;
                    case 1002:
                        d(1, entry.getValue());
                        break;
                    case 1003:
                        a(entry.getValue(), Integer.MAX_VALUE);
                        break;
                }
            }
        }
        if (arrayList != null) {
            c(arrayList);
        }
        if (countDownLatch != null) {
            ouj.d(countDownLatch, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS, "dealWeekSportTask");
        }
    }

    private Callable<Void> e(final List<HiHealthData> list, final int i) {
        return new Callable<Void>() { // from class: oua.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                oua.this.a(list, i);
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<HiHealthData> list, int i) {
        HiTrackMetaData hiTrackMetaDataA;
        long jC = pal.c(System.currentTimeMillis(), 1, this.f44785a);
        for (int i2 = 0; i2 < list.size(); i2++) {
            HiHealthData hiHealthData = list.get(i2);
            if (hiHealthData.getStartTime() < jC && (hiTrackMetaDataA = ouj.a(hiHealthData)) != null) {
                ouj.a(i, a(hiHealthData.getStartTime()).mReportDataMap, hiTrackMetaDataA, hiHealthData.getStartTime(), hiHealthData.getEndTime());
            }
        }
    }

    private void e(List<HiHealthData> list) {
        long jC = pal.c(System.currentTimeMillis(), 1, this.f44785a);
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getLong("start_time") < jC) {
                ouj.d(a(hiHealthData.getLong("start_time")).mReportDataMap, hiHealthData);
            }
        }
    }

    private void d(List<HiHealthData> list) {
        long jC = pal.c(System.currentTimeMillis(), 1, this.f44785a);
        for (int i = 0; i < list.size(); i++) {
            HiHealthData hiHealthData = list.get(i);
            if (hiHealthData.getLong("start_time") < jC) {
                RecentWeekRecordFromDB recentWeekRecordFromDBA = a(hiHealthData.getLong("start_time"));
                long j = hiHealthData.getInt("Track_Duration_Sum");
                recentWeekRecordFromDBA.setSumAllTime(recentWeekRecordFromDBA.acquireSumAllTime() + j);
                recentWeekRecordFromDBA.setSumCalorie(recentWeekRecordFromDBA.acquireSumCalorie() + hiHealthData.getInt("sport_calorie_sum"));
                recentWeekRecordFromDBA.setSumAllCount((recentWeekRecordFromDBA.acquireSumAllCount() + hiHealthData.getInt("Track_Count_Sum")) - hiHealthData.getInt("Track_Abnormal_Count_Sum"));
                recentWeekRecordFromDBA.acquireSevenDayTime().put(Long.valueOf(hiHealthData.getLong("start_time")), Long.valueOf(j));
                if (hiHealthData.getInt("sport_calorie_sum") > 0) {
                    recentWeekRecordFromDBA.acquireSportDays().put(Long.valueOf(HiDateUtil.p(hiHealthData.getLong("start_time"))), 1);
                }
                ouj.b(recentWeekRecordFromDBA.mReportDataMap, hiHealthData);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0096  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    private void c(ArrayList<AnnualReportFitnessRaw> arrayList) {
        long jAcquireDuring;
        long jP;
        Long l;
        long jC = pal.c(System.currentTimeMillis(), 1, this.f44785a);
        for (int i = 0; i < arrayList.size(); i++) {
            AnnualReportFitnessRaw annualReportFitnessRaw = arrayList.get(i);
            if (annualReportFitnessRaw.acquireExerciseTime() < jC) {
                RecentWeekRecordFromDB recentWeekRecordFromDBA = a(annualReportFitnessRaw.acquireExerciseTime());
                ReportDataBean reportDataBeanA = ouj.a(recentWeekRecordFromDBA.mReportDataMap, 10001);
                if (reportDataBeanA instanceof ReportFitnessData) {
                    ReportFitnessData reportFitnessData = (ReportFitnessData) reportDataBeanA;
                    String str = annualReportFitnessRaw.acquireWorkoutId() + "|" + annualReportFitnessRaw.acquireExerciseTime();
                    if (!reportFitnessData.getRecordList().contains(str)) {
                        reportFitnessData.getRecordList().add(str);
                        ouj.c(reportFitnessData, annualReportFitnessRaw);
                        recentWeekRecordFromDBA.setSumAllCount(recentWeekRecordFromDBA.acquireSumAllCount() + 1);
                        jAcquireDuring = annualReportFitnessRaw.acquireDuring();
                        recentWeekRecordFromDBA.setSumAllTime(recentWeekRecordFromDBA.acquireSumAllTime() + jAcquireDuring);
                        jP = HiDateUtil.p(annualReportFitnessRaw.acquireExerciseTime());
                        l = recentWeekRecordFromDBA.acquireSevenDayTime().get(Long.valueOf(jP));
                        if (l == null) {
                            recentWeekRecordFromDBA.acquireSevenDayTime().put(Long.valueOf(jP), Long.valueOf(jAcquireDuring));
                        } else {
                            recentWeekRecordFromDBA.acquireSevenDayTime().put(Long.valueOf(jP), Long.valueOf(jAcquireDuring + l.longValue()));
                        }
                    }
                } else {
                    recentWeekRecordFromDBA.setSumAllCount(recentWeekRecordFromDBA.acquireSumAllCount() + 1);
                    jAcquireDuring = annualReportFitnessRaw.acquireDuring();
                    recentWeekRecordFromDBA.setSumAllTime(recentWeekRecordFromDBA.acquireSumAllTime() + jAcquireDuring);
                    jP = HiDateUtil.p(annualReportFitnessRaw.acquireExerciseTime());
                    l = recentWeekRecordFromDBA.acquireSevenDayTime().get(Long.valueOf(jP));
                    if (l == null) {
                        recentWeekRecordFromDBA.acquireSevenDayTime().put(Long.valueOf(jP), Long.valueOf(jAcquireDuring));
                    } else {
                        recentWeekRecordFromDBA.acquireSevenDayTime().put(Long.valueOf(jP), Long.valueOf(jAcquireDuring + l.longValue()));
                    }
                }
            }
        }
    }

    private RecentWeekRecordFromDB a(long j) {
        long jC = pal.c(j, 1, this.f44785a);
        long jC2 = pal.c(j, 2, this.f44785a);
        RecentWeekRecordFromDB recentWeekRecordFromDB = this.f44786c.get(Long.valueOf(jC));
        if (recentWeekRecordFromDB != null) {
            return recentWeekRecordFromDB;
        }
        RecentWeekRecordFromDB recentWeekRecordFromDB2 = new RecentWeekRecordFromDB();
        recentWeekRecordFromDB2.setMonday(jC);
        recentWeekRecordFromDB2.setSunDay(jC2);
        this.f44786c.put(Long.valueOf(jC), recentWeekRecordFromDB2);
        return recentWeekRecordFromDB2;
    }

    private void d(int i, List<HiHealthData> list) {
        LogUtil.a("PLGACHIEVE_AchieveReportWeekData", "Enter dataClassification!");
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        long jC = pal.c(System.currentTimeMillis(), 1, this.f44785a);
        LogUtil.a("PLGACHIEVE_AchieveReportWeekData", "AchieveReport_dataClassification currentStartTime", Long.valueOf(jC));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            if (arrayList.get(i2).getLong("start_time") >= jC) {
                arrayList.remove(i2);
                i2--;
            }
            i2++;
        }
        if (arrayList.size() == 0) {
            LogUtil.a("PLGACHIEVE_AchieveReportWeekData", "classificationList.size()== 0");
        } else {
            c(i, pal.c(arrayList.get(0).getLong("start_time"), 1, this.f44785a), pal.c(arrayList.get(0).getLong("start_time"), 2, this.f44785a), arrayList);
        }
    }

    private void c(int i, long j, long j2, List<HiHealthData> list) {
        boolean z;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap;
        LogUtil.a("PLGACHIEVE_AchieveReportWeekData", "AchieveReport_dataClassification startTime", Long.valueOf(j));
        LogUtil.a("PLGACHIEVE_AchieveReportWeekData", "AchieveReport_dataClassification endTime", Long.valueOf(j2));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(list.size());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(list.size());
        HashMap<String, Integer> map = new HashMap<>(8);
        ouj.e(map, i, list.get(0).getInt("sport_walk_step_sum"));
        long jD = j;
        long jD2 = j2;
        LinkedHashMap linkedHashMap4 = linkedHashMap2;
        LinkedHashMap linkedHashMap5 = linkedHashMap3;
        int i4 = 0;
        while (i4 < list.size()) {
            HiHealthData hiHealthData = list.get(i4);
            if (hiHealthData.getLong("start_time") <= jD2 && hiHealthData.getLong("start_time") >= jD) {
                linkedHashMap4.put(Long.valueOf(hiHealthData.getLong("start_time")), Integer.valueOf(hiHealthData.getInt("Track_Run_Distance_Sum")));
                linkedHashMap5.put(Long.valueOf(hiHealthData.getLong("start_time")), Integer.valueOf(hiHealthData.getInt("sport_walk_step_sum")));
                ouj.a(map, hiHealthData);
                if (i4 == list.size() - 1) {
                    ouj.a(map);
                    linkedHashMap = linkedHashMap5;
                    a(jD, map, linkedHashMap4, linkedHashMap);
                } else {
                    linkedHashMap = linkedHashMap5;
                }
                i3 = i4;
                linkedHashMap5 = linkedHashMap;
                linkedHashMap4 = linkedHashMap4;
                z = false;
                i2 = 1;
            } else {
                ouj.a(map);
                a(jD, map, linkedHashMap4, linkedHashMap5);
                z = false;
                ouj.e(map, i, 0);
                linkedHashMap4 = new LinkedHashMap(0);
                linkedHashMap5 = new LinkedHashMap(0);
                i2 = 1;
                jD = pal.d(1, 1, jD, this.f44785a);
                jD2 = pal.d(2, 1, jD2, this.f44785a);
                i3 = i4 - 1;
            }
            i4 = i3 + i2;
        }
    }

    private void a(long j, HashMap<String, Integer> map, Map<Long, Integer> map2, Map<Long, Integer> map3) {
        if (map.get("sumDuration").intValue() > 0 || map.get("sumSteps").intValue() > 0) {
            RecentWeekRecordFromDB recentWeekRecordFromDBA = a(j);
            recentWeekRecordFromDBA.setSumTime(map.get("sumDuration").intValue());
            recentWeekRecordFromDBA.setSevenDayDis(map2);
            recentWeekRecordFromDBA.setSumDis(map.get("sumDis").intValue());
            recentWeekRecordFromDBA.setSumCount(map.get("sumCount").intValue());
            recentWeekRecordFromDBA.setDisBeatPercent(osv.d(((double) map.get("sumDis").intValue()) / 1000.0d, 0));
            recentWeekRecordFromDBA.setAvgSteps(map.get("avgSteps").intValue());
            recentWeekRecordFromDBA.setMaxSteps(map.get(ParsedFieldTag.MAX_STEPS).intValue());
            recentWeekRecordFromDBA.setSumSteps(map.get("sumSteps").intValue());
            recentWeekRecordFromDBA.setSevenDaySteps(map3);
            recentWeekRecordFromDBA.setStepBeatPercent(osv.c(map.get("sumSteps").intValue(), 7));
        }
    }
}
