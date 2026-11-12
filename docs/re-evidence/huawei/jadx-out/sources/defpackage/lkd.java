package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.threecircle.ThreeCircleConfigUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class lkd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f40363c;
    private static final int d;
    private static final int e;
    private static final Map<String, HiHealthData> f = new ConcurrentHashMap();
    private static final Object g = new Object();
    private static final int h;
    private static final List<Integer> i;
    private static final int j;
    private static d l;
    private static ExtendHandler n;
    private static int o;
    private int m;

    static {
        d dVar = new d();
        l = dVar;
        n = HandlerCenter.b(dVar, "HiH_3CircAftProc");
        int iValue = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE_STAT.value();
        f40363c = iValue;
        int iValue2 = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE_STAT.value();
        f40362b = iValue2;
        int iValue3 = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE_STAT.value();
        h = iValue3;
        int iValue4 = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE_STAT.value();
        j = iValue4;
        e = DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value();
        int iValue5 = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE_STAT.value();
        d = iValue5;
        int iValue6 = DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE_STAT.value();
        f40361a = iValue6;
        i = Arrays.asList(40003, 47101, Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()), Integer.valueOf(iValue2), Integer.valueOf(iValue4), Integer.valueOf(iValue6), Integer.valueOf(iValue), Integer.valueOf(iValue3), Integer.valueOf(iValue5));
    }

    private lkd() {
        this.m = 62;
    }

    public static lkd d() {
        return e.d;
    }

    static class e {
        private static final lkd d = new lkd();
    }

    public void h(HiHealthData hiHealthData) {
        String str;
        if (lkh.d(hiHealthData) && liq.f(BaseApplication.b(), hiHealthData.getUserId()) && hiHealthData.getInt("merged") == 0) {
            o = hiHealthData.getUserId();
            ThreadPoolManager.c().execute(new Runnable() { // from class: lkj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40368a.a();
                }
            });
            long jP = HiDateUtil.p(hiHealthData.getStartTime());
            int type = hiHealthData.getType();
            switch (type) {
                case 7:
                case 47101:
                    str = "INTENSITY_" + jP + "_" + hiHealthData.getUserId();
                    break;
                case 20001:
                case 40002:
                case 40003:
                case 40008:
                case 40054:
                    str = "STEP_CALORIE_PUSHES_VAL_" + jP + "_" + hiHealthData.getUserId();
                    break;
                default:
                    if (lkh.b(type)) {
                        str = "ACTIVE_HOUR_" + jP + "_" + hiHealthData.getUserId();
                    } else if (lkh.g(type)) {
                        str = "STEP_STATE_CHANGE_" + jP + "_" + hiHealthData.getUserId();
                    } else if (lkh.e(type)) {
                        str = "CALORIE_STATE_CHANGE_" + jP + "_" + hiHealthData.getUserId();
                    } else if (lkh.d(type)) {
                        str = "INTENSITY_STATE_CHANGE_" + jP + "_" + hiHealthData.getUserId();
                    } else if (!lkh.a(type)) {
                        str = null;
                    } else {
                        str = "ACTIVE_HOUR_STATE_CHANGE_" + jP + "_" + hiHealthData.getUserId();
                    }
                    break;
            }
            if (str == null) {
                LogUtil.j("HiH_3CircAftProc", "triggerAfterProcess() [", str, "]  is empty");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("ThreeCircleMapKey", str);
            bundle.putParcelable("ThreeCircleDataKey", hiHealthData);
            messageObtain.setData(bundle);
            n.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void a() {
        synchronized (this) {
            try {
                int iE = HiDateUtil.e(System.currentTimeMillis(), 1);
                int iC = SharedPreferenceManager.c("HiHealthService", "lastSaveThreeCircleLog", 0);
                if (iE == iC) {
                    return;
                }
                if (iC == 0) {
                    LogUtil.a("HiH_3CircAftProc", "saveThreeCircleLog first");
                    for (int i2 = this.m; i2 > 0; i2--) {
                        int iE2 = HiDateUtil.e(System.currentTimeMillis(), i2);
                        b(iE2);
                        SharedPreferenceManager.d("HiHealthService", "lastSaveThreeCircleLog", iE2);
                    }
                    return;
                }
                try {
                    int iMin = Math.min(HiDateUtil.d(iC, iE, "yyyyMMdd"), this.m);
                    LogUtil.a("HiH_3CircAftProc", "saveThreeCircleLog gap=", Integer.valueOf(iMin));
                    while (iMin > 0) {
                        int iE3 = HiDateUtil.e(System.currentTimeMillis(), iMin);
                        b(iE3);
                        SharedPreferenceManager.d("HiHealthService", "lastSaveThreeCircleLog", iE3);
                        iMin--;
                    }
                } catch (ParseException unused) {
                    LogUtil.a("HiH_3CircAftProc", "saveThreeCircleLog ParseException");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(int i2) {
        lkh.c(e(i2));
    }

    private String e(int i2) {
        List listAsList = Arrays.asList(",AS=", ",AG=", ",AU=", ",OAU=", ",CS=", ",CG=", ",CU=", ",OCU=", ",DS=", ",DG=", ",DU=", ",ODU=");
        List listAsList2 = Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE_STAT.value()), 40003, Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE_STAT.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE_STAT.value()), 47101);
        HashMap map = new HashMap();
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value()), ",ASS=");
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value()), ",CSS=");
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value()), ",DSS=");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(System.currentTimeMillis()).append(",").append(i2);
        int iC = kyn.d(BaseApplication.b()).d(0, o, 0).c();
        String strI = "";
        for (int i3 = 0; i3 < listAsList2.size(); i3++) {
            String str = (String) listAsList.get(i3);
            Integer num = (Integer) listAsList2.get(i3);
            kuk kukVarB = kww.c(BaseApplication.b()).b(i2, num.intValue(), iC);
            stringBuffer.append(str);
            if (kukVarB != null) {
                stringBuffer.append(kukVarB.l());
                if (map.containsKey(num)) {
                    stringBuffer.append((String) map.get(num)).append(kukVarB.h());
                }
                strI = kukVarB.i();
            }
        }
        stringBuffer.append(",TZ=").append(strI);
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (SharedPreferenceManager.c("HiHealthService", "ThreeCircleBi", 0) == HiDateUtil.d(System.currentTimeMillis())) {
            return;
        }
        SharedPreferenceManager.d("HiHealthService", "ThreeCircleBi", HiDateUtil.d(System.currentTimeMillis()));
        List<Integer> listF = kwt.b().f(o);
        kxo kxoVarA = kxo.a();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(System.currentTimeMillis() - 604800000);
        hiAggregateOption.setEndTime(System.currentTimeMillis() - 86400000);
        hiAggregateOption.setType(new int[]{DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value()});
        hiAggregateOption.setConstantsKey(new String[]{"durationGoalValue", "durationUserValue", "activeGoalValue", "activeUserValue", "calorieGoalValue", "calorieUserValue"});
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setAggregateType(4);
        List<HiHealthData> listD = kxoVarA.d(listF, hiAggregateOption, null);
        if (HiCommonUtil.b(listD)) {
            return;
        }
        hiAggregateOption.setType(new int[]{47101, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value(), 40003, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE_STAT.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE_STAT.value()});
        hiAggregateOption.setConstantsKey(new String[]{"durationUserValue", "activeUserValue", "calorieUserValue", "calorieGoalState", "durationGoalState", "activeGoalState"});
        List<HiHealthData> listB = kxoVarA.b(kwt.b().g(o), hiAggregateOption, (kth) null);
        if (HiCommonUtil.b(listB)) {
            return;
        }
        for (HiHealthData hiHealthData : listD) {
            for (HiHealthData hiHealthData2 : listB) {
                if (hiHealthData.getDay() == hiHealthData2.getDay()) {
                    if (!a(hiHealthData, hiHealthData2)) {
                        LogUtil.a("HiH_3CircAftProc", "setBiEvent is not SameValue");
                        break;
                    }
                    break;
                }
            }
        }
    }

    private static boolean a(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
        int i2 = hiHealthData.getInt("durationUserValue");
        int i3 = hiHealthData2.getInt("durationUserValue");
        int i4 = hiHealthData.getInt("activeUserValue");
        int i5 = hiHealthData2.getInt("activeUserValue");
        int i6 = hiHealthData.getInt("calorieUserValue");
        int i7 = hiHealthData2.getInt("calorieUserValue");
        if (i2 == i3 && i4 == i5 && i6 == i7) {
            return true;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(17);
        linkedHashMap.put("threeCircleIntensity", String.valueOf(i2));
        linkedHashMap.put("sportDataIntensity", String.valueOf(i3));
        linkedHashMap.put("threeCircleActiveHour", String.valueOf(i4));
        linkedHashMap.put("sportDataActiveHour", String.valueOf(i5));
        linkedHashMap.put("threeCircleCalorie", String.valueOf(i6));
        linkedHashMap.put("sportDataCalorie", String.valueOf(i7));
        linkedHashMap.put("durationGoalValue", String.valueOf(hiHealthData.getInt("durationGoalValue")));
        linkedHashMap.put("activeGoalValue", String.valueOf(hiHealthData.getInt("activeGoalValue")));
        linkedHashMap.put("calorieGoalValue", String.valueOf(hiHealthData.getInt("calorieGoalValue")));
        linkedHashMap.put("day", String.valueOf(hiHealthData.getDay()));
        linkedHashMap.put("calorieGoalState", String.valueOf(hiHealthData2.getInt("calorieGoalState")));
        linkedHashMap.put("durationGoalState", String.valueOf(hiHealthData2.getInt("durationGoalState")));
        linkedHashMap.put("activeGoalState", String.valueOf(hiHealthData2.getInt("activeGoalState")));
        ReleaseLogUtil.d("HiH_3CircAftProc", "biMap=" + HiJsonUtil.d(linkedHashMap));
        ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_THREE_CIRCLE_2129007.value(), linkedHashMap, false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_USER_VALUE.value()), Double.valueOf(lkh.d(hiHealthData, 40002)));
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value()), Double.valueOf(lkh.d(hiHealthData, 40003)));
        lkh.d(hiHealthData, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_USER_VALUE.value()), Double.valueOf(lkh.d(hiHealthData, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value())));
        lkh.d(hiHealthData, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_PUSHES_VAL.value()), Double.valueOf(lkh.d(hiHealthData, 40008)));
        lkh.d(hiHealthData, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_USER_VALUE.value()), Double.valueOf(lkh.d(hiHealthData, 47101)));
        lkh.d(hiHealthData, map);
    }

    private static void a(HiHealthData hiHealthData, ThreeCircleConfigUtil.ThreeCircleConfig threeCircleConfig, int i2, int i3) {
        HashMap map = new HashMap(16);
        map.put(Integer.valueOf(i2), Double.valueOf(lkh.e(threeCircleConfig)));
        int iB = lkh.b(hiHealthData);
        if (HiDateUtil.d(hiHealthData.getStartTime()) == HiDateUtil.d(System.currentTimeMillis()) || 1 == iB) {
            map.put(Integer.valueOf(i3), Double.valueOf(iB));
        }
        lkh.d(hiHealthData, map);
    }

    public static void g(HiHealthData hiHealthData) {
        a(hiHealthData, ThreeCircleConfigUtil.ThreeCircleConfig.STEP, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_STEP_GOAL_STATE.value());
    }

    public static void i(HiHealthData hiHealthData) {
        a(hiHealthData, ThreeCircleConfigUtil.ThreeCircleConfig.CALORIE, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_IS_RING_NEW.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_STATE.value());
    }

    public static void f(HiHealthData hiHealthData) {
        a(hiHealthData, ThreeCircleConfigUtil.ThreeCircleConfig.INTENSITY, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_DURATION_GOAL_STATE.value());
    }

    public static void b(HiHealthData hiHealthData) {
        a(hiHealthData, ThreeCircleConfigUtil.ThreeCircleConfig.ACTIVE_HOUR, DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_IS_RING.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_ACTIVE_GOAL_STATE.value());
    }

    public void d(Context context, int i2) {
        StringBuilder sb;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                if (liq.f(BaseApplication.b(), i2)) {
                    if (jCurrentTimeMillis - SharedPreferenceManager.d("HiHealthService", "LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA" + i2, 0L) < 86400000) {
                        sb = new StringBuilder("LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA");
                    } else {
                        kym kymVarD = kyn.d(context).d(0, i2, 0);
                        if (kymVarD == null) {
                            ReleaseLogUtil.a("HiH_3CircAftProc", "compensationThreeCircleData statClient is null");
                            sb = new StringBuilder("LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA");
                        } else {
                            for (int i3 = 1; i3 < 7; i3++) {
                                e(HiDateUtil.e(jCurrentTimeMillis, i3), i2, kymVarD.c());
                            }
                            sb = new StringBuilder("LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA");
                        }
                    }
                } else {
                    sb = new StringBuilder("LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA");
                }
            } catch (Exception e2) {
                LogUtil.e("HiH_3CircAftProc", "Failed to compensationThreeCircleData: ", ExceptionUtils.c(e2));
                sb = new StringBuilder("LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA");
            }
            sb.append(i2);
            SharedPreferenceManager.c("HiHealthService", sb.toString(), jCurrentTimeMillis);
        } catch (Throwable th) {
            SharedPreferenceManager.c("HiHealthService", "LAST_TIME_COMPENSATION_THREE_CIRCLE_DATA" + i2, jCurrentTimeMillis);
            throw th;
        }
    }

    private void e(int i2, int i3, int i4) {
        lkd lkdVar;
        String str;
        List<kuk> listC = kww.c(BaseApplication.b()).c(i2, i, i4);
        if (njy.e(listC)) {
            return;
        }
        String strI = listC.get(0).i();
        if (StringUtils.g(strI) || !lkh.b(strI)) {
            LogUtil.j("HiH_3CircAftProc", "Different timeZone, no compensation , timeZone=", strI);
            return;
        }
        Map map = (Map) listC.stream().collect(Collectors.toMap(new Function() { // from class: lki
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((kuk) obj).g());
            }
        }, new Function() { // from class: lkl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Double.valueOf(((kuk) obj).l());
            }
        }));
        double dB = b(f40362b, map);
        double dB2 = b(40003, map);
        double dB3 = b(j, map);
        double dB4 = b(47101, map);
        double dB5 = b(f40361a, map);
        int i5 = e;
        double dB6 = b(i5, map);
        if (dB2 < dB || dB4 < dB3 || dB6 < dB5) {
            return;
        }
        double dB7 = b(f40363c, map);
        double dB8 = b(h, map);
        double dB9 = b(d, map);
        if (dB7 < dB || dB8 < dB3 || dB9 < dB5) {
            LogUtil.a("HiH_3CircAftProc", " date:", Integer.valueOf(i2), ", statTables: ", HiJsonUtil.d(listC));
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i2);
            if (dB2 > dB7) {
                stringBuffer.append(" OCU:" + dB2 + ", CU=" + dB7);
                StringBuilder sb = new StringBuilder(", CU=");
                sb.append(dB7);
                ReleaseLogUtil.d("HiH_3CircAftProc", "compensation OCU:", Double.valueOf(dB2), sb.toString());
                lkdVar = this;
                str = strI;
                lkdVar.b(i2, 40003, i3, str);
            } else {
                lkdVar = this;
                str = strI;
            }
            if (dB4 > dB8) {
                ReleaseLogUtil.d("HiH_3CircAftProc", "compensation ODU:", Double.valueOf(dB4), ", DU=" + dB8);
                stringBuffer.append(" ODU:" + dB4 + ", DU=" + dB8);
                lkdVar.b(i2, 47101, i3, str);
            }
            if (dB6 > dB9) {
                ReleaseLogUtil.d("HiH_3CircAftProc", "compensation OAU:", Double.valueOf(dB6), ", AU=" + dB9);
                stringBuffer.append(" OAU:" + dB6 + ", AU=" + dB9);
                lkdVar.b(i2, i5, i3, str);
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
            linkedHashMap.put("compensationData", stringBuffer.toString());
            ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_COMPENSATION_THREE_CIRCLE_2129043.value(), linkedHashMap, false);
        }
    }

    private void b(int i2, int i3, int i4, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        long jB = HiDateUtil.b(i2, str);
        TimeZone timeZoneB = HiDateUtil.b(str);
        hiHealthData.setStartTime(HiDateUtil.a(jB, timeZoneB));
        hiHealthData.setEndTime(HiDateUtil.c(jB, timeZoneB));
        hiHealthData.setType(i3);
        hiHealthData.setTimeZone(str);
        hiHealthData.setUserId(i4);
        ReleaseLogUtil.d("HiH_3CircAftProc", "Start to compensation date:", Integer.valueOf(i2), ", type=" + i3);
        h(hiHealthData);
    }

    private static double b(int i2, Map<Integer, Double> map) {
        if (map.get(Integer.valueOf(i2)) == null) {
            return 0.0d;
        }
        return map.get(Integer.valueOf(i2)).doubleValue();
    }

    static class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                return false;
            }
            int i = message.what;
            if (i == 1) {
                HiHealthData hiHealthData = (HiHealthData) message.getData().getParcelable("ThreeCircleDataKey");
                String string = message.getData().getString("ThreeCircleMapKey");
                LogUtil.a("HiH_3CircAftProc", "produce: key:", string, "data:", hiHealthData);
                if (lkd.f.containsKey(string)) {
                    LogUtil.j("HiH_3CircAftProc", "triggerAfterProcess() [", string, "] empty or duplicated, skipped");
                } else {
                    hiHealthData.setTimeZone(hiHealthData.getTimeZone());
                    lkd.f.put(string, hiHealthData);
                    if (lkd.f.size() == 1) {
                        lkd.n.sendEmptyMessage(2, 5000L);
                    }
                    ReleaseLogUtil.d("HiH_3CircAftProc", "trigAfterProc[", string, "] InitMap,cacheSz=", Integer.valueOf(lkd.f.size()));
                }
            } else {
                if (i != 2) {
                    return false;
                }
                a(lkd.f);
                lkd.h();
            }
            return true;
        }

        private void a(Map<String, HiHealthData> map) {
            if (map.isEmpty()) {
                LogUtil.e("HiH_3CircAftProc", "triggerAfterProcess() skipped by empty map");
                return;
            }
            for (HiHealthData hiHealthData : map.values()) {
                int type = hiHealthData.getType();
                switch (type) {
                    case 7:
                    case 47101:
                        lkd.n(hiHealthData);
                        break;
                    case 20001:
                    case 40002:
                    case 40003:
                    case 40008:
                    case 40054:
                        lkd.o(hiHealthData);
                        lkd.k(hiHealthData);
                        break;
                    default:
                        if (lkh.b(type)) {
                            lkd.j(hiHealthData);
                        } else if (lkh.g(type)) {
                            lkd.g(hiHealthData);
                        } else if (lkh.e(type)) {
                            lkd.i(hiHealthData);
                        } else if (lkh.d(type)) {
                            lkd.f(hiHealthData);
                        } else if (lkh.a(type)) {
                            lkd.b(hiHealthData);
                        }
                        break;
                }
            }
            map.clear();
            ReleaseLogUtil.d("HiH_3CircAftProc", "trigAfterProcOk,Mapclear");
        }
    }
}
