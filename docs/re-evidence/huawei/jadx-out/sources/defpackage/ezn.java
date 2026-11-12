package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.C;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.servicesui.R;
import com.huawei.health.vip.api.VipApi;
import com.huawei.health.vip.api.VipCallback;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OperationKey;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.ruler.circlescaleruler.HealthCircleScaleRuler;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class ezn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Pair<Float, Float>> f33734a;

    private static int c(int i) {
        if (i == 11 || i == 21 || i == 31) {
            return 40;
        }
        return i;
    }

    static {
        HashMap map = new HashMap();
        f33734a = map;
        Float fValueOf = Float.valueOf(0.24f);
        Float fValueOf2 = Float.valueOf(0.35f);
        map.put("cn_0_0_10", Pair.create(fValueOf, fValueOf2));
        Float fValueOf3 = Float.valueOf(0.29f);
        Float fValueOf4 = Float.valueOf(0.4f);
        map.put("cn_0_0_20", Pair.create(fValueOf3, fValueOf4));
        Float fValueOf5 = Float.valueOf(0.27f);
        Float fValueOf6 = Float.valueOf(0.36f);
        map.put("cn_0_0_30", Pair.create(fValueOf5, fValueOf6));
        map.put("cn_0_1_10", Pair.create(fValueOf, fValueOf2));
        map.put("cn_0_1_20", Pair.create(fValueOf3, fValueOf4));
        map.put("cn_0_1_30", Pair.create(fValueOf5, fValueOf6));
        Float fValueOf7 = Float.valueOf(0.0f);
        Float fValueOf8 = Float.valueOf(0.05f);
        map.put("cn_0_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_0_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_0_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_1_0_10", Pair.create(fValueOf, fValueOf2));
        map.put("cn_1_0_20", Pair.create(fValueOf3, fValueOf4));
        map.put("cn_1_0_30", Pair.create(fValueOf5, fValueOf6));
        map.put("cn_1_1_10", Pair.create(fValueOf, fValueOf2));
        map.put("cn_1_1_20", Pair.create(fValueOf3, fValueOf4));
        map.put("cn_1_1_30", Pair.create(fValueOf5, fValueOf6));
        map.put("cn_1_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_1_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_1_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_2_0_10", Pair.create(fValueOf, fValueOf2));
        map.put("cn_2_0_20", Pair.create(fValueOf3, fValueOf4));
        map.put("cn_2_0_30", Pair.create(fValueOf5, fValueOf6));
        map.put("cn_2_1_10", Pair.create(fValueOf, fValueOf2));
        map.put("cn_2_1_20", Pair.create(fValueOf3, fValueOf4));
        map.put("cn_2_1_30", Pair.create(fValueOf5, fValueOf6));
        map.put("cn_2_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_2_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("cn_2_1_31", Pair.create(fValueOf7, fValueOf8));
        Float fValueOf9 = Float.valueOf(0.25f);
        map.put("de_0_0_10", Pair.create(fValueOf9, fValueOf2));
        Float fValueOf10 = Float.valueOf(0.3f);
        Float fValueOf11 = Float.valueOf(0.45f);
        map.put("de_0_0_20", Pair.create(fValueOf10, fValueOf11));
        map.put("de_0_0_30", Pair.create(fValueOf9, fValueOf4));
        Float fValueOf12 = Float.valueOf(0.2f);
        map.put("de_0_1_10", Pair.create(fValueOf12, fValueOf10));
        map.put("de_0_1_20", Pair.create(fValueOf9, fValueOf4));
        map.put("de_0_1_30", Pair.create(fValueOf12, fValueOf2));
        map.put("de_0_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("de_0_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("de_0_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("de_1_0_10", Pair.create(fValueOf9, fValueOf2));
        map.put("de_1_0_20", Pair.create(fValueOf10, fValueOf11));
        map.put("de_1_0_30", Pair.create(fValueOf9, fValueOf4));
        map.put("de_1_1_10", Pair.create(fValueOf12, fValueOf10));
        map.put("de_1_1_20", Pair.create(fValueOf9, fValueOf4));
        map.put("de_1_1_30", Pair.create(fValueOf12, fValueOf2));
        map.put("de_1_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("de_1_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("de_1_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("de_2_0_10", Pair.create(fValueOf9, fValueOf2));
        map.put("de_2_0_20", Pair.create(fValueOf10, fValueOf11));
        map.put("de_2_0_30", Pair.create(fValueOf9, fValueOf4));
        map.put("de_2_1_10", Pair.create(fValueOf12, fValueOf10));
        map.put("de_2_1_20", Pair.create(fValueOf9, fValueOf4));
        map.put("de_2_1_30", Pair.create(fValueOf12, fValueOf2));
        map.put("de_2_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("de_2_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("de_2_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("it_0_0_10", Pair.create(fValueOf12, Float.valueOf(0.26f)));
        Float fValueOf13 = Float.valueOf(0.47f);
        map.put("it_0_0_20", Pair.create(fValueOf4, fValueOf13));
        map.put("it_0_0_30", Pair.create(fValueOf10, fValueOf2));
        map.put("it_0_1_10", Pair.create(Float.valueOf(0.15f), Float.valueOf(0.21f)));
        Float fValueOf14 = Float.valueOf(0.42f);
        map.put("it_0_1_20", Pair.create(fValueOf2, fValueOf14));
        map.put("it_0_1_30", Pair.create(fValueOf9, fValueOf10));
        map.put("it_0_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("it_0_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("it_0_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("it_1_0_10", Pair.create(fValueOf9, Float.valueOf(0.32f)));
        map.put("it_1_0_20", Pair.create(fValueOf4, fValueOf13));
        map.put("it_1_0_30", Pair.create(fValueOf9, fValueOf10));
        map.put("it_1_1_10", Pair.create(fValueOf12, fValueOf5));
        map.put("it_1_1_20", Pair.create(fValueOf2, fValueOf14));
        map.put("it_1_1_30", Pair.create(fValueOf12, fValueOf9));
        map.put("it_1_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("it_1_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("it_1_1_31", Pair.create(fValueOf7, fValueOf8));
        map.put("it_2_0_10", Pair.create(fValueOf9, fValueOf10));
        map.put("it_2_0_20", Pair.create(fValueOf4, Float.valueOf(0.5f)));
        map.put("it_2_0_30", Pair.create(Float.valueOf(0.28f), fValueOf2));
        map.put("it_2_1_10", Pair.create(fValueOf12, fValueOf9));
        map.put("it_2_1_20", Pair.create(fValueOf2, fValueOf11));
        map.put("it_2_1_30", Pair.create(Float.valueOf(0.23f), fValueOf10));
        map.put("it_2_1_11", Pair.create(fValueOf7, fValueOf8));
        map.put("it_2_1_21", Pair.create(fValueOf7, fValueOf8));
        map.put("it_2_1_31", Pair.create(fValueOf7, fValueOf8));
    }

    private static Map<?, ?> d(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get("diet");
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("recommendRange");
            if (obj2 instanceof Map) {
                return (Map) obj2;
            }
        }
        return null;
    }

    public static Map<?, ?> c() {
        fdf fdfVarE = fdy.e();
        Map<?, ?> mapD = d(fdy.c(fdfVarE));
        return mapD != null ? mapD : d(fdy.e(fdfVarE));
    }

    private static Pair<Double, Double> c(Map<?, ?> map, int i, int i2) {
        String str;
        String strValueOf;
        if (map == null) {
            return null;
        }
        if (i == 1) {
            str = "lose";
        } else if (i == 2) {
            str = "gain";
        } else {
            str = "maintain";
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            if (i2 == 10 || i2 == 20 || i2 == 30) {
                strValueOf = String.valueOf(i2);
            } else {
                strValueOf = String.valueOf(40);
            }
            Object obj2 = ((Map) obj).get(strValueOf);
            if (njy.b(obj2, Double.class)) {
                List list = (List) obj2;
                if (CollectionUtils.d(list, 1)) {
                    return null;
                }
                return Pair.create((Double) list.get(0), (Double) list.get(1));
            }
        }
        return null;
    }

    private static Pair<Double, Double> a(Map<?, ?> map, int i, int i2, List<Integer> list) {
        Pair<Double, Double> pairC = c(map, i, i2);
        ReleaseLogUtil.d("R_DietRecordHelper", "getRecommendCaloriesRange pair ", pairC);
        if (pairC == null) {
            return null;
        }
        if (!njy.e(list) && a(list, i2)) {
            boolean z = (i2 == 10 || i2 == 20 || i2 == 30) ? false : true;
            Pair<Double, Double> pairC2 = z ? pairC : c(map, i, 40);
            ReleaseLogUtil.d("R_DietRecordHelper", "getRecommendCaloriesRange isAddMealType ", Boolean.valueOf(z), " addMealPair ", pairC2);
            if (pairC2 != null) {
                if (Double.compare(((Double) pairC2.first).doubleValue(), 0.0d) != 1 && Double.compare(((Double) pairC2.second).doubleValue(), 0.0d) != 1) {
                    if (z) {
                        return Pair.create(Double.valueOf(0.0d), Double.valueOf(0.05d));
                    }
                    return Pair.create(Double.valueOf(Math.max(0.0d, UnitUtil.d(((Double) pairC.first).doubleValue() - 0.05d, 2))), Double.valueOf(Math.max(0.0d, UnitUtil.d(((Double) pairC.second).doubleValue() - 0.05d, 2))));
                }
                if (z) {
                    double size = list.size();
                    return Pair.create(Double.valueOf(Math.max(0.0d, UnitUtil.d(((Double) pairC2.first).doubleValue() / size, 2))), Double.valueOf(Math.max(0.0d, UnitUtil.d(((Double) pairC2.second).doubleValue() / size, 2))));
                }
            }
        }
        return pairC;
    }

    public static Pair<Float, Float> d(List<Integer> list, int i, int i2) {
        String strB = b();
        if (i2 != 10 && i2 != 20 && i2 != 30 && Objects.equals(strB, "cn") && njy.b(list)) {
            Pair<Float, Float> pairCreate = Pair.create(Float.valueOf(0.0f), Float.valueOf((float) Math.max(0.0d, UnitUtil.d(0.15f / list.size(), 2))));
            ReleaseLogUtil.d("R_DietRecordHelper", "getRecommendCaloriesRange addMealTypeList ", list, " mealType ", Integer.valueOf(i2), " pair ", pairCreate);
            return pairCreate;
        }
        String str = strB + "_" + i + "_" + (a(list, i2) ? 1 : 0) + "_" + i2;
        Pair<Float, Float> pair = f33734a.get(str);
        ReleaseLogUtil.d("R_DietRecordHelper", "getRecommendCaloriesRange() mapKey: ", str, ", mapValue: ", pair);
        return pair;
    }

    private static void c(List<Integer> list, vgo vgoVar, vgw vgwVar, int i, Map<?, ?> map) {
        if (njy.e(vgwVar.c())) {
            LogUtil.j("DietRecordHelper", "setDietSugRange food is null ");
            return;
        }
        int[] iArrB = b(list, vgoVar.d().e(), vgwVar.i(), i, map);
        if (iArrB.length == 2) {
            vgwVar.c(iArrB);
        }
    }

    public static int[] b(List<Integer> list, float f, int i, int i2, Map<?, ?> map) {
        double dDoubleValue;
        double dDoubleValue2;
        LogUtil.a("DietRecordHelper", "getRange weightManagerType ", Integer.valueOf(i2), " mealType ", Integer.valueOf(i), " goalCalories ", Float.valueOf(f), " recommendRangeMap ", map, " addMealTypeList ", list);
        if (Float.compare(f, 0.0f) != 1) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getRange goalCalories ", Float.valueOf(f));
            return new int[0];
        }
        Pair<Double, Double> pairA = a(map, i2, i, list);
        ReleaseLogUtil.d("R_DietRecordHelper", "getRange pair ", pairA);
        if (pairA == null) {
            Pair<Float, Float> pairD = d(list, i2, i);
            ReleaseLogUtil.d("R_DietRecordHelper", "getRange caloriesRangePair ", pairD);
            if (pairD == null) {
                return new int[0];
            }
            dDoubleValue = ((Float) pairD.first).floatValue();
            dDoubleValue2 = ((Float) pairD.second).floatValue();
        } else {
            dDoubleValue = ((Double) pairA.first).doubleValue();
            dDoubleValue2 = ((Double) pairA.second).doubleValue();
        }
        double d = f;
        int iD = (int) UnitUtil.d(dDoubleValue * d, 0);
        int iD2 = (int) UnitUtil.d(d * dDoubleValue2, 0);
        LogUtil.a("DietRecordHelper", "getRange min ", Integer.valueOf(iD), " max ", Integer.valueOf(iD2));
        return new int[]{iD, iD2};
    }

    private static String b() {
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1010);
        LogUtil.a("DietRecordHelper", "getCountryCode countryCode ", accountInfo);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getCountryCode countryCode ", accountInfo);
            return "it";
        }
        String lowerCase = accountInfo.toLowerCase(Locale.ENGLISH);
        return (Objects.equals(lowerCase, "cn") || Objects.equals(lowerCase, "de")) ? lowerCase : "it";
    }

    public static iuv a(final int i) {
        final iuv iuvVar = new iuv();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        LogUtil.a("DietRecordHelper", "getOnePointFullValue getDietRecord dayFormat ", Integer.valueOf(iA));
        nkf.c(OperationKey.HEALTH_APP_DIET_DIARY_SERVICE_2129035, "DietRecordHelper_getOnePointFullValue", 0, (DeviceInfo) null);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ezw
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = iA;
                iun.b(i2, i2, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, new ResponseCallback() { // from class: ezy
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i3, Object obj) {
                        ezn.a(countDownLatch, i, iuvVar, i3, (List) obj);
                    }
                });
            }
        });
        try {
            ReleaseLogUtil.d("DietRecordHelper", "getOnePointFullValue isCountDownZero = ", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
            return iuvVar;
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("DietRecordHelper", "getOnePointFullValue exception");
            return iuvVar;
        }
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, int i, iuv iuvVar, int i2, List list) {
        if (njy.e(list)) {
            LogUtil.j("DietRecordHelper", "getDietRecord list is empty ");
            countDownLatch.countDown();
            return;
        }
        vgo vgoVar = (vgo) list.get(0);
        if (vgoVar == null || vgoVar.d() == null) {
            LogUtil.j("DietRecordHelper", "getDietRecord Overview is null:");
            countDownLatch.countDown();
            return;
        }
        vfy vfyVarD = vgoVar.d();
        LogUtil.a("DietRecordHelper", "getDietRecord overview is: ", vfyVarD);
        float fE = vfyVarD.e();
        Map<?, ?> mapC = c();
        iuvVar.a(c(fE, 10, i, mapC));
        iuvVar.d(c(fE, 20, i, mapC));
        iuvVar.e(c(fE, 30, i, mapC));
        countDownLatch.countDown();
    }

    private static int c(float f, int i, int i2, Map<?, ?> map) {
        int[] iArrB = b(Collections.EMPTY_LIST, f, i, i2, map);
        if (iArrB.length < 2) {
            LogUtil.j("DietRecordHelper", "getOnePointFullValue range is error");
            return 0;
        }
        return Math.round((iArrB[0] + iArrB[1]) / 14.0f);
    }

    public static boolean a(List<Integer> list, int i) {
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_DietRecordHelper", "isContainAddMeal addMealTypeList ", list, " mealType ", Integer.valueOf(i));
            return false;
        }
        if (i == 10 || i == 11) {
            return list.contains(11);
        }
        if (i == 20 || i == 21) {
            return list.contains(21);
        }
        return list.contains(31);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final long j, final long j2, final DeviceInfo deviceInfo, final List<vgo> list) {
        nkf.a().d(new ResponseCallback() { // from class: faa
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                Pair pair = (Pair) obj;
                ReleaseLogUtil.d("R_DietRecordHelper", "syncMealsToDevice isSuccess = ", Boolean.valueOf(ezn.a(j, j2, deviceInfo, (List<vgo>) list, (pair == null || pair.second == null) ? 0 : ((ivd) pair.second).i())));
            }
        });
    }

    private static List<vgw> a(vgo vgoVar) {
        ArrayList arrayList = new ArrayList();
        if (vgoVar == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getAddMealTypeList dietRecord is null");
            return arrayList;
        }
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getAddMealTypeList mealList ", listA);
            return arrayList;
        }
        HashMap map = new HashMap();
        for (vgw vgwVar : listA) {
            if (vgwVar != null) {
                int i = vgwVar.i();
                vgw vgwVar2 = (vgw) map.get(Integer.valueOf(i));
                if (vgwVar2 == null) {
                    map.put(Integer.valueOf(i), vgwVar);
                } else {
                    vgwVar2.c(vgwVar2.e() + vgwVar.e());
                    if (!njy.e(vgwVar.c())) {
                        vgwVar2.c().addAll(vgwVar.c());
                    }
                }
            }
        }
        return new ArrayList(map.values());
    }

    public static List<Integer> b(vgo vgoVar) {
        int i;
        if (vgoVar == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getAddMealTypeList dietRecord is null");
            return Collections.EMPTY_LIST;
        }
        List<vgw> listA = vgoVar.a();
        if (njy.e(listA)) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getAddMealTypeList mealList ", listA);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (vgw vgwVar : listA) {
            if (vgwVar != null && !njy.e(vgwVar.c()) && ((i = vgwVar.i()) == 11 || i == 21 || i == 31)) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static void b(final long j, final long j2, final DeviceInfo deviceInfo) {
        if (iuo.a()) {
            e(j, j2, deviceInfo, 2);
            LogUtil.a("DietRecordHelper", "cache isSupportDiet syncMealsToDevice");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ezt
                @Override // java.lang.Runnable
                public final void run() {
                    iun.e(false, (ResponseCallback<Boolean>) new ResponseCallback() { // from class: ezv
                        @Override // com.huawei.hwbasemgr.ResponseCallback
                        public final void onResponse(int i, Object obj) {
                            ezn.c(j, j, deviceInfo, i, (Boolean) obj);
                        }
                    });
                }
            });
        }
    }

    static /* synthetic */ void c(long j, long j2, DeviceInfo deviceInfo, int i, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            e(j, j2, deviceInfo, 2);
            LogUtil.a("DietRecordHelper", "syncMealsToDevice isSupportDiet is true");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(final long j, final long j2, DeviceInfo deviceInfo, final int i) {
        final DeviceInfo deviceInfo2 = (deviceInfo == null && EnvironmentUtils.d()) ? ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "DietRecordHelper") : deviceInfo;
        if (deviceInfo2 != null || !EnvironmentUtils.d()) {
            ReleaseLogUtil.d("R_DietRecordHelper", "syncMealsToDevice startTime is ", Long.valueOf(j), ",endTime is ", Long.valueOf(j2));
            long jR = lsl.r(j);
            long jC = lsl.c(j2);
            long jC2 = lsl.c(System.currentTimeMillis());
            if (j > j2 || j2 > jC2 || String.valueOf(j2).length() != 13) {
                ReleaseLogUtil.e("R_DietRecordHelper", "syncMealsToDevice query time is illegal");
                jR = lsl.c(jC2, -6);
                jC = jC2;
            }
            if (lsl.a(jR, jC) > 7) {
                ReleaseLogUtil.e("R_DietRecordHelper", "syncMealsToDevice queryEndTime - queryStartTime > 7 ");
                jR = lsl.c(jC, -6);
            }
            int iA = DateFormatUtil.a(jR);
            int iA2 = DateFormatUtil.a(jC);
            ReleaseLogUtil.d("R_DietRecordHelper", "connectDeviceSyncMealsToDevice queryStartTime ", Long.valueOf(jR), " queryEndTime ", Long.valueOf(jC), " startDate ", Integer.valueOf(iA), " endDate ", Integer.valueOf(iA2));
            iun.c(iA, iA2, new ResponseCallback() { // from class: ezz
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i2, Object obj) {
                    ezn.c(j, j2, deviceInfo2, i2, (List) obj);
                }
            });
            return;
        }
        ReleaseLogUtil.e("R_DietRecordHelper", "syncMealsToDevice deviceInfo is null retryTimes is : ", Integer.valueOf(i));
        if (i > 0) {
            HandlerCenter.a().d(new Runnable() { // from class: fab
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.e(j, j2, (DeviceInfo) null, i - 1);
                }
            }, 2000L);
        }
    }

    static /* synthetic */ void c(final long j, final long j2, final DeviceInfo deviceInfo, int i, List list) {
        LogUtil.a("DietRecordHelper", "connectDeviceSyncMealsToDevice errorCode ", Integer.valueOf(i), " list ", list);
        final List list2 = (List) HiJsonUtil.d(HiJsonUtil.d(list), new TypeToken<List<vgo>>() { // from class: com.huawei.health.health.utils.dietrecord.DietRecordHelper$1
        }.getType());
        ThreadPoolManager.c().execute(new Runnable() { // from class: ezr
            @Override // java.lang.Runnable
            public final void run() {
                ezn.d(j, j2, deviceInfo, list2);
            }
        });
    }

    public static boolean a(long j, long j2, DeviceInfo deviceInfo, List<vgo> list, int i) {
        ReleaseLogUtil.d("R_DietRecordHelper", "sendDietSamplePoint");
        eeh eehVar = new eeh();
        eehVar.setSrcPkgName("hw.unitedevice.weightMgr");
        eehVar.setWearPkgName("hw.sport.dietcal");
        eehVar.setCommandId(3);
        eehVar.d(DicDataTypeUtil.DataType.DIET_RECORD_SET.value());
        eehVar.c(j);
        eehVar.a(j2);
        ArrayList arrayList = new ArrayList();
        eed eedVar = new eed();
        eedVar.e(DicDataTypeUtil.DataType.DIET_RECORD_SET.value());
        eedVar.a(eeq.c(eeq.a(HiJsonUtil.d(a(list, i, deviceInfo)))));
        arrayList.add(eedVar);
        eehVar.e(arrayList);
        eez eezVarB = b(list);
        if (eezVarB != null) {
            HashMap map = new HashMap();
            map.put("dietaryAnalysis", eezVarB);
            String strD = HiJsonUtil.d(map);
            String strA = eeq.a(strD);
            eehVar.d(eeq.c(strA));
            LogUtil.a("DietRecordHelper", "sendDietSamplePoint json ", strD, " hex ", strA);
        }
        LogUtil.a("DietRecordHelper", "sendDietSamplePoint samplePoint: ", eehVar.toString());
        return edc.e().sendSamplePointCommand(deviceInfo, eehVar, "DietRecordHelper");
    }

    private static eez b(List<vgo> list) {
        vgo next;
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getDeviceSyncDietAnalysis list ", list);
            return null;
        }
        int iA = DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
        Iterator<vgo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.c() == iA) {
                break;
            }
        }
        if (next == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getDeviceSyncDietAnalysis todayDietRecord is null");
            return null;
        }
        LogUtil.a("DietRecordHelper", "getDeviceSyncDietAnalysis todayDietRecord ", next);
        final eez[] eezVarArr = new eez[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        iun.a(next, (ResponseCallback<eez>) new ResponseCallback() { // from class: ezu
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ezn.c(eezVarArr, countDownLatch, i, (eez) obj);
            }
        });
        try {
            ReleaseLogUtil.d("R_DietRecordHelper", "getDeviceSyncDietAnalysis isAwait ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("R_DietRecordHelper", "getDeviceSyncDietAnalysis exception ", ExceptionUtils.c(e));
        }
        return eezVarArr[0];
    }

    static /* synthetic */ void c(eez[] eezVarArr, CountDownLatch countDownLatch, int i, eez eezVar) {
        LogUtil.a("DietRecordHelper", "getDeviceSyncDietAnalysis resultDeviceSyncDietAnalysis ", eezVar);
        eezVarArr[0] = eezVar;
        countDownLatch.countDown();
    }

    private static vgc[] a(List<vgo> list, int i, DeviceInfo deviceInfo) {
        ArrayList<vgc> arrayList = new ArrayList();
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_DietRecordHelper", "getDeviceMealArray result ", list, " weightManagerType ", Integer.valueOf(i));
            return (vgc[]) arrayList.toArray(new vgc[0]);
        }
        boolean zD = eey.d(deviceInfo, a.N);
        ReleaseLogUtil.d("R_DietRecordHelper", "getDeviceMealArray weightManagerType ", Integer.valueOf(i), " isSupportCapability ", Boolean.valueOf(zD));
        Map<?, ?> mapC = c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        vgo vgoVar = null;
        for (vgo vgoVar2 : list) {
            if (vgoVar2 != null) {
                d(i, zD, vgoVar2, arrayList, mapC);
                if (iA == vgoVar2.c()) {
                    vgoVar = vgoVar2;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (vgc vgcVar : arrayList) {
            if (vgcVar != null && lsl.c(jCurrentTimeMillis, vgcVar.a() * 1000)) {
                int iD = vgcVar.d();
                if (!zD) {
                    iD = c(iD);
                }
                arrayList2.add(Integer.valueOf(iD));
            }
        }
        if (!arrayList2.contains(10)) {
            a(vgoVar, arrayList, mapC, i, 10);
        }
        if (!arrayList2.contains(20)) {
            a(vgoVar, arrayList, mapC, i, 20);
        }
        if (!arrayList2.contains(30)) {
            a(vgoVar, arrayList, mapC, i, 30);
        }
        if (!arrayList2.contains(40) && !zD) {
            a(vgoVar, arrayList, mapC, i, 40);
        }
        LogUtil.a("DietRecordHelper", "getDeviceMealArray mealList ", HiJsonUtil.d(arrayList));
        return (vgc[]) arrayList.toArray(new vgc[0]);
    }

    private static void a(vgo vgoVar, List<vgc> list, Map<?, ?> map, int i, int i2) {
        int size = list.size();
        if (size > 42) {
            ReleaseLogUtil.e("R_DietRecordHelper", "addDefaultDeviceSyncMeal size ", Integer.valueOf(size));
            return;
        }
        if (vgoVar == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "addDefaultDeviceSyncMeal todayDietRecord is null");
            return;
        }
        vfy vfyVarD = vgoVar.d();
        vgc vgcVar = new vgc(i2, lsl.r(System.currentTimeMillis()) / 1000, 0.0f, b(b(vgoVar), vfyVarD != null ? vfyVarD.e() : 0.0f, i2, i, map));
        vgcVar.a(false);
        list.add(vgcVar);
    }

    private static void d(int i, boolean z, vgo vgoVar, List<vgc> list, Map<?, ?> map) {
        List<vgw> listA = a(vgoVar);
        if (njy.e(listA)) {
            return;
        }
        List<Integer> listB = b(vgoVar);
        LogUtil.a("DietRecordHelper", "processDeviceSyncMealList isSupportCapability ", Boolean.valueOf(z), " addMealTypeList ", listB);
        float f = 0.0f;
        vgc vgcVar = null;
        int iA = 0;
        for (vgw vgwVar : listA) {
            if (vgwVar != null) {
                int size = list.size();
                if (size > 42) {
                    ReleaseLogUtil.e("R_DietRecordHelper", "processDeviceSyncMealList size ", Integer.valueOf(size));
                    return;
                }
                if (String.valueOf(vgwVar.d()).matches("\\d{13}")) {
                    ReleaseLogUtil.e("R_DietRecordHelper", "processDeviceSyncMealList isTimeMillis true");
                    vgwVar.m();
                }
                c(listB, vgoVar, vgwVar, i, map);
                int i2 = vgwVar.i();
                if (!z) {
                    i2 = c(i2);
                }
                int i3 = i2;
                boolean zB = njy.b(vgwVar.c());
                float fE = vgwVar.e();
                long jD = vgwVar.d();
                if (i3 == 40 && zB) {
                    f += fE;
                    iA = a(vgwVar, iA);
                    vgcVar = new vgc(40, jD, f, new int[]{0, iA});
                    vgcVar.a(true);
                } else {
                    vgc vgcVar2 = new vgc(i3, jD, fE, vgwVar.h());
                    vgcVar2.a(zB);
                    list.add(vgcVar2);
                }
            }
        }
        if (vgcVar != null) {
            list.add(vgcVar);
        }
    }

    private static int a(vgw vgwVar, int i) {
        return (vgwVar.h() == null || vgwVar.h().length < 2) ? i : i + vgwVar.h()[1];
    }

    public static void d(DeviceInfo deviceInfo, eee eeeVar) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "syncVipTagToDevice deviceInfo is null");
            return;
        }
        byte[] bArrC = eeeVar.c();
        if (bArrC == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "syncVipTagToDevice eventData is null");
            return;
        }
        ReleaseLogUtil.d("R_DietRecordHelper", "syncVipTagToDevice data: ", eeq.e(bArrC));
        if (CommonUtil.v(eeq.e(bArrC)) != 1) {
            ReleaseLogUtil.e("R_DietRecordHelper", "syncVipTagToDevice req is not vip ");
        } else {
            e(deviceInfo);
        }
    }

    private static void e(final DeviceInfo deviceInfo) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ezq
            @Override // java.lang.Runnable
            public final void run() {
                ((VipApi) Services.b("vip", VipApi.class)).getVipInfo(new VipCallback() { // from class: ezn.1
                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onSuccess(Object obj) {
                        if (obj == null) {
                            ReleaseLogUtil.e("R_DietRecordHelper", "getVipTag onSuccess result is null");
                        } else if (obj instanceof UserMemberInfo) {
                            UserMemberInfo userMemberInfo = (UserMemberInfo) obj;
                            int i = (userMemberInfo.getMemberFlag() != 1 || irz.d(userMemberInfo)) ? 0 : 1;
                            ReleaseLogUtil.d("R_DietRecordHelper", "getVipTag vipTag = ", Integer.valueOf(i));
                            ReleaseLogUtil.d("R_DietRecordHelper", "getVipTag onSuccess isSuccess = ", Boolean.valueOf(ezn.c(deviceInfo, i)));
                        }
                    }

                    @Override // com.huawei.health.vip.api.VipCallback
                    public void onFailure(int i, String str) {
                        ReleaseLogUtil.e("R_DietRecordHelper", "getVipTag errorCode=", Integer.valueOf(i), " errMsg=", str);
                        ReleaseLogUtil.d("R_DietRecordHelper", "getVipTag onFailure isSuccess = ", Boolean.valueOf(ezn.c(deviceInfo, 2)));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(DeviceInfo deviceInfo, int i) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.common");
        eeeVar.setWearPkgName("hw.sport.dietcal");
        eeeVar.setCommandId(2);
        eeeVar.a(80030004L);
        eeeVar.a(0);
        eeeVar.e(eeq.c(eeq.d(i)));
        ReleaseLogUtil.d("R_DietRecordHelper", "sendVipTagSampleEvent sampleEvent: ", eeeVar.toString());
        return edc.e().sendSampleEventCommand(deviceInfo, eeeVar, "DietRecordHelper");
    }

    public static Pair<Float, Float> a(vfy vfyVar) {
        if (vfyVar == null || vfyVar.c() <= 0) {
            ReleaseLogUtil.e("DietRecordHelper", "getCaloricDeficitScopeAngle overview is null");
            return null;
        }
        if (vfyVar.j() <= 0.0d) {
            return null;
        }
        Pair<Integer, Integer> pairC = c(vfyVar);
        float fIntValue = ((Integer) pairC.second).intValue();
        if (fIntValue <= 0.0f) {
            LogUtil.j("DietRecordHelper", "getCaloricDeficitScopeAngle max ", Float.valueOf(fIntValue), " pair ", pairC, " overview ", vfyVar);
            return null;
        }
        float fB = b(vfyVar, fIntValue);
        if (fB <= 0.0f) {
            LogUtil.j("DietRecordHelper", "getCaloricDeficitScopeAngle maxScaleValue ", Float.valueOf(fB), " max ", Float.valueOf(fIntValue), " pair ", pairC, " overview ", vfyVar);
            return null;
        }
        return new Pair<>(Float.valueOf(((((Integer) pairC.first).intValue() / fB) * 70.0f) + 270.0f), Float.valueOf(((fIntValue / fB) * 70.0f) + 270.0f));
    }

    public static Pair<Integer, Integer> c(vfy vfyVar) {
        if (vfyVar == null) {
            return new Pair<>(0, 0);
        }
        int iC = vfyVar.c();
        if (iC <= 0) {
            ReleaseLogUtil.e("DietRecordHelper", "getCaloricDeficitScope caloricDeficitGoal ", Integer.valueOf(iC));
            int iD = d(vfyVar);
            return new Pair<>(Integer.valueOf(iD), Integer.valueOf(iD));
        }
        return new Pair<>(Integer.valueOf(iC - 100), Integer.valueOf(iC + 100));
    }

    private static int b(vfy vfyVar, float f) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "getMaxScaleValue overview is null maxCaloricDeficitScope ", Float.valueOf(f));
            return 800;
        }
        double dJ = vfyVar.j();
        if (dJ == 0.0d) {
            return 800;
        }
        if (dJ < 0.0d) {
            return 1200;
        }
        if (f <= 0.0f) {
            ReleaseLogUtil.e("DietRecordHelper", "getMaxScaleValue maxCaloricDeficitScope ", Float.valueOf(f));
            return 2000;
        }
        if (f < 800.0f) {
            return 800;
        }
        if (f < 1200.0f) {
            return 1200;
        }
        if (f < 1600.0f) {
            return KakaConstants.TASK_MEASURE_TODAY_BLOOD_PRESSURE;
        }
        return 2000;
    }

    private static List<String> a(vfy vfyVar, float f) {
        int iB = b(vfyVar, f);
        int i = iB / 4;
        ArrayList arrayList = new ArrayList();
        for (int i2 = -iB; i2 <= iB; i2 += i) {
            arrayList.add(UnitUtil.e(i2, 1, 0));
        }
        return arrayList;
    }

    public static List<Integer> a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 35; i++) {
            arrayList.add(Integer.valueOf((i * 4) + 1));
        }
        return arrayList;
    }

    public static int e(vfy vfyVar) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "getConsumption overview is null");
            return 0;
        }
        return ((int) UnitUtil.d(vfyVar.a(), 0)) + vfyVar.g();
    }

    public static int d(vfy vfyVar) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "getCaloricDeficit overview is null");
            return 0;
        }
        int iE = e(vfyVar);
        int iD = (int) UnitUtil.d(vfyVar.h(), 0);
        return vfyVar.j() >= 0.0d ? iE - iD : iD - iE;
    }

    public static float b(vfy vfyVar) {
        int iD = d(vfyVar);
        if (iD == 0) {
            return 0.0f;
        }
        float fB = b(vfyVar, ((Integer) c(vfyVar).second).intValue());
        if (fB <= 0.0f) {
            LogUtil.j("DietRecordHelper", "getCaloricDeficitAngle maxScaleValue ", Float.valueOf(fB), " caloricDeficit ", Integer.valueOf(iD));
            return 0.0f;
        }
        float f = 70.0f / (fB / iD);
        if (f > 0.0f) {
            return Math.min(74.375f, f);
        }
        return Math.max(-74.375f, f);
    }

    public static void f(final vfy vfyVar) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshWeightManager dietCalorieOverview is null");
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ezp
                @Override // java.lang.Runnable
                public final void run() {
                    ezn.f(vfyVar);
                }
            });
            return;
        }
        final int iC = vfyVar.c();
        final int iB = vfyVar.b();
        if (iC <= 0 || iB <= 0) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshWeightManager caloricDeficitGoal ", Integer.valueOf(iC), " activityCalGoal ", Integer.valueOf(iB));
        } else {
            iun.c((ResponseCallback<iuu>) new ResponseCallback() { // from class: ezs
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    ezn.e(iC, iB, i, (iuu) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(int i, int i2, int i3, final iuu iuuVar) {
        if (iuuVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshWeightManager onResponse goalDetail is null errorCode ", Integer.valueOf(i3));
            return;
        }
        iuw iuwVarD = iuuVar.d();
        if (iuwVarD == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshWeightManager onResponse simpleFatInfo is null goalDetail ", iuuVar);
            return;
        }
        final int iB = iuwVarD.b();
        final int iD = iuwVarD.d();
        if (iB == i && iD == i2) {
            return;
        }
        LogUtil.a("DietRecordHelper", "refreshWeightManager onResponse cloudCaloriesGap ", Integer.valueOf(iB), " cloudActivityCalories ", Integer.valueOf(iD), " activityCalGoal ", Integer.valueOf(i2), " caloricDeficitGoal ", Integer.valueOf(i));
        xkb.d("900300023", new HiDataReadResultListener() { // from class: ezn.4
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i4, Object obj, int i5, int i6) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i4, int i5) {
                HiSampleConfig hiSampleConfig;
                ivd ivdVar;
                LogUtil.a("DietRecordHelper", "refreshWeightManager onResult errorCode ", Integer.valueOf(i4), " object ", obj);
                if (njy.b(obj, HiSampleConfig.class)) {
                    List list = (List) obj;
                    if (njy.e(list) || (hiSampleConfig = (HiSampleConfig) list.get(0)) == null) {
                        return;
                    }
                    long jB = iuuVar.b();
                    long modifiedTime = hiSampleConfig.getModifiedTime();
                    LogUtil.a("DietRecordHelper", "refreshWeightManager onResult updateTime ", Long.valueOf(jB), " modifiedTime ", Long.valueOf(modifiedTime));
                    if (jB >= modifiedTime && (ivdVar = (ivd) HiJsonUtil.d(hiSampleConfig.getConfigData(), ivd.class)) != null) {
                        if (iB == ivdVar.e() && iD == ivdVar.b()) {
                            return;
                        }
                        ivdVar.e(iB);
                        ivdVar.a(iD);
                        LogUtil.a("DietRecordHelper", "refreshWeightManager onResponse weightManager ", ivdVar);
                        nlx.a(ivdVar, jB, false, (ResponseCallback<ivd>) null);
                    }
                }
            }
        });
    }

    public static void d(qox qoxVar, vfy vfyVar, boolean z) {
        if (qoxVar == null) {
            return;
        }
        if (z) {
            qoxVar.c(R.color.circle_scale_ring_start_default, R.color.circle_scale_ring_center_default, R.color.circle_scale_ring_end_default);
        } else {
            qoxVar.c(R.color.circle_scale_ring_start, R.color.circle_scale_ring_center, R.color.circle_scale_ring_end);
        }
        qoxVar.b(b(z ? null : vfyVar));
        qoxVar.d(a(vfyVar, ((Integer) c(vfyVar).second).intValue()));
        Pair<Float, Float> pairA = a(vfyVar);
        if (pairA == null) {
            qoxVar.d(0.0f, 0.0f);
            qoxVar.c("");
        } else {
            qoxVar.d(((Float) pairA.first).floatValue(), ((Float) pairA.second).floatValue());
            qoxVar.c(qre.f(R.string.IDS_weight_heat_recording_target));
        }
    }

    public static void d(HealthCircleScaleRuler healthCircleScaleRuler, vfy vfyVar, boolean z) {
        if (healthCircleScaleRuler == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshHealthCircleScaleRuler scaleRuler is null overview ", vfyVar, " isFuture ", Boolean.valueOf(z));
            return;
        }
        healthCircleScaleRuler.setTitle(qre.f(vfyVar.j() < 0.0d ? R.string.IDS_weight_heat_surpluses : R.string.IDS_weight_heat_gap));
        if (z) {
            vfyVar = null;
        }
        healthCircleScaleRuler.setValue(UnitUtil.e(d(vfyVar), 1, 0));
        if (LanguageUtil.c(BaseApplication.b())) {
            return;
        }
        healthCircleScaleRuler.setValueTextDirection(3);
    }

    public static void e(HealthTextView healthTextView, vfy vfyVar, boolean z) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshConsumption overview is null isFuture ", Boolean.valueOf(z), " textView ", healthTextView);
            return;
        }
        int iE = e(vfyVar);
        int iB = 0;
        if (z) {
            iE = 0;
        }
        double dJ = vfyVar.j();
        if (dJ >= 0.0d) {
            if (dJ == 0.0d) {
                iB = (int) UnitUtil.d(vfyVar.e(), 0);
            } else {
                iB = vfyVar.b() + ((int) UnitUtil.d(vfyVar.i(), 0));
            }
        }
        e(healthTextView, iE, iB);
    }

    public static void c(HealthTextView healthTextView, vfy vfyVar, boolean z) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshIntake overview is null isFuture ", Boolean.valueOf(z), " textView ", healthTextView);
            return;
        }
        int iD = (int) UnitUtil.d(vfyVar.h(), 0);
        if (z) {
            iD = 0;
        }
        e(healthTextView, iD, vfyVar.j() >= 0.0d ? (int) UnitUtil.d(vfyVar.e(), 0) : 0);
    }

    private static void e(HealthTextView healthTextView, int i, int i2) {
        String strE;
        if (healthTextView == null) {
            ReleaseLogUtil.e("DietRecordHelper", "refreshTextView textView is null value ", Integer.valueOf(i), " goal ", Integer.valueOf(i2));
            return;
        }
        String strE2 = UnitUtil.e(i, 1, 0);
        if (i2 > 0) {
            strE = qre.e(R.plurals.IDS_hw_todo_cal_unit, i2, strE2, UnitUtil.e(i2, 1, 0));
        } else {
            strE = qre.e(R.plurals.IDS_kcalories_unit, i, strE2);
        }
        SpannableString spannableString = new SpannableString(strE);
        qri.b(spannableString, strE2, R.color.textColorPrimary);
        qri.e(spannableString, strE2, R.string.textFontFamilyMedium);
        qri.c(spannableString, strE2, qre.b(R.dimen.health_common_18dp));
        healthTextView.setText(spannableString);
    }

    public static void a(HealthBubbleLayout healthBubbleLayout, int i, HealthTextView healthTextView, HealthTextView healthTextView2, vfy vfyVar) {
        if (vfyVar == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "consumptionOnClick overview is null");
            return;
        }
        if (healthBubbleLayout == null || healthTextView == null || healthTextView2 == null) {
            ReleaseLogUtil.e("R_DietRecordHelper", "consumptionOnClick bubbleLayout ", healthBubbleLayout, " sportText ", healthTextView, " restingText ", healthTextView2, " overview ", vfyVar);
            return;
        }
        if (healthBubbleLayout.getVisibility() == 0) {
            healthBubbleLayout.setVisibility(8);
            return;
        }
        healthBubbleLayout.setVisibility(0);
        healthBubbleLayout.setArrowPositionCenter(false);
        healthBubbleLayout.setArrowPosition(i - qre.b(R.dimen.health_common_6dp));
        int iD = (int) UnitUtil.d(vfyVar.a(), 0);
        int iG = vfyVar.g();
        healthTextView.setText(qre.a(R.string.IDS_h5_weight_sport_consumption_splicing, qre.e(R.plurals.IDS_kcalories_unit, iD, UnitUtil.e(iD, 1, 0))));
        healthTextView2.setText(qre.a(R.string.IDS_h5_weight_resting_consumption_splicing, qre.e(R.plurals.IDS_kcalories_unit, iG, UnitUtil.e(iG, 1, 0))));
        ReleaseLogUtil.d("R_DietRecordHelper", "consumptionOnClick offset ", Integer.valueOf(i), " consumption ", Integer.valueOf(iD), " restingCaloriesBurned ", Integer.valueOf(iG));
        ThreadPoolManager.c().execute(new Runnable() { // from class: ezx
            @Override // java.lang.Runnable
            public final void run() {
                ezn.d();
            }
        });
    }

    static /* synthetic */ void d() {
        Context contextB = BaseApplication.b();
        fga.d(contextB).e().e((IFlushResult) null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(10008);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataTypes(arrayList);
        hiSyncOption.setSyncId(System.currentTimeMillis());
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        HiHealthNativeApi.a(contextB).synCloud(hiSyncOption, null);
        ReleaseLogUtil.d("DietRecordHelper", "consumptionOnClick flushCacheToDB");
    }

    public static void d(qox qoxVar, boolean z) {
        if (qoxVar == null) {
            ReleaseLogUtil.e("DietRecordHelper", "initCircleScaleRulerData circleScaleRulerData is null");
            return;
        }
        boolean zE = qqs.e(BaseApplication.b());
        ReleaseLogUtil.d("DietRecordHelper", "initCircleScaleRulerData isDarkMode ", Boolean.valueOf(zE), " isWeightCard ", Boolean.valueOf(z));
        int i = R.drawable.circle_scale_ruler_background;
        int i2 = z ? R.drawable.icon_indicator_mini : R.drawable.icon_indicator;
        if (zE) {
            i = R.drawable.circle_scale_ruler_background_dark;
            i2 = z ? R.drawable.icon_indicator_mini_dark : R.drawable.icon_indicator_dark;
        }
        qoxVar.e(qre.c(i));
        qoxVar.c(qre.c(i2));
        qoxVar.e(a());
    }
}
