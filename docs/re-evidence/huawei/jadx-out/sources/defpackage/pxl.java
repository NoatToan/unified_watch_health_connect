package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pxl {
    public static int c(Context context) {
        int i;
        if (!c() || !a(context)) {
            i = 1;
        } else if (!b(context)) {
            i = 2;
        } else if (!g(context)) {
            i = 3;
        } else if (!d(context)) {
            i = 13;
        } else if (!h(context)) {
            i = 14;
        } else if (f(context)) {
            LogUtil.d("ErrorStatusUtils", "getEsimErrorStatus else branch");
            i = 0;
        } else {
            i = 6;
        }
        LogUtil.a("ErrorStatusUtils", "getEsimErrorStatus errorStatus = ", Integer.valueOf(i));
        return i;
    }

    public static String d(Context context, int i) {
        if (i == 1) {
            return context.getResources().getString(R.string.IDS_plugin_bt_fail);
        }
        if (i == 2) {
            return context.getResources().getString(R.string.IDS_plugin_esim_no_network);
        }
        if (i == 3) {
            return context.getResources().getString(R.string.IDS_plugin_multi_esim_no_permisson_new);
        }
        if (i == 6) {
            return context.getResources().getString(R.string.IDS_plugin_multi_esim_device_no_support);
        }
        if (i == 7) {
            return context.getResources().getString(R.string.IDS_plugin_device_info_fail);
        }
        if (i == 8) {
            return context.getResources().getString(R.string.IDS_card_status_error_tips);
        }
        if (i == 13) {
            return context.getResources().getString(R.string.IDS_plugin_multi_esim_no_sim_card);
        }
        if (i == 14) {
            return context.getResources().getString(R.string.IDS_esim_unable_read_sim_information);
        }
        return a(context, i);
    }

    private static String a(Context context, int i) {
        if (i == 4) {
            return e(context);
        }
        if (i == 11) {
            return context.getResources().getString(R.string.IDS_plugin_battery_power_fail);
        }
        if (i == 12) {
            return context.getResources().getString(R.string.IDS_plugin_air_mode);
        }
        LogUtil.j("ErrorStatusUtils", "getEsimOtherErrorTips default");
        return "";
    }

    private static String e(Context context) {
        List<Map<String, Object>> listB = pxk.b(context);
        if (!listB.isEmpty()) {
            if (listB.size() == 1) {
                String strD = d(context, listB.get(0));
                if (!TextUtils.isEmpty(strD)) {
                    return String.format(Locale.ENGLISH, context.getString(R.string.IDS_esim_single_card_no_support), strD);
                }
            }
            return context.getString(R.string.IDS_esim_double_card_no_support);
        }
        return context.getString(R.string.IDS_plugin_multi_esim_error_no_sim);
    }

    private static String d(Context context, Map<String, Object> map) {
        String str;
        pxe pxeVarA;
        if (!(map.get("imsi") instanceof String)) {
            str = "";
        } else {
            str = (String) map.get("imsi");
        }
        String strC = pxk.c(context, str);
        if (TextUtils.isEmpty(strC) && (map.get("spn") instanceof String)) {
            strC = (String) map.get("spn");
        }
        return (!TextUtils.isEmpty(strC) || (pxeVarA = pxh.a(map)) == null) ? strC : pxeVarA.e();
    }

    public static boolean c() {
        int iH = BTDeviceMgrUtil.c().h();
        LogUtil.a("ErrorStatusUtils", "bluetoothSwitchState = ", Integer.valueOf(iH));
        return iH == 3;
    }

    public static boolean a(Context context) {
        int iC = npz.b().c();
        LogUtil.a("ErrorStatusUtils", "connectStatus = ", Integer.valueOf(iC));
        return iC == 2;
    }

    public static boolean b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        boolean z = false;
        if (systemService instanceof ConnectivityManager) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            if ((networkInfo != null && networkInfo.isConnected()) || (networkInfo2 != null && networkInfo2.isConnected())) {
                z = true;
            }
        }
        LogUtil.a("isNetWorkConnected = ", Boolean.valueOf(z));
        return z;
    }

    private static boolean g(Context context) {
        String[] strArr;
        if (Build.VERSION.SDK_INT > 29) {
            strArr = new String[]{"android.permission.READ_PHONE_NUMBERS"};
        } else {
            strArr = new String[]{"android.permission.READ_PHONE_STATE"};
        }
        if (lsg.d(context, strArr)) {
            return true;
        }
        LogUtil.j("ErrorStatusUtils", "getDefaultSimCardInfo missing phonePermission");
        return false;
    }

    public static boolean d(Context context) {
        Object systemService = context.getSystemService("phone");
        boolean z = false;
        if (!(systemService instanceof TelephonyManager)) {
            LogUtil.j("ErrorStatusUtils", "get system service error");
            return false;
        }
        int simState = ((TelephonyManager) systemService).getSimState();
        LogUtil.a("ErrorStatusUtils", "simState = ", Integer.valueOf(simState));
        if (simState != 0 && simState != 1) {
            z = true;
        }
        LogUtil.a("ErrorStatusUtils", "isHaveSimCard = ", Boolean.valueOf(z));
        return z;
    }

    private static boolean h(Context context) {
        String str;
        List<Map<String, Object>> listB = pxk.b(context);
        boolean z = false;
        for (int i = 0; i < listB.size(); i++) {
            if (!(listB.get(i).get("imsi") instanceof String)) {
                str = "";
            } else {
                str = (String) listB.get(i).get("imsi");
            }
            if (!TextUtils.isEmpty(str)) {
                z = true;
                break;
            }
        }
        ReleaseLogUtil.d("R_SportRecordImageDownloadUtil", "isHasImsiInformation = ", Boolean.valueOf(z));
        return z;
    }

    private static boolean f(Context context) {
        boolean zM = npz.b().m();
        LogUtil.a("ErrorStatusUtils", "isSupportNewEsim = ", Boolean.valueOf(zM));
        return zM;
    }

    public static boolean d(String str, int i) {
        if (i != 2 || CommonUtil.bg()) {
            return false;
        }
        return !pxk.g() || "52001".equals(str) || "52003".equals(str);
    }
}
