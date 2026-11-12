package defpackage;

import android.content.Context;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.bean.AnnualReportFitnessRaw;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class ovi extends BaseCalculator {
    private long d;
    private long e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PluginAchieveAdapter f44854b = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f44853a = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
        c(i);
        d(i);
        e(i);
    }

    public Map<String, Double> e(int i, Map<Integer, Double> map, boolean z) {
        ovn ovnVar;
        if (this.f44854b == null) {
            LogUtil.j("FitnessSportCalculator", "getAnnualSportData achieveAdapter is null");
            return Collections.EMPTY_MAP;
        }
        CountDownLatch countDownLatch = new CountDownLatch(z ? 5 : 2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        d(i, countDownLatch, arrayList);
        b(i, countDownLatch, arrayList2);
        TreeMap<String, Long> treeMap = new TreeMap<>();
        ArrayList arrayList3 = new ArrayList();
        if (z) {
            e(i, countDownLatch, map, arrayList3);
            ovnVar = new ovn();
            ovnVar.e(i, countDownLatch, treeMap);
        } else {
            ovnVar = null;
        }
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("FitnessSportCalculator", "getAnnualSportData await(): catch InterruptedException");
        }
        HashMap map2 = new HashMap();
        Map<String, Double> mapC = oxa.c(arrayList, arrayList2, map2, map);
        if (i >= 2020) {
            e(i, mapC, map2, map);
            d(i, mapC, arrayList3);
            if (ovnVar != null) {
                ovnVar.e(i, treeMap, arrayList2);
            }
        }
        return mapC;
    }

    private void d(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        LogUtil.a("FitnessSportCalculator", "getFitSportSumData");
        this.f44854b.getFitSportSumDatas(i, new AchieveCallback() { // from class: ovi.3
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("FitnessSportCalculator", "getNewSportSumData data is not correct");
                }
                countDownLatch.countDown();
            }
        });
    }

    private void e(int i, final CountDownLatch countDownLatch, final Map<Integer, Double> map, final List<HiHealthData> list) {
        this.f44854b.getOtherSportSumDatas(i, new AchieveCallback() { // from class: ove
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public final void onResponse(int i2, Object obj) {
                ovi.c(countDownLatch, list, map, i2, obj);
            }
        });
    }

    static /* synthetic */ void c(CountDownLatch countDownLatch, List list, Map map, int i, Object obj) {
        if (!njy.b(obj, HiHealthData.class)) {
            LogUtil.j("FitnessSportCalculator", "getOldSportSumData data is not correct");
            countDownLatch.countDown();
            return;
        }
        for (HiHealthData hiHealthData : (List) obj) {
            if (220 == hiHealthData.getInt("hihealth_type")) {
                list.add(hiHealthData);
            }
            double dDoubleValue = ((Double) hiHealthData.get("count_sum")).doubleValue() - ((Double) hiHealthData.get("ab_count_sum")).doubleValue();
            if (dDoubleValue >= 1.0d) {
                Integer num = (Integer) hiHealthData.get("hihealth_type");
                num.intValue();
                map.put(num, Double.valueOf(dDoubleValue));
            }
        }
        countDownLatch.countDown();
    }

    private void b(int i, final CountDownLatch countDownLatch, final List<AnnualReportFitnessRaw> list) {
        LogUtil.a("FitnessSportCalculator", "getFitnessCourseData");
        this.f44854b.getAnnualFitnessReport(this.f44853a, oxi.a(i, true), oxi.a(i, false), new AchieveCallback() { // from class: ovi.5
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                } else {
                    LogUtil.j("FitnessSportCalculator", "getFitnessCourseData data is not correct");
                }
                countDownLatch.countDown();
            }
        });
    }

    public void e(int i) {
        if (this.f44854b == null) {
            LogUtil.j("FitnessSportCalculator", "getLongestFitDay mAchieveAdapter is null");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        a(i, countDownLatch, arrayList);
        b(i, countDownLatch, arrayList2);
        try {
            countDownLatch.await(8000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("FitnessSportCalculator", "getLongestFitDay await(): catch InterruptedException");
        }
        HashSet hashSet = new HashSet(16);
        Map<String, Long> mapD = oxa.d(arrayList, arrayList2, hashSet);
        int iC = owj.c(new ArrayList(hashSet));
        LogUtil.a("FitnessSportCalculator", "calculateFitnessSum reachDays == ", Integer.valueOf(iC));
        c(i, PrebakedEffectId.RT_COIN_DROP, String.valueOf(iC));
        e(i, mapD);
    }

    private void a(int i, final CountDownLatch countDownLatch, final List<HiHealthData> list) {
        this.f44854b.getFitSportEverydayRecords(i, new AchieveCallback() { // from class: ovi.2
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    list.addAll((List) obj);
                }
                countDownLatch.countDown();
            }
        });
    }

    public void d(int i) {
        boolean z = i >= 2025;
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        Map<String, Double> mapE = e(i, map, z);
        Map<String, Double> mapE2 = e(i - 1, map2, z);
        c(i, 4006, String.valueOf(Double.valueOf(oxi.d(mapE.containsKey("total_duration") ? mapE.get("total_duration").doubleValue() : 0.0d, mapE2.containsKey("total_duration") ? mapE2.get("total_duration").doubleValue() : 0.0d, 10)).intValue()));
        if (z) {
            ArrayList arrayList = new ArrayList(10);
            for (Map.Entry<Integer, Double> entry : map.entrySet()) {
                if (!map2.containsKey(entry.getKey())) {
                    arrayList.add(entry.getKey());
                }
            }
            c(i, 4015, HiJsonUtil.d(arrayList));
        }
    }

    public void c(final int i) {
        if (this.f44854b == null) {
            LogUtil.j("FitnessSportCalculator", "getTrackListBySwimType mAchieveAdapter is null");
            return;
        }
        this.f44854b.fetchSequenceDataBySportType(this.f44853a, oxi.a(i, true), oxi.a(i, false), 262, new AchieveCallback() { // from class: ovi.4
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i2, Object obj) {
                if (obj instanceof List) {
                    try {
                        Map<String, Long> mapD = oxa.d((List<HiHealthData>) obj);
                        ovi.this.c(i, mapD);
                        if (mapD.containsKey("swim_sum_distance")) {
                            ovi.this.d = mapD.get("swim_sum_distance").longValue();
                        }
                        ovi oviVar = ovi.this;
                        oviVar.c(i, oviVar.d, ovi.this.e);
                        return;
                    } catch (ClassCastException unused) {
                        LogUtil.e("FitnessSportCalculator", "getTrackListBySwimType data ClassCastException");
                        return;
                    }
                }
                LogUtil.j("FitnessSportCalculator", "getTrackListBySwimType data is not list");
            }
        });
        int i2 = i - 1;
        this.f44854b.fetchSequenceDataBySportType(this.f44853a, oxi.a(i2, true), oxi.a(i2, false), 262, new AchieveCallback() { // from class: ovi.1
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i3, Object obj) {
                if (obj instanceof List) {
                    try {
                        Map<String, Long> mapD = oxa.d((List<HiHealthData>) obj);
                        if (mapD.containsKey("swim_sum_distance")) {
                            ovi.this.e = mapD.get("swim_sum_distance").longValue();
                        }
                        ovi oviVar = ovi.this;
                        oviVar.c(i, oviVar.d, ovi.this.e);
                    } catch (ClassCastException unused) {
                        LogUtil.e("FitnessSportCalculator", "getTrackListBySwimType data ClassCastException");
                    }
                }
            }
        });
    }

    private void e(int i, Map<String, Double> map, Map<String, String> map2, Map<Integer, Double> map3) {
        if (map.containsKey("total_duration")) {
            int iIntValue = map.get("total_duration").intValue();
            c(i, 4001, String.valueOf(iIntValue));
            addStarData("fitnessStar", oxa.e(iIntValue));
        }
        if (map.containsKey("exclude_run_course_total_duration")) {
            c(i, PrebakedEffectId.RT_JUMP, String.valueOf(map.get("exclude_run_course_total_duration").intValue()));
        }
        if (map.containsKey("total_Course_Day")) {
            c(i, 10029, String.valueOf(map.get("total_Course_Day").intValue()));
        }
        if (map.containsKey("maxFitnessContinuousDays")) {
            c(i, PrebakedEffectId.RT_COIN_DROP, String.valueOf(map.get("maxFitnessContinuousDays").intValue()));
        }
        if (map2.containsKey("favorite_Course_Name")) {
            c(i, PrebakedEffectId.RT_HEARTBEAT, map2.get("favorite_Course_Name"));
        }
        if (map.containsKey("total_count")) {
            c(i, 4002, String.valueOf(map.get("total_count").intValue()));
        }
        if (map.containsKey("favorite_sport_type")) {
            int iIntValue2 = map.get("favorite_sport_type").intValue();
            c(i, WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED, iIntValue2 == 0 ? "" : jaa.d(BaseApplication.getContext(), iIntValue2));
        }
        if (map.containsKey("favorite_sport_total_duration")) {
            c(i, 4013, String.valueOf(map.get("favorite_sport_total_duration").intValue()));
        }
        c(i, 4014, HiJsonUtil.d(oxa.e(map3)));
        if (i >= 2025) {
            c(i, 4016, HiJsonUtil.d(map3));
        }
    }

    private void d(int i, Map<String, Double> map, List<HiHealthData> list) {
        if (i < 2025) {
            return;
        }
        double dDoubleValue = map.containsKey("golf_count_sum") ? map.get("golf_count_sum").doubleValue() : 0.0d;
        double dDoubleValue2 = map.containsKey("golf_swing_sum") ? map.get("golf_swing_sum").doubleValue() : 0.0d;
        double dDoubleValue3 = map.containsKey("golf_duration_sum") ? map.get("golf_duration_sum").doubleValue() : 0.0d;
        HiHealthData hiHealthData = njy.e(list) ? null : list.get(0);
        if (hiHealthData != null) {
            dDoubleValue += hiHealthData.getDouble("count_sum");
            dDoubleValue2 += hiHealthData.getDouble("golf_swing_sum");
            dDoubleValue3 += hiHealthData.getDouble("golf_duration_sum");
        }
        c(i, 10073, String.valueOf(dDoubleValue));
        c(i, 10074, String.valueOf(dDoubleValue2));
        c(i, 10075, String.valueOf(dDoubleValue3));
    }

    private void e(int i, Map<String, Long> map) {
        if (map.containsKey("longest_day_timestamp")) {
            c(i, 4004, String.valueOf(map.get("longest_day_timestamp").longValue()));
        }
        if (map.containsKey("longest_day_duration")) {
            c(i, 4003, String.valueOf(map.get("longest_day_duration").longValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, Map<String, Long> map) {
        if (map.containsKey("swim_max_distance_day")) {
            c(i, 4009, String.valueOf(map.get("swim_max_distance_day").longValue()));
        }
        if (map.containsKey("swim_longest_day_distance")) {
            c(i, 4010, String.valueOf(map.get("swim_longest_day_distance").longValue()));
        }
        if (map.containsKey("swim_sum_distance")) {
            c(i, 4011, String.valueOf(map.get("swim_sum_distance").longValue()));
        }
        if (map.containsKey("swim_sum_time")) {
            c(i, PrebakedEffectId.RT_FOOTSTEP, String.valueOf(map.get("swim_sum_time").longValue()));
        }
        if (map.containsKey("swim_sum_count")) {
            c(i, 4012, String.valueOf(map.get("swim_sum_count").longValue()));
        }
        if (map.containsKey("max_swim_continuous_days")) {
            c(i, 10032, String.valueOf(map.get("max_swim_continuous_days").longValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, long j, long j2) {
        c(i, PrebakedEffectId.RT_ICE, String.valueOf(j - j2));
    }

    private void c(int i, int i2, String str) {
        insertData(i, EnumAnnualType.REPORT_FITNESS.value(), i2, str);
    }
}
