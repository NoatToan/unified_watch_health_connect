package com.xiaomi.smarthome.library.securecompact;

import android.app.Application;
import android.content.Context;
import com.tencent.mmkv.MMKV;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class IdentifierManagerCompact {
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

    public static synchronized String genMfpString(Context context, int i, int i2) {
        return "";
    }

    private static Application getApplication() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getCacheDataKey() {
        return "id.provider.data.key";
    }

    public static String getCacheOAIDData() {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).k(getCacheDataKey(), "");
    }

    public static String getCacheTimeKey() {
        return "id.provider.time.key";
    }

    public static synchronized String getOAID() {
        Application application = getApplication();
        if (application != null) {
            return getOAID(application);
        }
        return getCacheOAIDData();
    }

    private static String invokeMethod(Context context) {
        Method method;
        Object obj = sIdProivderImpl;
        if (obj == null || (method = sGetOAID) == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            return objInvoke != null ? (String) objInvoke : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean saveCacheOAIDData(String str) {
        return MMKV.G(FrequencySecureLimitHelper.CACHE_NAME, 2).u(getCacheDataKey(), str);
    }

    public static synchronized String getOAID(Context context) {
        String cacheOAIDData;
        cacheOAIDData = getCacheOAIDData();
        if (FrequencySecureLimitHelper.canInvoke(getCacheTimeKey())) {
            cacheOAIDData = invokeMethod(context);
            FrequencySecureLimitHelper.cacheInvokeTime(getCacheTimeKey());
            saveCacheOAIDData(cacheOAIDData);
        }
        return cacheOAIDData;
    }
}
