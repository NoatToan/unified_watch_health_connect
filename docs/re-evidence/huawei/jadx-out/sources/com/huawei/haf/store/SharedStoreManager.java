package com.huawei.haf.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.HafRuntimeException;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SharedStoreManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static KeyValueStoreFactory f6070a;
    private static final Map<String, SharedPreferences> e = new HashMap();
    private static final Map<String, ExtendSharedPreferences> d = new HashMap();

    private SharedStoreManager() {
    }

    public static void d(KeyValueStoreFactory keyValueStoreFactory) {
        KeyValueStoreFactory keyValueStoreFactory2;
        if (keyValueStoreFactory == null || keyValueStoreFactory == (keyValueStoreFactory2 = f6070a)) {
            return;
        }
        if (keyValueStoreFactory2 != null && !e.isEmpty()) {
            LogUtil.e("HAF_SharedStore", "The setKeyValueStoreFactory needs to be initialized before business use");
        } else {
            f6070a = keyValueStoreFactory;
            LogUtil.b("HAF_SharedStore", "setKeyValueStoreFactory factory=", keyValueStoreFactory);
        }
    }

    public static boolean b(String str) {
        File file = new File(AppInfoUtils.b("shared_prefs"), str + WatchFaceConstant.XML_SUFFIX);
        if (file.exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        return new File(sb.toString()).exists();
    }

    public static SharedPreferences a(String str) {
        SharedPreferences sharedPreferencesE;
        Map<String, SharedPreferences> map = e;
        synchronized (map) {
            sharedPreferencesE = map.get(str);
            if (sharedPreferencesE == null) {
                sharedPreferencesE = e(str);
                map.put(str, sharedPreferencesE);
            }
        }
        return sharedPreferencesE;
    }

    private static SharedPreferences e(String str) {
        KeyValueStoreFactory keyValueStoreFactory = f6070a;
        if (keyValueStoreFactory == null) {
            LogUtil.b("HAF_SharedStore", "createKeyValueStore default name=", str);
            return d(str);
        }
        SharedPreferences sharedPreferencesCreate = keyValueStoreFactory.create(str);
        if (sharedPreferencesCreate != null) {
            return sharedPreferencesCreate;
        }
        throw new HafRuntimeException("createKeyValueStore fail. name=" + str);
    }

    public static SharedPreferences c(String str) {
        return d(str);
    }

    public static ExtendSharedPreferences d(String str) {
        ExtendSharedPreferences extendSharedPreferencesC;
        boolean z;
        Map<String, ExtendSharedPreferences> map = d;
        synchronized (map) {
            extendSharedPreferencesC = map.get(str);
            if (extendSharedPreferencesC == null) {
                extendSharedPreferencesC = c(str, map.size());
                map.put(str, extendSharedPreferencesC);
                z = false;
            } else {
                z = true;
            }
        }
        if (z && (extendSharedPreferencesC instanceof LocalSharedPreferences)) {
            ((LocalSharedPreferences) extendSharedPreferencesC).b(str);
        }
        return extendSharedPreferencesC;
    }

    private static ExtendSharedPreferences c(String str, int i) {
        boolean zEquals;
        ExtendSharedPreferences remoteSharedPreferences;
        ProviderInfo providerInfoI = i(str);
        if (providerInfoI != null) {
            LogUtil.b("HAF_SharedStore", "newSharedPreferences name=", providerInfoI.name, ", processName=", providerInfoI.processName);
            zEquals = ProcessUtil.c().equals(providerInfoI.processName);
        } else {
            zEquals = true;
        }
        if (zEquals) {
            remoteSharedPreferences = new LocalSharedPreferences(str, providerInfoI == null ? 4 : 0);
        } else {
            remoteSharedPreferences = new RemoteSharedPreferences(str);
        }
        LogUtil.b("HAF_SharedStore", "newSharedPreferences is ", zEquals ? "local" : "remote", ", name=", str, ", map size=", Integer.valueOf(i + 1));
        return remoteSharedPreferences;
    }

    private static ProviderInfo i(String str) {
        Class<?> clsB;
        Context contextB = BaseApplication.b();
        try {
            PackageInfo packageInfo = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 8);
            if (packageInfo.providers == null) {
                return null;
            }
            String strC = c(contextB, str);
            for (ProviderInfo providerInfo : packageInfo.providers) {
                if (strC.equals(providerInfo.authority) && (clsB = ReflectionUtils.b(providerInfo.name)) != null && RemoteStoreContentProvider.class.isAssignableFrom(clsB)) {
                    return providerInfo;
                }
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String c(Context context, String str) {
        return context.getPackageName() + ".haf_store_sp." + str;
    }

    static Uri e(String str, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder("content://");
        sb.append(c(BaseApplication.b(), str));
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = "/" + str2;
        }
        sb.append(str3);
        return Uri.parse(sb.toString());
    }
}
