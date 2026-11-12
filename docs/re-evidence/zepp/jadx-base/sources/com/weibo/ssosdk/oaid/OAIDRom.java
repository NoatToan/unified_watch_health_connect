package com.weibo.ssosdk.oaid;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.c.a;
import com.huami.message.utils.Rom;
import com.xiaomi.hm.health.training.utils.AndroidManufacturerUtils;

/* JADX INFO: loaded from: classes18.dex */
public final class OAIDRom {
    private OAIDRom() {
    }

    public static boolean isASUS() {
        return Build.MANUFACTURER.equalsIgnoreCase("ASUS") || Build.BRAND.equalsIgnoreCase("ASUS");
    }

    public static boolean isBlackShark() {
        return Build.MANUFACTURER.equalsIgnoreCase("BLACKSHARK") || Build.BRAND.equalsIgnoreCase("BLACKSHARK");
    }

    public static boolean isEmui() {
        return !TextUtils.isEmpty(sysProperty(a.a, ""));
    }

    public static boolean isHuawei() {
        if (Build.MANUFACTURER.equalsIgnoreCase(AndroidManufacturerUtils.MANUFACTURE_HUAWEI)) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase(AndroidManufacturerUtils.MANUFACTURE_HUAWEI) || str.equalsIgnoreCase("HONOR");
    }

    public static boolean isLenovo() {
        if (Build.MANUFACTURER.equalsIgnoreCase("LENOVO")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("LENOVO") || str.equalsIgnoreCase("ZUK");
    }

    public static boolean isMeizu() {
        return Build.MANUFACTURER.equalsIgnoreCase("MEIZU") || Build.BRAND.equalsIgnoreCase("MEIZU") || Build.DISPLAY.toUpperCase().contains(Rom.ROM_FLYME);
    }

    public static boolean isMiui() {
        return !TextUtils.isEmpty(sysProperty("ro.miui.ui.version.name", ""));
    }

    public static boolean isMotolora() {
        return Build.MANUFACTURER.equalsIgnoreCase("MOTOLORA") || Build.BRAND.equalsIgnoreCase("MOTOLORA");
    }

    public static boolean isNubia() {
        return Build.MANUFACTURER.equalsIgnoreCase("NUBIA") || Build.BRAND.equalsIgnoreCase("NUBIA");
    }

    public static boolean isOnePlus() {
        return Build.MANUFACTURER.equalsIgnoreCase("ONEPLUS") || Build.BRAND.equalsIgnoreCase("ONEPLUS");
    }

    public static boolean isOppo() {
        if (Build.MANUFACTURER.equalsIgnoreCase("OPPO")) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase("OPPO") || str.equalsIgnoreCase("REALME") || !TextUtils.isEmpty(sysProperty("ro.build.version.opporom", ""));
    }

    public static boolean isSamsung() {
        return Build.MANUFACTURER.equalsIgnoreCase(AndroidManufacturerUtils.MANUFACTURE_SAMSUNG) || Build.BRAND.equalsIgnoreCase(AndroidManufacturerUtils.MANUFACTURE_SAMSUNG);
    }

    public static boolean isVivo() {
        return Build.MANUFACTURER.equalsIgnoreCase("VIVO") || Build.BRAND.equalsIgnoreCase("VIVO") || !TextUtils.isEmpty(sysProperty("ro.vivo.os.version", ""));
    }

    public static boolean isXiaomi() {
        if (Build.MANUFACTURER.equalsIgnoreCase(AndroidManufacturerUtils.MANUFACTURE_XIAOMI)) {
            return true;
        }
        String str = Build.BRAND;
        return str.equalsIgnoreCase(AndroidManufacturerUtils.MANUFACTURE_XIAOMI) || str.equalsIgnoreCase("REDMI");
    }

    public static boolean isZTE() {
        return Build.MANUFACTURER.equalsIgnoreCase("ZTE") || Build.BRAND.equalsIgnoreCase("ZTE");
    }

    public static String sysProperty(String str, String str2) {
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str3 = (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3 == null ? "" : str3;
    }
}
