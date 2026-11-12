package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public class abk {
    public static Object a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to call method:");
            sb.append(str);
            return null;
        }
    }

    public static <T> T b(Class<?> cls, Class<T> cls2, String str, Class<?>[] clsArr, Object... objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(null, objArr);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to call static method:");
            sb.append(str);
            return null;
        }
    }

    public static Class<?> c(String str) {
        try {
            return Class.forName(str);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cant find class ");
            sb.append(str);
            return null;
        }
    }
}
