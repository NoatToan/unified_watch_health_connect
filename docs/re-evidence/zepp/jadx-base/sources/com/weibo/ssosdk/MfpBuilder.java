package com.weibo.ssosdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.m.n.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.moving.ui.animator.AnimatorViewWrapper;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.sensetime.senseid.sdk.liveness.silent.common.util.NetworkUtil;
import com.weibo.ssosdk.oaid.DeviceOAID;
import com.weibo.ssosdk.oaid.IGetter;
import com.weibo.ssosdk.oaid.helpers.DevicesIDsHelper;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;
import com.xiaomi.market.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.NetworkInterface;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Collections;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class MfpBuilder {
    public static final String AID_TAG = "weibo_aid_value";
    private static final String a = "MfpBuilder";
    private static final String b = "";

    public static class a implements IGetter {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.weibo.ssosdk.oaid.IGetter
        public final void onOAIDGetComplete(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            MfpBuilder.F(this.a, str);
        }

        @Override // com.weibo.ssosdk.oaid.IGetter
        public final void onOAIDGetError(Exception exc) {
        }
    }

    public static final class b {
        private Intent a;

        public /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        private int e() {
            return this.a.getIntExtra("health", 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int f() {
            return this.a.getIntExtra(FirebaseAnalytics.Param.LEVEL, 0);
        }

        private int g() {
            return this.a.getIntExtra("plugged", 0);
        }

        private boolean h() {
            return this.a.getBooleanExtra("present", false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int i() {
            return this.a.getIntExtra(AnimatorViewWrapper.SCALE, 0);
        }

        private int j() {
            return this.a.getIntExtra("status", 0);
        }

        private String k() {
            return this.a.getStringExtra("technology");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int l() {
            return this.a.getIntExtra("temperature", 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int m() {
            return this.a.getIntExtra("voltage", 0);
        }

        private b(Context context) {
            this.a = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        }
    }

    @TargetApi(26)
    private static String A() {
        try {
            return Build.getSerial();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String B(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getSSID() : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean C() {
        try {
            String manufacturer = AppUtils.getManufacturer();
            if (!Arrays.asList(AndroidManufacturerUtils.MANUFACTURE_HUAWEI, "OPPO", "VIVO", AndroidManufacturerUtils.MANUFACTURE_XIAOMI).contains(manufacturer)) {
                return false;
            }
            if (AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(manufacturer)) {
                return isHuawei23();
            }
            if ("OPPO".equals(manufacturer)) {
                return isOppoFuntouch9();
            }
            if ("VIVO".equals(manufacturer)) {
                return isVivoColor7();
            }
            if (AndroidManufacturerUtils.MANUFACTURE_XIAOMI.equals(manufacturer)) {
                return isXiaomiMiui102();
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private static boolean D(int i) {
        return i > 0;
    }

    private static boolean E(int i) {
        return i > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Context context, String str) {
        AppUtils.saveOadi(context, "ext_sso", "oaid", str);
    }

    private static int G(byte[] bArr, int i, int i2) {
        if (i >= bArr.length) {
            return -1;
        }
        return Math.min(bArr.length - i, i2);
    }

    private static void a(String str) {
    }

    private static void b(String str) {
    }

    public static int compareVersion(String str, String str2) {
        if (str.equals(str2)) {
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int i = 0;
        int i2 = 0;
        while (i < iMin) {
            i2 = Integer.parseInt(strArrSplit[i]) - Integer.parseInt(strArrSplit2[i]);
            if (i2 != 0) {
                break;
            }
            i++;
        }
        if (i2 != 0) {
            return i2 > 0 ? 1 : -1;
        }
        for (int i3 = i; i3 < strArrSplit.length; i3++) {
            if (Integer.parseInt(strArrSplit[i3]) > 0) {
                return 1;
            }
        }
        while (i < strArrSplit2.length) {
            if (Integer.parseInt(strArrSplit2[i]) > 0) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    private static String d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02X:", Byte.valueOf(b2)));
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private static String e(String str, String str2) throws Throwable {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(1, w(str2));
        byte[] bytes = str.getBytes("UTF-8");
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i = 0;
            while (true) {
                try {
                    int iG = G(bytes, i, 117);
                    if (iG == -1) {
                        break;
                    }
                    byteArrayOutputStream2.write(cipher.doFinal(bytes, i, iG));
                    i += iG;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            }
            byteArrayOutputStream2.flush();
            String strConcat = "01".concat(new String(Base64.encode(byteArrayOutputStream2.toByteArray(), 2), "UTF-8"));
            try {
                byteArrayOutputStream2.close();
            } catch (IOException unused2) {
            }
            return strConcat;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String f(Context context, int i, int i2) {
        String strV;
        String strG;
        JSONObject jSONObject = new JSONObject();
        try {
            if (C()) {
                strV = v(context);
                try {
                    if (TextUtils.isEmpty(strV)) {
                        new DevicesIDsHelper().getOAID(context);
                    }
                } catch (Exception unused) {
                }
            } else {
                strV = "";
            }
        } catch (Exception unused2) {
        }
        try {
            DeviceOAID.getOAID(context, new a(context));
        } catch (Exception unused3) {
        }
        try {
            String strU = u();
            if (!TextUtils.isEmpty(strU)) {
                jSONObject.put(Constants.JSON_VERSION, strU);
            }
            String strO = D(i) ? o(context) : "";
            if (!TextUtils.isEmpty(strO)) {
                jSONObject.put("imei", strO);
            }
            String strS = D(i) ? s(context) : "";
            if (!TextUtils.isEmpty(strS)) {
                jSONObject.put("meid", strS);
            }
            String strP = p(context);
            if (!TextUtils.isEmpty(strP)) {
                jSONObject.put("imsi", strP);
            }
            if (D(i)) {
                String strQ = q(context);
                if (!TextUtils.isEmpty(strQ)) {
                    jSONObject.put("mac", strQ);
                }
                String strZ = z();
                if (!TextUtils.isEmpty(strZ)) {
                    jSONObject.put("serial", strZ);
                }
            }
            String strN = n(context);
            if (!TextUtils.isEmpty(strN)) {
                jSONObject.put(AbsEsimOperation.KEY_ICCID, strN);
            }
            String strH = h(context);
            if (!TextUtils.isEmpty(strH)) {
                jSONObject.put("androidid", strH);
            }
            String strK = k();
            if (!TextUtils.isEmpty(strK)) {
                jSONObject.put("cpu", strK);
            }
            String strT = t();
            if (!TextUtils.isEmpty(strT)) {
                jSONObject.put("model", strT);
            }
            String strY = y();
            if (!TextUtils.isEmpty(strY)) {
                jSONObject.put("sdcard", strY);
            }
            String strX = x(context);
            if (!TextUtils.isEmpty(strX)) {
                jSONObject.put("resolution", strX);
            }
            if (E(i2)) {
                String strB = B(context);
                if (!TextUtils.isEmpty(strB)) {
                    jSONObject.put("ssid", strB);
                }
                String wifiBssid = getWifiBssid(context);
                if (!TextUtils.isEmpty(wifiBssid)) {
                    jSONObject.put("bssid", wifiBssid);
                }
            }
            String strL = l();
            if (!TextUtils.isEmpty(strL)) {
                jSONObject.put("deviceName", strL);
            }
            String strJ = j(context);
            if (!TextUtils.isEmpty(strJ)) {
                jSONObject.put("connecttype", strJ);
            }
            try {
                strG = g(context);
            } catch (Exception e) {
                e.printStackTrace();
                strG = "";
            }
            if (!TextUtils.isEmpty(strG)) {
                jSONObject.put("ua", strG);
            }
            double dI = i(context);
            jSONObject.put("batterymaxcapacity", String.valueOf(dI));
            jSONObject.put("batterycurrentcapacity", String.valueOf(dI));
            b bVar = new b(context, null);
            jSONObject.put("batterycurrentvoltage", bVar.m());
            jSONObject.put("batterycurrenttemperature", bVar.l());
            jSONObject.put("batterycurrentcapacity", (dI * ((double) bVar.f())) / ((double) bVar.i()));
            boolean z = false;
            try {
                if (C()) {
                    if (TextUtils.isEmpty(strV)) {
                        Thread.sleep(50L);
                        z = true;
                        jSONObject.put("sso_oaid", v(context));
                    } else {
                        jSONObject.put("sso_oaid", strV);
                    }
                }
            } catch (Exception unused4) {
            }
            if (DeviceOAID.IsSupportedOAID()) {
                if (!z) {
                    try {
                        Thread.sleep(50L);
                    } catch (Exception unused5) {
                    }
                }
                String strM = m(context);
                if (TextUtils.isEmpty(strM)) {
                    jSONObject.put("ext_oaid", "");
                } else {
                    jSONObject.put("ext_oaid", strM);
                }
            }
            return jSONObject.toString();
        } catch (JSONException unused6) {
            return "";
        }
    }

    private static String g(Context context) {
        StringBuilder sb = new StringBuilder();
        String packageName = context.getPackageName();
        String str = (TextUtils.isEmpty(packageName) || !packageName.contains("com.sina.weibo")) ? "ssosdk" : "weibo";
        sb.append(Build.MANUFACTURER);
        sb.append(com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(Build.MODEL);
        sb.append("__");
        sb.append(str);
        sb.append("__");
        try {
            sb.append("2.0".replaceAll("\\s+", "_"));
        } catch (Exception unused) {
            sb.append("unknown");
        }
        sb.append("__android__android");
        sb.append(Build.VERSION.RELEASE);
        return sb.toString();
    }

    public static String getMfp(Context context, int i, int i2) {
        try {
            return new String(f(context, i, i2).getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String getOsString(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getWifiBssid(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getBSSID() : "";
        } catch (SecurityException unused) {
            return "";
        }
    }

    private static String h(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "";
        }
    }

    private static double i(Context context) {
        Object objNewInstance;
        try {
            objNewInstance = Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
            objNewInstance = null;
        }
        try {
            return ((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getAveragePower", String.class).invoke(objNewInstance, "battery.capacity")).doubleValue();
        } catch (Exception unused2) {
            return 0.0d;
        }
    }

    public static void init(Context context) {
    }

    public static boolean isHuawei23() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isOppoFuntouch9() {
        try {
            String osString = getOsString("ro.build.version.opporom");
            if (TextUtils.isEmpty(osString)) {
                return false;
            }
            String strReplaceAll = osString.replaceAll("[^\\d.]", "");
            return !TextUtils.isEmpty(strReplaceAll) && compareVersion(strReplaceAll, "9.0.0") >= 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isVivoColor7() {
        String osString = getOsString("ro.vivo.os.version");
        return !TextUtils.isEmpty(osString) && compareVersion(osString, "7.0") >= 0;
    }

    public static boolean isXiaomiMiui102() {
        try {
            String osString = getOsString("ro.miui.ui.version.name");
            if (TextUtils.isEmpty(osString)) {
                return false;
            }
            String strReplaceAll = osString.replaceAll("[^\\d.]", "");
            return !TextUtils.isEmpty(strReplaceAll) && compareVersion(strReplaceAll, "10") >= 0;
        } catch (Exception unused) {
            return false;
        }
    }

    private static String j(Context context) {
        String str = "none";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            str = NetworkUtil.NETWORK_CLASS_2_G;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            str = NetworkUtil.NETWORK_CLASS_3_G;
                            break;
                        case 13:
                            str = NetworkUtil.NETWORK_CLASS_4_G;
                            break;
                    }
                } else if (activeNetworkInfo.getType() == 1) {
                    str = "wifi";
                }
            }
        } catch (Exception unused) {
        }
        return str;
    }

    private static String k() {
        try {
            return Build.CPU_ABI;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String l() {
        try {
            return Build.BRAND;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String m(Context context) {
        try {
            PreferenceManagerUtil.init(context);
            return PreferenceManagerUtil.getInstance().getSaveStringData("ext_sso-oaid", "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String n(Context context) {
        return "";
    }

    private static String o(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String p(Context context) {
        return "";
    }

    private static String q(Context context) {
        WifiInfo connectionInfo;
        if (Build.VERSION.SDK_INT >= 23) {
            return r();
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                return connectionInfo.getMacAddress();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private static String r() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String s(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String t() {
        try {
            return Build.MODEL;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String u() {
        try {
            return "Android " + Build.VERSION.RELEASE;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String v(Context context) {
        try {
            PreferenceManagerUtil.init(context);
            PreferenceManagerUtil preferenceManagerUtil = PreferenceManagerUtil.getInstance();
            if (AndroidManufacturerUtils.MANUFACTURE_HUAWEI.equals(AppUtils.getManufacturer())) {
                return preferenceManagerUtil.getSaveStringData("HUAWEI-oaid", "");
            }
            if ("OPPO".equals(AppUtils.getManufacturer())) {
                return preferenceManagerUtil.getSaveStringData("OPPO-oaid", "");
            }
            if ("VIVO".equals(AppUtils.getManufacturer())) {
                return preferenceManagerUtil.getSaveStringData("VIVO-oaid", "");
            }
            if (AndroidManufacturerUtils.MANUFACTURE_XIAOMI.equals(AppUtils.getManufacturer())) {
                return preferenceManagerUtil.getSaveStringData("XIAOMI-oaid", "");
            }
            return "";
        } catch (Exception unused) {
        }
    }

    private static PublicKey w(String str) {
        return KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
    }

    private static String x(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return String.valueOf(displayMetrics.widthPixels) + "*" + String.valueOf(displayMetrics.heightPixels);
        } catch (Exception unused) {
            return "";
        }
    }

    private static String y() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String z() {
        if (Build.VERSION.SDK_INT >= 26) {
            return A();
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.serialno", "unknown");
        } catch (Exception unused) {
            return "";
        }
    }
}
