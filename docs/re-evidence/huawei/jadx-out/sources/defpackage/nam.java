package defpackage;

import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.huawei.android.net.wifi.NfcWifiManagerEx;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nam {
    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WifiConfigurationUtil", "getConnectionWifiPassword() ssid is error");
            return "";
        }
        String strC = c();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("WifiConfigurationUtil", "getConnectionWifiPassword() wifi information is empty");
            return "";
        }
        if (!strC.contains(str)) {
            return "";
        }
        String strA = a(strC);
        return strA.substring(strA.indexOf(str) + str.length());
    }

    private static String a(String str) {
        if (str.length() > 2) {
            int iIndexOf = str.indexOf(":");
            LogUtil.a("WifiConfigurationUtil", "dealWifiPassword() index first: ", Integer.valueOf(iIndexOf));
            if (iIndexOf != -1) {
                int iIndexOf2 = str.indexOf(":", iIndexOf + 1);
                LogUtil.a("WifiConfigurationUtil", "dealWifiPassword() index second: ", Integer.valueOf(iIndexOf2));
                if (iIndexOf2 != -1) {
                    String strSubstring = str.substring(iIndexOf2);
                    LogUtil.a("WifiConfigurationUtil", "dealWifiPassword() second index find");
                    return strSubstring;
                }
                String strSubstring2 = str.substring(str.indexOf(":"));
                LogUtil.a("WifiConfigurationUtil", "dealWifiPassword() second index not find");
                return strSubstring2;
            }
            LogUtil.a("WifiConfigurationUtil", "dealWifiPassword() first index not find");
        }
        return str;
    }

    public static String c() {
        String wpaSuppConfig = NfcWifiManagerEx.getWpaSuppConfig((WifiManager) null);
        if (wpaSuppConfig != null) {
            return wpaSuppConfig;
        }
        LogUtil.j("WifiConfigurationUtil", "getWifiConfigurationInformation() wifi information is empty");
        return "";
    }
}
