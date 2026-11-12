package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class iuo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ivd f38040a;
    private static WeightTargetDifferences h;
    private static final String d = String.valueOf(PrebakedEffectId.RT_HEARTBEAT);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<eex> f38042c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray<Map<Integer, List<HiHealthData>>> f38041b = new SparseArray<>();
    private static final Map<String, String> e = new ConcurrentHashMap();

    private static void b(String str, String str2) {
        LogUtil.b("WeightCacheUtils", "setStringForSharedPreferences key ", str, " value ", str2);
        lua.f(d, str, str2);
    }

    private static String c(String str) {
        return lua.e(d, str, "");
    }

    private static void b(String str, long j) {
        LogUtil.b("WeightCacheUtils", "setLongForSharedPreferences key ", str, " value ", Long.valueOf(j));
        lua.a(d, str, j);
    }

    private static long e(String str) {
        return lua.d(d, str, 0L);
    }

    private static void d(String str, float f) {
        LogUtil.b("WeightCacheUtils", "setFloatForSharedPreferences key ", str, " value ", Float.valueOf(f));
        lua.a(d, str, f);
    }

    private static float b(String str) {
        return lua.d(d, str, 0.0f);
    }

    public static void a(long j) {
        b("SYNC_SAMPLE_CONFIG_TIME_MILLIS", j);
    }

    public static boolean m() {
        long jE = e("SYNC_SAMPLE_CONFIG_TIME_MILLIS");
        ReleaseLogUtil.c("R_WeightCacheUtils", "isSyncSampleConfigSuccess syncSampleConfigTimeMillis ", Long.valueOf(jE));
        return jE > 0;
    }

    public static long g() {
        return e("QUERY_WEIGHT_START_TIME_MILLIS");
    }

    public static void b(long j) {
        boolean zE = lua.e();
        ReleaseLogUtil.c("R_WeightCacheUtils", "setQueryWeightStartTimeMillis isPullAllStatus ", Boolean.valueOf(zE), " timeMillis ", Long.valueOf(j));
        if (zE) {
            b("QUERY_WEIGHT_START_TIME_MILLIS", j);
        }
    }

    public static float h() {
        return b("AI_PLAN_START_WEIGHT");
    }

    public static void d(float f) {
        d("AI_PLAN_START_WEIGHT", f);
    }

    public static float j() {
        return b("AI_PLAN_TARGET_WEIGHT");
    }

    public static void e(float f) {
        d("AI_PLAN_TARGET_WEIGHT", f);
    }

    public static float b() {
        return b("AI_PLAN_FAT_RATE");
    }

    public static void c(float f) {
        d("AI_PLAN_FAT_RATE", f);
    }

    public static boolean l() {
        long jE = e("DIET_SUPPORT_TIME_MILLIS");
        ReleaseLogUtil.c("R_WeightCacheUtils", "isNeedGetSupportDietSetting timeMillis ", Long.valueOf(jE));
        return jE <= 0 || Math.abs(System.currentTimeMillis() - jE) >= 3600000;
    }

    public static void x() {
        if (Utils.h()) {
            b("DIET_SUPPORT_TIME_MILLIS", System.currentTimeMillis());
        }
    }

    public static void y() {
        if (Utils.h()) {
            b("SHOW_USER_INFO_DIALOG_TIME_MILLIS", System.currentTimeMillis());
        }
    }

    public static boolean o() {
        long jE = e("SHOW_USER_INFO_DIALOG_TIME_MILLIS");
        int iA = lsl.a(jE, System.currentTimeMillis());
        ReleaseLogUtil.c("R_WeightCacheUtils", "isSupportShowUserInfoDialog timeMillis ", Long.valueOf(jE), " intervalDay ", Integer.valueOf(iA));
        return jE <= 0 || Math.abs(iA) >= 8;
    }

    public static void c(long j) {
        boolean zIsMinorAccount = LoginInit.getInstance(BaseApplication.b()).isMinorAccount();
        if (!Utils.h() || zIsMinorAccount) {
            return;
        }
        b("FAT_REDUCTION_SHAPING_TIME_MILLIS", j);
    }

    public static boolean a() {
        boolean zIsMinorAccount = LoginInit.getInstance(BaseApplication.b()).isMinorAccount();
        if (!Utils.h() || zIsMinorAccount || !NetworkUtil.h()) {
            return false;
        }
        long jE = e("FAT_REDUCTION_SHAPING_TIME_MILLIS");
        ReleaseLogUtil.c("R_WeightCacheUtils", "getFatReductionShapingState timeMillis ", Long.valueOf(jE));
        return jE > 0;
    }

    public static void e(boolean z, String str, long j) {
        if (Utils.h() && z) {
            b(str, j);
        }
    }

    public static boolean d(String str) {
        long jE = e(str);
        ReleaseLogUtil.c("R_WeightCacheUtils", "isSupportDietSetting timeMillis ", Long.valueOf(jE));
        return jE > 0 && lsl.e(jE, System.currentTimeMillis()) <= 1;
    }

    public static void b(Map<String, String> map) {
        String strD;
        if (map == null) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "setDietRecordCache dietRecord is null");
            strD = "";
        } else {
            strD = HiJsonUtil.d(map);
        }
        b("DIET_ANALYSIS", strD);
    }

    public static Map<String, String> e() {
        String strC = c("DIET_ANALYSIS");
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "getDietAnalysisCache json ", strC);
            return null;
        }
        return (Map) HiJsonUtil.d(strC, new TypeToken<Map<String, String>>() { // from class: com.huawei.health.weight.WeightCacheUtils$1
        }.getType());
    }

    public static void c(vgo vgoVar) {
        String strD;
        if (vgoVar == null) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "setDietRecordCache dietRecord is null");
            strD = "";
        } else {
            strD = HiJsonUtil.d(vgoVar);
        }
        b("DIET_RECORD", strD);
    }

    public static vgo c() {
        String strC = c("DIET_RECORD");
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "getDietRecordCache json ", strC);
            return null;
        }
        return (vgo) HiJsonUtil.d(strC, vgo.class);
    }

    public static void e(List<vgo> list) {
        String strD;
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "setDietRecordListCache list is null");
            strD = "";
        } else {
            strD = HiJsonUtil.d(list);
        }
        b("DIET_RECORD_LIST", strD);
    }

    public static List<vgo> d() {
        String strC = c("DIET_RECORD_LIST");
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "getDietRecordListCache json ", strC);
            return Collections.EMPTY_LIST;
        }
        return (List) HiJsonUtil.d(strC, new TypeToken<List<vgo>>() { // from class: com.huawei.health.weight.WeightCacheUtils$2
        }.getType());
    }

    public static void c(List<eex> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "setFoodList foodList ", list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (eex eexVar : f38042c) {
            if (eexVar == null) {
                ReleaseLogUtil.d("R_WeightCacheUtils", "setFoodList cacheFood is null sFoodList ", f38042c);
            } else {
                String strA = eexVar.a();
                if (TextUtils.isEmpty(strA)) {
                    ReleaseLogUtil.d("R_WeightCacheUtils", "setFoodList cacheFoodId ", strA, " cacheFood ", eexVar);
                } else {
                    for (eex eexVar2 : list) {
                        if (eexVar2 == null) {
                            ReleaseLogUtil.d("R_WeightCacheUtils", "setFoodList food is null foodList ", list);
                        } else if (TextUtils.equals(strA, eexVar2.a())) {
                            arrayList.add(eexVar);
                        }
                    }
                }
            }
        }
        if (!CollectionUtils.a(arrayList)) {
            f38042c.removeAll(arrayList);
        } else {
            f38042c.addAll(list);
        }
    }

    public static List<eex> f() {
        return f38042c;
    }

    public static void d(long j, Map<Integer, List<HiHealthData>> map) {
        int iA = DateFormatUtil.a(j, TimeZone.getDefault());
        LogUtil.b("WeightCacheUtils", "setRestingCalorie timeMillis ", Long.valueOf(j), " date ", Integer.valueOf(iA), " restingCalorie ", map);
        try {
            f38041b.append(iA, map);
        } catch (ArrayIndexOutOfBoundsException e2) {
            ReleaseLogUtil.b("R_WeightCacheUtils", "setRestingCalorie exception ", ExceptionUtils.c(e2));
        }
    }

    public static Map<Integer, List<HiHealthData>> d(long j) {
        int iIndexOfKey;
        int iA = DateFormatUtil.a(j, TimeZone.getDefault());
        ReleaseLogUtil.c("R_WeightCacheUtils", "getRestingCalorie timeMillis ", Long.valueOf(j), " date ", Integer.valueOf(iA));
        try {
            iIndexOfKey = f38041b.indexOfKey(iA);
        } catch (ArrayIndexOutOfBoundsException e2) {
            ReleaseLogUtil.b("WeightCacheUtils", "getRestingCalorie exception ", ExceptionUtils.c(e2));
            iIndexOfKey = -1;
        }
        if (iIndexOfKey >= 0) {
            SparseArray<Map<Integer, List<HiHealthData>>> sparseArray = f38041b;
            if (iIndexOfKey < sparseArray.size()) {
                return sparseArray.get(iA);
            }
        }
        ReleaseLogUtil.d("R_WeightCacheUtils", "getRestingCalorie indexOfKey ", Integer.valueOf(iIndexOfKey));
        return null;
    }

    public static void b(WeightTargetDifferences weightTargetDifferences) {
        h = weightTargetDifferences;
    }

    public static WeightTargetDifferences k() {
        return h;
    }

    public static void d(ivd ivdVar) {
        f38040a = ivdVar;
    }

    public static ivd n() {
        return f38040a;
    }

    public static void a(String str, long j, List<ius> list) {
        boolean zE = lua.e();
        if (!zE || CollectionUtils.a(list)) {
            LogUtil.e("WeightCacheUtils", "setSubUserInfo tag ", str, " subUserInfoCacheList ", list, " isPullAllStatus ", Boolean.valueOf(zE));
            return;
        }
        Map<String, String> map = e;
        long jI = CommonUtils.i(map.get("modifiedTime"));
        LogUtil.b("WeightCacheUtils", "setSubUserInfo tag ", str, " subUserInfoModifiedTime ", Long.valueOf(jI), " modifiedTime ", Long.valueOf(j));
        if (jI >= j) {
            return;
        }
        String strValueOf = String.valueOf(j);
        map.clear();
        map.put("modifiedTime", strValueOf);
        map.put("configData", HiJsonUtil.d(list));
        ArrayList arrayList = new ArrayList(5);
        ArrayList arrayList2 = new ArrayList(4);
        for (ius iusVar : list) {
            if (iusVar != null) {
                if (arrayList.size() < 5) {
                    arrayList.add(iusVar);
                } else {
                    arrayList2.add(iusVar);
                }
            }
        }
        if (CollectionUtils.a(arrayList)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "setSubUserInfo tag ", str, " cacheListFirst ", arrayList);
        } else {
            HashMap map2 = new HashMap();
            map2.put("modifiedTime", strValueOf);
            map2.put("configData", HiJsonUtil.d(arrayList));
            b("SUB_USER_INFO_CACHE_FIRST", HiJsonUtil.d(map2));
        }
        if (CollectionUtils.a(arrayList2)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "setSubUserInfo tag ", str, " cacheListLast ", arrayList2);
            return;
        }
        HashMap map3 = new HashMap();
        map3.put("modifiedTime", strValueOf);
        map3.put("configData", HiJsonUtil.d(arrayList2));
        b("SUB_USER_INFO_CACHE_LAST", HiJsonUtil.d(map3));
    }

    public static Map<String, String> i() {
        long jI;
        Map<String, String> map = e;
        if (!CollectionUtils.c(map)) {
            return map;
        }
        ArrayList arrayList = new ArrayList();
        String strC = c("SUB_USER_INFO_CACHE_FIRST");
        Map map2 = (Map) HiJsonUtil.d(strC, new TypeToken<Map<String, String>>() { // from class: com.huawei.health.weight.WeightCacheUtils$3
        }.getType());
        long jI2 = 0;
        if (CollectionUtils.c((Map<?, ?>) map2)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "getSubUserInfo cacheFirst ", map2, " cacheFirstJson ", strC);
            jI = 0;
        } else {
            arrayList.addAll((List) HiJsonUtil.d((String) map2.get("configData"), new TypeToken<List<ius>>() { // from class: com.huawei.health.weight.WeightCacheUtils$4
            }.getType()));
            jI = CommonUtils.i((String) map2.get("modifiedTime"));
        }
        String strC2 = c("SUB_USER_INFO_CACHE_LAST");
        Map map3 = (Map) HiJsonUtil.d(strC2, new TypeToken<Map<String, String>>() { // from class: com.huawei.health.weight.WeightCacheUtils$5
        }.getType());
        if (CollectionUtils.c((Map<?, ?>) map3)) {
            ReleaseLogUtil.d("R_WeightCacheUtils", "getSubUserInfo cacheLast ", map3, " cacheLastJson ", strC2);
        } else {
            arrayList.addAll((List) HiJsonUtil.d((String) map3.get("configData"), new TypeToken<List<ius>>() { // from class: com.huawei.health.weight.WeightCacheUtils$6
            }.getType()));
            jI2 = CommonUtils.i((String) map3.get("modifiedTime"));
        }
        if (CollectionUtils.a(arrayList)) {
            return Collections.EMPTY_MAP;
        }
        map.clear();
        map.put("configData", HiJsonUtil.d(arrayList));
        map.put("modifiedTime", String.valueOf(Math.max(jI, jI2)));
        return map;
    }

    public static void q() {
        r();
        p();
        w();
        s();
        t();
        ArrayList arrayList = new ArrayList(5);
        arrayList.add("DIET_SUPPORT_TIME_MILLIS");
        arrayList.add("SYNC_SAMPLE_CONFIG_TIME_MILLIS");
        arrayList.add("QUERY_WEIGHT_START_TIME_MILLIS");
        arrayList.add("SUB_USER_INFO_CACHE_FIRST");
        arrayList.add("SUB_USER_INFO_CACHE_LAST");
        lua.e(d, arrayList);
        ReleaseLogUtil.c("R_WeightCacheUtils", "reset deleteKeyListByUserId list ", arrayList);
    }

    public static void r() {
        f38042c.clear();
    }

    public static void p() {
        f38041b.clear();
    }

    public static void w() {
        h = null;
    }

    public static void s() {
        f38040a = null;
    }

    public static void t() {
        e.clear();
    }
}
