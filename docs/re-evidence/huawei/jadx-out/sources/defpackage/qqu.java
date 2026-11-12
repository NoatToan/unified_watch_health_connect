package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes16.dex */
public class qqu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f46686b;

    public static void c(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(20002), "map_type_setting_key", Integer.toString(i), new StorageParams());
        SharedPreferenceManager.e(context, Integer.toString(20002), "auto_map_setting", Integer.toString(i), new StorageParams());
        f46686b = i;
    }

    public static int c(Context context) {
        if (context == null) {
            LogUtil.j("Track_MapChangeUtils", "checkChinaOrAbroadByMCC context is null");
            return 0;
        }
        Object systemService = context.getSystemService("phone");
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.j("Track_MapChangeUtils", "checkChinaOrAbroadByMCC object is not instanceof TelephonyManager");
            return 0;
        }
        String networkOperator = ((TelephonyManager) systemService).getNetworkOperator();
        LogUtil.a("Track_MapChangeUtils", "checkChinaOrAbroadByMCC ", networkOperator);
        if (TextUtils.isEmpty(networkOperator) || c(networkOperator)) {
            LogUtil.a("Track_MapChangeUtils", "checkChinaOrAbroadByMCC: 0!");
            return 0;
        }
        if (e(networkOperator)) {
            LogUtil.a("Track_MapChangeUtils", "checkChinaOrAbroadByMCC: 1!");
            return 1;
        }
        LogUtil.a("Track_MapChangeUtils", "checkChinaOrAbroadByMCC: 2!");
        return 2;
    }

    public static boolean e(Context context) {
        if (context != null) {
            return c(context) == 0;
        }
        LogUtil.j("Track_MapChangeUtils", "checkSimCardStateIsOffLine context is null");
        return false;
    }

    public static boolean a(Context context) {
        if (context != null) {
            return 1 == c(context);
        }
        LogUtil.j("Track_MapChangeUtils", "checkSimCardInChinaByMCC context is null");
        return false;
    }

    private static boolean e(String str) {
        if (str.length() < 3) {
            LogUtil.j("Track_MapChangeUtils", "isInChina mccAndMncCode.length() < 3");
            return false;
        }
        return Constants.DEFAULT_MCC_CODE.equals(str.substring(0, 3));
    }

    private static boolean c(String str) {
        if (str.length() < 3) {
            LogUtil.j("Track_MapChangeUtils", "isNoSim mccAndMncCode.length() < 3");
            return false;
        }
        return "000".equals(str.substring(0, 3));
    }

    public static void b(Context context) {
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "map_type_setting_key");
        if (strE == null || "".equals(strE)) {
            f46686b = 0;
            return;
        }
        try {
            f46686b = Integer.parseInt(strE);
        } catch (NumberFormatException e) {
            LogUtil.a("Track_MapChangeUtils", "initMapType ", e.getMessage());
            f46686b = 0;
        }
    }

    public static boolean e() {
        return f46686b == 1;
    }

    public static boolean b() {
        return f46686b == 2;
    }

    public static boolean c() {
        return f46686b == 3;
    }
}
