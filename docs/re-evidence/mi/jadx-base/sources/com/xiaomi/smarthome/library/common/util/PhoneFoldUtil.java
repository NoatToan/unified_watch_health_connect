package com.xiaomi.smarthome.library.common.util;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneFoldUtil {
    private static final Set<String> foldDevices;

    static {
        HashSet hashSet = new HashSet();
        foldDevices = hashSet;
        hashSet.add("EVR-L29");
        hashSet.add("TET-AN00");
        hashSet.add("ALT-AL00");
        hashSet.add("TAH-AN00m");
        hashSet.add("PAL-AL00");
        hashSet.add("FRI-AN00");
        hashSet.add("FRI-AN10");
        hashSet.add("zodiaczc");
        hashSet.add("victoryzc");
        hashSet.add("v2qzc");
        hashSet.add("e4qzc");
        hashSet.add("winnerltexx/winnerxks");
        hashSet.add("f2qksx/f2qxeea/f2qxxx/f2qksx/f2qsqw");
        hashSet.add("q2qcsx");
        hashSet.add("q2qksx");
        hashSet.add("q2qsqw");
        hashSet.add("q2quew");
        hashSet.add("q2qxeea");
        hashSet.add("q2qxxx");
        hashSet.add("SCG11_jp_kdi");
        hashSet.add("SC-55B");
        hashSet.add("q4qcsx");
        hashSet.add("q4qksx");
        hashSet.add("q4qsqw");
        hashSet.add("q4quew");
        hashSet.add("q4qxeea");
        hashSet.add("q4qxxx");
        hashSet.add("q4qzhx");
        hashSet.add("SC-55C");
        hashSet.add("SCG16_jp_kdi");
    }

    public static boolean isFoldable() {
        return foldDevices.contains(Build.PRODUCT) || isOPPOFold() || isVivoFoldDevice() || isXiaomiFold();
    }

    public static boolean isOPPOFold() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    private static boolean isVivoFoldDevice() {
        try {
            Class<?> cls = Class.forName("android.util.FtDeviceInfo");
            return "foldable".equals(cls.getMethod("getDeviceType", new Class[0]).invoke(cls, new Object[0]));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isXiaomiFold() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Exception unused) {
            return false;
        }
    }
}
