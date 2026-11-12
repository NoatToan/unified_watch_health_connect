package com.huawei.watchface.utils;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f5;
import com.huawei.watchface.h4;
import com.huawei.watchface.k5;
import com.huawei.watchface.r3;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes20.dex */
public class MobileInfoHelper {
    public static final String CODE_CN = "CN";
    private static final String DEFAULT_DEVICE_ID = "U9200";
    public static final String DEFAULT_VERSION_NAME = "EMUI1.0";
    private static final int MAGIC_6_0 = 33;
    public static final int RANDOM_SIZE = 32;
    private static final String TAG = "MobileInfoHelper";
    private static final String TYPE_IMEI = "type=0";
    public static final String TYPE_SEPARATOR = ":";
    private static final String TYPE_UDID = "type=9";
    private static final String TYPE_UUID = "type=6";
    private static Boolean isHos;
    private static volatile Boolean isUpMagic6;
    private static int magicApiLevel;
    private static String sVersionName;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f30604a = h4.a("ro.build.hw_emui_api_level", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f30605b = h4.a("hw_sc.build.platform.version", "");
    }

    public static String generateDeviceIDWithSeparator() {
        return generateDeviceIDWithSeparator(":");
    }

    public static String generateUUID() {
        return r3.b(32).toUpperCase(Locale.ENGLISH);
    }

