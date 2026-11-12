package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class usx {
    private usx() {
    }

    public static void e(String str, SparseArray<List<HiHealthData>> sparseArray) {
        LogUtil.a("BloodPressureDataCache", "setCacheData time: ", str);
        Context contextB = BaseApplication.b();
        c(contextB, sparseArray.get(10002), "CACHE_KEY_CORE");
        SharedPreferenceManager.e(contextB, "day_bloodpressure_cache", "CACHE_KEY_TIME", str, null);
    }

    private static void c(Context context, List<HiHealthData> list, String str) {
        SharedPreferenceManager.e(context, "day_bloodpressure_cache", str, lsr.e(list, null), null);
    }

    public static SparseArray<List<HiHealthData>> b(String str) {
        LogUtil.a("BloodPressureDataCache", "getCacheData time: ", str);
        SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
        Context contextB = BaseApplication.b();
        if (str.equals(SharedPreferenceManager.e(contextB, "day_bloodpressure_cache", "CACHE_KEY_TIME"))) {
            d(contextB, "CACHE_KEY_CORE", 10002, sparseArray);
        }
        return sparseArray;
    }

    private static void d(Context context, String str, int i, SparseArray<List<HiHealthData>> sparseArray) {
        String strE = SharedPreferenceManager.e(context, "day_bloodpressure_cache", str);
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, usx.class.getClassLoader(), null, arrayList);
        sparseArray.put(i, arrayList);
    }

    public static boolean c(SparseArray<List<HiHealthData>> sparseArray, SparseArray<List<HiHealthData>> sparseArray2) {
        return sparseArray.size() == 0 || b(sparseArray.get(10002), sparseArray2.get(10002));
    }

    private static boolean b(List<HiHealthData> list, List<HiHealthData> list2) {
        return !lsr.e(list, null).equals(lsr.e(list2, null));
    }
}
