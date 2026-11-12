package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes15.dex */
public class pzd {
    public static Field d(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e) {
            pyx.b("RefectUtil.getFieldValue Error2 " + e.getMessage());
            return null;
        }
    }

    public static Object c(Field field, Object obj) {
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            pyx.b("ReflectionUtils.getDeclareFieldValue Error22" + e.getMessage());
            return null;
        }
    }

    public static void b(Class cls, Object obj, String str, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (IllegalAccessException e) {
            pyx.b("RefectUtil.setFieldValue Error1 " + e.getMessage());
        } catch (NoSuchFieldException e2) {
            pyx.b("RefectUtil.setFieldValue Error2 " + e2.getMessage());
        }
    }

    public static Object a(Class cls, Object obj, String str, Object... objArr) throws Exception {
        Class<?>[] clsArr;
        if (objArr != null) {
            clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        } else {
            clsArr = null;
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj, objArr);
    }
}