    public static int getAppVersionCode(String str) {
        PackageManager packageManager = Environment.getApplicationContext().getPackageManager();
        if (packageManager == null) {
            HwLog.i(TAG, "getAppVersionCode pm is null");
            return 0;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo.applicationInfo != null) {
                return packageInfo.versionCode;
            }
            HwLog.i(TAG, "getAppVersionCode applicationInfo is null");
            return 0;
        } catch (PackageManager.NameNotFoundException e) {
            HwLog.e(TAG, "getAppVersionCode exception " + HwLog.printException((Exception) e));
            return 0;
        } catch (RuntimeException e2) {
            HwLog.e(TAG, "runtimeException " + HwLog.printException((Exception) e2));
            return 0;
        }
    }

    private static String getBuildExValue(String str) {
        try {
            Field declaredField = Class.forName("com.huawei.system.BuildEx").getDeclaredField(str);
            declaredField.setAccessible(true);
            return (String) declaredField.get(null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
            HwLog.e(TAG, "getBuildExValue illegal exception!");
            return "";
        } catch (Exception unused2) {
            HwLog.e(TAG, "getBuildExValue exception!");
            return "";
        }
    }

    public static String getBuildNumber() {
        String buildExValue = getBuildExValue("DISPLAY");
        if (TextUtils.isEmpty(buildExValue) || "unknown".equals(buildExValue)) {
            buildExValue = Build.DISPLAY;
            if (TextUtils.isEmpty(buildExValue)) {
                HwLog.e(TAG, "Get both display failed!");
                return null;
            }
            HwLog.e(TAG, "Get huawei display failed, get original display success!");
        } else {
            HwLog.e(TAG, "Get huawei display success!");
        }
        return buildExValue.trim().replaceAll(" ", "");
    }

    public static String getDeviceName() {
        String str = Build.MODEL;
        try {
            return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            HwLog.e(TAG, HwLog.printException((Exception) e));
            return str;
        }
    }

    public static int getMagicApiLevel() {
        int i = magicApiLevel;
        if (i != 0) {
            return i;
        }
        try {
            Class<?> cls = Class.forName("com.hihonor.android.os.Build$VERSION");
            int i2 = cls.getField("MAGIC_SDK_INT").getInt(cls);
            magicApiLevel = i2;
            return i2;
        } catch (ClassNotFoundException e) {
            HwLog.w(TAG, "getMagicVersion ClassNotFoundException: " + HwLog.printException((Exception) e));
            return 0;
        } catch (IllegalAccessException e2) {
            HwLog.w(TAG, "getMagicVersion IllegalAccessException: " + HwLog.printException((Exception) e2));
            return 0;
        } catch (NoSuchFieldException e3) {
            HwLog.w(TAG, "getMagicVersion NoSuchFieldException: " + HwLog.printException((Exception) e3));
            return 0;
        }
    }

    public static String getUDID() {
        String str = "";
        try {
            String strB = k5.b(f5.b("phone_UDID"), "savePw");
            if (!TextUtils.isEmpty(strB)) {
                HwLog.i(TAG, "get spUDID success");
                return strB;
            }
            String str2 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", null).invoke(null, null);
            try {
                if (!TextUtils.isEmpty(str2)) {
                    f5.b("phone_UDID", k5.c(str2, "savePw"));
                    HwLog.i(TAG, "set UDID sp success");
                }
                HwLog.i(TAG, "getUDID success");
                return str2;
            } catch (AndroidRuntimeException e) {
                e = e;
                str = str2;
                HwLog.e(TAG, "getUDID getudid failed, RuntimeException is AndroidRuntimeException" + HwLog.printException((Exception) e));
                return str;
            } catch (ClassNotFoundException e2) {
                e = e2;
                str = str2;
                HwLog.e(TAG, "getUDID method invoke failed" + HwLog.printException((Exception) e));
                return str;
            } catch (IllegalAccessException e3) {
                e = e3;
                str = str2;
                HwLog.e(TAG, "getUDID method invoke failed : Illegal AccessException" + HwLog.printException((Exception) e));
                return str;
            } catch (IllegalArgumentException e4) {
                e = e4;
                str = str2;
                HwLog.e(TAG, "getUDID method invoke failed : Illegal ArgumentException" + HwLog.printException((Exception) e));
                return str;
            } catch (NoSuchMethodException e5) {
                e = e5;
                str = str2;
                HwLog.e(TAG, "getUDID method invoke failed : NoSuchMethodException" + HwLog.printException((Exception) e));
                return str;
            } catch (InvocationTargetException e6) {
                e = e6;
                str = str2;
                HwLog.e(TAG, "getUDID method invoke failed : InvocationTargetException" + HwLog.printException((Exception) e));
                return str;
            }
        } catch (AndroidRuntimeException e7) {
            e = e7;
        } catch (ClassNotFoundException e8) {
            e = e8;
        } catch (IllegalAccessException e9) {
            e = e9;
        } catch (IllegalArgumentException e10) {
            e = e10;
        } catch (NoSuchMethodException e11) {
            e = e11;
        } catch (InvocationTargetException e12) {
            e = e12;
        }
    }

    public static String getVersion() {
        String str;
        if (TextUtils.isEmpty(sVersionName)) {
            try {
                String str2 = Environment.getApplicationContext().getPackageManager().getPackageInfo(Environment.getApplicationContext().getPackageName(), 16).versionName;
                sVersionName = str2;
                str = str2;
            } catch (PackageManager.NameNotFoundException e) {
                HwLog.e(TAG, HwLog.printException((Exception) e));
                str = DEFAULT_VERSION_NAME;
            } catch (RuntimeException e2) {
                HwLog.e(TAG, "runtimeException " + HwLog.printException((Exception) e2));
                str = DEFAULT_VERSION_NAME;
            }
        } else {
            str = sVersionName;
        }
        if (TextUtils.isEmpty(str) || !str.contains(Constants.LINK)) {
            return str;
        }
        String[] strArrSplit = str.split(Constants.LINK);
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    public static boolean isAccessControlEleven() {
        return !HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea() && isEmui11();
    }

    public static boolean isEmui11() {
        try {
            return a.f30604a >= 25;
        } catch (NoSuchMethodError unused) {
        }
    }

    private static boolean isEmuiStrUp11o1() {
        String strA = h4.a("ro.build.version.emui", "");
        if (TextUtils.isEmpty(strA) || !strA.startsWith("EmotionUI_")) {
            HwLog.w(TAG, "emui is empty or value is error!");
            return false;
        }
        String[] strArrSplit = SafeString.replace(strA, "EmotionUI_", "").split("\\.");
        if (strArrSplit.length >= 2) {
            try {
                int i = Integer.parseInt(strArrSplit[0]);
                return (i >= 12 || (i == 11 && Integer.parseInt(strArrSplit[1]) >= 1)) && !TextUtils.isEmpty(a.f30605b);
            } catch (NumberFormatException unused) {
                HwLog.w(TAG, "NumberFormatException");
            }
        }
        HwLog.w(TAG, "not emuiStrUp11o1");
        return false;
    }

    public static boolean isHarmony4Version() {
        if (isHarmonyOs()) {
            String str = a.f30605b;
            if (!TextUtils.isEmpty(str) && IntegerUtils.a(str.split("\\.")[0]) >= 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHarmonyOs() {
        String str;
        try {
            Boolean bool = isHos;
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                Method method = Class.forName("com.huawei.system.BuildEx").getMethod("getOsBrand", null);
                method.setAccessible(true);
                str = (String) method.invoke(null, null);
            } catch (ClassNotFoundException e) {
                e = e;
                HwLog.e(TAG, "isHarmonyOs illegal exception!" + HwLog.printException(e));
                str = "";
            } catch (IllegalAccessException e2) {
                e = e2;
                HwLog.e(TAG, "isHarmonyOs illegal exception!" + HwLog.printException(e));
                str = "";
            } catch (IllegalArgumentException e3) {
                e = e3;
                HwLog.e(TAG, "isHarmonyOs illegal exception!" + HwLog.printException(e));
                str = "";
            } catch (Exception e4) {
                HwLog.e(TAG, "isHarmonyOs exception!" + HwLog.printException(e4));
                str = "";
            }
            if (TextUtils.equals(str, "harmony")) {
                HwLog.i(TAG, "is HarmonyOs");
                Boolean bool2 = Boolean.TRUE;
                isHos = bool2;
                return bool2.booleanValue();
            }
            boolean zIsEmuiStrUp11o1 = isEmuiStrUp11o1();
            Boolean boolValueOf = Boolean.valueOf(zIsEmuiStrUp11o1);
            isHos = boolValueOf;
            boolValueOf.getClass();
            return zIsEmuiStrUp11o1;
        } catch (Throwable unused) {
            HwLog.i(TAG, "not HarmonyOs");
            Boolean bool3 = Boolean.FALSE;
            isHos = bool3;
            return bool3.booleanValue();
        }
    }

    public static boolean isHonorDevice() {
        return TextUtils.equals(Build.MANUFACTURER, "HONOR");
    }

    public static boolean isHuaweiDevice() {
        return TextUtils.equals(Build.MANUFACTURER, "HUAWEI");
    }

    public static boolean isUpMagicUI6() {
        if (isUpMagic6 == null) {
            isUpMagic6 = Boolean.valueOf(isHonorDevice() && getMagicApiLevel() >= 33);
            HwLog.i(TAG, "isUpMagic6: " + isUpMagic6);
        }
        return isUpMagic6.booleanValue();
    }

    public static String generateDeviceIDWithSeparator(String str) {
        String udid = getUDID();
        return !TextUtils.isEmpty(udid) ? udid.concat(str).concat(TYPE_UDID) : generateUUID().concat(str).concat(TYPE_UUID);
    }
}
