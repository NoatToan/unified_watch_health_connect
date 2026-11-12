package com.huawei.secure.android.common.activity.protect;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes42.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22746a = "Reflection";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f22747b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f22748c = null;
    private static final int d = -21;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                Method method = (Method) declaredMethod2.invoke(cls, "getRuntime", null);
                f22748c = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f22747b = method.invoke(null, null);
            } catch (Throwable th) {
                com.huawei.secure.android.common.activity.a.a(f22746a, "reflect failed : " + th.getMessage());
            }
        }
    }

    public static int a(Context context) {
        return (Build.VERSION.SDK_INT >= 28 && !a()) ? -21 : 0;
    }

    public static boolean a(String str) {
        return a(str);
    }

    public static boolean a(String... strArr) {
        Method method;
        Object obj = f22747b;
        if (obj == null || (method = f22748c) == null) {
            return false;
        }
        try {
            method.invoke(obj, strArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a() {
        return a("L");
    }
}
