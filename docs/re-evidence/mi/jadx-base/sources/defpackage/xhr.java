package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class xhr {
    public static void a(List<ScanResult> list, String str) {
        Iterator<ScanResult> it = list.iterator();
        while (it.hasNext()) {
            ScanResult next = it.next();
            if (!j() && f(next.capabilities)) {
                it.remove();
            } else if (e(next.frequency)) {
                it.remove();
            } else if (next.SSID.startsWith("yunmai-scales-ms3001")) {
                it.remove();
            } else {
                String str2 = next.SSID;
                if (TextUtils.isEmpty(str2)) {
                    it.remove();
                } else if (str != null && str2.contains(str)) {
                    it.remove();
                }
            }
        }
    }

    public static String b(Context context) {
        String ssid;
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo == null || (ssid = connectionInfo.getSSID()) == null) {
            return null;
        }
        return i(ssid);
    }

    public static List<ScanResult> c(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        wifiManager.getConnectionInfo();
        return wifiManager.getScanResults();
    }

    public static boolean d(String str) {
        return str.contains("WEP") || str.contains("WPA");
    }

    public static boolean e(int i) {
        return i > 4900 && i < 5900;
    }

    public static boolean f(String str) {
        return str.contains("EAP");
    }

    public static boolean g(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
            return false;
        }
        return activeNetworkInfo.isConnected();
    }

    public static void h(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        wifiManager.setWifiEnabled(true);
        wifiManager.startScan();
    }

    public static String i(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (str.length() >= 3 && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }

    public static boolean j() {
        return false;
    }
}
