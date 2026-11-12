package defpackage;

import health.compact.a.LogUtil;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class qrd {
    public static Field[] c(Class<?> cls, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        Field[] fieldArr = new Field[declaredFields.length];
        int i = 0;
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.getType() == cls) {
                fieldArr[i] = field;
                i++;
            }
        }
        return fieldArr;
    }

    public static void d(Object obj, Field field, Object obj2) {
        if (field == null) {
            return;
        }
        try {
            field.set(obj, obj2);
        } catch (IllegalAccessException e) {
            LogUtil.e("ReflectUtils", LogUtil.c(e));
        }
    }
}
