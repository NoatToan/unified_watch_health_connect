package e6;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import n23.j;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final Object a(Object obj) throws NoSuchFieldException {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof d23.a) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    j.s("Array contains no element matching the predicate.");
                    return null;
                }
            }
        }
        return obj;
    }
}
