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
public class uji {
    private uji() {
    }

    public static void d(String str, SparseArray<List<HiHealthData>> sparseArray) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SCUI_StepDayDataCache", "setCacheData time is null or empty");
            return;
        }
        if (sparseArray == null || sparseArray.size() < 1) {
            LogUtil.j("SCUI_StepDayDataCache", "setCacheData dataArray is null or size less than two");
            return;
        }
        LogUtil.a("SCUI_StepDayDataCache", "setCacheData time: ", str);
        Context contextB = BaseApplication.b();
        String strC = c(contextB);
        List<HiHealthData> list = sparseArray.get(0);
        List<HiHealthData> list2 = sparseArray.get(1);
        d(contextB, list, "cache_key_data" + strC);
        d(contextB, list2, "cache_key_sum" + strC);
        SharedPreferenceManager.e(contextB, "step_day_data_cache", "cache_key_time" + strC, str, null);
    }

    public static SparseArray<List<HiHealthData>> d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SCUI_StepDayDataCache", "getCacheData time is null or empty");
            return null;
        }
        LogUtil.a("SCUI_StepDayDataCache", "getCacheData time: ", str);
        SparseArray<List<HiHealthData>> sparseArray = new SparseArray<>();
        Context contextB = BaseApplication.b();
        String strC = c(contextB);
        if (str.equals(SharedPreferenceManager.e(contextB, "step_day_data_cache", "cache_key_time" + strC))) {
            e(contextB, "cache_key_data" + strC, 0, sparseArray);
            e(contextB, "cache_key_sum" + strC, 1, sparseArray);
        }
        return sparseArray;
    }

    public static boolean d(SparseArray<List<HiHealthData>> sparseArray, SparseArray<List<HiHealthData>> sparseArray2) {
        if (sparseArray == null || sparseArray.size() < 1) {
            LogUtil.j("SCUI_StepDayDataCache", "isSame cacheData is null or size less than two");
            return false;
        }
        if (sparseArray2 != null && sparseArray2.size() >= 1) {
            return b(sparseArray.get(0), sparseArray2.get(0)) && b(sparseArray.get(1), sparseArray2.get(1));
        }
        LogUtil.j("SCUI_StepDayDataCache", "isSame queryData is null or size less than two");
        return false;
    }

    private static void d(Context context, List<HiHealthData> list, String str) {
        SharedPreferenceManager.e(context, "step_day_data_cache", str, lsr.e(list, null), null);
    }

    private static void e(Context context, String str, int i, SparseArray<List<HiHealthData>> sparseArray) {
        String strE = SharedPreferenceManager.e(context, "step_day_data_cache", str);
        ArrayList arrayList = new ArrayList();
        lsr.c(strE, uji.class.getClassLoader(), null, arrayList);
        sparseArray.put(i, arrayList);
    }

    private static boolean b(List<HiHealthData> list, List<HiHealthData> list2) {
        return lsr.e(list, null).equals(lsr.e(list2, null));
    }

    private static String c(Context context) {
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (!TextUtils.isEmpty(accountInfo)) {
            return SecurityUtils.c(accountInfo);
        }
        return "";
    }
}
