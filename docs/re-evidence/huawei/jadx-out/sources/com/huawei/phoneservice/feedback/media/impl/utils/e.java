package com.huawei.phoneservice.feedback.media.impl.utils;

import com.huawei.phoneservice.faq.base.util.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21646a = "b";

    private static void a(Exception exc, String str) {
        if (exc == null || exc.getMessage() == null) {
            return;
        }
        g.c(str, exc.getMessage());
    }

    public static String b(String str) {
        Exception e;
        Class<?> cls;
        Method declaredMethod;
        try {
            cls = Class.forName("android.os.SystemProperties");
            try {
                declaredMethod = cls.getDeclaredMethod("get", String.class);
            } catch (ClassNotFoundException e2) {
                e = e2;
                a(e, f21646a);
                declaredMethod = null;
            } catch (NoSuchMethodException e3) {
                e = e3;
                a(e, f21646a);
                declaredMethod = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            e = e4;
            cls = null;
        }
        if (declaredMethod == null) {
            return null;
        }
        try {
            return (String) declaredMethod.invoke(cls, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e5) {
            a(e5, f21646a);
            return null;
        }
    }
}
