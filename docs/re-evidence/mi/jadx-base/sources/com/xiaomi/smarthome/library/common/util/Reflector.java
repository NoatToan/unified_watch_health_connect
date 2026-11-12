package com.xiaomi.smarthome.library.common.util;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class Reflector {

    public static final class TypedObject {
        private final Object object;
        private final Class type;

        public TypedObject(Object obj, Class cls) {
            this.object = obj;
            this.type = cls;
        }

        public Object getObject() {
            return this.object;
        }

        public Class getType() {
            return this.type;
        }
    }

    public static void invokeMethodExceptionSafe(Object obj, String str, TypedObject... typedObjectArr) {
        if (obj == null) {
            return;
        }
        try {
            Class<?>[] clsArr = typedObjectArr == null ? new Class[0] : new Class[typedObjectArr.length];
            Object[] objArr = typedObjectArr == null ? new Object[0] : new Object[typedObjectArr.length];
            if (typedObjectArr != null) {
                int length = clsArr.length;
                for (int i = 0; i < length; i++) {
                    clsArr[i] = typedObjectArr[i].getType();
                    objArr[i] = typedObjectArr[i].getObject();
                }
            }
            Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, objArr);
        } catch (Throwable unused) {
        }
    }
}
