package com.huawei.hms.hwid;

import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
public class aq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13555a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13556b;

    static {
        b();
    }

    private static void b() {
        int iD = d();
        f13556b = iD;
        if (iD >= 17) {
            f13555a = 90;
        }
        if (iD >= 11) {
            f13555a = 50;
        } else if (iD >= 10) {
            f13555a = 41;
        } else if (iD >= 9) {
            f13555a = 40;
        } else if (iD >= 8) {
            f13555a = 31;
        } else if (iD >= 7) {
            f13555a = 30;
        }
        if (f13555a == -1) {
            c();
        }
    }

    private static void c() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.version.emui");
            if (str != null) {
                if (str.contains("EmotionUI_3.0")) {
                    f13555a = 30;
                    return;
                }
                if (str.contains("EmotionUI_3.1")) {
                    f13555a = 31;
                    return;
                }
                if (str.contains("EmotionUI_4.0")) {
                    f13555a = 40;
                } else if (str.contains("EmotionUI_4.1")) {
                    f13555a = 41;
                } else if (str.contains("EmotionUI_5.0")) {
                    f13555a = 50;
                }
            }
        } catch (RuntimeException unused) {
            ar.d("EmuiUtil", "RuntimeException getEmuiType.", true);
        } catch (Exception unused2) {
            ar.d("EmuiUtil", "getEmuiType Exception.", true);
        }
    }

    public static boolean a() {
        return f13556b >= 21;
    }

    private static int d() {
        Object objA = a.a(EmuiUtil.BUILDEX_VERSION, EmuiUtil.EMUI_SDK_INT);
        if (objA != null) {
            try {
                f13556b = ((Integer) objA).intValue();
            } catch (ClassCastException unused) {
                ar.d("EmuiUtil", "getEMUIVersionCode is not a number", true);
            }
        }
        return f13556b;
    }

    static class a {
        public static Class<?> a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!EmuiUtil.BUILDEX_VERSION.equals(str) && !EmuiUtil.IMMERSION_STYLE.equals(str)) {
                return null;
            }
            try {
                return Class.forName(str);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public static Object a(String str, String str2) {
            Class<?> clsA = a(str);
            if (clsA == null || TextUtils.isEmpty(str2) || !EmuiUtil.BUILDEX_VERSION.equals(str) || !EmuiUtil.EMUI_SDK_INT.equals(str2)) {
                return null;
            }
            try {
                Field declaredField = clsA.getDeclaredField(str2);
                AccessibleObject.setAccessible(new Field[]{declaredField}, true);
                return declaredField.get(clsA);
            } catch (IllegalAccessException unused) {
                ar.c("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException", true);
                return null;
            } catch (IllegalArgumentException unused2) {
                ar.c("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException", true);
                return null;
            } catch (NoSuchFieldException unused3) {
                ar.c("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException", true);
                return null;
            } catch (SecurityException unused4) {
                ar.b("ReflectionUtils", "not security int method getStaticFieldObj", true);
                return null;
            }
        }
    }
}
