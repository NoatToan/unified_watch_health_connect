package com.ximalaya.ting.android.sdkdownloader.http;

import android.os.Parcelable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes22.dex */
final class a {
    private static final ClassLoader a = String.class.getClassLoader();

    /* JADX INFO: renamed from: com.ximalaya.ting.android.sdkdownloader.http.a$a, reason: collision with other inner class name */
    public interface InterfaceC1055a {
        void a(String str, Object obj);
    }

    private a() {
    }

    public static void a(Object obj, Class<?> cls, InterfaceC1055a interfaceC1055a) {
        ClassLoader classLoader;
        if (obj == null || cls == null || cls == RequestParams.class || cls == Object.class || (classLoader = cls.getClassLoader()) == null || classLoader == a) {
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        if (declaredFields != null && declaredFields.length > 0) {
            for (Field field : declaredFields) {
                if (!Modifier.isTransient(field.getModifiers()) && field.getType() != Parcelable.Creator.class) {
                    field.setAccessible(true);
                    try {
                        String name = field.getName();
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            interfaceC1055a.a(name, obj2);
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
            }
        }
        a(obj, cls.getSuperclass(), interfaceC1055a);
    }
}
