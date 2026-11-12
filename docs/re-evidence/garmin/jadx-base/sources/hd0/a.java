package hd0;

import android.text.TextUtils;
import com.garmin.proto.generated.WifiSetup;

/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static boolean a(String str, WifiSetup.SecurityType securityType) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (securityType == WifiSetup.SecurityType.WEP) {
            if (str.length() == 10 || str.length() == 26) {
                return str.matches("^[a-fA-F0-9]+$");
            }
            return false;
        }
        if ((securityType == WifiSetup.SecurityType.WPA || securityType == WifiSetup.SecurityType.WPA2) && str.length() == 64) {
            return str.matches("^[a-fA-F0-9]+$");
        }
        return false;
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^[a-fA-F0-9]+$");
    }

    public static int c(String str, WifiSetup.SecurityType securityType) {
        if (securityType != WifiSetup.SecurityType.OPEN && securityType != WifiSetup.SecurityType.WEP && securityType != WifiSetup.SecurityType.WPA && securityType != WifiSetup.SecurityType.WPA2 && securityType != WifiSetup.SecurityType.WPA3) {
            org.apache.commons.lang3.e.l("Invalid security type [", securityType, "]");
            return 0;
        }
        WifiSetup.SecurityType securityType2 = WifiSetup.SecurityType.WEP;
        if ((securityType == securityType2 || securityType == WifiSetup.SecurityType.WPA || securityType == WifiSetup.SecurityType.WPA2) && TextUtils.isEmpty(str)) {
            return 1;
        }
        int length = str != null ? str.length() : 0;
        if (securityType == securityType2) {
            if (length != 5 && length != 10 && length != 13 && length != 26) {
                return 10;
            }
            if ((length == 10 || length == 26) && !b(str)) {
                return 13;
            }
        } else if (securityType == WifiSetup.SecurityType.WPA || securityType == WifiSetup.SecurityType.WPA2 || securityType == WifiSetup.SecurityType.WPA3) {
            if (length < 8) {
                return 11;
            }
            if (length > 64) {
                return 12;
            }
            if (length == 64 && !b(str)) {
                return 13;
            }
        }
        return 0;
    }
}
