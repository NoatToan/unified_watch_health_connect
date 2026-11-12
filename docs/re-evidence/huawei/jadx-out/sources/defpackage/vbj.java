package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vbj {
    public static SparseArray<Object> d(int[] iArr, String str) {
        SparseArray<Object> sparseArray = new SparseArray<>();
        Context context = BaseApplication.getContext();
        String strE = SharedPreferenceManager.e(context, "day_temperature_cache", "CACHE_KEY_TIME");
        LogUtil.a("TemperatureDataCache", "getCacheData timeStr: ", str, " cacheTime: ", strE);
        if (TextUtils.equals(strE, str)) {
            for (int i : iArr) {
                e(context, i, sparseArray);
            }
        }
        return sparseArray;
    }

    private static void e(Context context, int i, SparseArray<Object> sparseArray) {
        String strE = SharedPreferenceManager.e(context, "day_temperature_cache", a(i));
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, vbj.class.getClassLoader(), null, arrayList);
        sparseArray.put(i, arrayList);
    }

    private static String a(int i) {
        return "CACHE_KEY_" + i;
    }

    public static void b(int[] iArr, String str, SparseArray<Object> sparseArray) {
        LogUtil.a("TemperatureDataCache", "setCacheData, time: ", str);
        Context context = BaseApplication.getContext();
        for (int i : iArr) {
            Object obj = sparseArray.get(i);
            d(context, obj instanceof List ? (List) obj : new ArrayList(), i);
        }
        SharedPreferenceManager.e(context, "day_temperature_cache", "CACHE_KEY_TIME", str, null);
    }

    private static void d(Context context, List<HiHealthData> list, int i) {
        SharedPreferenceManager.e(context, "day_temperature_cache", a(i), lsr.e(list, null), null);
    }

    public static boolean a(int[] iArr, SparseArray<Object> sparseArray, SparseArray<Object> sparseArray2) {
        if (sparseArray.size() <= 0) {
            LogUtil.a("TemperatureDataCache", "cacheData size <= 0");
            return true;
        }
        for (int i : iArr) {
            if (d(sparseArray.get(i) instanceof List ? (List) sparseArray.get(i) : new ArrayList(), sparseArray2.get(i) instanceof List ? (List) sparseArray2.get(i) : new ArrayList())) {
                LogUtil.a("TemperatureDataCache", "list diff type: ", Integer.valueOf(i));
                return true;
            }
        }
        return false;
    }

    private static boolean d(List list, List list2) {
        return !TextUtils.equals(lsr.e(list, null), lsr.e(list2, null));
    }

    public static void d(int[] iArr) {
        LogUtil.a("TemperatureDataCache", "clearCache");
        Context context = BaseApplication.getContext();
        for (int i : iArr) {
            SharedPreferenceManager.e(context, "day_temperature_cache", a(i), null, null);
        }
        SharedPreferenceManager.e(context, "day_temperature_cache", "CACHE_KEY_TIME", null, null);
    }
}
