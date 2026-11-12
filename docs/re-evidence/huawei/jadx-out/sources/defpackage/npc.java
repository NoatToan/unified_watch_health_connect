package defpackage;

import android.text.TextUtils;
import com.huawei.hms.framework.common.EmuiUtil;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
class npc {
    public static Class<?> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!EmuiUtil.BUILDEX_VERSION.equals(str) && !EmuiUtil.IMMERSION_STYLE.equals(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            nox.e("ReflectionUtils", "className not found:", true);
            return null;
        }
    }

    public static Object e(String str, String str2) {
        Class<?> clsB = b(str);
        if (clsB == null || TextUtils.isEmpty(str2) || !EmuiUtil.BUILDEX_VERSION.equals(str) || !EmuiUtil.EMUI_SDK_INT.equals(str2)) {
            return null;
        }
        try {
            Field declaredField = clsB.getDeclaredField(str2);
            AccessibleObject.setAccessible(new Field[]{declaredField}, true);
            return declaredField.get(clsB);
        } catch (IllegalAccessException unused) {
            nox.e("ReflectionUtils", "Exception in getFieldObj :: IllegalAccessException", true);
            return null;
        } catch (IllegalArgumentException unused2) {
            nox.e("ReflectionUtils", "Exception in getFieldObj :: IllegalArgumentException", true);
            return null;
        } catch (NoSuchFieldException unused3) {
            nox.e("ReflectionUtils", "Exception in getFieldObj :: NoSuchFieldException", true);
            return null;
        } catch (SecurityException unused4) {
            nox.b("ReflectionUtils", "not security int method getStaticFieldObj", true);
            return null;
        }
    }
}
