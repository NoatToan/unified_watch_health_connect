package com.xiaomi.smarthome.library.deviceId;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class IdentifierManager {
    private static final String TAG = "IdentifierManager";
    private static Class<?> sClass;
    private static Method sGetOAID;
    private static Object sIdProivderImpl;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            sClass = cls;
            sIdProivderImpl = cls.newInstance();
            sGetOAID = sClass.getMethod("getOAID", Context.class);
        } catch (Exception unused) {
        }
    }

    public static String getOAID(Context context) {
        return invokeMethod(context, sGetOAID);
    }

    private static String invokeMethod(Context context, Method method) {
        Object obj = sIdProivderImpl;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isSupported() {
        return (sClass == null || sIdProivderImpl == null) ? false : true;
    }
}
