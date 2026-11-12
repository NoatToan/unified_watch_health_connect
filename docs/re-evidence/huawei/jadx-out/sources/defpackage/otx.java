package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.connectivity.config.AUserProfile;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.RecentMonthRecordFromDB;
import com.huawei.pluginachievement.manager.model.RecentWeekRecordFromDB;
import com.huawei.pluginachievement.manager.model.WeekAndMonthRecord;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginachievement.report.bean.ReportDataBean;
import com.huawei.pluginachievement.report.bean.ReportFitnessData;
import com.huawei.pluginachievement.report.bean.ReportSwimData;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class otx {
    private static volatile otx e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f44760b;

    private otx(Context context) {
        if (context == null) {
            return;
        }
        this.f44760b = context.getApplicationContext();
    }

    public static otx b(Context context) {
        if (e == null) {
            synchronized (otx.class) {
                if (e == null) {
                    e = new otx(context);
                }
            }
        }
        return e;
    }

    private void a() {
        String strE = osa.e(this.f44760b, "reportTimeZone");
        String strAk = CommonUtil.ak();
        if (TextUtils.isEmpty(strE)) {
            osa.b(this.f44760b, "reportTimeZone", strAk);
            e();
        } else if (!strAk.equals(strE)) {
            LogUtil.a("PLGACHIEVE_AchieveReportDataService", "Timezone changed");
            e();
            osa.b(this.f44760b, "reportTimeZone", strAk);
        }
        if (TextUtils.isEmpty(osa.e(this.f44760b, "reportVersion"))) {
            osa.b(this.f44760b, "reportVersion", "2021");
            e();
        }
    }

    private void e() {
        WeekAndMonthRecord weekAndMonthRecord = new WeekAndMonthRecord();
        AUserProfile aUserProfileQ = otl.b(this.f44760b).q();
        if (aUserProfileQ == null) {
            LogUtil.j("PLGACHIEVE_AchieveReportDataService", "deleteAllData: userProfile is null");
        } else {
            weekAndMonthRecord.setHuid(aUserProfileQ.getHuid());
        }
        oth.b(this.f44760b).c(weekAndMonthRecord);
    }

    public void a(final long j, final long j2, final int i, final AchieveCallback achieveCallback) {
        ThreadPoolManager.c().c("PLGACHIEVE_AchieveReportDataService", null);
        ThreadPoolManager.c().b("PLGACHIEVE_AchieveReportDataService", new Runnable() { // from class: otx.3
            @Override // java.lang.Runnable
            public void run() {
                otx.this.b(Math.max(j, pal.c(-2, j2, 1)), j2, i, achieveCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j, long j2, int i, AchieveCallback achieveCallback) {
        if (oru.a(this.f44760b).getAdapter() == null) {
            LogUtil.a("PLGACHIEVE_AchieveReportDataService", "PluginAchieve.getInstance(mContext).getAdapter() is null");
            return;
        }
        a();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(0);
        ArrayList<AnnualReportFitnessRaw>[] arrayListArr = {null};
        e(j, j2, i, concurrentHashMap, arrayListArr);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(0);
        ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(0);
        boolean zO = Utils.o();
        Task taskCallInBackground = Tasks.callInBackground(d(zO, arrayListArr[0], concurrentHashMap2, concurrentHashMap));
        Task taskCallInBackground2 = Tasks.callInBackground(e(zO, arrayListArr[0], concurrentHashMap3, concurrentHashMap));
        ouj.d((Task<Void>) taskCallInBackground, countDownLatch);
        ouj.d((Task<Void>) taskCallInBackground2, countDownLatch);
        ArrayList<Map.Entry<String, Long>> arrayListD = ouj.d(j, j2);
        ouj.d(countDownLatch, 30000L, "generateReportDataEx");
        long[] jArr = {j, j2};
        d(concurrentHashMap2, arrayListD, jArr);
        a(concurrentHashMap3, arrayListD, jArr);
        b(concurrentHashMap2, concurrentHashMap3, jArr, achieveCallback);
    }

    private void b(Map<Long, RecentWeekRecordFromDB> map, Map<Long, RecentMonthRecordFromDB> map2, long[] jArr, AchieveCallback achieveCallback) {
        long j = jArr[0];
        boolean z = true;
        long j2 = jArr[1];
        boolean zC = c(map, j, j2);
        boolean zD = d(map2, j, j2);
        if (!zC && !zD) {
            z = false;
        }
        e(achieveCallback, z);
        if (zC) {
            d(map);
        }
        if (zD) {
            c(map2);
        }
        if (zC || zD) {
            e(achieveCallback, false);
        }
    }

    private void d(Map<Long, RecentWeekRecordFromDB> map) {
        Iterator<Map.Entry<Long, RecentWeekRecordFromDB>> it = map.entrySet().iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                RecentWeekRecordFromDB value = it.next().getValue();
                for (ReportDataBean reportDataBean : value.mReportDataMap.values()) {
                    if (reportDataBean.getCountDownLatch() != null) {
                        ouj.d(reportDataBean.getCountDownLatch(), 30000L, "WeekDetailTask:" + reportDataBean.getSportType());
                        a(reportDataBean);
                        z = true;
                    }
                }
                if (z) {
                    value.setReportDataDetail(e(value.mReportDataMap));
                    a(value);
                }
            }
            return;
        }
    }

    private void c(Map<Long, RecentMonthRecordFromDB> map) {
        Iterator<Map.Entry<Long, RecentMonthRecordFromDB>> it = map.entrySet().iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                RecentMonthRecordFromDB value = it.next().getValue();
                for (ReportDataBean reportDataBean : value.mReportDataMap.values()) {
                    if (reportDataBean.getCountDownLatch() != null) {
                        ouj.d(reportDataBean.getCountDownLatch(), 30000L, "MonthDetailTask:" + reportDataBean.getSportType());
                        a(reportDataBean);
                        z = true;
                    }
                }
                if (z) {
                    value.setReportDataDetail(e(value.mReportDataMap));
                    d(value);
                }
            }
            return;
        }
    }

    private void a(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        e(new Gson().toJson(recentWeekRecordFromDB), recentWeekRecordFromDB.acquireMonday(), recentWeekRecordFromDB.acquireSunDay(), 1, 2);
    }

    private void d(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        e(new Gson().toJson(recentMonthRecordFromDB), recentMonthRecordFromDB.acquireFirstday(), recentMonthRecordFromDB.acquireLastDay(), 2, 2);
    }

    private void a(ReportDataBean reportDataBean) {
        if (reportDataBean instanceof ReportFitnessData) {
            e(reportDataBean);
            reportDataBean.setSumTime(Math.round(reportDataBean.getSumTime() / 1000.0d));
            reportDataBean.setMaxTime(Math.round(reportDataBean.getMaxTime() / 1000.0d));
        }
        b(reportDataBean);
    }

    private boolean c(Map<Long, RecentWeekRecordFromDB> map, long j, long j2) {
        Iterator<Map.Entry<Long, RecentWeekRecordFromDB>> it = map.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            RecentWeekRecordFromDB value = it.next().getValue();
            if (value.acquireMonday() >= j && value.acquireSunDay() <= j2) {
                for (ReportDataBean reportDataBean : value.mReportDataMap.values()) {
                    if (reportDataBean.getTaskList().size() > 0) {
                        c(reportDataBean);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private boolean d(Map<Long, RecentMonthRecordFromDB> map, long j, long j2) {
        Iterator<Map.Entry<Long, RecentMonthRecordFromDB>> it = map.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            RecentMonthRecordFromDB value = it.next().getValue();
            if (value.acquireFirstday() >= j && value.acquireLastDay() <= j2) {
                for (ReportDataBean reportDataBean : value.mReportDataMap.values()) {
                    if (reportDataBean.getTaskList().size() > 0) {
                        c(reportDataBean);
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    private void c(ReportDataBean reportDataBean) {
        reportDataBean.setCountDownLatch(new CountDownLatch(1));
        a(reportDataBean, reportDataBean.getTaskList().get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ReportDataBean reportDataBean, Callable<Void> callable) {
        b(Tasks.callInBackground(callable), reportDataBean);
    }

    private void b(Task<Void> task, final ReportDataBean reportDataBean) {
        task.addOnCompleteListener(new OnCompleteListener<Void>() { // from class: otx.2
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<Void> task2) {
                reportDataBean.getTaskList().remove(0);
                if (reportDataBean.getTaskList().size() > 0) {
                    otx otxVar = otx.this;
                    ReportDataBean reportDataBean2 = reportDataBean;
                    otxVar.a(reportDataBean2, reportDataBean2.getTaskList().get(0));
                    return;
                }
                reportDataBean.getCountDownLatch().countDown();
            }
        });
    }

    private Callable<Void> a(final long j, final long j2, final ArrayList<AnnualReportFitnessRaw>[] arrayListArr) {
        return new Callable<Void>() { // from class: otx.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                arrayListArr[0] = ouj.e(j, j2);
                return null;
            }
        };
    }

    private Callable<Void> e(final long j, final long j2, final int i, final Map<Integer, List<HiHealthData>> map) {
        return new Callable<Void>() { // from class: otx.7
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void call() {
                List<HiHealthData> listD = ouj.d(j, j2, i);
                if (listD == null) {
                    return null;
                }
                map.put(1002, listD);
                return null;
            }
        };
    }

    private Callable<Void> d(final boolean z, final ArrayList<AnnualReportFitnessRaw> arrayList, final Map<Long, RecentWeekRecordFromDB> map, final Map<Integer, List<HiHealthData>> map2) {
        return new Callable<Void>() { // from class: otx.8
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new oua(z, map).e(arrayList, map2);
                return null;
            }
        };
    }

    private Callable<Void> e(final boolean z, final ArrayList<AnnualReportFitnessRaw> arrayList, final Map<Long, RecentMonthRecordFromDB> map, final Map<Integer, List<HiHealthData>> map2) {
        return new Callable<Void>() { // from class: otx.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() {
                new oud(z, map).e(arrayList, map2);
                return null;
            }
        };
    }

    private void d(Map<Long, RecentWeekRecordFromDB> map, ArrayList<Map.Entry<String, Long>> arrayList, long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        Iterator<Map.Entry<Long, RecentWeekRecordFromDB>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            RecentWeekRecordFromDB value = it.next().getValue();
            if (value.acquireMonday() >= j && value.acquireSunDay() <= j2) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Map.Entry<String, Long> entry = arrayList.get(i);
                    if (entry.getValue().longValue() >= value.acquireMonday() && entry.getValue().longValue() <= value.acquireSunDay()) {
                        value.acquireMedalId().add(entry.getKey());
                    }
                }
                c(value);
                a(value);
            }
        }
    }

    private void a(Map<Long, RecentMonthRecordFromDB> map, ArrayList<Map.Entry<String, Long>> arrayList, long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        Iterator<Map.Entry<Long, RecentMonthRecordFromDB>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            RecentMonthRecordFromDB value = it.next().getValue();
            if (value.acquireFirstday() >= j && value.acquireLastDay() <= j2) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Map.Entry<String, Long> entry = arrayList.get(i);
                    if (entry.getValue().longValue() >= value.acquireFirstday() && entry.getValue().longValue() <= value.acquireLastDay()) {
                        value.acquireMedalId().add(entry.getKey());
                    }
                }
                a(value);
                d(value);
            }
        }
    }

    private void c(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        d(recentWeekRecordFromDB);
        e(recentWeekRecordFromDB);
        b(recentWeekRecordFromDB);
        recentWeekRecordFromDB.setReportDataDetail(e(recentWeekRecordFromDB.mReportDataMap));
    }

    private void a(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        b(recentMonthRecordFromDB);
        c(recentMonthRecordFromDB);
        f(recentMonthRecordFromDB);
        recentMonthRecordFromDB.setReportDataDetail(e(recentMonthRecordFromDB.mReportDataMap));
    }

    private void e(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        recentWeekRecordFromDB.setSumAllTime(Math.round(recentWeekRecordFromDB.acquireSumAllTime() / 1000.0d));
        Map<Long, Long> mapAcquireSevenDayTime = recentWeekRecordFromDB.acquireSevenDayTime();
        for (Map.Entry<Long, Long> entry : mapAcquireSevenDayTime.entrySet()) {
            mapAcquireSevenDayTime.put(entry.getKey(), Long.valueOf(Math.round(entry.getValue().longValue() / 1000.0d)));
        }
        ouj.b(recentWeekRecordFromDB.mReportDataMap);
    }

    private void b(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        recentMonthRecordFromDB.setSumAllTime(Math.round(recentMonthRecordFromDB.acquireSumAllTime() / 1000.0d));
        Map<Long, Long> mapAcquireWeekTime = recentMonthRecordFromDB.acquireWeekTime();
        for (Map.Entry<Long, Long> entry : mapAcquireWeekTime.entrySet()) {
            mapAcquireWeekTime.put(entry.getKey(), Long.valueOf(Math.round(entry.getValue().longValue() / 1000.0d)));
        }
        ouj.b(recentMonthRecordFromDB.mReportDataMap);
    }

    private void b(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        long jAcquireSunDay = recentWeekRecordFromDB.acquireSunDay();
        for (long jAcquireMonday = recentWeekRecordFromDB.acquireMonday(); jAcquireMonday <= jAcquireSunDay; jAcquireMonday = HiDateUtil.h(jAcquireMonday)) {
            if (!recentWeekRecordFromDB.acquireSevenDayTime().containsKey(Long.valueOf(jAcquireMonday))) {
                recentWeekRecordFromDB.acquireSevenDayTime().put(Long.valueOf(jAcquireMonday), 0L);
            }
        }
    }

    private void b(ReportDataBean reportDataBean) {
        if (reportDataBean instanceof ReportSwimData) {
            ReportSwimData reportSwimData = (ReportSwimData) reportDataBean;
            if (reportSwimData.getStroke().size() == 0) {
                return;
            }
            reportSwimData.setMaxStroke(((Integer) ((Map.Entry) Collections.max(new ArrayList(reportSwimData.getStroke().entrySet()), new Comparator() { // from class: oty
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return otx.c((Map.Entry) obj, (Map.Entry) obj2);
                }
            })).getKey()).intValue());
        }
    }

    static /* synthetic */ int c(Map.Entry entry, Map.Entry entry2) {
        if (((Integer) entry.getValue()).intValue() - ((Integer) entry2.getValue()).intValue() < 0) {
            return -1;
        }
        return ((Integer) entry.getValue()).intValue() - ((Integer) entry2.getValue()).intValue() == 0 ? 0 : 1;
    }

    private void e(ReportDataBean reportDataBean) {
        if (reportDataBean instanceof ReportFitnessData) {
            ReportFitnessData reportFitnessData = (ReportFitnessData) reportDataBean;
            int iIntValue = 0;
            for (Map.Entry<String, Integer> entry : reportFitnessData.getFirstLevelMap().entrySet()) {
                if (entry.getValue().intValue() > iIntValue) {
                    iIntValue = entry.getValue().intValue();
                    reportFitnessData.setMaxFirstLevel(entry.getKey());
                }
            }
            int iIntValue2 = 0;
            for (Map.Entry<String, Integer> entry2 : reportFitnessData.getCourseMap().entrySet()) {
                if (entry2.getValue().intValue() > iIntValue2) {
                    iIntValue2 = entry2.getValue().intValue();
                    reportFitnessData.setMaxCourse(entry2.getKey());
                }
            }
            if (reportFitnessData.getTrainingPointsMap().size() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(reportFitnessData.getTrainingPointsMap().entrySet());
            Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: otx.10
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<String, Integer> entry3, Map.Entry<String, Integer> entry4) {
                    return entry4.getValue().intValue() - entry3.getValue().intValue();
                }
            });
            int iIntValue3 = ((Integer) ((Map.Entry) arrayList.get(0)).getValue()).intValue();
            for (int i = 0; i < arrayList.size() && iIntValue3 == ((Integer) ((Map.Entry) arrayList.get(i)).getValue()).intValue(); i++) {
                reportFitnessData.getMaxTrainingPoints().add((String) ((Map.Entry) arrayList.get(i)).getKey());
            }
        }
    }

    private void d(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        if (recentWeekRecordFromDB.acquireSportDays().size() == 0) {
            return;
        }
        recentWeekRecordFromDB.setAvgCalorie(Math.round(recentWeekRecordFromDB.acquireSumCalorie() / recentWeekRecordFromDB.acquireSportDays().size()));
    }

    private void c(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        if (recentMonthRecordFromDB.acquireSportDays().size() == 0) {
            return;
        }
        recentMonthRecordFromDB.setDayAvgCalorie(Math.round(recentMonthRecordFromDB.acquireSumCalorie() / recentMonthRecordFromDB.acquireSportDays().size()));
    }

    private ArrayList<ReportDataBean> e(Map<Integer, ReportDataBean> map) {
        ArrayList<ReportDataBean> arrayList = new ArrayList<>(0);
        if (map.size() != 0) {
            for (ReportDataBean reportDataBean : map.values()) {
                if (reportDataBean.getSumTime() > 0 && reportDataBean.getSportCount() > 0) {
                    arrayList.add(reportDataBean);
                }
            }
            if (arrayList.size() != 0) {
                Collections.sort(arrayList, new Comparator<ReportDataBean>() { // from class: otx.9
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(ReportDataBean reportDataBean2, ReportDataBean reportDataBean3) {
                        return reportDataBean3.getSportCount() - reportDataBean2.getSportCount();
                    }
                });
                return arrayList;
            }
        }
        return arrayList;
    }

    private void f(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        float fE = e(recentMonthRecordFromDB);
        if (fE == 0.0f) {
            return;
        }
        recentMonthRecordFromDB.mPercentCalorie[4] = 100;
        float f = fE * 1.0f;
        recentMonthRecordFromDB.mPercentCalorie[0] = (int) Math.floor((e(recentMonthRecordFromDB, 258) * 100.0f) / f);
        recentMonthRecordFromDB.mPercentCalorie[4] = recentMonthRecordFromDB.mPercentCalorie[4] - recentMonthRecordFromDB.mPercentCalorie[0];
        recentMonthRecordFromDB.mPercentCalorie[1] = (int) Math.floor((e(recentMonthRecordFromDB, 257) * 100.0f) / f);
        recentMonthRecordFromDB.mPercentCalorie[4] = recentMonthRecordFromDB.mPercentCalorie[4] - recentMonthRecordFromDB.mPercentCalorie[1];
        recentMonthRecordFromDB.mPercentCalorie[2] = (int) Math.floor((e(recentMonthRecordFromDB, 259) * 100.0f) / f);
        recentMonthRecordFromDB.mPercentCalorie[4] = recentMonthRecordFromDB.mPercentCalorie[4] - recentMonthRecordFromDB.mPercentCalorie[2];
        recentMonthRecordFromDB.mPercentCalorie[3] = (int) Math.floor((e(recentMonthRecordFromDB, 260) * 100.0f) / f);
        recentMonthRecordFromDB.mPercentCalorie[4] = recentMonthRecordFromDB.mPercentCalorie[4] - recentMonthRecordFromDB.mPercentCalorie[3];
        if (recentMonthRecordFromDB.mPercentCalorie[4] < 0) {
            recentMonthRecordFromDB.mPercentCalorie[4] = 0;
            LogUtil.j("PLGACHIEVE_AchieveReportDataService", "savePercentCalorie : percentCalorie error.");
        }
    }

    private float e(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        return recentMonthRecordFromDB.acquireSumCalcCalorie();
    }

    private float e(RecentMonthRecordFromDB recentMonthRecordFromDB, int i) {
        ReportDataBean reportDataBean = recentMonthRecordFromDB.mReportDataMap.get(Integer.valueOf(i));
        if (reportDataBean != null) {
            return reportDataBean.getSumCalorie();
        }
        return 0.0f;
    }

    private void e(AchieveCallback achieveCallback, boolean z) {
        if (achieveCallback != null) {
            achieveCallback.onResponse(0, Boolean.valueOf(z));
        }
        BroadcastManagerUtil.b(this.f44760b, new Intent().setAction("com.huawei.health.action.UPDATE_UI_CHART"));
    }

    private boolean e(String str, long j, long j2, int i, int i2) {
        WeekAndMonthRecord weekAndMonthRecord = new WeekAndMonthRecord();
        weekAndMonthRecord.setValue(str);
        weekAndMonthRecord.setStartTimestamp(Long.valueOf(j));
        weekAndMonthRecord.setEndTimestamp(Long.valueOf(j2));
        weekAndMonthRecord.setRecentType(i);
        weekAndMonthRecord.setDataSource(i2);
        weekAndMonthRecord.setHuid(otl.b(this.f44760b).q().getHuid());
        return oth.b(this.f44760b).d(weekAndMonthRecord);
    }

    private Callable<Void> b(final long j, final long j2, final Map<Integer, List<HiHealthData>> map) {
        return new Callable<Void>() { // from class: otx.13
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() {
                List<HiHealthData> listC = ouj.c(j, j2);
                if (listC == null) {
                    return null;
                }
                map.put(1000, listC);
                return null;
            }
        };
    }

    private Callable<Void> a(final long j, final long j2, final Map<Integer, List<HiHealthData>> map) {
        return new Callable<Void>() { // from class: otx.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Void call() {
                List<HiHealthData> listA = ouj.a(j, j2);
                if (listA == null) {
                    return null;
                }
                map.put(1001, listA);
                return null;
            }
        };
    }

    private Callable<Void> e(final long j, final long j2, final int i, final int i2, final Map<Integer, List<HiHealthData>> map) {
        return new Callable<Void>() { // from class: otx.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                List<HiHealthData> listC = ouj.c(j, j2, i);
                if (listC == null) {
                    return null;
                }
                map.put(Integer.valueOf(i2), listC);
                return null;
            }
        };
    }

    private void e(long j, long j2, int i, Map<Integer, List<HiHealthData>> map, ArrayList<AnnualReportFitnessRaw>[] arrayListArr) {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        ouj.d((Task<Void>) Tasks.callInBackground(e(j, j2, i, map)), countDownLatch);
        ouj.d((Task<Void>) Tasks.callInBackground(a(j, j2, arrayListArr)), countDownLatch);
        ouj.d((Task<Void>) Tasks.callInBackground(b(j, j2, map)), countDownLatch);
        ouj.d((Task<Void>) Tasks.callInBackground(a(j, j2, map)), countDownLatch);
        ouj.d((Task<Void>) Tasks.callInBackground(e(j, j2, 2147483646, 1004, map)), countDownLatch);
        ouj.d((Task<Void>) Tasks.callInBackground(e(j, j2, Integer.MAX_VALUE, 1003, map)), countDownLatch);
        ouj.d(countDownLatch, Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS, "getDataFromDb");
    }
}
