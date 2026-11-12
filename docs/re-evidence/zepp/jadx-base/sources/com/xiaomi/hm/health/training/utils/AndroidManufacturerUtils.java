package com.xiaomi.hm.health.training.utils;

import android.os.Build;

/* JADX INFO: loaded from: classes22.dex */
public class AndroidManufacturerUtils {
    public static final String ALARM_ALERT_DEFAUTL = "com.android.deskclock.ALARM_ALERT";
    public static final String ALARM_ALERT_OPPO = "com.oppo.alarmclock.alarmclock.ALARM_ALERT";
    public static final String ALARM_ALERT_SAMSUNG = "com.samsung.sec.android.clockpackage.alarm.ALARM_ALERT";
    public static final String ALARM_ALERT_VIVO = "com.cn.google.AlertClock.ALARM_ALERT";
    public static final String ALARM_DONE_DEFAUTL = "com.Android.deskclock.ALARM_DONE";
    public static final String ALARM_DONE_OPPO = "com.oppo.alarmclock.alarmclock.ALARM_DONE";
    public static final String ALARM_DONE_SAMSUNG = "com.samsung.sec.android.clockpackage.alarm.ALARM_DONE";
    public static final String ALARM_DONE_VIVO = "com.cn.google.AlertClock.ALARM_DONE";
    public static final String MANUFACTURE_GOOGLE = "GOOGLE";
    public static final String MANUFACTURE_HUAWEI = "HUAWEI";
    public static final String MANUFACTURE_OPPO = "OPPO";
    public static final String MANUFACTURE_SAMSUNG = "SAMSUNG";
    public static final String MANUFACTURE_UNK = "UNKNOWN";
    public static final String MANUFACTURE_VIVO = "VIVO";
    public static final String MANUFACTURE_XIAOMI = "XIAOMI";
    public static final String MOBILE_PHONE_BRAND;
    public static AndroidManufacture currentManufacture;

    public enum AndroidManufacture {
        Xiaomi(AndroidManufacturerUtils.MANUFACTURE_XIAOMI),
        HuaWei(AndroidManufacturerUtils.MANUFACTURE_HUAWEI),
        OPPO("OPPO"),
        Vivo("VIVO"),
        Google(AndroidManufacturerUtils.MANUFACTURE_GOOGLE),
        Samsung(AndroidManufacturerUtils.MANUFACTURE_SAMSUNG),
        Unknown(AndroidManufacturerUtils.MANUFACTURE_SAMSUNG);

        private String upperManufacture;

        AndroidManufacture(String str) {
            this.upperManufacture = str;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AndroidManufacture.values().length];
            a = iArr;
            try {
                iArr[AndroidManufacture.OPPO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AndroidManufacture.Vivo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AndroidManufacture.Samsung.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AndroidManufacture.Xiaomi.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AndroidManufacture.HuaWei.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AndroidManufacture.Google.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        String upperCase = Build.BRAND.toUpperCase();
        MOBILE_PHONE_BRAND = upperCase;
        AndroidManufacture androidManufacture = AndroidManufacture.Unknown;
        currentManufacture = androidManufacture;
        upperCase.hashCode();
        switch (upperCase) {
            case "SAMSUNG":
                currentManufacture = AndroidManufacture.Samsung;
                break;
            case "XIAOMI":
                currentManufacture = AndroidManufacture.Xiaomi;
                break;
            case "OPPO":
                currentManufacture = AndroidManufacture.OPPO;
                break;
            case "VIVO":
                currentManufacture = AndroidManufacture.Vivo;
                break;
            case "GOOGLE":
                currentManufacture = AndroidManufacture.Google;
                break;
            case "HUAWEI":
                currentManufacture = AndroidManufacture.HuaWei;
                break;
            default:
                currentManufacture = androidManufacture;
                break;
        }
    }

    public static String getAlarmAlertBroadcast() {
        int i = a.a[currentManufacture.ordinal()];
        if (i == 1) {
            return ALARM_ALERT_OPPO;
        }
        if (i != 2) {
            return i != 3 ? ALARM_ALERT_DEFAUTL : ALARM_ALERT_SAMSUNG;
        }
        return ALARM_ALERT_VIVO;
    }

    public static String getAlarmDoneBroadcast() {
        int i = a.a[currentManufacture.ordinal()];
        if (i == 1) {
            return ALARM_DONE_OPPO;
        }
        if (i != 2) {
            return i != 3 ? ALARM_DONE_DEFAUTL : ALARM_DONE_SAMSUNG;
        }
        return ALARM_DONE_VIVO;
    }
}
