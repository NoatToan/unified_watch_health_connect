package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSampleConfigKey;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.dbmanager.SampleConfigManager;
import com.huawei.hihealthservice.store.merge.HiDicHealthDataMerge;
import com.huawei.hihealthservice.store.stat.HiDicHealthDataStat;
import com.huawei.operation.OperationKey;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.util.LogUtil;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class lkh {
    private static volatile Queue<String> d = new PriorityBlockingQueue();

    public static boolean f(int i) {
        return i == 40002 || i == 40003 || i == 47101;
    }

    private static int i(int i) {
        Context contextB = BaseApplication.b();
        return kyn.d(contextB).d(kwi.b().b(contextB.getPackageName()), i, kwy.b(contextB).c(FoundationCommonUtil.getAndroidId(contextB))).c();
    }

    public static double d(HiHealthData hiHealthData, int i) {
        Context contextB = BaseApplication.b();
        int iD = HiDateUtil.d(hiHealthData.getStartTime());
        int iE = kyn.d(contextB).e(0, hiHealthData.getUserId(), 0);
        kuk kukVarB = kww.c(contextB).b(iD, i, iE);
        double dL = kukVarB == null ? 0.0d : kukVarB.l();
        LogUtil.a("HiH_3CircUtils", "getUserValue statType=", Integer.valueOf(i), ",statDate=", Integer.valueOf(iD), ",statClient=", Integer.valueOf(iE), ",result=", Double.valueOf(dL));
        return dL;
    }

    public static int b(HiHealthData hiHealthData) {
        Context contextB = BaseApplication.b();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(hiHealthData.getStartTime(), hiHealthData.getEndTime());
        double[] dArr = {2.147483647E9d, -1.0d};
        b(contextB, hiHealthData, hiDataReadOption, dArr, new int[]{DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value()});
        b(contextB, hiHealthData, hiDataReadOption, dArr, new int[]{DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value()});
        b(contextB, hiHealthData, hiDataReadOption, dArr, new int[]{DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value()});
        b(contextB, hiHealthData, hiDataReadOption, dArr, new int[]{DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value()});
        if (hiHealthData.getType() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value() || hiHealthData.getType() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value()) {
            return Math.round(dArr[0] / 1000.0d) > Math.round(dArr[1] / 1000.0d) ? 0 : 1;
        }
        return Double.compare(dArr[0], dArr[1]) > 0 ? 0 : 1;
    }

    private static void b(Context context, HiHealthData hiHealthData, HiDataReadOption hiDataReadOption, double[] dArr, int[] iArr) {
        int type = hiHealthData.getType();
        if (type == iArr[0] || type == iArr[1]) {
            List<HiHealthData> listC = c(context, hiHealthData.getUserId(), hiDataReadOption, iArr);
            if (listC == null) {
                ReleaseLogUtil.d("HiH_3CircUtils", "setUserOrGoalValue goalUserPair null");
                return;
            }
            if (listC.size() != 2) {
                ReleaseLogUtil.d("HiH_3CircUtils", "setUserOrGoalValue failed by invalid goalUserPair ", HiJsonUtil.d(listC));
            }
            for (HiHealthData hiHealthData2 : listC) {
                if (hiHealthData2.getType() == iArr[0]) {
                    dArr[0] = hiHealthData2.getValue();
                } else if (hiHealthData2.getType() == iArr[1] && hiHealthData2.getValue() > dArr[1]) {
                    dArr[1] = hiHealthData2.getValue();
                }
            }
            ReleaseLogUtil.c("HiH_3CircUtils", "setUserOrGoalValue goal[", Integer.valueOf(iArr[0]), "]=", Double.valueOf(dArr[0]), ",user[", Integer.valueOf(iArr[1]), "]=", Double.valueOf(dArr[1]));
        }
    }

    public static List<HiHealthData> c(Context context, int i, HiDataReadOption hiDataReadOption, int[] iArr) {
        final int i2;
        List<Integer> listF = kwt.b().f(i);
        List<HiHealthData> listB = kxe.d(context).b(hiDataReadOption, iArr, listF);
        if (njy.e(listB)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "setUserOrGoalValue goalUserPair null");
            return new ArrayList();
        }
        if (listB.size() == 2 || (i2 = iArr[0]) == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value() || !njy.e((List) listB.stream().filter(new Predicate() { // from class: lkk
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return lkh.e(i2, (HiHealthData) obj);
            }
        }).collect(Collectors.toList()))) {
            return listB;
        }
        if (!e(i2, listF, i, b(listB), hiDataReadOption.getStartTime())) {
            ReleaseLogUtil.b("HiH_3CircUtils", "compensationThreeCircleGoal failed, type=", Integer.valueOf(i2));
            return listB;
        }
        return kxe.d(context).b(hiDataReadOption, iArr, listF);
    }

    static /* synthetic */ boolean e(int i, HiHealthData hiHealthData) {
        return hiHealthData.getType() == i;
    }

    public static boolean e() {
        try {
            if (SharedPreferenceManager.b("HiHealthService", "handleActiveGoalValue", false)) {
                LogUtil.e("HiH_3CircUtils", "end handleActiveGoalValue");
                return false;
            }
            int iValue = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value();
            int iE = kud.a().e();
            List<Integer> listF = kwt.b().f(iE);
            if (njy.e(listF)) {
                LogUtil.a("HiH_3CircUtils", "handleActiveGoalValue clients.isEmpty");
                return false;
            }
            List<HiHealthData> listB = kxe.d(BaseApplication.b()).b(1753977600000L, iValue, listF);
            if (njy.e(listB)) {
                LogUtil.a("HiH_3CircUtils", "handleActiveGoalValue list.isEmpty");
                return false;
            }
            ReleaseLogUtil.c("HiH_3CircUtils", "handleActiveGoalValue list.size()=" + listB.size());
            int iE2 = e(listB.get(0).getType(), listF);
            if (iE2 <= 0 || iE2 > 24) {
                iE2 = 12;
            }
            int i = iE2;
            for (HiHealthData hiHealthData : listB) {
                LogUtil.a("HiH_3CircUtils", "handleActiveGoalValue startTime=" + hiHealthData.getStartTime(), ", value:" + hiHealthData.getValue());
                ReleaseLogUtil.c("HiH_3CircUtils", "handleActiveGoalValue, type=", Integer.valueOf(hiHealthData.getType()), ", goalValue=", Integer.valueOf(i), ", isSuccess=", Boolean.valueOf(a(hiHealthData.getType(), hiHealthData.getClientId(), iE, hiHealthData.getTimeZone(), hiHealthData.getStartTime(), i, System.currentTimeMillis())));
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("msg", "handleActiveGoalValue: " + listB.size());
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_ACTIVE_GOAL_VALUE_EXCEPTION_2129046.value(), linkedHashMap, false);
            return true;
        } catch (Exception e) {
            ReleaseLogUtil.b("HiH_3CircUtils", "Failed to handleActiveGoalValue", ExceptionUtils.c(e));
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.put("error_msg", "Error to handleActiveGoalValue: " + e.getMessage());
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_ACTIVE_GOAL_VALUE_EXCEPTION_2129046.value(), linkedHashMap2, false);
            return false;
        } finally {
            SharedPreferenceManager.a("HiHealthService", "handleActiveGoalValue", true);
        }
    }

    private static int e(int i, List<Integer> list) {
        String strM = m(i);
        if (StringUtils.g(strM)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "configId is null");
            return 0;
        }
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.a(strM);
        builder.e("9002");
        List<HiSampleConfig> listB = SampleConfigManager.e().b(list, builder.d());
        if (njy.e(listB)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "Failed to compensationGoal: configId=", strM, ", value is null");
            return 0;
        }
        String configData = listB.get(0).getConfigData();
        if (StringUtils.g(configData)) {
            LogUtil.d("HiH_3CircUtils", "Failed to compensationGoal: configData is null");
            return 0;
        }
        return ((qgx) HiJsonUtil.d(configData, qgx.class)).d();
    }

    private static boolean e(int i, List<Integer> list, int i2, String str, long j) {
        ReleaseLogUtil.c("HiH_3CircUtils", "Start to compensationGoal");
        if (StringUtils.g(str) || !b(str)) {
            LogUtil.d("HiH_3CircUtils", "Different timeZone, no compensation");
            return false;
        }
        String strM = m(i);
        if (StringUtils.g(strM)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "configId is null");
            return false;
        }
        HiSampleConfigKey.Builder builder = new HiSampleConfigKey.Builder();
        builder.c(String.valueOf(0));
        builder.d(String.valueOf(0));
        builder.a(strM);
        builder.e("9002");
        List<HiSampleConfig> listB = SampleConfigManager.e().b(list, builder.d());
        if (njy.e(listB)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "Failed to compensationGoal: configId=", strM, ", value is null");
            return false;
        }
        int iC = kud.a().c();
        Context contextB = BaseApplication.b();
        kym kymVarE = kyn.d(contextB).e(iC, iC, i2, FoundationCommonUtil.getAndroidId(contextB));
        if (kymVarE == null) {
            LogUtil.d("HiH_3CircUtils", "Failed to compensationGoal: insertContext is null");
            return false;
        }
        String configData = listB.get(0).getConfigData();
        if (StringUtils.g(configData)) {
            LogUtil.d("HiH_3CircUtils", "Failed to compensationGoal: configData is null");
            return false;
        }
        int iD = ((qgx) HiJsonUtil.d(configData, qgx.class)).d();
        if (iD <= 0) {
            LogUtil.d("HiH_3CircUtils", "Failed to compensationGoal: goalValue=", Integer.valueOf(iD));
            return false;
        }
        boolean zA = a(i, kymVarE.c(), i2, str, j, iD, 2L);
        ReleaseLogUtil.c("HiH_3CircUtils", "compensationGoal, type=", Integer.valueOf(i), ", goalValue=", Integer.valueOf(iD), ", isSuccess=", Boolean.valueOf(zA));
        return zA;
    }

    public static boolean b(String str) {
        StringBuilder sb = new StringBuilder("GMT");
        sb.append(str.substring(0, 3));
        sb.append(":");
        sb.append(str.substring(3));
        return TimeZone.getDefault().getRawOffset() == TimeZone.getTimeZone(sb.toString()).getRawOffset();
    }

    private static String b(List<HiHealthData> list) {
        HiHealthData hiHealthData = list.get(0);
        if (hiHealthData != null && !StringUtils.g(hiHealthData.getTimeZone())) {
            return hiHealthData.getTimeZone();
        }
        return "";
    }

    private static boolean a(int i, int i2, int i3, String str, long j, int i4, long j2) {
        HiHealthData hiHealthData = new HiHealthData(i);
        hiHealthData.setClientId(i2);
        hiHealthData.setValue(i4);
        TimeZone timeZoneB = HiDateUtil.b(str);
        hiHealthData.setTimeInterval(HiDateUtil.a(j, timeZoneB), HiDateUtil.c(j, timeZoneB));
        hiHealthData.setUserId(i3);
        hiHealthData.setTimeZone(str);
        hiHealthData.setModifiedTime(j2);
        Context contextB = BaseApplication.b();
        HiDicHealthDataMerge hiDicHealthDataMerge = new HiDicHealthDataMerge(contextB);
        if (hiDicHealthDataMerge.e(hiHealthData)) {
            return hiDicHealthDataMerge.d(hiHealthData, hiHealthData.getClientId(), kwt.b().f(hiHealthData.getUserId())) && new HiDicHealthDataStat(contextB).a(hiHealthData);
        }
        ReleaseLogUtil.d("HiH_3CircUtils", "insertThreeCircleGoal merge initialize failed, typeId=", Integer.valueOf(hiHealthData.getType()));
        return false;
    }

    private static String m(int i) {
        if (i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value()) {
            return "900200007";
        }
        if (i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value()) {
            return "900200008";
        }
        if (i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value()) {
            return "900200009";
        }
        return "";
    }

    public static void d(HiHealthData hiHealthData, Map<Integer, Double> map) {
        ReleaseLogUtil.c("HiH_3CircUtils", "updateThreeCircle paramMap=", HiJsonUtil.d(map));
        int i = i(hiHealthData.getUserId());
        TimeZone timeZone = TimeZone.getDefault();
        long jA = HiDateUtil.a(hiHealthData.getStartTime(), timeZone);
        long jC = HiDateUtil.c(hiHealthData.getStartTime(), timeZone);
        HiDicHealthDataMerge hiDicHealthDataMerge = new HiDicHealthDataMerge(BaseApplication.b());
        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            HiHealthData hiHealthData2 = new HiHealthData(entry.getKey().intValue());
            hiHealthData2.setClientId(i);
            hiHealthData2.setValue(a(entry.getValue()));
            hiHealthData2.setTimeInterval(jA, jC);
            hiHealthData2.setUserId(hiHealthData.getUserId());
            hiHealthData2.setTimeZone(hiHealthData.getTimeZone());
            if (!hiDicHealthDataMerge.e(hiHealthData2)) {
                ReleaseLogUtil.d("HiH_3CircUtils", "updateThreeCircle merge initialize failed, typeId=", entry.getKey());
            } else {
                if (!hiDicHealthDataMerge.d(hiHealthData2, i, kwt.b().f(hiHealthData.getUserId())) || !new HiDicHealthDataStat(BaseApplication.b()).a(hiHealthData2)) {
                    ReleaseLogUtil.b("HiH_3CircUtils", "updateThreeCircle() failed when updating ", entry.getKey());
                    return;
                }
                if (entry.getKey().intValue() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value()) {
                    lkd.g(hiHealthData2);
                } else if (entry.getKey().intValue() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value()) {
                    lkd.i(hiHealthData2);
                } else if (entry.getKey().intValue() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value()) {
                    lkd.f(hiHealthData2);
                } else if (entry.getKey().intValue() == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value()) {
                    lkd.b(hiHealthData2);
                }
            }
        }
    }

    public static int a(Double d2) {
        if (d2 == null) {
            return 0;
        }
        int iIntValue = d2.intValue();
        if (Math.abs(d2.floatValue() - iIntValue) >= 1.0E-6d) {
            LogUtil.d("HiH_3CircUtils", "getIntFromDouble lost value, origin=", d2);
        }
        return iIntValue;
    }

    private static boolean e(int i, HiTimeInterval hiTimeInterval, int i2, int i3, int i4) {
        long startTime = hiTimeInterval.getStartTime();
        long endTime = hiTimeInterval.getEndTime();
        ReleaseLogUtil.c("HiH_3CircUtils", "isActiveHourInner startTime=", Long.valueOf(startTime), ", endTime=", Long.valueOf(endTime));
        Context contextB = BaseApplication.b();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(startTime, endTime);
        hiDataReadOption.setType(new int[]{i});
        List<HiHealthData> listB = kwq.e(contextB).b(hiDataReadOption, i, kwt.b().f(i4), (kth) null);
        if (njy.e(listB)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "isActiveHourInner not data between ", Long.valueOf(startTime), " and ", Long.valueOf(endTime));
            return false;
        }
        Iterator<HiHealthData> it = listB.iterator();
        double d2 = 0.0d;
        while (it.hasNext()) {
            double value = it.next().getValue();
            if (value >= i2) {
                return true;
            }
            d2 += value;
            if (d2 >= i3) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(HiHealthData hiHealthData, int i) {
        if (hiHealthData == null) {
            return false;
        }
        long jA = ieg.a(hiHealthData.getStartTime());
        if (d.contains(d(jA, hiHealthData.getUserId())) || !b(hiHealthData, -1)) {
            return false;
        }
        HiTimeInterval hiTimeInterval = new HiTimeInterval(jA, ieg.d(hiHealthData.getStartTime()));
        if (i == 2) {
            return e(i, hiTimeInterval, 40, 100, hiHealthData.getUserId());
        }
        if (i == 4) {
            return e(i, hiTimeInterval, 2400, 6000, hiHealthData.getUserId());
        }
        if (i == 7) {
            return e(i, hiTimeInterval, 1, 1, hiHealthData.getUserId());
        }
        LogUtil.a("HiH_3CircUtils", "isActiveHourByType unsupported type=", Integer.valueOf(i));
        return false;
    }

    public static void e(HiHealthData hiHealthData) {
        long jA = ieg.a(hiHealthData.getStartTime());
        long jD = ieg.d(hiHealthData.getStartTime());
        ReleaseLogUtil.c("HiH_3CircUtils", "activeHour startTime=", Long.valueOf(jA), ", endTime=", Long.valueOf(jD));
        HiHealthData hiHealthData2 = new HiHealthData(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value());
        hiHealthData2.setValue(1.0d);
        hiHealthData2.setTimeInterval(jA, jD);
        int i = i(hiHealthData.getUserId());
        hiHealthData2.setUserId(hiHealthData.getUserId());
        hiHealthData2.setClientId(i);
        HiDicHealthDataMerge hiDicHealthDataMerge = new HiDicHealthDataMerge(BaseApplication.b());
        if (!hiDicHealthDataMerge.e(hiHealthData2)) {
            ReleaseLogUtil.d("HiH_3CircUtils", "activeHour failed by merge initialize");
            return;
        }
        if (hiDicHealthDataMerge.d(hiHealthData2, i, kwt.b().f(hiHealthData.getUserId())) && new HiDicHealthDataStat(BaseApplication.b()).a(hiHealthData2)) {
            String strD = d(jA, hiHealthData.getUserId());
            if (d.contains(strD)) {
                return;
            }
            if (d.size() >= 72) {
                d.poll();
            }
            d.add(strD);
            lkd.d().h(hiHealthData2);
        }
    }

    public static boolean d(HiHealthData hiHealthData) {
        return b(hiHealthData, -30);
    }

    public static List<HiHealthData> e(List<HiHealthData> list) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        HashMap map = new HashMap(16);
        for (HiHealthData hiHealthData : list) {
            String str = hiHealthData.getType() + "_" + ieg.a(hiHealthData.getStartTime()) + "_" + hiHealthData.getUserId();
            if (!map.containsKey(str)) {
                map.put(str, hiHealthData);
            }
        }
        return new ArrayList(map.values());
    }

    private static boolean b(HiHealthData hiHealthData, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(5, i);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        return hiHealthData.getStartTime() >= calendar.getTimeInMillis() && hiHealthData.getStartTime() <= jCurrentTimeMillis + 86400000;
    }

    private static String d(long j, int i) {
        return j + "_" + i;
    }

    public static double e(ThreeCircleConfigUtil.ThreeCircleConfig threeCircleConfig) {
        return ThreeCircleConfigUtil.a(threeCircleConfig) ? 1.0d : 0.0d;
    }

    public static boolean b(int i) {
        return i == DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value() || i == DicDataTypeUtil.DataType.ACTIVE_HOUR.value();
    }

    public static boolean g(int i) {
        return i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value();
    }

    public static boolean e(int i) {
        return i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value();
    }

    public static boolean d(int i) {
        return i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value();
    }

    public static boolean a(int i) {
        return i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value();
    }

    public static boolean c(int i) {
        boolean z = i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value();
        if (z) {
            LogUtil.d("HiH_3CircUtils", "isInvalidInsertType() detected invalid type=", Integer.valueOf(i));
        }
        return z;
    }

    public static boolean j(int i) {
        return i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING_STAT.value();
    }

    public static boolean h(int i) {
        return i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value() || i == DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING_STAT.value();
    }

    public static void c(String str) {
        d dVar = new d("ThreeCircleDfx", "_threeCircleLog_%d", 2, 5120, false);
        dVar.b(str, dVar.getSaveFile());
    }

    static class d extends DfxBaseHandler {
        public d(String str, String str2, int i, int i2, boolean z) {
            super(str, str2, i, i2, z);
        }

        public void b(String str, File file) throws Throwable {
            super.saveInfo(str, file);
        }
    }
}
