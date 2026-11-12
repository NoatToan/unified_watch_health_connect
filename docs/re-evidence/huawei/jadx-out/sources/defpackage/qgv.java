package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class qgv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f46203b = {DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_USER_VALUE.value(), DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA_CALORIE_GOAL_VALUE.value()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f46204c = {"calorieUserValue", "calorieGoalValue"};
    private static final int[] d = {40003};
    private static final String[] e = {"sport_calorie_sum"};

    public static void a(final List<String> list, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("SCUI_RecommendGoalUtil", "keys is ", list, " recommendType is", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "callback is null in getRecommendGoal");
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qgy
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.a((List<String>) list, i, iBaseResponseCallback);
                }
            });
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.d("SCUI_RecommendGoalUtil", "key is empty.");
            iBaseResponseCallback.a(-1, null);
        } else if (i == 0) {
            c(list, iBaseResponseCallback);
        } else if (i == 1) {
            b(list, iBaseResponseCallback);
        } else {
            ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "recommendType is invalid in getRecommendGoal");
        }
    }

    private static void c(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        qhq.b("9002", list, new a(iBaseResponseCallback));
    }

    private static int e() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        float f = 59.0f;
        int i = 160;
        if (userInfo == null) {
            ReleaseLogUtil.d("SCUI_RecommendGoalUtil", "userInfomation is null in getCaloriesDefaultGoal");
            return d(e(1, 160, 59.0f, 35), RoundingMode.DOWN);
        }
        int gender = userInfo.getGender();
        int height = userInfo.getHeight();
        float weight = userInfo.getWeight();
        int age = userInfo.getAge();
        LogUtil.a("SCUI_RecommendGoalUtil", " g is ", Integer.valueOf(gender), " h is ", Integer.valueOf(height), " w is ", Float.valueOf(weight), " a is ", Integer.valueOf(age));
        int i2 = (gender == 0 || gender == 1) ? gender : 1;
        if (height > 0) {
            i = height;
        } else if (i2 == 0) {
            i = 170;
        }
        if (weight > 0.0f) {
            f = weight;
        } else if (i2 == 0) {
            f = 69.6f;
        }
        return d(e(i2, i, f, age > 0 ? age : 35), RoundingMode.DOWN);
    }

    private static int d(double d2, RoundingMode roundingMode) {
        if (d2 < 100000.0d) {
            return 100000;
        }
        if (d2 > 1500000.0d) {
            return 1500000;
        }
        return BigDecimal.valueOf(d2).setScale(-4, roundingMode).intValue();
    }

    private static double e(int i, int i2, float f, int i3) {
        double d2;
        double d3 = btv.d(i2, f);
        if (d3 < 28.0d) {
            double d4 = f;
            d2 = i == 0 ? (((d4 * 2.72d) + (((double) i2) * 0.98d)) - (((double) i3) * 1.37d)) + 18.6d : (((d4 * 1.83d) + (((double) i2) * 0.39d)) - (((double) i3) * 0.9d)) + 129.11d;
        } else {
            double d5 = (d3 / 28.0d) - 1.0d;
            d2 = i == 0 ? ((((2.72d - (d5 * 1.5d)) * ((double) f)) + (((double) i2) * 0.98d)) - (((double) i3) * 1.37d)) + 18.6d : ((((1.83d - d5) * ((double) f)) + (((double) i2) * 0.39d)) - (((double) i3) * 0.9d)) + 129.11d;
        }
        LogUtil.a("SCUI_RecommendGoalUtil", "caloriesBmiGoal is ", Double.valueOf(d2));
        return d2 * 1000.0d;
    }

    private static void b(List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        HashMap map = new HashMap(list.size());
        for (String str : list) {
            if ("900200007".equals(str)) {
                map.put(str, b());
            } else {
                map.put(str, b(str, -1));
            }
        }
        iBaseResponseCallback.a(c(map), map);
    }

    private static qgt b() {
        qgt qgtVarB = b("900200007", -1);
        CountDownLatch countDownLatch = new CountDownLatch(3);
        HashMap map = new HashMap(1);
        HashMap map2 = new HashMap(1);
        HashMap map3 = new HashMap(1);
        a(countDownLatch, map2, f46203b, f46204c);
        a(countDownLatch, map3, d, e);
        d(countDownLatch, map);
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "interrupted while waiting for requestData");
        }
        List list = (List) a((Map) map2);
        List list2 = (List) a((Map) map3);
        qgx qgxVar = (qgx) a((Map) map);
        if (njy.e(list) || njy.e(list2) || qgxVar == null) {
            ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "QueryData is error with hiHealthData or statDataList");
            return qgtVarB;
        }
        d(b(list, list2, qgxVar), qgxVar.d(), qgtVarB);
        return qgtVarB;
    }

    private static void d(final CountDownLatch countDownLatch, final Map<Integer, qgx> map) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("900200007");
        qhq.b("9002", arrayList, new HiDataReadResultListener() { // from class: qgv.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("SCUI_RecommendGoalUtil", "errorCode is ", Integer.valueOf(i), "data is ", obj);
                if (!njy.b(obj, HiSampleConfig.class)) {
                    ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "setThreeCircleGoal objData is not instanceof HashMap");
                    countDownLatch.countDown();
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "HiSampleConfig list is empty");
                    countDownLatch.countDown();
                    return;
                }
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                if (hiSampleConfig == null || TextUtils.isEmpty(hiSampleConfig.getConfigData())) {
                    ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "hiSampleConfig is null or configData is empty.");
                    countDownLatch.countDown();
                } else {
                    map.put(0, (qgx) HiJsonUtil.d(hiSampleConfig.getConfigData(), qgx.class));
                    countDownLatch.countDown();
                }
            }
        });
    }

    private static void a(final CountDownLatch countDownLatch, final Map<Integer, List<HiHealthData>> map, int[] iArr, String[] strArr) {
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(c(iArr, strArr), new HiAggregateListener() { // from class: qgv.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                LogUtil.a("SCUI_RecommendGoalUtil", "errorCode is ", Integer.valueOf(i), "datas is ", list);
                map.put(0, list);
                countDownLatch.countDown();
            }
        });
    }

    private static <T> T a(Map<Integer, T> map) {
        if (map == null || !map.containsKey(0)) {
            return null;
        }
        return map.get(0);
    }

    private static HiAggregateOption c(int[] iArr, String[] strArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jE = lsl.e(jCurrentTimeMillis, 2, -1);
        long jB = lsl.b(jCurrentTimeMillis, 2, -1);
        LogUtil.a("SCUI_RecommendGoalUtil", " lastWeekStartTime ", Long.valueOf(jE), "lastWeekEndTime", Long.valueOf(jB));
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setStartTime(jE);
        hiAggregateOption.setEndTime(jB);
        hiAggregateOption.setType(iArr);
        hiAggregateOption.setConstantsKey(strArr);
        hiAggregateOption.setReadType(0);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(3);
        hiAggregateOption.setSortOrder(1);
        return hiAggregateOption;
    }

    private static int b(List<HiHealthData> list, List<HiHealthData> list2, qgx qgxVar) {
        int i;
        if (lsl.c(System.currentTimeMillis(), -6) < qgxVar.e() || njy.e(list) || njy.e(list2)) {
            LogUtil.a("SCUI_RecommendGoalUtil", "change goal in last 7 days, or lastWeekList is empty");
            return 0;
        }
        HashMap map = new HashMap();
        for (HiHealthData hiHealthData : list2) {
            if (hiHealthData != null) {
                map.put(Long.valueOf(hiHealthData.getStartTime()), hiHealthData);
            }
        }
        int iB = b(list2);
        int iD = qgxVar.d();
        int i2 = 0;
        for (HiHealthData hiHealthData2 : list) {
            if (hiHealthData2 != null) {
                String[] strArr = f46204c;
                int i3 = hiHealthData2.getInt(strArr[1]);
                if (map.containsKey(Long.valueOf(hiHealthData2.getStartTime()))) {
                    i = ((HiHealthData) map.get(Long.valueOf(hiHealthData2.getStartTime()))).getInt("sport_calorie_sum");
                } else {
                    i = hiHealthData2.getInt(strArr[0]);
                }
                if (i >= i3) {
                    i2++;
                }
            }
        }
        LogUtil.a("SCUI_RecommendGoalUtil", "caloriesStatAvg is ", Integer.valueOf(iB), " achievedDays is", Integer.valueOf(i2), "currentGoal is ", Integer.valueOf(iD));
        return c(i2, iB, iD);
    }

    private static int c(int i, int i2, int i3) {
        if (i < 5 || i2 < d(i3, 1.1d) || i3 >= 1500000) {
            return (i > 2 || i2 >= d(i3, 0.9d) || i2 <= 0 || i3 <= 100000) ? 0 : -1;
        }
        return 1;
    }

    private static int b(List<HiHealthData> list) {
        int i;
        int i2 = 0;
        int i3 = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (i = hiHealthData.getInt("sport_calorie_sum")) > 0) {
                i3 += i;
                i2++;
            }
        }
        if (i2 != 0) {
            return i3 / i2;
        }
        return 0;
    }

    private static qgt b(String str, int i) {
        qgt qgtVar = new qgt();
        qgtVar.e(str);
        qgtVar.b(i);
        qgtVar.d(i);
        qgtVar.c(0);
        return qgtVar;
    }

    private static void d(int i, int i2, qgt qgtVar) {
        qgtVar.c(i);
        qgtVar.d(i2);
        if (i != 0) {
            if (i == 1) {
                i2 = d(d(i2, 1.1d), RoundingMode.UP);
            } else if (i != -1) {
                LogUtil.e("SCUI_RecommendGoalUtil", "state is invalid");
                i2 = -1;
            } else {
                i2 = d(d(i2, 0.9d), RoundingMode.DOWN);
            }
        }
        LogUtil.a("SCUI_RecommendGoalUtil", "updateCaloriesRecommend changeGoal is ", Integer.valueOf(i2));
        qgtVar.b(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qgt a(qgx qgxVar, String str, int i) {
        qgt qgtVar = new qgt();
        qgtVar.b(i);
        qgtVar.d(qgxVar.d());
        qgtVar.c(0);
        qgtVar.e(str);
        return qgtVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(HashMap<String, qgt> map) {
        map.put("900200007", b("900200007", e()));
        map.put("900200008", b("900200008", 25));
        map.put("900200009", b("900200009", 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str, qgx qgxVar) {
        if ("900200007".equals(str) && (qgxVar.d() == 270000 || qgxVar.d() == 230000)) {
            return true;
        }
        if ("900200008".equals(str) && (qgxVar.d() == 30 || qgxVar.d() == 20)) {
            return true;
        }
        return "900200009".equals(str) && qgxVar.d() == 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(HashMap<String, qgt> map) {
        for (Map.Entry<String, qgt> entry : map.entrySet()) {
            if (entry.getValue() == null || entry.getValue().d() == -1) {
                return -1;
            }
        }
        return 0;
    }

    private static int d(int i, double d2) {
        return BigDecimal.valueOf(i).multiply(BigDecimal.valueOf(d2)).intValue();
    }

    static class a implements HiDataReadResultListener {
        WeakReference<IBaseResponseCallback> d;

        private a(IBaseResponseCallback iBaseResponseCallback) {
            this.d = new WeakReference<>(iBaseResponseCallback);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            IBaseResponseCallback iBaseResponseCallback = this.d.get();
            if (iBaseResponseCallback == null) {
                ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "callback is null!");
                return;
            }
            HashMap map = new HashMap(3);
            qgv.a((HashMap<String, qgt>) map);
            LogUtil.a("SCUI_RecommendGoalUtil", "errorCode is ", Integer.valueOf(i), "data is ", obj);
            if (!njy.b(obj, HiSampleConfig.class)) {
                ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "setThreeCircleGoal objData is not instanceof HashMap");
                iBaseResponseCallback.a(qgv.c(map), map);
                return;
            }
            for (HiSampleConfig hiSampleConfig : (List) obj) {
                if (hiSampleConfig == null) {
                    ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "hiSampleConfig is null.");
                } else {
                    String configData = hiSampleConfig.getConfigData();
                    String configId = hiSampleConfig.getConfigId();
                    if (TextUtils.isEmpty(configData) || TextUtils.isEmpty(configId)) {
                        ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "configData or configId is empty.");
                    } else {
                        qgx qgxVar = (qgx) HiJsonUtil.d(configData, qgx.class);
                        if (qgxVar != null && qgxVar.d() > 0) {
                            if (!qgv.c(configId, qgxVar)) {
                                map.put(configId, qgv.a(qgxVar, configData, qgxVar.d()));
                            }
                        } else {
                            ReleaseLogUtil.b("SCUI_RecommendGoalUtil", "goalBean is null or value is valid.");
                        }
                    }
                }
            }
            iBaseResponseCallback.a(qgv.c(map), map);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("SCUI_RecommendGoalUtil", "errorCode is ", Integer.valueOf(i2), "data is ", obj, "intentType is ", Integer.valueOf(i));
        }
    }
}
