package defpackage;

import android.text.TextUtils;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.KeyValDbManager;
import health.compact.a.util.LogUtil;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class mgb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, Integer> f41642c = new ConcurrentHashMap<>(16);

    public static boolean b(String str, edl edlVar) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DevicePairModeUtils", "deviceName is empty");
            return false;
        }
        if (edlVar == null || edlVar.i() == null) {
            LogUtil.d("DevicePairModeUtils", "wearDeviceInfo is null");
            return false;
        }
        String strBk = edlVar.i().bk();
        LogUtil.a("DevicePairModeUtils", "pairModelBluetoothName: ", strBk);
        for (String str2 : strBk.split(",")) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2.trim()) && str.toUpperCase(Locale.ENGLISH).contains(str2.trim().toUpperCase(Locale.ENGLISH))) {
                z = true;
                break;
            }
        }
        LogUtil.a("DevicePairModeUtils", "isSupportPairMode: ", Boolean.valueOf(z));
        return z;
    }

    public static int d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DevicePairModeUtils", "getPairMode deviceIdentify is empty.");
            return -1;
        }
        if (f41642c.get(str) != null) {
            return f41642c.get(str).intValue();
        }
        int iE = e(str);
        f41642c.put(str, Integer.valueOf(iE));
        return iE;
    }

    public static void c(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("DevicePairModeUtils", "setPairMode deviceIdentify is empty.");
        } else {
            f41642c.put(str, Integer.valueOf(i));
            e(str, i);
        }
    }

    private static void e(String str, int i) {
        String str2 = "pair_mode_key" + nio.c(str);
        LogUtil.a("DevicePairModeUtils", "pairMode: ", Integer.valueOf(i), " pairMode saveKey: ", str2);
        KeyValDbManager.d(BaseApplication.getContext()).b(str2, String.valueOf(i));
    }

    private static int e(String str) {
        String str2 = "pair_mode_key" + nio.c(str);
        LogUtil.a("DevicePairModeUtils", "getDevicePairMode queryKey: ", str2);
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c(str2);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.d("DevicePairModeUtils", "getDevicePairMode queryValue is empty.");
            return -1;
        }
        try {
            return Integer.parseInt(strC);
        } catch (NumberFormatException unused) {
            LogUtil.c("DevicePairModeUtils", "getDevicePairMode occur NumberFormatException");
            return -1;
        }
    }

    public static boolean e(int i) {
        boolean zIsBundleModule = AppBundle.c().isBundleModule("PluginWearAbility");
        LogUtil.a("DevicePairModeUtils", "isBundleModule : ", Boolean.valueOf(zIsBundleModule));
        boolean zContains = AppBundle.d().getInstalledModules().contains("PluginWearAbility");
        LogUtil.a("DevicePairModeUtils", "isNotPluginWearAbilityLoaded : ", Boolean.valueOf(!zContains));
        boolean z = i != 2;
        LogUtil.a("DevicePairModeUtils", "isNotFamilyPairMode : ", Boolean.valueOf(z));
        boolean z2 = zIsBundleModule && !zContains && z;
        LogUtil.a("DevicePairModeUtils", "Should download pluginWearAbility : ", Boolean.valueOf(z2));
        return z2;
    }
}
