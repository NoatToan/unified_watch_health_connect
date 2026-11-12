package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.security.SecurityUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ueh {
    private ueh() {
    }

    public static void c(String str, SparseArray<List<HiHealthData>> sparseArray) {
        LogUtil.a("DayDataCache", "setCacheData time: ", str);
        Context contextB = BaseApplication.b();
        String strC = c(contextB);
        b(contextB, sparseArray.get(2002), "CACHE_KEY_DYNAMIC" + strC);
        b(contextB, sparseArray.get(2018), "CACHE_KEY_REST" + strC);
        b(contextB, sparseArray.get(2105), "CACHE_KEY_NEW_REST" + strC);
        b(contextB, sparseArray.get(2101), "CACHE_KEY_UP" + strC);
        b(contextB, sparseArray.get(2102), "CACHE_KEY_LOW" + strC);
        SharedPreferenceManager.e(contextB, "day_heart_rate_cache", "CACHE_KEY_TIME" + strC, str, null);
    }

    private static void b(Context context, List<HiHealthData> list, String str) {
        SharedPreferenceManager.e(context, "day_heart_rate_cache", str, lsr.e(list, null), null);
    }

    public static SparseArray<List<HiHealthData>> b(String str) {
        LogUtil.a("DayDataCache", "getCacheData time: ", str);
        SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
        Context contextB = BaseApplication.b();
        String strC = c(contextB);
        if (str.equals(SharedPreferenceManager.e(contextB, "day_heart_rate_cache", "CACHE_KEY_TIME" + strC))) {
            e(contextB, "CACHE_KEY_DYNAMIC" + strC, 2002, sparseArray);
            e(contextB, "CACHE_KEY_REST" + strC, 2018, sparseArray);
            e(contextB, "CACHE_KEY_NEW_REST" + strC, 2105, sparseArray);
            e(contextB, "CACHE_KEY_UP" + strC, 2101, sparseArray);
            e(contextB, "CACHE_KEY_LOW" + strC, 2102, sparseArray);
        }
        return sparseArray;
    }

    private static void e(Context context, String str, int i, SparseArray<List<HiHealthData>> sparseArray) {
        String strE = SharedPreferenceManager.e(context, "day_heart_rate_cache", str);
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, ueh.class.getClassLoader(), null, arrayList);
        sparseArray.put(i, arrayList);
    }

    public static boolean b(SparseArray<List<HiHealthData>> sparseArray, SparseArray<List<HiHealthData>> sparseArray2) {
        return sparseArray.size() == 0 || d(sparseArray.get(2002), sparseArray2.get(2002)) || d(sparseArray.get(2018), sparseArray2.get(2018)) || d(sparseArray.get(2105), sparseArray2.get(2105)) || d(sparseArray.get(2101), sparseArray2.get(2101)) || d(sparseArray.get(2102), sparseArray2.get(2102));
    }

    private static boolean d(List<HiHealthData> list, List<HiHealthData> list2) {
        return !lsr.e(list, null).equals(lsr.e(list2, null));
    }

    private static String c(Context context) {
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            return SecurityUtils.c(accountInfo);
        }
        return "";
    }
}
