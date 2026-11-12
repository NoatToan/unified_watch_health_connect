package com.xiaomi.hm.health.device;

import android.bluetooth.BluetoothAdapter;
import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class HMShoesQRHelper {
    private static final int a = 12;
    private static final String b = "http://iot.qq.com/add?";
    private static final String c = "http://iot.qq.com/add?pid=1700002201&sn=H157";

    public static final class QRResult {
        private String a;
        private String b;
        private String c;

        public QRResult(String str, String str2, String str3) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public String getBrandInfo() {
            return this.a;
        }

        public String getMacAddress() {
            return this.b;
        }

        public String getSN() {
            return this.c;
        }

        public boolean isValid() {
            return !TextUtils.isEmpty(this.a) && BluetoothAdapter.checkBluetoothAddress(this.b);
        }

        public String toString() {
            return "brand:" + this.a + ",mac:" + this.b + ",sn:" + this.c;
        }
    }

    private static Map<String, String> a(String str) {
        HashMap map = new HashMap();
        String strF = f(str);
        if (strF == null) {
            return map;
        }
        for (String str2 : strF.split("[&]")) {
            String[] strArrSplit = str2.split("[=]");
            if (strArrSplit.length > 1) {
                map.put(strArrSplit[0], strArrSplit[1]);
            } else if (!"".equals(strArrSplit[0])) {
                map.put(strArrSplit[0], "");
            }
        }
        return map;
    }

    private static QRResult b(String str) {
        int i;
        int iIndexOf = str.indexOf(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        if (iIndexOf == -1 || (i = iIndexOf - 12) < 0) {
            return null;
        }
        String strE = e(str.substring(i, iIndexOf));
        String strSubstring = str.substring(iIndexOf + 1, str.length());
        String strSubstring2 = str.substring(0, i);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return new QRResult(strSubstring2, strE, strSubstring);
    }

    private static QRResult c(String str) {
        Map<String, String> mapA = a(str);
        String strE = e(mapA.get("mac"));
        String str2 = mapA.get("sn");
        String str3 = mapA.get(DTransferConstants.PID);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return new QRResult(str3, strE, str2);
    }

    private static QRResult d(String str) {
        Map<String, String> mapA = a(str);
        String str2 = mapA.get("sn");
        String str3 = mapA.get(DTransferConstants.PID);
        String strE = e(str2.substring(4));
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return new QRResult(str3, strE, str2);
    }

    private static String e(String str) {
        if (str.length() != 12) {
            return null;
        }
        int length = str.length();
        int i = 2;
        StringBuilder sb = new StringBuilder(str.substring(0, 2));
        while (i < length) {
            sb.append(":");
            int i2 = i + 2;
            sb.append(str.substring(i, i2));
            i = i2;
        }
        String upperCase = sb.toString().toUpperCase();
        if (BluetoothAdapter.checkBluetoothAddress(upperCase)) {
            return upperCase;
        }
        return null;
    }

    private static String f(String str) {
        String lowerCase = str.trim().toLowerCase();
        String[] strArrSplit = lowerCase.split("[?]");
        if (lowerCase.length() <= 1 || strArrSplit.length <= 1 || strArrSplit[1] == null) {
            return null;
        }
        return strArrSplit[1];
    }

    public static QRResult parseQR(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(c)) {
            return d(str);
        }
        QRResult qRResultC = str.startsWith(b) ? c(str) : b(str);
        HMLog.i("capture", "qrResult:" + qRResultC, new Object[0]);
        return qRResultC;
    }
}
