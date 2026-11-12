package com.huawei.hms.health;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.utils.Util;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes10.dex */
public class aacb {
    private static final boolean aab;
    private static final String aaba;
    private static final String aabb;
    private static final String aabc;

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    static {
        int i;
        boolean zAaba = aaba("com.huawei.android.os.BuildEx");
        aab = zAaba;
        String strAab = !zAaba ? "" : aab("ro.build.version.emui", "");
        aaba = strAab;
        aab(strAab);
        if (zAaba) {
            String strAab2 = aab("ro.build.hw_emui_api_level", "");
            if (TextUtils.isEmpty(strAab2)) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(strAab2);
                } catch (NumberFormatException unused) {
                    aabz.aab("EnvironmentInfo", "getEmuiVersionCodeExImpl: catch a NumberFormatException");
                    i = 0;
                }
            }
        } else {
            i = 0;
        }
        StringBuilder sbAab = aab.aab("initEmuiVersionCodeEx, isEmuiBuildEx=");
        boolean z = aab;
        sbAab.append(z);
        sbAab.append(", emuiVersionCode=");
        sbAab.append(i);
        aabz.aabb("EnvironmentInfo", sbAab.toString());
        aabb = aab("hw_sc.build.platform.version", "");
        aabc = z ? aab("ro.build.version.magic", "") : "";
    }

    private static boolean aab(String str) {
        boolean z = !TextUtils.isEmpty(str) && str.contains("EmotionUI");
        StringBuilder sbAab = aab.aab("checkEmuiSystem, isEmuiBuildEx=");
        sbAab.append(aab);
        sbAab.append(", isEmui=");
        sbAab.append(z);
        sbAab.toString();
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    public static void aab() throws SecurityException {
        String str;
        String string;
        String[] strArrSplit;
        Context context = HiHealthKitClient.getInstance().getContext();
        if (context == null) {
            return;
        }
        String appId = Util.getAppId(context);
        if ("10414141".equals(appId) || "102162151".equals(appId)) {
            aabz.aabb("EnvironmentInfo", "skip checkSystemVersion");
            return;
        }
        String str2 = aabb;
        if (TextUtils.isEmpty(str2)) {
            str = aabc;
            if (TextUtils.isEmpty(str)) {
                StringBuilder sbAab = aab.aab("Android SDK Version is ");
                sbAab.append(Build.VERSION.SDK_INT);
                string = sbAab.toString();
            } else {
                strArrSplit = str.split("\\.");
                if (strArrSplit.length > 0 || !TextUtils.isDigitsOnly(strArrSplit[0]) || Integer.parseInt(strArrSplit[0]) < 2) {
                    StringBuilder sbAab2 = aab.aab("Android SDK Version is ");
                    sbAab2.append(Build.VERSION.SDK_INT);
                    string = sbAab2.toString();
                } else {
                    string = "System OS is Magic New Ui.";
                }
            }
            aabz.aabb("EnvironmentInfo", string);
        } else {
            String[] strArrSplit2 = str2.split("\\.");
            if (strArrSplit2.length > 0 && TextUtils.isDigitsOnly(strArrSplit2[0]) && Integer.parseInt(strArrSplit2[0]) >= 2) {
                aabz.aabb("EnvironmentInfo", "System OS is Harmony.");
            } else {
                str = aabc;
                if (TextUtils.isEmpty(str)) {
                    StringBuilder sbAab3 = aab.aab("Android SDK Version is ");
                    sbAab3.append(Build.VERSION.SDK_INT);
                    string = sbAab3.toString();
                } else {
                    strArrSplit = str.split("\\.");
                    if (strArrSplit.length > 0) {
                        StringBuilder sbAab4 = aab.aab("Android SDK Version is ");
                        sbAab4.append(Build.VERSION.SDK_INT);
                        string = sbAab4.toString();
                    } else {
                        StringBuilder sbAab5 = aab.aab("Android SDK Version is ");
                        sbAab5.append(Build.VERSION.SDK_INT);
                        string = sbAab5.toString();
                    }
                }
                aabz.aabb("EnvironmentInfo", string);
            }
        }
        if (!aaca.aaba(context)) {
            throw new SecurityException(String.valueOf(HiHealthStatusCodes.DEVICE_NOT_SUPPORT));
        }
    }

    private static boolean aaba(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            aabz.aab("EnvironmentInfo", "isSupportEmuiBuildEx ClassNotFoundException");
            return false;
        }
    }

    static String aab(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, str2);
            return objInvoke instanceof String ? (String) objInvoke : str2;
        } catch (ClassNotFoundException unused) {
            str3 = "getSystemProperties ClassNotFoundException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        } catch (IllegalAccessException unused2) {
            str3 = "getSystemProperties IllegalAccessException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        } catch (NoSuchMethodException unused3) {
            str3 = "getSystemProperties NoSuchMethodException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        } catch (InvocationTargetException unused4) {
            str3 = "getSystemProperties InvocationTargetException";
            aabz.aab("EnvironmentInfo", str3);
            return str2;
        }
    }
}
