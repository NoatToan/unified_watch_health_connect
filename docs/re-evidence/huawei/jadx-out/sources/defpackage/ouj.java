package defpackage;

import android.content.Context;
import com.google.gson.JsonSyntaxException;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginachievement.report.bean.ReportClimbData;
import com.huawei.pluginachievement.report.bean.ReportCrossTrainerData;
import com.huawei.pluginachievement.report.bean.ReportDataBean;
import com.huawei.pluginachievement.report.bean.ReportFitnessData;
import com.huawei.pluginachievement.report.bean.ReportHikingData;
import com.huawei.pluginachievement.report.bean.ReportOtherData;
import com.huawei.pluginachievement.report.bean.ReportRideData;
import com.huawei.pluginachievement.report.bean.ReportRowData;
import com.huawei.pluginachievement.report.bean.ReportRunData;
import com.huawei.pluginachievement.report.bean.ReportSwimData;
import com.huawei.pluginachievement.report.bean.ReportTrailRunData;
import com.huawei.pluginachievement.report.bean.ReportWalkData;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.pluginfitnessadvice.Classify;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ouj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList<Integer> f44797a = new ArrayList<Integer>() { // from class: ouj.5
        {
            add(258);
            add(264);
            add(262);
            add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM));
            add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE));
            add(257);
            add(281);
            add(260);
            add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER));
            add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE));
            add(282);
            add(259);
            add(10001);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList<Integer> f44798b = new ArrayList<Integer>() { // from class: ouj.8
        {
            add(259);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ArrayList<Integer> f44799c = new ArrayList<Integer>() { // from class: ouj.7
        {
            add(258);
            add(264);
        }
    };

    public static ArrayList<Integer> e() {
        return f44797a;
    }

    private static void c(ReportRunData reportRunData, long j, long j2) {
        d(reportRunData, j, j2);
    }

    private static int c(List<njl> list) {
        int iMin = Integer.MAX_VALUE;
        for (njl njlVar : list) {
            if (njlVar.e() > 0) {
                iMin = Math.min(iMin, njlVar.e());
            }
        }
        return iMin;
    }

    private static void d(ReportRideData reportRideData, long j, long j2) {
        d((ReportDataBean) reportRideData, j, j2);
    }

    private static void c(ReportRunData reportRunData, HiTrackMetaData hiTrackMetaData) {
        e(e(hiTrackMetaData.getPaceMap()), reportRunData, hiTrackMetaData);
        Map<Double, Double> partTimeMap = hiTrackMetaData.getPartTimeMap();
        if (partTimeMap == null) {
            return;
        }
        if (partTimeMap.get(Double.valueOf(21.0975d)) != null) {
            reportRunData.setHalfMarathonMinTime(Math.min(reportRunData.getHalfMarathonMinTime(), partTimeMap.get(Double.valueOf(21.0975d)).doubleValue()));
            reportRunData.setHalfMarathonCount(reportRunData.getHalfMarathonCount() + 1);
        }
        if (partTimeMap.get(Double.valueOf(42.195d)) != null) {
            reportRunData.setFullMarathonMinTime(Math.min(reportRunData.getFullMarathonMinTime(), partTimeMap.get(Double.valueOf(42.195d)).doubleValue()));
            reportRunData.setFullMarathonCount(reportRunData.getFullMarathonCount() + 1);
        }
    }

    private static ArrayList<Map.Entry<Integer, Float>> e(Map<Integer, Float> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        ArrayList<Map.Entry<Integer, Float>> arrayList = new ArrayList<>(map.entrySet().size());
        Iterator<Map.Entry<Integer, Float>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Float>>() { // from class: ouj.11
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<Integer, Float> entry, Map.Entry<Integer, Float> entry2) {
                return entry.getKey().intValue() - entry2.getKey().intValue();
            }
        });
        return arrayList;
    }

    private static void e(ArrayList<Map.Entry<Integer, Float>> arrayList, ReportRunData reportRunData, HiTrackMetaData hiTrackMetaData) {
        if (njy.e(arrayList)) {
            return;
        }
        int totalDistance = hiTrackMetaData.getTotalDistance() / 1000;
        int i = 0;
        int iRound = 0;
        while (i < arrayList.size() && i < totalDistance) {
            iRound += Math.round(arrayList.get(i).getValue().floatValue());
            i++;
            if (i == 3) {
                reportRunData.setThreeKmMinTime(Math.min(reportRunData.getThreeKmMinTime(), iRound));
            }
            if (i == 5) {
                reportRunData.setFiveKmMinTime(Math.min(reportRunData.getFiveKmMinTime(), iRound));
            }
            if (i == 10) {
                reportRunData.setTenKmMinTime(Math.min(reportRunData.getTenKmMinTime(), iRound));
            }
        }
    }

    private static void b(ArrayList<Map.Entry<Integer, Float>> arrayList, ReportRunData reportRunData, HiTrackMetaData hiTrackMetaData) {
        if (njy.e(arrayList)) {
            return;
        }
        long jRound = Math.round(UnitUtil.e(((double) hiTrackMetaData.getTotalDistance()) / 1000.0d, 3));
        int i = 0;
        int iRound = 0;
        while (i < arrayList.size() && i < jRound) {
            iRound += Math.round(arrayList.get(i).getValue().floatValue());
            i++;
            if (i == 3) {
                reportRunData.setBritishThreeKmMinTime(Math.min(reportRunData.getBritishThreeKmMinTime(), iRound));
            }
            if (i == 5) {
                reportRunData.setBritishFiveKmMinTime(Math.min(reportRunData.getBritishFiveKmMinTime(), iRound));
            }
            if (i == 10) {
                reportRunData.setBritishTenKmMinTime(Math.min(reportRunData.getBritishTenKmMinTime(), iRound));
            }
        }
    }

    private static void e(ReportRunData reportRunData, HiTrackMetaData hiTrackMetaData) {
        b(e(hiTrackMetaData.getBritishPaceMap()), reportRunData, hiTrackMetaData);
        Map<Double, Double> britishPartTimeMap = hiTrackMetaData.getBritishPartTimeMap();
        if (britishPartTimeMap == null) {
            return;
        }
        if (britishPartTimeMap.get(Double.valueOf(21.0975d)) != null) {
            reportRunData.setBritishHalfMarathonMinTime(Math.min(reportRunData.getBritishHalfMarathonMinTime(), britishPartTimeMap.get(Double.valueOf(21.0975d)).doubleValue()));
            reportRunData.setBritishHalfMarathonCount(reportRunData.getBritishHalfMarathonCount() + 1);
        }
        if (britishPartTimeMap.get(Double.valueOf(42.195d)) != null) {
            reportRunData.setBritishFullMarathonMinTime(Math.min(reportRunData.getBritishFullMarathonMinTime(), britishPartTimeMap.get(Double.valueOf(42.195d)).doubleValue()));
            reportRunData.setBritishFullMarathonCount(reportRunData.getBritishFullMarathonCount() + 1);
        }
    }

    public static HiTrackMetaData a(HiHealthData hiHealthData) {
        HiTrackMetaData hiTrackMetaData;
        try {
            hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.e("PLGACHIEVE_AchieveReportHelper", "trackMetaData is error");
            hiTrackMetaData = null;
        }
        if (hiTrackMetaData == null || (hiTrackMetaData.getAbnormalTrack() == 0 && hiTrackMetaData.getDuplicated() == 0)) {
            return hiTrackMetaData;
        }
        return null;
    }

    public static void a(int i, Map<Integer, ReportDataBean> map, HiTrackMetaData hiTrackMetaData, long j, long j2) {
        switch (i) {
            case 2147483646:
                e(map, hiTrackMetaData, j, j2);
                break;
            case Integer.MAX_VALUE:
                int sportType = hiTrackMetaData.getSportType();
                if (!f44797a.contains(Integer.valueOf(sportType))) {
                    ReportDataBean reportDataBeanA = a(map, sportType);
                    if (reportDataBeanA instanceof ReportOtherData) {
                        d((ReportOtherData) reportDataBeanA, hiTrackMetaData);
                    }
                    break;
                }
                break;
        }
    }

    private static void e(Map<Integer, ReportDataBean> map, HiTrackMetaData hiTrackMetaData, long j, long j2) {
        int sportType = hiTrackMetaData.getSportType();
        if (sportType != 258) {
            if (sportType == 260) {
                ReportDataBean reportDataBeanA = a(map, 260);
                if (reportDataBeanA instanceof ReportClimbData) {
                    e((ReportClimbData) reportDataBeanA, hiTrackMetaData);
                    return;
                }
                return;
            }
            if (sportType != 264) {
                if (sportType == 273) {
                    ReportDataBean reportDataBeanA2 = a(map, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
                    if (reportDataBeanA2 instanceof ReportCrossTrainerData) {
                        b((ReportCrossTrainerData) reportDataBeanA2, hiTrackMetaData);
                        return;
                    }
                    return;
                }
                if (sportType == 274) {
                    ReportDataBean reportDataBeanA3 = a(map, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE);
                    if (reportDataBeanA3 instanceof ReportRowData) {
                        c((ReportRowData) reportDataBeanA3, hiTrackMetaData, j, j2);
                        return;
                    }
                    return;
                }
                d(map, hiTrackMetaData, j, j2);
                return;
            }
        }
        ReportDataBean reportDataBeanA4 = a(map, 258);
        if (reportDataBeanA4 instanceof ReportRunData) {
            b((ReportRunData) reportDataBeanA4, hiTrackMetaData, j, j2);
        }
    }

    private static void d(Map<Integer, ReportDataBean> map, HiTrackMetaData hiTrackMetaData, long j, long j2) {
        int sportType = hiTrackMetaData.getSportType();
        if (sportType != 257) {
            if (sportType == 259) {
                ReportDataBean reportDataBeanA = a(map, 259);
                if (reportDataBeanA instanceof ReportRideData) {
                    b((ReportRideData) reportDataBeanA, hiTrackMetaData, j, j2);
                    return;
                }
                return;
            }
            if (sportType == 262 || sportType == 266) {
                ReportDataBean reportDataBeanA2 = a(map, 262);
                if (reportDataBeanA2 instanceof ReportSwimData) {
                    a((ReportSwimData) reportDataBeanA2, j, j2);
                    return;
                }
                return;
            }
            switch (sportType) {
                case OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE /* 280 */:
                    ReportDataBean reportDataBeanA3 = a(map, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE);
                    if (reportDataBeanA3 instanceof ReportTrailRunData) {
                        e((ReportTrailRunData) reportDataBeanA3, hiTrackMetaData);
                    }
                    break;
                case 282:
                    ReportDataBean reportDataBeanA4 = a(map, 282);
                    if (reportDataBeanA4 instanceof ReportHikingData) {
                        e((ReportHikingData) reportDataBeanA4, hiTrackMetaData);
                    }
                    break;
            }
            return;
        }
        ReportDataBean reportDataBeanA5 = a(map, 257);
        if (reportDataBeanA5 instanceof ReportWalkData) {
            c((ReportWalkData) reportDataBeanA5, hiTrackMetaData);
        }
    }

    private static void b(ReportRideData reportRideData, HiTrackMetaData hiTrackMetaData, long j, long j2) {
        reportRideData.setSumDescent(reportRideData.getSumDescent() + hiTrackMetaData.getTotalDescent());
        d(reportRideData, j, j2);
    }

    private static void b(ReportRunData reportRunData, HiTrackMetaData hiTrackMetaData, long j, long j2) {
        reportRunData.setSumDistance(reportRunData.getSumDistance() + hiTrackMetaData.getTotalDistance());
        reportRunData.setMaxDistance(Math.max(reportRunData.getMaxDistance(), hiTrackMetaData.getTotalDistance()));
        reportRunData.setSumTime(reportRunData.getSumTime() + hiTrackMetaData.getTotalTime());
        reportRunData.setSportCount(reportRunData.getSportCount() + 1);
        c(reportRunData, hiTrackMetaData);
        e(reportRunData, hiTrackMetaData);
        c(reportRunData, j, j2);
    }

    private static void e(ReportHikingData reportHikingData, HiTrackMetaData hiTrackMetaData) {
        reportHikingData.setSportCount(reportHikingData.getSportCount() + 1);
        reportHikingData.setSumCalorie(reportHikingData.getSumCalorie() + hiTrackMetaData.getTotalCalories());
        reportHikingData.setMaxDistance(Math.max(reportHikingData.getMaxDistance(), hiTrackMetaData.getTotalDistance()));
        reportHikingData.setSumDistance(reportHikingData.getSumDistance() + hiTrackMetaData.getTotalDistance());
        reportHikingData.setSumTime(reportHikingData.getSumTime() + hiTrackMetaData.getTotalTime());
    }

    private static void c(ReportWalkData reportWalkData, HiTrackMetaData hiTrackMetaData) {
        reportWalkData.setSportCount(reportWalkData.getSportCount() + 1);
        reportWalkData.setMaxDistance(Math.max(reportWalkData.getMaxDistance(), hiTrackMetaData.getTotalDistance()));
        reportWalkData.setSumDistance(reportWalkData.getSumDistance() + hiTrackMetaData.getTotalDistance());
        reportWalkData.setSumTime(reportWalkData.getSumTime() + hiTrackMetaData.getTotalTime());
        if (hiTrackMetaData.getBestStepRate() <= 300 && hiTrackMetaData.getAvgStepRate() != 0 && hiTrackMetaData.getAvgStepRate() <= hiTrackMetaData.getBestStepRate()) {
            reportWalkData.setMaxStepRate(Math.max(reportWalkData.getMaxStepRate(), hiTrackMetaData.getBestStepRate()));
        }
    }

    private static void d(ReportOtherData reportOtherData, HiTrackMetaData hiTrackMetaData) {
        reportOtherData.setSportCount(reportOtherData.getSportCount() + 1);
        reportOtherData.setSumCalorie(reportOtherData.getSumCalorie() + hiTrackMetaData.getTotalCalories());
        reportOtherData.setSumTime(reportOtherData.getSumTime() + hiTrackMetaData.getTotalTime());
        reportOtherData.setMaxTime(Math.max(reportOtherData.getMaxTime(), hiTrackMetaData.getTotalTime()));
    }

    private static void e(ReportTrailRunData reportTrailRunData, HiTrackMetaData hiTrackMetaData) {
        reportTrailRunData.setSumDistance(reportTrailRunData.getSumDistance() + hiTrackMetaData.getTotalDistance());
        reportTrailRunData.setMaxDistance(Math.max(reportTrailRunData.getMaxDistance(), hiTrackMetaData.getTotalDistance()));
        reportTrailRunData.setSumTime(reportTrailRunData.getSumTime() + hiTrackMetaData.getTotalTime());
        reportTrailRunData.setSportCount(reportTrailRunData.getSportCount() + 1);
        reportTrailRunData.setSumCalorie(reportTrailRunData.getSumCalorie() + hiTrackMetaData.getTotalCalories());
    }

    private static void a(ReportSwimData reportSwimData, long j, long j2) {
        d(reportSwimData, j, j2);
    }

    private static int e(List<njp> list) {
        return ((njp) Collections.max(list, new Comparator() { // from class: oui
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ouj.b((njp) obj, (njp) obj2);
            }
        })).e();
    }

    static /* synthetic */ int b(njp njpVar, njp njpVar2) {
        if (njpVar.e() - njpVar2.e() < 0) {
            return -1;
        }
        return njpVar.e() - njpVar2.e() == 0 ? 0 : 1;
    }

    private static int b(List<njq> list) {
        int iMin = Integer.MAX_VALUE;
        for (njq njqVar : list) {
            if (njqVar.c() > 0) {
                iMin = Math.min(iMin, njqVar.c());
            }
        }
        return iMin;
    }

    private static void c(ReportRowData reportRowData, HiTrackMetaData hiTrackMetaData, long j, long j2) {
        reportRowData.setSportCount(reportRowData.getSportCount() + 1);
        reportRowData.setSumCalorie(reportRowData.getSumCalorie() + hiTrackMetaData.getTotalCalories());
        reportRowData.setSumTime(reportRowData.getSumTime() + hiTrackMetaData.getTotalTime());
        reportRowData.setMaxTime(Math.max(reportRowData.getMaxTime(), hiTrackMetaData.getTotalTime()));
        d(reportRowData, j, j2);
    }

    private static void d(final ReportDataBean reportDataBean, final long j, final long j2) {
        reportDataBean.getTaskList().add(new Callable<Void>() { // from class: ouj.15
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                ouj.a(reportDataBean, j, j2);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final ReportDataBean reportDataBean, long j, long j2) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        jxh.a(j, j2, new IBaseResponseCallback() { // from class: ouj.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && obj != null) {
                    MotionPath motionPathB = ouj.b(obj, (List<Integer>) ouj.b(reportDataBean), reportDataBean);
                    if (motionPathB != null) {
                        ouj.d(reportDataBean, motionPathB);
                    } else {
                        LogUtil.e("PLGACHIEVE_AchieveReportHelper", "getTrackDetailData motion path is null");
                    }
                } else {
                    LogUtil.e("PLGACHIEVE_AchieveReportHelper", "getTrackDetailData Not return valid data");
                }
                countDownLatch.countDown();
            }
        });
        d(countDownLatch, 8000L, "getTrackDetailData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(ReportDataBean reportDataBean, MotionPath motionPath) {
        if (reportDataBean instanceof ReportRowData) {
            ReportRowData reportRowData = (ReportRowData) reportDataBean;
            List<nji> listRequestPaddleFrequencyList = motionPath.requestPaddleFrequencyList();
            if (njy.e(listRequestPaddleFrequencyList)) {
                return;
            }
            reportRowData.setMaxPaddle(Math.max(reportRowData.getMaxPaddle(), a(listRequestPaddleFrequencyList)));
            return;
        }
        if (reportDataBean instanceof ReportRunData) {
            ReportRunData reportRunData = (ReportRunData) reportDataBean;
            Map<Integer, Float> mapLocalePaceMap = motionPath.localePaceMap();
            if (mapLocalePaceMap == null) {
                e(reportRunData, motionPath);
                return;
            } else {
                a(reportRunData, mapLocalePaceMap, motionPath);
                return;
            }
        }
        if (reportDataBean instanceof ReportSwimData) {
            ReportSwimData reportSwimData = (ReportSwimData) reportDataBean;
            List<njq> listRequestSwolfList = motionPath.requestSwolfList();
            if (!njy.e(listRequestSwolfList)) {
                reportSwimData.setBestSwolf(Math.min(reportSwimData.getBestSwolf(), b(listRequestSwolfList)));
            }
            List<njp> listRequestPullFreqList = motionPath.requestPullFreqList();
            if (njy.e(listRequestPullFreqList)) {
                return;
            }
            reportSwimData.setBestFreq(Math.max(reportSwimData.getBestFreq(), e(listRequestPullFreqList)));
        }
    }

    private static void e(ReportRunData reportRunData, MotionPath motionPath) {
        List<njl> listRequestRealTimePaceList = motionPath.requestRealTimePaceList();
        if (njy.e(listRequestRealTimePaceList)) {
            return;
        }
        reportRunData.setBestPace(Math.min(reportRunData.getBestPace(), c(listRequestRealTimePaceList)));
        reportRunData.setBritishBestPace(Math.round(UnitUtil.c(reportRunData.getBestPace(), 3)));
    }

    private static void a(ReportRunData reportRunData, Map<Integer, Float> map, MotionPath motionPath) {
        float fFloatValue = izn.b(izn.a(map))[0].floatValue();
        if (fFloatValue == 0.0f) {
            e(reportRunData, motionPath);
        } else {
            reportRunData.setBestPace(Math.min(reportRunData.getBestPace(), fFloatValue));
            reportRunData.setBritishBestPace(Math.round(UnitUtil.c(reportRunData.getBestPace(), 3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Integer> b(ReportDataBean reportDataBean) {
        if (reportDataBean instanceof ReportRowData) {
            return new ArrayList<Integer>() { // from class: ouj.14
                {
                    add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE));
                }
            };
        }
        if (reportDataBean instanceof ReportRunData) {
            return f44799c;
        }
        if (reportDataBean instanceof ReportRideData) {
            return f44798b;
        }
        if (reportDataBean instanceof ReportSwimData) {
            return new ArrayList<Integer>() { // from class: ouj.13
                {
                    add(262);
                    add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM));
                }
            };
        }
        return new ArrayList(0);
    }

    private static float a(List<nji> list) {
        return ((nji) Collections.max(list, new Comparator() { // from class: oug
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ouj.e((nji) obj, (nji) obj2);
            }
        })).c();
    }

    static /* synthetic */ int e(nji njiVar, nji njiVar2) {
        if (njiVar.c() - njiVar2.c() < 0.0f) {
            return -1;
        }
        return njiVar.c() - njiVar2.c() == 0.0f ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> MotionPath b(T t, List<Integer> list, ReportDataBean reportDataBean) {
        if (!(t instanceof njd)) {
            LogUtil.e("PLGACHIEVE_AchieveReportHelper", "object Data is not fit path data ");
            return null;
        }
        njd njdVar = (njd) t;
        MotionPathSimplify motionPathSimplifyC = njdVar.c();
        if (motionPathSimplifyC.requestAbnormalTrack() != 0 || motionPathSimplifyC.requestDuplicated() != 0 || !list.contains(Integer.valueOf(motionPathSimplifyC.requestSportType()))) {
            return null;
        }
        d(reportDataBean, motionPathSimplifyC);
        String str = BaseApplication.getContext().getFilesDir().getPath() + File.separator + njdVar.b();
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.j("PLGACHIEVE_AchieveReportHelper", "getMotionPath: untrusted -> " + str);
            return null;
        }
        if (new File(str).exists()) {
            return jac.b(BaseApplication.getContext(), njdVar.b());
        }
        LogUtil.e("PLGACHIEVE_AchieveReportHelper", "file not exist");
        return null;
    }

    private static void d(ReportDataBean reportDataBean, MotionPathSimplify motionPathSimplify) {
        if (reportDataBean instanceof ReportRowData) {
            ReportRowData reportRowData = (ReportRowData) reportDataBean;
            reportRowData.setMaxPaddleTimes(Math.max(reportRowData.getMaxPaddleTimes(), motionPathSimplify.requestTotalSteps()));
            return;
        }
        if (reportDataBean instanceof ReportSwimData) {
            ReportSwimData reportSwimData = (ReportSwimData) reportDataBean;
            Integer num = motionPathSimplify.requestSportData().get("swim_stroke");
            if (num != null) {
                if (reportSwimData.getStroke().containsKey(num)) {
                    reportSwimData.getStroke().put(num, Integer.valueOf(reportSwimData.getStroke().get(num).intValue() + 1));
                    return;
                } else {
                    reportSwimData.getStroke().put(num, 1);
                    return;
                }
            }
            return;
        }
        if (reportDataBean instanceof ReportRideData) {
            ReportRideData reportRideData = (ReportRideData) reportDataBean;
            float fRequestBestPace = motionPathSimplify.requestBestPace();
            if (Float.compare(fRequestBestPace, 0.0f) <= 0) {
                return;
            }
            if (reportRideData.getBestPace() < 1.0E-6d) {
                reportRideData.setBestPace(fRequestBestPace);
            } else {
                reportRideData.setBestPace(Math.min(reportRideData.getBestPace(), fRequestBestPace));
            }
            LogUtil.a("PLGACHIEVE_AchieveReportHelper", "reportRideData getBestPace() = ", Double.valueOf(reportRideData.getBestPace()));
        }
    }

    private static void b(ReportCrossTrainerData reportCrossTrainerData, HiTrackMetaData hiTrackMetaData) {
        reportCrossTrainerData.setSumTime(reportCrossTrainerData.getSumTime() + hiTrackMetaData.getTotalTime());
        reportCrossTrainerData.setMaxTime(Math.max(reportCrossTrainerData.getMaxTime(), hiTrackMetaData.getTotalTime()));
        reportCrossTrainerData.setSportCount(reportCrossTrainerData.getSportCount() + 1);
        reportCrossTrainerData.setSumCalorie(reportCrossTrainerData.getSumCalorie() + hiTrackMetaData.getTotalCalories());
    }

    private static void e(ReportClimbData reportClimbData, HiTrackMetaData hiTrackMetaData) {
        reportClimbData.setSumDistance(reportClimbData.getSumDistance() + hiTrackMetaData.getTotalDistance());
        reportClimbData.setSumTime(reportClimbData.getSumTime() + hiTrackMetaData.getTotalTime());
        reportClimbData.setMaxHeight(Math.max(hiTrackMetaData.getMaxAlti(), reportClimbData.getMaxHeight()));
        reportClimbData.setSumHeight(reportClimbData.getSumHeight() + hiTrackMetaData.getCreepingWave());
        reportClimbData.setSportCount(reportClimbData.getSportCount() + 1);
    }

    public static void d(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        ReportDataBean reportDataBeanA = a(map, 259);
        if (reportDataBeanA instanceof ReportRideData) {
            ReportRideData reportRideData = (ReportRideData) reportDataBeanA;
            reportRideData.setMaxDistance(Math.max(reportRideData.getMaxDistance(), hiHealthData.getInt("Track_Ride_Longest_Distance")));
        }
        ReportDataBean reportDataBeanA2 = a(map, 262);
        if (reportDataBeanA2 instanceof ReportSwimData) {
            ReportSwimData reportSwimData = (ReportSwimData) reportDataBeanA2;
            reportSwimData.setMaxDistance(Math.max(reportSwimData.getMaxDistance(), hiHealthData.getInt("Track_Swim_Longest_Distance")));
        }
    }

    public static ReportDataBean a(Map<Integer, ReportDataBean> map, int i) {
        ReportDataBean reportSwimData = map.get(Integer.valueOf(i));
        if (reportSwimData == null) {
            if (i == 262) {
                reportSwimData = new ReportSwimData(0);
            } else if (i == 280) {
                reportSwimData = new ReportTrailRunData(0);
            } else if (i == 282) {
                reportSwimData = new ReportHikingData(0);
            } else if (i == 10001) {
                reportSwimData = new ReportFitnessData(0);
            } else if (i == 273) {
                reportSwimData = new ReportCrossTrainerData(0);
            } else if (i != 274) {
                switch (i) {
                    case 257:
                        reportSwimData = new ReportWalkData(0);
                        break;
                    case 258:
                        reportSwimData = new ReportRunData(0);
                        break;
                    case 259:
                        reportSwimData = new ReportRideData(0);
                        break;
                    case 260:
                        reportSwimData = new ReportClimbData(0);
                        break;
                    default:
                        reportSwimData = new ReportOtherData(i, 0);
                        break;
                }
            } else {
                reportSwimData = new ReportRowData(0);
            }
            map.put(Integer.valueOf(i), reportSwimData);
        }
        return reportSwimData;
    }

    public static void e(HashMap<String, Integer> map, int i, int i2) {
        map.put("type", Integer.valueOf(i));
        map.put("sumDuration", 0);
        map.put("sumDis", 0);
        map.put("sumCount", 0);
        map.put("sumSteps", 0);
        map.put("avgSteps", 0);
        map.put(ParsedFieldTag.MAX_STEPS, Integer.valueOf(i2));
        map.put("haveStepDays", 0);
    }

    public static void a(HashMap<String, Integer> map, HiHealthData hiHealthData) {
        int iIntValue = map.get("sumDuration").intValue();
        int iIntValue2 = map.get("sumDis").intValue();
        int iIntValue3 = map.get("sumCount").intValue();
        int i = hiHealthData.getInt("Track_Run_Duration_Sum");
        int i2 = hiHealthData.getInt("Track_Run_Distance_Sum");
        int i3 = hiHealthData.getInt("Track_Run_Count_Sum");
        int i4 = hiHealthData.getInt("Track_Run_Abnormal_Count_Sum");
        int iIntValue4 = map.get(ParsedFieldTag.MAX_STEPS).intValue();
        if (hiHealthData.getInt("sport_walk_step_sum") > iIntValue4) {
            iIntValue4 = hiHealthData.getInt("sport_walk_step_sum");
        }
        int iIntValue5 = map.get("sumSteps").intValue();
        int i5 = hiHealthData.getInt("sport_walk_step_sum");
        int iIntValue6 = map.get("haveStepDays").intValue();
        if (hiHealthData.getInt("sport_walk_step_sum") != 0) {
            iIntValue6++;
        }
        map.put("sumDuration", Integer.valueOf(iIntValue + i));
        map.put("sumDis", Integer.valueOf(iIntValue2 + i2));
        map.put("sumCount", Integer.valueOf(iIntValue3 + (i3 - i4)));
        map.put("sumSteps", Integer.valueOf(iIntValue5 + i5));
        map.put(ParsedFieldTag.MAX_STEPS, Integer.valueOf(iIntValue4));
        map.put("haveStepDays", Integer.valueOf(iIntValue6));
    }

    public static void b(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        e(map, hiHealthData);
        c(map, hiHealthData);
        f(map, hiHealthData);
        a(map, hiHealthData);
        h(map, hiHealthData);
    }

    public static float c(HiHealthData hiHealthData) {
        float f = hiHealthData.getFloat("sport_run_calorie_sum");
        float f2 = hiHealthData.getFloat("sport_cycle_calorie_sum");
        float f3 = hiHealthData.getFloat("sport_climb_calorie_sum");
        return Math.max(f + f2 + f3 + hiHealthData.getFloat("sport_walk_calorie_sum"), hiHealthData.getFloat("sport_calorie_sum"));
    }

    private static void e(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        ReportDataBean reportDataBeanA = a(map, 258);
        if (reportDataBeanA instanceof ReportRunData) {
            ReportRunData reportRunData = (ReportRunData) reportDataBeanA;
            reportRunData.setSumCalorie(reportRunData.getSumCalorie() + hiHealthData.getFloat("sport_run_calorie_sum"));
        }
    }

    private static void c(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        ReportDataBean reportDataBeanA = a(map, 259);
        if (reportDataBeanA instanceof ReportRideData) {
            ReportRideData reportRideData = (ReportRideData) reportDataBeanA;
            reportRideData.setSumDistance(reportRideData.getSumDistance() + hiHealthData.getInt("Track_Ride_Distance_Sum"));
            reportRideData.setSumTime(reportRideData.getSumTime() + hiHealthData.getLong("Track_Ride_Duration_Sum"));
            reportRideData.setSumCalorie(reportRideData.getSumCalorie() + hiHealthData.getFloat("sport_cycle_calorie_sum"));
            reportRideData.setSportCount((reportRideData.getSportCount() + hiHealthData.getInt("Track_Ride_Count_Sum")) - hiHealthData.getInt("Track_Ride_Abnormal_Count_Sum"));
            reportRideData.setSumCreepingWave(reportRideData.getSumCreepingWave() + hiHealthData.getInt("Track_Ride_CreepingWave"));
        }
    }

    private static void f(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        ReportDataBean reportDataBeanA = a(map, 262);
        if (reportDataBeanA instanceof ReportSwimData) {
            ReportSwimData reportSwimData = (ReportSwimData) reportDataBeanA;
            reportSwimData.setSumDistance(reportSwimData.getSumDistance() + hiHealthData.getInt("Track_Swim_Distance_Sum"));
            reportSwimData.setSumTime(reportSwimData.getSumTime() + hiHealthData.getLong("Track_Swim_Duration_Sum"));
            reportSwimData.setSportCount((reportSwimData.getSportCount() + hiHealthData.getInt("Track_Swim_Count_Sum")) - hiHealthData.getInt("Track_Swim_Abnormal_Count_Sum"));
        }
    }

    private static void a(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        ReportDataBean reportDataBeanA = a(map, 260);
        if (reportDataBeanA instanceof ReportClimbData) {
            ReportClimbData reportClimbData = (ReportClimbData) reportDataBeanA;
            reportClimbData.setSumCalorie(reportClimbData.getSumCalorie() + hiHealthData.getFloat("sport_climb_calorie_sum"));
        }
    }

    private static void h(Map<Integer, ReportDataBean> map, HiHealthData hiHealthData) {
        ReportDataBean reportDataBeanA = a(map, 257);
        if (reportDataBeanA instanceof ReportWalkData) {
            ReportWalkData reportWalkData = (ReportWalkData) reportDataBeanA;
            reportWalkData.setSumCalorie(reportWalkData.getSumCalorie() + hiHealthData.getFloat("sport_walk_calorie_sum"));
        }
    }

    public static void c(final ReportFitnessData reportFitnessData, final AnnualReportFitnessRaw annualReportFitnessRaw) {
        reportFitnessData.getTaskList().add(new Callable<Void>() { // from class: ouj.18
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public Void call() {
                ouj.e(reportFitnessData, annualReportFitnessRaw);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(ReportFitnessData reportFitnessData, AnnualReportFitnessRaw annualReportFitnessRaw) {
        List[] listArr = {null};
        if (a(annualReportFitnessRaw, (List<Attribute>[]) listArr)) {
            if (!njy.e(listArr[0])) {
                for (Attribute attribute : listArr[0]) {
                    Integer num = reportFitnessData.getTrainingPointsMap().get(attribute.getId());
                    if (num == null) {
                        reportFitnessData.getTrainingPointsMap().put(attribute.getId(), 1);
                    } else {
                        reportFitnessData.getTrainingPointsMap().put(attribute.getId(), Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            long jAcquireDuring = annualReportFitnessRaw.acquireDuring();
            reportFitnessData.setSumTime(reportFitnessData.getSumTime() + jAcquireDuring);
            reportFitnessData.setMaxTime(Math.max(reportFitnessData.getMaxTime(), jAcquireDuring));
            reportFitnessData.setSportCount(reportFitnessData.getSportCount() + 1);
            reportFitnessData.setSumCalorie(reportFitnessData.getSumCalorie() + annualReportFitnessRaw.acquireCalorie());
            List<Classify> primaryClassify = annualReportFitnessRaw.getPrimaryClassify();
            if (njy.e(primaryClassify)) {
                return;
            }
            String classifyName = primaryClassify.get(0).getClassifyName();
            if (primaryClassify.get(0).getClassifyId() == 14617 && primaryClassify.size() > 1) {
                classifyName = primaryClassify.get(1).getClassifyName();
            }
            Integer num2 = reportFitnessData.getFirstLevelMap().get(classifyName);
            if (num2 == null) {
                reportFitnessData.getFirstLevelMap().put(classifyName, 1);
            } else {
                reportFitnessData.getFirstLevelMap().put(classifyName, Integer.valueOf(num2.intValue() + 1));
            }
            String strAcquireWorkoutName = annualReportFitnessRaw.acquireWorkoutName();
            Integer num3 = reportFitnessData.getCourseMap().get(strAcquireWorkoutName);
            if (num3 == null) {
                reportFitnessData.getCourseMap().put(strAcquireWorkoutName, 1);
            } else {
                reportFitnessData.getCourseMap().put(strAcquireWorkoutName, Integer.valueOf(num3.intValue() + 1));
            }
        }
    }

    private static boolean a(AnnualReportFitnessRaw annualReportFitnessRaw, final List<Attribute>[] listArr) {
        String strAcquireWorkoutId = annualReportFitnessRaw.acquireWorkoutId();
        String strAcquireVersion = annualReportFitnessRaw.acquireVersion();
        final boolean[] zArr = {false};
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("PLGACHIEVE_AchieveReportHelper", "getTrainingPoints : courseApi is null.");
            return zArr[0];
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        courseApi.getCourseById(strAcquireWorkoutId, strAcquireVersion, null, new UiCallback<Workout>() { // from class: ouj.1
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.j("PLGACHIEVE_AchieveReportHelper", "getTrainingPoints : errorCode " + i, " errorInfo：" + str);
                listArr[0] = null;
                countDownLatch.countDown();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Workout workout) {
                if (workout instanceof FitWorkout) {
                    FitWorkout fitWorkout = (FitWorkout) workout;
                    listArr[0] = fitWorkout.acquireTrainingpoints();
                    if (fitWorkout.getWorkoutType() == 1) {
                        zArr[0] = true;
                    }
                }
                countDownLatch.countDown();
            }
        });
        d(countDownLatch, 8000L, "getTrainingPoints");
        return zArr[0];
    }

    public static List<HiHealthData> d(long j, long j2, int i) {
        final List<HiHealthData>[] listArr = {null};
        Context context = BaseApplication.getContext();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oru.a(context).getAdapter().getSumData(context, j, j2, i, new AchieveCallback() { // from class: ouj.2
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj == null) {
                    countDownLatch.countDown();
                    LogUtil.j("PLGACHIEVE_AchieveReportHelper", "getSumData obj  == null");
                    return;
                }
                try {
                    listArr[0] = (List) obj;
                } catch (ClassCastException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveReportHelper", "getSumData data ClassCastException");
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        d(countDownLatch, 8000L, "getSumData");
        return listArr[0];
    }

    private static List<HiHealthData> a(long j, long j2, int i) {
        final List<HiHealthData>[] listArr = {null};
        Context context = BaseApplication.getContext();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oru.a(context).getAdapter().getReportStatistics(context, j, j2, i, new AchieveCallback() { // from class: ouj.3
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj == null) {
                    countDownLatch.countDown();
                    LogUtil.j("PLGACHIEVE_AchieveReportHelper", "getReportStatistics obj  == null");
                    return;
                }
                try {
                    listArr[0] = (List) obj;
                } catch (ClassCastException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveReportHelper", "getReportDataSum");
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        d(countDownLatch, 8000L, "getReportDataSum");
        return listArr[0];
    }

    public static List<HiHealthData> c(long j, long j2) {
        return a(j, j2, 1);
    }

    public static List<HiHealthData> a(long j, long j2) {
        return a(j, j2, 4);
    }

    public static List<HiHealthData> c(long j, long j2, final int i) {
        final List<HiHealthData>[] listArr = {null};
        Context context = BaseApplication.getContext();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oru.a(context).getAdapter().fetchSequenceDataBySportType(context, j, j2, i, new AchieveCallback() { // from class: ouj.4
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj == null) {
                    countDownLatch.countDown();
                    LogUtil.j("PLGACHIEVE_AchieveReportHelper", "getSingleData obj  == null");
                    return;
                }
                try {
                    listArr[0] = (List) obj;
                } catch (ClassCastException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveReportHelper", "fetchSequenceDataBySportType ", Integer.valueOf(i));
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        d(countDownLatch, 8000L, "getSingleData" + i);
        return listArr[0];
    }

    public static ArrayList<AnnualReportFitnessRaw> e(long j, long j2) {
        final ArrayList<AnnualReportFitnessRaw>[] arrayListArr = {null};
        Context context = BaseApplication.getContext();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        oru.a(context).getAdapter().getAnnualFitnessRecord(context, j, j2, new AchieveCallback() { // from class: ouj.6
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i, Object obj) {
                if (obj == null) {
                    LogUtil.a("PLGACHIEVE_AchieveReportHelper", "fitnessRecords is null");
                    countDownLatch.countDown();
                } else {
                    if (obj instanceof ArrayList) {
                        arrayListArr[0] = (ArrayList) obj;
                    }
                    countDownLatch.countDown();
                }
            }
        });
        d(countDownLatch, 8000L, "getFitnessReportData");
        return arrayListArr[0];
    }

    public static void d(CountDownLatch countDownLatch, long j, String str) {
        try {
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                return;
            }
        } catch (InterruptedException unused) {
            LogUtil.e("PLGACHIEVE_AchieveReportHelper", "countDownLatch InterruptedException" + str);
        }
        LogUtil.j("PLGACHIEVE_AchieveReportHelper", str + " task is not finish!!");
    }

    public static void a(Map<String, Integer> map) {
        if (map.get("haveStepDays").intValue() != 0) {
            map.put("avgSteps", Integer.valueOf(Math.round((map.get("sumSteps").intValue() * 1.0f) / map.get("haveStepDays").intValue())));
        }
    }

    public static void b(Map<Integer, ReportDataBean> map) {
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<Integer, ReportDataBean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            ReportDataBean value = it.next().getValue();
            value.setSumTime(Math.round(value.getSumTime() / 1000.0d));
            value.setMaxTime(Math.round(value.getMaxTime() / 1000.0d));
        }
    }

    public static void d(Task<Void> task, final CountDownLatch countDownLatch) {
        task.addOnCompleteListener(new OnCompleteListener<Void>() { // from class: ouj.10
            @Override // com.huawei.hmf.tasks.OnCompleteListener
            public void onComplete(Task<Void> task2) {
                countDownLatch.countDown();
            }
        });
    }

    public static ArrayList<Map.Entry<String, Long>> d(long j, long j2) {
        HashMap map = new HashMap(0);
        List<osf> listD = otl.b(BaseApplication.getContext()).d(8, new HashMap(2));
        if (njy.e(listD)) {
            return new ArrayList<>(0);
        }
        for (osf osfVar : listD) {
            if (osfVar instanceof MedalLocation) {
                MedalLocation medalLocation = (MedalLocation) osfVar;
                if (medalLocation.acquireGainedCount() > 0) {
                    long jF = qrs.f(medalLocation.acquireMedalGainedTime());
                    if (jF >= j && jF <= j2) {
                        map.put(medalLocation.acquireMedalID(), Long.valueOf(jF));
                    }
                }
            }
        }
        ArrayList<Map.Entry<String, Long>> arrayList = new ArrayList<>(0);
        if (map.size() > 0) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((Map.Entry) it.next());
            }
            Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() { // from class: ouj.9
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                    return Long.compare(entry2.getValue().longValue(), entry.getValue().longValue());
                }
            });
        }
        return arrayList;
    }
}
