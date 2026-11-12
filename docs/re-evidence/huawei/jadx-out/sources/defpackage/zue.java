package defpackage;

import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class zue {
    public static Class<?> b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static <T> T b(Object obj, String str, Class<?>[] clsArr, Object[] objArr, Class<T> cls) {
        if (!a(obj, clsArr, objArr, cls, str)) {
            return null;
        }
        try {
            Object objInvoke = obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
            if (objInvoke == null || !cls.isInstance(objInvoke)) {
                return null;
            }
            return cls.cast(objInvoke);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            zud.c("ReflectUtil", "Unexpected exception, invoke method failed.");
            return null;
        }
    }

    private static <T> boolean a(Object obj, Class<?>[] clsArr, Object[] objArr, Class<T> cls, String str) {
        if (obj == null || clsArr == null || objArr == null || cls == null) {
            zud.d("ReflectUtil", "Parameters is invalid.");
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        zud.d("ReflectUtil", "Method not found.");
        return false;
    }
}
