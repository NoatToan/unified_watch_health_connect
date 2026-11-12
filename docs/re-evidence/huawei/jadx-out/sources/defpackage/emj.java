package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import androidx.core.util.Pair;
import com.google.gson.Gson;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.open.data.model.RopeBestRecord;
import com.huawei.health.ecologydevice.open.data.model.RopeBestRecordBean;
import com.huawei.health.ecologydevice.open.data.model.RopePerformance;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.ui.commonui.linechart.common.DateType;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class emj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile emj f33182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f33183b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f33184c;
    private final Map<String, String> d;
    private String e;
    private float f;
    private RopePerformance h;

    static /* synthetic */ void a(int i, Object obj) {
    }

    private emj() {
        HashMap map = new HashMap(10);
        this.d = map;
        this.f33184c = BaseApplication.getContext();
        map.put("maxSkipSpeedRank", "fastedRopeSpeed");
        map.put("enduranceAbilityRank", "ropeSpeedEndurance");
        map.put("enduranceTimeAbilityRank", "ropeEnduranceTime");
        map.put("skipNumAbilityRank", "ropeSkipNum");
        map.put("maxSkippingTimesAbilityRank", "maxRopeSkippingTimes");
    }

    public static emj b() {
        emj emjVar;
        if (f33182a == null) {
            synchronized (f33183b) {
                if (f33182a == null) {
                    f33182a = new emj();
                }
                emjVar = f33182a;
            }
            return emjVar;
        }
        return f33182a;
    }

    public void c() {
        e(new IBaseResponseCallback() { // from class: emf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                emj.a(i, obj);
            }
        });
        a(new IBaseResponseCallback() { // from class: emg
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.d("RopePerformanceHelper", "initData requestPerformanceBestOfHistory errorCode = ", Integer.valueOf(i));
            }
        });
        b(new IBaseResponseCallback() { // from class: emn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.d("RopePerformanceHelper", "initData requestPerformanceBestOfMonth errorCode = ", Integer.valueOf(i));
            }
        });
    }

    public float a(String str, float f, DateType dateType) {
        if (TextUtils.isEmpty(str) || etn.b(f, 0.0f) <= 0) {
            LogUtil.a("RopePerformanceHelper", "category is null or score <= 0");
            return 0.0f;
        }
        this.e = str;
        this.f = f;
        if (dateType == DateType.DATE_NONE) {
            return e(d());
        }
        if (dateType == DateType.DATE_MONTH) {
            return e(e());
        }
        LogUtil.a("RopePerformanceHelper", "Unsupported time type!");
        return 0.0f;
    }

    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        GRSManager.c(BaseApplication.getContext()).d("healthCloudUrl", new GrsQueryCallback() { // from class: emj.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                Map<String, String> mapAddPublicHeaders = HealthEngineRequestManager.addPublicHeaders();
                Map mapB = emj.this.b(HealthEngineRequestManager.addPublicParams());
                emj.this.h = (RopePerformance) oet.d().e(str + "/dataRecommend/getPopulationStat", mapAddPublicHeaders, ofe.c((Object) mapB), RopePerformance.class);
                emj.this.c(iBaseResponseCallback);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("RopePerformanceHelper", "requestPerformanceRank getUrl failed resultCode = ", Integer.valueOf(i));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void d(IBaseResponseCallback iBaseResponseCallback, DateType dateType) {
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            c(iBaseResponseCallback, dateType);
            return;
        }
        if (dateType == DateType.DATE_ALL) {
            a(iBaseResponseCallback);
        } else if (dateType == DateType.DATE_MONTH) {
            b(iBaseResponseCallback);
        } else {
            LogUtil.j("RopePerformanceHelper", "quaryPerformanceOfBest() error dateType");
            iBaseResponseCallback.a(-1, null);
        }
    }

    private void c(IBaseResponseCallback iBaseResponseCallback, DateType dateType) {
        String strE;
        LogUtil.a("RopePerformanceHelper", "quaryBestDataFromCache() dateType = ", dateType);
        if (dateType == DateType.DATE_ALL) {
            strE = SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_best_of_history");
        } else if (dateType == DateType.DATE_MONTH) {
            strE = SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_best_of_month");
        } else {
            LogUtil.j("RopePerformanceHelper", "quaryBestDataFromCache() error dateType");
            strE = null;
        }
        if (strE == null) {
            LogUtil.j("RopePerformanceHelper", "quaryBestDataFromCache() bestDataJson is null");
            iBaseResponseCallback.a(-1, null);
        } else {
            e((RopeBestRecord.BestRecordData) new Gson().fromJson(strE, RopeBestRecord.BestRecordData.class), iBaseResponseCallback);
        }
    }

    public void a(final IBaseResponseCallback iBaseResponseCallback) {
        GRSManager.c(BaseApplication.getContext()).d("healthCloudUrl", new GrsQueryCallback() { // from class: emj.4
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                Map<String, Object> mapAddPublicParams = HealthEngineRequestManager.addPublicParams();
                mapAddPublicParams.put("bestItems", emj.this.a());
                Map<String, String> mapAddPublicHeaders = HealthEngineRequestManager.addPublicHeaders();
                RopeBestRecord ropeBestRecord = (RopeBestRecord) oet.d().e(str + "/dataQuery/report/getPersonalReport", mapAddPublicHeaders, ofe.c(mapAddPublicParams), RopeBestRecord.class);
                if (ropeBestRecord == null) {
                    LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfHistory() ropeBestRecordData is null");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    if (ropeBestRecord.getResultCode() != 0) {
                        LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfHistory fail resultCode is ", Integer.valueOf(ropeBestRecord.getResultCode()), " resultDesc is ", ropeBestRecord.getResultDesc());
                        iBaseResponseCallback.a(-1, null);
                        return;
                    }
                    RopeBestRecord.BestRecordData bestReports = ropeBestRecord.getBestReports();
                    emj.this.e(bestReports, iBaseResponseCallback);
                    SharedPreferenceManager.e(emj.this.f33184c, "rope_performance_cache", "rope_cache_key_best_of_history", ofe.c(bestReports), null);
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfHistory getUrl failed resultCode = ", Integer.valueOf(i));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    public void b(final IBaseResponseCallback iBaseResponseCallback) {
        GRSManager.c(BaseApplication.getContext()).d("healthCloudUrl", new GrsQueryCallback() { // from class: emj.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                Map<String, Object> mapAddPublicParams = HealthEngineRequestManager.addPublicParams();
                mapAddPublicParams.put("bestItems", emj.this.a());
                mapAddPublicParams.put("queryType", 1);
                mapAddPublicParams.put("startTime", Long.valueOf(emj.this.d(0)));
                mapAddPublicParams.put("endTime", Long.valueOf(emj.this.d(1) - 1000));
                mapAddPublicParams.put("timeZone", HiDateUtil.c((String) null));
                Map<String, String> mapAddPublicHeaders = HealthEngineRequestManager.addPublicHeaders();
                RopeBestRecord ropeBestRecord = (RopeBestRecord) oet.d().e(str + "/dataQuery/report/getCycleReport", mapAddPublicHeaders, ofe.c(mapAddPublicParams), RopeBestRecord.class);
                if (ropeBestRecord == null) {
                    LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfMonth() ropeBestRecordData is null");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                if (ropeBestRecord.getResultCode() != 0) {
                    LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfMonth fail resultCode is ", Integer.valueOf(ropeBestRecord.getResultCode()), " resultDesc is ", ropeBestRecord.getResultDesc());
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                RopeBestRecord.UserCycleReportData userCycleReport = ropeBestRecord.getUserCycleReport();
                if (userCycleReport == null) {
                    LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfMonth userCycleReport is null");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    RopeBestRecord.BestRecordData bestReports = userCycleReport.getBestReports();
                    emj.this.e(bestReports, iBaseResponseCallback);
                    SharedPreferenceManager.e(emj.this.f33184c, "rope_performance_cache", "rope_cache_key_best_of_month", ofe.c(bestReports), null);
                }
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.j("RopePerformanceHelper", "requestPerformanceBestOfMonth getUrl failed resultCode = ", Integer.valueOf(i));
                iBaseResponseCallback.a(-1, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add(ParsedFieldTag.BEST_ROPE_SINGLE_COUNT);
        hashSet.add(ParsedFieldTag.BEST_ROPE_CONTINUOUS_COUNT);
        hashSet.add("bestRopeSkippingMaxSpeed1MIN");
        hashSet.add("bestRopeSkippingEnduranceAbility");
        hashSet.add("bestRopeSkippingEnduranceTimeAbility");
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long d(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, i);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(RopeBestRecord.BestRecordData bestRecordData, IBaseResponseCallback iBaseResponseCallback) {
        if (bestRecordData == null) {
            LogUtil.j("RopePerformanceHelper", "convertBestData() bestRecordData is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        float fC = c(bestRecordData.getBestRopeSkippingMaxSpeed1MIN());
        float fA = a("maxSkipSpeedRank", fC, DateType.DATE_NONE);
        float fC2 = c(bestRecordData.getBestRopeSkippingEnduranceTimeAbility()) / 60.0f;
        float fA2 = a("enduranceTimeAbilityRank", c(bestRecordData.getBestRopeSkippingEnduranceTimeAbility()), DateType.DATE_NONE);
        float fC3 = c(bestRecordData.getBestRopeSkippingContinuousCount());
        float fA3 = a("maxSkippingTimesAbilityRank", fC3, DateType.DATE_NONE);
        float fC4 = c(bestRecordData.getBestRopeSkippingSingleCount());
        float fA4 = a("skipNumAbilityRank", fC4, DateType.DATE_NONE);
        float fC5 = c(bestRecordData.getBestRopeSkippingEnduranceAbility());
        float[] fArr = {fC, fC2, fC3, fC4, fC5};
        float[] fArr2 = {fA, fA2, fA3, fA4, a("enduranceAbilityRank", fC5, DateType.DATE_NONE)};
        if (b(fArr) || b(fArr2)) {
            LogUtil.a("RopePerformanceHelper", "value or rank is invalid value");
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(0, new Pair(fArr, fArr2));
        }
    }

    private boolean b(float[] fArr) {
        for (float f : fArr) {
            if (etn.b(f, 0.0f) > 0) {
                return false;
            }
        }
        return true;
    }

    private int c(List<RopeBestRecordBean> list) {
        if (njy.e(list)) {
            return 0;
        }
        Collections.sort(list, new Comparator() { // from class: emi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((RopeBestRecordBean) obj2).getValue(), ((RopeBestRecordBean) obj).getValue());
            }
        });
        return list.get(0).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("RopePerformanceHelper", "enter handleRankData");
        RopePerformance ropePerformance = this.h;
        if (ropePerformance == null) {
            LogUtil.j("RopePerformanceHelper", "mRopePerformance is null.");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        if (ropePerformance.getResultCode() != 0) {
            LogUtil.j("RopePerformanceHelper", "Failed to handleRankData.");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        List<RopePerformance.Performance> populationStats = this.h.getPopulationStats();
        if (e(d(), populationStats)) {
            b(populationStats);
        } else {
            LogUtil.d("RopePerformanceHelper", "handleRankData same cache current data.");
        }
        if (njy.e(e())) {
            a(populationStats);
        }
        iBaseResponseCallback.a(0, populationStats);
    }

    private float e(List<RopePerformance.Performance> list) {
        if (njy.e(list)) {
            LogUtil.a("RopePerformanceHelper", "parseRankData performances is null");
            return 0.0f;
        }
        for (RopePerformance.Performance performance : list) {
            if (performance != null) {
                if (Objects.equals(this.d.get(this.e), performance.getPortraitCategory())) {
                    return d(performance.getPortraitValue());
                }
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x016b A[LOOP:1: B:7:0x004f->B:30:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0155 A[SYNTHETIC] */
    private float d(List<RopePerformance.Rank> list) {
        ArrayList arrayList;
        float f;
        LogUtil.a("RopePerformanceHelper", "enter calculateRank");
        Collections.sort(list, new Comparator() { // from class: emo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return etn.b(((RopePerformance.Rank) obj).getValue(), ((RopePerformance.Rank) obj2).getValue());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (RopePerformance.Rank rank : list) {
            arrayList2.add(Float.valueOf(rank.getThreshold()));
            arrayList3.add(Float.valueOf(rank.getValue()));
        }
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        float fFloatValue = 0.0f;
        while (i2 < size) {
            if (etn.b(((Float) arrayList2.get(i)).floatValue(), this.f) == 1) {
                fFloatValue = 1.0f;
            } else if (etn.b(((Float) arrayList2.get(size - 1)).floatValue(), this.f) == -1) {
                fFloatValue = 100.0f;
            } else {
                if (etn.b(((Float) arrayList2.get(i2)).floatValue(), this.f) == 0) {
                    fFloatValue = ((Float) arrayList3.get(i2)).floatValue();
                } else {
                    if (etn.b(((Float) arrayList2.get(i2)).floatValue(), this.f) == 1) {
                        Float f2 = (Float) arrayList2.get(i2);
                        float fFloatValue2 = f2.floatValue();
                        int i3 = i2 - 1;
                        Float f3 = (Float) arrayList2.get(i3);
                        float fFloatValue3 = f3.floatValue();
                        Float f4 = (Float) arrayList3.get(i2);
                        float fFloatValue4 = f4.floatValue();
                        Float f5 = (Float) arrayList3.get(i3);
                        float fFloatValue5 = f5.floatValue();
                        arrayList = arrayList2;
                        LogUtil.a("RopePerformanceHelper", "maxThreshold = ", f2, ", minThreshold = ", f3, ", maxValue = ", f4, ", minValue = ", f5);
                        BigDecimal bigDecimal = new BigDecimal(fFloatValue2);
                        BigDecimal bigDecimal2 = new BigDecimal(fFloatValue3);
                        BigDecimal bigDecimal3 = new BigDecimal(fFloatValue4);
                        BigDecimal bigDecimal4 = new BigDecimal(fFloatValue5);
                        BigDecimal bigDecimalB = b(new BigDecimal(this.f).subtract(bigDecimal2), bigDecimal.subtract(bigDecimal2));
                        if (BigDecimal.ZERO.equals(bigDecimalB)) {
                            f = 0.0f;
                            fFloatValue = 0.0f;
                        } else {
                            fFloatValue = bigDecimalB.multiply(bigDecimal3.subtract(bigDecimal4)).add(bigDecimal4).floatValue();
                        }
                    } else {
                        arrayList = arrayList2;
                        LogUtil.d("RopePerformanceHelper", "Unknown!");
                    }
                    f = 0.0f;
                }
                if (fFloatValue != f) {
                    LogUtil.a("RopePerformanceHelper", "calculateRank value = ", Float.valueOf(fFloatValue), ", score = ", Float.valueOf(this.f));
                    return fFloatValue;
                }
                i2++;
                arrayList2 = arrayList;
                i = 0;
            }
            arrayList = arrayList2;
            f = 0.0f;
            if (fFloatValue != f) {
                LogUtil.a("RopePerformanceHelper", "calculateRank value = ", Float.valueOf(fFloatValue), ", score = ", Float.valueOf(this.f));
                return fFloatValue;
            }
            i2++;
            arrayList2 = arrayList;
            i = 0;
        }
        return fFloatValue;
    }

    private BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        try {
            return bigDecimal.divide(bigDecimal2, 1, 4);
        } catch (ArithmeticException unused) {
            return BigDecimal.ZERO;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(Map<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RopePerformance.Performance("fastedRopeSpeed", "-1"));
        arrayList.add(new RopePerformance.Performance("ropeSpeedEndurance", "-1"));
        arrayList.add(new RopePerformance.Performance("ropeEnduranceTime", "-1"));
        arrayList.add(new RopePerformance.Performance("ropeSkipNum", "-1"));
        arrayList.add(new RopePerformance.Performance("maxRopeSkippingTimes", "-1"));
        map.put("categories", arrayList);
        map.put("timeZone", HiDateUtil.c((String) null));
        return map;
    }

    public void b(List<RopePerformance.Performance> list) {
        SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_current_data", lsr.e(list, null), null);
    }

    public void a(List<RopePerformance.Performance> list) {
        String strH = h();
        LogUtil.a("RopePerformanceHelper", "setCacheData time: ", strH);
        String strE = lsr.e(list, null);
        SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_time", strH, null);
        SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_month_data", strE, null);
    }

    public List<RopePerformance.Performance> d() {
        String strE = SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_current_data");
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, getClass().getClassLoader(), null, arrayList);
        return arrayList;
    }

    public List<RopePerformance.Performance> e() {
        String strH = h();
        String strE = SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_time");
        LogUtil.a("RopePerformanceHelper", "getCacheData time: ", strH, ", cacheTime: ", strE);
        if (strH.equals(strE)) {
            String strE2 = SharedPreferenceManager.e(this.f33184c, "rope_performance_cache", "rope_cache_key_month_data");
            ArrayList arrayList = new ArrayList();
            lsr.c(strE2, getClass().getClassLoader(), null, arrayList);
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public boolean e(List<RopePerformance.Performance> list, List<RopePerformance.Performance> list2) {
        if (njy.e(list)) {
            LogUtil.a("RopePerformanceHelper", "isDiff cacheData is null.");
            return true;
        }
        return !lsr.e(list, null).equals(lsr.e(list2, null));
    }

    private String h() {
        return DateUtils.formatDateTime(this.f33184c, System.currentTimeMillis(), 52);
    }
}
