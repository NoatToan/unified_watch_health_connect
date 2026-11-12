package com.xiaomi.smarthome.library.common.util;

import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class MMKVManager {
    private static ConcurrentHashMap<String, MMKV> MMKVMap;

    public static MMKV getMMKV(String str) {
        if (MMKVMap == null) {
            synchronized (MMKVManager.class) {
                try {
                    if (MMKVMap == null) {
                        MMKVMap = new ConcurrentHashMap<>();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (MMKVMap.containsKey(str)) {
            return MMKVMap.get(str);
        }
        MMKV mmkvG = MMKV.G(str, 2);
        MMKVMap.put(str, mmkvG);
        return mmkvG;
    }

    public static boolean getSettingBoolean(MMKV mmkv, String str, boolean z) {
        return mmkv != null ? mmkv.d(str, z) : z;
    }

    public static float getSettingFloat(MMKV mmkv, String str, float f) {
        return mmkv != null ? mmkv.e(str, f) : f;
    }

    public static int getSettingInt(MMKV mmkv, String str, int i) {
        return mmkv != null ? mmkv.f(str, i) : i;
    }

    public static long getSettingLong(MMKV mmkv, String str, long j) {
        return mmkv != null ? mmkv.g(str, j) : j;
    }

    public static String getSettingString(MMKV mmkv, String str, String str2) {
        return mmkv != null ? mmkv.k(str, str2) : str2;
    }

    public static void setSettingBoolean(MMKV mmkv, String str, boolean z) {
        if (mmkv != null) {
            mmkv.w(str, z);
        }
    }

    public static void setSettingFloat(MMKV mmkv, String str, float f) {
        if (mmkv != null) {
            mmkv.q(str, f);
        }
    }

    public static void setSettingInt(MMKV mmkv, String str, int i) {
        if (mmkv != null) {
            mmkv.r(str, i);
        }
    }

    public static void setSettingLong(MMKV mmkv, String str, long j) {
        if (mmkv != null) {
            mmkv.s(str, j);
        }
    }

    public static void setSettingString(MMKV mmkv, String str, String str2) {
        if (mmkv != null) {
            mmkv.u(str, str2);
        }
    }

    public static boolean getSettingBoolean(String str, String str2, boolean z) {
        MMKV mmkv = getMMKV(str);
        return mmkv != null ? mmkv.d(str2, z) : z;
    }

    public static float getSettingFloat(String str, String str2, float f) {
        MMKV mmkv = getMMKV(str);
        return mmkv != null ? mmkv.e(str2, f) : f;
    }

    public static int getSettingInt(String str, String str2, int i) {
        MMKV mmkv = getMMKV(str);
        return mmkv != null ? mmkv.f(str2, i) : i;
    }

    public static long getSettingLong(String str, String str2, long j) {
        MMKV mmkv = getMMKV(str);
        return mmkv != null ? mmkv.g(str2, j) : j;
    }

    public static String getSettingString(String str, String str2, String str3) {
        MMKV mmkv = getMMKV(str);
        return mmkv != null ? mmkv.k(str2, str3) : str3;
    }

    public static void setSettingBoolean(String str, String str2, boolean z) {
        MMKV mmkv = getMMKV(str);
        if (mmkv != null) {
            mmkv.w(str2, z);
        }
    }

    public static void setSettingFloat(String str, String str2, float f) {
        MMKV mmkv = getMMKV(str);
        if (mmkv != null) {
            mmkv.q(str2, f);
        }
    }

    public static void setSettingInt(String str, String str2, int i) {
        MMKV mmkv = getMMKV(str);
        if (mmkv != null) {
            mmkv.r(str2, i);
        }
    }

    public static void setSettingLong(String str, String str2, long j) {
        MMKV mmkv = getMMKV(str);
        if (mmkv != null) {
            mmkv.s(str2, j);
        }
    }

    public static void setSettingString(String str, String str2, String str3) {
        MMKV mmkv = getMMKV(str);
        if (mmkv != null) {
            mmkv.u(str2, str3);
        }
    }
}
