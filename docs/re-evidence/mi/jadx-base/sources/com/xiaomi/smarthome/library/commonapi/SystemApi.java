package com.xiaomi.smarthome.library.commonapi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import com.example.statistics.export.OneTrackConstant;
import com.mipay.sdk.account.BuildConfig;
import com.smarthome.connect.utils.WifiUtils;
import com.xiaomi.accountsdk.hasheddeviceidlib.HardwareInfo;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.smarthome.library.crypto.SHA1Util;
import com.xiaomi.smarthome.library.deviceId.DeviceIdCompat;
import com.xiaomi.smarthome.library.http.util.HeaderUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Stack;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SystemApi {
    private static final String APP_MANUFACTURE = "com.xiaomi.mihome";
    private static final String HARMONY_OS = "harmony";
    public static final int NETWORK_2G = 10;
    public static final int NETWORK_3G = 20;
    public static final int NETWORK_4G = 30;
    public static final int NETWORK_MOBILE_3G = 22;
    public static final int NETWORK_MOBILE_UNICOM_2G = 12;
    public static final int NETWORK_NOT_CONNECTED = -1;
    public static final int NETWORK_TELECOM_2G = 11;
    public static final int NETWORK_TELECOM_3G = 21;
    public static final int NETWORK_UNICOM_3G = 23;
    public static final int NETWORK_UNKNOWN = 0;
    public static final int NETWORK_WIFI = 1;
    private static String mDeviceId;
    private static String mDeviceIdSHA2;
    private static int mVersionCode;
    private static String mVersionName;
    private static volatile SystemApi sInstance;
    public static final String BUILD_MANUFACTURER = Build.MANUFACTURER;
    public static final String BUILD_BRAND = Build.BRAND;
    private static Object sLock = new Object();
    private static Boolean sIsMiui = null;
    private static String deviceInfo = null;

    private SystemApi() {
    }

    private void appendNumber(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i2);
        for (int i3 = 0; i3 < i - string.length(); i3++) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static SystemApi getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new SystemApi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public static String getMiuiProperty(String str) {
        Class<?> clsGuessClass;
        try {
            clsGuessClass = guessClass("android.os.SystemProperties");
        } catch (ClassNotFoundException unused) {
            clsGuessClass = null;
        }
        if (clsGuessClass == null) {
            return "";
        }
        try {
            Method declaredMethod = clsGuessClass.getDeclaredMethod("get", String.class, String.class);
            if (declaredMethod != null) {
                return (String) declaredMethod.invoke(null, str, "");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
        return "";
    }

    public static String getMiuiVersion() {
        return getMiuiProperty("ro.miui.ui.version.code");
    }

    public static String getMiuiVersionName() {
        return getMiuiProperty("ro.miui.ui.version.name");
    }

    private static Class<?> guessClass(String str) throws ClassNotFoundException {
        Stack stack = new Stack();
        Class<?> cls = null;
        while (str != null) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException unused) {
            }
            if (cls != null) {
                while (!stack.isEmpty() && cls != null) {
                    Class<?>[] classes = cls.getClasses();
                    String str2 = (String) stack.pop();
                    Class<?> cls2 = null;
                    for (Class<?> cls3 : classes) {
                        if (cls3.getSimpleName().equals(str2)) {
                            cls2 = cls3;
                        }
                    }
                    cls = cls2;
                }
                break;
            }
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf <= 0 || iLastIndexOf >= str.length() - 1) {
                str = null;
            } else {
                stack.add(str.substring(iLastIndexOf + 1));
                str = str.substring(0, iLastIndexOf);
            }
        }
        if (cls != null) {
            return cls;
        }
        throw new ClassNotFoundException("failed to guess class: " + str);
    }

    public static boolean isHarmonyOS() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            String str = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (str == null) {
                return false;
            }
            return HARMONY_OS.equalsIgnoreCase(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isHuaWeiPhone() {
        String lowerCase = BUILD_MANUFACTURER.trim().toLowerCase();
        return lowerCase.contains(RomUtils.HUAWEI) || lowerCase.contains(RomUtils.HONOR);
    }

    public static boolean isMiUIV12() {
        Method declaredMethod;
        try {
            Class<?> clsGuessClass = guessClass("android.os.SystemProperties");
            if (clsGuessClass == null || (declaredMethod = clsGuessClass.getDeclaredMethod("get", String.class, String.class)) == null) {
                return false;
            }
            String str = (String) declaredMethod.invoke(null, "ro.miui.ui.version.name", "");
            return !TextUtils.isEmpty(str) && str.length() >= 2 && Integer.valueOf(str.substring(1)).intValue() >= 12;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isMiUIV14() {
        Method declaredMethod;
        try {
            Class<?> clsGuessClass = guessClass("android.os.SystemProperties");
            if (clsGuessClass == null || (declaredMethod = clsGuessClass.getDeclaredMethod("get", String.class, String.class)) == null) {
                return false;
            }
            String str = (String) declaredMethod.invoke(null, "ro.miui.ui.version.code", "");
            return !TextUtils.isEmpty(str) && Integer.valueOf(str).intValue() >= 14;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isMiui() {
        Class<?> clsGuessClass;
        if (sIsMiui == null) {
            try {
                clsGuessClass = guessClass("miui.os.Build");
            } catch (ClassNotFoundException unused) {
                clsGuessClass = null;
            }
            if (clsGuessClass != null) {
                sIsMiui = Boolean.TRUE;
            } else {
                sIsMiui = Boolean.FALSE;
            }
        }
        return sIsMiui.booleanValue();
    }

    public static boolean isMiuiPad() {
        try {
            return guessClass("miui.os.Build").getDeclaredField("IS_TABLET").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isOnePlusPhone() {
        return BUILD_MANUFACTURER.trim().toLowerCase().contains("oneplus");
    }

    public static boolean isOppoPhone() {
        return BUILD_MANUFACTURER.trim().toLowerCase().contains(RomUtils.OPPO);
    }

    public static boolean isSamsungPhone() {
        return BUILD_MANUFACTURER.trim().toLowerCase().contains(RomUtils.SAMSUNG);
    }

    public static boolean isVivoPhone() {
        return BUILD_MANUFACTURER.trim().toLowerCase().contains(RomUtils.VIVO);
    }

    public static boolean isXiaomiPhone() {
        String lowerCase = BUILD_BRAND.toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        return lowerCase.contains("xiaomi");
    }

    public String getAppManufacture() {
        return APP_MANUFACTURE;
    }

    public String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return BuildConfig.VERSION_NAME;
        }
    }

    public int getAppVersionCode(Context context) {
        if (mVersionCode <= 0) {
            try {
                mVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                mVersionCode = 0;
            }
        }
        return mVersionCode;
    }

    public String getAppVersionName(Context context) {
        if (TextUtils.isEmpty(mVersionName)) {
            try {
                mVersionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                mVersionName = "";
            }
        }
        return mVersionName;
    }

    public String getDeviceBrand() {
        try {
            String str = Build.BRAND;
            HeaderUtil.checkName(str);
            return str;
        } catch (Exception unused) {
            return "UnknownBrand";
        }
    }

    public String getDeviceId(Context context) {
        return getDeviceId(context, false);
    }

    public String getDeviceIdSHA2(Context context) {
        return getDeviceId(context, true);
    }

    public String getDeviceInfo() {
        if (deviceInfo == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("manu", Build.MANUFACTURER);
                jSONObject.put("hard", Build.HARDWARE);
            } catch (Exception unused) {
            }
            deviceInfo = getDeviceModel() + "|" + jSONObject.toString();
        }
        return deviceInfo;
    }

    public String getDeviceModel() {
        try {
            String str = Build.MODEL;
            HeaderUtil.checkName(str);
            return str;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public String getImei(Context context) {
        return DeviceIdCompat.getDeviceId(context);
    }

    public PackageInfo getInstalledByPackageName(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(str, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String getMac(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return HardwareInfo.FAKE_MAC_ADDRESS;
        }
        try {
            WifiInfo connectionInfo = WifiUtils.getConnectionInfo((WifiManager) context.getSystemService("wifi"));
            return connectionInfo != null ? connectionInfo.getBSSID() : "";
        } catch (Exception unused) {
            return null;
        }
    }

    public int getNetworkType(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype != 8) {
            if (subtype != 12) {
                if (subtype != 15) {
                    switch (subtype) {
                        case 1:
                        case 2:
                            return 12;
                        case 3:
                            break;
                        case 4:
                            return 11;
                        case 5:
                        case 6:
                            break;
                        default:
                            return 0;
                    }
                }
            }
            return 21;
        }
        return 23;
    }

    public String getOsIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public String getOsName() {
        return YRNConstants.PLATFORM;
    }

    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return !TextUtils.isEmpty(str) ? str : "unknown";
    }

    public String getPlatform() {
        return "phone";
    }

    public String getSDKVersion() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public float getScreenDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public String getTimeZone() {
        char c;
        try {
            int rawOffset = TimeZone.getDefault().getRawOffset() / 60000;
            if (rawOffset < 0) {
                rawOffset = -rawOffset;
                c = '-';
            } else {
                c = '+';
            }
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(c);
            appendNumber(sb, 2, rawOffset / 60);
            sb.append(AbstractJsonLexerKt.COLON);
            appendNumber(sb, 2, rawOffset % 60);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String getTimeZoneId() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception unused) {
            return "";
        }
    }

    public String getDeviceId(Context context, boolean z) {
        String deviceId = DeviceIdCompat.getDeviceId(context);
        return z ? SHA1Util.getSHA2Digest(deviceId) : SHA1Util.getSHA1Digest(deviceId);
    }
}
