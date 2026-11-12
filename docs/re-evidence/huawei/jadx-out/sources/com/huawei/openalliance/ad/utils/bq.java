package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.hw;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public class bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class<?> f20516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f20517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f20518c;
    private static Method d;
    private static Method e;
    private static Object f;

    private static String a(Context context, Method method) {
        Object obj = f;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception e2) {
            hw.d("MIdentifierManager", "invoke exception, %s", e2.getClass().getSimpleName());
            return null;
        }
    }

    public static String a(Context context) {
        return a(context, f20518c);
    }

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f20516a = cls;
            f = cls.newInstance();
            d = f20516a.getMethod("getUDID", Context.class);
            f20518c = f20516a.getMethod("getOAID", Context.class);
            e = f20516a.getMethod("getVAID", Context.class);
            f20517b = f20516a.getMethod("getAAID", Context.class);
        } catch (Exception e2) {
            hw.d("MIdentifierManager", "reflect exception, %s", e2.getClass().getSimpleName());
        }
    }
}
