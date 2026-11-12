package com.huawei.hms.common.utils;

import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import defpackage.nox;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
public class AccountPickerEmuiUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f13104a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13105b;

    static {
        a();
    }

    private static void a() {
        int iC = c();
        f13105b = iC;
        if (iC >= 17) {
            f13104a = 90;
        }
        if (iC >= 11) {
            f13104a = 50;
        } else if (iC >= 10) {
            f13104a = 41;
        } else if (iC >= 9) {
            f13104a = 40;
        } else if (iC >= 8) {
            f13104a = 31;
        } else if (iC >= 7) {
            f13104a = 30;
        }
        if (f13104a == -1) {
            b();
        }
    }

    private static void b() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.build.version.emui");
            if (str != null) {
                if (str.contains("EmotionUI_3.0")) {
                    f13104a = 30;
                    return;
                }
                if (str.contains("EmotionUI_3.1")) {
                    f13104a = 31;
                    return;
                }
                if (str.contains("EmotionUI_4.0")) {
                    f13104a = 40;
                } else if (str.contains("EmotionUI_4.1")) {
                    f13104a = 41;
                } else if (str.contains("EmotionUI_5.0")) {
                    f13104a = 50;
                }
            }
        } catch (RuntimeException unused) {
            nox.a("AccountPickerEmuiUtil", "RuntimeException getEmuiType.", true);
        } catch (Exception unused2) {
            nox.a("AccountPickerEmuiUtil", "getEmuiType Exception.", true);
        }
    }

    public static boolean isAboveEMUI100() {
        return f13105b >= 21;
    }

    private static int c() {
        Object objB = ReflectionUtils.b();
        if (objB != null) {
            try {
                f13105b = ((Integer) objB).intValue();
            } catch (ClassCastException unused) {
                nox.a("AccountPickerEmuiUtil", "EMUIVersionCode is not a number", true);
            }
        }
        return f13105b;
    }

    static class ReflectionUtils {
        ReflectionUtils() {
        }

        public static Class<?> getClass(String str) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static Object b() {
            Class<?> cls = getClass(EmuiUtil.BUILDEX_VERSION);
            if (cls == null || TextUtils.isEmpty(EmuiUtil.EMUI_SDK_INT)) {
                return null;
            }
            try {
                Field declaredField = cls.getDeclaredField(EmuiUtil.EMUI_SDK_INT);
                AccessibleObject.setAccessible(new Field[]{declaredField}, true);
                return declaredField.get(cls);
            } catch (IllegalAccessException unused) {
                nox.e("ReflectionUtils", "IllegalAccessException", true);
                return null;
            } catch (IllegalArgumentException unused2) {
                nox.e("ReflectionUtils", "IllegalArgumentException", true);
                return null;
            } catch (NoSuchFieldException unused3) {
                nox.e("ReflectionUtils", "NoSuchFieldException", true);
                return null;
            } catch (SecurityException unused4) {
                nox.b("ReflectionUtils", "not security int method", true);
                return null;
            }
        }
    }
}
