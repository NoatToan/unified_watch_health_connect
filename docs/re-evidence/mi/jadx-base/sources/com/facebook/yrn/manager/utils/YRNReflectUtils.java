package com.facebook.yrn.manager.utils;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class YRNReflectUtils {
    public static void modifyPrivateObjectByReflect(Class cls, String str, Object obj, Object obj2) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            declaredField.set(obj, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
