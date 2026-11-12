package com.huawei.hms.findnetwork.comm.util;

import com.huawei.hms.findnetwork.comm.log.HmsFindCommonLog;
import com.huawei.hms.framework.common.EmuiUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes10.dex */
public class RomUtil {
    private static final int EMUI_10_1 = 23;
    private static final int EMUI_11_0 = 25;
    private static final int EMUI_3_0 = 7;
    private static final int EMUI_3_1 = 8;
    private static final int EMUI_4_0 = 9;
    private static final int EMUI_4_1 = 10;
    private static final int EMUI_5_0 = 11;
    private static final int EMUI_6_0 = 14;
    private static final int EMUI_8_0_1 = 15;
    private static final int EMUI_9_0 = 17;
    private static final int EMUI_TYPE_UNKNOWN = -1;
    private static final String KEY_OS_NAME = "ro.build.version.emui";
    private static final String TAG = "RomUtil";
    private static final int TYPE_EMUI_30 = 30;
    private static final int TYPE_EMUI_31 = 31;
    private static final int TYPE_EMUI_40 = 40;
    private static final int TYPE_EMUI_41 = 41;
    private static final int TYPE_EMUI_50 = 50;
    private static final int TYPE_EMUI_60 = 60;
    private static final int TYPE_EMUI_801 = 81;
    private static final int TYPE_EMUI_90 = 90;
    private static int emuiType = -1;
    private static int emuiVersionCode;

    public static boolean isSmallerThanEMUI11() {
        return getEMUIVersionCode() < 25;
    }

    public static boolean isEMUI() {
        return -1 != emuiType;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    private static void initEmuiType() {
        int i;
        emuiVersionCode = getEMUIVersionCode();
        HmsFindCommonLog.i(TAG, "getEmuiType emuiVersionCode=" + emuiVersionCode);
        int i2 = emuiVersionCode;
        if (i2 >= 17) {
            i = 90;
        } else if (i2 >= 15) {
            i = 81;
        } else if (i2 >= 14) {
            i = 60;
        } else if (i2 >= 11) {
            i = 50;
        } else if (i2 >= 10) {
            i = 41;
        } else if (i2 >= 9) {
            i = 40;
        } else {
            if (i2 < 8) {
                if (i2 >= 7) {
                    i = 30;
                }
                if (emuiType == -1) {
                    dealTypeUnknown();
                }
            }
            i = 31;
        }
        emuiType = i;
        if (emuiType == -1) {
            dealTypeUnknown();
        }
    }

    public static int getEMUIVersionCode() {
        Object obj;
        try {
            Class<?> cls = Class.forName(EmuiUtil.BUILDEX_VERSION);
            Field declaredField = cls.getDeclaredField(EmuiUtil.EMUI_SDK_INT);
            AccessibleObject.setAccessible(new Field[]{declaredField}, true);
            obj = declaredField.get(cls);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException e) {
            HmsFindCommonLog.w(TAG, "getEMUIVersionCode exception: " + e.getMessage());
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private static void dealTypeUnknown() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, KEY_OS_NAME);
            HmsFindCommonLog.i(TAG, "isNeed2UseHwEmui :");
            if (str != null) {
                if (str.contains("EmotionUI_3.0")) {
                    emuiType = 30;
                    return;
                }
                if (str.contains("EmotionUI_3.1")) {
                    emuiType = 31;
                    return;
                }
                if (str.contains("EmotionUI_4.0")) {
                    emuiType = 40;
                    return;
                }
                if (str.contains("EmotionUI_4.1")) {
                    emuiType = 41;
                } else if (str.contains("EmotionUI_5.0")) {
                    emuiType = 50;
                } else if (str.contains("EmotionUI_6.0")) {
                    emuiType = 60;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            HmsFindCommonLog.w(TAG, "deal type unknown exception " + e.getMessage());
        }
    }

    private RomUtil() {
    }

    static {
        initEmuiType();
    }
}
