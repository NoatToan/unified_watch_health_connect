package com.huawei.wearengine.common;

import android.content.Context;
import defpackage.yit;
import defpackage.yln;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes20.dex */
public class WearEngineBiOperate {
    private static final String BI_ANALYTICS_UTIL = "com.huawei.wearengine.utills.WearEngineReflectUtil";
    private static final int DEFAULT_MAP_SIZE = 16;
    private static final String KEY_API_NAME = "apiName";
    private static final String KEY_APP_ID = "appID";
    private static final String KEY_CALL_TIME = "callTime";
    private static final String KEY_COST_TIME = "costTime";
    private static final String KEY_COUNTRY = "country";
    private static final String KEY_PACKAGE = "package";
    private static final String KEY_RESULT = "result";
    private static final String KEY_SDK_VERSION = "version";
    private static final String KEY_SERVICE = "service";
    private static final String KEY_SERVICE_VERSION = "appVersion";
    private static final String SERVICE_VALUE_WEAR_ENGINE = "Wear Engine Service";
    private static final String TAG = "WearEngineBiOperate";
    private static ExecutorService mSingleThreadPool = Executors.newSingleThreadExecutor();
    private long mCallingEndTime;
    private long mCallingStartTime;

    public void init() {
        this.mCallingStartTime = System.currentTimeMillis();
    }

    public void biApiCalling(final Context context, String str, String str2, String str3) {
        yit.e(TAG, "biApiCalling enter!");
        if (context == null) {
            yit.b(TAG, "biApiCalling:context is null");
            return;
        }
        this.mCallingEndTime = System.currentTimeMillis();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("service", SERVICE_VALUE_WEAR_ENGINE);
        concurrentHashMap.put("package", str);
        concurrentHashMap.put("version", "5.0.3.310");
        String strE = yln.e(context, str);
        if (strE == null) {
            strE = "";
        }
        concurrentHashMap.put("appVersion", strE);
        concurrentHashMap.put("appID", String.valueOf(yln.j(context, str)));
        concurrentHashMap.put("result", str3);
        concurrentHashMap.put("apiName", str2);
        concurrentHashMap.put("country", yln.e());
        concurrentHashMap.put("callTime", String.valueOf(System.currentTimeMillis()));
        concurrentHashMap.put("costTime", String.valueOf(this.mCallingEndTime - this.mCallingStartTime));
        final String strValue = OperationCode.WEAR_ENGINE_API_INVOKE_60000.value();
        mSingleThreadPool.execute(new Runnable() { // from class: com.huawei.wearengine.common.WearEngineBiOperate.5
            @Override // java.lang.Runnable
            public void run() {
                WearEngineBiOperate.this.reflectInvokeBiApiCalling(context, strValue, concurrentHashMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reflectInvokeBiApiCalling(Context context, String str, Map<String, String> map) {
        try {
            Class<?> cls = Class.forName(BI_ANALYTICS_UTIL);
            yit.a(TAG, "reflectInvokeBiApiCalling biAnalyticsSetEvent");
            Method declaredMethod = cls.getDeclaredMethod("biAnalyticsSetEvent", Context.class, String.class, Map.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(cls, context, str, map, 0);
        } catch (ClassNotFoundException unused) {
            yit.b(TAG, "reflectInvokeBiApiCalling ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            yit.b(TAG, "reflectInvokeBiApiCalling IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            yit.b(TAG, "reflectInvokeBiApiCalling IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            yit.b(TAG, "reflectInvokeBiApiCalling NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            yit.b(TAG, "reflectInvokeBiApiCalling InvocationTargetException");
        }
    }
}
