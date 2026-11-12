package com.ximalaya.ting.android.opensdk.player.advertis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.huami.network.hmnetwork.utils.a;
import com.ximalaya.ting.android.opensdk.datatrasfer.DeviceInfoProviderDefault;
import com.ximalaya.ting.android.opensdk.httputil.XimalayaException;
import com.ximalaya.ting.android.opensdk.util.MyAsyncTask;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes22.dex */
public class OpenSdkUtils {
    public static final int NETWORK_TYPE_MOBILE = 0;
    public static final int NETWORK_TYPE_NONE = -1;
    public static final int NETWORK_TYPE_WIFI = 1;
    public static final int OPERATOR_CMCC = 0;
    public static final int OPERATOR_OTHER = 3;
    public static final int OPERATOR_TELECOM = 2;
    public static final int OPERATOR_UNICOME = 1;
    private static Cipher cipher = null;
    private static String key = "1tyt1zuKMloXu/prwDTm5Q==";
    public static String mAndroidId = null;
    private static String mImei = null;
    private static String mMac = "";
    private static String mVersion = "";
    private static String phoneIp;

    public static byte[] AesEcbNopaddingDecrypt(byte[] bArr, byte[] bArr2) throws Exception {
        if (cipher == null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, a.a);
            Cipher cipher2 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher = cipher2;
            cipher2.init(2, secretKeySpec);
        }
        return cipher.doFinal(bArr);
    }

    public static String getAndroidId(Context context) {
        if (context == null) {
            return null;
        }
        if (!TextUtils.isEmpty(mAndroidId)) {
            return mAndroidId;
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            mAndroidId = string;
            return string;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getApplicationName(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        if (context == null) {
            return null;
        }
        try {
            packageManager = context.getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return (String) packageManager.getApplicationLabel(applicationInfo);
    }

    public static String getIMEI(Context context) {
        try {
            return getIMEIAndNotDefual(context);
        } catch (Exception unused) {
            return DeviceInfoProviderDefault.RESULT_UNDEFINED;
        }
    }

    public static String getIMEIAndNotDefual(final Context context) throws Exception {
        Runnable runnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.OpenSdkUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String unused = OpenSdkUtils.mImei = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                } catch (Exception unused2) {
                    String unused3 = OpenSdkUtils.mImei = null;
                }
            }
        };
        if (!TextUtils.isEmpty(mImei)) {
            MyAsyncTask.execute(runnable, true);
            return mImei;
        }
        runnable.run();
        if (TextUtils.isEmpty(mImei)) {
            throw new Exception("未获取到imei");
        }
        return mImei;
    }

    @SuppressLint({"WifiManagerLeak"})
    public static String getLocalMacAddress(Context context) throws XimalayaException {
        if (TextUtils.isEmpty(mMac)) {
            mMac = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        if (TextUtils.isEmpty(mMac)) {
            throw new XimalayaException(1006, "get mac address error");
        }
        return mMac;
    }

    private static String getMobileIp() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && isIP(inetAddressNextElement.getHostAddress())) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int getNetType(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception e) {
            e.printStackTrace();
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return -1;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            return -1;
        }
        return activeNetworkInfo.getType() == 1 ? 1 : 0;
    }

    public static int getOperator(Context context) {
        String simOperator;
        try {
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception e) {
            e.printStackTrace();
            simOperator = null;
        }
        if (simOperator == null) {
            return 3;
        }
        byte b = -1;
        switch (simOperator.hashCode()) {
            case 49679470:
                if (simOperator.equals("46000")) {
                    b = 0;
                }
                break;
            case 49679471:
                if (simOperator.equals("46001")) {
                    b = 1;
                }
                break;
            case 49679472:
                if (simOperator.equals("46002")) {
                    b = 2;
                }
                break;
            case 49679473:
                if (simOperator.equals("46003")) {
                    b = 3;
                }
                break;
            case 49679475:
                if (simOperator.equals("46005")) {
                    b = 4;
                }
                break;
            case 49679477:
                if (simOperator.equals("46007")) {
                    b = 5;
                }
                break;
        }
        switch (b) {
            case 0:
            case 2:
            case 5:
                return 0;
            case 1:
                return 1;
            case 3:
            case 4:
                return 2;
            default:
                return 3;
        }
    }

    public static String getPhoneIP(Context context) {
        if (!TextUtils.isEmpty(phoneIp)) {
            return phoneIp;
        }
        int netType = getNetType(context);
        if (netType == 0) {
            phoneIp = getMobileIp();
        } else if (netType == 1) {
            phoneIp = getWifiIp(context);
        }
        return TextUtils.isEmpty(phoneIp) ? "192.168.1.1" : phoneIp;
    }

    public static String getVersion(Context context) {
        String[] strArrSplit;
        String versionName = getVersionName(context);
        if (TextUtils.isEmpty(versionName) || (strArrSplit = versionName.split("\\.")) == null || strArrSplit.length <= 3) {
            return versionName;
        }
        StringBuilder sb = null;
        for (int i = 0; i < 3; i++) {
            if (sb == null) {
                sb = new StringBuilder();
                sb.append(strArrSplit[i]);
            } else {
                sb.append(".");
                sb.append(strArrSplit[i]);
            }
        }
        return sb != null ? sb.toString() : versionName;
    }

    public static String getVersionName(Context context) {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(mVersion)) {
            return mVersion;
        }
        if (context == null) {
            return mVersion;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) != null) {
                mVersion = packageInfo.versionName;
            }
        } catch (Exception e) {
            e.printStackTrace();
            mVersion = "";
        }
        return mVersion;
    }

    private static String getWifiIp(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        WifiInfo connectionInfo = null;
        try {
            connectionInfo = wifiManager.getConnectionInfo();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return connectionInfo == null ? "" : intToIp(connectionInfo.getIpAddress());
    }

    private static String intToIp(int i) {
        return (i & 255) + "." + ((i >> 8) & 255) + "." + ((i >> 16) & 255) + "." + ((i >> 24) & 255);
    }

    public static <T> boolean isEmptyCollects(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isIP(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 7 || str.length() > 15) {
            return false;
        }
        return Pattern.compile("^((\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5]))$").matcher(str).find();
    }

    public static String AesEcbNopaddingDecrypt(String str) throws Exception {
        return new String(AesEcbNopaddingDecrypt(Base64.decode(str, 0), Base64.decode(key, 0)));
    }
}
